package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.performance.longtasktiming.LynxLongTaskMonitor;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1310660kDA extends FrameLayout implements InterfaceC1314720kJi, InterfaceC1311940kFE {
    public C1310360kCg mA11yWrapper;
    public int mCacheHeight;
    public int mCacheWidth;
    public InterfaceC1314130kIl mDrawChildHook;
    public boolean mHasMeaningfulLayout;
    public boolean mHasMeaningfulPaint;
    public boolean mHasPendingRequestLayout;
    public ConcurrentHashMap<Integer, C1315680kLG> mImageMap;
    public int mInstanceId;
    public boolean mInterceptRequestLayout;
    public int mIntrinsicHeight;
    public int mIntrinsicWidth;
    public boolean mIsChildLynxPageUI;
    public boolean mIsMeaningfulPaintingAreaInvalidate;
    public s mLynxContext;
    public InterfaceC1309730kBf mLynxUIRender;
    public long mMeaningfulPaintTiming;
    public boolean mNeedRemoveExistingViews;
    public C1311970kFH mRenderer;
    public WeakReference<InterfaceC1310680kDC> mTimingCollector;
    public ConcurrentHashMap<Integer, View> mViewMap;

    public void clearMeaningfulFlag() {
        this.mHasMeaningfulLayout = false;
        this.mHasMeaningfulPaint = false;
        this.mMeaningfulPaintTiming = 0L;
    }

    public C1309760kBi getLynxViewBuilder() {
        return null;
    }

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public void invalidateMeaningfulPaintingArea() {
        this.mIsMeaningfulPaintingAreaInvalidate = true;
    }

    public boolean isAccessibilityDisabled() {
        return false;
    }

    public void markNeedRemoveExistingViews() {
        this.mNeedRemoveExistingViews = true;
    }

    public void notifyMeaningfulLayout() {
        this.mHasMeaningfulLayout = true;
    }

    public void runOnTasmThread(Runnable runnable) {
    }

    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
    }

    public void setAttachLynxPageUICallback(InterfaceC1310500kCu interfaceC1310500kCu) {
    }

    private boolean shouldDrawWithDisplayList() {
        return this.mRenderer != null;
    }

    public void clearNodeIndexImageMap() {
        this.mImageMap.clear();
    }

    public EnumC1299430jv3 getLongTaskMonitorEnabled() {
        EnumC1299430jv3 enumC1299430jv3 = EnumC1299430jv3.UNSET;
        Context context = getContext();
        return context instanceof s ? ((s) context).LLJJLIIIJLLLLLLLZ : enumC1299430jv3;
    }

    public List<C1310110kCH> getMeaningfulPaintingAreas() {
        if (!(this.mDrawChildHook instanceof C1313210kHH)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ((C1313210kHH) this.mDrawChildHook).LIZJ(arrayList, 0, 0);
        return arrayList;
    }

    public void onLayoutWhenDetach() {
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl instanceof C1313210kHH) {
            ((C1313210kHH) interfaceC1314130kIl).LIZLLL();
        }
    }

    public void removeExistingViews() {
        if (this.mNeedRemoveExistingViews) {
            Iterator<Map.Entry<Integer, View>> it2 = this.mViewMap.entrySet().iterator();
            while (it2.hasNext()) {
                View value = it2.next().getValue();
                if (value.getParent() instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(value, (ViewGroup) value.getParent());
                }
            }
            this.mViewMap.clear();
            this.mNeedRemoveExistingViews = false;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayout) {
            this.mHasPendingRequestLayout = true;
        } else {
            this.mHasPendingRequestLayout = false;
            super.requestLayout();
        }
    }

    private void TraceUITreeLayout() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        if (!TraceController.isTracingStarted() || (interfaceC1309730kBf = this.mLynxUIRender) == null) {
            return;
        }
        C1311720kEs c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ;
        UIBody uIBody = c1311720kEs != null ? c1311720kEs.LIZIZ : null;
        if (uIBody instanceof UIBody) {
            TraceEvent.LIZLLL("DumpUITreeLayout");
            JSONObject uITreeRecursively = getUITreeRecursively(uIBody);
            HashMap map = new HashMap();
            map.put("detail", C786410Ut5.J3(uITreeRecursively));
            map.put("instance_id", String.valueOf(this.mInstanceId));
            TraceEvent.LJIIIIZZ("DumpUITreeLayout", map);
        }
    }

    public boolean HasPendingRequestLayout() {
        return this.mHasPendingRequestLayout;
    }

    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    public InterfaceC1309730kBf getLynxUIRendererInternal() {
        return this.mLynxUIRender;
    }

    public long getMeaningfulPaintTiming() {
        return this.mMeaningfulPaintTiming;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.mRenderer;
    }

    public boolean isChildLynxPageUI() {
        return this.mIsChildLynxPageUI;
    }

    public boolean isMeaningfulPaintingAreaInvalidate() {
        return this.mIsMeaningfulPaintingAreaInvalidate;
    }

    public C1310660kDA(Context context) {
        super(context);
        this.mViewMap = new ConcurrentHashMap<>();
        this.mImageMap = new ConcurrentHashMap<>();
        this.mLynxContext = null;
        this.mTimingCollector = new WeakReference<>(null);
        this.mInstanceId = -1;
        this.mNeedRemoveExistingViews = false;
        this.mIsMeaningfulPaintingAreaInvalidate = false;
    }

    private JSONObject getUITreeRecursively(LynxBaseUI lynxBaseUI) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", lynxBaseUI.getClass().getName());
            jSONObject.put("tagName", lynxBaseUI.getTagName());
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, lynxBaseUI.getSign());
            jSONObject.put("nodeIndex", lynxBaseUI.mNodeIndex);
            jSONObject.put("frame", new JSONArray((Collection) Arrays.asList(Integer.valueOf(lynxBaseUI.getLeft()), Integer.valueOf(lynxBaseUI.getTop()), Integer.valueOf(lynxBaseUI.getWidth()), Integer.valueOf(lynxBaseUI.getHeight()))));
            ArrayList arrayList = new ArrayList();
            Iterator<LynxBaseUI> it2 = lynxBaseUI.getChildren().iterator();
            while (it2.hasNext()) {
                arrayList.add(getUITreeRecursively(it2.next()));
            }
            jSONObject.put("children", new JSONArray((Collection) arrayList));
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUITreeRecursively error: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("UIBody", C2188811AlT.LIZIZ(sbLIZ));
            return jSONObject;
        }
    }

    @Override // X.InterfaceC1314720kJi
    public void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.mDrawChildHook = interfaceC1314130kIl;
    }

    public boolean containsViewForNodeIndex(int i) {
        return this.mViewMap.containsKey(Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (shouldDrawWithDisplayList()) {
            super.dispatchDraw(canvas);
            this.mRenderer.LIZ(canvas);
            return;
        }
        this.mIsMeaningfulPaintingAreaInvalidate = false;
        InterfaceC1310680kDC interfaceC1310680kDC = this.mTimingCollector.get();
        if (interfaceC1310680kDC != null) {
            interfaceC1310680kDC.LIZ("drawStart");
        }
        boolean zLIZIZ = LynxLongTaskMonitor.LIZIZ("LynxTemplateRender.Draw", this.mInstanceId, getLongTaskMonitorEnabled());
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            interfaceC1314130kIl.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.mDrawChildHook;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDispatchDraw(canvas);
        }
        if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
            TraceEvent.LJIIJ(1L, "FirstMeaningfulPaint");
            this.mMeaningfulPaintTiming = System.currentTimeMillis();
            this.mHasMeaningfulPaint = true;
        }
        if (interfaceC1310680kDC != null) {
            if (!interfaceC1310680kDC.LIZJ().isEmpty()) {
                TraceUITreeLayout();
            }
            interfaceC1310680kDC.LIZ("drawEnd");
            interfaceC1310680kDC.LIZIZ();
        }
        if (zLIZIZ) {
            LynxLongTaskMonitor.LIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (isAccessibilityDisabled()) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1310360kCg c1310360kCg = this.mA11yWrapper;
        if (c1310360kCg != null) {
            if (c1310360kCg.LJFF()) {
                return super.dispatchHoverEvent(motionEvent);
            }
            C1310360kCg c1310360kCg2 = this.mA11yWrapper;
            if ((!c1310360kCg2.LIZIZ && !c1310360kCg2.LIZJ && c1310360kCg2.LJIIJJI != null && c1310360kCg2.LJIIJJI.LJII(motionEvent)) || (c1310360kCg2.LJ() && c1310360kCg2.LJIIL.LIZ(motionEvent))) {
                return true;
            }
        }
        return onHoverEvent(motionEvent);
    }

    public C1315680kLG obtainImageAccordingToNodeIndex(int i) {
        C1315680kLG c1315680kLG = this.mImageMap.get(Integer.valueOf(i));
        this.mImageMap.remove(Integer.valueOf(i));
        return c1315680kLG;
    }

    public View obtainViewAccordingToNodeIndex(int i) {
        View view = this.mViewMap.get(Integer.valueOf(i));
        this.mViewMap.remove(Integer.valueOf(i));
        return view;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (shouldDrawWithDisplayList()) {
            this.mRenderer.LJ(canvas);
        }
    }

    public C1315680kLG peekImageAccordingToNodeIndex(int i) {
        return this.mImageMap.get(Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setInstanceId(int i) {
        this.mInstanceId = i;
    }

    public void setIsChildLynxPageUI(boolean z) {
        this.mIsChildLynxPageUI = z;
    }

    public void setLynxAccessibilityWrapper(C1310360kCg c1310360kCg) {
        this.mA11yWrapper = c1310360kCg;
    }

    public void setLynxUIRendererInternal(InterfaceC1309730kBf interfaceC1309730kBf) {
        this.mLynxUIRender = interfaceC1309730kBf;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.mRenderer = c1311970kFH;
    }

    public void setShouldInterceptRequestLayout(boolean z) {
        this.mInterceptRequestLayout = z;
    }

    public void setTimingCollector(InterfaceC1310680kDC interfaceC1310680kDC) {
        this.mTimingCollector = new WeakReference<>(interfaceC1310680kDC);
    }

    public C1310660kDA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mViewMap = new ConcurrentHashMap<>();
        this.mImageMap = new ConcurrentHashMap<>();
        this.mLynxContext = null;
        this.mTimingCollector = new WeakReference<>(null);
        this.mInstanceId = -1;
        this.mNeedRemoveExistingViews = false;
        this.mIsMeaningfulPaintingAreaInvalidate = false;
    }

    public void cacheLayoutInfo(int i, int i2) {
        this.mCacheWidth = i;
        this.mCacheHeight = i2;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            return interfaceC1314130kIl.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    public void innerSetMeasuredDimension(int i, int i2) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("width", String.valueOf(i));
            map.put("height", String.valueOf(i2));
            TraceEvent.LJIIL(0L, "UIBody.innerSetMeasuredDimension", map);
        }
        setMeasuredDimension(i, i2);
    }

    public void onMeasureWhenDetach(int i, int i2) {
        performMeasure(i, this.mCacheWidth, i2, this.mCacheHeight);
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl instanceof C1313210kHH) {
            ((C1313210kHH) interfaceC1314130kIl).LJ();
        }
    }

    public void registerImageAccordingToNodeIndex(int i, C1315680kLG c1315680kLG) {
        this.mImageMap.put(Integer.valueOf(i), c1315680kLG);
    }

    public void registerViewAccordingToNodeIndex(int i, View view) {
        this.mViewMap.put(Integer.valueOf(i), view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (isAccessibilityDisabled()) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        C1310360kCg c1310360kCg = this.mA11yWrapper;
        if (c1310360kCg != null && !c1310360kCg.LJFF() && accessibilityEvent.getEventType() == 2048) {
            accessibilityEvent.setSource(this);
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void setIntrinsicContentSize(int i, int i2) {
        this.mIntrinsicWidth = i;
        this.mIntrinsicHeight = i2;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        Rect rectBeforeDrawChild;
        if (shouldDrawWithDisplayList()) {
            this.mRenderer.LIZIZ(canvas, view);
            boolean zDrawChild2 = super.drawChild(canvas, view, j);
            this.mRenderer.getClass();
            canvas.restore();
            return zDrawChild2;
        }
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null && (rectBeforeDrawChild = interfaceC1314130kIl.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(rectBeforeDrawChild);
            zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.mDrawChildHook;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
        }
        return zDrawChild;
    }

    public void performMeasure(int i, int i2, int i3, int i4) {
        int size;
        int size2;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = this.mCacheWidth;
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            size2 = View.MeasureSpec.getSize(i3);
        } else {
            size2 = this.mCacheHeight;
        }
        innerSetMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (shouldDrawWithDisplayList()) {
            this.mRenderer.LJFF();
        }
    }
}
