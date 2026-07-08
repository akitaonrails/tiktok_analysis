package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimaEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118800fDi extends C09AY implements InterfaceC1631620sYq<String, InterfaceC1330440kj4, AnimatedDrawable2, Unit> {
    public final /* synthetic */ C1085590eM9 LL;
    public final /* synthetic */ C1126540fQC LLILLJJLI;
    public final /* synthetic */ C1118840fDm LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118800fDi(C1085590eM9 c1085590eM9, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, float f, float f2) {
        super(3);
        this.LL = c1085590eM9;
        this.LLILLJJLI = c1126540fQC;
        this.LLILLL = c1118840fDm;
        this.LLILZ = f;
        this.LLILZIL = f2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, InterfaceC1330440kj4 interfaceC1330440kj4, AnimatedDrawable2 animatedDrawable2) {
        final AnimatedDrawable2 animatedDrawable22 = animatedDrawable2;
        final C1085590eM9 c1085590eM9 = this.LL;
        if (c1085590eM9.LJI) {
            this.LL.LIZ(this.LLILLJJLI);
            C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath return for screen is cleared");
            C1118780fDg.LIZIZ(this.LLILLL, 0, 2, 2, false);
        } else {
            final C1118840fDm c1118840fDm = this.LLILLL;
            final C1126540fQC c1126540fQC = this.LLILLJJLI;
            float f = this.LLILZ;
            float f2 = this.LLILZIL;
            c1085590eM9.LJIIIIZZ = c1118840fDm.LIZ.LJ;
            Rect rect = new Rect();
            ViewGroup viewGroup = c1085590eM9.LIZIZ;
            if (viewGroup != null) {
                viewGroup.getGlobalVisibleRect(rect);
            }
            Path path = new Path();
            float f3 = c1118840fDm.LIZIZ.getSecond().x - rect.left;
            float f4 = c1118840fDm.LIZIZ.getSecond().y - rect.top;
            path.moveTo(f - rect.left, f2 - rect.top);
            path.lineTo(f3, f4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("animationView rect is ");
            sbLIZ.append(rect);
            sbLIZ.append(", realStartX is ");
            sbLIZ.append(f);
            sbLIZ.append(", realStartY is ");
            sbLIZ.append(f2);
            sbLIZ.append(", toX is ");
            sbLIZ.append(c1118840fDm.LIZIZ.getSecond().x);
            sbLIZ.append(", toY is  ");
            sbLIZ.append(c1118840fDm.LIZIZ.getSecond().y);
            C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", C2188811AlT.LIZIZ(sbLIZ));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1126540fQC, (Property<C1126540fQC, Float>) View.X, (Property<C1126540fQC, Float>) View.Y, path);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(700L);
            c1085590eM9.LJII = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0fDj
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onCancel");
                    AnimatedDrawable2 animatedDrawable23 = animatedDrawable22;
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                    }
                    AnimatedDrawable2 animatedDrawable24 = animatedDrawable22;
                    if (animatedDrawable24 != null) {
                        animatedDrawable24.setVisible(false, false);
                    }
                    c1085590eM9.LIZ(c1126540fQC);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onEnd");
                    AnimatedDrawable2 animatedDrawable23 = animatedDrawable22;
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                    }
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    C1118840fDm c1118840fDm2 = c1118840fDm;
                    c1118840fDm2.LIZJ = 1;
                    dataChannelGlobal.FQ2(SmallFlyMicGiftAnimaEndEvent.class, c1118840fDm2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    final C1085590eM9 c1085590eM92 = c1085590eM9;
                    final AnimatedDrawable2 animatedDrawable23 = animatedDrawable22;
                    final C1126540fQC c1126540fQC2 = c1126540fQC;
                    c1085590eM92.getClass();
                    if (animatedDrawable23 != null) {
                        animatedDrawable23.stop();
                        animatedDrawable23.LJII(new InterfaceC1331000kjy() { // from class: X.0fDk
                            @Override // X.InterfaceC1331000kjy
                            public final void LIZ(AnimatedDrawable2 animatedDrawable24) {
                                C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationStart");
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZIZ(AnimatedDrawable2 animatedDrawable24) {
                                C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationRepeat");
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZJ(AnimatedDrawable2 animatedDrawable24) {
                                C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "startFlySmallGiftByPath onAnimationStop");
                                AnimatedDrawable2 animatedDrawable25 = animatedDrawable23;
                                if (animatedDrawable25 != null) {
                                    animatedDrawable25.setVisible(false, false);
                                }
                                c1085590eM92.LIZ(c1126540fQC2);
                            }

                            @Override // X.InterfaceC1331000kjy
                            public final void LIZLLL(AnimatedDrawable2 animatedDrawable24, int i) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("startFlySmallGiftByPath onAnimationFrame:");
                                sbLIZ2.append(i);
                                C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        });
                        animatedDrawable23.start();
                    }
                    C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "fly small pathAnimator Animator onStart");
                }
            });
            objectAnimatorOfFloat.start();
        }
        return Unit.LIZ;
    }
}
