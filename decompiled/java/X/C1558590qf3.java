package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558590qf3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC713360RyY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558590qf3(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, InterfaceC713360RyY interfaceC713360RyY) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = interfaceC713360RyY;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C1555650qaJ c1555650qaJ = new C1555650qaJ(this.LLILZIL, "vscopeble", false);
                boolean z = this.LLILZ;
                c1555650qaJ.LIZ = j;
                c1555650qaJ.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c1555650qaJ);
            }
        }
        return Unit.LIZ;
    }
}
