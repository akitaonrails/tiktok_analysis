package X;

import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Rar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698670Rar {
    public static int LIZLLL;
    public static int LJ;
    public static int LJI;
    public static int LJII;
    public static final C698670Rar LIZ = new C698670Rar();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LJFF = "";

    public static void LIZJ(C2344009Gk c2344009Gk) {
        String strLJIIIZ = c2344009Gk.LJIIIZ("enter_from");
        String strLJIIIZ2 = c2344009Gk.LJIIIZ("component_key");
        if (u.LJIJI("homepage_hot", strLJIIIZ, true) && a0.LJJIIZI(strLJIIIZ2, "anchor", false)) {
            LJFF = strLJIIIZ2;
            LJI++;
        }
    }

    public static void LIZIZ(Aweme aweme, Map map) {
        String str;
        String string;
        AIGCInfo aIGCInfo;
        if (aweme != null && aweme.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap map2 = (HashMap) map;
        map2.put("is_ad", str);
        map2.put("hit_fcp", "true");
        if (aweme != null && (aIGCInfo = aweme.aigcInfo) != null) {
            string = Integer.valueOf(aIGCInfo.getAIGCLabelType()).toString();
        } else {
            string = null;
        }
        map2.put("aigc_theme_status", string);
        LJ++;
    }

    public static void LIZ(C2344009Gk c2344009Gk, Aweme aweme, String str, boolean z) {
        AIGCInfo aIGCInfo;
        int i;
        String aid;
        Integer numValueOf = null;
        if (u.LJIJI("homepage_hot", str, true)) {
            if (c2344009Gk != null) {
                if (aweme != null && aweme.isAd()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c2344009Gk.LIZJ(i, "is_ad");
                c2344009Gk.LJ(Boolean.TRUE, "hit_fcp");
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                LIZIZ = aid;
                if (z) {
                    LIZJ = c2344009Gk.LJIIIZ("anchor_type");
                    LIZLLL++;
                } else {
                    LJ++;
                }
            } else {
                return;
            }
        } else if (c2344009Gk == null) {
            return;
        }
        if (aweme != null && (aIGCInfo = aweme.aigcInfo) != null) {
            numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
        }
        c2344009Gk.LJ(numValueOf, "aigc_theme_status");
    }
}
