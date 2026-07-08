package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886030YpN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C886030YpN(int i, boolean z) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C885830Yp3.LLJILLL = this.LL > 0 ? "count" : this.LLILLJJLI ? "dot" : "none";
        C885830Yp3.LJII(C885830Yp3.LL);
        return Unit.LIZ;
    }
}
