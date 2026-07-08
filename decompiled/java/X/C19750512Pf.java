package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750512Pf {
    public final List<InterfaceC19750712Ph> LIZ = new ArrayList();

    public static void LIZ(C19750412Pe c19750412Pe) {
        c19750412Pe.LIZIZ.decrementAndGet();
        if (c19750412Pe.LIZIZ.get() == 0) {
            Function0<Unit> function0 = c19750412Pe.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
            c19750412Pe.LIZJ = null;
            ((ArrayList) c19750412Pe.LIZLLL).clear();
            C1397510mTF c1397510mTF = c19750412Pe.LJ;
            if (c1397510mTF != null) {
                c1397510mTF.LIZIZ(null);
            }
            c19750412Pe.LJ = null;
        }
    }

    public final void LIZIZ(InterfaceC19750712Ph interfaceC19750712Ph) {
        if (!((ArrayList) this.LIZ).contains(interfaceC19750712Ph)) {
            ((ArrayList) this.LIZ).add(interfaceC19750712Ph);
        }
    }
}
