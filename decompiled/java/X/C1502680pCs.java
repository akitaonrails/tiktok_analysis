package X;

import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS4S0320000_23;

/* JADX INFO: renamed from: X.0pCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502680pCs implements InterfaceC2270081DtG {
    public final C13BV LIZ = C13BV.INSTANCE;
    public final List<C1502660pCq> LIZIZ = Collections.singletonList(new C1502660pCq());

    @Override // X.InterfaceC2270081DtG
    public final C1502660pCq LIZLLL() {
        return new C1502660pCq();
    }

    @Override // X.InterfaceC2270081DtG
    public final void LJ() {
        StarshipSolariaProfile.LJII().LIZIZ(new InterfaceC1103750epR() { // from class: X.0onZ
            @Override // X.InterfaceC1103750epR
            public final void LIZ() {
                C1502680pCs c1502680pCs = this.LIZ;
                c1502680pCs.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1502610pCl(c1502680pCs, null), 3);
            }
        });
    }

    @Override // X.InterfaceC2270081DtG
    public final C1502670pCr LIZ(String str) {
        return new C1502670pCr(str);
    }

    @Override // X.InterfaceC2270081DtG
    public final C1502730pCx LIZIZ(InterfaceC1502770pD1 interfaceC1502770pD1, Comparable comparable, Comparable comparable2) {
        AwS4S0320000_23 awS4S0320000_23 = new AwS4S0320000_23(interfaceC1502770pD1, comparable, comparable2, 0);
        C1502720pCw c1502720pCw = new C1502720pCw();
        awS4S0320000_23.invoke(c1502720pCw);
        return new C1502730pCx(c1502720pCw);
    }

    @Override // X.InterfaceC2270081DtG
    public final C1502710pCv LIZJ(InterfaceC1502770pD1 interfaceC1502770pD1, Comparable comparable, Comparable comparable2) {
        return C1502690pCt.LIZ(new AwS4S0320000_23(interfaceC1502770pD1, comparable, comparable2, 2));
    }
}
