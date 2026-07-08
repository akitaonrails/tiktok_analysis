package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023430cjt extends C09AY implements Function1<C1196804mE, String> {
    public final /* synthetic */ InterfaceC1023400cjq<C443120HZe<String, String, String>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023430cjt(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq) {
        super(1);
        this.LL = interfaceC1023400cjq;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(C1196804mE c1196804mE) {
        return this.LL.getEventId().getFirst();
    }
}
