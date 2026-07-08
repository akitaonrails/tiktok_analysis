package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403670mdB {
    public static final void LIZ(List list, VideoPublishEditModel videoPublishEditModel) {
        String entrancePoint;
        String resourceId;
        for (Pair pair : (ArrayList) list) {
            EnumC1403640md8 enumC1403640md8 = (EnumC1403640md8) pair.getFirst();
            List list2 = (List) pair.getSecond();
            int i = C1403660mdA.LIZ[enumC1403640md8.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("appendEditPropSelectedFrom -> effectList.size = ");
                        sbLIZ.append(videoPublishEditModel.getEffectList().size());
                        sbLIZ.append("，styleSelectedFromList: ");
                        sbLIZ.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63));
                        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                        for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
                            C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("appendEditPropSelectedFrom -> effectId = ");
                            sbLIZ2.append(effectPointModel.getKey());
                            sbLIZ2.append(", extra = ");
                            sbLIZ2.append(effectPointModel.getExtra());
                            C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                            if (C1403700mdE.LIZLLL(effectPointModel)) {
                                if (Intrinsics.LJFF(effectPointModel.getEntrancePoint(), "editor_pro_panel")) {
                                    entrancePoint = "edit_page_edit_pro";
                                } else {
                                    entrancePoint = effectPointModel.getEntrancePoint();
                                }
                                list2.add(entrancePoint);
                            }
                        }
                        String str = videoPublishEditModel.creativeModel.aiSelfModel.styleSelectedFrom;
                        if (str != null) {
                            list2.add(str);
                        }
                        List<AiMeStyleInfo> listLIZ = C1403490mct.LIZ(videoPublishEditModel);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((ArrayList) listLIZ).iterator();
                        while (it2.hasNext()) {
                            String effectStyleSelectedFrom = ((AiMeStyleInfo) it2.next()).getEffectStyleSelectedFrom();
                            if (effectStyleSelectedFrom != null) {
                                arrayList.add(effectStyleSelectedFrom);
                            }
                        }
                        list2.addAll(arrayList);
                    }
                } else {
                    C0MJ8 c0mj83 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("appendEditResourceList -> effectList.size = ");
                    sbLIZ3.append(videoPublishEditModel.getEffectList().size());
                    sbLIZ3.append("，propList: ");
                    sbLIZ3.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63));
                    C201955140j.LIZJ(c0mj83, C2188811AlT.LIZIZ(sbLIZ3));
                    for (EffectPointModel effectPointModel2 : videoPublishEditModel.getEffectList()) {
                        C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("appendEditPropList -> effectId = ");
                        sbLIZ4.append(effectPointModel2.getKey());
                        sbLIZ4.append(", extra = ");
                        sbLIZ4.append(effectPointModel2.getExtra());
                        C201955140j.LIZJ(c0mj84, C2188811AlT.LIZIZ(sbLIZ4));
                        if (C1403700mdE.LIZLLL(effectPointModel2)) {
                            list2.add(effectPointModel2.getResourceId());
                        }
                    }
                    String str2 = videoPublishEditModel.creativeModel.aiSelfModel.styleResourceId;
                    if (str2 != null) {
                        list2.add(str2);
                    }
                    ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<TimeSpeedModelExtension> it3 = finalVideoList.iterator();
                    while (it3.hasNext()) {
                        AiMeStyleInfo aiMeStyleInfo = it3.next().getAiMeStyleInfo();
                        if (aiMeStyleInfo != null && (resourceId = aiMeStyleInfo.getResourceId()) != null) {
                            arrayList2.add(resourceId);
                        }
                    }
                    list2.addAll(arrayList2);
                }
            } else {
                C0MJ8 c0mj85 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("appendEditPropList -> effectList.size = ");
                sbLIZ5.append(videoPublishEditModel.getEffectList().size());
                sbLIZ5.append("，propList: ");
                sbLIZ5.append(C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63));
                C201955140j.LIZJ(c0mj85, C2188811AlT.LIZIZ(sbLIZ5));
                for (EffectPointModel effectPointModel3 : videoPublishEditModel.getEffectList()) {
                    C0MJ8 c0mj86 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("appendEditPropList -> effectId = ");
                    sbLIZ6.append(effectPointModel3.getKey());
                    sbLIZ6.append(", extra = ");
                    sbLIZ6.append(effectPointModel3.getExtra());
                    C201955140j.LIZJ(c0mj86, C2188811AlT.LIZIZ(sbLIZ6));
                    if (C1403700mdE.LIZLLL(effectPointModel3)) {
                        list2.add(C1403700mdE.LIZJ(effectPointModel3.getExtra()));
                    }
                }
                String str3 = videoPublishEditModel.creativeModel.aiSelfModel.styleId;
                if (str3 != null) {
                    list2.add(str3);
                }
                List<AiMeStyleInfo> listLIZ2 = C1403490mct.LIZ(videoPublishEditModel);
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = ((ArrayList) listLIZ2).iterator();
                while (it4.hasNext()) {
                    String currentStyleId = ((AiMeStyleInfo) it4.next()).getCurrentStyleId();
                    if (currentStyleId != null) {
                        arrayList3.add(currentStyleId);
                    }
                }
                list2.addAll(arrayList3);
            }
        }
    }

    public static final void LIZJ(List list, VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        StickerInfo stickerInfo;
        if (C1416310mxZ.LJJJJJ(videoPublishEditModel)) {
            AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(list, (List<? extends Pair<? extends EnumC1403640md8, ? extends List<String>>>) videoPublishEditModel, (VideoPublishEditModel) 14);
            CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.captureSegments) != null) {
                for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                    String stickerId = timeSpeedModelExtension.getStickerId();
                    if (stickerId != null && stickerId.length() != 0 && (stickerInfo = timeSpeedModelExtension.getStickerInfo()) != null) {
                        awS388S0200000_22.invoke(stickerInfo);
                    }
                }
                return;
            }
            return;
        }
        if (videoPublishEditModel.getFinalVideoList().isEmpty()) {
            StickerInfo stickerInfo2 = videoPublishEditModel.stickerInfo;
            if (stickerInfo2 != null && stickerInfo2.getStickerId() != 0) {
                for (Pair pair : (ArrayList) list) {
                    EnumC1403640md8 enumC1403640md8 = (EnumC1403640md8) pair.getFirst();
                    List list2 = (List) pair.getSecond();
                    String strLIZIZ = LIZIZ(enumC1403640md8, stickerInfo2, videoPublishEditModel.creativeModel);
                    if (strLIZIZ != null) {
                        list2.add(strLIZIZ);
                    }
                }
                return;
            }
            return;
        }
        LIZLLL(videoPublishEditModel, new AwS388S0200000_22(list, (List<? extends Pair<? extends EnumC1403640md8, ? extends List<String>>>) videoPublishEditModel, (VideoPublishEditModel) 15));
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, Function1<? super StickerInfo, Unit> function1) {
        StickerInfo stickerInfo;
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList) {
                String stickerId = timeSpeedModelExtension.getStickerId();
                if (stickerId != null && stickerId.length() != 0 && (stickerInfo = timeSpeedModelExtension.getStickerInfo()) != null) {
                    function1.invoke(stickerInfo);
                }
            }
        }
    }

    public static final String LIZIZ(EnumC1403640md8 enumC1403640md8, StickerInfo stickerInfo, CreativeModel creativeModel) {
        List<String> v2Tags;
        int source;
        switch (C1403660mdA.LIZ[enumC1403640md8.ordinal()]) {
            case 1:
                return String.valueOf(stickerInfo.getStickerId());
            case 2:
                return stickerInfo.getResourceId();
            case 3:
                return stickerInfo.getPropSource();
            case 4:
                return C1402510mbJ.LIZ(stickerInfo);
            case 5:
                stickerInfo.getSource();
                Boolean boolIsAMETemplate = stickerInfo.isAMETemplate();
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.LJFF(boolIsAMETemplate, bool) && !Intrinsics.LJFF(stickerInfo.isAMEMobileEffect(), bool)) {
                    if (stickerInfo.isMobileEffect()) {
                        source = 101;
                    } else {
                        source = stickerInfo.getSource();
                    }
                } else {
                    source = 102;
                }
                return String.valueOf(source);
            case 6:
                return stickerInfo.getMParentStickerId();
            case 7:
                String tabKey = stickerInfo.getTabKey();
                if (tabKey == null) {
                    tabKey = "";
                }
                if (C13LP.LJJJJ(tabKey, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
                    return "trending";
                }
                return tabKey;
            case 8:
                return C1448620nng.LIZJ(String.valueOf(stickerInfo.getStickerId()), creativeModel.feedPropPinModel);
            case BdTuring.TYPE_ECAF /* 9 */:
                EffectLabel effectLabel = stickerInfo.getEffectLabel();
                if (effectLabel != null && (v2Tags = effectLabel.getV2Tags()) != null) {
                    return C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62);
                }
                return null;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return String.valueOf(stickerInfo.isCachedProp() ? 1 : 0);
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (C212600rs.LIZ()) {
                    return String.valueOf(stickerInfo.getFromSource());
                }
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
