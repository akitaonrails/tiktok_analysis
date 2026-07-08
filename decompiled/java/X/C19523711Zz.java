package X;

import java.util.List;

/* JADX INFO: renamed from: X.11Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19523711Zz extends AbstractC19526011aM implements InterfaceC19523811a0 {
    public final String LJIIIZ;
    public volatile boolean LJIIJ = true;

    @Override // X.AbstractC19526011aM, X.InterfaceC19524311a5
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        return false;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("END_");
        sbLIZ.append(this.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19523711Zz(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.AbstractC19526011aM
    public final Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        if (this.LJIIJ) {
            return "_GROUP_TOTAL_END";
        }
        C19529611aw.LIZ();
        return LJIILLIIL();
    }
}
