package X;

import Y.ARunnableS126S0100000_26;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPageViewerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS38S0001000_26;

/* JADX INFO: renamed from: X.0vwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761910vwz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PdpCarouselPageViewerAssem LL;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20631115oD LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761910vwz(PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, int i) {
        super(0);
        this.LL = pdpCarouselPageViewerAssem;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20631115oD;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PdpCarouselPageViewerAssem pdpCarouselPageViewerAssem = this.LL;
        pdpCarouselPageViewerAssem.LLLFF = true;
        InterfaceC1762000vx8 interfaceC1762000vx8Sp = pdpCarouselPageViewerAssem.sp();
        if (interfaceC1762000vx8Sp != null) {
            interfaceC1762000vx8Sp.d8();
        }
        this.LLILLJJLI.setCurrentItem(this.LLILLL, false);
        HandlerHook.viewPost(this.LL.getContentView(), new ARunnableS126S0100000_26(this.LL, 124));
        PdpCarouselViewModel pdpCarouselViewModelZp = this.LL.zp();
        int i = this.LLILLL;
        pdpCarouselViewModelZp.getClass();
        pdpCarouselViewModelZp.setState(new AwS38S0001000_26(i, 14));
        return Unit.LIZ;
    }
}
