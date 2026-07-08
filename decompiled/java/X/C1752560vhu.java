package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.spark.SeaPdpRecommendStyle1Module$generateListItems$2", f = "SeaPdpRecommendStyle1Module.kt", l = {}, m = "invokeSuspend")
public final class C1752560vhu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<InterfaceC997603vC> LL;
    public final /* synthetic */ SeaPdpViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752560vhu(List<InterfaceC997603vC> list, SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C1752560vhu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752560vhu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set setKeySet;
        PdpLynxPreloadItem pdpLynxPreloadItem;
        InterfaceC997603vC next;
        C1752600vhy c1752600vhy;
        C1C7U.LIZ("SeaPdpRecommendStyle1Module@c413.generateListItems$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map mapLIZ = C1279904zd.LIZ();
        if (mapLIZ != null && (setKeySet = ((LinkedHashMap) mapLIZ).keySet()) != null) {
            List<InterfaceC997603vC> list = this.LL;
            SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI;
            for (Object obj2 : setKeySet) {
                Map mapLIZ2 = C1279904zd.LIZ();
                if (mapLIZ2 == null || (pdpLynxPreloadItem = (PdpLynxPreloadItem) ((LinkedHashMap) mapLIZ2).get(obj2)) == null) {
                    pdpLynxPreloadItem = new PdpLynxPreloadItem(false, LSPassThroughRecordSizeConfig.DEFAULT);
                }
                if (pdpLynxPreloadItem.enablePreload) {
                    Iterator<InterfaceC997603vC> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(String.valueOf(next.getBrickName()), obj2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if ((next instanceof C1752600vhy) && (c1752600vhy = (C1752600vhy) next) != null) {
                        C948503nH.LJFF(seaPdpViewModel, C0PEM.LIZJ, new C1752580vhw(pdpLynxPreloadItem, c1752600vhy, seaPdpViewModel, null));
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpRecommendStyle1Module@c413.generateListItems$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
