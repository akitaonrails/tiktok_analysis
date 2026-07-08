package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14Zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20286514Zj {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LIZ(Option[] optionArr) {
        String strLJJJ;
        Option option;
        Question[] questionArr;
        Question question;
        Option[] optionArr2;
        if (optionArr != null && (option = optionArr[0]) != null && (questionArr = option.questions) != null && (question = questionArr[0]) != null && (optionArr2 = question.options) != null) {
            strLJJJ = C13LQ.LJJJ(optionArr2, ",", null, null, AFwS274S0000000_30.get$arr$(337), 30);
        } else {
            strLJJJ = null;
        }
        return String.valueOf(strLJJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.Aweme LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20286514Zj.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public static final String LIZJ(String str) {
        if (str != null) {
            try {
                if (!u.LJIIZILJ(str, "_sub", false)) {
                    return str;
                }
                return (String) a0.LJJLIIIJILLIZJL(str, new String[]{"_sub"}, 0, 6).get(0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    public static boolean LIZLLL(Question question) {
        Option[] optionArr;
        if (question == null || (optionArr = question.options) == null) {
            return false;
        }
        for (Option option : optionArr) {
            if (C19411210ww.LIZJ(option)) {
                if (option == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(FeedSurvey feedSurvey) {
        Question[] questionArr;
        Question[] questionArr2;
        Question question;
        if (feedSurvey == null || (questionArr = feedSurvey.questions) == null || questionArr.length <= 0 || feedSurvey == null || (questionArr2 = feedSurvey.questions) == null || (question = questionArr2[0]) == null) {
            return false;
        }
        return TextUtils.isEmpty(question.title);
    }

    public static final boolean LJFF(Aweme aweme) {
        if (aweme != null) {
            return AwemeBizExtKt.isSubAweme(aweme);
        }
        return false;
    }
}
