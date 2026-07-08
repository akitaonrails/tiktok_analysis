package X;

import Y.AAListenerS273S0200000_24;
import android.animation.Animator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608940ryG implements InterfaceC1292040jj8<C1294720jnS> {
    public final /* synthetic */ C1292030jj7<C1294720jnS> LL;
    public final /* synthetic */ C1608920ryE LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ C1608950ryH LLILZLL;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(C1294720jnS c1294720jnS) {
        final C1294720jnS c1294720jnS2 = c1294720jnS;
        this.LL.LJII(this);
        final C1608920ryE c1608920ryE = this.LLILLJJLI;
        final int i = this.LLILLL;
        final float f = this.LLILZ;
        final float f2 = this.LLILZIL;
        final C1608950ryH c1608950ryH = this.LLILZLL;
        C2487409ou.LIZJ(new Runnable() { // from class: X.0ryF
            public final void LIZ() {
                C1609220ryi c1609220ryiLJIIIIZZ;
                C1608950ryH lottieSource;
                AbstractC1606860ruu abstractC1606860ruu = c1608920ryE.LJII;
                if (((abstractC1606860ruu == null || !Intrinsics.LJFF(abstractC1606860ruu.LIZIZ(), Boolean.TRUE)) && !c1608920ryE.LJIIJ()) || (c1609220ryiLJIIIIZZ = c1608920ryE.LJIIIIZZ()) == null) {
                    return;
                }
                C1608920ryE c1608920ryE2 = c1608920ryE;
                C1294720jnS c1294720jnS3 = c1294720jnS2;
                int i2 = i;
                float f3 = f;
                float f4 = f2;
                C1608950ryH c1608950ryH2 = c1608950ryH;
                if (!c1608920ryE2.LJFF.get()) {
                    EnumC1606030rtZ enumC1606030rtZ = c1608920ryE2.LIZJ;
                    Animator.AnimatorListener animatorListener = (enumC1606030rtZ == null || (lottieSource = enumC1606030rtZ.getLottieSource()) == null) ? null : lottieSource.LIZLLL;
                    C1609220ryi c1609220ryiLJIIIIZZ2 = c1608920ryE2.LJIIIIZZ();
                    if (c1609220ryiLJIIIIZZ2 != null) {
                        c1609220ryiLJIIIIZZ2.addAnimatorListener(new AAListenerS273S0200000_24(animatorListener, c1608920ryE2, 4));
                    }
                    c1608920ryE2.LJFF = new AtomicBoolean(true);
                }
                c1609220ryiLJIIIIZZ.setComposition(c1294720jnS3);
                c1609220ryiLJIIIIZZ.setRepeatCount(i2);
                c1609220ryiLJIIIIZZ.setMinAndMaxProgress(f3, f4);
                C1609220ryi c1609220ryiLJIIIIZZ3 = c1608920ryE2.LJIIIIZZ();
                if (c1609220ryiLJIIIIZZ3 != null && !c1609220ryiLJIIIIZZ3.isAnimating()) {
                    c1609220ryiLJIIIIZZ.playAnimation();
                }
                c1609220ryiLJIIIIZZ.setProgress(c1608950ryH2.LIZJ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AvatarStoryAnimator@f798.controlLottieAnimation$1$onResult$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AvatarStoryAnimator@f798.controlLottieAnimation$1$onResult$1");
            }
        });
    }

    public C1608940ryG(C1292030jj7<C1294720jnS> c1292030jj7, C1608920ryE c1608920ryE, int i, float f, float f2, C1608950ryH c1608950ryH) {
        this.LL = c1292030jj7;
        this.LLILLJJLI = c1608920ryE;
        this.LLILLL = i;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = c1608950ryH;
    }
}
