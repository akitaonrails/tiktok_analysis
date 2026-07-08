package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.017m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2824017m {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(350));

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("published_comment_ts_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "published_comment_ts";
    }

    public static List LIZ(long j, String str) {
        List listLJJII;
        long j2 = j - 604800000;
        String string = ((Keva) LIZ.getValue()).getString(LIZIZ(str), "");
        if (string != null && string.length() != 0) {
            listLJJII = C09RB.LJJII(C09RB.LJIJI(new C1939607ik(a0.LJJLIIIJ(string, new char[]{','}, false, 0, 6)), AnonymousClass0207.get$arr$(92)));
        } else {
            listLJJII = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJII) {
            if (((Number) obj).longValue() >= j2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 5000) {
            return new ArrayList(C13LP.LLD(5000, arrayList));
        }
        return arrayList;
    }

    public static void LIZJ(String str, List list) {
        String strLIZIZ = LIZIZ(str);
        if (((ArrayList) list).isEmpty()) {
            ((Keva) LIZ.getValue()).erase(strLIZIZ);
        } else {
            ((Keva) LIZ.getValue()).storeString(strLIZIZ, C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        }
    }
}
