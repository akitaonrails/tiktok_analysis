package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0YnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884720YnG {
    public final C01GW LIZ = C452501pT.LIZIZ(new C884890YnX());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C884900YnY());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C884930Ynb());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C884920Yna());

    public final Map<InterfaceC1491305sd, C879540Yeu<?>> LIZIZ() {
        return (Map) this.LIZ.getValue();
    }

    public final Map<InterfaceC1491305sd, C879540Yeu<?>> LIZJ() {
        return (Map) this.LIZIZ.getValue();
    }

    public final Set<InterfaceC1491305sd> LIZLLL() {
        return (Set) this.LIZLLL.getValue();
    }

    public final Set<InterfaceC1491305sd> LJ() {
        return (Set) this.LIZJ.getValue();
    }

    public final void LIZ() {
        LIZIZ().clear();
        LIZJ().clear();
        LJ().clear();
        LIZLLL().clear();
    }
}
