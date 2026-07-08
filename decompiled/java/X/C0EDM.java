package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EDM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDM extends C09AY implements Function2<C0EDV, Boolean, Unit> {
    public final /* synthetic */ C0EDF LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EDM(C0EDF c0edf, long j, boolean z) {
        super(2);
        this.LL = c0edf;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0EDV c0edv, Boolean bool) {
        C0EDV c0edv2 = c0edv;
        boolean zBooleanValue = bool.booleanValue();
        C0EDT c0edt = this.LL.LLJIJIL;
        if (c0edt != null) {
            c0edt.LIZIZ(false, System.currentTimeMillis() - this.LLILLJJLI, zBooleanValue, c0edv2.LIZ, Integer.valueOf(c0edv2.LIZIZ), false);
        }
        this.LL.LJ();
        this.LL.LJIILIIL();
        C0EDS c0eds = this.LL.LLJ;
        if (c0eds != null) {
            c0eds.LIZIZ(false, this.LLILLL);
            return Unit.LIZ;
        }
        return null;
    }
}
