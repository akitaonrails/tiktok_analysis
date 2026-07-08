package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.render.tasm.base.TraceEvent;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.serializedData.common.UpdateDataEvent;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.ui.SDUIViewRender;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317080kNW extends C1313670kI1 {
    public boolean mCanDispatchTouchEvent;
    public SDUIViewRender mSDUIViewRender;

    @Override // android.view.View
    public Object getTag() {
        return "lynxview";
    }

    public void reloadAndInit() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
    }

    public static C1317160kNe builder() {
        return new C1317160kNe();
    }

    public HashMap<String, Object> getAllTimingInfo() {
        return this.mSDUIViewRender.LIZIZ.LJI.LIZ();
    }

    public long getFirstMeasureTime() {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return -1L;
        }
        return sDUIViewRender.LJIIJJI;
    }

    public AbstractC1317090kNX getSDUIContext() {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            return sDUIViewRender.LJ;
        }
        return null;
    }

    public AbstractC1313500kHk<C1313670kI1> getSDUIUIRoot() {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return null;
        }
        return sDUIViewRender.LIZIZ.LIZIZ;
    }

    public void destroy() throws JSONException {
        Object objValueOf;
        Integer numValueOf;
        SDUIBaseUI value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sduiview destroy ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            sDUIViewRender.LJIIZILJ = true;
            for (Map.Entry<Integer, SDUIBaseUI> entry : sDUIViewRender.LIZIZ.LJFF.entrySet()) {
                if ((entry.getValue() instanceof SDUIBaseUI) && (value = entry.getValue()) != null) {
                    value.LJIIJ();
                }
            }
            C1317150kNd c1317150kNd = sDUIViewRender.LJ;
            C1317140kNc c1317140kNc = c1317150kNd.LLJIJIL;
            if (c1317140kNc != null) {
                c1317140kNc.LIZ.clear();
                ViewTreeObserver viewTreeObserverLIZ = c1317140kNc.LIZ();
                if (viewTreeObserverLIZ != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = c1317140kNc.LIZJ;
                    viewTreeObserverLIZ.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                    C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                    ViewTreeObserverOnScrollChangedListenerC1317260kNo viewTreeObserverOnScrollChangedListenerC1317260kNo = c1317140kNc.LIZLLL;
                    viewTreeObserverLIZ.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1317260kNo);
                    C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnScrollChangedListenerC1317260kNo, ViewTreeObserver.OnScrollChangedListener.class);
                    ViewTreeObserverOnDrawListenerC1317270kNp viewTreeObserverOnDrawListenerC1317270kNp = c1317140kNc.LJ;
                    viewTreeObserverLIZ.removeOnDrawListener(viewTreeObserverOnDrawListenerC1317270kNp);
                    C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnDrawListenerC1317270kNp, ViewTreeObserver.OnDrawListener.class);
                }
            }
            C1317100kNY c1317100kNY = c1317150kNd.LLJJJJ;
            c1317100kNY.LIZIZ.put("show_stage", c1317100kNY.LJIJI);
            c1317100kNY.LIZIZ(-1, -1, "destroy");
            Iterator it2 = ((LinkedHashMap) c1317100kNY.LJIJJ).entrySet().iterator();
            while (it2.hasNext()) {
                C1317180kNg c1317180kNg = (C1317180kNg) ((Map.Entry) it2.next()).getValue();
                C1317130kNb c1317130kNb = c1317100kNY.LIZ.LLIZLLLIL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sign", c1317180kNg.LIZ);
                jSONObject.put("index", c1317180kNg.LIZIZ);
                jSONObject.put("msgReceivedTime", c1317180kNg.LIZJ);
                jSONObject.put("decodeTime", c1317180kNg.LJI);
                jSONObject.put("createTime", c1317180kNg.LIZLLL);
                jSONObject.put("insertTime", c1317180kNg.LJ);
                jSONObject.put("showTime", c1317180kNg.LJFF);
                jSONObject.put("visibility", c1317180kNg.LJII);
                SDUIBaseUI sDUIBaseUI = c1317180kNg.LJIIIIZZ;
                if (sDUIBaseUI == null || (objValueOf = Integer.valueOf(sDUIBaseUI.LJJJJI())) == null) {
                    objValueOf = AFwS189S0000000_3.get$arr$(8);
                }
                jSONObject.put("width", objValueOf);
                SDUIBaseUI sDUIBaseUI2 = c1317180kNg.LJIIIIZZ;
                jSONObject.put("height", (sDUIBaseUI2 == null || (numValueOf = Integer.valueOf(sDUIBaseUI2.LJIIZILJ())) == null) ? -1 : numValueOf.intValue());
                c1317130kNb.LIZ("sdui_item_shadow", jSONObject);
            }
            Map<String, String> map = c1317100kNY.LIZIZ;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("created_list", c1317100kNY.LJIIL);
            jSONObject3.put("created_adapter", c1317100kNY.LJIILIIL);
            jSONObject3.put("item_cnt", c1317100kNY.LJIILJJIL);
            jSONObject3.put("removed_cnt", c1317100kNY.LJIILL);
            jSONObject3.put("first_component_parent", c1317100kNY.LJIIZILJ);
            jSONObject3.put("list_sign", c1317100kNY.LJIJ);
            jSONObject2.put("inner_debug", jSONObject3);
            jSONObject2.put("list_info", c1317100kNY.LJIIIIZZ);
            map.put("list_debug_info", C786410Ut5.J3(jSONObject2));
            c1317100kNY.LIZIZ.put("logId", c1317100kNY.LJIIJ);
            c1317100kNY.LIZIZ.put("reqUUID", c1317100kNY.LJIIJJI);
            JSONObject jSONObject4 = new JSONObject(C2097608Jq.LJIIZILJ(c1317100kNY.LIZIZ));
            c1317100kNY.LIZ.LLIZLLLIL.LIZ("sdui_cost_statics", jSONObject4);
            if (C1317810kOh.LJIIL) {
                c1317100kNY.LIZ.LLJJJ.LIZIZ("server_destroy", jSONObject4);
            }
            C1290750jh3.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS106S0100000_6(c1317150kNd, 240));
            c1317150kNd.LLJJ.LIZJ();
            sDUIViewRender.LJ = null;
            sDUIViewRender.LJFF.LIZJ();
            this.mSDUIViewRender.LIZLLL();
            this.mSDUIViewRender = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0kNo] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0kNp] */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        final C1317140kNc c1317140kNc;
        C1313660kI0 c1313660kI0;
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("lynxview onAttachedToWindow ");
            sbLIZ2.append(sDUIViewRender.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            TraceEvent.LIZ("onAttachedToWindow");
            Iterator it2 = ((ArrayList) sDUIViewRender.LJIILL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1317370kNz) it2.next()).LLLZZ();
            }
            C1313470kHh c1313470kHh = sDUIViewRender.LIZIZ;
            if (c1313470kHh != null && (c1313660kI0 = c1313470kHh.LIZIZ) != null) {
                c1313660kI0.LJJLIIIIJ();
            }
            C1317150kNd c1317150kNd = sDUIViewRender.LJ;
            if (c1317150kNd == null || (c1317140kNc = c1317150kNd.LLJIJIL) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserverLIZ = c1317140kNc.LIZ();
            c1317140kNc.LIZJ = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(c1317140kNc, 0);
            c1317140kNc.LIZLLL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0kNo
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    c1317140kNc.getClass();
                }
            };
            c1317140kNc.LJ = new ViewTreeObserver.OnDrawListener() { // from class: X.0kNp
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    c1317140kNc.getClass();
                }
            };
            C786410Ut5.x3(viewTreeObserverLIZ, c1317140kNc.LIZJ);
            ViewTreeObserverOnScrollChangedListenerC1317260kNo viewTreeObserverOnScrollChangedListenerC1317260kNo = c1317140kNc.LIZLLL;
            viewTreeObserverLIZ.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1317260kNo);
            C2187701Ajg.LIZ(viewTreeObserverLIZ, viewTreeObserverOnScrollChangedListenerC1317260kNo, ViewTreeObserver.OnScrollChangedListener.class);
            ViewTreeObserverOnDrawListenerC1317270kNp viewTreeObserverOnDrawListenerC1317270kNp = c1317140kNc.LJ;
            viewTreeObserverLIZ.addOnDrawListener(viewTreeObserverOnDrawListenerC1317270kNp);
            C2187701Ajg.LIZ(viewTreeObserverLIZ, viewTreeObserverOnDrawListenerC1317270kNp, ViewTreeObserver.OnDrawListener.class);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            sDUIViewRender.LIZLLL();
        }
        super.onDetachedFromWindow();
        if (this.mSDUIViewRender != null) {
            C786410Ut5.LJLILLLLZI(getSDUIContext().LLJJJ.LIZ, 10003);
        }
    }

    public void onEnterBackground() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterBackground");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            Iterator it2 = ((ArrayList) sDUIViewRender.LJIILL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1317370kNz) it2.next()).LIZIZ();
            }
        }
    }

    public void onEnterForeground() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterForeground ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            Iterator it2 = ((ArrayList) sDUIViewRender.LJIILL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1317370kNz) it2.next()).LLLZZ();
            }
        }
    }

    public C1317080kNW(Context context) {
        super(context);
    }

    public void addSDUIViewClient(AbstractC1317190kNh abstractC1317190kNh) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null && abstractC1317190kNh != null) {
            C1317130kNb c1317130kNb = sDUIViewRender.LJFF;
            if (!c1317130kNb.LIZ.contains(abstractC1317190kNh)) {
                c1317130kNb.LIZ.add(abstractC1317190kNh);
            }
        }
    }

    public void addStateListener(InterfaceC1317370kNz interfaceC1317370kNz) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            if (interfaceC1317370kNz != null) {
                ((ArrayList) sDUIViewRender.LJIILL).add(interfaceC1317370kNz);
            } else {
                sDUIViewRender.getClass();
            }
        }
    }

    @Override // X.C1313670kI1, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zLIZJ;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SDUIView dispatchTouchEvent, this: ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
            if (sDUIViewRender != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during the execution of the dispatchTouchEvent function，and the error message is ");
                sbLIZ2.append(th.getMessage());
                sDUIViewRender.LJ(103, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            }
        }
        if (this.mSDUIViewRender == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mCanDispatchTouchEvent = true;
        }
        if (this.mCanDispatchTouchEvent) {
            zLIZJ = this.mSDUIViewRender.LIZJ(motionEvent);
            if (zLIZJ && this.mSDUIViewRender.LIZ() && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else {
            zLIZJ = false;
        }
        if (action == 1 || action == 3) {
            this.mCanDispatchTouchEvent = false;
        }
        if (zLIZJ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void load(String str) {
        load(str, new JSONObject());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SDUIView onInterceptTouchEvent, this: ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            SDUIViewRender sDUIViewRender2 = this.mSDUIViewRender;
            if (sDUIViewRender2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during the execution of the onInterceptTouchEvent function，and the error message is ");
                sbLIZ2.append(th.getMessage());
                sDUIViewRender2.LJ(103, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                return false;
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SDUIView onTouchEvent, this: ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            if (!this.mSDUIViewRender.LIZ() || getParent() == null) {
                super.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
            if (sDUIViewRender != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during the execution of the onTouchEvent function，and the error message is ");
                sbLIZ2.append(th.getMessage());
                sDUIViewRender.LJ(103, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                return false;
            }
            return false;
        }
    }

    public void removeSDUIViewClient(AbstractC1317190kNh abstractC1317190kNh) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        if (abstractC1317190kNh == null) {
            sDUIViewRender.getClass();
            return;
        }
        C1317130kNb c1317130kNb = sDUIViewRender.LJFF;
        if (c1317130kNb == null) {
            return;
        }
        c1317130kNb.LIZ.remove(abstractC1317190kNh);
    }

    public void removeStateListener(InterfaceC1317370kNz interfaceC1317370kNz) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            if (interfaceC1317370kNz != null) {
                ((ArrayList) sDUIViewRender.LJIILL).remove(interfaceC1317370kNz);
            } else {
                sDUIViewRender.getClass();
            }
        }
    }

    public void setExtraTiming(Map<String, Long> map) {
        if (map == null) {
            return;
        }
        C1317170kNf c1317170kNf = new C1317170kNf();
        if (map.containsKey("open_time")) {
            c1317170kNf.LIZ = map.get("open_time").longValue();
        }
        if (map.containsKey("container_init_start")) {
            c1317170kNf.LIZIZ = map.get("container_init_start").longValue();
        }
        if (map.containsKey("container_init_end")) {
            c1317170kNf.LIZJ = map.get("container_init_end").longValue();
        }
        if (map.containsKey("prepare_template_start")) {
            c1317170kNf.LIZLLL = map.get("prepare_template_start").longValue();
        }
        if (map.containsKey("prepare_template_end")) {
            c1317170kNf.LJ = map.get("prepare_template_end").longValue();
        }
        C1317120kNa c1317120kNa = this.mSDUIViewRender.LIZIZ.LJI;
        c1317120kNa.getClass();
        C1290750jh3.LJ(new ARunnableS89S0200000_20(c1317120kNa, c1317170kNf, 140));
    }

    public void setGlobalProps(JSONObject jSONObject) {
        getSDUIContext().LLJJIII = C786410Ut5.J3(jSONObject);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void updateData(String str) {
        updateData(str, "");
    }

    public void updateData(Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public C1317080kNW(Context context, C1317160kNe c1317160kNe) {
        super(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new lynxview  ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        initialize(context, c1317160kNe);
    }

    public void initialize(Context context, C1317160kNe c1317160kNe) {
        setFocusableInTouchMode(true);
        this.mSDUIViewRender = new SDUIViewRender(context, this, c1317160kNe);
    }

    public void innerSetMeasuredDimension(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void load(String str, JSONObject jSONObject) {
        if (!C1317810kOh.LIZ) {
            getSDUIContext().LLIZLLLIL.LJII(new C1291190jhl(-1, "not enabled"));
            return;
        }
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender != null) {
            C1317150kNd c1317150kNd = sDUIViewRender.LJ;
            c1317150kNd.LLJILJILJ = str;
            if (jSONObject != null) {
                c1317150kNd.LLJJIJI = C786410Ut5.J3(jSONObject);
            }
            sDUIViewRender.LJ.LLJJ.LIZ();
            if (!sDUIViewRender.LJIIZILJ) {
                if (sDUIViewRender.LJIIL) {
                    if (sDUIViewRender.LJIIIZ != null) {
                        if (C1290750jh3.LIZ()) {
                            sDUIViewRender.LJIIIZ.reloadAndInit();
                            sDUIViewRender.LIZIZ.LJIILIIL();
                        } else {
                            C1290750jh3.LIZLLL(new ARunnableS120S0100000_20(sDUIViewRender, 37));
                        }
                    }
                    C1312690kGR c1312690kGR = sDUIViewRender.LIZ;
                    if (c1312690kGR != null) {
                        c1312690kGR.LIZ = true;
                        sDUIViewRender.LIZ = null;
                    }
                    sDUIViewRender.LJ.LLJJ.LIZJ();
                    int i = sDUIViewRender.LIZJ;
                    int i2 = sDUIViewRender.LIZLLL;
                    sDUIViewRender.LIZJ = 0;
                    sDUIViewRender.LIZLLL = 0;
                    C1317150kNd c1317150kNd2 = sDUIViewRender.LJ;
                    if (c1317150kNd2 != null) {
                        synchronized (c1317150kNd2.LLILLJJLI) {
                            try {
                                ((HashMap) c1317150kNd2.LLILLJJLI).clear();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C1317070kNV c1317070kNV = c1317150kNd2.LLILZ;
                        if (c1317070kNV != null) {
                            c1317070kNV.LIZJ = null;
                            c1317070kNV.LJ = null;
                            c1317070kNV.LJFF.clear();
                        }
                        C1317140kNc c1317140kNc = c1317150kNd2.LLJIJIL;
                        if (c1317140kNc != null) {
                            c1317140kNc.LIZ.clear();
                            ViewTreeObserver viewTreeObserverLIZ = c1317140kNc.LIZ();
                            if (viewTreeObserverLIZ != null) {
                                ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = c1317140kNc.LIZJ;
                                viewTreeObserverLIZ.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                                C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                                ViewTreeObserverOnScrollChangedListenerC1317260kNo viewTreeObserverOnScrollChangedListenerC1317260kNo = c1317140kNc.LIZLLL;
                                viewTreeObserverLIZ.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1317260kNo);
                                C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnScrollChangedListenerC1317260kNo, ViewTreeObserver.OnScrollChangedListener.class);
                                ViewTreeObserverOnDrawListenerC1317270kNp viewTreeObserverOnDrawListenerC1317270kNp = c1317140kNc.LJ;
                                viewTreeObserverLIZ.removeOnDrawListener(viewTreeObserverOnDrawListenerC1317270kNp);
                                C2187701Ajg.LIZIZ(viewTreeObserverLIZ, viewTreeObserverOnDrawListenerC1317270kNp, ViewTreeObserver.OnDrawListener.class);
                            }
                        }
                    }
                    sDUIViewRender.LIZIZ();
                    sDUIViewRender.LJFF(i, i2);
                    sDUIViewRender.LIZIZ.LJI.LIZJ(sDUIViewRender.LJIILIIL, "setup_create_lynx_start", null);
                    sDUIViewRender.LIZIZ.LJI.LIZJ(sDUIViewRender.LJIILJJIL, "setup_create_lynx_end", null);
                    return;
                }
                sDUIViewRender.LJIIL = true;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        long jCurrentTimeMillis;
        int size;
        int size2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMeasure:");
        sbLIZ.append(hashCode());
        sbLIZ.append(", width");
        sbLIZ.append(View.MeasureSpec.toString(i));
        sbLIZ.append(", height");
        sbLIZ.append(View.MeasureSpec.toString(i2));
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (sDUIViewRender.LJIIJJI == -1) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        sDUIViewRender.LJFF(i, i2);
        sDUIViewRender.LIZIZ.LIZIZ.LJLLLLLL();
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = sDUIViewRender.LIZIZ.LIZIZ.LLJJJIL;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            size2 = View.MeasureSpec.getSize(i2);
        } else {
            size2 = sDUIViewRender.LIZIZ.LIZIZ.LLJJJJ;
        }
        sDUIViewRender.LJIIIZ.innerSetMeasuredDimension(size, size2);
        if (sDUIViewRender.LJIIJJI == -1) {
            sDUIViewRender.LJIIJJI = System.currentTimeMillis() - jCurrentTimeMillis;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C786410Ut5.LJLILLLLZI(getSDUIContext().LLJJJ.LIZ, 10003);
    }

    public void sendGlobalEvent(String str, JSONObject jSONObject) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        sDUIViewRender.LJ.LLJJJ.LIZIZ(str, jSONObject);
    }

    public void updateData(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData with json in ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        try {
            SDUIEventManager sDUIEventManager = sDUIViewRender.LJ.LLJJJ;
            JSONObject jSONObject = new JSONObject(str);
            sDUIEventManager.getClass();
            ClientEvent clientEvent = new ClientEvent();
            UpdateDataEvent updateDataEvent = new UpdateDataEvent();
            updateDataEvent.LIZ = C786410Ut5.J3(jSONObject);
            updateDataEvent.LIZIZ = str2;
            clientEvent.LJIIIIZZ = updateDataEvent;
            sDUIEventManager.LIZ(clientEvent, true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public void updateViewport(int i, int i2) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        sDUIViewRender.LJFF(i, i2);
    }

    public C1317080kNW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateData(Map<String, Object> map, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData with map in ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        sDUIViewRender.updateData(map, str);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SDUIViewRender sDUIViewRender = this.mSDUIViewRender;
        if (sDUIViewRender == null) {
            return;
        }
        C1313470kHh c1313470kHh = sDUIViewRender.LIZIZ;
        c1313470kHh.LIZIZ.LJLLLL();
        C1298420jtQ c1298420jtQ = c1313470kHh.LIZIZ.LLILZ.LLILLL;
        if (c1298420jtQ != null) {
            c1298420jtQ.LIZ(EnumC1298380jtM.kLynxEventTypeLayoutEvent, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayout:");
        sbLIZ.append(hashCode());
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(i2);
        sbLIZ.append(" ");
        sbLIZ.append(i3);
        sbLIZ.append(" ");
        sbLIZ.append(i4);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
