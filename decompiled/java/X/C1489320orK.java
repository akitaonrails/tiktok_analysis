package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0orK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489320orK {
    public static final /* synthetic */ int LIZJ = 0;
    public final C1489330orL LIZ;
    public final C11SU<EnumC1489220orA> LIZIZ = C11SU.LJLLLLLL();

    public C1489320orK(C1489330orL c1489330orL) {
        this.LIZ = c1489330orL;
    }

    public final void LIZ(String str) {
        if (str.length() == 0) {
            this.LIZIZ.onNext(EnumC1489230orB.UNKNOWN.getPasswordComplexity());
            return;
        }
        EnumC1489230orB enumC1489230orBLIZ = EnumC1489230orB.MEDIUM;
        Iterator it2 = ((ArrayList) this.LIZ.LIZIZ).iterator();
        while (it2.hasNext()) {
            enumC1489230orBLIZ = ((InterfaceC1489340orM) it2.next()).LIZ(str, enumC1489230orBLIZ);
            if (enumC1489230orBLIZ == EnumC1489230orB.INSTANT_WEAK) {
                this.LIZIZ.onNext(enumC1489230orBLIZ.getPasswordComplexity());
                return;
            }
        }
        this.LIZIZ.onNext(enumC1489230orBLIZ.getPasswordComplexity());
    }
}
