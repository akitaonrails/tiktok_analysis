package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527810prP extends C09AY implements Function0<C0WYY> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527810prP(C1527670prB c1527670prB, String str, long j) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0WYY invoke() {
        return this.LL.LJLILLLLZI().LJIIIZ(this.LLILLL, this.LLILLJJLI);
    }
}
