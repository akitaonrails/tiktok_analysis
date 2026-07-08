package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365600EVa {
    public final long LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public Function1<? super Integer, Unit> LIZLLL;
    public AnonymousClass0956 LJ;

    public /* synthetic */ C365600EVa() {
        this(50L, 90);
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = null;
        this.LIZJ = 0;
        this.LIZLLL = null;
    }

    public C365600EVa(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }

    public final void LIZ(Function1 function1, InterfaceC497601wk interfaceC497601wk) {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        this.LIZLLL = function1;
        this.LIZJ = 0;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C365610EVb(this, null), 2);
    }
}
