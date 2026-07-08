package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0trP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681570trP extends C09AY implements Function1<InterfaceC1690500u5o, C1676820tjk> {
    public final /* synthetic */ Function0<Float> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681570trP(Function0<Float> function0) {
        super(1);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1676820tjk invoke(InterfaceC1690500u5o interfaceC1690500u5o) {
        InterfaceC1690500u5o interfaceC1690500u5o2 = interfaceC1690500u5o;
        int iLJLLJ = interfaceC1690500u5o2.LJLLJ(C1681540trM.LJJIIJZLJL / 2);
        float f = C1681540trM.LJI;
        return new C1676820tjk((((long) iLJLLJ) << 32) | (((long) interfaceC1690500u5o2.LJLLJ(f + ((C1681540trM.LJJIJ - f) * this.LL.invoke().floatValue()))) & 4294967295L));
    }
}
