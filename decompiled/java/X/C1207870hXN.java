package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207870hXN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1207850hXL LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC1207030hW1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207870hXN(C1207850hXL c1207850hXL, long j, InterfaceC1207030hW1 interfaceC1207030hW1) {
        super(0);
        this.LL = c1207850hXL;
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC1207030hW1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", this.LL.LIZ.getResources().getString(2131836200), false);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        C1207520hWo c1207520hWo = this.LL.LIZIZ;
        String str3 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
            str3 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this.LL, 925);
        c1207400hWc.getClass();
        C1207400hWc.LJIILJJIL(0, jCurrentTimeMillis, str, str2, str3, awS597S0100000_18);
        InterfaceC1207030hW1 interfaceC1207030hW1 = this.LLILLL;
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(1, "cancel in open settings dialog");
        }
        return Unit.LIZ;
    }
}
