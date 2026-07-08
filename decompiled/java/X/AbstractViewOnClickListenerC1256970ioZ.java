package X;

import Y.ALAdapterS15S0100000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ioZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractViewOnClickListenerC1256970ioZ implements View.OnClickListener {
    public final ViewStub LL;
    public View LLILLJJLI;
    public View LLILLL;
    public TextView LLILZ;
    public TextView LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public TextView LLJI;
    public C1256910ioT LLJIJIL;
    public SurveyData LLJILJIL;
    public Animator LLJILJILJ;
    public ValueAnimator LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    public final void LIZ() {
        Animator animator = this.LLJILJILJ;
        if (animator == null || this.LLJILLL == null) {
            return;
        }
        if (animator.isStarted() || this.LLJILJILJ.isRunning()) {
            this.LLJILJILJ.cancel();
        }
        if (this.LLJILLL.isStarted() || this.LLJILLL.isRunning()) {
            this.LLJILLL.cancel();
        }
    }

    public final void LIZIZ() {
        if (this.LLJILLL == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 0.0f, 1.0f);
            this.LLJILLL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(this, 13));
            this.LLJILLL.addListener(new ALAdapterS15S0100000_19(this, 1));
            this.LLJILLL.setDuration(600L);
        }
        if (this.LLJILLL.isStarted() || this.LLJILLL.isRunning()) {
            return;
        }
        this.LLJILLL.start();
    }

    public final void LIZJ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.ed(view, view.getHeight());
        }
        ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
        layoutParams.height = this.LLILLJJLI.getHeight();
        C786410Ut5.W5(this.LLILZLL, layoutParams);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<View, Float>) View.TRANSLATION_Y, r4.getMeasuredHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new ALAdapterS15S0100000_19(this, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public AbstractViewOnClickListenerC1256970ioZ(ViewStub viewStub) {
        this.LL = viewStub;
        if (viewStub.getLayoutResource() <= 0) {
            viewStub.setLayoutResource(R.layout.efd);
        }
    }

    public static boolean LIZLLL(SurveyData surveyData) {
        if (surveyData != null && !TextUtils.isEmpty(surveyData.question) && !TextUtils.isEmpty(surveyData.answer1) && !TextUtils.isEmpty(surveyData.answer2) && !TextUtils.isEmpty(surveyData.resultTitle) && !TextUtils.isEmpty(surveyData.resultDesc)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int id = view.getId();
        if (id == R.id.wqx) {
            C1256910ioT c1256910ioT = this.LLJIJIL;
            if (c1256910ioT != null) {
                c1256910ioT.LIZ(3, this.LLJILJIL, "");
                return;
            }
            return;
        }
        if (id == R.id.wr4) {
            C1256910ioT c1256910ioT2 = this.LLJIJIL;
            if (c1256910ioT2 == null) {
                return;
            }
            if (this.LLJJIII) {
                SurveyData surveyData = this.LLJILJIL;
                if (!TextUtils.isEmpty(surveyData.originAnswer2)) {
                    str4 = this.LLJILJIL.originAnswer2;
                } else {
                    str4 = this.LLJILJIL.answer2;
                }
                c1256910ioT2.LIZ(2, surveyData, str4);
                return;
            }
            SurveyData surveyData2 = this.LLJILJIL;
            if (!TextUtils.isEmpty(surveyData2.originAnswer1)) {
                str3 = this.LLJILJIL.originAnswer1;
            } else {
                str3 = this.LLJILJIL.answer1;
            }
            c1256910ioT2.LIZ(1, surveyData2, str3);
            return;
        }
        if (id == R.id.wr9) {
            C1256910ioT c1256910ioT3 = this.LLJIJIL;
            if (c1256910ioT3 == null) {
                return;
            }
            if (this.LLJJIII) {
                SurveyData surveyData3 = this.LLJILJIL;
                if (!TextUtils.isEmpty(surveyData3.originAnswer1)) {
                    str2 = this.LLJILJIL.originAnswer1;
                } else {
                    str2 = this.LLJILJIL.answer1;
                }
                c1256910ioT3.LIZ(1, surveyData3, str2);
                return;
            }
            SurveyData surveyData4 = this.LLJILJIL;
            if (!TextUtils.isEmpty(surveyData4.originAnswer2)) {
                str = this.LLJILJIL.originAnswer2;
            } else {
                str = this.LLJILJIL.answer2;
            }
            c1256910ioT3.LIZ(2, surveyData4, str);
            return;
        }
        if (id != R.id.wr8) {
            return;
        }
        this.LLJJI = true;
        LIZ();
        C1256910ioT c1256910ioT4 = this.LLJIJIL;
        if (c1256910ioT4 == null) {
            return;
        }
        AbstractViewOnClickListenerC1256970ioZ abstractViewOnClickListenerC1256970ioZ = c1256910ioT4.LIZ;
        View view2 = abstractViewOnClickListenerC1256970ioZ.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        abstractViewOnClickListenerC1256970ioZ.LIZ();
        abstractViewOnClickListenerC1256970ioZ.LLJJ = false;
    }
}
