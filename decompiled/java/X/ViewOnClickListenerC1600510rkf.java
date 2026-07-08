package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.creation.sender.IMediaMsgSendManager;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.inbox.lego.PreloadInboxTask;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.SaveInfoDialogService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushExperiment;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1600510rkf implements View.OnClickListener, InterfaceC20660615sy {
    public final Context LL;
    public final C19EG LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public String LLIZLLLIL;

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "inbox";
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final void LIZJ() {
        C19EG c19egLIZIZ;
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle;
        LifecycleCoroutineScope lifecycleScope;
        if (C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX || (c19egLIZIZ = C1388190mED.LIZIZ(this.LL)) == null || (lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19egLIZIZ, null, false)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerRequireMainSAFLifecycle)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C757670Tnp(this, null), 2);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return IMainSAFLifecycleKt.requireMainSAFLifecycle(this.LLILLJJLI, null, false).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        C19EG c19eg = this.LLILLJJLI;
        return new C688120Qyw(c19eg, IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false), null);
    }

    public ViewOnClickListenerC1600510rkf(Context context) {
        this.LL = context;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        this.LLILLJJLI = c19egLIZIZ;
        this.LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(660));
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1870));
        this.LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(661));
        this.LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(659));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(658));
        this.LLIZ = c01gwLIZIZ;
        InterfaceC1055110dYz interfaceC1055110dYz = new InterfaceC1055110dYz() { // from class: X.0rO1
            @Override // X.InterfaceC1583780rJg
            public final String getHoxNodeTag() {
                return "";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeHide(Bundle bundle) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("topHoxVisibleObserver onNodeHide fromTabName = ");
                sbLIZ.append(this.LL.LLIZLLLIL);
                C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ));
                TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LL.LL));
                tabChangeManagerLIZ.CQ2();
                tabChangeManagerLIZ.LLILLL = false;
                tabChangeManagerLIZ.LLILZIL = null;
                C891780Yye.LIZLLL = "click_button_icon";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeShow(Bundle bundle) {
                ViewOnClickListenerC1600510rkf viewOnClickListenerC1600510rkf = this.LL;
                viewOnClickListenerC1600510rkf.LLIZLLLIL = ((BaseScrollSwitchStateManager) viewOnClickListenerC1600510rkf.LLILZ.getValue()).LLJJIJIL;
                if (!C1585030rLh.LJIJI("NOTIFICATION")) {
                    C891780Yye.LIZLLL = "click_button_icon";
                } else if (!Intrinsics.LJFF(C891780Yye.LIZLLL, "click_top_icon")) {
                    C891780Yye.LIZLLL = "slide";
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("topHoxVisibleObserver onNodeShow fromTabName = ");
                sbLIZ.append(this.LL.LLIZLLLIL);
                sbLIZ.append(", enterMethod = ");
                sbLIZ.append(C891780Yye.LIZLLL);
                C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ));
                ViewOnClickListenerC1600510rkf viewOnClickListenerC1600510rkf2 = this.LL;
                viewOnClickListenerC1600510rkf2.LIZ(viewOnClickListenerC1600510rkf2.LLIZLLLIL);
                ViewOnClickListenerC1600510rkf viewOnClickListenerC1600510rkf3 = this.LL;
                viewOnClickListenerC1600510rkf3.LIZIZ(viewOnClickListenerC1600510rkf3.LLIZLLLIL);
                C891780Yye.LJ = false;
                TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LL.LL));
                tabChangeManagerLIZ.LLILZIL = (String) this.LL.LLIZ.getValue();
                tabChangeManagerLIZ.LLILLL = true;
            }
        };
        if (C1585030rLh.LJIJI((String) c01gwLIZIZ.getValue())) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init when top ");
            sbLIZ.append(c19egLIZIZ);
            C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ));
            Hox.LLJILJIL.LIZ(c19egLIZIZ).wQ2("NOTIFICATION", interfaceC1055110dYz);
            C486860J7k.LIZIZ(c19egLIZIZ).HQ2(c19egLIZIZ, new Observer() { // from class: X.0ZC9
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Number) obj).intValue() == 1) {
                        C1618630sDt c1618630sDt = C1618630sDt.LIZIZ;
                        if (c1618630sDt.isShowing()) {
                            c1618630sDt.LIZ();
                        }
                    }
                }
            });
        }
    }

    public final void LIZ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BottomNotificationObserver", "onPageSelected");
        C818480W8w.LIZ("mus_new_notification");
        C1904370zel.LIZ.getClass();
        C1904370zel.LIZIZ();
        IMediaMsgSendManager iMediaMsgSendManager = (IMediaMsgSendManager) PluggableExtentionKt.pluggableSpiForReal(IMediaMsgSendManager.class);
        if (iMediaMsgSendManager != null) {
            iMediaMsgSendManager.init();
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIILIIL().LIZ();
        C1903870zdx.LIZ.getClass();
        C1903870zdx.LIZIZ();
        C1904490zex.LJFF.LJ();
        C844470XAv.LIZ.getClass();
        C810650Vr5.LIZ(C844470XAv.LIZ(), "message", "click");
        C1598660rhg.LIZ.getClass();
        C1599560rj8 c1599560rj8 = C1598660rhg.LJ;
        if (c1599560rj8.LIZ(-1)) {
            c1599560rj8.LIZJ(0);
            C1598730rhn c1598730rhn = C1598660rhg.LIZLLL;
            c1598730rhn.LIZIZ = true;
            c1598730rhn.LIZ = System.currentTimeMillis();
        }
        SystemClock.uptimeMillis();
        boolean z = PreloadInboxTask.LL;
        C1903370zd9.LIZJ();
        C614770O9j.LIZIZ.LIZ().LIZJ("OnInboxSelected");
        C1903780zdo.LIZJ(998);
        C1618630sDt c1618630sDt = C1618630sDt.LIZIZ;
        c1618630sDt.LJ();
        c1618630sDt.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected curTabName = ");
        sbLIZ.append(str);
        C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(str, "NOTIFICATION") && (!C1585030rLh.LJIJI((String) this.LLIZ.getValue()) || !C891780Yye.LJ)) {
            ((IMainPageFragment) this.LLILZIL.getValue()).fp();
        }
        ((IEnterFromService) this.LLILZLL.getValue()).setEnterFrom("NOTIFICATION");
        FollowFeedServiceImpl.LJIL().LIZLLL();
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJJIIJ();
    }

    public final void LIZIZ(String str) {
        PopupInstanceConfig popupInstanceConfig;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageShown enterFrom = ");
        sbLIZ.append(((IEnterFromService) this.LLILZLL.getValue()).getEnterFrom());
        C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ));
        if (((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJ()) {
            SaveInfoDialogService.createISaveInfoDialogServicebyMonsterPlugin(false).tryShowDialog("notification_page", AFwS213S0000000_24.get$arr$(664), AFwS213S0000000_24.get$arr$(665));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPageShown curTabName = ");
        sbLIZ2.append(str);
        C1720106oR.LJI("BottomNotificationObserver", C2188811AlT.LIZIZ(sbLIZ2));
        if (str != null && C889930Yvf.LIZ.LIZJ() != C05RV.BUSINESS_INBOX) {
            ((IMainPageFragment) this.LLILZIL.getValue()).C8(str, (String) this.LLIZ.getValue());
        }
        if (C824390WVp.LIZJ(this.LL) && ((Boolean) GuideOutPushExperiment.LJIIJ.getValue()).booleanValue() && C1903780zdo.LJIIJ(C1904270zeb.LIZ, C1904270zeb.LIZLLL, C1904270zeb.LIZIZ, 7) > 0) {
            if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("inbox");
                unifiedAuthPopupConfigLIZJ.setSceneId("inbox_page_show");
                unifiedAuthPopupConfigLIZJ.setEnterFrom("notification_page");
                unifiedAuthPopupConfigLIZJ.setPopupTriggerId("social_338_inbox");
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                    popupInstanceConfig.setPopupCombinationType(1);
                }
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(this.LL, null, unifiedAuthPopupConfigLIZJ);
            } else {
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context = this.LL;
                C1917290zzb c1917290zzb = new C1917290zzb(null, "notification_page", null, "inbox", null, null, null, null, "social_338_inbox", 4085);
                c1917240zzW.getClass();
                C1917240zzW.LJII(context, c1917290zzb, null);
            }
        }
        LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1600510rkf.onClick(android.view.View):void");
    }
}
