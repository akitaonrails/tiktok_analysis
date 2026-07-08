package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683960tvG extends C09AY implements Function2<C1682900ttY, EnumC1671200tag, C1676820tjk> {
    public final /* synthetic */ InterfaceC1666960tTq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683960tvG(InterfaceC1666960tTq interfaceC1666960tTq) {
        super(2);
        this.LL = interfaceC1666960tTq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1676820tjk invoke(C1682900ttY c1682900ttY, EnumC1671200tag enumC1671200tag) {
        long j = c1682900ttY.LIZ;
        return new C1676820tjk((((long) this.LL.LIZ(0, (int) (j >> 32), enumC1671200tag)) << 32) | (((long) 0) & 4294967295L));
    }
}
