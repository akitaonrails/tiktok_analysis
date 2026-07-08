package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683970tvH extends C09AY implements Function2<C1682900ttY, EnumC1671200tag, C1676820tjk> {
    public final /* synthetic */ InterfaceC1682270tsX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683970tvH(InterfaceC1682270tsX interfaceC1682270tsX) {
        super(2);
        this.LL = interfaceC1682270tsX;
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1676820tjk invoke(C1682900ttY c1682900ttY, EnumC1671200tag enumC1671200tag) {
        return new C1676820tjk((((long) this.LL.LIZ(0, (int) (c1682900ttY.LIZ & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
    }
}
