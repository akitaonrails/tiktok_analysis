package X;

import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1D6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250441D6k {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(666));

    public static boolean LIZ(float f) {
        ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) LIZIZ.getValue();
        if (iSurveyDebuggerService != null) {
            iSurveyDebuggerService.isOpen();
        }
        if (C19994513Lb.LIZ(1).nextFloat() < f) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        float f;
        if (aweme == null) {
            return false;
        }
        ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) LIZIZ.getValue();
        if (iSurveyDebuggerService != null) {
            iSurveyDebuggerService.isOpen();
        }
        if (LIZ) {
            C1361840lXi.LIZ.getClass();
            C1361840lXi.LIZ("shouldShow return because we have show survey in this vv");
            return false;
        }
        if (C2250521D6s.LIZIZ()) {
            C1361840lXi.LIZ.getClass();
            C1361840lXi.LIZ("shouldShow return because we hit frequency");
            return false;
        }
        if (C20286614Zk.LIZLLL(aweme, true)) {
            C1361840lXi.LIZ.getClass();
            C1361840lXi.LIZ("shouldShow return because feed survey has showed");
            return false;
        }
        CommentSurveyDataItem commentSurveyDataItemLIZIZ = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ != null) {
            f = commentSurveyDataItemLIZIZ.displayRatio;
        } else {
            f = 0.0f;
        }
        boolean zLIZ = LIZ(f);
        C1361840lXi c1361840lXi = C1361840lXi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShow randomResult=");
        sbLIZ.append(zLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1361840lXi.getClass();
        C1361840lXi.LIZ(strLIZIZ);
        return zLIZ;
    }
}
