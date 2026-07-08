package X;

import Y.ARunnableS129S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12PL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C12PJ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12PL(boolean z, C12PJ c12pj, boolean z2, boolean z3) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c12pj;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C12PK c12pkP4 = this.LLILLJJLI.P4();
            final boolean z = this.LLILLL;
            final C12PJ c12pj = this.LLILLJJLI;
            final boolean z2 = this.LLILZ;
            c12pkP4.Di(new InterfaceC352140DrI() { // from class: X.12PM
                @Override // X.InterfaceC352140DrI
                public final void LIZ() {
                }

                @Override // X.InterfaceC352140DrI
                public final void LIZIZ() {
                    if (z) {
                        c12pj.T4().LLJJJJJIL(AFwS218S0000000_29.get$arr$(154));
                    }
                    if (z2) {
                        c12pj.Z4().x42();
                    }
                    C2487409ou.LIZJ(new ARunnableS129S0100000_29(c12pj, 63));
                }
            });
        } else {
            if (this.LLILLL) {
                this.LLILLJJLI.T4().LLJJJJJIL(AFwS218S0000000_29.get$arr$(155));
            }
            if (this.LLILZ) {
                this.LLILLJJLI.Z4().x42();
            }
            this.LLILLJJLI.H4();
        }
        return Unit.LIZ;
    }
}
