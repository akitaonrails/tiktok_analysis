package X;

import com.ss.android.ugc.aweme.feed.model.FcpSlotConfig;
import java.util.List;

/* JADX INFO: renamed from: X.02qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C715202qk {
    public static String LIZ(FcpSlotConfig fcpSlotConfig, String str) {
        String string;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String[] strArr = new String[7];
        strArr[0] = str;
        String str2 = fcpSlotConfig.slotId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        Long l = fcpSlotConfig.delayMS;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        strArr[2] = string;
        List<String> list = fcpSlotConfig.timingKeys;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, "\u0001", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        strArr[3] = strLJJLIIIJ;
        List<String> list2 = fcpSlotConfig.whitelistComponentKeys;
        if (list2 == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, "\u0001", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ2 = "";
        }
        strArr[4] = strLJJLIIIJ2;
        List<String> list3 = fcpSlotConfig.blacklistComponentKeys;
        if (list3 != null && (strLJJLIIIJ3 = C13LP.LJJLIIIJ(list3, "\u0001", null, null, 0, null, null, 62)) != null) {
            str3 = strLJJLIIIJ3;
        }
        strArr[5] = str3;
        strArr[6] = String.valueOf(fcpSlotConfig.enableOneWayLifecycle);
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "\u0002", null, null, 0, null, null, 62);
    }
}
