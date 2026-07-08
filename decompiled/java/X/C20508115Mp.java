package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15Mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1003940cES(service = {InterfaceC855600XhO.class})
public final class C20508115Mp implements InterfaceC855600XhO {
    public final InterfaceC20508015Mo LL;
    public final InterfaceC20507715Ml LLILLJJLI;
    public final InterfaceC20506815Mc LLILLL;
    public final InterfaceC20507815Mm LLILZ;
    public final List<InterfaceC856520Xis> LLILZIL;

    @Override // X.InterfaceC855600XhO
    public final void e00() {
        Iterator<InterfaceC856520Xis> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().IS();
        }
    }

    @Override // X.InterfaceC855600XhO
    public final C856490Xip eA0() {
        return new C856490Xip(this);
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        Iterator<InterfaceC856520Xis> it2 = LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().initialize();
        }
        C1010170cOV.LIZJ(this);
    }

    public final List<InterfaceC856520Xis> LIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C20508115Mp(AbstractC856620Xj2 abstractC856620Xj2) {
        this.LL = abstractC856620Xj2;
        CommerceTcmPublishModule commerceTcmPublishModuleLIZIZ = ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LIZIZ(abstractC856620Xj2);
        this.LLILLJJLI = commerceTcmPublishModuleLIZIZ;
        InterfaceC20506815Mc interfaceC20506815McMA = ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).mA(abstractC856620Xj2);
        this.LLILLL = interfaceC20506815McMA;
        C20508215Mq c20508215MqLIZLLL = ((ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class)).LIZLLL(abstractC856620Xj2);
        this.LLILZ = c20508215MqLIZLLL;
        this.LLILZIL = C1697810uHb.LJIILJJIL(commerceTcmPublishModuleLIZIZ, interfaceC20506815McMA, c20508215MqLIZLLL, ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LIZIZ(abstractC856620Xj2));
    }
}
