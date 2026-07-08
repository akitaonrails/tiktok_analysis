package X;

import Y.ARunnableS11S2100000_23;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDataCenterLiveAwemeService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlightVideoInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.service.ICaptionStrategyService;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ohg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483340ohg {
    public static final LruCache<String, SimVideoUrlModel> LIZ = new LruCache<>(20);

    public static List<SimVideoUrlModel> LIZLLL(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        ArrayList arrayList = new ArrayList();
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
            for (CaptionItemModel captionItemModel : captionModel.captionList) {
                if (captionItemModel != null) {
                    arrayList.add(LJIIJ(captionItemModel));
                }
            }
        }
        return arrayList;
    }

    public static List<SimVideoUrlModel> LJ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Audio audio = aweme.getAudio();
        if (audio != null && audio.getTtsInfos() != null && !audio.getTtsInfos().isEmpty()) {
            for (TtsInfos ttsInfos : audio.getTtsInfos()) {
                if (ttsInfos.playAddress != null) {
                    SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
                    String str = ttsInfos.playAddress.urlKey;
                    if (str != null) {
                        simVideoUrlModel.setSourceId(str);
                    }
                    String str2 = ttsInfos.playAddress.fileHash;
                    if (str2 != null) {
                        simVideoUrlModel.setFileHash(str2);
                    }
                    Integer num = ttsInfos.playAddress.height;
                    if (num != null) {
                        simVideoUrlModel.setHeight(num.intValue());
                    }
                    Integer num2 = ttsInfos.playAddress.width;
                    if (num2 != null) {
                        simVideoUrlModel.setWidth(num2.intValue());
                    }
                    Long l = ttsInfos.playAddress.dataSize;
                    if (l != null) {
                        simVideoUrlModel.setSize(l.longValue());
                    }
                    String str3 = ttsInfos.playAddress.uri;
                    if (str3 != null) {
                        simVideoUrlModel.setUri(str3);
                    }
                    String str4 = ttsInfos.playAddress.urlKey;
                    if (str4 != null) {
                        simVideoUrlModel.setUrlKey(str4);
                    }
                    List<String> list = ttsInfos.playAddress.urlList;
                    if (list != null) {
                        simVideoUrlModel.setUrlList(list);
                    }
                    String str5 = ttsInfos.playAddress.playerAccessKey;
                    if (str5 != null) {
                        simVideoUrlModel.setaK(str5);
                    }
                    arrayList.add(simVideoUrlModel);
                }
            }
        }
        return arrayList;
    }

    public static SimVideoUrlModel LJFF(Aweme aweme) {
        SimVideoUrlModel simVideoUrlModelLJII;
        C1483430ohp.LIZ(aweme, "awemeToVideoUrlModel");
        C01GW c01gw = C266380AcG.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue() && aweme != null && aweme.getAid() != null) {
            LruCache<String, SimVideoUrlModel> lruCache = LIZ;
            if (lruCache.get(aweme.getAid()) != null && aweme.getVideo() != null && lruCache.get(aweme.getAid()).getIsTranslatedVideo() == aweme.getIsPlayingTranslatedVideo()) {
                C1481110oe5.LIZIZ("VideoPreloadManager", "awemeToVideoUrlModel: use cache model" + aweme.getAid());
                return lruCache.get(aweme.getAid());
            }
        }
        if (InterfaceC274530ApP.LIZ) {
            simVideoUrlModelLJII = C1477760oYg.LIZ(C1481230oeH.LJI(aweme.getVideo()), C1480850odf.LIZJ.getPlayerType());
        } else {
            simVideoUrlModelLJII = C1481230oeH.LJII(aweme.getVideo().getProperPlayAddr());
        }
        if (simVideoUrlModelLJII == null) {
            return null;
        }
        simVideoUrlModelLJII.setIsTranslatedVideo(aweme.getIsPlayingTranslatedVideo());
        if (aweme.getVideo() != null && aweme.getVideo().hasVideoModel()) {
            simVideoUrlModelLJII.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
            simVideoUrlModelLJII.setDashVideoModelMap(aweme.getVideo().getVideoModelMap());
        }
        if (!AwemeExtKt.isPhotoMode(aweme) && aweme.getVideo() != null && aweme.getVideo().getOriginCover() != null) {
            C589480NAc c589480NAc = new C589480NAc();
            c589480NAc.setCoverUrlList(aweme.getVideo().getOriginCover().getUrlList());
            simVideoUrlModelLJII.setSimCover(c589480NAc);
        }
        simVideoUrlModelLJII.setSourceId(aweme.getAid());
        if (aweme.getAwemeType() == 150) {
            simVideoUrlModelLJII.setFormat("mp3");
        }
        simVideoUrlModelLJII.setRatio(aweme.getVideo().getRatio());
        simVideoUrlModelLJII.setFeedRequestId(aweme.getRequestId());
        simVideoUrlModelLJII.setScCategory(aweme.isAd() ? 1 : 0);
        simVideoUrlModelLJII.setTransParams(aweme.getTransParams());
        if (((Boolean) c01gw.getValue()).booleanValue() && aweme.getAid() != null) {
            LIZ.put(aweme.getAid(), simVideoUrlModelLJII);
        }
        return simVideoUrlModelLJII;
    }

    public static int LJIIIIZZ(Aweme aweme) {
        return C1478160oZK.LIZ().LJJJJL(LJFF(aweme));
    }

    public static int LJIIIZ(VideoUrlModel videoUrlModel) {
        return C1478160oZK.LIZ().LJJJJL(C1481230oeH.LJII(videoUrlModel));
    }

    public static SimVideoUrlModel LJIIJ(CaptionItemModel captionItemModel) {
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.setSourceId(String.valueOf(captionItemModel.subId));
        ArrayList arrayList = new ArrayList();
        arrayList.add(captionItemModel.url);
        simVideoUrlModel.setUrlList(arrayList);
        simVideoUrlModel.setUri(String.valueOf(captionItemModel.subId));
        return simVideoUrlModel;
    }

    public static List<SimVideoUrlModel> LJIILL(Aweme aweme) {
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        if (aweme == null) {
            return null;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preload_when_subtitles_are_displayed", true) == 1) {
            C20703515zt.LIZ.getClass();
            if (!C20703515zt.LJJIJIIJIL(aweme, false)) {
                return null;
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_only_prefetch_initial_cla_caption", true) == 1) {
            ArrayList arrayList = new ArrayList();
            Video video = aweme.getVideo();
            if (video != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
                C581750Mrl c581750MrlLJFF = C20702715zl.LJFF(aweme, null);
                for (CaptionItemModel captionItemModel : captionModel.captionList) {
                    if (captionItemModel != null && c581750MrlLJFF != null && captionItemModel.subId == c581750MrlLJFF.LIZIZ) {
                        arrayList.add(LJIIJ(captionItemModel));
                    }
                }
            }
            return arrayList;
        }
        return LIZLLL(aweme);
    }

    public static long LJIILLIIL(VideoUrlModel videoUrlModel) {
        return C1478160oZK.LIZ().LJJIZ(C1481230oeH.LJII(videoUrlModel));
    }

    public static boolean LJIJI(Aweme aweme) {
        return C1478160oZK.LIZ().LJIIIIZZ(LJFF(aweme));
    }

    public static boolean LJIJJ(Aweme aweme) {
        if (aweme.getAwemeType() == 150) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getUserStory() == null) {
            return false;
        }
        return true;
    }

    public static void LJJII(Aweme aweme) {
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            SimVideoUrlModel simVideoUrlModelLJFF = LJFF(aweme);
            if (simVideoUrlModelLJFF != null) {
                simVideoUrlModelLJFF.setIsLocalCache(true);
            }
            C0NF7.LIZ(aweme, simVideoUrlModelLJFF, EnumC587720N3i.COLD_CACHE, false);
            C1478160oZK.LIZ().LJJJLL(simVideoUrlModelLJFF, Integer.MAX_VALUE);
        }
    }

    public static void LJJIII(Aweme aweme) {
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            C1478160oZK.LIZ().LJJLIIIJ(LJIILL(aweme));
        }
    }

    public static void LJJIIJ(Aweme aweme) {
        if (!AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            List<SimVideoUrlModel> listLIZLLL = LIZLLL(aweme);
            if (((ArrayList) listLIZLLL).isEmpty()) {
                return;
            }
            C1478160oZK.LIZ().LJJLIIIJ(listLIZLLL);
        }
    }

    public static void LJJIIZI(String str) {
        C1478160oZK.LIZ().LJIL(str);
    }

    public static String LIZJ(Aweme aweme, C0NI4 c0ni4) {
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            SimVideoUrlModel simVideoUrlModelLJFF = LJFF(aweme);
            C1478160oZK.LIZ().LJJIL(simVideoUrlModelLJFF, c0ni4);
            if (simVideoUrlModelLJFF != null && simVideoUrlModelLJFF.getBitRate().size() >= 1) {
                return ((SimBitRate) ListProtector.get(simVideoUrlModelLJFF.getBitRate(), simVideoUrlModelLJFF.getBitRate().size() - 1)).getUrlKey();
            }
            return null;
        }
        return null;
    }

    public static boolean LJIL(int i, Aweme aweme) {
        return LJJ(i, aweme, "");
    }

    public static void LJJI(int i, List list) {
        if (list != null && list.size() != 0 && i >= 0 && i < list.size()) {
            LJIL(0, (Aweme) ListProtector.get(list, i));
        }
    }

    public static void LJJIIJZLJL(int i, Aweme aweme) {
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            C1478160oZK.LIZ().LJJLIIIIJ(LJFF(aweme), i, null, 0, null, 0);
        }
    }

    public static SimVideoUrlModel LJI(Aweme aweme, String str, String str2) {
        IECommerceAnchorService iECommerceAnchorService;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        CaptionModel captionModel2;
        List<CaptionItemModel> list2;
        CaptionLanguage captionLanguage;
        C1475370oUp c1475370oUp;
        String strLIZIZ;
        boolean zZ3;
        AILivePreviewHighlight aILivePreviewHighlight;
        AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo;
        int i;
        boolean zLJJJJZ = false;
        int i2 = 0;
        zLJJJJZ = false;
        if (AwemeSaaSExtKt.isLive(aweme) && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_add_medias_include_live_opt", true) == 1) {
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            simVideoUrlModel.setSourceId(aweme.getAid());
            simVideoUrlModel.setIsLive(1);
            if (PluggableExtentionKt.pluggableSpi(IDataCenterLiveAwemeService.class) != null) {
                strLIZIZ = ((IDataCenterLiveAwemeService) PluggableExtentionKt.pluggableSpi(IDataCenterLiveAwemeService.class)).LIZIZ(aweme);
            } else {
                strLIZIZ = "";
            }
            simVideoUrlModel.setLiveJsonStringData(strLIZIZ);
            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
            if (TextUtils.equals(str2, "homepage_bottom_live")) {
                zZ3 = true;
            } else if (iLiveOuterService != null) {
                zZ3 = iLiveOuterService.Z3();
            } else {
                zZ3 = false;
            }
            if (liveRoomStructLJI != null && (aILivePreviewHighlight = liveRoomStructLJI.aiLivePreviewHighlight) != null && (aILivePreviewHighlightVideoInfo = aILivePreviewHighlight.videoInfo) != null && zZ3) {
                long j = aILivePreviewHighlight.expireTimestamp;
                SimBitRate simBitRate = new SimBitRate();
                simBitRate.setFormat(aILivePreviewHighlightVideoInfo.format);
                String str3 = aILivePreviewHighlightVideoInfo.codecType;
                if (!TextUtils.isEmpty(str3) && str3.contains("264")) {
                    i = 0;
                } else {
                    i = 1;
                }
                simBitRate.setCodecType(i);
                simBitRate.setBitRate((int) aILivePreviewHighlightVideoInfo.bitRate);
                SimUrlModel simUrlModel = new SimUrlModel();
                ArrayList arrayList = new ArrayList();
                arrayList.add(aILivePreviewHighlightVideoInfo.url);
                simUrlModel.setUrlList(arrayList);
                simUrlModel.setHeight((int) aILivePreviewHighlightVideoInfo.height);
                simUrlModel.setWidth((int) aILivePreviewHighlightVideoInfo.width);
                String strLIZ = aILivePreviewHighlightVideoInfo.urlKey;
                if (TextUtils.isEmpty(strLIZ)) {
                    strLIZ = C2254508sR.LIZ(aILivePreviewHighlightVideoInfo.url);
                }
                simUrlModel.setUrlKey(strLIZ);
                simUrlModel.setSize(aILivePreviewHighlightVideoInfo.size);
                simBitRate.setPlayAddr(simUrlModel);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(simBitRate);
                simVideoUrlModel.setBitRate(arrayList2);
                simVideoUrlModel.setFormat(aILivePreviewHighlightVideoInfo.format);
                String str4 = aILivePreviewHighlightVideoInfo.codecType;
                if (TextUtils.isEmpty(str4) || !str4.contains("264")) {
                    i2 = 1;
                }
                simVideoUrlModel.setCodecType(i2);
                simVideoUrlModel.setBusinessUrlExpiredTime(j);
                simVideoUrlModel.setDuration(aILivePreviewHighlightVideoInfo.duration);
                simVideoUrlModel.setHeight((int) aILivePreviewHighlightVideoInfo.height);
                simVideoUrlModel.setWidth((int) aILivePreviewHighlightVideoInfo.width);
                simVideoUrlModel.setSize(aILivePreviewHighlightVideoInfo.size);
                simVideoUrlModel.setUri(aILivePreviewHighlightVideoInfo.url);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(aILivePreviewHighlightVideoInfo.url);
                simVideoUrlModel.setUrlList(arrayList3);
                String strLIZ2 = aILivePreviewHighlightVideoInfo.urlKey;
                if (TextUtils.isEmpty(strLIZ2)) {
                    strLIZ2 = C2254508sR.LIZ(aILivePreviewHighlightVideoInfo.url);
                }
                simVideoUrlModel.setUrlKey(strLIZ2);
                if (!TextUtils.isEmpty(aILivePreviewHighlightVideoInfo.coverUri)) {
                    C589480NAc c589480NAc = new C589480NAc();
                    c589480NAc.setCoverUrlList(Collections.singletonList(aILivePreviewHighlightVideoInfo.coverUri));
                    simVideoUrlModel.setSimCover(c589480NAc);
                }
                simVideoUrlModel.setIsLive(2);
            }
            return simVideoUrlModel;
        }
        SimVideoUrlModel simVideoUrlModelLJFF = LJFF(aweme);
        if (simVideoUrlModelLJFF != null) {
            if (!TextUtils.isEmpty(str)) {
                simVideoUrlModelLJFF.setTag(str);
            }
            simVideoUrlModelLJFF.setSubTag(str2);
            HashMap map = new HashMap();
            Video video = aweme.getVideo();
            String str5 = null;
            if (video != null && (captionModel2 = video.getCaptionModel()) != null && (list2 = captionModel2.captionList) != null && (captionLanguage = captionModel2.originalCaptionLanguage) != null) {
                long j2 = captionLanguage.languageId;
                for (CaptionItemModel captionItemModel : list2) {
                    if (captionItemModel != null) {
                        List<String> list3 = captionItemModel.urlList;
                        if (list3 != null && list3.size() > 0) {
                            c1475370oUp = new C1475370oUp(captionItemModel.subId, (String[]) list3.toArray(new String[list3.size()]), 0L, captionItemModel.languageCode);
                        } else if (!TextUtils.isEmpty(captionItemModel.url)) {
                            c1475370oUp = new C1475370oUp(captionItemModel.subId, new String[]{captionItemModel.url}, 0L, captionItemModel.languageCode);
                        } else {
                            c1475370oUp = null;
                        }
                        if (j2 == captionItemModel.languageId) {
                            map.put(0, c1475370oUp);
                        } else {
                            map.put(1, c1475370oUp);
                        }
                    }
                }
            }
            simVideoUrlModelLJFF.setSimSubtitleUrlModelMap(map);
            if (((Boolean) C1474810oTv.F.getValue()).booleanValue() && aweme.getVideo() != null && (captionModel = aweme.getVideo().getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
                new Object() { // from class: X.0ohm
                }.getClass();
                ICaptionStrategyService iCaptionStrategyService = (ICaptionStrategyService) PluggableExtentionKt.pluggableSpi$default(ICaptionStrategyService.class, false, false, false, 14, null);
                if (iCaptionStrategyService != null) {
                    simVideoUrlModelLJFF.setSubtitleId(iCaptionStrategyService.ch(aweme));
                }
                CaptionLanguage captionLanguage2 = captionModel.originalCaptionLanguage;
                if (captionLanguage2 != null) {
                    str5 = captionLanguage2.languageCode;
                }
                simVideoUrlModelLJFF.setOriginalCaptionLanguageCode(str5);
            }
            C1479890oc7 c1479890oc7LJ = C20702715zl.LJ(aweme);
            if (c1479890oc7LJ != null) {
                simVideoUrlModelLJFF.setTranslationTargetLanguageCode(c1479890oc7LJ.LJ);
                simVideoUrlModelLJFF.setShouldPlayTranslatedAudio(c1479890oc7LJ.LIZJ);
                if (((Boolean) C261900AOe.LIZ.getValue()).booleanValue()) {
                    simVideoUrlModelLJFF.setSimAudios(Audio.convertToSimAudio(aweme.getVideo(), aweme.getAudio(), "awemeToVideoUrlModel", aweme.getAid()));
                    simVideoUrlModelLJFF.setIsEnablePreloadDubbedAudio(true);
                }
            }
            simVideoUrlModelLJFF.setDidProfileLabels(aweme.getVideo().getDidProfileLabels());
            simVideoUrlModelLJFF.setVidProfileLabels(aweme.getVideo().getVidProfileLabels());
            if (C582310Msf.LIZ != null && (iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)) != null) {
                zLJJJJZ = iECommerceAnchorService.LJJJJZ(aweme);
            }
            simVideoUrlModelLJFF.setEcommerce(zLJJJJZ);
            if (((Boolean) C279880Ay2.LIZ.getValue()).booleanValue() && AwemeBizOptExtKt.getAwemeCacheType(aweme) != 0) {
                simVideoUrlModelLJFF.setBizHadCache(1);
            }
        }
        return simVideoUrlModelLJFF;
    }

    public static SimVideoUrlModel LJII(Aweme aweme, String str, boolean z) {
        List<Aweme> listLJIIIZ;
        SimVideoUrlModel simVideoUrlModelLJI = LJI(aweme, "", str);
        if (simVideoUrlModelLJI != null && C0C64.LJIILLIIL().LJIJ(31744, 1, "player_add_medias_redundant_opt", true) == 1 && z && (listLJIIIZ = ((IFeedCacheLoaderService) ServiceManager.get().getService(IFeedCacheLoaderService.class)).LJIIIZ()) != null) {
            Iterator<Aweme> it2 = listLJIIIZ.iterator();
            while (it2.hasNext()) {
                if (Objects.equals(it2.next().getAid(), simVideoUrlModelLJI.getSourceId())) {
                    simVideoUrlModelLJI.setBizHadCache(1);
                }
            }
        }
        return simVideoUrlModelLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel> LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, boolean r8) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r5 = LJII(r6, r7, r8)
            X.01GW r0 = X.C275260Aqa.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            java.lang.Class<com.ss.android.ugc.aweme.IDataCenterLiveAwemeService> r0 = com.ss.android.ugc.aweme.IDataCenterLiveAwemeService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            if (r0 == 0) goto L67
            java.lang.Class<com.ss.android.ugc.aweme.IDataCenterLiveAwemeService> r0 = com.ss.android.ugc.aweme.IDataCenterLiveAwemeService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.IDataCenterLiveAwemeService r0 = (com.ss.android.ugc.aweme.IDataCenterLiveAwemeService) r0
            java.lang.String r1 = r0.LIZ(r6)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L67
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r3 = new com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel
            r3.<init>()
            java.lang.String r0 = r6.getAid()
            r3.setSourceId(r0)
            r0 = 1
            r3.setIsLive(r0)
            r3.setLiveJsonStringData(r1)
            r3.setIsScAvatorLive(r0)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r2.<init>(r1)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "room_id"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.optString(r1, r0)     // Catch: org.json.JSONException -> L5d
            if (r5 == 0) goto L59
            r5.setAuthorLiveRoomId(r0)     // Catch: org.json.JSONException -> L5d
        L59:
            r3.setSourceId(r0)     // Catch: org.json.JSONException -> L5d
            goto L68
        L5d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L67:
            r3 = 0
        L68:
            if (r5 == 0) goto L6d
            r4.add(r5)
        L6d:
            if (r3 == 0) goto L72
            r4.add(r3)
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1483340ohg.LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (((java.lang.Number) r3.getValue()).doubleValue() != 1.0d) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1483340ohg.LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean):void");
    }

    public static void LJIIZILJ(String str, Aweme aweme, List list) {
        List<PhotoModeImageUrlModel> imageList;
        LivePhotoStruct livePhotoStruct;
        Video video;
        SimVideoUrlModel simVideoUrlModelLJII;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null) {
            imageList = null;
        } else {
            imageList = photoModeImageInfo.getImageList();
        }
        SimVideoUrlModel simVideoUrlModelLJI = LJI(aweme, "", str);
        if (imageList != null && !imageList.isEmpty()) {
            if (simVideoUrlModelLJI != null) {
                simVideoUrlModelLJI.setFirstSubMediaId(aweme.getAid());
                simVideoUrlModelLJI.setIsFirstSubMedia(true);
                simVideoUrlModelLJI.setHVideoIndex(0);
                ((ArrayList) list).add(simVideoUrlModelLJI);
            }
            for (int i = 0; i < imageList.size(); i++) {
                PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, i);
                if (photoModeImageUrlModel != null && (livePhotoStruct = photoModeImageUrlModel.livePhotoStruct) != null && (video = livePhotoStruct.videoModel) != null) {
                    video.setSourceId(livePhotoStruct.livePhotoVid);
                    if (InterfaceC274530ApP.LIZ) {
                        simVideoUrlModelLJII = C1477760oYg.LIZ(C1481230oeH.LJI(video), C1480850odf.LIZJ.getPlayerType());
                    } else {
                        simVideoUrlModelLJII = C1481230oeH.LJII(video.getProperPlayAddr());
                    }
                    if (simVideoUrlModelLJII != null) {
                        simVideoUrlModelLJII.setSubTag(str);
                        simVideoUrlModelLJII.setFirstSubMediaId(aweme.getAid());
                        simVideoUrlModelLJII.setHVideoIndex(i);
                        ((ArrayList) list).add(simVideoUrlModelLJII);
                    }
                }
            }
            return;
        }
        ((ArrayList) list).add(simVideoUrlModelLJI);
    }

    public static boolean LJJ(int i, Aweme aweme, String str) {
        int i2 = 0;
        if (aweme == null || AwemeSaaSExtKt.isLive(aweme) || aweme.getVideo() == null || aweme.getVideo().getProperPlayAddr() == null || C1478160oZK.LIZ() == null) {
            return false;
        }
        C1478190oZN.LIZ();
        SimVideoUrlModel simVideoUrlModelLJFF = LJFF(aweme);
        if (!TextUtils.isEmpty(str) && simVideoUrlModelLJFF != null) {
            simVideoUrlModelLJFF.setTag(str);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preload_subtitles_limit", true) == 1) {
            boolean zLJJLIIIIJ = C1478160oZK.LIZ().LJJLIIIIJ(simVideoUrlModelLJFF, i, null, 0, null, 0);
            C332420D1k.LIZ(simVideoUrlModelLJFF, zLJJLIIIIJ, i);
            return zLJJLIIIIJ;
        }
        if (i > 0) {
            i2 = Integer.MAX_VALUE;
        }
        List<SimVideoUrlModel> listLJ = LJ(aweme);
        boolean zLJJLIIIIJ2 = C1478160oZK.LIZ().LJJLIIIIJ(simVideoUrlModelLJFF, i, LJIILL(aweme), i2, listLJ, i2);
        C332420D1k.LIZ(simVideoUrlModelLJFF, zLJJLIIIIJ2, i);
        return zLJJLIIIIJ2;
    }

    public static void LJJIIZ(String str, String str2, List list) {
        if (C1256140inE.LIZ(list)) {
            return;
        }
        ArrayList<Aweme> arrayList = new ArrayList(list);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_add_medias_async_opt_v2", true) == 1) {
            C823050WQl.LIZIZ().execute(new ARunnableS11S2100000_23(arrayList, str2, str, 5));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Aweme aweme : arrayList) {
            if (aweme != null) {
                if (C1474810oTv.LLJJIJIIJIL() && LJIJJLI(aweme)) {
                    LJIJ(arrayList2, aweme, "", str2, null);
                } else if (LJIJJ(aweme)) {
                    LJIIZILJ(str2, aweme, arrayList2);
                } else {
                    arrayList2.add(LJI(aweme, "", str2));
                }
            }
        }
        C1478160oZK.LIZ().LJJIIZI(str, arrayList2);
    }

    public static void LJIIJJI(Aweme aweme, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        LJIIL(LJFF(aweme), str, z, z2, interfaceC1475840oVa);
    }

    public static void LJIIL(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa) {
        InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
        if (interfaceC1482870ogvLIZ != null) {
            interfaceC1482870ogvLIZ.LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
        }
    }

    public static void LJIJ(List<SimVideoUrlModel> list, Aweme aweme, String str, String str2, InterfaceC1478130oZH interfaceC1478130oZH) {
        SimVideoUrlModel simVideoUrlModelLJI;
        List<Aweme> stories = aweme.getUserStory().getStories();
        int currentPosition = (int) aweme.getUserStory().getCurrentPosition();
        for (int i = 0; i < stories.size(); i++) {
            Aweme aweme2 = (Aweme) ListProtector.get(stories, i);
            if (!AwemeBizExtKt.isStoryFakeAweme(aweme2) && (simVideoUrlModelLJI = LJI(aweme2, str, str2)) != null) {
                simVideoUrlModelLJI.setFirstSubMediaId(AwemeExtKt.getAuthorUid(aweme));
                simVideoUrlModelLJI.setHVideoIndex(i + currentPosition);
                if (i == 0) {
                    simVideoUrlModelLJI.setIsFirstSubMedia(true);
                }
                if (interfaceC1478130oZH != null) {
                    C1478100oZE.LIZ(simVideoUrlModelLJI, aweme2, interfaceC1478130oZH);
                }
                ((ArrayList) list).add(simVideoUrlModelLJI);
            }
        }
    }

    public static void LJJIFFI(Aweme aweme, int i, String str, InterfaceC1475300oUi interfaceC1475300oUi, C0NEE c0nee) {
        String urlKey;
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme) && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C1478160oZK.LIZ() != null) {
            C1478190oZN.LIZ();
            SimVideoUrlModel simVideoUrlModelLJFF = LJFF(aweme);
            if (simVideoUrlModelLJFF != null) {
                simVideoUrlModelLJFF.setMdlVideoPath(str);
            }
            C1475410oUt c1475410oUt = new C1475410oUt();
            c1475410oUt.LIZIZ = 1;
            c1475410oUt.LIZJ = str;
            ArrayList arrayListLIZ = C0NF7.LIZ(aweme, simVideoUrlModelLJFF, EnumC587720N3i.COLD_CACHE, false);
            if (((Boolean) C0BMH.LIZ.getValue()).booleanValue() && !arrayListLIZ.isEmpty() && c0nee != null) {
                c0nee.LIZIZ(aweme.getAid(), ((SimBitRate) ListProtector.get(arrayListLIZ, 0)).getUrlKey());
            }
            C0NEO c0neoLJFF = C0NEO.LJFF();
            C0NKB c0nkb = C0NKB.LIZIZ;
            if (!C0NEO.LJIILL) {
                c0neoLJFF.getClass();
                C1478160oZK.LIZ().LIZLLL(c0neoLJFF.LJ);
                C0NEO.LJIILL = true;
            }
            c0neoLJFF.LIZ = true;
            if (!Intrinsics.LJFF(c0neoLJFF.LJI, interfaceC1475300oUi)) {
                c0neoLJFF.LJI = interfaceC1475300oUi;
            }
            if (simVideoUrlModelLJFF != null) {
                String sourceId = simVideoUrlModelLJFF.getSourceId();
                ArrayList arrayList = new ArrayList();
                List<SimBitRate> bitRate = simVideoUrlModelLJFF.getBitRate();
                if (bitRate != null) {
                    for (SimBitRate simBitRate : bitRate) {
                        SimUrlModel playAddr = simBitRate.getPlayAddr();
                        if (playAddr != null && (urlKey = playAddr.getUrlKey()) != null && urlKey.length() != 0) {
                            arrayList.add(simBitRate.getPlayAddr().getUrlKey());
                        }
                    }
                }
                String urlKey2 = simVideoUrlModelLJFF.getUrlKey();
                if (urlKey2 != null && urlKey2.length() != 0) {
                    arrayList.add(simVideoUrlModelLJFF.getUrlKey());
                }
                c0neoLJFF.LJII.put(sourceId, arrayList);
                c0neoLJFF.LJIIIIZZ.put(sourceId, simVideoUrlModelLJFF);
            }
            c0neoLJFF.LIZLLL = c1475410oUt;
            C1478160oZK.LIZ().LJJLIIIJLJLI(simVideoUrlModelLJFF, i, C0NKB.LIZIZ, c1475410oUt);
        }
    }

    public static void LIZ(List list, boolean z, boolean z2, String str, boolean z3, String str2) {
        try {
            LIZIZ(str, "", str2, list, z, z2, z3);
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(final String str, final String str2, final String str3, List list, final boolean z, final boolean z2, final boolean z3) {
        if (list == null) {
            return;
        }
        final ArrayList<Aweme> arrayList = new ArrayList(list);
        if (C1256140inE.LIZ(arrayList)) {
            return;
        }
        if (((Number) C279850Axz.LIZ.getValue()).intValue() > 0) {
            if (C585250MxP.LIZIZ) {
                if (!C585250MxP.LIZJ) {
                    C585250MxP.LIZ(null);
                }
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = C13LP.LL(arrayList2, 3).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Aweme aweme = (Aweme) it2.next();
                            if (aweme != null && AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1) {
                                C585250MxP.LIZ = true;
                                break;
                            }
                        } else if (!C585250MxP.LIZ) {
                            C585250MxP.LIZIZ = true;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int i = 0;
                            for (Object obj : arrayList2) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    if (obj != null) {
                                        if (i < ((Number) C279850Axz.LIZ.getValue()).intValue()) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                if (!arrayList3.isEmpty()) {
                                    arrayList.clear();
                                    arrayList.addAll(arrayList3);
                                }
                                C585250MxP.LIZLLL = new RunnableC325920Cq6(arrayList4, z, z2, str, str3, z3);
                                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Mtl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("ColdCachePreloadProcessor@a0a7.dealMedias$4");
                                        try {
                                            C585250MxP.LIZ(null);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("ColdCachePreloadProcessor@a0a7.dealMedias$4");
                                    }
                                });
                            }
                            C585250MxP.LIZIZ = true;
                        }
                    }
                }
            }
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_add_medias_async_opt_v2", true) == 1) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0ohi
                public final /* synthetic */ InterfaceC1478130oZH LLILZ = null;

                @Override // java.lang.Runnable
                public final void run() {
                    List<Aweme> list2 = arrayList;
                    String str4 = str2;
                    String str5 = str3;
                    InterfaceC1478130oZH interfaceC1478130oZH = this.LLILZ;
                    boolean z4 = z;
                    boolean z5 = z2;
                    String str6 = str;
                    boolean z6 = z3;
                    C1C7U.LIZ("VideoPreloaderManagerUtil@ccfe.addMedias$1L");
                    ArrayList arrayList5 = new ArrayList();
                    for (Aweme aweme2 : list2) {
                        if (aweme2 != null) {
                            if (C1474810oTv.LLJJIJIIJIL() && C1483340ohg.LJIJJLI(aweme2)) {
                                C1483340ohg.LJIJ(arrayList5, aweme2, str4, str5, interfaceC1478130oZH);
                            } else if (((Boolean) C275260Aqa.LIZ.getValue()).booleanValue() && PluggableExtentionKt.pluggableSpi(IDataCenterLiveAwemeService.class) != null) {
                                arrayList5.addAll(C1483340ohg.LJIILIIL(aweme2, str5, C582010MsB.LJ));
                            } else if (C1483340ohg.LJIJJ(aweme2)) {
                                C1483340ohg.LJIIZILJ(str5, aweme2, arrayList5);
                            } else {
                                SimVideoUrlModel simVideoUrlModelLJII = C1483340ohg.LJII(aweme2, str5, C582010MsB.LJ);
                                C1478100oZE.LIZ(simVideoUrlModelLJII, aweme2, interfaceC1478130oZH);
                                arrayList5.add(simVideoUrlModelLJII);
                            }
                        }
                    }
                    C582010MsB.LJ = false;
                    C1478160oZK.LIZ().LJIJ(str6, arrayList5, z4, z5);
                    if (z6) {
                        C1483390ohl.LIZ().LIZJ().LIZ(str6, z4, arrayList5);
                    }
                    C1C7U.LIZIZ("VideoPreloaderManagerUtil@ccfe.addMedias$1L");
                }
            });
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Aweme aweme2 : arrayList) {
            if (aweme2 != null) {
                if (C1474810oTv.LLJJIJIIJIL() && LJIJJLI(aweme2)) {
                    LJIJ(arrayList5, aweme2, str2, str3, null);
                } else if (((Boolean) C275260Aqa.LIZ.getValue()).booleanValue() && PluggableExtentionKt.pluggableSpi(IDataCenterLiveAwemeService.class) != null) {
                    arrayList5.addAll(LJIILIIL(aweme2, str3, C582010MsB.LJ));
                } else if (LJIJJ(aweme2)) {
                    LJIIZILJ(str3, aweme2, arrayList5);
                } else {
                    SimVideoUrlModel simVideoUrlModelLJII = LJII(aweme2, str3, C582010MsB.LJ);
                    C1478100oZE.LIZ(simVideoUrlModelLJII, aweme2, null);
                    arrayList5.add(simVideoUrlModelLJII);
                }
            }
        }
        C582010MsB.LJ = false;
        C1478160oZK.LIZ().LJIJ(str, arrayList5, z, z2);
        if (!z3) {
            return;
        }
        C1483390ohl.LIZ().LIZJ().LIZ(str, z, arrayList5);
    }
}
