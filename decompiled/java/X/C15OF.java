package X;

import Y.ACallableS426S0100000_21;
import Y.ACallableS434S0100000_31;
import Y.ARunnableS1S0011000_21;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15OF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OF {
    public Activity LIZ;
    public Aweme LIZLLL;
    public ProgressDialogC1399830mWz LJ;
    public int LJFF;
    public String LJII;
    public AVMusic LJIIIIZZ;
    public final DetailFeedService LJIIJ;
    public final BPEAHandler LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public boolean LJIILL;
    public DuetAndStitchRouterConfig LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public final ACallableS426S0100000_21 LJJ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public final List<String> LJI = new ArrayList();
    public final String LJIIIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().stitchPublicDir();

    public final void LIZ() {
        ProgressDialogC1399830mWz progressDialogC1399830mWz = this.LJ;
        if (progressDialogC1399830mWz != null) {
            C0FNV.LIZ(progressDialogC1399830mWz);
        }
        this.LJ = null;
        if (this.LJIIZILJ && this.LJIJ) {
            Activity activity = this.LIZ;
            if (activity != null) {
                activity.finish();
            }
            this.LJIJ = false;
        }
    }

    public final void LJFF() {
        Aweme aweme = this.LIZLLL;
        if (aweme == null) {
            aweme = null;
        }
        if (C10IT.LIZLLL(aweme)) {
            LJIIIZ();
        } else {
            C15O7.LIZJ(new ACallableS434S0100000_31(this, 7)).LJ(new C20749016Hg(this, 5), C15O7.LJIIIIZZ, null);
        }
    }

    public final void LJI() {
        ProgressDialogC1399830mWz progressDialogC1399830mWzLIZ;
        Resources resources;
        if (this.LJ == null) {
            int iLIZ = C0A19.LIZ();
            EnumC1399900mX6 enumC1399900mX6 = iLIZ != 1 ? iLIZ != 2 ? EnumC1399900mX6.GONE : EnumC1399900mX6.VISIBLE_AFTER_10S : EnumC1399900mX6.VISIBLE_AFTER_5S;
            Activity activity = this.LIZ;
            String string = null;
            if (activity != null) {
                EnumC1399900mX6 enumC1399900mX62 = EnumC1399900mX6.GONE;
                progressDialogC1399830mWzLIZ = C1399870mX3.LIZ(enumC1399900mX6 == enumC1399900mX62 ? new C1399880mX4(activity, enumC1399900mX62, null, "no_cancel") : new C1399880mX4(activity, enumC1399900mX6, new InterfaceC1399840mX0() { // from class: X.15OJ
                    @Override // X.InterfaceC1399840mX0
                    public final void LIZ() {
                        this.LIZ.LJ = null;
                        C0LAB c0lab = new C0LAB();
                        C15OF c15of = this.LIZ;
                        c0lab.LJ("creation_id", c15of.LJIJI);
                        c0lab.LIZIZ(System.currentTimeMillis() - c15of.LJIJJ, "loading_duration");
                        Aweme aweme = c15of.LIZLLL;
                        c0lab.LJ("group_id", (aweme != null ? aweme : null).getVideo().getPlayAddrH264().getSourceId());
                        c0lab.LJ("content_source", "shoot");
                        c0lab.LJ("content_type", "video");
                        c0lab.LJ("loading_type", "video");
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("click_cancel_loading", c0lab.LIZ);
                    }
                }, "has_cancel"));
            } else {
                progressDialogC1399830mWzLIZ = null;
            }
            this.LJ = progressDialogC1399830mWzLIZ;
            if (progressDialogC1399830mWzLIZ != null) {
                progressDialogC1399830mWzLIZ.LIZ();
            }
            ProgressDialogC1399830mWz progressDialogC1399830mWz = this.LJ;
            if (progressDialogC1399830mWz != null) {
                Activity activity2 = this.LIZ;
                if (activity2 != null && (resources = activity2.getResources()) != null) {
                    string = resources.getString(2131832484);
                }
                progressDialogC1399830mWz.setMessage(string);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15OF.LJIIIZ():void");
    }

    public C15OF() {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(DetailFeedService.class, false, false, false, 14, null);
        if (objPluggableSpi$default == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LJIIJ = (DetailFeedService) objPluggableSpi$default;
        this.LJIIJJI = new BPEAHandler(Looper.getMainLooper());
        this.LJIJI = "";
        this.LJIIL = 20;
        float f = 20 / 99;
        this.LJIILJJIL = f;
        this.LJIILIIL = 1 - f;
        this.LJJ = new ACallableS426S0100000_21(this, 6);
    }

    public final void LIZLLL() {
        AVMusic aVMusic;
        if (C10EU.LJIIIIZZ()) {
            LJII(2131837963, C15OK.CHILDREN_MODE);
            LIZ();
            return;
        }
        this.LJFF = 99;
        if (this.LIZ != null) {
            this.LJIJI = UUID.randomUUID().toString();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_method", "click_stitch_button");
            c0lab.LJ("panel_source", this.LIZJ);
            c0lab.LJ("is_through_stitch_button", Intrinsics.LJFF(this.LIZJ, "true") ? "1" : CardStruct.IStatusCode.DEFAULT);
            c0lab.LJ("content_source", "shoot");
            c0lab.LJ("content_type", "video");
            Aweme aweme = this.LIZLLL;
            if (aweme == null) {
                aweme = null;
            }
            c0lab.LIZ(aweme.getVideo().getDuration(), "stitch_video_duration");
            DuetAndStitchRouterConfig duetAndStitchRouterConfig = this.LJIILLIIL;
            if (duetAndStitchRouterConfig != null) {
                DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AwS610S0100000_31(c0lab, 296));
            }
            Aweme aweme2 = this.LIZLLL;
            if (aweme2 == null) {
                aweme2 = null;
            }
            c0lab.LIZ(aweme2.aigcInfo.getAIGCLabelType(), "from_aigc_theme_status");
            c0lab.LJI(C1ER1.LIZIZ.d(this.LIZIZ));
            FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
            if (fromGroupPropService != null) {
                c0lab.LJ("from_group_id_prop_list", fromGroupPropService.LIZJ());
                c0lab.LJ("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
            }
            Aweme aweme3 = this.LIZLLL;
            if (aweme3 == null) {
                aweme3 = null;
            }
            Music music = aweme3.getMusic();
            C1449430noz c1449430noz = music != null ? new C1449430noz(String.valueOf(music.getId()), "stitch") : null;
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            String str = this.LJIJI;
            String str2 = this.LIZIZ;
            Aweme aweme4 = this.LIZLLL;
            if (aweme4 == null) {
                aweme4 = null;
            }
            iRecordMobService.LIZIZ(new C1449410nox(str, "stitch", str2, null, null, c1449430noz, AwemeExtKt.getAuthorUid(aweme4), null, 152), c0lab, null);
            Aweme aweme5 = this.LIZLLL;
            if (aweme5 == null) {
                aweme5 = null;
            }
            String requestId = aweme5.getRequestId();
            if (requestId != null && C123100dR.LIZ(requestId)) {
                String strLIZLLL = C584850Mwl.LIZ.LIZLLL(requestId);
                if (C123100dR.LIZ(strLIZLLL) && strLIZLLL != null && (aVMusic = this.LJIIIIZZ) != null) {
                    LogPbBean logPbBean = new LogPbBean(null);
                    logPbBean.setImprId(strLIZLLL);
                    aVMusic.setLogPb(logPbBean);
                }
            }
            String str3 = this.LJII;
            if (str3 == null) {
                str3 = null;
            }
            AVMusic aVMusic2 = this.LJIIIIZZ;
            String path = aVMusic2 != null ? aVMusic2.getPath() : null;
            boolean z = this.LJIILL;
            Aweme aweme6 = this.LIZLLL;
            if (aweme6 == null) {
                aweme6 = null;
            }
            User author = aweme6.getAuthor();
            Aweme aweme7 = this.LIZLLL;
            if (aweme7 == null) {
                aweme7 = null;
            }
            String aid = aweme7.getAid();
            Aweme aweme8 = this.LIZLLL;
            if (aweme8 == null) {
                aweme8 = null;
            }
            Music music2 = aweme8.getMusic();
            String idStr = music2 != null ? music2.getIdStr() : null;
            Aweme aweme9 = this.LIZLLL;
            if (aweme9 == null) {
                aweme9 = null;
            }
            int duration = aweme9.getVideo().getDuration();
            boolean z2 = this.LJIL;
            Aweme aweme10 = this.LIZLLL;
            if (aweme10 == null) {
                aweme10 = null;
            }
            final StitchParams stitchParams = new StitchParams(null, str3, aVMusic2, path, 0, z, idStr, author, aid, null, 0L, null, null, true, false, 0L, 0L, duration, false, new ArrayList(), new ArrayList(), z2, aweme10.aigcInfo.getAIGCLabelType(), 0L);
            stitchParams.setThroughStitchChain(Intrinsics.LJFF(this.LIZJ, "true"));
            stitchParams.setClickStitchTime(this.LJIJJLI);
            final Intent intent = new Intent();
            intent.putExtra("creation_id", this.LJIJI);
            intent.putExtra("shoot_way", "stitch");
            if (this.LJIIZILJ) {
                intent.putExtra("duet_and_stitch_router_config", this.LJIILLIIL);
            }
            Aweme aweme11 = this.LIZLLL;
            if (aweme11 == null) {
                aweme11 = null;
            }
            List<String> ttsVoiceIDs = aweme11.getTtsVoiceIDs();
            if (ttsVoiceIDs != null) {
                intent.putExtra("tts_voice_ids", new ArrayList(ttsVoiceIDs));
            }
            Aweme aweme12 = this.LIZLLL;
            if (aweme12 == null) {
                aweme12 = null;
            }
            List<String> ttsVoiceRefIDs = aweme12.getTtsVoiceRefIDs();
            if (ttsVoiceRefIDs != null) {
                intent.putExtra("tts_voice_ref_ids", new ArrayList(ttsVoiceRefIDs));
            }
            Aweme aweme13 = this.LIZLLL;
            if (aweme13 == null) {
                aweme13 = null;
            }
            List<String> vcVoiceIDs = aweme13.getVcVoiceIDs();
            if (vcVoiceIDs != null) {
                intent.putExtra("vc_voice_ids", new ArrayList(vcVoiceIDs));
            }
            Aweme aweme14 = this.LIZLLL;
            List<String> vcVoiceRefIDs = (aweme14 != null ? aweme14 : null).getVcVoiceRefIDs();
            if (vcVoiceRefIDs != null) {
                intent.putExtra("vc_voice_ref_ids", new ArrayList(vcVoiceRefIDs));
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("stitch", new IExternalService.ServiceLoadCallback() { // from class: X.15OE
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    this.LIZ.LIZ();
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    C15OF c15of = this.LIZ;
                    Activity activity = c15of.LIZ;
                    if (activity != null) {
                        asyncAVService.uiService().recordService().startStitch(activity, intent, stitchParams, c15of.LJIL);
                    }
                    C15OF c15of2 = this.LIZ;
                    c15of2.LJ(c15of2.LJIILLIIL, null, true);
                    this.LIZ.LIZ();
                }
            });
        }
    }

    public final void LIZIZ(final Music music) {
        if (this.LJIILL && this.LIZ != null) {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLZIJ("stitch_movie", this.LIZ, music.convertToMusicModel(), 6, new InterfaceC202028143e() { // from class: X.15OB
                @Override // X.InterfaceC202028143e
                public final void LIZIZ(Map map, Map map2) {
                }

                @Override // X.InterfaceC202028143e
                public final void LIZJ(C202035143l c202035143l) {
                }

                @Override // X.InterfaceC202028143e
                public final void onCancel() {
                }

                @Override // X.InterfaceC202028143e
                public final void onStart() {
                    C15OF c15of = this.LIZ;
                    c15of.LJFF = 99 - c15of.LJIIL;
                    if (c15of.LJIIZILJ) {
                        return;
                    }
                    C15O7.LIZIZ(c15of.LJJ, C15O7.LJIIIIZZ, null);
                }

                @Override // X.InterfaceC202028143e
                public final void onProgress(int i) {
                    C15OF c15of = this.LIZ;
                    c15of.LJFF = ((int) (i * c15of.LJIILJJIL)) + (99 - c15of.LJIIL);
                    if (!c15of.LJIIZILJ) {
                        C15O7.LIZIZ(c15of.LJJ, C15O7.LJIIIIZZ, null);
                    }
                }

                @Override // X.InterfaceC202028143e
                public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                    C15OF c15of = this.LIZ;
                    AVMusic aVMusicApply = new C15KP().apply(music.convertToMusicModel());
                    if (aVMusicApply != null) {
                        aVMusicApply.path = str;
                    }
                    c15of.LJIIIIZZ = aVMusicApply;
                    this.LIZ.LIZLLL();
                }
            });
        } else {
            LJII(2131848928, C15OK.CONTEXT_NULL);
            LIZ();
        }
    }

    public final void LJII(int i, C15OK c15ok) {
        boolean zLIZ = C299060Bns.LIZ();
        Activity activity = this.LIZ;
        if (activity != null) {
            if (this.LJIIZILJ) {
                LJ(this.LJIILLIIL, c15ok, false);
                C786410Ut5.LJJZZIII(this.LJIIJJI, new ARunnableS1S0011000_21(zLIZ, i, 1));
            } else if (zLIZ) {
                C1389880mGw c1389880mGw = new C1389880mGw(activity);
                c1389880mGw.LJIIIIZZ(i);
                c1389880mGw.LJIIJ();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public final void LJIIIIZZ(final String str, C15OK c15ok) {
        final boolean zLIZ = C299060Bns.LIZ();
        Activity activity = this.LIZ;
        if (activity != null) {
            if (this.LJIIZILJ) {
                LJ(this.LJIILLIIL, c15ok, false);
                C786410Ut5.LJJZZIII(this.LJIIJJI, new Runnable() { // from class: X.0m11
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ2;
                        C1C7U.LIZ("StitchWithMovieHelper@c4b6.showToast$2$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ2) {
                            }
                        }
                        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.showToast$2$1");
                    }

                    public final void LIZ() {
                        if (ActivityStack.getValidTopActivity() != null) {
                            if (zLIZ) {
                                C1389880mGw c1389880mGw = new C1389880mGw(ActivityStack.getValidTopActivity());
                                c1389880mGw.LJIIIZ(str);
                                c1389880mGw.LJIIJ();
                            } else {
                                C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getValidTopActivity());
                                c1389890mGx.LJIIJ(str);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                    }
                });
            } else if (zLIZ) {
                C1389880mGw c1389880mGw = new C1389880mGw(activity);
                c1389880mGw.LJIIIZ(str);
                c1389880mGw.LJIIJ();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public final void LJ(DuetAndStitchRouterConfig duetAndStitchRouterConfig, C15OK c15ok, boolean z) {
        if (TextUtils.isEmpty(this.LJIJI)) {
            this.LJIJI = UUID.randomUUID().toString();
        }
        if (duetAndStitchRouterConfig == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LJIJI);
        c0lab.LJ("shoot_way", "stitch");
        c0lab.LJ("enter_from", duetAndStitchRouterConfig.enterFrom);
        c0lab.LIZ(z ? 1 : 0, "is_success");
        DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AwS610S0100000_31(c0lab, 297));
        if (c15ok != null) {
            c0lab.LIZ(c15ok.getCode(), "error_code");
            c0lab.LJ("error_message", c15ok.name());
            c0lab.LJ("config_aweme_id", duetAndStitchRouterConfig.awemeId);
            Aweme aweme = this.LIZLLL;
            Aweme aweme2 = null;
            if (aweme == null) {
                aweme = null;
            }
            c0lab.LJ("actual_aweme_id", aweme.getAid());
            Aweme aweme3 = this.LIZLLL;
            if (aweme3 != null) {
                aweme2 = aweme3;
            }
            c0lab.LJFF("is_commercial_music", aweme2.getMusic().isCommercialMusic());
        } else {
            c0lab.LJ("error_code", "");
            c0lab.LJ("error_message", "");
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService().onEventV3("click_duet_or_stitch_button_result", c0lab.LIZ);
    }

    public final void LIZJ(Aweme aweme, Activity activity, String str, String str2, boolean z) {
        if (this.LJIJJLI == 0) {
            this.LJIJJLI = System.currentTimeMillis();
        }
        this.LIZ = activity;
        this.LIZLLL = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJIL = z;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, "stitch", true)) {
            IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
            if (C10EU.LJIIIIZZ()) {
                LJII(2131837963, C15OK.CHILDREN_MODE);
                LIZ();
                return;
            }
            if (iExternalService.configService().avsettingsConfig().needLoginBeforeRecord()) {
                C0XPD.LIZIZ(activity, str, "click_stitch_button", null, null);
                LIZ();
                return;
            }
            if (aweme.getAuthor() != null) {
                if (!C2354709Kn.LJIIZILJ()) {
                    LJII(2131847054, C15OK.SD_CARD_NOT_AVAILABLE);
                } else if (C2354709Kn.LJIILL() < 20971520) {
                    LJII(2131847055, C15OK.SD_CARD_NOT_ENOUGH_SPACE);
                } else {
                    if (!C0XF1.LIZLLL(activity)) {
                        LJII(2131837963, C15OK.NO_INTERNET);
                        LIZ();
                        return;
                    }
                    if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(aweme.getMusic())) {
                        LJII(2131847880, C15OK.COMMERCE_USER_NOT_COMMERCE_MUSIC);
                        LIZ();
                        return;
                    }
                    if (this.LIZJ.equals("true")) {
                        C0LAB c0lab = new C0LAB();
                        Aweme aweme2 = this.LIZLLL;
                        if (aweme2 == null) {
                            aweme2 = null;
                        }
                        c0lab.LJ("group_id", aweme2.getAid());
                        c0lab.LJ("enter_from", this.LIZIZ);
                        Aweme aweme3 = this.LIZLLL;
                        if (aweme3 == null) {
                            aweme3 = null;
                        }
                        c0lab.LJ("author_id", AwemeExtKt.getAuthorUid(aweme3));
                        C20684815ws.LJIILLIIL("stitch_button_click", c0lab.LIZ);
                    }
                    LJI();
                    if (C178000mI.LIZ(2, C1383720m70.LIZ().permissionCheckCacheDuration, AwemeBizExtKt.getClientAcceptanceTime(aweme), aweme.getAid())) {
                        LJFF();
                        return;
                    } else {
                        C15O7.LIZJ(new ACallableS434S0100000_31(aweme, 6)).LJ(new C20748816He(this, aweme, 0), C15O7.LJIIIIZZ, null);
                        return;
                    }
                }
            }
            LIZ();
        }
    }
}
