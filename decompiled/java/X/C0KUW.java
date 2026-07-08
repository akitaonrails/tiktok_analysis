package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KUW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUW extends C09AY implements Function1<C0KUP, C0KUP> {
    public final /* synthetic */ C1784870wY1 LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KUW(C1784870wY1 c1784870wY1, Throwable th) {
        super(1);
        this.LL = c1784870wY1;
        this.LLILLJJLI = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0KUP invoke(C0KUP c0kup) {
        return C0KUP.LIZ(c0kup, C0KUR.LOAD_FAIL, this.LL, this.LLILLJJLI, false, 20);
    }
}
