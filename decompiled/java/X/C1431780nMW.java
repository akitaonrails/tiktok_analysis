package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431780nMW {
    public static final C1431780nMW LIZ = new C1431780nMW();

    public static String LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("single_image_");
        sbLIZ.append(C1017903yT.LIZ());
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<TextStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getTextMotionModel().motionEnabled == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJII(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        if (nLEModel == null) {
            return false;
        }
        ArrayList arrayList = (ArrayList) C351220Dpo.LJJJJL(nLEModel);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C351220Dpo.LLLLIIIILLL((NLESegment) it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ArrayList arrayList2 = (ArrayList) C351220Dpo.LJJLIIIJJIZ(nLEModel);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (C351220Dpo.LLLLIIIILLL((NLESegment) it3.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            long maxEnd = mainTrack.getMaxEnd();
            Iterator<NLETrack> it2 = C351220Dpo.LJJIIZ(nLEModel).iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    if (nLETrackSlot.getStartTime() != 0 || nLETrackSlot.getEndTime() != maxEnd) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, InterfaceC1444170ngV interfaceC1444170ngV) {
        List<EditVideoSegment> videoList;
        int previewVideoLength;
        int endTime;
        List<StickerItemModel> list;
        int i;
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            videoList = previewInfo.getVideoList();
        } else {
            videoList = null;
        }
        if (videoList == null || videoList.isEmpty()) {
            return false;
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (previewInfo2 != null) {
            previewVideoLength = previewInfo2.getPreviewVideoLength();
        } else {
            previewVideoLength = 10000;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList<StickerItemModel> arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                if (!stickerItemModel.isTextSticker()) {
                    arrayList.add(stickerItemModel);
                }
            }
            if (!arrayList.isEmpty()) {
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    if (stickerItemModel2 != null && ((i = stickerItemModel2.type) == 2 || i == 0 || i == 11 || i == 10 || stickerItemModel2.isNowSmallWindowSticker())) {
                        if (stickerItemModel2.startTime != 0 || stickerItemModel2.endTime < previewVideoLength) {
                            return true;
                        }
                    }
                }
            }
        }
        List<TextStickerData> listLJJL = interfaceC1444170ngV.LJJL();
        if (!(listLJJL instanceof Collection) || !listLJJL.isEmpty()) {
            for (TextStickerData textStickerData : listLJJL) {
                if (textStickerData.getStartTime() != 0 || (1 <= (endTime = textStickerData.getEndTime()) && endTime < previewVideoLength)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        int previewVideoLength;
        NLEModel nLEModelLIZ;
        List<NLETrack> listLIZIZ;
        NLETrack nLETrack;
        NLETrackSlot slotByIndex;
        NLESegment mainSegment;
        String extra;
        String extra2;
        if (videoPublishEditModel.getEffectList().isEmpty()) {
            return true;
        }
        if (videoPublishEditModel.getEffectList().size() > 1) {
            return false;
        }
        EffectPointModel effectPointModel = (EffectPointModel) C13LP.LJJJLZIJ(0, videoPublishEditModel.getEffectList());
        if (effectPointModel == null) {
            return true;
        }
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        } else {
            previewVideoLength = 10000;
        }
        if (effectPointModel.getStartPoint() == 0 && effectPointModel.getEndPoint() >= previewVideoLength && interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (listLIZIZ = C348520DlS.LIZIZ(nLEModelLIZ)) != null && (nLETrack = (NLETrack) C13LP.LJJJLL(listLIZIZ)) != null && (slotByIndex = nLETrack.getSlotByIndex(0)) != null && (mainSegment = slotByIndex.getMainSegment()) != null && (((extra = mainSegment.getExtra("nleExtraEffectExtra")) != null && (!a0.LJJJIL(extra)) && new JSONObject(extra).optBoolean("support_phototext")) || ((extra2 = effectPointModel.getExtra()) != null && (!a0.LJJJIL(extra2)) && new JSONObject(extra2).optBoolean("support_phototext")))) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, C348100Dkm c348100Dkm, InterfaceC1444170ngV interfaceC1444170ngV) {
        List<StickerItemModel> list;
        String str;
        Boolean boolValueOf;
        C0FW6 c0fw6LJIIIZ;
        C121D c121dLIZ;
        if (C1466090oFr.LJII(videoPublishEditModel.creativeModel.stickerModel) && !C573130Mdr.LIZ() && !C1429880nJS.LIZ(videoPublishEditModel)) {
            return true;
        }
        if (C1466090oFr.LJIIJ(videoPublishEditModel.creativeModel.stickerModel) && !C573120Mdq.LIZ() && !C1429880nJS.LIZ(videoPublishEditModel)) {
            return true;
        }
        if (C1466090oFr.LJIIJJI(videoPublishEditModel.creativeModel.stickerModel) && !C1429880nJS.LIZ(videoPublishEditModel)) {
            return true;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty()) {
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel != null && (str = stickerItemModel.uuid) != null) {
                    if (c348100Dkm != null && (c0fw6LJIIIZ = c348100Dkm.LJIIIZ()) != null && (c121dLIZ = c0fw6LJIIIZ.LIZ()) != null) {
                        boolValueOf = Boolean.valueOf(c121dLIZ.getStickerIsDynamic(str));
                    } else {
                        boolValueOf = null;
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        return true;
                    }
                }
            }
        }
        if (interfaceC1444170ngV.LLIIIZ()) {
            return true;
        }
        List<TextStickerModel> listLJJIJIL = C1416310mxZ.LJJIJIL(videoPublishEditModel);
        if (!listLJJIJIL.isEmpty()) {
            Iterator<TextStickerModel> it2 = listLJJIJIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (C0F8Y.LJFF(it2.next())) {
                    if (!C1429880nJS.LIZ(videoPublishEditModel)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, X.InterfaceC1452170ntP r11, X.InterfaceC1444170ngV r12) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431780nMW.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0ntP, X.0ngV):boolean");
    }

    @InterfaceC1294060jmO
    public static boolean LJI(VideoPublishEditModel videoPublishEditModel, InterfaceC1444170ngV interfaceC1444170ngV, InterfaceC1455860nzM interfaceC1455860nzM) {
        InterfaceC1452170ntP value;
        LiveData<InterfaceC1452170ntP> liveDataG;
        if (interfaceC1455860nzM != null && (liveDataG = interfaceC1455860nzM.g()) != null) {
            value = liveDataG.getValue();
        } else {
            value = null;
        }
        boolean zLJFF = LJFF(videoPublishEditModel, value, interfaceC1444170ngV);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Photo Canvas Support Transfer To Image Mode: ");
        sbLIZ.append(zLJFF);
        C201955140j.LIZIZ("isSupportTransferToImageMode", C2188811AlT.LIZIZ(sbLIZ));
        return zLJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r50, X.InterfaceC1444130ngR r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431780nMW.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0ngR, boolean):void");
    }
}
