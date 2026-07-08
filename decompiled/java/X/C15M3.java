package X;

import android.app.Activity;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15M3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15M3 extends AbstractC1877330yx9 implements InterfaceC20499515Jh {
    public MusicDownloadPlayHelper LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public Boolean LLIZLLLIL;
    public Integer LLJ;
    public String LLJI;
    public String LLJIJIL;
    public List<String> LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI = true;
    public String LLJJIII;

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void J2(MusicModel musicModel, long j) {
    }

    @Override // X.InterfaceC20499515Jh
    public final MusicModel LJI() {
        return null;
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void LLJILJILJ(MusicModel musicModel, Exception exc) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void ba(MusicModel musicModel) {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void v2() {
    }

    @Override // X.InterfaceC20499515Jh
    public final /* synthetic */ void y4(Map map, MusicModel musicModel, String str) {
    }

    @Override // X.InterfaceC20499515Jh
    public final Activity LLILLL() {
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        return C1871830yoH.LIZ(interfaceC634840OvC != null ? interfaceC634840OvC.getContext() : null);
    }

    @Override // X.InterfaceC20499515Jh
    public final boolean LLJLLIL() {
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        return (interfaceC634840OvC == null || interfaceC634840OvC.getView() == null) ? false : true;
    }

    public final boolean LIZLLL() {
        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() && Intrinsics.LJFF(this.LLILZIL, "direct_shoot")) {
            return true;
        }
        return ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() && !Intrinsics.LJFF(this.LLILZIL, "direct_shoot");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZJ(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1490611900:
                if (!str.equals("collection_music")) {
                    return -1;
                }
                return 7;
            case 181019695:
                if (!str.equals("profile_favorite_recommend")) {
                    return -1;
                }
                return 13;
            case 197089977:
                if (!str.equals("music_chart_list")) {
                    return -1;
                }
                return 11;
            case 1637984942:
                if (!str.equals("wwa_campaign_shoot")) {
                    return -1;
                }
                return 18;
            default:
                return -1;
        }
    }

    @Override // X.InterfaceC20499515Jh
    public final void LLJJL(MusicModel musicModel, String str, String str2) {
        String string;
        Activity activityLLILLL = LLILLL();
        if (activityLLILLL != null && !activityLLILLL.isFinishing() && str != null && str2 != null && musicModel != null) {
            String string2 = UUID.randomUUID().toString();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(string2);
            builder.shootWay(this.LLILZIL);
            builder.musicPath(str);
            builder.musicOrigin(str2);
            builder.landingBack(this.LLIZ);
            builder.enterFrom(this.LLILZ);
            Pair[] pairArr = new Pair[2];
            Integer num = this.LLJ;
            if (num == null || (string = num.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            boolean zBooleanValue = false;
            pairArr[0] = new Pair("is_music_chart", string);
            String str3 = this.LLJI;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            pairArr[1] = new Pair("search_source", str3);
            builder.extraLogParams(C2097608Jq.LJI(pairArr));
            Boolean bool = this.LLIZLLLIL;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            builder.initialInputModel(new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, new WWAModel(zBooleanValue, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, false, this.LLJJIII), new HashtagsModel(this.LLJILJIL, 2), null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null)));
            if (C0BN0.LIZ() && musicModel.isDownloadAfterGoNext()) {
                builder.shootExtraData(new ShootExtraData(this.LLILZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, 8388606, null));
                builder.musicDownloadComplete(musicModel.getDownloadComplete());
            }
            if (C703302op.LIZ(this.LLJIJIL)) {
                builder.sticker(this.LLJIJIL);
            }
            if (Intrinsics.LJFF(this.LLILZ, "personal_homepage")) {
                builder.isFavouriteMusic(1);
            }
            if (Intrinsics.LJFF("music_chart_list", str2) && Intrinsics.LJFF("music_chart_list", this.LLILZIL)) {
                builder.needAddRecentMusic(true);
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("HandleVideoCreationWithMusicMethodIDL", new C580830MqH(activityLLILLL, builder.build(), musicModel, 9));
            if (Intrinsics.LJFF(this.LLILZIL, "collection_music")) {
                C1458960o4M.LIZ = true;
                C1458960o4M.LIZJ(true);
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_method", "click_music_publish");
            c0lab.LJ("shoot_entrance", this.LLILZLL);
            c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
            c0lab.LIZLLL(this.LLJ, "is_music_chart");
            c0lab.LJ("search_source", this.LLJI);
            FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
            if (fromGroupPropService != null) {
                c0lab.LJ("from_group_id_prop_list", fromGroupPropService.LIZJ());
                c0lab.LJ("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
            }
            c0lab.LJ("prop_category", "");
            if (Intrinsics.LJFF(this.LLILZIL, "collection_music")) {
                c0lab.LJ("content_source", "shoot");
                c0lab.LIZ(C1458960o4M.LIZ(), "favorite_scene");
            }
            if (Intrinsics.LJFF(this.LLILZ, "personal_homepage")) {
                c0lab.LIZ(1, "is_favourite_music");
            }
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            String str5 = this.LLILZIL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.LLILZ;
            if (str6 != null) {
                str4 = str6;
            }
            iRecordMobService.LIZIZ(new C1449410nox(string2, str5, str4, null, null, new C1449430noz(musicModel.getMusicId(), str2), null, null, 216), c0lab, null);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iLJIIJJI;
        boolean z;
        long jLongValue;
        MusicDownloadPlayHelper musicDownloadPlayHelper;
        MusicDownloadPlayHelper musicDownloadPlayHelper2;
        MusicDownloadPlayHelper musicDownloadPlayHelper3;
        boolean z2;
        Integer numValueOf;
        InterfaceC1877340yxA interfaceC1877340yxA = (InterfaceC1877340yxA) xBaseParamModel;
        k kVar = GsonProtectorUtils.parse(new p(), interfaceC1877340yxA.getMusic());
        if (kVar != null) {
            k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("index");
            if (kVarLJJIIZ != null) {
                iLJIIJJI = kVarLJJIIZ.LJIIJJI();
            } else {
                iLJIIJJI = 0;
            }
            k kVarLJJIIZ2 = kVar.LJIILIIL().LJJIIZ("is_music_offline_similar_added");
            if (kVarLJJIIZ2 != null && kVarLJJIIZ2.LJIIJJI() == 1) {
                z = true;
            } else {
                z = false;
            }
            Music music = (Music) GsonProtectorUtils.fromJson(new Gson(), kVar, Music.class);
            Long lLIZIZ = C1946707jt.LIZIZ(music.getIdStr());
            if (lLIZIZ != null) {
                jLongValue = lLIZIZ.longValue();
            } else {
                jLongValue = 0;
            }
            music.setId(jLongValue);
            C15M5 trackInfo = interfaceC1877340yxA.getTrackInfo();
            if (trackInfo != null) {
                this.LLILZ = trackInfo.getEnterFrom();
                this.LLILZIL = trackInfo.getShootWay();
                this.LLILZLL = trackInfo.getShootEntrance();
                Number landingBack = trackInfo.getLandingBack();
                if (landingBack != null && landingBack.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LLIZ = z2;
                this.LLIZLLLIL = trackInfo.getCompletedEvent();
                this.LLJILJIL = trackInfo.getHashtags();
                this.LLJIJIL = trackInfo.getEffectId();
                this.LLJILJILJ = trackInfo.getCampaignId();
                this.LLJILLL = trackInfo.getSourcePlatformChannel();
                this.LLJJ = trackInfo.getBackUrl();
                Boolean showStoryButton = trackInfo.getShowStoryButton();
                if (showStoryButton != null) {
                    this.LLJJI = showStoryButton.booleanValue();
                }
                trackInfo.getGroupId();
                trackInfo.getFromGroupId();
                Number numberIsMusicChart = trackInfo.isMusicChart();
                if (numberIsMusicChart != null) {
                    numValueOf = Integer.valueOf(numberIsMusicChart.intValue());
                } else {
                    numValueOf = null;
                }
                this.LLJ = numValueOf;
                this.LLJI = trackInfo.getSearchSource();
                this.LLJJIII = trackInfo.getTextSticker();
            }
            Activity activityLLILLL = LLILLL();
            if (activityLLILLL != null) {
                this.LLILLL = new MusicDownloadPlayHelper(this, this.LLILZ);
                if (C1662170tM7.LIZ().isEnable && (musicDownloadPlayHelper3 = this.LLILLL) != null) {
                    musicDownloadPlayHelper3.LLJJIII = C1662170tM7.LIZ();
                }
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                        if (z) {
                            musicModelConvertToMusicModel.setSimilarMusic(true);
                        }
                        if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModelConvertToMusicModel, activityLLILLL, true)) {
                            if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(activityLLILLL)) {
                                C786410Ut5.re(Toast.makeText(activityLLILLL, activityLLILLL.getString(2131832497), 0));
                                return;
                            }
                            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                            if (creativeToolsPluginService != null) {
                                String str = this.LLILZIL;
                                if (str == null) {
                                    str = "HandleVideoCreationWithMusicMethodIDL";
                                }
                                if (!creativeToolsPluginService.LIZJ(activityLLILLL, str, true)) {
                                    return;
                                }
                            }
                            MusicDownloadPlayHelper musicDownloadPlayHelper4 = this.LLILLL;
                            if (musicDownloadPlayHelper4 != null) {
                                musicDownloadPlayHelper4.LLJILJIL = iLJIIJJI;
                            }
                            if (Intrinsics.LJFF(this.LLILZIL, "collection_music") && (musicDownloadPlayHelper2 = this.LLILLL) != null) {
                                musicDownloadPlayHelper2.LLJI = "music_collection";
                                musicDownloadPlayHelper2.LLJIJIL = new MusicCategory("favorite_song", "");
                            }
                            if (C0BN0.LIZ()) {
                                C1661190tKX c1661190tKX = C1661190tKX.LIZ;
                                int iLIZJ = LIZJ(this.LLILZIL);
                                boolean zLIZLLL = LIZLLL();
                                String str2 = this.LLILZ;
                                if (str2 == null) {
                                    str2 = "music_choose_page";
                                }
                                AwS137S0101000_31 awS137S0101000_31 = new AwS137S0101000_31(iLJIIJJI, this, 13);
                                c1661190tKX.getClass();
                                if (!C1661190tKX.LIZIZ(this, musicModelConvertToMusicModel, iLIZJ, zLIZLLL, str2, awS137S0101000_31) && (musicDownloadPlayHelper = this.LLILLL) != null) {
                                    musicDownloadPlayHelper.ag(LIZJ(this.LLILZIL), musicModelConvertToMusicModel, true, false, LIZLLL());
                                    return;
                                }
                                return;
                            }
                            MusicDownloadPlayHelper musicDownloadPlayHelper5 = this.LLILLL;
                            if (musicDownloadPlayHelper5 != null) {
                                musicDownloadPlayHelper5.ag(LIZJ(this.LLILZIL), musicModelConvertToMusicModel, true, false, LIZLLL());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activityLLILLL);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
        }
    }
}
