package Y;

import X.C1222580hv6;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C427690Gpr;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS3S1101000_19 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i = this.i2;
        if (i == 3) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("pop_survey_id", String.valueOf(((SurveyData) this.l1).dialogId));
            c2344009Gk.LJIIIIZZ("pop_survey_question", !TextUtils.isEmpty(((SurveyData) this.l1).originalQuestion) ? ((SurveyData) this.l1).originalQuestion : ((SurveyData) this.l1).question);
            c2344009Gk.LIZJ(((SurveyData) this.l1).originId, "original_id");
            C20684815ws.LJIILLIIL("pop_survey_close", c2344009Gk.LIZ);
            return;
        }
        if (i == 1 || i == 2) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("pop_survey_id", String.valueOf(((SurveyData) this.l1).dialogId));
            c2344009Gk2.LJIIIIZZ("pop_survey_question", !TextUtils.isEmpty(((SurveyData) this.l1).originalQuestion) ? ((SurveyData) this.l1).originalQuestion : ((SurveyData) this.l1).question);
            c2344009Gk2.LIZJ(((SurveyData) this.l1).originId, "original_id");
            c2344009Gk2.LJIIIIZZ("pop_survey_answer", this.s0);
            C20684815ws.LJIILLIIL("pop_survey_answer", c2344009Gk2.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        C1261860iwS c1261860iwS;
        if (((AbsRecUserCell) this.l1).itemView.isAttachedToWindow()) {
            C1261650iw7 c1261650iw7 = (C1261650iw7) ((AbsRecUserCell) this.l1).getItem();
            if (Intrinsics.LJFF((c1261650iw7 == null || (c1261860iwS = c1261650iw7.LLILZIL) == null) ? null : c1261860iwS.getUid(), this.s0)) {
                C427690Gpr.LIZLLL(((AbsRecUserCell) this.l1).itemView, this.i2);
                ((AbsRecUserCell) this.l1).itemView.setBackgroundColor(this.i2);
            }
        }
    }

    public static final void run$0(ARunnableS3S1101000_19 aRunnableS3S1101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("LiveQuickPostProgressView@21a3.startProgressTimer$1$1");
        try {
            ((C1222580hv6) aRunnableS3S1101000_19.l1).LLIZLLLIL.put(aRunnableS3S1101000_19.s0, Integer.valueOf(aRunnableS3S1101000_19.i2));
            ((C1222580hv6) aRunnableS3S1101000_19.l1).LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveQuickPostProgressView@21a3.startProgressTimer$1$1");
    }

    public static final void run$1(ARunnableS3S1101000_19 aRunnableS3S1101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("BaseMyProfileGuideWidget@aba5.logSurveyAction$1");
        try {
            aRunnableS3S1101000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseMyProfileGuideWidget@aba5.logSurveyAction$1");
    }

    public static final void run$2(ARunnableS3S1101000_19 aRunnableS3S1101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AbsRecUserCell@596c.applyInitialInsertHighlight$1$paint$1");
        try {
            aRunnableS3S1101000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsRecUserCell@596c.applyInitialInsertHighlight$1$paint$1");
    }

    public ARunnableS3S1101000_19(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
