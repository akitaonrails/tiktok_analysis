package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812710xGv extends C09AY implements Function1<C1812670xGr, C1812670xGr> {
    public final /* synthetic */ C259800zU<AbstractC1812590xGj> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812710xGv(C259800zU<AbstractC1812590xGj> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1812670xGr invoke(C1812670xGr c1812670xGr) {
        AbstractC1812590xGj abstractC1812590xGj = this.LL.element;
        EnumC1812620xGm enumC1812620xGm = EnumC1812620xGm.SUCCESS;
        c1812670xGr.getClass();
        return new C1812670xGr(abstractC1812590xGj, enumC1812620xGm);
    }
}
