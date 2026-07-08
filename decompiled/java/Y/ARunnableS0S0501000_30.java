package Y;

import X.C14XZ;
import X.C14Z0;
import X.C1C7U;
import X.C20280514Xb;
import X.C20280714Xd;
import X.C20284114Yl;
import X.C20284814Ys;
import X.C786410Ut5;
import X.EnumC19410610wq;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS0S0501000_30 implements Runnable {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        C786410Ut5.LJLLLLLL(4, (View) this.l0);
        C20284114Yl c20284114YlLJIILL = ((C20284814Ys) this.l1).LJIILL();
        if (c20284114YlLJIILL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C20284814Ys c20284814Ys = (C20284814Ys) this.l1;
            Context context = c20284814Ys.LL;
            EnumC19410610wq enumC19410610wq = c20284814Ys.LLJJJJLIIL;
            FeedSurvey feedSurvey = c20284814Ys.LLJJJIL;
            String str2 = null;
            if (feedSurvey != null) {
                str2 = feedSurvey.submitText;
                str = feedSurvey.id;
            } else {
                str = null;
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            Aweme aweme = c20284814Ys.LLILLJJLI;
            C14Z0 c14z0 = c20284814Ys.LLJJJ;
            c20284814Ys.getClass();
            c20284114YlLJIILL.LJIJJLI(viewStub, context, enumC19410610wq, str2, c20284814Ys, str, option, i, question, aweme, c14z0, false, null);
        }
    }

    public final void LIZ$1() {
        String str;
        C786410Ut5.LJLLLLLL(4, (View) this.l0);
        C20284114Yl c20284114YlLJIILL = ((C20284814Ys) this.l1).LJIILL();
        if (c20284114YlLJIILL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C20284814Ys c20284814Ys = (C20284814Ys) this.l1;
            Context context = c20284814Ys.LL;
            EnumC19410610wq enumC19410610wq = c20284814Ys.LLJJJJLIIL;
            FeedSurvey feedSurvey = c20284814Ys.LLJJJIL;
            String str2 = null;
            if (feedSurvey != null) {
                str2 = feedSurvey.submitText;
                str = feedSurvey.id;
            } else {
                str = null;
            }
            Option option = (Option) this.l3;
            int i = this.i5;
            Question question = (Question) this.l4;
            Aweme aweme = c20284814Ys.LLILLJJLI;
            C14Z0 c14z0 = c20284814Ys.LLJJJ;
            c20284814Ys.getClass();
            c20284114YlLJIILL.LJIJJLI(viewStub, context, enumC19410610wq, str2, c20284814Ys, str, option, i, question, aweme, c14z0, false, null);
        }
    }

    public final void LIZ$2() {
        String str;
        C786410Ut5.LJLLLLLL(4, (View) this.l0);
        C20284114Yl c20284114YlLJIL = ((C20280514Xb) this.l1).LJIL();
        if (c20284114YlLJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C20280514Xb c20280514Xb = (C20280514Xb) this.l1;
            Context context = c20280514Xb.LLJI;
            EnumC19410610wq enumC19410610wq = c20280514Xb.LLJL;
            FeedSurvey feedSurvey = c20280514Xb.LLILLJJLI;
            String str2 = null;
            if (feedSurvey != null) {
                str2 = feedSurvey.submitText;
                str = feedSurvey.id;
            } else {
                str = null;
            }
            c20284114YlLJIL.LJIJJLI(viewStub, context, enumC19410610wq, str2, c20280514Xb, str, (Option) this.l3, this.i5, (Question) this.l4, c20280514Xb.LL, c20280514Xb.LLILLL, false, null);
        }
    }

    public final void LIZ$3() {
        String str;
        C786410Ut5.LJLLLLLL(4, (View) this.l0);
        C20284114Yl c20284114YlLJIJI = ((C20280714Xd) this.l1).LJIJI();
        if (c20284114YlLJIJI != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C20280714Xd c20280714Xd = (C20280714Xd) this.l1;
            Context context = c20280714Xd.LLJI;
            EnumC19410610wq enumC19410610wq = c20280714Xd.LLJJL;
            FeedSurvey feedSurvey = c20280714Xd.LLILLJJLI;
            String str2 = null;
            if (feedSurvey != null) {
                str2 = feedSurvey.submitText;
                str = feedSurvey.id;
            } else {
                str = null;
            }
            c20284114YlLJIJI.LJIJJLI(viewStub, context, enumC19410610wq, str2, c20280714Xd, str, (Option) this.l3, this.i5, (Question) this.l4, c20280714Xd.LL, c20280714Xd.LLILLL, false, null);
        }
    }

    public final void LIZ$4() {
        String str;
        C786410Ut5.LJLLLLLL(4, (View) this.l0);
        C20284114Yl c20284114YlLJIL = ((C14XZ) this.l1).LJIL();
        if (c20284114YlLJIL != null) {
            ViewStub viewStub = (ViewStub) this.l2;
            C14XZ c14xz = (C14XZ) this.l1;
            Context context = c14xz.LLJI;
            EnumC19410610wq enumC19410610wq = c14xz.LLJLILLLLZIIL;
            FeedSurvey feedSurvey = c14xz.LLILLJJLI;
            String str2 = null;
            if (feedSurvey != null) {
                str2 = feedSurvey.submitText;
                str = feedSurvey.id;
            } else {
                str = null;
            }
            c20284114YlLJIL.LJIJJLI(viewStub, context, enumC19410610wq, str2, c14xz, str, (Option) this.l3, this.i5, (Question) this.l4, c14xz.LL, c14xz.LLILLL, false, c14xz.LLJJL);
        }
    }

    public static final void run$0(ARunnableS0S0501000_30 aRunnableS0S0501000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSurveyViewHelper@d253.handleSecondaryOptionClick$1$1$1$1$1");
        try {
            aRunnableS0S0501000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSurveyViewHelper@d253.handleSecondaryOptionClick$1$1$1$1$1");
    }

    public static final void run$1(ARunnableS0S0501000_30 aRunnableS0S0501000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSurveyViewHelper@d253.handleSecondaryOptionClick$2$1$1$1$1");
        try {
            aRunnableS0S0501000_30.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSurveyViewHelper@d253.handleSecondaryOptionClick$2$1$1$1$1");
    }

    public static final void run$2(ARunnableS0S0501000_30 aRunnableS0S0501000_30) {
        boolean zLIZ;
        C1C7U.LIZ("ForceVideoViewHelper@777.handleSecondaryOptionClick$1");
        try {
            aRunnableS0S0501000_30.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ForceVideoViewHelper@777.handleSecondaryOptionClick$1");
    }

    public static final void run$3(ARunnableS0S0501000_30 aRunnableS0S0501000_30) {
        boolean zLIZ;
        C1C7U.LIZ("CardSurveyViewHelper@5308.handleSecondaryOptionClick$1$1$1$1$1");
        try {
            aRunnableS0S0501000_30.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CardSurveyViewHelper@5308.handleSecondaryOptionClick$1$1$1$1$1");
    }

    public static final void run$4(ARunnableS0S0501000_30 aRunnableS0S0501000_30) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundSurveyViewHelper@7190.handleSecondaryOptionClick$1");
        try {
            aRunnableS0S0501000_30.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundSurveyViewHelper@7190.handleSecondaryOptionClick$1");
    }

    public ARunnableS0S0501000_30(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.i5 = i;
        this.l4 = obj5;
    }
}
