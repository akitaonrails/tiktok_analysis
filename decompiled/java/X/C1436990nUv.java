package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436990nUv {
    public static final int LIZ(ArrayList<Integer> arrayList) {
        if (arrayList.contains(2)) {
            return 2;
        }
        if (arrayList.contains(1)) {
            return 1;
        }
        return 0;
    }

    public static final List<String> LIZIZ(List<AlbumAigc> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<AlbumAigc> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer aiType = it2.next().getAiType();
                if (aiType != null) {
                    if (aiType.intValue() == 2) {
                        if (C2283608x8.LIZ("tiktok_ai_self")) {
                            arrayList.add("tiktok_ai_self");
                        }
                    } else if (aiType.intValue() == 1) {
                        if (C2283608x8.LIZ("tiktok_ai_live_photo")) {
                            arrayList.add("tiktok_ai_live_photo");
                        }
                    } else if (aiType.intValue() == 3 && C2283608x8.LIZ("tiktok_prop")) {
                        arrayList.add("tiktok_prop");
                    }
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (C275780ArQ.LIZIZ()) {
            C140D.LIZ.getClass();
            List<AIGCInfo> list = C140D.LJJIIZ(videoPublishEditModel).LIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AIGCInfo aIGCInfo : list) {
                    if (aIGCInfo != null && aIGCInfo.getType() == 2 && !aIGCInfo.isMinorEdit()) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static final int LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (C275780ArQ.LIZIZ()) {
            C140D.LIZ.getClass();
            List<AIGCInfo> list = C140D.LJJIIZ(videoPublishEditModel).LIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AIGCInfo aIGCInfo : list) {
                    if (aIGCInfo != null && aIGCInfo.getType() == 2) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        Set setLLIIJI = C13LP.LLIIJI(videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource);
        if ((setLLIIJI.size() >= 2 && setLLIIJI.contains("meta_contain_c2pa")) || LIZLLL(videoPublishEditModel) != 2 || LIZJ(videoPublishEditModel) == 2) {
            return false;
        }
        return true;
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        int i;
        int iLIZ;
        List<SingleImageData> imageList;
        int iLIZLLL;
        String aiGeneratedSource;
        String aiGeneratedSource2;
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        List<SingleImageData> imageList2;
        List<AlbumAigc> albumAigc;
        if (!C0L1C.LIZ()) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.draftInfoModel.isDraft) {
                com.ss.android.ugc.aweme.creative.model.AIGCInfo aIGCInfo = creativeModel.privacySettingModel.aigcInfo;
                if (aIGCInfo.AIGCLabelType == 2) {
                    aIGCInfo.AIGCLabelType = 0;
                    aIGCInfo.manualChangeSwitch = false;
                    return;
                }
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.clear();
        if (C1437010nUx.LIZ()) {
            videoPublishEditModel.creativeModel.privacySettingModel.gcMarkContentProducerList.clear();
        }
        if (C306460Bzo.LIZ()) {
            PrivacySettingModel privacySettingModel = videoPublishEditModel.creativeModel.privacySettingModel;
            privacySettingModel.isIPTCMetadataExist = false;
            privacySettingModel.iptcTypeList.clear();
        }
        com.ss.android.ugc.aweme.creative.model.AIGCInfo aIGCInfo2 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
        if (aIGCInfo2.manualChangeSwitch) {
            i = aIGCInfo2.AIGCLabelType;
        } else {
            i = 0;
        }
        arrayList.add(Integer.valueOf(i));
        if (C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel)) {
            if (C2283608x8.LIZ("tiktok_ai_self")) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(videoPublishEditModel.creativeModel.aiSelfModel.aiSelfAIGCLabelType));
                iLIZ = LIZ(arrayList2);
            } else {
                iLIZ = 0;
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData : imageList) {
                    int iLIZ2 = C1446920nkw.LIZ(singleImageData.getSrcImageInfo().getPath(), videoPublishEditModel.creativeModel.commonMobModel);
                    singleImageData.setImageAIGCType(iLIZ2);
                    arrayList3.add(Integer.valueOf(iLIZ2));
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIGCManager -> hasAIGCForImageMode() = ");
            sbLIZ.append(LIZ(arrayList3));
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            iLIZ = LIZ(arrayList3);
        }
        arrayList.add(Integer.valueOf(iLIZ));
        if (C255760A0o.LIZ()) {
            iLIZLLL = LIZJ(videoPublishEditModel);
        } else {
            iLIZLLL = LIZLLL(videoPublishEditModel);
        }
        arrayList.add(Integer.valueOf(iLIZLLL));
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.creativeModel.imageAlbumModel;
        ArrayList arrayList4 = null;
        if (imageAlbumData2 != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
            arrayList4 = new ArrayList();
            Iterator<SingleImageData> it2 = imageList2.iterator();
            while (it2.hasNext()) {
                AIGCInfo aigcInfo = it2.next().getAigcInfo();
                if (aigcInfo != null && (albumAigc = aigcInfo.getAlbumAigc()) != null) {
                    arrayList4.add(albumAigc);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Iterator<String> it4 = LIZIZ((List) it3.next()).iterator();
                while (it4.hasNext()) {
                    videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add(it4.next());
                }
            }
        }
        if (arrayList4 != null && (!((ArrayList) C15438062q.LJIJJLI(arrayList4)).isEmpty())) {
            arrayList.add(2);
        }
        if (C2283608x8.LIZ("tiktok_creation_ai_chat") && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), C1428470nHB.LJJZZI(videoPublishEditModel))) {
            arrayList.add(2);
        }
        C140D.LIZ.getClass();
        List<AIGCInfo> list = C140D.LJJIIZ(videoPublishEditModel).LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AIGCInfo> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                AIGCInfo next = it5.next();
                if (next == null || (aiGeneratedSource = next.getAiGeneratedSource()) == null) {
                    aiGeneratedSource = "";
                }
                if (C2283608x8.LIZ(aiGeneratedSource)) {
                    arrayList.add(2);
                    break;
                }
            }
        }
        if (C306460Bzo.LIZ()) {
            C443120HZe<EnumC1446970nl1, List<String>, List<String>> c443120HZeLIZ = C1446930nkx.LIZ(videoPublishEditModel, AFwS261S0000000_22.get$arr$(304));
            EnumC1446970nl1 first = c443120HZeLIZ.getFirst();
            List<String> second = c443120HZeLIZ.getSecond();
            arrayList.add(Integer.valueOf(first.getType()));
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.addAll(second);
        }
        videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = LIZ(arrayList);
        if (LIZ(arrayList) > i) {
            videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch = false;
        }
        if (LIZLLL(videoPublishEditModel) == 2) {
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("meta_contain_c2pa");
        }
        if (C2283608x8.LIZ("tiktok_ai_self") && C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel)) {
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_ai_self");
        }
        if (C306460Bzo.LIZ()) {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2.privacySettingModel.isIPTCMetadataExist && !creativeModel2.commonMobModel.aigcCreationSource.contains("meta_contain_iptc")) {
                videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("meta_contain_iptc");
            }
        }
        C140D.LIZ.getClass();
        for (AIGCInfo aIGCInfo3 : C140D.LJJIIZ(videoPublishEditModel).LIZ) {
            if (aIGCInfo3 != null && (aiGeneratedSource2 = aIGCInfo3.getAiGeneratedSource()) != null && C2283608x8.LIZ(aiGeneratedSource2)) {
                videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add(aiGeneratedSource2);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AIGCManager -> updateImageModeAIGCType = ");
        sbLIZ2.append(videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        LJII(jCurrentTimeMillis, videoPublishEditModel);
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        boolean z2;
        boolean z3;
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.privacySettingModel.fingerprintId)) {
            return true;
        }
        if (videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJI = LJI(videoPublishEditModel);
        if (!z2 && !zLJI) {
            z3 = false;
        } else {
            z3 = true;
        }
        C1435570nSd.LIZ.getClass();
        boolean zLIZJ = C2286708xd.LIZJ(C1435570nSd.LIZIZ);
        if ((videoPublishEditModel.getCreationMode() == 1 || z) && C1171720gb4.LIZ() && z3 && zLIZJ) {
            return true;
        }
        return false;
    }

    public static final void LJII(long j, VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        List listLJJLIIIJILLIZJL;
        String stickerID = videoPublishEditModel.getStickerID();
        if (stickerID != null && stickerID.length() != 0) {
            String stickerID2 = videoPublishEditModel.getStickerID();
            if (stickerID2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stickerID2, new String[]{","}, 0, 6)) != null) {
                numValueOf = Integer.valueOf(listLJJLIIIJILLIZJL.size());
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "read_duration");
        c2344009Gk.LIZJ(videoPublishEditModel.getVideoCount(), "video_cnt");
        c2344009Gk.LJ(numValueOf, "record_effect_count");
        c2344009Gk.LIZJ(videoPublishEditModel.getEffectList().size(), "edit_effect_count");
        C20684815ws.LJIILLIIL("read_metadata", c2344009Gk.LIZ);
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C1276304z3 c1276304z3;
        int i;
        int iLIZLLL;
        boolean z2;
        boolean zLIZ = C1206004ni.LIZ(2);
        if (!zLIZ) {
            C140D.LIZ.LJJIIJ(false);
        }
        if (!C0L1C.LIZ()) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.draftInfoModel.isDraft) {
                com.ss.android.ugc.aweme.creative.model.AIGCInfo aIGCInfo = creativeModel.privacySettingModel.aigcInfo;
                if (aIGCInfo.AIGCLabelType == 2) {
                    aIGCInfo.AIGCLabelType = 0;
                    aIGCInfo.manualChangeSwitch = false;
                    return;
                }
                return;
            }
            return;
        }
        if (zLIZ) {
            C140D.LIZ.LJJIIJ(false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.clear();
        if (C1437010nUx.LIZ()) {
            videoPublishEditModel.creativeModel.privacySettingModel.gcMarkContentProducerList.clear();
        }
        if (C306460Bzo.LIZ()) {
            PrivacySettingModel privacySettingModel = videoPublishEditModel.creativeModel.privacySettingModel;
            privacySettingModel.isIPTCMetadataExist = false;
            privacySettingModel.iptcTypeList.clear();
        }
        if (zLIZ) {
            C140D.LIZ.getClass();
            C1436380nTw c1436380nTwLJJIIZ = C140D.LJJIIZ(videoPublishEditModel);
            boolean zLIZIZ = C275780ArQ.LIZIZ();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (AIGCInfo aIGCInfo2 : c1436380nTwLJJIIZ.LIZ) {
                if (aIGCInfo2 != null) {
                    if (zLIZIZ && aIGCInfo2.getType() == 2) {
                        if (!aIGCInfo2.isMinorEdit()) {
                            z3 = true;
                            z4 = true;
                        } else {
                            z3 = true;
                        }
                    }
                    if (!z5) {
                        String aiGeneratedSource = aIGCInfo2.getAiGeneratedSource();
                        if (aiGeneratedSource == null) {
                            aiGeneratedSource = "";
                        }
                        if (C2283608x8.LIZ(aiGeneratedSource)) {
                            z5 = true;
                        }
                    }
                }
            }
            c1276304z3 = new C1276304z3(z3, z4, z5);
        } else {
            c1276304z3 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCManager -> manualChangeSwitch -> manualChangeSwitch = ");
        sbLIZ.append(videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        com.ss.android.ugc.aweme.creative.model.AIGCInfo aIGCInfo3 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
        if (aIGCInfo3.manualChangeSwitch) {
            i = aIGCInfo3.AIGCLabelType;
        } else {
            i = 0;
        }
        arrayList.add(Integer.valueOf(i));
        C443120HZe<EnumC1446970nl1, List<String>, List<String>> c443120HZeLIZ = C1446930nkx.LIZ(videoPublishEditModel, new AwS35S0010000_22(z, 30));
        EnumC1446970nl1 first = c443120HZeLIZ.getFirst();
        List<String> second = c443120HZeLIZ.getSecond();
        arrayList.add(Integer.valueOf(first.getType()));
        videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.addAll(second);
        if (c1276304z3 != null) {
            if (C255760A0o.LIZ()) {
                z2 = c1276304z3.LIZIZ;
            } else {
                z2 = c1276304z3.LIZ;
            }
            if (z2) {
                iLIZLLL = 2;
            } else {
                iLIZLLL = 0;
            }
        } else if (C255760A0o.LIZ()) {
            iLIZLLL = LIZJ(videoPublishEditModel);
        } else {
            iLIZLLL = LIZLLL(videoPublishEditModel);
        }
        arrayList.add(Integer.valueOf(iLIZLLL));
        int iLIZ = LIZ(arrayList);
        com.ss.android.ugc.aweme.creative.model.AIGCInfo aIGCInfo4 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
        aIGCInfo4.AIGCLabelType = iLIZ;
        if (iLIZ > i) {
            aIGCInfo4.manualChangeSwitch = false;
        }
        if (c1276304z3 == null ? LIZLLL(videoPublishEditModel) == 2 : c1276304z3.LIZ) {
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("meta_contain_c2pa");
            if (videoPublishEditModel.isDuet()) {
                videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_duet");
            } else if (videoPublishEditModel.isStitchMode()) {
                videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_stitch");
            }
            if (C275770ArP.LIZ()) {
                AIGCInfo aIGCInfo5 = videoPublishEditModel.creativeModel.musicBuzModel.aigcInfo;
                if (aIGCInfo5 != null && aIGCInfo5.getType() == 2) {
                    videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_local_sound");
                    break;
                }
                List<MusicBuzModel> list = videoPublishEditModel.creativeModel.musicBuzModel.extendMusicList;
                if (list != null) {
                    Iterator<MusicBuzModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        AIGCInfo aIGCInfo6 = it2.next().aigcInfo;
                        if (aIGCInfo6 != null && aIGCInfo6.getType() == 2) {
                            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_local_sound");
                            break;
                        }
                    }
                }
            }
        }
        LJII(jCurrentTimeMillis, videoPublishEditModel);
    }

    public static final void LJIIIZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null) {
            LJIIJ(videoPublishEditModel, model);
        }
    }

    public static final void LJIIJ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Object bucketTaskId;
        VecNLETrackSPtr tracks;
        NLEResourceNode resource;
        String resourceFile;
        ArrayList arrayList = new ArrayList(videoPublishEditModel.creativeModel.aigcExtraModel.aigcInfosFromSubTrack);
        videoPublishEditModel.creativeModel.aigcExtraModel.aigcInfosFromSubTrack.clear();
        videoPublishEditModel.creativeModel.aigcExtraModel.sourceFileWithoutAIGCInfo.clear();
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (!nLETrack.getMainTrack()) {
                    NLETrackType trackType = nLETrack.getTrackType();
                    NLETrackType nLETrackType = NLETrackType.VIDEO;
                    if (trackType == nLETrackType || nLETrack.getExtraTrackType() == nLETrackType) {
                        for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                            String extra = nLETrackSlot.getExtra("aigc_info");
                            if (C123100dR.LIZ(extra)) {
                                List<AIGCInfo> list = videoPublishEditModel.creativeModel.aigcExtraModel.aigcInfosFromSubTrack;
                                AIGCInfo.Companion.getClass();
                                list.add(C0EP3.LIZ(extra));
                            } else {
                                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                                List<String> list2 = videoPublishEditModel.creativeModel.aigcExtraModel.sourceFileWithoutAIGCInfo;
                                if (nLESegmentVideoDynamicCast != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                                    list2.add(resourceFile);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (AIGCInfo aIGCInfo : videoPublishEditModel.creativeModel.aigcExtraModel.aigcInfosFromSubTrack) {
            if (aIGCInfo != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    bucketTaskId = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    AIGCInfo aIGCInfo2 = (AIGCInfo) next;
                    if (aIGCInfo2 != null) {
                        bucketTaskId = aIGCInfo2.getBucketTaskId();
                    }
                    if (Intrinsics.LJFF(bucketTaskId, aIGCInfo.getBucketTaskId())) {
                        bucketTaskId = next;
                        break;
                    }
                }
                AIGCInfo aIGCInfo3 = (AIGCInfo) bucketTaskId;
                if (aIGCInfo3 != null) {
                    C140C.LIZ(aIGCInfo3, aIGCInfo);
                }
            }
        }
    }
}
