package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicDslFallbackOptimizeSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303120k10 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1303170k15 LLILLJJLI;
    public final /* synthetic */ InterfaceC1303160k14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303120k10(InterfaceC1303160k14 interfaceC1303160k14, C1303170k15 c1303170k15, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c1303170k15;
        this.LLILLL = interfaceC1303160k14;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("queryForCheck handle IO finished");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI.LIZJ.get(this.LL) == null) {
            this.LLILLJJLI.getClass();
            String strLJII = C1303170k15.LJII(109);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("queryForCheck there isn't a layout for ");
            sbLIZ2.append(this.LL);
            C1AZW.LJFF(strLJII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            if (LinkmicDslFallbackOptimizeSetting.INSTANCE.enable()) {
                C1303170k15 c1303170k15 = this.LLILLJJLI;
                if (c1303170k15.LIZ == EnumC1154700g9c.GECKO) {
                    C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C1303070k0v(c1303170k15, new C1303150k13(this.LLILLL, c1303170k15, this.LL), null), 2);
                }
            }
        } else {
            this.LLILLL.LIZ(this.LLILLJJLI.LIZJ.get(this.LL));
        }
        return Unit.LIZ;
    }
}
