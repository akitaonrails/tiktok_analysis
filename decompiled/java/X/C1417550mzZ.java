package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417550mzZ extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0MJ9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417550mzZ(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9) {
        super(2);
        this.LL = c1417330mzD;
        this.LLILLJJLI = i;
        this.LLILLL = c0mj9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str2;
        if (this.LL.Yc(this.LLILLJJLI, this.LLILLL)) {
            C1417330mzD.oc(this.LL, 1015, null, this.LLILLJJLI, this.LLILLL, Integer.MIN_VALUE, str3);
        } else {
            String strNc = this.LL.nc(this.LLILLJJLI, this.LLILLL);
            C1417330mzD.pd(this.LL, 1015, null, this.LLILLJJLI, this.LLILLL, Integer.MIN_VALUE);
            C01TT.LIZLLL(new C1417560mza(strNc, this.LL, str3));
        }
        return Unit.LIZ;
    }
}
