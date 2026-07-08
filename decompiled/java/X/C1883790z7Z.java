package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardBgModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883790z7Z extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883790z7Z(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixSparkCard mixSparkCard;
        InterfaceC1883030z6L interfaceC1883030z6LLIZ = C1882840z62.LIZ(this.LL);
        if ((interfaceC1883030z6LLIZ instanceof MixSparkCard) && (mixSparkCard = (MixSparkCard) interfaceC1883030z6LLIZ) != null) {
            String str = this.LLILLJJLI;
            if (str.length() == 0) {
                C20441214yg.LJ("MixSparkCard", "openSecondSparkView error, scheme is empty");
            } else {
                C0KYM c0kymLIZ = C513270KAz.LIZ(str);
                c0kymLIZ.LJII("is_powered_by_mix_lynx_card", "1");
                C1883920z7m c1883920z7mLIZ = C1883910z7l.LIZ(mixSparkCard.LL, mixSparkCard, c0kymLIZ.LIZ().toString(), null, true, new C1883860z7g(mixSparkCard));
                String strLIZIZ = c1883920z7mLIZ.LIZIZ();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    ((ConcurrentHashMap) C1882840z62.LIZIZ.getValue()).put(strLIZIZ, new WeakReference(mixSparkCard));
                }
                final C1087600ePO c1087600ePO = new C1087600ePO(mixSparkCard.LL);
                c1087600ePO.setSparkView$livegame_impl_release(c1883920z7mLIZ);
                MixCardBgModel mixCardBgModel = (MixCardBgModel) mixSparkCard.LLJJJ.getValue();
                if (mixCardBgModel != null) {
                    c1087600ePO.setBackground$livegame_impl_release(mixCardBgModel);
                }
                final C1091270eVJ c1091270eVJ = (C1091270eVJ) mixSparkCard.LLJJJJLIIL.getValue();
                c1091270eVJ.getClass();
                final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1087600ePO, (Property<C1087600ePO, Float>) View.TRANSLATION_X, 0.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0eVK
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        addView(c1087600ePO);
                    }
                });
                objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0ePQ
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        C786410Ut5.Jc(c1087600ePO, 0.0f);
                    }
                });
                if (c1091270eVJ.getWidth() > 0) {
                    objectAnimatorOfFloat.setFloatValues(c1091270eVJ.getWidth(), 0.0f);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                } else {
                    HandlerHook.viewPost(c1091270eVJ, new Runnable() { // from class: X.0UvO
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SparkContainerView@3552.pushView$1");
                            try {
                                objectAnimatorOfFloat.setFloatValues(getWidth(), 0.0f);
                                C786410Ut5.Pd(objectAnimatorOfFloat);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SparkContainerView@3552.pushView$1");
                        }
                    });
                }
                mixSparkCard.LJJJJZ().addLast(c1087600ePO);
            }
        }
        return Unit.LIZ;
    }
}
