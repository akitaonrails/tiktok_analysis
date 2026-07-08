package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase;

/* JADX INFO: renamed from: X.0yb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863690yb9 {
    public static String LIZ(long j, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        if (j == 1) {
            Keva keva = MessageDatabase.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cid");
            sbLIZ.append(str);
            sbLIZ.append("bid");
            sbLIZ.append(j);
            String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (string.length() == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cid");
                sbLIZ2.append(str);
                return keva.getString(C2188811AlT.LIZIZ(sbLIZ2), "");
            }
            return string;
        }
        Keva keva2 = MessageDatabase.LL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cid");
        sbLIZ3.append(str);
        sbLIZ3.append("bid");
        sbLIZ3.append(j);
        return keva2.getString(C2188811AlT.LIZIZ(sbLIZ3), "");
    }

    public static void LIZIZ(long j, String str, String str2) {
        Keva keva = MessageDatabase.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cid");
        sbLIZ.append(str);
        sbLIZ.append("bid");
        sbLIZ.append(j);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
    }
}
