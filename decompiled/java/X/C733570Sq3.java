package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBubbleInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Sq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733570Sq3 {
    public static final C733570Sq3 LIZ = new C733570Sq3();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("promote_guide_shown_history_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        long j = C1238740iLA.LIZIZ().LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        return j != 0 && System.currentTimeMillis() - j <= 86400000;
    }

    public static C2344009Gk LIZ(Aweme aweme) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        if (aweme.getAwemeType() == 150) {
            str = "photo";
        } else {
            str = "video";
        }
        c2344009Gk.LJIIIIZZ("content_type", str);
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) ? 1 : 0, "is_self");
        try {
            AwemeBubbleInfo bubbleInfo = aweme.getBubbleInfo();
            if (bubbleInfo != null && (str2 = bubbleInfo.logExtra) != null) {
                for (Map.Entry entry : ((HashMap) C117800ca.LIZIZ(new JSONObject(str2))).entrySet()) {
                    c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c2344009Gk;
    }
}
