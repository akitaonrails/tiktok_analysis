package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PWC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PWC extends C09AY implements Function2<InterfaceC1618170sD9<Object>, C0PWT, InterfaceC1618170sD9<Object>> {
    public final /* synthetic */ Function2<InterfaceC1618170sD9<Object>, Object, InterfaceC1618170sD9<Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PWC(Function2<InterfaceC1618170sD9<Object>, Object, InterfaceC1618170sD9<Object>> function2) {
        super(2);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC1618170sD9<Object> invoke(InterfaceC1618170sD9<Object> interfaceC1618170sD9, C0PWT c0pwt) {
        return this.LL.invoke(interfaceC1618170sD9, c0pwt);
    }
}
