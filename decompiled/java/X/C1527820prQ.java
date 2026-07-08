package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527820prQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527820prQ(C1527670prB c1527670prB, long j, long j2) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJLJI().LIZJ(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
