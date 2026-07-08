package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415990mx3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0MJ9 LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415990mx3(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, int i2) {
        super(0);
        this.LL = c1417330mzD;
        this.LLILLJJLI = i;
        this.LLILLL = c0mj9;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1417330mzD.Rg(this.LL, this.LLILLJJLI, this.LLILLL, Float.valueOf(this.LLILZ / 100.0f), Float.valueOf(1.0f), null);
        return Unit.LIZ;
    }
}
