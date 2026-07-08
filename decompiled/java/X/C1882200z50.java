package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882200z50 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1882060z4m LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882200z50(C1882060z4m c1882060z4m, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.LL = c1882060z4m;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1882060z4m c1882060z4m = this.LL;
        c1882060z4m.LJIIJ(new C1882130z4t(this.LLILLL, this.LL), new C1882120z4s(this.LLILLJJLI, c1882060z4m));
        return Unit.LIZ;
    }
}
