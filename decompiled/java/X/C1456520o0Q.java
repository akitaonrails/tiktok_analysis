package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0o0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456520o0Q implements InterfaceC358220E2q {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final InterfaceC1456710o0j LIZIZ;

    public C1456520o0Q(String str, C1456540o0S c1456540o0S) {
        this.LIZ = str;
        this.LIZIZ = c1456540o0S;
    }

    @Override // X.InterfaceC358220E2q
    public final int LIZ(FilterBean filterBean, InterfaceC1453220nv6 interfaceC1453220nv6) {
        InterfaceC1456710o0j interfaceC1456710o0j = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(filterBean.getId());
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
        sbLIZ.append(filterBean.getId());
        interfaceC1456710o0j.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), filterBean.getCompareKey());
    }
}
