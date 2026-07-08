package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618550sDl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1618510sDh LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618550sDl(C1618510sDh c1618510sDh, boolean z, int i, String str) {
        super(0);
        this.LL = c1618510sDh;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1618510sDh c1618510sDh = this.LL;
        boolean z = this.LLILLJJLI;
        c1618510sDh.LIZ(-1L, this.LLILZ, this.LLILLL, z, true);
        return Unit.LIZ;
    }
}
