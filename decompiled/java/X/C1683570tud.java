package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683570tud extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683570tud(float f, int i, long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float fLIZIZ = C1680770tq7.LIZIZ(interfaceC1675870tiD2.LIZIZ());
        C1683550tub.LIZIZ(interfaceC1675870tiD2, 1.0f, this.LL, fLIZIZ, this.LLILLJJLI);
        C1683550tub.LIZIZ(interfaceC1675870tiD2, this.LLILLL, this.LLILZ, fLIZIZ, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
