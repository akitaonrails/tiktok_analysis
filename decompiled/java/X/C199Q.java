package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.199Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199Q extends C09AY implements Function0<InterfaceC214902198i> {
    public final /* synthetic */ Class<? extends InterfaceC214902198i> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199Q(Class<? extends InterfaceC214902198i> cls) {
        super(0);
        this.LL = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC214902198i invoke() {
        return this.LL.newInstance();
    }
}
