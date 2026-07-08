package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JLN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLN extends C09AY implements Function1<C0JLJ, C0JLJ> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLN(Throwable th) {
        super(1);
        this.LL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JLJ invoke(C0JLJ c0jlj) {
        Throwable exc = this.LL;
        if (!(exc instanceof Exception) || exc == null) {
            exc = new Exception(this.LL.getMessage());
        }
        C0JLM c0jlm = new C0JLM(exc);
        c0jlj.getClass();
        return new C0JLJ(c0jlm);
    }
}
