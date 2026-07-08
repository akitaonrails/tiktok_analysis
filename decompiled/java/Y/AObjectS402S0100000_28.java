package Y;

import X.C10JP;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1904840zfW;
import X.C1917290zzb;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C824390WVp;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.GuideOutPushUGNewExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AObjectS402S0100000_28 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        AppLanguageListFragment appLanguageListFragment = (AppLanguageListFragment) aObjectS402S0100000_28.l0;
        String str = AppLanguageListFragment._pnsPageId;
        appLanguageListFragment.getClass();
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZLLL;
    }

    public static final Object invoke$1(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aObjectS402S0100000_28.l0;
        if (!scanQRCodeActivityV2.LLJL) {
            scanQRCodeActivityV2.LLLZ();
            scanQRCodeActivityV2.LLJLL = true;
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS402S0100000_28.l0;
        String str = ScanQRCodeActivityV2._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LJII;
    }

    public static final Object invoke$3(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        String str;
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aObjectS402S0100000_28.l0;
        fullFeedFragmentPanel.getClass();
        INoticeService iNoticeService = (INoticeService) ServiceManager.get().getService(INoticeService.class);
        if (!((IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class)).LIZ(false)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResume(hasShared: ");
            sbLIZ.append(((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLJJL());
            sbLIZ.append(")");
            C2188811AlT.LIZIZ(sbLIZ);
            if (((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLJJL()) {
                String str2 = "share_video";
                if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
                    if (iNoticeService.LLFII()) {
                        str = "share_out_app_back_video";
                    } else {
                        str = "share_out_app_back_profile";
                        str2 = "share_profile";
                    }
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("share_out_app_back");
                    unifiedAuthPopupConfigLIZJ.setSceneStatus(0);
                    unifiedAuthPopupConfigLIZJ.setSceneId(str);
                    unifiedAuthPopupConfigLIZJ.setEnterFrom(fullFeedFragmentPanel.C7(true));
                    unifiedAuthPopupConfigLIZJ.setTrigger(str2);
                    unifiedAuthPopupConfigLIZJ.setAvatar(iNoticeService.LJJJ());
                    unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_follow_feed");
                    List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                    if (list != null && list.size() > 0) {
                        PopupInstanceConfig popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0);
                        popupInstanceConfig.setPopupCombinationType(1);
                        popupInstanceConfig.popupFiltersConfig.setLoginStatusCheck(0);
                    }
                    Activity activity = fullFeedFragmentPanel.activity;
                    if (activity != null) {
                        ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activity, null, unifiedAuthPopupConfigLIZJ);
                    }
                } else if (!C824390WVp.LIZJ(fullFeedFragmentPanel.getContext()) && ((Boolean) GuideOutPushUGNewExp.LJ.getValue()).booleanValue()) {
                    if (!iNoticeService.LLFII()) {
                        str2 = "share_profile";
                    }
                    iNoticeService.LJZL(fullFeedFragmentPanel.activity, new C1917290zzb("normal", fullFeedFragmentPanel.C7(true), "", str2, iNoticeService.LJJJ(), "bottom", 0L, 0L, "", null, null, ""));
                }
            }
        }
        iNoticeService.LJLJL();
        return null;
    }

    public static final Object invoke$4(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        C10JP c10jp = (C10JP) aObjectS402S0100000_28.l0;
        if (c10jp != null) {
            c10jp.onDismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        ((EmptyGuideV2) aObjectS402S0100000_28.l0).LJIIJ();
        return null;
    }

    public static final Object invoke$6(AObjectS402S0100000_28 aObjectS402S0100000_28) {
        return Keva.getRepo(((C1904840zfW) aObjectS402S0100000_28.l0).LIZ);
    }

    public AObjectS402S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
