package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingFragment$readArguments$1", f = "ECTrendingFragment.kt", l = {}, m = "invokeSuspend")
public final class C1504910pGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ECTrendingFragment LL;
    public final /* synthetic */ C1742820vSC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504910pGT(ECTrendingFragment eCTrendingFragment, C1742820vSC c1742820vSC, InterfaceC1364105Vn<? super C1504910pGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eCTrendingFragment;
        this.LLILLJJLI = c1742820vSC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1504910pGT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("ECTrendingFragment@8b2b.readArguments$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (Intrinsics.LJFF((String) this.LL.LLILLL.getValue(), "auction")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLJJLI.LJFF);
                sbLIZ.append("_rec_auction_outer_flow");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLILLJJLI.LJFF);
                sbLIZ2.append("_rec_trends_outer_flow");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1742820vSC c1742820vSC = this.LL.VR().LL;
            if (c1742820vSC != null) {
                String str = this.LLILLJJLI.LJI;
                if (str != null && str.length() > 0 && 1 != 0) {
                    String strOptString = new JSONObject(str).optString("source_module");
                    if (strOptString.length() > 0) {
                        strLIZIZ = strOptString;
                    }
                }
                c1742820vSC.LJII = strLIZIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECTrendingFragment@8b2b.readArguments$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
