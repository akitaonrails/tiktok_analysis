package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667240tUI extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667240tUI(long j, int i) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        float f = 2;
        C1675860tiC.LIZLLL(interfaceC1675870tiD2, this.LL, Float.intBitsToFloat((int) (interfaceC1675870tiD2.LIZIZ() >> 32)) / f, 0L, 0.0f, new C1695210uDP(interfaceC1675870tiD2.LJJJJLL(f), 0.0f, 0, 0, null, 30), 108);
        C1675860tiC.LIZIZ(interfaceC1675870tiD2, this.LL, -90.0f, 360.0f * (this.LLILLJJLI / 100.0f), true, 0L, 0L, null, 1008);
        return Unit.LIZ;
    }
}
