package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701730Rfn extends C09AY implements Function1<C700950ReX, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C701370RfD LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C700260RdQ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701730Rfn(String str, C701370RfD c701370RfD, int i, C700260RdQ c700260RdQ) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c701370RfD;
        this.LLILLL = i;
        this.LLILZ = c700260RdQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700950ReX c700950ReX) {
        C0CNO.LIZLLL(0L, new C701590RfZ(this.LL, this.LLILLJJLI, this.LLILLL, c700950ReX, this.LLILZ));
        return Unit.LIZ;
    }
}
