package X;

import android.net.Uri;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757240vpS implements InterfaceC1757740vqG {
    public final /* synthetic */ C1757250vpT LIZ;

    @Override // X.InterfaceC1757740vqG
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1757740vqG
    public final void LIZ() {
        this.LIZ.LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC1757740vqG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1757240vpS.LIZJ():void");
    }

    @Override // X.InterfaceC1757740vqG
    public final void LIZLLL() {
        String string;
        Map<String, Object> mapLJ;
        SeaPdpViewModel seaPdpViewModel;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        SeaPdpViewModel seaPdpViewModel2;
        IPdpStarter.PdpEnterParam pdpEnterParam2;
        C1757250vpT c1757250vpT = this.LIZ;
        EntranceBubble entranceBubble = c1757250vpT.LLIZ;
        if (entranceBubble == null || (string = entranceBubble.schema) == null) {
            return;
        }
        Uri uri = UriProtector.parse(string);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_btm_token");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1757250vpT.LJ() ? "c14506.d0" : "c29066.d0";
        }
        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, PageFinder.via(c1757250vpT.LLILLL), null);
        if (strCreateJumpSourceBtmToken != null) {
            try {
                string = C011J.LIZ(uri, "source_btm_token", strCreateJumpSourceBtmToken).toString();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PdpViewModelDelegate pdpViewModelDelegate = (PdpViewModelDelegate) c1757250vpT.LLJ.getValue();
        linkedHashMap.put("rd_previous_page", (pdpViewModelDelegate == null || (seaPdpViewModel2 = pdpViewModelDelegate.LL) == null || (pdpEnterParam2 = seaPdpViewModel2.LLIZ) == null || !pdpEnterParam2.fullScreen) ? "half_product_detail" : "product_detail");
        try {
            PdpViewModelDelegate pdpViewModelDelegate2 = (PdpViewModelDelegate) c1757250vpT.LLJ.getValue();
            if (pdpViewModelDelegate2 == null || (seaPdpViewModel = pdpViewModelDelegate2.LL) == null || (pdpEnterParam = seaPdpViewModel.LLIZ) == null || (mapLJ = pdpEnterParam.trackParams) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C189200o6.m2constructorimpl(linkedHashMap.put("trackParams", C1741890vQh.LJIIIIZZ(mapLJ)));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(c1757250vpT.LL, string, linkedHashMap, false);
        C128Y c128y = c1757250vpT.LLILLL;
        if (c128y instanceof InterfaceC1748810vbr) {
            C960603pE.LJIIIIZZ(smartRouteLIZIZ, (InterfaceC1748810vbr) c128y);
        } else {
            AbstractC1757620vq4 abstractC1757620vq4 = c1757250vpT.LLILZIL;
            if (abstractC1757620vq4 != null) {
                C960603pE.LJII(smartRouteLIZIZ, abstractC1757620vq4);
            }
        }
        smartRouteLIZIZ.open();
    }

    @Override // X.InterfaceC1757740vqG
    public final void LJ() {
        ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZIZ;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        ECVideoPlaybackController eCVideoPlaybackController = this.LIZ.LLIZLLLIL;
        if (eCVideoPlaybackController == null || !eCVideoPlaybackController.LJ()) {
            return;
        }
        ECVideoPlaybackController eCVideoPlaybackController2 = this.LIZ.LLIZLLLIL;
        if (eCVideoPlaybackController2 != null && (interfaceC1484830ok5 = eCVideoPlaybackController2.LLIZLLLIL) != null) {
            interfaceC1484830ok5.pause();
        }
        if (!this.LIZ.LJ() || (iSeaPdpMediaControlServiceLIZIZ = this.LIZ.LIZIZ()) == null) {
            return;
        }
        C1757250vpT c1757250vpT = this.LIZ;
        iSeaPdpMediaControlServiceLIZIZ.uE0(c1757250vpT.LLJJI, Boolean.FALSE, Boolean.valueOf(c1757250vpT.LLJILLL.isMuted()), EnumC1308950kAP.PASSIVE);
    }

    @Override // X.InterfaceC1757740vqG
    public final void LJI() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        ECVideoPlaybackController eCVideoPlaybackController = this.LIZ.LLIZLLLIL;
        if (eCVideoPlaybackController == null || !eCVideoPlaybackController.LJ()) {
            return;
        }
        ECVideoPlaybackController eCVideoPlaybackController2 = this.LIZ.LLIZLLLIL;
        if (eCVideoPlaybackController2 != null && (interfaceC1484830ok5 = eCVideoPlaybackController2.LLIZLLLIL) != null) {
            interfaceC1484830ok5.pause();
        }
        ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZIZ = this.LIZ.LIZIZ();
        if (iSeaPdpMediaControlServiceLIZIZ != null) {
            iSeaPdpMediaControlServiceLIZIZ.MC2(this.LIZ.LLJJI, false, EnumC1308950kAP.PASSIVE);
        }
    }

    @Override // X.InterfaceC1757740vqG
    public final boolean isMuted() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        ECVideoPlaybackController eCVideoPlaybackController = this.LIZ.LLIZLLLIL;
        return (eCVideoPlaybackController == null || (interfaceC1484830ok5 = eCVideoPlaybackController.LLIZLLLIL) == null || (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok5.LJIIIZ()) == null || !interfaceC1483420ohoLJIIIZ.isMute()) ? false : true;
    }

    public C1757240vpS(C1757250vpT c1757250vpT) {
        this.LIZ = c1757250vpT;
    }

    @Override // X.InterfaceC1757740vqG
    public final void LJFF(boolean z) {
        C1757250vpT c1757250vpT = this.LIZ;
        ECVideoPlaybackController eCVideoPlaybackController = c1757250vpT.LLIZLLLIL;
        if (eCVideoPlaybackController != null) {
            eCVideoPlaybackController.LIZLLL(z);
            ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZIZ = c1757250vpT.LIZIZ();
            if (iSeaPdpMediaControlServiceLIZIZ != null) {
                iSeaPdpMediaControlServiceLIZIZ.Zk1(c1757250vpT.LLJJI, z, EnumC1308950kAP.ACTIVE);
            }
        }
    }
}
