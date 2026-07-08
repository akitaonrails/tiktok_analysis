package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20007013Pw {
    public static String LIZ(String str, String str2) {
        InterfaceC20008113Qh interfaceC20008113Qh;
        if (!C13Q5.LIZJ()) {
            return "asset://not_initialized";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strRealFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, str, str2);
        if (Intrinsics.LJFF(strRealFindResourceUri, "asset://not_found") && (interfaceC20008113Qh = C13Q5.LIZ().LJI) != null) {
            strRealFindResourceUri = interfaceC20008113Qh.LIZ(str2);
        }
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findResourceUri name: ");
        sbLIZ.append(str2);
        sbLIZ.append(", result: ");
        sbLIZ.append(strRealFindResourceUri);
        sbLIZ.append(", time cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append(" ms");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("checkEffect", strLIZIZ);
        return strRealFindResourceUri;
    }
}
