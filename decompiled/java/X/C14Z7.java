package X;

import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;

/* JADX INFO: renamed from: X.14Z7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public final class C14Z7 {
    public static Option[] LIZLLL;
    public static boolean LJFF;
    public static final C14Z7 LIZ = new C14Z7();
    public static String LIZIZ = "";
    public static int LIZJ = -1;
    public static String LJ = "";
    public static final BPEAHandler LJI = new BPEAHandler();
    public static C14Z0 LJII = C14Z0.FEED_TYPE;
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C14Z8());

    public static final boolean LIZ(Aweme aweme) {
        if (C14ZW.LIZLLL(aweme) == C14Z5.BACKGROUND.getType()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        if (iLIZLLL != C14Z5.FORCE_VIDEO.getType() && iLIZLLL != C14Z5.FORCE_VIDEO_NO_COVER.getType() && iLIZLLL != C14Z5.FORCE_VIDEO_LYNX.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme, boolean z) {
        if (aweme == null || !C1386360mBG.LJII(false)) {
            return false;
        }
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        aweme.getRequestId();
        C14Z0 c14z0LIZ = C14Z4.LIZ(aweme);
        LJII = c14z0LIZ;
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        if (feedSurveyLJ == null || C20286514Zj.LJ(feedSurveyLJ) || C692060RCq.LIZ(aweme)) {
            return false;
        }
        if (!AwemeExtKt.isWithSurvey(aweme)) {
            LIZ.getClass();
            ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) LJIIIIZZ.getValue();
            if (iSurveyDebuggerService != null) {
                iSurveyDebuggerService.isOpen();
            }
            return false;
        }
        if (c14z0LIZ == C14Z0.LIVE_TYPE && C14ZW.LIZLLL(aweme) == C14Z5.GREY_CARD.getType()) {
            return false;
        }
        C20291514aX.LIZ.getClass();
        if (C20291514aX.LIZIZ(aweme) && C20291514aX.LIZJ(aweme, LIZ(aweme))) {
            return false;
        }
        C20291314aV.LIZ.getClass();
        if (C20291314aV.LJII(aid)) {
            return false;
        }
        LIZ.getClass();
        Question[] questionArr = feedSurveyLJ.questions;
        if (questionArr != null) {
            LIZJ = questionArr[0].type;
        }
        LIZIZ = authorUid;
        if (!C20291314aV.LJIIIIZZ(aweme)) {
            return true;
        }
        if (z) {
            LJ(EnumC20283814Yi.INTERVAL.getType(), aweme);
        }
        return false;
    }

    public static void LJ(int i, Aweme aweme) {
        if (i != EnumC20283814Yi.SUBMIT.getType() && i != EnumC20283814Yi.SECONDARY_SUBMIT.getType()) {
            LIZLLL = null;
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZ(i, aweme);
        } else {
            C20287114Zp c20287114Zp = C20287114Zp.LIZ;
            Option[] optionArr = LIZLLL;
            c20287114Zp.getClass();
            C20287114Zp.LIZJ(i, aweme, optionArr);
        }
    }

    public static final boolean LJI(Context context, C0SZ8 c0sz8) {
        boolean z = false;
        if (LIZJ != C14ZA.SINGLE_CHOICE.getType()) {
            return false;
        }
        Aweme aweme = c0sz8.getAweme();
        C14ZW.LIZ.getClass();
        C14ZW.LJ(aweme);
        C14Z7 c14z7 = LIZ;
        Aweme aweme2 = c0sz8.getAweme();
        c14z7.getClass();
        int iLIZLLL = C14ZW.LIZLLL(aweme2);
        if (iLIZLLL != C14Z5.DIALOG.getType() && iLIZLLL != C14Z5.NOT_USE.getType()) {
            if (iLIZLLL == C14Z5.GREY_CARD.getType()) {
                if (LJII != C14Z0.PHOTO_TYPE) {
                    return false;
                }
                if (!c0sz8.LLIIZ()) {
                    c0sz8.ev();
                }
                return true;
            }
            if (iLIZLLL != C14Z5.FORCE_VIDEO.getType()) {
                C14Z5.FORCE_VIDEO_NO_COVER.getType();
            }
            return false;
        }
        if (LJII == C14Z0.PHOTO_TYPE && !c0sz8.LLIIZ()) {
            try {
                C20286714Zl c20286714Zl = C20286714Zl.LLJI;
                c20286714Zl.LJII(c0sz8.getAweme());
                c20286714Zl.LJIJI(context);
                z = true;
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z;
    }

    public static void LIZLLL(Aweme aweme, String str, String str2) {
        String str3;
        C14Z0 c14z0LIZ = C14Z4.LIZ(aweme);
        C14ZT c14zt = C14ZT.LIZ;
        C14ZW.LIZ.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        if (feedSurveyLJ != null) {
            str3 = feedSurveyLJ.id;
        } else {
            str3 = null;
        }
        C14ZT.LJIIIIZZ(c14zt, aweme, c14z0LIZ, str, str3, str2, null, null, 224);
    }

    public static void LJFF(int i, Aweme aweme, Option[] optionArr) {
        LIZLLL = optionArr;
        if (i != EnumC20283814Yi.SUBMIT.getType() && i != EnumC20283814Yi.SECONDARY_SUBMIT.getType()) {
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZ(i, aweme);
        } else {
            C20287114Zp.LIZ.getClass();
            C20287114Zp.LIZJ(i, aweme, optionArr);
        }
    }
}
