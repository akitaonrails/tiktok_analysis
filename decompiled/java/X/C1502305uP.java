package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1502305uP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502305uP(boolean z, int i, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C885830Yp3.LLJILJIL = !this.LL ? "invalid" : this.LLILLJJLI > 0 ? "count" : this.LLILLL ? "dot" : "none";
        C885830Yp3.LJII(C885830Yp3.LL);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1329805Ii(null), 3);
        return Unit.LIZ;
    }
}
