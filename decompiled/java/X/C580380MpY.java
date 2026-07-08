package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580380MpY {
    public static final /* synthetic */ int LIZIZ = 0;
    public DialogC1389620mGW LIZ;

    public final void LIZIZ() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C341750DaX(this, null), 3);
    }

    public static void LIZJ(boolean z, ShareKitPanel shareKitPanel) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "trim_page");
        c2344009Gk.LJIIIIZZ("channel", shareKitPanel.getClientKey());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_continue");
        c2344009Gk.LJIIIIZZ("effect_resource_id", shareKitPanel.getEffectResourceId());
        c2344009Gk.LJIIIIZZ("share_panel_option", shareKitPanel.getSharePanelOption());
        c2344009Gk.LJ(shareKitPanel.getShareMediaType(), "share_media_type");
        C20684815ws.LJIILLIIL("share_effect_error_action", c2344009Gk.LIZ);
    }

    public static void LIZLLL(Activity activity, C1402840mbq c1402840mbq, C1B4P c1b4p, String str, final InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        final C19EG c19eg;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activity2 = activity;
        c1402840mbq.mTargetSceneType = 1;
        Bundle shareRequestBundle = c1402840mbq.getShareRequestBundle();
        C786410Ut5.LJJJI("creation_id", str, shareRequestBundle);
        C786410Ut5.LJJJI("shoot_way", C580640Mpy.LIZJ(c1402840mbq), shareRequestBundle);
        C786410Ut5.LJJJI("enter_from", "open_platform_share", shareRequestBundle);
        C786410Ut5.LJJIZ(shareRequestBundle, "open_platform_share_context", c1402840mbq);
        String strLIZJ = C580640Mpy.LIZJ(c1402840mbq);
        if (Intrinsics.LJFF(strLIZJ, "sdk")) {
            z = false;
            IAnchorListService iAnchorListService = (IAnchorListService) PluggableExtentionKt.pluggableSpi$default(IAnchorListService.class, false, false, false, 14, null);
            if (iAnchorListService != null) {
                iAnchorListService.LIZJ(c1b4p.LIZIZ.size(), strLIZJ, str, c1402840mbq.mAppName);
            }
        } else {
            z = false;
            IAnchorListService iAnchorListService2 = (IAnchorListService) PluggableExtentionKt.pluggableSpi$default(IAnchorListService.class, false, false, false, 14, null);
            if (iAnchorListService2 != null) {
                iAnchorListService2.LJ(c1b4p.LIZIZ.size(), strLIZJ, str);
            }
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            activity2 = activityLIZ;
        }
        if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openGotoNextService().gotoNextPage(c19eg, z, shareRequestBundle, c1b4p.LIZIZ, new IPageToFinish() { // from class: X.0Cd1
                @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                public final void onFinish(boolean z2) {
                    if (!z2) {
                        C1233040iBy c1233040iBy = new C1233040iBy(c19eg);
                        c1233040iBy.LIZIZ(2131848737);
                        c1233040iBy.LIZLLL();
                    }
                    if (C23118094a.LJIIIIZZ(interfaceC1364105Vn.getContext())) {
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = interfaceC1364105Vn;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC1364105Vn2.resumeWith(bool);
                    }
                }
            });
        }
    }

    public static void LJ(Activity activity, AsyncAVService asyncAVService, C1402840mbq c1402840mbq, C1B4P c1b4p, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str2;
        int i;
        boolean z = true;
        if (c1b4p.LIZIZ.size() <= 1) {
            z = false;
        }
        EditConfig.Builder builder = new EditConfig.Builder();
        builder.shootWay(C580640Mpy.LIZJ(c1402840mbq));
        builder.musicOrigin(C580640Mpy.LIZIZ(c1402840mbq.mClientKey));
        builder.creationId(str);
        builder.publishSetting(c1402840mbq.mPublishSettings);
        MusicContent musicContent = c1402840mbq.mMusicContent;
        Integer numValueOf = null;
        if (musicContent != null) {
            str2 = musicContent.musicId;
        } else {
            str2 = null;
        }
        builder.musicIdExtra(str2);
        MusicContent musicContent2 = c1402840mbq.mMusicContent;
        if (musicContent2 != null) {
            numValueOf = Integer.valueOf(musicContent2.musicStartTime);
        }
        builder.musicStartTimeExtra(numValueOf);
        builder.enterFrom("open_platform_share");
        builder.onEnterEdit(new AwS546S0100000_2(interfaceC1364105Vn, (InterfaceC1364105Vn<? super Boolean>) 20));
        String strLIZJ = C580640Mpy.LIZJ(c1402840mbq);
        if (Intrinsics.LJFF(strLIZJ, "sdk")) {
            IAnchorListService iAnchorListService = (IAnchorListService) PluggableExtentionKt.pluggableSpi$default(IAnchorListService.class, false, false, false, 14, null);
            if (iAnchorListService != null) {
                iAnchorListService.LIZJ(c1b4p.LIZIZ.size(), strLIZJ, str, c1402840mbq.mAppName);
            }
        } else {
            IAnchorListService iAnchorListService2 = (IAnchorListService) PluggableExtentionKt.pluggableSpi$default(IAnchorListService.class, false, false, false, 14, null);
            if (iAnchorListService2 != null) {
                iAnchorListService2.LJ(c1b4p.LIZIZ.size(), strLIZJ, str);
            }
        }
        if (z) {
            i = 4;
        } else {
            i = 2;
        }
        ShareConfig shareConfig = new ShareConfig(c1402840mbq, i);
        if (z) {
            shareConfig.setVideoList(c1b4p.LIZIZ);
        } else {
            shareConfig.setFile((String) ListProtector.get(c1b4p.LIZIZ, 0));
        }
        shareConfig.setAppName(c1402840mbq.mAppName);
        asyncAVService.uiService().editService().startEdit(activity, builder.build(), shareConfig);
    }

    public static void LIZ(C580380MpY c580380MpY, Activity activity, AsyncAVService asyncAVService, C1402840mbq c1402840mbq, C1B4P c1b4p, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        c580380MpY.getClass();
        int i = 1;
        if (c1b4p.LIZ != 1) {
            i = 2;
        }
        ShareKitPanel shareKitPanel = new ShareKitPanel(null, "green_screen", str, Integer.valueOf(i), c1402840mbq.mClientKey);
        C580390MpZ c580390MpZ = new C580390MpZ(c1402840mbq, c1b4p, c580380MpY, activity, str2, interfaceC1364105Vn, asyncAVService);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C580400Mpa(c1402840mbq, activity, c580380MpY, shareKitPanel, c580390MpZ, null), 3);
    }
}
