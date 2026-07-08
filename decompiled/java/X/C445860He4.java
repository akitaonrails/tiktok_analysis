package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0He4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.GameDropsShortCardAgent$loadGameDropsShortCardWithLottie$2$4", f = "GameDropsShortCardAgent.kt", l = {}, m = "invokeSuspend")
public final class C445860He4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1085330eLj LL;
    public final /* synthetic */ C1105940esy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445860He4(InterfaceC1085330eLj interfaceC1085330eLj, C1105940esy c1105940esy, InterfaceC1364105Vn<? super C445860He4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1085330eLj;
        this.LLILLJJLI = c1105940esy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445860He4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1101720emA interfaceC1101720emA;
        C1C7U.LIZ("GameDropsShortCardAgent@8f3c.loadGameDropsShortCardWithLottie$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20441214yg.LIZIZ("GameDropsShortCardAgent", "lottie success, add item");
        InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
        InterfaceC1085330eLj interfaceC1085330eLj = this.LL;
        final C1105940esy c1105940esy = this.LLILLJJLI;
        final C1295960jpS c1295960jpS = c1105940esy.LIZIZ;
        if (c1295960jpS != null) {
            c1105940esy.getClass();
            interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0erH
                @Override // X.InterfaceC1101720emA
                public final void LJLJL() {
                }

                @Override // X.InterfaceC1101720emA
                public final void LLLZI() {
                }

                @Override // X.InterfaceC1101720emA
                public final boolean Ur() {
                    return true;
                }

                @Override // X.InterfaceC1101720emA
                public final int Vr() {
                    return 0;
                }

                @Override // X.InterfaceC1101720emA
                public final String Sr() {
                    return C1099470eiX.LIZ(this);
                }

                @Override // X.InterfaceC1101720emA
                public final View LLLILZJ() {
                    return c1295960jpS;
                }

                @Override // X.InterfaceC1101720emA
                public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                    long j;
                    final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                    if (animatorRb0 != null) {
                        final C1295960jpS c1295960jpS2 = c1295960jpS;
                        final C1105940esy c1105940esy2 = c1105940esy;
                        animatorRb0.addListener(new AnimatorListenerAdapter() { // from class: X.0erJ
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                c1105940esy2.LJI();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                c1295960jpS2.playAnimation();
                            }
                        });
                        if (z) {
                            j = 1040;
                        } else {
                            j = 1500;
                        }
                        animatorRb0.setDuration(j);
                    } else {
                        animatorRb0 = null;
                    }
                    final C1105940esy c1105940esy3 = c1105940esy;
                    return new InterfaceC1101940emW() { // from class: X.0erI
                        @Override // X.InterfaceC1101940emW
                        public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                            return new C1104920erK(animatorRb0);
                        }

                        @Override // X.InterfaceC1101940emW
                        public final void LIZIZ() {
                            Animator animator = animatorRb0;
                            if (animator != null) {
                                animator.cancel();
                            }
                            c1105940esy3.LJI();
                        }

                        @Override // X.InterfaceC1101940emW
                        public final void LIZJ() {
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
            };
        } else {
            interfaceC1101720emA = null;
        }
        interfaceC1087010eOR.Yd(interfaceC1085330eLj, interfaceC1101720emA);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDropsShortCardAgent@8f3c.loadGameDropsShortCardWithLottie$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
