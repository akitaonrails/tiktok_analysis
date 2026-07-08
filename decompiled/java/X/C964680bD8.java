package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964680bD8 {
    public final EnumC964700bDA LIZ;
    public final long LIZIZ;
    public final InterfaceC964720bDC LIZJ;
    public final Function0<Long> LIZLLL;
    public final InterfaceC954310awP LJ;
    public final C956200azS<Boolean> LJFF;
    public AnonymousClass0956 LJI;

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            AnonymousClass0956 anonymousClass09562 = this.LJI;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            if (C964710bDB.LIZ[this.LIZ.ordinal()] != 1) {
                throw new C1954807lC();
            }
            InterfaceC954310awP interfaceC954310awP = this.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Emit timer cancel event. listener=");
            sbLIZ.append(this.LIZJ);
            interfaceC954310awP.d("Timer", C2188811AlT.LIZIZ(sbLIZ));
            this.LJFF.LIZ = Boolean.TRUE;
            this.LIZJ.LLLLLL(this.LIZIZ);
        }
        this.LJI = null;
    }

    public C964680bD8(EnumC964700bDA enumC964700bDA, long j, int i, InterfaceC964720bDC interfaceC964720bDC, Function0<Long> function0, InterfaceC954310awP interfaceC954310awP, C956200azS<Boolean> c956200azS) {
        this.LIZ = enumC964700bDA;
        this.LIZIZ = j;
        this.LIZJ = interfaceC964720bDC;
        this.LIZLLL = function0;
        this.LJ = interfaceC954310awP;
        this.LJFF = c956200azS;
    }
}
