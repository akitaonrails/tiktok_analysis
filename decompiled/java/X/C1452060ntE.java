package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0ntE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452060ntE extends AbstractC2255721DQs<InterfaceC1450280nqM> implements InterfaceC1450280nqM, InterfaceC379610EuV {
    public static final C1452070ntF LLJ = new Object() { // from class: X.0ntF
    };
    public static final int LLJI = 8;
    public final C1DRG LL;
    public final SingleImageData LLILLJJLI;
    public final InterfaceC1451050nrb LLILLL;
    public final C19A3 LLILZ;
    public final int LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final C1452060ntE LLIZ = this;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 145));

    public final C1452020ntA X1() {
        return (C1452020ntA) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1450280nqM
    public void lq1() {
        SrcLiveVideoInfo srcLiveInfo = this.LLILLJJLI.getSrcLiveInfo();
        if (srcLiveInfo == null || !C1413430msv.LJIILIIL(srcLiveInfo)) {
            this.LLILZ.hide(X1());
        } else {
            Nb0();
        }
    }

    @Override // X.InterfaceC1450280nqM
    public void Nb0() {
        View view;
        View view2;
        ViewTreeObserver viewTreeObserver;
        final C1452020ntA c1452020ntAX1 = X1();
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 146);
        final float imageRatio = c1452020ntAX1.LLJIJIL.getImageRatio();
        Scene scene = c1452020ntAX1.mParentScene;
        if (scene != null && (view2 = scene.mView) != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0ntD
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    View view3;
                    View view4;
                    ViewTreeObserver viewTreeObserver2;
                    View view5;
                    View view6;
                    View view7;
                    Scene scene2 = c1452020ntAX1.mParentScene;
                    int width = (scene2 == null || (view7 = scene2.mView) == null) ? 0 : view7.getWidth();
                    Scene scene3 = c1452020ntAX1.mParentScene;
                    int height = (scene3 == null || (view6 = scene3.mView) == null) ? 0 : view6.getHeight();
                    if (width <= 0 || height <= 0) {
                        return;
                    }
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    float f4 = imageRatio;
                    if (f3 > f4) {
                        int i = (int) (f2 * f4);
                        C1452020ntA c1452020ntA = c1452020ntAX1;
                        ConstraintLayout constraintLayout = c1452020ntA.LLJJIJI;
                        if (constraintLayout != null && (view5 = c1452020ntA.LLJJ) != null) {
                            C1452020ntA.LLLII(constraintLayout, view5, (width - i) / 2, 0);
                        }
                    } else {
                        int i2 = (int) (f / f4);
                        C1452020ntA c1452020ntA2 = c1452020ntAX1;
                        ConstraintLayout constraintLayout2 = c1452020ntA2.LLJJIJI;
                        if (constraintLayout2 != null && (view3 = c1452020ntA2.LLJJ) != null) {
                            C1452020ntA.LLLII(constraintLayout2, view3, 0, (height - i2) / 2);
                        }
                    }
                    awS566S0100000_22.invoke();
                    Scene scene4 = c1452020ntAX1.mParentScene;
                    if (scene4 == null || (view4 = scene4.mView) == null || (viewTreeObserver2 = view4.getViewTreeObserver()) == null) {
                        return;
                    }
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        Scene scene2 = c1452020ntAX1.mParentScene;
        if (scene2 == null || (view = scene2.mView) == null) {
            return;
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0ntC
            public final void LIZ() {
                View view3;
                View view4;
                View view5;
                View view6;
                View view7;
                Scene scene3 = c1452020ntAX1.mParentScene;
                if (scene3 == null || (view3 = scene3.mView) == null || view3.getParent() == null) {
                    return;
                }
                Scene scene4 = c1452020ntAX1.mParentScene;
                int width = (scene4 == null || (view7 = scene4.mView) == null) ? 0 : view7.getWidth();
                Scene scene5 = c1452020ntAX1.mParentScene;
                int height = (scene5 == null || (view6 = scene5.mView) == null) ? 0 : view6.getHeight();
                if (width <= 0 || height <= 0) {
                    return;
                }
                float f = width;
                float f2 = height;
                float f3 = f / f2;
                float f4 = imageRatio;
                if (f3 > f4) {
                    int i = (int) (f2 * f4);
                    C1452020ntA c1452020ntA = c1452020ntAX1;
                    ConstraintLayout constraintLayout = c1452020ntA.LLJJIJI;
                    if (constraintLayout != null && (view5 = c1452020ntA.LLJJ) != null) {
                        C1452020ntA.LLLII(constraintLayout, view5, (width - i) / 2, 0);
                    }
                } else {
                    int i2 = (int) (f / f4);
                    C1452020ntA c1452020ntA2 = c1452020ntAX1;
                    ConstraintLayout constraintLayout2 = c1452020ntA2.LLJJIJI;
                    if (constraintLayout2 != null && (view4 = c1452020ntA2.LLJJ) != null) {
                        C1452020ntA.LLLII(constraintLayout2, view4, 0, (height - i2) / 2);
                    }
                }
                awS566S0100000_22.invoke();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ImageDiffLayoutLivePhotoScene@b878.adjustLayout$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ImageDiffLayoutLivePhotoScene@b878.adjustLayout$2");
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        SrcLiveVideoInfo srcLiveInfo = this.LLILLJJLI.getSrcLiveInfo();
        if (srcLiveInfo == null || !C1413430msv.LJIILIIL(srcLiveInfo)) {
            return;
        }
        this.LLILZ.add(this.LLILZIL, X1(), "ImageAdjustScene");
        this.LLILZ.hide(X1());
    }

    public C1452060ntE W1() {
        return this.LLIZ;
    }

    public final Function0<Unit> Z1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1452060ntE(C1DRG c1drg, SingleImageData singleImageData, InterfaceC1451050nrb interfaceC1451050nrb, C19A3 c19a3, int i, Function0<Unit> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = singleImageData;
        this.LLILLL = interfaceC1451050nrb;
        this.LLILZ = c19a3;
        this.LLILZIL = i;
        this.LLILZLL = function0;
    }
}
