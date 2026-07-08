package X;

import android.text.TextUtils;
import oo5.b;

/* JADX INFO: renamed from: X.0uxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723970uxn extends AbstractC1724310uyL {
    @Override // X.AbstractC1724310uyL
    public final String LJI() {
        return "pipo.updateNonce";
    }

    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
    public final EnumC1063570dmd getAccess() {
        return EnumC1063570dmd.PUBLIC;
    }

    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
    public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
        super.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, enumC1059790dgX);
        String strLJ = C1723950uxl.LJ(interfaceC1107590evd, "nonce");
        if (TextUtils.isEmpty(strLJ)) {
            C1723950uxl.LIZIZ("pipo.updateNonce", 0, 101, "nonce is empty!", interfaceC1063920dnC);
            return;
        }
        C1724150uy5.LJIIL.LIZJ().getClass();
        b.LJIJJLI.getClass();
        b.LJ = strLJ;
        C1723950uxl.LIZIZ("pipo.updateNonce", 1, 1, "success", interfaceC1063920dnC);
    }
}
