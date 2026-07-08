package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683940tvE extends C09AY implements Function2<C1682900ttY, EnumC1671200tag, C1676820tjk> {
    public final /* synthetic */ InterfaceC1668050tVb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683940tvE(InterfaceC1668050tVb interfaceC1668050tVb) {
        super(2);
        this.LL = interfaceC1668050tVb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1676820tjk invoke(C1682900ttY c1682900ttY, EnumC1671200tag enumC1671200tag) {
        return new C1676820tjk(this.LL.LIZ(0L, c1682900ttY.LIZ, enumC1671200tag));
    }
}
