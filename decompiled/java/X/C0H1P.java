package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H1P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1P extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C424040Gjy LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1P(C424040Gjy c424040Gjy, boolean z, int i) {
        super(0);
        this.LL = c424040Gjy;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.getParent() != null) {
            this.LL.LJIIJ(this.LLILLL, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
