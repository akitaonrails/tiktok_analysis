package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19C6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19C2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19C6(C19C2 c19c2) {
        super(0);
        this.LL = c19c2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getClass();
        if (!C19C2.LJI()) {
            throw new IllegalStateException("onResumed must run on ui thread");
        }
        C19C2 c19c2 = this.LL;
        C19C4 c19c4 = c19c2.LJII;
        C19C4 c19c42 = C19C4.LLILZLL;
        if (c19c4 != c19c42) {
            if (c19c4 != C19C4.LLILZIL && c19c4 != C19C4.LLIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke onStart() or onPause() first, current state ");
                sbLIZ.append(this.LL.LJII);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            c19c2.LJII = c19c42;
            c19c2.LIZLLL.dispatchResume();
            this.LL.LJIIIZ = false;
        }
        return Unit.LIZ;
    }
}
