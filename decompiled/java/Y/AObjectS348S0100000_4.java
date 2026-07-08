package Y;

import X.C1023640ckE;
import X.C20441214yg;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1023650ckF;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AObjectS348S0100000_4 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS348S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS348S0100000_4 aObjectS348S0100000_4, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS348S0100000_4.l0;
        Boolean bool = (Boolean) obj;
        if (!absAudienceInteractionFragment.NS() && !bool.booleanValue()) {
            final View viewFindViewById = absAudienceInteractionFragment.LLILLJJLI.findViewById(R.id.ebi);
            final View viewFindViewById2 = absAudienceInteractionFragment.LLILLJJLI.findViewById(R.id.o_c);
            final View viewFindViewById3 = absAudienceInteractionFragment.LLILLJJLI.findViewById(R.id.m5_);
            int width = viewFindViewById.getWidth() / 2;
            boolean zLJJ = C497740JfY.LJJ();
            if (viewFindViewById2 != null && viewFindViewById3 != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, 0);
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
                final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById3.getLayoutParams();
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0DQp
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        View view = viewFindViewById;
                        view.setPadding(0, view.getPaddingTop(), 0, viewFindViewById.getPaddingBottom());
                        View view2 = viewFindViewById2;
                        view2.setPadding(0, view2.getPaddingTop(), 0, viewFindViewById2.getPaddingBottom());
                        marginLayoutParams.setMarginStart(0);
                        C786410Ut5.W5(viewFindViewById3, marginLayoutParams);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("screenView.visibility=");
                        sbLIZ.append(viewFindViewById2.getVisibility());
                        sbLIZ.append(", screenView.visibility=");
                        sbLIZ.append(viewFindViewById.getVisibility());
                        C20441214yg.LJIIIZ("Portrait2LandscapeAnimationEnd", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                        C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("screenView.visibility=");
                        sbLIZ.append(viewFindViewById2.getVisibility());
                        sbLIZ.append(", screenView.visibility=");
                        sbLIZ.append(viewFindViewById.getVisibility());
                        C20441214yg.LJIIIZ("Portrait2LandscapeAnimationStart", C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
                if (zLJJ) {
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS93S0400000_4(viewFindViewById, viewFindViewById2, marginLayoutParams, viewFindViewById3, 0));
                } else {
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS93S0400000_4(viewFindViewById, viewFindViewById2, marginLayoutParams, viewFindViewById3, 1));
                }
                valueAnimatorOfInt.start();
                C20441214yg.LJIIIZ("Portrait2LandscapeAnimation", "animation start");
            } else {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                }
                if (viewFindViewById3 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS348S0100000_4 aObjectS348S0100000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        Map<InterfaceC1023650ckF<Long, Long>, Long> mapLJJIII = ((ISplashAdService) aObjectS348S0100000_4.l0).LJJIII();
        if (!mapLJJIII.isEmpty()) {
            for (Map.Entry<InterfaceC1023650ckF<Long, Long>, Long> entry : mapLJJIII.entrySet()) {
                c1023640ckE.withParam(entry.getKey(), entry.getValue());
            }
            return null;
        }
        return null;
    }
}
