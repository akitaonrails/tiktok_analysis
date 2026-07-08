package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234711CdJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234711CdJ(C2234651CdD c2234651CdD, Throwable th, Function0<Unit> function0) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = th;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2234651CdD c2234651CdD = this.LL;
        Throwable th = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        if (c2234651CdD.LIZJ) {
            C1304630k3R.LIZIZ(th);
        } else {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
