package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCallBackLayoutNotFound;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicDslFallbackOptimizeSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0k11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303130k11 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1303170k15 LLILLL;
    public final /* synthetic */ InterfaceC1303160k14 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303130k11(int i, InterfaceC1303160k14 interfaceC1303160k14, C1303170k15 c1303170k15, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = c1303170k15;
        this.LLILZ = interfaceC1303160k14;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle IO finished ");
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL.LIZJ.get(this.LLILLJJLI) == null) {
            this.LLILLL.LJIIJJI(this.LL, this.LLILLJJLI);
            if (LinkmicDslFallbackOptimizeSetting.INSTANCE.enable()) {
                C1303170k15 c1303170k15 = this.LLILLL;
                if (c1303170k15.LIZ == EnumC1154700g9c.GECKO) {
                    C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C1303070k0v(c1303170k15, new C1303140k12(this.LL, this.LLILZ, c1303170k15, this.LLILLJJLI), null), 2);
                }
            }
            if (LinkMicCallBackLayoutNotFound.INSTANCE.getValue()) {
                this.LLILZ.LIZ(null);
            }
        } else {
            this.LLILZ.LIZ(this.LLILLL.LIZJ.get(this.LLILLJJLI));
        }
        return Unit.LIZ;
    }
}
