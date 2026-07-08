package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965440bEM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ String LLILLJJLI = "recharge_positive";
    public final /* synthetic */ InterfaceC966890bGh<RechargeResult> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965440bEM(C966020bFI c966020bFI, C965930bF9 c965930bF9) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLL = c965930bF9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966020bFI c966020bFI = this.LL;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recharge dealing source=");
        sbLIZ.append(this.LLILLJJLI);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966920bGk c966920bGkLJ = this.LL.LJ();
        C968370bJ5 c968370bJ5 = new C968370bJ5(C1CXD.Positive);
        C966020bFI c966020bFI2 = this.LL;
        InterfaceC966890bGh<RechargeResult> interfaceC966890bGh = this.LLILLL;
        C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI2.LJ, "recharge", interfaceC966890bGh, new C965430bEL(c966020bFI2, interfaceC966890bGh));
        c966020bFI2.LJIIJ(c966100bFQ, null);
        c966920bGkLJ.LJLZ(c968370bJ5, new C966240bFe(c966100bFQ, null));
        return Unit.LIZ;
    }
}
