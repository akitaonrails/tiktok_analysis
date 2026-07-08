package X;

import Y.ACallableS434S0100000_31;
import Y.AObjectS374S0100000_31;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS13S1000000_21;
import Y.ARunnableS1S0011000_21;
import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionDuetRouterConfig;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15OG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OG {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJII;
    public ProgressDialogC1397770mTf LJIIIZ;
    public ProgressDialogC1399830mWz LJIIJ;
    public Activity LJIIJJI;
    public List<String> LJIILIIL;
    public Aweme LJIILL;
    public String LJIIZILJ;
    public String LJIJ;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public final DetailFeedService LJJIIZI;
    public final C15OI LJJIJ;
    public final ARunnableS121S0100000_21 LJJIJIIJI;
    public String LIZ = "duet";
    public String LIZIZ = "";
    public Map<String, String> LIZJ = Collections.emptyMap();
    public Effect LJI = null;
    public final String LJIIIIZZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().duetPublicDir();
    public C15OR LJIIL = new C15OR() { // from class: X.15OS
        @Override // X.C15OR
        public final void onFailed() {
        }

        @Override // X.C15OR
        public final void onSuccess() {
        }
    };
    public final BPEAHandler LJIILJJIL = new BPEAHandler(Looper.getMainLooper());
    public String LJIILLIIL = "";
    public boolean LJIJI = false;
    public MissionDuetRouterConfig LJIL = null;
    public DuetAndStitchRouterConfig LJJ = null;
    public boolean LJJI = false;
    public boolean LJJIFFI = false;
    public long LJJII = -1;
    public boolean LJJIIZ = false;

    public final void LJ() {
        C810560Vqw.LIZJ(new ARunnableS131S0100000_31(this, 114));
    }

    public final void LJFF() {
        if (this.LJIIJ != null) {
            return;
        }
        if (C0A19.LIZ() != 0) {
            EnumC1399900mX6 enumC1399900mX6 = EnumC1399900mX6.GONE;
            if (C0A19.LIZ() == 1) {
                enumC1399900mX6 = EnumC1399900mX6.VISIBLE_AFTER_5S;
            } else if (C0A19.LIZ() == 2) {
                enumC1399900mX6 = EnumC1399900mX6.VISIBLE_AFTER_10S;
            }
            this.LJIIJ = C1399870mX3.LIZ(new C1399880mX4(this.LJIIJJI, enumC1399900mX6, new InterfaceC1399840mX0() { // from class: X.15OO
                @Override // X.InterfaceC1399840mX0
                public final void LIZ() {
                    C15OG c15og = this.LIZ;
                    c15og.LJIJJ = true;
                    c15og.LJIIJ = null;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c15og.LJIIIIZZ(c2344009Gk);
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("click_cancel_loading", c2344009Gk.LIZ);
                }
            }, "has_cancel"));
        } else {
            this.LJIIJ = C1399870mX3.LIZ(new C1399880mX4(this.LJIIJJI, EnumC1399900mX6.GONE, null, "no_cancel"));
        }
        this.LJIIJ.LIZ();
        this.LJIIJ.setMessage(this.LJIIJJI.getResources().getString(2131832484));
        this.LJJIIJ = System.currentTimeMillis();
    }

    public final boolean LJI() {
        return TextUtils.equals("duet_page", this.LJIILLIIL);
    }

    public final void LJIIIZ() {
        if (C10IT.LIZ(this.LJIILL)) {
            LJIILIIL();
        } else {
            C15O7.LIZJ(new ACallableS434S0100000_31(this, 5)).LJ(new C20749016Hg(this, 3), C15O7.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15OG.LJIILIIL():void");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.15OI] */
    public C15OG() {
        DetailFeedService detailFeedService = (DetailFeedService) PluggableExtentionKt.pluggableSpi(DetailFeedService.class);
        Objects.requireNonNull(detailFeedService);
        this.LJJIIZI = detailFeedService;
        this.LJJIJ = new UIServiceCallback() { // from class: X.15OI
            @Override // com.ss.android.ugc.aweme.services.external.UIServiceCallback
            public final void postFail() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.UIServiceCallback
            public final boolean checkIsCanceled() {
                return this.LIZ.LJIJJ;
            }

            @Override // com.ss.android.ugc.aweme.services.external.UIServiceCallback
            public final void postSuccess() {
                C15OG c15og = this.LIZ;
                C15OR c15or = c15og.LJIIL;
                c15og.LJIILL.getAid();
                c15or.onSuccess();
                C2344009Gk c2344009Gk = new C2344009Gk();
                this.LIZ.LJIIIIZZ(c2344009Gk);
                c2344009Gk.LIZJ(1, "loading_status");
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("loading_finish", c2344009Gk.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.services.external.UIServiceCallback
            public final void preSuccess() {
                C15OG c15og = this.LIZ;
                c15og.LJII(c15og.LJJ, null, Boolean.TRUE);
                C15OG c15og2 = this.LIZ;
                MissionDuetRouterConfig missionDuetRouterConfig = c15og2.LJIL;
                if (missionDuetRouterConfig != null && missionDuetRouterConfig.missionId != null && c15og2.LJJII != -1) {
                    new C11BY().LJI("mission_duet_loading_finish", new Pair<>("duration", Long.valueOf(System.currentTimeMillis() - c15og2.LJJII)), new Pair<>("mission_id", Long.valueOf(c15og2.LJIL.missionId.longValue())));
                }
                this.LIZ.LIZIZ();
            }

            @Override // com.ss.android.ugc.aweme.services.external.UIServiceCallback
            public final void preFail(int i) {
                this.LIZ.LJ();
            }
        };
        this.LJJIJIIJI = new ARunnableS121S0100000_21(this, 96);
    }

    public final void LIZIZ() {
        ProgressDialogC1397770mTf progressDialogC1397770mTf;
        ProgressDialogC1399830mWz progressDialogC1399830mWz;
        if (C289380BVw.LIZ() && (progressDialogC1399830mWz = this.LJIIJ) != null) {
            C0FNV.LIZ(progressDialogC1399830mWz);
            this.LJIIJ = null;
        } else if (!C289380BVw.LIZ() && (progressDialogC1397770mTf = this.LJIIIZ) != null) {
            C0FNV.LIZ(progressDialogC1397770mTf);
            this.LJIIIZ = null;
        }
        Activity activity = this.LJIIJJI;
        if (activity != null && this.LJJI && this.LJJIFFI) {
            activity.finish();
            this.LJJIFFI = false;
        }
    }

    public final void LJIIIIZZ(C2344009Gk c2344009Gk) {
        String sourceId;
        String str;
        Aweme aweme;
        try {
            aweme = this.LJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (aweme != null && aweme.getVideo() != null) {
            sourceId = this.LJIILL.getVideo().getPlayAddrH264().getSourceId();
        } else {
            sourceId = null;
        }
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZIZ);
        if (LJI()) {
            str = "duet_page";
        } else {
            str = "duet";
        }
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("enter_from", this.LJIILLIIL);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LJJIIJ, "loading_duration");
        c2344009Gk.LJIIIIZZ("group_id", sourceId);
        c2344009Gk.LJIIIIZZ("content_source", "shoot");
        c2344009Gk.LJIIIIZZ("content_type", "video");
        c2344009Gk.LJFF("loading_type", "video");
    }

    public final void LJIIJJI(int i, C15OK c15ok) {
        boolean zLIZ = C299060Bns.LIZ();
        Activity activity = this.LJIIJJI;
        if (activity == null) {
            return;
        }
        if (this.LJJI) {
            LJII(this.LJJ, c15ok, Boolean.FALSE);
            C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS1S0011000_21(zLIZ, i, 0));
        } else if (zLIZ) {
            C1389880mGw c1389880mGw = new C1389880mGw(activity);
            c1389880mGw.LJIIIIZZ(i);
            c1389880mGw.LJIIJ();
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LJIIJJI);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LJIIL(String str, C15OK c15ok) {
        if (this.LJIIJJI == null) {
            return;
        }
        if (this.LJJI) {
            LJII(this.LJJ, c15ok, Boolean.FALSE);
            C786410Ut5.LJJZZIII(this.LJIILJJIL, new ARunnableS13S1000000_21(str, 1));
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LJIIJJI);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LIZJ(final Activity activity, final Aweme aweme, String str) {
        String str2;
        this.LJJIIJZLJL = System.currentTimeMillis();
        this.LJIIJJI = activity;
        CreativeToolsPluginService creativeToolsPluginServiceLIZ = C535670Kzd.LIZ();
        if (LJI()) {
            str2 = "duet_page";
        } else {
            str2 = "duet";
        }
        if (!creativeToolsPluginServiceLIZ.LIZJ(activity, str2, true)) {
            return;
        }
        this.LJIJJ = false;
        if (C10EU.LJIIIIZZ()) {
            LJIIJJI(2131832490, C15OK.CHILDREN_MODE);
            this.LJIIL.onFailed();
            LIZIZ();
            return;
        }
        this.LJIILL = aweme;
        this.LJIILLIIL = str;
        if (aweme != null && aweme.getAuthor() != null) {
            if (!C2354709Kn.LJIIZILJ()) {
                LJIIJJI(2131847054, C15OK.SD_CARD_NOT_AVAILABLE);
            } else if (C2354709Kn.LJIILL() < 20971520) {
                LJIIJJI(2131847055, C15OK.SD_CARD_NOT_ENOUGH_SPACE);
            } else if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(this.LJIILL.getMusic())) {
                if (this.LJIIJJI != null) {
                    LJIIJJI(2131847880, C15OK.COMMERCE_USER_NOT_COMMERCE_MUSIC);
                }
            } else {
                if (this.LJIIJJI != null) {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!C036E.LIZ.LIZIZ()) {
                        LJIIJJI(2131837963, C15OK.NO_INTERNET);
                        LIZIZ();
                        return;
                    }
                }
                if (C289380BVw.LIZ()) {
                    LJFF();
                } else {
                    if (this.LJIIIZ == null) {
                        Activity activity2 = this.LJIIJJI;
                        this.LJIIIZ = ProgressDialogC1397770mTf.LIZIZ(activity2, activity2.getResources().getString(2131832484));
                    }
                    this.LJIIIZ.setIndeterminate(false);
                    this.LJIIIZ.setProgress(0);
                    this.LJJIIJ = System.currentTimeMillis();
                }
                this.LJJII = System.currentTimeMillis();
                if (C178000mI.LIZ(1, C1383720m70.LIZ().permissionCheckCacheDuration, AwemeBizExtKt.getClientAcceptanceTime(aweme), aweme.getAid())) {
                    if (this.LJIL != null) {
                        new C11BY().LJIIJJI(0L, true);
                    }
                    LJIIIZ();
                    return;
                }
                C15O7.LIZJ(new ACallableS434S0100000_31(aweme, 4)).LJ(new InterfaceC2385309Wh() { // from class: X.15OH
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C15OG c15og = this.LIZ;
                        Activity activity3 = activity;
                        Aweme aweme2 = aweme;
                        c15og.getClass();
                        C1C7U.LIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$2L");
                        long jCurrentTimeMillis = System.currentTimeMillis() - c15og.LJJII;
                        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
                            if (!((CheckDuetReactPermissionResponse) c15o7.LJIIL()).allowCurrent) {
                                String errorHintWhenDisableDuetOrStitch = ((CheckDuetReactPermissionResponse) c15o7.LJIIL()).reason;
                                if (TextUtils.isEmpty(errorHintWhenDisableDuetOrStitch)) {
                                    errorHintWhenDisableDuetOrStitch = activity3.getResources().getString(2131826353);
                                }
                                IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
                                if (aweme2.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime() || (C729980SkG.LJIIIIZZ(aweme2) && aweme2.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.extendedDuetOrStitchTime())) {
                                    errorHintWhenDisableDuetOrStitch = iShortVideoConfigShortVideoConfig.getErrorHintWhenDisableDuetOrStitch(1);
                                }
                                if (c15og.LJIL != null) {
                                    new C11BY().LJIIJJI(jCurrentTimeMillis, false);
                                }
                                if (c15og.LJIIJJI != null) {
                                    c15og.LJIIL(errorHintWhenDisableDuetOrStitch, C15OK.SERVER_CHECK_DENY);
                                    c15og.LIZIZ();
                                    c15og.LJIIL.onFailed();
                                }
                            } else {
                                if (c15og.LJIL != null) {
                                    new C11BY().LJIIJJI(jCurrentTimeMillis, true);
                                }
                                C178000mI.LIZIZ(1, aweme2.getAid());
                                c15og.LJIIIZ();
                            }
                        } else {
                            String string = activity3.getResources().getString(2131837963);
                            if (c15og.LJIL != null) {
                                new C11BY().LJIIJJI(jCurrentTimeMillis, false);
                            }
                            if (c15og.LJIIJJI != null) {
                                c15og.LJIIL(string, C15OK.SERVER_CHECK_DENY);
                                c15og.LIZIZ();
                                c15og.LJIIL.onFailed();
                            }
                        }
                        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$2L");
                        return null;
                    }
                }, C15O7.LJIIIIZZ, null);
                return;
            }
        }
        this.LJIIL.onFailed();
        LIZIZ();
    }

    public final void LIZLLL(String str, Activity activity, String str2) {
        String str3;
        Activity activity2;
        this.LJJIIJZLJL = System.currentTimeMillis();
        this.LJIIJJI = activity;
        if (activity == null) {
            LJIIJJI(2131832490, C15OK.CONTEXT_NULL);
            return;
        }
        CreativeToolsPluginService creativeToolsPluginServiceLIZ = C535670Kzd.LIZ();
        if (LJI()) {
            str3 = "duet_page";
        } else {
            str3 = "duet";
        }
        if (!creativeToolsPluginServiceLIZ.LIZJ(activity, str3, true)) {
            return;
        }
        this.LJIJJ = false;
        if (C830060WhI.LIZ(str)) {
            LJIIJJI(2131832490, C15OK.AWEME_ID_UNAVAILABLE);
            this.LJIIL.onFailed();
            return;
        }
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(activity)) {
            LJIIJJI(2131832497, C15OK.DUAL_MODE);
            return;
        }
        if (this.LJIIJJI != null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                LJIIJJI(2131837963, C15OK.NO_INTERNET);
                return;
            }
        }
        this.LJIILLIIL = str2;
        if (LJI()) {
            this.LIZ = "duet_page";
        }
        if (C289380BVw.LIZ() && this.LJIIJ == null && this.LJIIJJI != null) {
            LJFF();
        } else if (!C289380BVw.LIZ() && this.LJIIIZ == null && (activity2 = this.LJIIJJI) != null) {
            ProgressDialogC1397770mTf progressDialogC1397770mTfLIZIZ = ProgressDialogC1397770mTf.LIZIZ(activity2, activity2.getResources().getString(2131832484));
            this.LJIIIZ = progressDialogC1397770mTfLIZIZ;
            progressDialogC1397770mTfLIZIZ.setIndeterminate(true);
            this.LJJIIJ = System.currentTimeMillis();
        }
        C810560Vqw.LJ(new C15OM(this, str, str2));
    }

    public final void LJII(DuetAndStitchRouterConfig duetAndStitchRouterConfig, C15OK c15ok, Boolean bool) {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            this.LIZIZ = UUID.randomUUID().toString();
        }
        if (duetAndStitchRouterConfig == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("shoot_way", "duet");
        c2344009Gk.LJIIIIZZ("enter_from", duetAndStitchRouterConfig.enterFrom);
        c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "is_success");
        DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AObjectS374S0100000_31(c2344009Gk, 2));
        if (c15ok != null) {
            c2344009Gk.LIZJ(c15ok.getCode(), "error_code");
            c2344009Gk.LJFF("error_message", c15ok.name());
            c2344009Gk.LJFF("config_aweme_id", duetAndStitchRouterConfig.awemeId);
            c2344009Gk.LJFF("actual_aweme_id", this.LJIILL.getAid());
            c2344009Gk.LJ(Boolean.valueOf(this.LJIILL.getMusic().isCommercialMusic()), "is_commercial_music");
        } else {
            c2344009Gk.LJFF("error_code", "");
            c2344009Gk.LJFF("error_message", "");
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("click_duet_or_stitch_button_result", c2344009Gk.LIZ);
    }

    public static void LIZ(Aweme aweme, String str, String str2, String str3, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("entrance_type", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("pre_entrance_type", str3);
        }
        int i2 = 0;
        if (aweme.getDuettedInfo() == null) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_duet_from_duet");
        c2344009Gk.LJFF("duet_from_item_id", aweme.getAid());
        if (aweme.getVideo() != null) {
            c2344009Gk.LIZJ(aweme.getVideo().getDuration(), "duet_from_video_duration");
        }
        c2344009Gk.LJFF("action_type", "click");
        if (z) {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "entrance_clickable");
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_shoot_entrance", c2344009Gk.LIZ);
    }

    public static void LJIIJ(Aweme aweme, String str, String str2, String str3, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("entrance_type", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("pre_entrance_type", str3);
        }
        int i2 = 0;
        if (aweme.getDuettedInfo() == null) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_duet_from_duet");
        c2344009Gk.LJFF("duet_from_item_id", aweme.getAid());
        if (aweme.getVideo() != null) {
            c2344009Gk.LIZJ(aweme.getVideo().getDuration(), "duet_from_video_duration");
        }
        if (z) {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "entrance_clickable");
        c2344009Gk.LJFF("action_type", "show");
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("duet_shoot_entrance", c2344009Gk.LIZ);
    }
}
