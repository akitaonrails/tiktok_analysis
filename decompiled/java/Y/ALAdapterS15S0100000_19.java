package Y;

import X.AbstractViewOnClickListenerC1256970ioZ;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ALAdapterS15S0100000_19 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS15S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        ((RectRecUserCell) aLAdapterS15S0100000_19.l0).itemView.setTag(R.id.svc, null);
    }

    public static final void onAnimationEnd$0(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        String str;
        AbstractViewOnClickListenerC1256970ioZ abstractViewOnClickListenerC1256970ioZ = (AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0;
        abstractViewOnClickListenerC1256970ioZ.LLJJ = true;
        if (abstractViewOnClickListenerC1256970ioZ.LLJIJIL != null) {
            SurveyData surveyData = abstractViewOnClickListenerC1256970ioZ.LLJILJIL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("pop_survey_id", String.valueOf(surveyData.dialogId));
            if (!TextUtils.isEmpty(surveyData.originalQuestion)) {
                str = surveyData.originalQuestion;
            } else {
                str = surveyData.question;
            }
            c2344009Gk.LJIIIIZZ("pop_survey_question", str);
            c2344009Gk.LIZJ(surveyData.originId, "original_id");
            C20684815ws.LJIILLIIL("pop_survey_show", c2344009Gk.LIZ);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        AbstractViewOnClickListenerC1256970ioZ abstractViewOnClickListenerC1256970ioZ = (AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0;
        if (!abstractViewOnClickListenerC1256970ioZ.LLJJI) {
            if (abstractViewOnClickListenerC1256970ioZ.LLJILJILJ == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(abstractViewOnClickListenerC1256970ioZ.LLILLJJLI, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, r5.getHeight());
                abstractViewOnClickListenerC1256970ioZ.LLJILJILJ = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(300L);
                abstractViewOnClickListenerC1256970ioZ.LLJILJILJ.setInterpolator(new DecelerateInterpolator());
                abstractViewOnClickListenerC1256970ioZ.LLJILJILJ.setStartDelay(2000L);
            }
            if (!abstractViewOnClickListenerC1256970ioZ.LLJILJILJ.isStarted() && !abstractViewOnClickListenerC1256970ioZ.LLJILJILJ.isRunning()) {
                abstractViewOnClickListenerC1256970ioZ.LLJILJILJ.start();
            }
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        ((RectRecUserCell) aLAdapterS15S0100000_19.l0).itemView.setTag(R.id.svc, null);
    }

    public static final void onAnimationStart$0(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        C786410Ut5.LJLLLLLL(0, ((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILLJJLI);
        C786410Ut5.LJLLLLLL(0, ((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILLL);
        C786410Ut5.T4(((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILLL, 1.0f);
        C786410Ut5.LJLLLLLL(8, ((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILZLL);
    }

    public static final void onAnimationStart$1(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        C786410Ut5.T4(((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILZLL, 0.0f);
        C786410Ut5.LJLLLLLL(0, ((AbstractViewOnClickListenerC1256970ioZ) aLAdapterS15S0100000_19.l0).LLILZLL);
    }

    public static final void onAnimationStart$2(ALAdapterS15S0100000_19 aLAdapterS15S0100000_19, Animator animator) {
        View view = (View) aLAdapterS15S0100000_19.l0;
        view.setBackground(view.getContext().getResources().getDrawable(R.drawable.ace));
    }
}
