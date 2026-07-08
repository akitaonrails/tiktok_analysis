package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;

/* JADX INFO: renamed from: X.0q1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534270q1p {
    public static long LIZJ(C1533490q0Z c1533490q0Z, String str, C1533570q0h c1533570q0h) {
        if (c1533490q0Z.LJIIJJI) {
            Long lLJIIIZ = C1550600qSA.LJIIIZ(c1533570q0h.LIZ, str, true, false);
            if (lLJIIIZ == null) {
                return 0L;
            }
            return lLJIIIZ.longValue();
        }
        Long lLJIIIZ2 = C1550600qSA.LJIIIZ(c1533570q0h.LIZ, str, true, true);
        if (lLJIIIZ2 == null) {
            return 0L;
        }
        return lLJIIIZ2.longValue();
    }

    public static C0VSJ LIZIZ(Forest forest, String str, String str2, C1533790q13 c1533790q13, C1533570q0h c1533570q0h) {
        String str3 = c1533790q13.LIZ.LJJJJLI.LIZ;
        String geckoResourcePath = forest.getGeckoXAdapter().getGeckoResourcePath(c1533790q13, str3, str, str2);
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("using gecko info [accessKey=");
        sbLIZ.append(str3);
        sbLIZ.append(",filePath=");
        sbLIZ.append(geckoResourcePath);
        sbLIZ.append(']');
        C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ));
        if (geckoResourcePath != null && geckoResourcePath.length() != 0) {
            return new C0VSJ(geckoResourcePath);
        }
        return null;
    }

    public static void LIZ(boolean z, String str, C1533490q0Z c1533490q0Z, final boolean z2, final String str2, boolean z3) {
        boolean z4;
        boolean z5 = z3;
        if (!z && !C1551910qUH.LIZLLL(c1533490q0Z.LJJJJLI.LIZ, str)) {
            z4 = false;
        } else {
            z4 = true;
            if (!z) {
            }
            GeckoXAdapter.Companion.checkUpdate(c1533490q0Z.LJJJJJ, z4, str, c1533490q0Z, new InterfaceC1533390q0P() { // from class: X.0q27
                @Override // X.InterfaceC1533390q0P
                public final void LIZ(String str3, Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("download failed with waitGeckoUpdate=");
                    sbLIZ.append(z2);
                    sbLIZ.append(" ,channel = ");
                    sbLIZ.append(str3);
                    sbLIZ.append(",bundle = ");
                    sbLIZ.append(str2);
                    C1534250q1n.LIZIZ("GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ), th);
                }

                @Override // X.InterfaceC1533390q0P
                public final void LIZIZ(Long l, String str3) {
                    C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateSuccess with waitGeckoUpdate=");
                    sbLIZ.append(z2);
                    sbLIZ.append(" , channel=");
                    sbLIZ.append(str3);
                    sbLIZ.append(",bundle=");
                    sbLIZ.append(str2);
                    C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, z5, false);
        }
        z5 = false;
        GeckoXAdapter.Companion.checkUpdate(c1533490q0Z.LJJJJJ, z4, str, c1533490q0Z, new InterfaceC1533390q0P() { // from class: X.0q27
            @Override // X.InterfaceC1533390q0P
            public final void LIZ(String str3, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download failed with waitGeckoUpdate=");
                sbLIZ.append(z2);
                sbLIZ.append(" ,channel = ");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle = ");
                sbLIZ.append(str2);
                C1534250q1n.LIZIZ("GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ), th);
            }

            @Override // X.InterfaceC1533390q0P
            public final void LIZIZ(Long l, String str3) {
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUpdateSuccess with waitGeckoUpdate=");
                sbLIZ.append(z2);
                sbLIZ.append(" , channel=");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle=");
                sbLIZ.append(str2);
                C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ));
            }
        }, z5, false);
    }
}
