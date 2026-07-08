package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.affinity.api.SocialAffinityResponse;
import com.ss.android.ugc.aweme.affinity.model.SingleSiteAffinity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.SocialAffinityManager$updateCache$2", f = "SocialAffinityManager.kt", l = {}, m = "invokeSuspend")
public final class C2204208kK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAffinityResponse LL;
    public final /* synthetic */ C2204508kN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204208kK(SocialAffinityResponse socialAffinityResponse, C2204508kN c2204508kN, InterfaceC1364105Vn<? super C2204208kK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAffinityResponse;
        this.LLILLJJLI = c2204508kN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2204208kK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAffinityManager@25b4.updateCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<SingleSiteAffinity> list = this.LL.siteAffinityList;
        if (list != null && !list.isEmpty()) {
            C2204508kN c2204508kN = this.LLILLJJLI;
            c2204508kN.LIZLLL = this.LL.siteAffinityList;
            if (!c2204508kN.LIZIZ) {
                C2204508kN c2204508kN2 = this.LLILLJJLI;
                c2204508kN2.LIZIZ = true;
                CopyOnWriteArrayList<InterfaceC2204408kM> copyOnWriteArrayList = c2204508kN2.LIZJ;
                if (copyOnWriteArrayList != null) {
                    Iterator<InterfaceC2204408kM> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ();
                    }
                }
            } else {
                CopyOnWriteArrayList<InterfaceC2204408kM> copyOnWriteArrayList2 = this.LLILLJJLI.LIZJ;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<InterfaceC2204408kM> it3 = copyOnWriteArrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ();
                    }
                }
            }
            C2204308kL c2204308kL = C2204308kL.LIZ;
            String str = this.LLILLJJLI.LIZ;
            List<SingleSiteAffinity> list2 = this.LL.siteAffinityList;
            c2204308kL.getClass();
            C2204308kL.LIZ().storeString(C2204308kL.LIZIZ(str, "affinity_data"), GsonProtectorUtils.toJson(C2204308kL.LIZJ, list2));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAffinityManager@25b4.updateCache$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAffinityManager@25b4.updateCache$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
