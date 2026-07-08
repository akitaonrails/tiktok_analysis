package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4Z {
    public static final C0E4Z LIZ = new C0E4Z();

    public static Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C196909122h.LIZ().LJI("fallbackfont", true, new C1768106wB(c23260099m, 0));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a42  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLEModel LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r20) {
        /*
            Method dump skipped, instruction units count: 2776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E4Z.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):com.bytedance.ies.nle.editor_jni.NLEModel");
    }

    public static boolean LJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLEStyStickerAnim animation;
        NLEStyStickerAnim animation2;
        NLEResourceNode outAnim;
        String resourceId;
        NLEResourceNode inAnim;
        String resourceId2;
        if ((C388300FKi.LIZIZ().length() <= 0 || C388300FKi.LIZJ().length() <= 0) && nLEModel != null) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            if (tracks != null && !tracks.isEmpty()) {
                Iterator<NLETrack> it2 = tracks.iterator();
                while (it2.hasNext()) {
                    if (C351220Dpo.LLJLLIL(it2.next())) {
                        return true;
                    }
                }
            }
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            if (tracks2 != null) {
                ArrayList<NLETrack> arrayList = new ArrayList();
                Iterator<NLETrack> it3 = tracks2.iterator();
                while (true) {
                    NLETrackType trackType = null;
                    if (!it3.hasNext()) {
                        break;
                    }
                    NLETrack next = it3.next();
                    NLETrack nLETrack = next;
                    if (nLETrack != null) {
                        trackType = nLETrack.getTrackType();
                    }
                    if (trackType == NLETrackType.STICKER) {
                        arrayList.add(next);
                    }
                }
                for (NLETrack nLETrack2 : arrayList) {
                    if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null) {
                        Iterator<NLETrackSlot> it4 = slots.iterator();
                        while (it4.hasNext()) {
                            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) it4.next().getMainSegment());
                            if (nLESegmentTextStickerDynamicCast != null && (((animation = nLESegmentTextStickerDynamicCast.getAnimation()) != null && (inAnim = animation.getInAnim()) != null && (resourceId2 = inAnim.getResourceId()) != null && !a0.LJJJIL(resourceId2)) || ((animation2 = nLESegmentTextStickerDynamicCast.getAnimation()) != null && (outAnim = animation2.getOutAnim()) != null && (resourceId = outAnim.getResourceId()) != null && !a0.LJJJIL(resourceId)))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final void LIZ(NLETemplateModel nLETemplateModel, CreativeInfo creativeInfo) {
        int i;
        String resourceFile;
        NLEResourceAV aVFile;
        NLEResType resourceType;
        NLEResourceAV aVFile2;
        C201955140j.LJIIL("UgcTemplateHelper begin combineDubIfNeed");
        if (nLETemplateModel == null) {
            C201955140j.LJIIZILJ("UgcTemplateHelper combineDubIfNeed nleModel is null");
            return;
        }
        C0FGC.LIZ(2);
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "dub")) {
                    arrayList.add(nLETrack);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII == null || listLLIIII.isEmpty() || !Intrinsics.LJFF(nLETemplateModel.getTemplateInfo().getPlatform(), "iOS")) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            if (arrayList2.size() <= 1) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, arrayList2);
                if (nLETrackSlot != null) {
                    LJFF(nLETrackSlot.getMainSegment().getResource(), creativeInfo);
                    return;
                }
                return;
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(((NLETrackSlot) it3.next()).getMainSegment());
                if (nLESegmentAudioDynamicCast != null && (aVFile2 = nLESegmentAudioDynamicCast.getAVFile()) != null) {
                    resourceType = aVFile2.getResourceType();
                } else {
                    resourceType = null;
                }
                arrayList3.add(resourceType);
            }
            NLEResType nLEResType = (NLEResType) C13LP.LJJJLL(arrayList3);
            if (nLEResType == null) {
                nLEResType = NLEResType.AUDIO;
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(((NLETrackSlot) it4.next()).getMainSegment());
                if (nLESegmentAudioDynamicCast2 != null && (aVFile = nLESegmentAudioDynamicCast2.getAVFile()) != null) {
                    resourceFile = aVFile.getResourceFile();
                } else {
                    resourceFile = null;
                }
                arrayList4.add(resourceFile);
            }
            C201955140j.LJIIL("UgcTemplateHelper has more than one dub slots, combineDub");
            AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(391);
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.AUDIO_RECORD;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(".wav");
            String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
            if (C0E38.LIZ(strLIZLLL, nLETemplateModel, aFwS234S0000000_5, null, 0, 0, 0, null, null, false, false, 2040) == NLEError.SUCCESS) {
                C201955140j.LJIIL("UgcTemplateHelper combine dub file success");
                VecNLETrackSPtr tracks2 = nLETemplateModel.getTracks();
                if (tracks2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (NLETrack nLETrack2 : tracks2) {
                        if (((Boolean) aFwS234S0000000_5.invoke(nLETrack2)).booleanValue()) {
                            arrayList5.add(nLETrack2);
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        nLETemplateModel.removeTrack((NLETrack) it5.next());
                    }
                }
                NLETrack nLETrack3 = new NLETrack();
                nLETrack3.setEndTime(-2L);
                nLETrack3.setExtra("biz_extra_type", "dub");
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                VEUtils.VEAudioFileInfo audioFileInfo = VEUtils.getAudioFileInfo(strLIZLLL);
                if (audioFileInfo != null) {
                    i = audioFileInfo.duration;
                } else {
                    i = -1;
                }
                nLETrackSlot2.setEndTime(((long) i) * 1000);
                NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                nLESegmentAudio.setTimeClipEnd(nLETrackSlot2.getEndTime());
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.setResourceFile(strLIZLLL);
                LJFF(nLEResourceAV, creativeInfo);
                nLEResourceAV.setResourceType(nLEResType);
                nLESegmentAudio.setAVFile(nLEResourceAV);
                nLETrackSlot2.setMainSegment(nLESegmentAudio);
                nLETrack3.addSlot(nLETrackSlot2);
                nLETemplateModel.addTrack(nLETrack3);
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    C2354709Kn.LJIJJLI((String) it6.next());
                }
                return;
            }
            C201955140j.LJIIZILJ("UgcTemplateHelper combine dub file failed");
        }
    }

    public static final void LJFF(NLEResourceNode nLEResourceNode, CreativeInfo creativeInfo) {
        if (!C2354709Kn.LIZIZ(nLEResourceNode.getResourceFile())) {
            return;
        }
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.AUDIO_RECORD;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".wav");
        String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
        int iTransCodeAudio = VEUtils.transCodeAudio(nLEResourceNode.getResourceFile(), strLIZLLL, -1, -1, -1, "pcm_s16le");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UgcTemplateHelper replaceDubFileWithTranscodeAudio ret ");
        sbLIZ2.append(iTransCodeAudio);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
        if (iTransCodeAudio == 0) {
            C2354709Kn.LJIJJLI(nLEResourceNode.getResourceFile());
            nLEResourceNode.setResourceFile(strLIZLLL);
        }
    }

    public static final String LIZLLL(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, List<String> list, boolean z, boolean z2) {
        NLETrack mainTrack;
        CoverPublishModel coverPublishModel;
        UploadCustomizeCoverInfo coverInfo;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        int size = 0;
        if (((creativeModel != null && (coverPublishModel = creativeModel.coverPublishModel) != null && (coverInfo = coverPublishModel.getCoverInfo()) != null && coverInfo.getCoverType() == 2) || videoPublishEditModel.getVideoCoverStartTm() > 0.0f) && ((Boolean) C0AYA.LIZ.getValue()).booleanValue() && (mainTrack = nLEModel.getMainTrack()) != null) {
            mainTrack.setExtra("biz_ugc_template_cover_time", Float.valueOf(videoPublishEditModel.getVideoCoverStartTm()).toString());
        }
        if (list != null) {
            size = list.size();
        }
        C533730KwV.LIZ.getClass();
        if (size > C533730KwV.LJII() && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            nLEModel.getMainTrack().addFeature(NLETemplateJNI.NLETemplateModel_getFeatureIndex__SWIG_0("UGC_CS"));
        }
        String str = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
        if (str == null) {
            str = "";
        }
        return C0E3A.LIZJ(str, EnumC20228014Cw.UGC_TEMPLATE_ZIP, nLEModel, videoPublishEditModel, list, z, z2);
    }
}
