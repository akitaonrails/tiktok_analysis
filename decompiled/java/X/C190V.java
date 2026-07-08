package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.190V, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190V extends C09AY implements Function1<C190T, C190T> {
    public final /* synthetic */ C190W LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C190V(C190W c190w, long j) {
        super(1);
        this.LL = c190w;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C190T invoke(C190T c190t) {
        return C190T.LJII(c190t, 0, false, false, null, this.LL.P4(Long.valueOf(this.LLILLJJLI)), null, 895);
    }
}
