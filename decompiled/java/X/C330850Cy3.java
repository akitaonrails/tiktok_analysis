package X;

import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController$onCreate$1$1", f = "AmeProfileFrameActivityBannerTTEPResController.kt", l = {}, m = "invokeSuspend")
public final class C330850Cy3 extends C09AX implements Function2<AbstractC1623806Xk<? extends List<? extends AMEPublishCampaignItem>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AmeProfileFrameActivityBannerTTEPResController LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330850Cy3(AmeProfileFrameActivityBannerTTEPResController ameProfileFrameActivityBannerTTEPResController, InterfaceC1364105Vn<? super C330850Cy3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ameProfileFrameActivityBannerTTEPResController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C330850Cy3 c330850Cy3 = new C330850Cy3(this.LLILLJJLI, interfaceC1364105Vn);
        c330850Cy3.LL = obj;
        return c330850Cy3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("AmeProfileFrameActivityBannerTTEPResController@578f.onCreate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) this.LL;
        boolean z = abstractC1623806Xk instanceof C1623606Xi;
        if (z || (abstractC1623806Xk instanceof C491001vg)) {
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("campaign loaded, result: ");
            sbLIZ.append(abstractC1623806Xk);
            C201955140j.LJIILL(c20012313Rx, "ProfileTTEPResController", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                AmeProfileFrameActivityBannerTTEPResController ameProfileFrameActivityBannerTTEPResController = this.LLILLJJLI;
                List list = (List) ((C1623606Xi) abstractC1623806Xk).LIZ;
                ameProfileFrameActivityBannerTTEPResController.getClass();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        AMEPublishCampaignItem aMEPublishCampaignItem = (AMEPublishCampaignItem) next;
                        if (C123100dR.LIZ(aMEPublishCampaignItem.activityId) && C123100dR.LIZ(aMEPublishCampaignItem.activityPageSchema) && C123100dR.LIZ(aMEPublishCampaignItem.activityLargeBannerLightModeUrl) && C123100dR.LIZ(aMEPublishCampaignItem.activityMediumBannerLightModeUrl) && C123100dR.LIZ(aMEPublishCampaignItem.activitySmallBannerLightModeUrl)) {
                            long j = aMEPublishCampaignItem.startTimestamp;
                            long j2 = aMEPublishCampaignItem.endTimestamp;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ameProfileFrameActivityBannerTTEPResController.LLILZ = (AMEPublishCampaignItem) next;
            }
            Iterator<Function0<Unit>> it3 = this.LLILLJJLI.LLILLL.iterator();
            while (it3.hasNext()) {
                it3.next().invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmeProfileFrameActivityBannerTTEPResController@578f.onCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1623806Xk<? extends List<? extends AMEPublishCampaignItem>> abstractC1623806Xk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1623806Xk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
