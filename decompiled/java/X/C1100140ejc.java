package X;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.shorttouch.service.ShortTouchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0ejc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100140ejc implements InterfaceC1101720emA {
    public final AbstractC1098830ehV LIZ;
    public final /* synthetic */ ShortTouchService LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC1101720emA
    public final boolean Ur() {
        return true;
    }

    @Override // X.InterfaceC1101720emA
    public final int Vr() {
        return 0;
    }

    @Override // X.InterfaceC1101720emA
    public final void LJLJL() {
        this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1101720emA
    public final void LLLZI() {
        if (this.LIZJ) {
            this.LIZ.LJI(null);
        }
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(this));
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJI = 1;
        }
    }

    @Override // X.InterfaceC1101720emA
    public final String Sr() {
        return C1099470eiX.LIZ(this);
    }

    @Override // X.InterfaceC1101720emA
    public final View LLLILZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1101720emA
    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
        final Animator animatorRb0 = this.LIZIZ.rb0(viewGroup, z);
        final boolean z2 = this.LIZJ;
        return new InterfaceC1101940emW() { // from class: X.0ejd
            @Override // X.InterfaceC1101940emW
            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                return new AwS596S0100000_17(animatorRb0, 241);
            }

            @Override // X.InterfaceC1101940emW
            public final void LIZIZ() {
                Animator animator = animatorRb0;
                if (animator != null) {
                    animator.cancel();
                }
            }

            @Override // X.InterfaceC1101940emW
            public final void LIZJ() {
                if (!z2) {
                    this.LIZ.LJI(null);
                }
                Animator animator = animatorRb0;
                if (animator != null) {
                    animator.start();
                }
            }

            @Override // X.InterfaceC1101940emW
            public final boolean isRunning() {
                Animator animator = animatorRb0;
                if (animator != null) {
                    return animator.isRunning();
                }
                return false;
            }
        };
    }

    public C1100140ejc(Context context, Uri uri, ShortTouchService shortTouchService, boolean z) {
        this.LIZIZ = shortTouchService;
        this.LIZJ = z;
        final AbstractC1098830ehV abstractC1098830ehVVc1 = ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).vc1(uri, null, context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(70.0f), (int) C497740JfY.LIZIZ(70.0f));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1098830ehVVc1);
        abstractC1098830ehVVc1.setLayoutParams(layoutParams);
        abstractC1098830ehVVc1.setLoadCallback(new InterfaceC1098840ehW() { // from class: X.0ejb
            @Override // X.InterfaceC1098840ehW
            public final void LJJIZ() {
                C1100140ejc c1100140ejc = this.LIZ;
                c1100140ejc.getClass();
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1100140ejc));
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LIZLLL = System.currentTimeMillis() - abstractC1098830ehVVc1.getStartTime();
                }
            }

            @Override // X.InterfaceC1098840ehW
            public final void LIZ() {
                System.currentTimeMillis();
            }

            @Override // X.InterfaceC1098840ehW
            public final void LIZIZ(String str) {
                C1100140ejc c1100140ejc = this.LIZ;
                c1100140ejc.getClass();
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(C1099470eiX.LIZ(c1100140ejc));
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LIZJ = 1;
                }
            }

            {
                System.currentTimeMillis();
            }
        });
        this.LIZ = abstractC1098830ehVVc1;
    }
}
