package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder$onCreate$4", f = "PdpSparkLiteCardHolder.kt", l = {}, m = "invokeSuspend")
public final class C1508570pMN extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpSparkLiteCardHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508570pMN(PdpSparkLiteCardHolder pdpSparkLiteCardHolder, InterfaceC1364105Vn<? super C1508570pMN> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpSparkLiteCardHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1470005pC;
        C19EG activity;
        C1C7U.LIZ("PdpSparkLiteCardHolder@81b6.onCreate$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PdpViewModel pdpViewModelC6 = this.LLILLL.c6();
        Fragment fragmentLIZ = C946803n0.LIZ(this.LLILLL.itemView);
        if (fragmentLIZ != null && (activity = fragmentLIZ.getActivity()) != null) {
            pdpViewModelC6.getClass();
            C948503nH.LJFF(pdpViewModelC6, C23271099x.INSTANCE, new C1750310veH(pdpViewModelC6, activity, null));
            c1470005pC = new C1470305pF((Map) null, 3);
        } else {
            c1470005pC = new C1470005pC(0, "Activity is null", null);
        }
        C1C7U.LIZIZ("PdpSparkLiteCardHolder@81b6.onCreate$4");
        return c1470005pC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1508570pMN c1508570pMN = new C1508570pMN(this.LLILLL, interfaceC1364105Vn);
        c1508570pMN.LL = map;
        c1508570pMN.LLILLJJLI = map2;
        return c1508570pMN.invokeSuspend(Unit.LIZ);
    }
}
