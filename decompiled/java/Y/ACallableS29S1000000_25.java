package Y;

import X.C0CHQ;
import X.C1C7U;
import X.InterfaceC1631380sYS;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes26.dex */
public class ACallableS29S1000000_25 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS29S1000000_25 aCallableS29S1000000_25) {
        C1C7U.LIZ("CommerceStickerBrandInfo@efb3.updateCommerceLayout$1");
        InterfaceC1631380sYS iStickerPropService = C0CHQ.LIZ().getIStickerPropService();
        String str = aCallableS29S1000000_25.s0;
        iStickerPropService.getClass();
        NewFaceStickerListBean newFaceStickerListBeanLJIIJ = ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJIIJ(str);
        C1C7U.LIZIZ("CommerceStickerBrandInfo@efb3.updateCommerceLayout$1");
        return newFaceStickerListBeanLJIIJ;
    }

    public static final Object call$1(ACallableS29S1000000_25 aCallableS29S1000000_25) {
        String str = aCallableS29S1000000_25.s0;
        C1C7U.LIZ("EffectControlGameModule@c941.updateCommerceLayout$1L");
        C0CHQ.LIZ().getIStickerPropService().getClass();
        NewFaceStickerListBean newFaceStickerListBeanLJIIJ = ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJIIJ(str);
        C1C7U.LIZIZ("EffectControlGameModule@c941.updateCommerceLayout$1L");
        return newFaceStickerListBeanLJIIJ;
    }

    public ACallableS29S1000000_25(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }
}
