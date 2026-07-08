package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0uIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698650uIx {
    public static C1698490uIh LIZIZ(C1698490uIh c1698490uIh, String str) {
        if (c1698490uIh == null) {
            return null;
        }
        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
        c1698490uIh.LLILLIZIL = (int) c1476650oWt.LIZLLL(str, 1141);
        c1698490uIh.LLJ = (int) c1476650oWt.LIZLLL(str, 1105);
        c1698490uIh.LLJJIJIIJIL = (int) c1476650oWt.LIZLLL(str, 1139);
        c1698490uIh.LJLLLLLL = (int) c1476650oWt.LIZLLL(str, 1186);
        c1698490uIh.LLJJIJIL = (int) c1476650oWt.LIZLLL(str, 1180);
        c1698490uIh.LLJJJ = (int) c1476650oWt.LIZLLL(str, 1181);
        c1698490uIh.LLJJJIL = (int) c1476650oWt.LIZLLL(str, 1182);
        c1698490uIh.LLJJJJ = (int) c1476650oWt.LIZLLL(str, 1183);
        c1698490uIh.LLIZ = (int) c1476650oWt.LIZLLL(str, 1107);
        c1698490uIh.LLIZLLLIL = (int) c1476650oWt.LIZLLL(str, 1106);
        c1698490uIh.LLILII = (int) c1476650oWt.LIZLLL(str, 1111);
        c1698490uIh.LLILLL = (int) c1476650oWt.LIZLLL(str, 1188);
        c1698490uIh.LLILZ = (int) c1476650oWt.LIZLLL(str, 1189);
        c1476650oWt.LIZLLL(str, 1116);
        c1476650oWt.LIZLLL(str, 1117);
        c1476650oWt.LIZLLL(str, 1118);
        c1476650oWt.LIZLLL(str, 1119);
        c1698490uIh.LLIIZ = LIZ(1110, str, c1698490uIh.LLIIZ);
        c1698490uIh.LLJILJILJ = LIZ(1138, str, c1698490uIh.LLJILJILJ);
        c1698490uIh.LLILIL = LIZ(1140, str, c1698490uIh.LLILIL);
        c1698490uIh.LLIL = LIZ(1112, str, c1698490uIh.LLIL);
        c1698490uIh.LLJLL = LIZ(1120, str, c1698490uIh.LLJLL);
        c1698490uIh.LLJLLIL = LIZ(1121, str, c1698490uIh.LLJLLIL);
        c1698490uIh.LLJLLL = LIZ(1122, str, c1698490uIh.LLJLLL);
        c1698490uIh.LLJJJJJIL = LIZ(1190, str, c1698490uIh.LLJJJJJIL);
        c1698490uIh.LLJJJJLIIL = LIZ(1194, str, c1698490uIh.LLJJJJLIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveio tt_quic_sdk_version: ");
        sbLIZ.append(c1698490uIh.LLIIZ);
        sbLIZ.append(", quic_connection_id: ");
        sbLIZ.append(c1698490uIh.LLJILJILJ);
        sbLIZ.append(", h2NegotiateProtocol: ");
        sbLIZ.append(c1698490uIh.LLILIL);
        sbLIZ.append(", h2RaceResult: ");
        sbLIZ.append(c1698490uIh.LLILLIZIL);
        sbLIZ.append(", h2Reused: ");
        sbLIZ.append(c1698490uIh.LLJJIJIIJIL);
        sbLIZ.append(", quicOpenResult: ");
        sbLIZ.append(c1698490uIh.LLJ);
        sbLIZ.append(", quicConfigCached: ");
        sbLIZ.append(c1698490uIh.LLIZ);
        sbLIZ.append(", quicCHLOCount:");
        sbLIZ.append(c1698490uIh.LLIZLLLIL);
        sbLIZ.append(", rej count: ");
        sbLIZ.append(c1698490uIh.LLILII);
        sbLIZ.append(", quicRejReasons: ");
        sbLIZ.append(c1698490uIh.LLIL);
        sbLIZ.append(", quicConnCost: ");
        sbLIZ.append(c1698490uIh.LLILLL);
        sbLIZ.append(", quicErrorCode: ");
        sbLIZ.append(c1698490uIh.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        return c1698490uIh;
    }

    public static String LIZ(int i, String str, String str2) {
        String strLJ = C1476660oWu.LIZ.LJ(str, i);
        if (!TextUtils.isEmpty(strLJ)) {
            return strLJ;
        }
        return str2;
    }
}
