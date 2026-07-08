package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJZ extends C09AY implements Function1<C0RJT, C0RJT> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RJZ(boolean z, long j) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0RJT invoke(C0RJT c0rjt) {
        boolean z = this.LL;
        long j = this.LLILLJJLI;
        c0rjt.getClass();
        return new C0RJT(z, j);
    }
}
