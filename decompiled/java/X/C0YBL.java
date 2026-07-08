package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YBL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YBL extends C09AY implements Function0<C0YAV> {
    public final /* synthetic */ C0YBI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YBL(C0YBI c0ybi) {
        super(0);
        this.LL = c0ybi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YAV invoke() {
        return new C0YAV(this.LL.LIZ);
    }
}
