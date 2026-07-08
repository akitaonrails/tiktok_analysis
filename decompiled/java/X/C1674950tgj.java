package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674950tgj extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C05P1<Float> LLILZ;
    public final /* synthetic */ C05P1<Float> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674950tgj(float f, float f2, long j, C05P1<Float> c05p1, C05P1<Float> c05p12) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = j;
        this.LLILZ = c05p1;
        this.LLILZIL = c05p12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        C1675860tiC.LIZLLL(interfaceC1675870tiD, this.LLILLL, this.LL - (this.LLILLJJLI / 2), (((long) Float.floatToRawIntBits(this.LLILZ.getValue().floatValue())) << 32) | (((long) Float.floatToRawIntBits(this.LLILZIL.getValue().floatValue())) & 4294967295L), 0.0f, new C1695210uDP(this.LLILLJJLI, 0.0f, 0, 0, null, 30), 104);
        return Unit.LIZ;
    }
}
