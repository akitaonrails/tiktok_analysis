package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558580qf2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Class LLILZIL;
    public final /* synthetic */ InterfaceC494301wD LLILZLL;
    public final /* synthetic */ InterfaceC665370Q7z LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558580qf2(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, Class cls, InterfaceC494301wD interfaceC494301wD, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = cls;
        this.LLILZLL = interfaceC494301wD;
        this.LLIZ = interfaceC665370Q7z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C1555640qaI c1555640qaI = new C1555640qaI(this.LLIZ, this.LLILZIL, this.LLILZLL != null);
                boolean z = this.LLILZ;
                c1555640qaI.LIZ = j;
                c1555640qaI.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c1555640qaI);
            }
        }
        return Unit.LIZ;
    }
}
