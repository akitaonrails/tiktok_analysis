package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996510c2T extends C09AY implements Function0<Object> {
    public final /* synthetic */ C1035340d36 LL;
    public final /* synthetic */ AdPopUpWebPageHelper LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ NonAdWebModel LLILZIL;
    public final /* synthetic */ C1025100cma LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C996510c2T(C1035340d36 c1035340d36, AdPopUpWebPageHelper adPopUpWebPageHelper, boolean z, String str, NonAdWebModel nonAdWebModel, C1025100cma c1025100cma) {
        super(0);
        this.LL = c1035340d36;
        this.LLILLJJLI = adPopUpWebPageHelper;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = nonAdWebModel;
        this.LLILZLL = c1025100cma;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1035340d36 c1035340d36 = this.LL;
        final AdPopUpWebPageHelper adPopUpWebPageHelper = this.LLILLJJLI;
        final boolean z = this.LLILLL;
        final String str = this.LLILZ;
        final NonAdWebModel nonAdWebModel = this.LLILZIL;
        final C1025100cma c1025100cma = this.LLILZLL;
        final Function1<Boolean, Unit> function1 = this.LLIZ;
        return Boolean.valueOf(HandlerHook.viewPost(c1035340d36, new Runnable() { // from class: X.0c2S
            public final void LIZ() {
                Context context;
                Activity activityLIZ;
                boolean z2 = false;
                adPopUpWebPageHelper.LLIZ = (z && Intrinsics.LJFF(str, "landing_page")) || nonAdWebModel != null;
                C1025100cma c1025100cma2 = c1025100cma;
                if (c1025100cma2 != null && (context = c1025100cma2.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C1035340d36 c1035340d36LIZ = C1028450crz.LIZ(activityLIZ, c1025100cma2.LJIILIIL != null);
                    if (c1035340d36LIZ != null && !c1035340d36LIZ.LJIIJJI()) {
                        C1025930cnv c1025930cnv = c1035340d36LIZ.LLJJLIIIJLLLLLLLZ;
                        FrameLayout frameLayoutLIZIZ = C1028450crz.LIZIZ(activityLIZ, c1025930cnv != null ? c1025930cnv.LJII : false);
                        C1028290crj c1028290crj = new C1028290crj(frameLayoutLIZIZ, c1035340d36LIZ, c1025100cma2);
                        if (c1025100cma2.LJIIL) {
                            InterfaceC996520c2U interfaceC996520c2U = (InterfaceC996520c2U) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC996520c2U.class);
                            if (interfaceC996520c2U != null) {
                                AwemeRawAd awemeRawAd = c1025100cma2.LIZIZ;
                                String str2 = c1025100cma2.LJFF;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                interfaceC996520c2U.yq1(awemeRawAd, str2, c1028290crj);
                            }
                        } else {
                            C786410Ut5.LJZ(0, frameLayoutLIZIZ);
                        }
                        c1035340d36LIZ.getActionMode().LJIIIIZZ = c1025100cma2.LIZLLL;
                        c1035340d36LIZ.LJIIIZ(new AwS417S0200000_16(c1025100cma2, c1035340d36LIZ, 96));
                        z2 = true;
                        if (!adPopUpWebPageHelper.LLIZ && nonAdWebModel == null) {
                            C1440005kM.LIZ(new C586540MzU(1));
                            C1440005kM.LIZ(new C690420R6i());
                        }
                    }
                }
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z2));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AdPopUpWebPageHelper@34ce.initAndShow$2$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AdPopUpWebPageHelper@34ce.initAndShow$2$1");
            }
        }));
    }
}
