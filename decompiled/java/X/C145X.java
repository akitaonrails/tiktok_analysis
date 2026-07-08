package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.145X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C145X extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C145Y LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C145X(C145Y c145y, String str, boolean z, int i) {
        super(0);
        this.LL = c145y;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C145Y c145y = this.LL;
        if (c145y == null) {
            return null;
        }
        c145y.LIZ(this.LLILZ, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
