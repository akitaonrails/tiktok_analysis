package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0o0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456550o0T {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0o0R] */
    public static C1456530o0R LIZ(final String str) {
        final C1456540o0S c1456540o0S = new C1456540o0S("filter_intensity_resId");
        return new InterfaceC358220E2q(str, c1456540o0S) { // from class: X.0o0R
            public static final /* synthetic */ int LIZJ = 0;
            public final String LIZ;
            public final InterfaceC1456710o0j LIZIZ;

            {
                this.LIZ = str;
                this.LIZIZ = c1456540o0S;
            }

            @Override // X.InterfaceC358220E2q
            public final int LIZ(FilterBean filterBean, InterfaceC1453220nv6 interfaceC1453220nv6) {
                InterfaceC1456710o0j interfaceC1456710o0j = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append('-');
                sbLIZ.append(filterBean.getResId());
                int iLIZJ = interfaceC1456710o0j.LIZJ(C2188811AlT.LIZIZ(sbLIZ), filterBean.getCompareKey());
                if (iLIZJ == -1) {
                    return C1453210nv5.LIZJ(filterBean, C1453210nv5.LIZIZ(filterBean, interfaceC1453220nv6), interfaceC1453220nv6);
                }
                return iLIZJ;
            }

            @Override // X.InterfaceC358220E2q
            public final void LIZIZ(FilterBean filterBean, int i) {
                InterfaceC1456710o0j interfaceC1456710o0j = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append('-');
                sbLIZ.append(filterBean.getResId());
                interfaceC1456710o0j.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), filterBean.getCompareKey());
            }
        };
    }
}
