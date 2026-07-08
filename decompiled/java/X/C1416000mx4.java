package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416000mx4 extends C09AY implements Function1<C1418670n1N, C1418670n1N> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416000mx4(String str, float f, float f2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1418670n1N invoke(C1418670n1N c1418670n1N) {
        C1418670n1N c1418670n1N2 = c1418670n1N;
        C1416070mxB c1416070mxB = c1418670n1N2.LJIJJ.get(this.LL);
        if (c1416070mxB == null) {
            c1416070mxB = new C1416070mxB(0);
        }
        return C1418670n1N.LIZ(c1418670n1N2, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N2.LJIJJ, new Pair(this.LL, C1416070mxB.LIZ(c1416070mxB, EnumC1416050mx9.LOADING, null, false, this.LLILLJJLI, this.LLILLL, 0.0f, this.LLILZ, 36))), false, 3145727);
    }
}
