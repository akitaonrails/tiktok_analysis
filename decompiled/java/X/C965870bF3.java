package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965870bF3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C963530bBH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965870bF3(C966020bFI c966020bFI, C963530bBH c963530bBH) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = c963530bBH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966920bGk c966920bGkLJ = this.LL.LJ();
        C1CKR c1ckr = new C1CKR("", C1282000jSw.LIZIZ(10014), null);
        final C966020bFI c966020bFI = this.LL;
        final C963530bBH c963530bBH = this.LLILLJJLI;
        c966920bGkLJ.LJLLLL(c1ckr, new InterfaceC968200bIo() { // from class: X.0bG2
            @Override // X.InterfaceC968200bIo
            public final void LIZ(C966440bFy c966440bFy) {
                c966020bFI.LJ().LIZIZ(c963530bBH.LIZ);
            }

            @Override // X.InterfaceC968200bIo
            public final void LIZJ(C967640bHu c967640bHu) {
                c966020bFI.LJ().LIZIZ(c963530bBH.LIZ);
            }
        });
        return Unit.LIZ;
    }
}
