package X;

import Y.ACListenerS125S0200000_22;
import Y.ACListenerS156S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS671S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0nej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1443070nej implements InterfaceC1442990neb {
    public final C19EG LL;
    public final C1439050nYF LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;
    public final C1443330nf9 LLILZIL;
    public final AwemeDraft LLILZLL;
    public final C1439700nZI LLIZ;
    public C1443050neh LLIZLLLIL;
    public final boolean LLJ;
    public int LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;

    @Override // X.InterfaceC1442990neb
    public void LJJI() {
        String str;
        PublishFailureReason publishFailureReason;
        C1434650nR9 c1434650nR9;
        int i;
        C1434650nR9 c1434650nR92;
        AITheaterProfileService aITheaterProfileService;
        InterfaceC550750Lir interfaceC550750LirG9;
        C1439650nZD.LJI = true;
        LIZ();
        C1443330nf9 c1443330nf9 = this.LLILZIL;
        boolean z = this.LLJILJIL;
        C786410Ut5.LJZ(z ? 0 : 8, c1443330nf9.LLILZIL);
        if (z) {
            FrameLayout frameLayout = c1443330nf9.LLILZIL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            frameLayout.setBackground(c384050F3z.LIZ(c1443330nf9.getContext()));
        }
        if (!this.LLILZIL.getShouldOptimizePostFailedPush() || this.LLILZIL.getOptimizePostErrorMsg()) {
            final AwemeDraft awemeDraft = this.LLILZLL;
            C0MZ9.LJIIIIZZ(awemeDraft, new VideoCoverConfig(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0nek
                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i2) {
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (C123100dR.LIZ(awemeDraft.LIZ.paidContentModel.getCollectionId())) {
                        this.LLILZIL.LIZJ(bitmap, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C418440Gaw.LIZIZ(2), true);
                    } else {
                        this.LLILZIL.LIZJ(bitmap, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61)), C418440Gaw.LIZIZ(4), false);
                    }
                }
            });
            if (this.LLJI == 3) {
                this.LLILZIL.setRetryVisibility(8);
            }
            this.LLILZIL.LIZ(null);
        } else {
            C0MZ9.LJIIIIZZ(this.LLILZLL, new VideoCoverConfig(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0neo
                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i2) {
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    this.LIZ.LLILZIL.LIZ(bitmap);
                }
            });
        }
        if (this.LLILZLL.LIZ.aigcBusinessModel.aiTheaterModel != null && (aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null)) != null && (interfaceC550750LirG9 = aITheaterProfileService.g9()) != null) {
            interfaceC550750LirG9.LJIILL();
        }
        C0LAB.LJIIIZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLILZLL.LIZ());
        C559510Lwz.LIZ(c0lab, this.LLILZLL, "push");
        c0lab.LIZ(2, "is_new_style");
        c0lab.LJ("shoot_way", this.LLILZLL.LJJJJIZL.shootWay);
        c0lab.LIZ(this.LLILZLL.LIZ.postPageModel.isDirectPublishByCC ? 1 : 0, "is_cc_direct_post");
        c0lab.LIZ(this.LLILZLL.LIZ.postPageModel.isFromCC, "is_from_cc");
        PublishFailureReason publishFailureReason2 = this.LLILLJJLI.LIZIZ;
        if (publishFailureReason2 == null) {
            str = "null_cause";
        } else if (publishFailureReason2.isServerException) {
            str = "api_error";
        } else {
            C1434650nR9 c1434650nR93 = publishFailureReason2.cause;
            if (c1434650nR93 == null || !c1434650nR93.isCauseByNoSpaceLeft()) {
                C1434650nR9 c1434650nR94 = publishFailureReason2.cause;
                str = (c1434650nR94 == null || !c1434650nR94.isUserNetworkBad()) ? "default" : "user_network_bad";
            } else {
                str = "no_space_left";
            }
        }
        c0lab.LJ("reason", str);
        C20684815ws.LJIILLIIL("publish_retry_show", c0lab.LIZ);
        PublishFailureReason publishFailureReason3 = this.LLILLJJLI.LIZIZ;
        if (((publishFailureReason3 != null && (c1434650nR92 = publishFailureReason3.cause) != null && c1434650nR92.getOriginErrorCode() == 3013046) || ((publishFailureReason = this.LLILLJJLI.LIZIZ) != null && (c1434650nR9 = publishFailureReason.cause) != null && c1434650nR9.getOriginErrorCode() == 3013045)) && ((i = this.LLJI) == 4 || i == 5)) {
            C1434650nR9 c1434650nR95 = this.LLILLJJLI.LIZIZ.cause;
            String str2 = (c1434650nR95 == null || c1434650nR95.getOriginErrorCode() != 3013046) ? "account" : "request";
            C1434650nR9 c1434650nR96 = this.LLILLJJLI.LIZIZ.cause;
            this.LLJIJIL = LJI(c1434650nR96 != null ? c1434650nR96.getCause() : null);
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LIZIZ(System.currentTimeMillis(), "post_failed_timestamp");
            c0lab2.LJ("log_id", this.LLJIJIL);
            c0lab2.LJ("punish_type", str2);
            c0lab2.LIZ(0, "is_story");
            C20684815ws.LJIILLIIL("post_appeal_notice_show", c0lab2.LIZ);
        }
        if (C123100dR.LIZ(this.LLILZLL.LIZ.paidContentModel.getCollectionId())) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "if_success");
            c2344009Gk.LJIIIIZZ("entry_point", this.LLILZLL.LIZ.paidContentModel.getEntryPoint());
            c2344009Gk.LJIIIIZZ("collection_id", this.LLILZLL.LIZ.paidContentModel.getCollectionId());
            c2344009Gk.LIZJ(this.LLILZLL.id, "item_id");
            C20684815ws.LJIILLIIL("show_series_video_upload_status_toast", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC1442990neb
    public final void setVisibility(boolean z) {
    }

    public void LIZ() {
        int i;
        int i2;
        List<SingleImageData> imageList;
        C1434650nR9 c1434650nR9;
        int size = 1;
        if (this.LLILLJJLI.LIZ.LJIILL()) {
            PublishFailureReason publishFailureReason = this.LLILLJJLI.LIZIZ;
            if (!Intrinsics.LJFF((publishFailureReason == null || (c1434650nR9 = publishFailureReason.cause) == null) ? null : c1434650nR9.getStage(), EnumC1434770nRL.AIGC_AUTH.toString())) {
                this.LLILZIL.setText(this.LL.getResources().getString(2131829606), this.LL.getResources().getQuantityString(2131755171, 1, 1));
                return;
            }
        }
        if (((Boolean) C1430330nKB.LIZ.getValue()).booleanValue() || (i2 = this.LLJI) == 4 || i2 == 5) {
            if (!this.LLJ || (i = this.LLJI) == 4 || i == 5) {
                return;
            }
            this.LLILZIL.setText(this.LL.getString(2131845589), "");
            this.LLILZIL.setOptimizePostErrorMsg(true);
            this.LLJI = 3;
            return;
        }
        if (this.LLILZLL.LJIIL()) {
            if (!this.LLILZLL.LJIILL()) {
                this.LLILZIL.setText(this.LL.getString(2131829548), "");
                return;
            }
            ImageAlbumData imageAlbumData = this.LLILZLL.LJJJJIZL.imageAlbumData;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            }
            this.LLILZIL.setText(this.LL.getResources().getQuantityString(2131755377, size), "");
        }
    }

    public final void LIZLLL() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", "publish");
        c0lab.LJ("creation_id", this.LLILZLL.LIZ());
        c0lab.LIZ(2, "is_new_style");
        c0lab.LJ("enter_from", "toast");
        C559510Lwz.LIZ(c0lab, this.LLILZLL, "push");
        C20684815ws.LJIILLIIL("publish_retry", c0lab.LIZ);
    }

    public void LJII() {
        Object c098200Yq;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) {
            return;
        }
        String str = this.LLJILJILJ;
        if (C123100dR.LIZ(str)) {
            this.LLILZ = true;
            LJIILIIL(false, false);
            SmartRouter.buildRoute(this.LL, str).open();
        }
        if (this.LLJI == 3) {
            return;
        }
        this.LLILZ = true;
        LJIILIIL(false, false);
        C1439650nZD.LIZJ = true;
        switch (this.LLJI) {
            case 0:
                LJFF();
                break;
            case 1:
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().openDraftActivity(this.LL, new Bundle());
                break;
            case 2:
                C0CHQ.LIZ().LJI().LJJ(this.LL, this.LLILZLL, 14, null);
                break;
            case 4:
                String str2 = (String) C2507309s7.LIZ.getValue();
                if (C123100dR.LIZ(str2)) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL, str2);
                    smartRouteBuildRoute.withParam("log_id", this.LLJIJIL);
                    smartRouteBuildRoute.open();
                }
                LIZIZ("request");
                break;
            case 5:
                String str3 = (String) C2507209s6.LIZ.getValue();
                if (C123100dR.LIZ(str3)) {
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LL, str3);
                    smartRouteBuildRoute2.withParam("log_id", this.LLJIJIL);
                    smartRouteBuildRoute2.open();
                }
                LIZIZ("account");
                break;
            case 6:
                C0CHQ.LIZ().LJI().LJJ(this.LL, this.LLILZLL, 15, null);
                break;
            case 7:
                SmartRouter.buildRoute(this.LL, "//setting/diskmanager_compose").open();
                break;
            case 8:
                C1548820qPI.LIZLLL("idvBindingPageResult", new InterfaceC1141530foN() { // from class: X.0nel
                    @Override // X.InterfaceC1141530foN
                    public final void mh2(C262100zr c262100zr) {
                        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                        if (interfaceC1107590evd != null && C1871910yoP.LIZIZ(interfaceC1107590evd, "success", false)) {
                            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "OTPVerifyExp", "publish retry");
                            this.LL.LJFF();
                        }
                        C1548820qPI.LJIIIIZZ("idvBindingPageResult", this);
                    }
                });
                String string = this.LL.getString(R.string.ebc);
                try {
                    c098200Yq = URLEncoder.encode(string, "UTF-8");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String str4 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                if (str4 != null) {
                    string = str4;
                }
                SmartRouter.buildRoute(this.LL, "aweme://webview_popup/?container_bg_color_dark=000000&container_bg_color_light=FFFFFF&disable_outside_click_close=0&enable_pull_down_close=1&enable_relative_calculation=1&gravity=bottom&height=400&keyboard_adjust=2&keyboard_compat=1&landscape_gravity=bottom&landscape_height=400&landscape_width=100%25&min_margin_top=10%25&radius=12&show_mask=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Fidv_core%2Fwallet%3Fpassport_ticket%3Ddefault_1p_bind_scene%26page%3Dpublish%26use_spark%3D1%26view%3Dmobile_only%26phoneTitle%3D" + string).open();
                break;
        }
    }

    @Override // X.InterfaceC1442990neb
    public final boolean isShowing() {
        return this.LLILZIL.LLIZLLLIL;
    }

    public final void LJFF() {
        LIZLLL();
        C0CHQ.LIZ().getPublishService().LJIIL().LJFF(this.LL, this.LLILZLL, this.LLILLJJLI.LIZIZ);
        C1439700nZI c1439700nZI = this.LLIZ;
        if (c1439700nZI != null) {
            c1439700nZI.LIZLLL.execute(new ARunnableS91S0200000_22(c1439700nZI, this.LLILLJJLI.LIZIZ, 48));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final Pair<String, String> getText() {
        return IUploadRecoverInfoStore.DefaultImpls.getText(this);
    }

    @Override // X.InterfaceC1442990neb
    public final C19EG getActivity() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final int getJumpTo() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final String getSchema() {
        return this.LLJILJILJ;
    }

    public static String LJI(Throwable th) {
        LogPbBean logPbBean;
        if (th instanceof C0XIR) {
            Object rawResponse = ((C0XIR) th).getRawResponse();
            if ((rawResponse instanceof CreateAwemeResponse) && (logPbBean = ((CreateAwemeResponse) rawResponse).logPbBean) != null) {
                String imprId = logPbBean.getImprId();
                if (imprId == null) {
                    return "empty_log_id";
                }
                return imprId;
            }
            return "";
        }
        if (th instanceof C1435220nS4) {
            return LJI(th.getCause());
        }
        if (th instanceof C1431180nLY) {
            return LJI(((C1431180nLY) th).getCause());
        }
        return "";
    }

    public final void LIZIZ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis(), "post_failed_timestamp");
        c0lab.LJ("log_id", this.LLJIJIL);
        c0lab.LJ("punish_type", str);
        c0lab.LIZ(0, "is_story");
        C20684815ws.LJIILLIIL("post_appeal_notice_click", c0lab.LIZ);
    }

    public final void LIZJ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        C559510Lwz.LIZ(c0lab, this.LLILZLL, "push");
        c0lab.LJ("creation_id", this.LLILZLL.LIZ());
        c0lab.LJ("enter_from", "toast");
        c0lab.LIZ(2, "is_new_style");
        C20684815ws.LJIILLIIL("publish_retry", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void isBackUp(boolean z) {
        this.LLILZIL.setOptimizePostErrorMsg(!z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setHintLayerEnabled(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setJumpTo(int i) {
        this.LLJI = i;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setSchema(String str) {
        this.LLJILJILJ = str;
    }

    public void LJ(boolean z, boolean z2) {
        String strLIZJ;
        C1439650nZD.LJI = false;
        if (!this.LLILZ && !z && !z2) {
            C0CHQ.LIZ().getPublishService().LJIIL().LIZIZ(C13BV.INSTANCE);
        }
        if (this.LLILZIL.LLIZLLLIL) {
            if (this.LLILLL) {
                if (!this.LLILZLL.LJIILL() || this.LLILZ || z2) {
                    C0CHQ.LIZ().getPublishService().LJIIL();
                    C1436830nUf.LJIJI(new C572660Md6(this.LLILZLL));
                }
            } else if (!z) {
                C0CHQ.LIZ().getPublishService().LJIIL().LIZJ();
            }
            if (!this.LLILZ && !z2 && (strLIZJ = this.LLILZLL.LIZJ()) != null) {
                C1435600nSg.LJIIIZ(strLIZJ);
            }
            C1444780nhU.LIZ();
            C201955140j.LJIIL("Publish | remove recover path by dismiss panel");
        }
        C1443050neh c1443050neh = this.LLIZLLLIL;
        if (c1443050neh != null) {
            C0CHQ.LIZ().LJI().LIZ().unregisterListener(c1443050neh);
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC1442990neb
    public final void LJIILIIL(boolean z, boolean z2) {
        this.LLILZIL.LIZIZ(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setText(String str, String str2) {
        this.LLILZIL.setText(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0neh, com.ss.android.ugc.aweme.services.draft.IDraftListener] */
    public C1443070nej(C19EG c19eg, C1439050nYF c1439050nYF, boolean z) {
        String collectionId;
        this.LL = c19eg;
        this.LLILLJJLI = c1439050nYF;
        this.LLILLL = z;
        C1443330nf9 c1443330nf9 = new C1443330nf9(c19eg);
        c1443330nf9.setDurationTime(C0C64.LJIILLIIL().LJIJ(31744, 10, "tool_enable_upload_recover_panel_to_push_duration", true));
        this.LLILZIL = c1443330nf9;
        AwemeDraft awemeDraft = c1439050nYF.LIZ;
        this.LLILZLL = awemeDraft;
        this.LLJIJIL = "";
        String strLIZJ = awemeDraft.LIZJ();
        if (strLIZJ != null && !z) {
            C1439700nZI c1439700nZI = new C1439700nZI(c19eg, strLIZJ);
            this.LLIZ = c1439700nZI;
            c1439700nZI.LIZJ = c1439700nZI.LIZLLL.submit(CallableC535380KzA.LL);
        }
        ?? r2 = new IDraftListener() { // from class: X.0neh
            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onDeleted(AwemeDraft awemeDraft2) {
                if (TextUtils.equals(awemeDraft2.LIZJ(), this.LIZ.LLILZLL.LIZJ())) {
                    this.LIZ.LJIILIIL(false, false);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftListener
            public final void onUpdated(IDraftListener.UpdateParams updateParams) {
                IDraftListener.DefaultImpls.onUpdated(this, updateParams);
            }
        };
        this.LLIZLLLIL = r2;
        C0CHQ.LIZ().LJI().LIZ().registerListener(r2);
        c1443330nf9.LLJJIII = new AwS423S0200000_22(c1443330nf9, new AwS566S0100000_22(this, 352), 37);
        View.OnClickListener aCListenerS156S0100000_22 = new ACListenerS156S0100000_22(c1443330nf9, 22);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS156S0100000_22) : aCListenerS156S0100000_22);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1443330nf9);
        }
        c1443330nf9.setOnClickListener(aVar);
        this.LLJ = ComplianceServiceProvider.LJFF().LIZJ(1);
        C1442930neV.LIZ.getClass();
        boolean z2 = false;
        if (!C0CHQ.LIZ().getAccountService().LJIIJJI() && ((collectionId = awemeDraft.LIZ.paidContentModel.getCollectionId()) == null || collectionId.length() == 0)) {
            z2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_retry_push_after_post_fail", true) == 1;
        }
        c1443330nf9.setShouldOptimizePostFailedPush(z2);
        c1443330nf9.setDismissListener(new AwS671S0100000_22(this, 1));
        C786410Ut5.I7(new ACListenerS125S0200000_22(c1443330nf9, new AwS566S0100000_22(this, 353), 3), c1443330nf9.LLILLJJLI);
    }
}
