package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1386505bj extends C09AY implements Function0<C1386605bk> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ Function0<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386505bj(int i, float f, Function0<Integer> function0) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1386605bk invoke() {
        return new C1386605bk(this.LL, this.LLILLJJLI, this.LLILLL);
    }
}
