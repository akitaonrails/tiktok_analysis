package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904230zeX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1904230zeX(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        C1619080sEc c1619080sEc = new C1619080sEc((i == 99 || i == 101) ? 3 : 1);
        C1904220zeW c1904220zeW = C1904220zeW.LL;
        int i2 = this.LL;
        int i3 = this.LLILLJJLI;
        c1904220zeW.getClass();
        C1904220zeW.LJJJJZ(i2, i3, c1619080sEc);
        C1904220zeW.LJJJJI().put(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI));
        c1619080sEc.LIZLLL(this.LL, this.LLILLJJLI);
        c1619080sEc.post();
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNoticeCount end ");
        sbLIZ.append(c1619080sEc);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
