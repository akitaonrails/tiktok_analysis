package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS0S0001100_16;
import kotlin.jvm.internal.AwS0S3001000_16;
import kotlin.jvm.internal.AwS0S4000000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.AwS6S1000100_16;

/* JADX INFO: renamed from: X.0dLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046770dLX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Set set) {
        if (!set.contains("omsdk_impression")) {
            return "no_impression";
        }
        if (!set.contains("omsdk_start")) {
            return "no_start_after_impression";
        }
        if (set.contains("omsdk_finish")) {
            return "duplicated_finish";
        }
        boolean zContains = set.contains("omsdk_over");
        boolean zContains2 = set.contains("omsdk_break");
        if (!zContains && !zContains2) {
            boolean zContains3 = set.contains("omsdk_first_quartile");
            boolean zContains4 = set.contains("omsdk_midpoint");
            boolean zContains5 = set.contains("omsdk_third_quartile");
            if (!zContains3 || !zContains4 || !zContains5) {
                return "incomplete_quartiles";
            }
            return "no_over_after_start";
        }
        if (!zContains) {
            return "healthy";
        }
        boolean zContains6 = set.contains("omsdk_first_quartile");
        boolean zContains7 = set.contains("omsdk_midpoint");
        boolean zContains8 = set.contains("omsdk_third_quartile");
        if (!zContains6 || !zContains7 || !zContains8) {
            return "incomplete_quartiles";
        }
        return "healthy";
    }

    public static String LIZIZ(Set set) {
        List listLJIIJJI = C1697810uHb.LJIIJJI("omsdk_impression", "omsdk_start", "omsdk_first_quartile", "omsdk_midpoint", "omsdk_third_quartile", "omsdk_over");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (!set.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static String LIZJ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -906336856) {
            if (iHashCode != 3138974) {
                if (iHashCode == 1162944307 && str.equals("reward_ad")) {
                    return "android_new_reward";
                }
                return "android_new_others";
            }
            if (str.equals("feed")) {
                return "android_new_feed";
            }
            return "android_new_others";
        }
        if (str.equals("search")) {
            return "android_new_search";
        }
        return "android_new_others";
    }

    public static void LIZLLL(C588660N6y c588660N6y, AwemeRawAd awemeRawAd) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1047440dMc.LIZ, awemeRawAd, new AwS67S1000000_16(5));
    }

    public static void LJFF(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, int i) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1047520dMk.LIZ, awemeRawAd, new AwS30S0001000_16(i, 0));
    }

    public static void LJIIIIZZ(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, String str, long j) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1047580dMq.LIZ, awemeRawAd, new AwS6S1000100_16(str, j, 0));
    }

    public static void LJIIIZ(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, String str, int i) {
        C1023960ckk c1023960ckk;
        if (!C294490BgV.LIZ()) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -645913717) {
            if (iHashCode != -46125259) {
                if (iHashCode == 1243847262 && str.equals("omsdk_third_quartile")) {
                    c1023960ckk = C2275881E6g.LIZ;
                } else {
                    return;
                }
            } else if (str.equals("omsdk_first_quartile")) {
                c1023960ckk = C1047470dMf.LIZ;
            } else {
                return;
            }
        } else if (str.equals("omsdk_midpoint")) {
            c1023960ckk = C2275861E6e.LIZ;
        } else {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(c1023960ckk, awemeRawAd, new AwS30S0001000_16(i, 1));
    }

    public static void LJIIJ(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, long j, int i) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1046850dLf.LIZ, awemeRawAd, new AwS0S0001100_16(j, i, 0));
    }

    public static void LJ(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1046790dLZ.LIZ, awemeRawAd, new AwS0S4000000_16(str, str2, str3, str4, 1));
    }

    public static void LJI(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, String str, long j, String str2, String str3) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1046820dLc.LIZ, awemeRawAd, new C1046780dLY(str, j, str2, str3));
    }

    public static void LJII(C588660N6y c588660N6y, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i) {
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1046990dLt.LIZ, awemeRawAd, new AwS0S3001000_16(str, str2, str3, i, 0));
    }
}
