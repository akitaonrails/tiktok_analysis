package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS39S0110000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.blur.UIBlurView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.utils.BlurUtils;

/* JADX INFO: renamed from: X.0kRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ViewTreeObserverOnPreDrawListenerC1319730kRn extends AndroidView implements ViewTreeObserver.OnPreDrawListener {
    public static final String LLJJLIIIJLLLLLLLZ = ViewTreeObserverOnPreDrawListenerC1319730kRn.class.getSimpleName();
    public RenderNode LL;
    public float LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public Bitmap LLILZLL;
    public C1319760kRq LLIZ;
    public boolean LLIZLLLIL;
    public int[] LLJ;
    public int[] LLJI;
    public UIBlurView LLJIJIL;
    public View LLJILJIL;
    public final Rect LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public volatile RenderScript LLJJIJI;
    public volatile ScriptIntrinsicBlur LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public Allocation LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public volatile boolean LLJJJJLIIL;
    public boolean LLJJL;

    public final synchronized void LIZIZ() {
        if (this.LLJJIJI != null) {
            this.LLJJIJI.destroy();
            this.LLJJIJI = null;
        }
        if (this.LLJJIJIIJIL != null) {
            this.LLJJIJIIJIL.destroy();
            this.LLJJIJIIJIL = null;
        }
    }

    public final void LIZJ() {
        if (this.LLJJIJI == null || this.LLJJIJIIJIL == null) {
            if (Build.VERSION.SDK_INT < 31) {
                this.LLJJJJJIL = true;
                return;
            }
            return;
        }
        if (this.LLILZLL == null || this.LLILLJJLI == 0.0f) {
            return;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.LLJJIJI, this.LLILZLL);
        try {
            try {
                Bitmap bitmap = this.LLILZLL;
                if (bitmap.getHeight() != this.LLJJJJ || bitmap.getWidth() != this.LLJJJIL) {
                    Allocation allocation = this.LLJJJ;
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    this.LLJJJ = Allocation.createTyped(this.LLJJIJI, allocationCreateFromBitmap.getType());
                    this.LLJJJIL = this.LLILZLL.getWidth();
                    this.LLJJJJ = this.LLILZLL.getHeight();
                }
                this.LLJJIJIIJIL.setRadius(this.LLILLJJLI);
                this.LLJJIJIIJIL.setInput(allocationCreateFromBitmap);
                this.LLJJIJIIJIL.forEach(this.LLJJJ);
                this.LLJJJ.copyTo(this.LLILZLL);
            } catch (RSRuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                BlurUtils.iterativeBoxBlur(this.LLILZLL, (int) this.LLILLJJLI);
            }
            allocationCreateFromBitmap.destroy();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            allocationCreateFromBitmap.destroy();
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void getTargetParent() {
        String str;
        View viewFindViewByIdSelector;
        TraceEvent.LIZLLL("BlurView.getTargetParent");
        UIBlurView uIBlurView = this.LLJIJIL;
        if (uIBlurView == null) {
            TraceEvent.LJII("BlurView.getTargetParent");
            return;
        }
        if (uIBlurView.mView != 0 && (str = uIBlurView.LLILZLL) != null && !str.isEmpty() && uIBlurView.mContext.LJIILJJIL() != null && (viewFindViewByIdSelector = uIBlurView.mContext.LJIILJJIL().findViewByIdSelector(uIBlurView.LLILZLL)) != null) {
            uIBlurView.LJJIJ(uIBlurView, uIBlurView.LL);
            viewFindViewByIdSelector.getLocationOnScreen(uIBlurView.LLILLL);
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView.mView).setBlurViewLocation(uIBlurView.LL);
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView.mView).setRootLocation(uIBlurView.LLILLL);
            int[] iArr = uIBlurView.LL;
            int i = iArr[0];
            int i2 = iArr[1];
            int width = uIBlurView.getWidth() + i;
            int height = uIBlurView.getHeight() + i2;
            int[] iArr2 = uIBlurView.LLILLL;
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            int width2 = viewFindViewByIdSelector.getWidth() + i3;
            int height2 = viewFindViewByIdSelector.getHeight() + i4;
            int iMax = Math.max(i, i3);
            int iMax2 = Math.max(i2, i4);
            int iMin = Math.min(width, width2);
            int iMin2 = Math.min(height, height2);
            ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn = (ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView.mView;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJILJILJ.set(iMax - i, iMax2 - i2, iMin - i, iMin2 - i2);
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJILLL = true;
            this.LLJILJIL = viewFindViewByIdSelector;
            TraceEvent.LJII("BlurView.getTargetParent");
            return;
        }
        this.LLJILJILJ.setEmpty();
        this.LLJILLL = false;
        UIBlurView uIBlurView2 = this.LLJIJIL;
        LynxBaseUI parentBaseUI = uIBlurView2.getParentBaseUI();
        uIBlurView2.LJJIJ(uIBlurView2, uIBlurView2.LL);
        ((ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView2.mView).setBlurViewLocation(uIBlurView2.LL);
        ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn2 = (ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView2.mView;
        viewTreeObserverOnPreDrawListenerC1319730kRn2.LLJILJILJ.setEmpty();
        viewTreeObserverOnPreDrawListenerC1319730kRn2.LLJILLL = false;
        while (true) {
            if (!(parentBaseUI instanceof UIBody) && parentBaseUI != null) {
                if (parentBaseUI.getOverflow() != 0) {
                    int[] iArr3 = uIBlurView2.LL;
                    int i5 = iArr3[0];
                    int i6 = iArr3[1];
                    int width3 = uIBlurView2.getWidth() + i5;
                    int height3 = uIBlurView2.getHeight() + i6;
                    uIBlurView2.LJJIJ(parentBaseUI, uIBlurView2.LLILLJJLI);
                    int[] iArr4 = uIBlurView2.LLILLJJLI;
                    int left = iArr4[0];
                    int top = iArr4[1];
                    if (parentBaseUI.isFlatten()) {
                        left += parentBaseUI.getLeft();
                        top += parentBaseUI.getTop();
                    }
                    int width4 = parentBaseUI.getWidth() + left;
                    int height4 = parentBaseUI.getHeight() + top;
                    ((ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView2.mView).setRootLocation(uIBlurView2.LLILLJJLI);
                    if (i5 >= left && i6 >= top && width3 <= width4 && height3 <= height4) {
                        break;
                    } else {
                        parentBaseUI = parentBaseUI.getParentBaseUI();
                    }
                } else {
                    uIBlurView2.LJJIJ(parentBaseUI, uIBlurView2.LLILLJJLI);
                    ((ViewTreeObserverOnPreDrawListenerC1319730kRn) uIBlurView2.mView).setRootLocation(uIBlurView2.LLILLJJLI);
                    break;
                }
            } else {
                break;
            }
        }
        setTargetBlurParent(parentBaseUI);
        TraceEvent.LJII("BlurView.getTargetParent");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TraceEvent.LIZIZ("BlurView.updateBlur");
        View view = this.LLJILJIL;
        if (view != null && view.isDirty()) {
            this.LLJJL = true;
            HandlerHook.viewPost(this, new ARunnableS120S0100000_20(this, 154));
        }
        TraceEvent.LJII("BlurView.updateBlur");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateBlur() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnPreDrawListenerC1319730kRn.updateBlur():void");
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJJJJLIIL = true;
        if (this.LLILLL) {
            if (!isHardwareAccelerated()) {
                LynxLog.e(LLJJLIIIJLLLLLLLZ, "BlurView can't be used in not hardware-accelerated window!");
            } else if (this.LLJJIII) {
                C786410Ut5.y3(getViewTreeObserver(), this);
                this.LLJJIII = false;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJJJLIIL = false;
        if (this.LLJJ) {
            C786410Ut5.D3(getViewTreeObserver(), this);
            this.LLJJIII = true;
        }
    }

    public ViewTreeObserverOnPreDrawListenerC1319730kRn(Context context) {
        super(context);
        this.LLILLL = true;
        this.LLILZIL = 6.0f;
        this.LLJILJILJ = new Rect();
        this.LLJJI = true;
        this.LLJJIJIL = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.LL = new RenderNode("BlurView");
            if (i >= 31) {
                return;
            }
        }
        C1301610jyZ.LIZIZ().execute(new ARunnableS120S0100000_20(this, 153));
    }

    private void setTargetBlurParent(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            return;
        }
        if (lynxBaseUI.isFlatten() && (lynxBaseUI.getDrawParent() instanceof LynxUI)) {
            this.LLJILJIL = ((LynxUI) lynxBaseUI.getDrawParent()).mView;
        } else {
            if (!(lynxBaseUI instanceof LynxUI)) {
                return;
            }
            this.LLJILJIL = ((LynxUI) lynxBaseUI).mView;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public final void draw(Canvas canvas) {
        UIBlurView uIBlurView;
        C1313270kHN c1313270kHN;
        BackgroundDrawable backgroundDrawable;
        Path pathLJIIJJI;
        if (this.LLILLJJLI != 0.0f && this.LLILZ && !this.LLJJJJJIL) {
            if (!(canvas instanceof C1319760kRq)) {
                float height = getHeight() / this.LLILZLL.getHeight();
                float width = getWidth() / this.LLILZLL.getWidth();
                canvas.save();
                if (this.LLIZLLLIL && (uIBlurView = this.LLJIJIL) != null && (c1313270kHN = uIBlurView.mLynxBackground) != null && (backgroundDrawable = (BackgroundDrawable) c1313270kHN.LIZIZ) != null && (pathLJIIJJI = backgroundDrawable.LJIIJJI()) != null) {
                    canvas.clipPath(pathLJIIJJI);
                }
                canvas.scale(width, height);
                if (this.LLILZLL != null) {
                    TraceEvent.LIZIZ("BlurView.innerDraw");
                    if (this.LL != null && canvas.isHardwareAccelerated()) {
                        canvas.drawRenderNode(this.LL);
                    } else {
                        canvas.drawBitmap(this.LLILZLL, 0.0f, 0.0f, (Paint) null);
                    }
                    TraceEvent.LJII("BlurView.innerDraw");
                }
                canvas.restore();
            } else {
                return;
            }
        }
        super.draw(canvas);
    }

    public void setBlurRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.LLILLJJLI != f) {
            this.LLILLJJLI = f;
            postInvalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView
    public void setBlurSampling(int i) {
        super.setBlurSampling(i);
        this.LLILZIL = i;
    }

    public void setBlurViewLocation(int[] iArr) {
        this.LLJI = iArr;
    }

    public void setEnableBlurAutoUpdate(boolean z) {
        if (this.LLILLL != z) {
            HandlerHook.viewPost(this, new ARunnableS39S0110000_20(this, z, 8));
        }
    }

    public void setExperimentalUpdateBlurRadius(boolean z) {
        this.LLJJI = z;
    }

    public void setHasRadiusIfRadiusChanged(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
        }
    }

    public void setLynxBaseUI(UIBlurView uIBlurView) {
        this.LLJIJIL = uIBlurView;
    }

    public void setRootLocation(int[] iArr) {
        this.LLJ = iArr;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0kRq] */
    public final void LIZLLL(int i, int i2) {
        if (!this.LLJJ && this.LLILLL) {
            C786410Ut5.y3(getViewTreeObserver(), this);
            this.LLJJ = true;
        }
        float f = i;
        if (((int) Math.ceil(f / this.LLILZIL)) != 0) {
            float f2 = i2;
            if (((int) Math.ceil(f2 / this.LLILZIL)) != 0) {
                int iCeil = (int) Math.ceil(f / this.LLILZIL);
                int i3 = iCeil % 64;
                if (i3 != 0) {
                    iCeil = (iCeil - i3) + 64;
                }
                int iCeil2 = (int) Math.ceil(f2 / (f / iCeil));
                if (iCeil > 0 && iCeil2 > 0) {
                    setWillNotDraw(false);
                    Bitmap bitmap = this.LLILZLL;
                    if (bitmap == null || bitmap.getHeight() != iCeil2 || this.LLILZLL.getWidth() != iCeil) {
                        TraceEvent.LIZLLL("BlurView.createBitmap");
                        this.LLILZLL = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                        TraceEvent.LJII("BlurView.createBitmap");
                        final Bitmap bitmap2 = this.LLILZLL;
                        this.LLIZ = new Canvas(bitmap2) { // from class: X.0kRq
                        };
                        RenderNode renderNode = this.LL;
                        if (renderNode != null) {
                            renderNode.setPosition(0, 0, this.LLILZLL.getWidth(), this.LLILZLL.getHeight());
                        }
                    }
                    this.LLILZ = true;
                    return;
                }
                setWillNotDraw(true);
                return;
            }
        }
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLL && this.LLIZLLLIL && getBackground() != null) {
            getBackground().setBounds(0, 0, i, i2);
        }
        if (!this.LLJJI) {
            LIZLLL(i, i2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLILLL) {
            getTargetParent();
        }
    }
}
