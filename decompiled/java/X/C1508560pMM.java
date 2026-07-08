package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder$onCreate$1", f = "PdpSparkLiteCardHolder.kt", l = {}, m = "invokeSuspend")
public final class C1508560pMM extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpSparkLiteCardHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508560pMM(PdpSparkLiteCardHolder pdpSparkLiteCardHolder, InterfaceC1364105Vn<? super C1508560pMM> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpSparkLiteCardHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1470005pC;
        C19EG activity;
        Object obj2;
        C1C7U.LIZ("PdpSparkLiteCardHolder@81b6.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        PdpViewModel pdpViewModelC6 = this.LLILLL.c6();
        Fragment fragmentLIZ = C946803n0.LIZ(this.LLILLL.itemView);
        Object obj3 = null;
        if (fragmentLIZ != null && (activity = fragmentLIZ.getActivity()) != null) {
            if (map != null) {
                obj2 = map.get("schema");
            } else {
                obj2 = null;
            }
            String str = (String) obj2;
            if (map != null) {
                obj3 = map.get("entrance");
            }
            String strLIZ = C10347042v.LIZ(pdpViewModelC6, activity, str, (String) obj3);
            if (strLIZ == null) {
                strLIZ = "";
            }
            c1470005pC = new C1470305pF(C2097908Jt.LIZJ(new Pair("schema", strLIZ)), 2);
        } else {
            c1470005pC = new C1470005pC(0, "activity is null", null);
        }
        C1C7U.LIZIZ("PdpSparkLiteCardHolder@81b6.onCreate$1");
        return c1470005pC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1508560pMM c1508560pMM = new C1508560pMM(this.LLILLL, interfaceC1364105Vn);
        c1508560pMM.LL = map;
        c1508560pMM.LLILLJJLI = map2;
        return c1508560pMM.invokeSuspend(Unit.LIZ);
    }
}
