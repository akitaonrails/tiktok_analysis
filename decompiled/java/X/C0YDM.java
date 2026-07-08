package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YDM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDM extends C09AY implements Function0<C0YC7> {
    public final /* synthetic */ C0YDN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YDM(C0YDN c0ydn) {
        super(0);
        this.LL = c0ydn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YC7 invoke() {
        return new C0YC7(this.LL.LIZ);
    }
}
