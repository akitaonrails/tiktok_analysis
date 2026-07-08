package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362740EKa {
    public static final C362740EKa LIZ = new C362740EKa();

    public static List LIZJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (C0E5J.LIZ(nLETrackSlot2) && !C0E5J.LJ(nLETrackSlot2)) {
                    arrayList.add(nLETrackSlot);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                EditVideoSegment editVideoSegmentLIZIZ = C0F1Y.LIZIZ((NLETrackSlot) it2.next());
                if (editVideoSegmentLIZIZ != null) {
                    arrayList2.add(editVideoSegmentLIZIZ);
                }
            }
            return new ArrayList(arrayList2);
        }
        return new ArrayList();
    }

    public static List LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                if (C351220Dpo.LLLL(nLETrackSlot)) {
                    arrayList.add(nLETrackSlot);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                EditVideoSegment editVideoSegmentLIZIZ = C0F1Y.LIZIZ((NLETrackSlot) it2.next());
                if (editVideoSegmentLIZIZ != null) {
                    arrayList2.add(editVideoSegmentLIZIZ);
                }
            }
            return new ArrayList(arrayList2);
        }
        return new ArrayList();
    }

    public static boolean LJFF(NLEModel nLEModel) {
        boolean z;
        VecNLETrackSlotSPtr slots;
        String extra;
        NLESegment mainSegment;
        List listLIZ = C346720DiY.LIZ(nLEModel);
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, ((NLETrackSlot) it3.next()).getMainSegment());
                if (nLESegmentAudio != null && nLESegmentAudio.getVolume() > 0.0f) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (nLETrackSlot2.hasExtra("extra_identity_key") && (extra = nLETrackSlot2.getExtra("extra_identity_key")) != null && extra.length() != 0) {
                    if (C351220Dpo.LLI(nLETrackSlot2) && (mainSegment = nLETrackSlot2.getMainSegment()) != null && C351220Dpo.LJLLLL(mainSegment) > 0.0f) {
                        arrayList3.add(nLETrackSlot);
                    }
                } else {
                    NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                    if (nLESegmentAudio2 != null && nLESegmentAudio2.getVolume() > 0.0f) {
                        arrayList3.add(nLETrackSlot);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        if ((!((ArrayList) listLIZ).isEmpty()) || z) {
            return true;
        }
        return false;
    }

    public static boolean LJI(NLEModel nLEModel) {
        if (nLEModel == null) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (C351220Dpo.LJLZ((NLETrackSlot) it3.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(NLEModel nLEModel) {
        if (nLEModel == null) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (C351220Dpo.LJZL((NLETrackSlot) it3.next())) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(MagicCombineEffectModel magicCombineEffectModel, List list) {
        NLESegmentEffect segment;
        String resourceId;
        String resourceFile;
        magicCombineEffectModel.magicCombineEffectModelList.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (NLEVideoEffect nLEVideoEffect : ((NLETrackSlot) it2.next()).getVideoEffects()) {
                C351510DqH.LIZ.getClass();
                if (C351510DqH.LJJIJIL(nLEVideoEffect) && C351510DqH.LJJIJIIJIL(nLEVideoEffect) && (segment = nLEVideoEffect.getSegment()) != null) {
                    NLEResourceNode effectSDKEffect = segment.getEffectSDKEffect();
                    String str = "";
                    if (effectSDKEffect == null || (resourceId = effectSDKEffect.getResourceId()) == null) {
                        resourceId = "";
                    }
                    if (segment.hasExtra("magic_effect_id")) {
                        String extra = segment.getExtra("magic_effect_id");
                        if (!TextUtils.isEmpty(extra)) {
                            CombineEffectPointModel combineEffectPointModel = new CombineEffectPointModel();
                            combineEffectPointModel.setKey(extra);
                            NLEResourceNode effectSDKEffect2 = segment.getEffectSDKEffect();
                            if (effectSDKEffect2 == null || (resourceFile = effectSDKEffect2.getResourceFile()) == null) {
                                resourceFile = "";
                            }
                            combineEffectPointModel.setResDir(resourceFile);
                            String effectName = segment.getEffectName();
                            if (effectName != null) {
                                str = effectName;
                            }
                            combineEffectPointModel.setName(str);
                            if (((Boolean) C284620BDo.LIZ.getValue()).booleanValue()) {
                                LIZ.getClass();
                                LJIIIIZZ(magicCombineEffectModel, resourceId, segment, combineEffectPointModel);
                            }
                            magicCombineEffectModel.magicCombineEffectModelList.add(combineEffectPointModel);
                        }
                    } else if (a0.LJJIIZI(resourceId, "resource_id", false)) {
                        LIZ.getClass();
                        LJIIIIZZ(magicCombineEffectModel, resourceId, segment, null);
                    }
                }
            }
        }
    }

    public static void LIZIZ(NLEModel nLEModel, EditorProModel editorProModel) {
        Iterator it2 = ((ArrayList) C351220Dpo.LJLLI(nLEModel)).iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    if (Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "use_text_motion_in_ep", null), "1")) {
                        editorProModel.setTextMotionUsed(true);
                    }
                    if (Intrinsics.LJFF(C351220Dpo.LJLJL(nLETrackSlot, "use_caption_motion_in_ep", null), "1")) {
                        editorProModel.setCaptionMotionUsed(true);
                    }
                }
            }
        }
        if (C349550Dn7.LJ(nLEModel).size() <= 1) {
            ArrayList<NLETrack> arrayListLJ = C349550Dn7.LJ(nLEModel);
            if (!arrayListLJ.isEmpty()) {
                Iterator<NLETrack> it3 = arrayListLJ.iterator();
                while (it3.hasNext()) {
                    VecNLETrackSlotSPtr slots2 = it3.next().getSlots();
                    if (!(slots2 instanceof Collection) || !slots2.isEmpty()) {
                        Iterator<NLETrackSlot> it4 = slots2.iterator();
                        while (it4.hasNext()) {
                            if (C349550Dn7.LJI(it4.next())) {
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        editorProModel.setCaptionMixTrackUsed(true);
    }

    public static List LJ(NLEModel nLEModel, EditVideoSegment editVideoSegment) {
        VecNLETrackSlotSPtr slots;
        String resourceFile;
        EditVideoSegment editVideoSegmentLIZIZ;
        NLEResourceNode resource;
        if (editVideoSegment == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                if (!C351220Dpo.LLLL(nLETrackSlot)) {
                    String videoPath = editVideoSegment.getVideoPath();
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null) {
                        resourceFile = resource.getResourceFile();
                    } else {
                        resourceFile = null;
                    }
                    if (Intrinsics.LJFF(videoPath, resourceFile) && (editVideoSegmentLIZIZ = C0F1Y.LIZIZ(nLETrackSlot)) != null) {
                        arrayList.add(editVideoSegmentLIZIZ);
                    }
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static void LJIIIIZZ(MagicCombineEffectModel magicCombineEffectModel, String str, NLESegmentEffect nLESegmentEffect, CombineEffectPointModel combineEffectPointModel) {
        String resourceFile;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
        if (iLJJIZ != -1) {
            Iterator it2 = a0.LJJLIIIJILLIZJL(str.substring(iLJJIZ + 1), new String[]{"&"}, 0, 6).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 2, 2);
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    linkedHashMap.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                }
            }
        }
        String str2 = (String) linkedHashMap.get("resource_id");
        String str3 = (String) linkedHashMap.get("panel");
        if (C123100dR.LIZ(str3) && C123100dR.LIZ(str2)) {
            if (combineEffectPointModel == null) {
                CombineEffectPointModel combineEffectPointModel2 = new CombineEffectPointModel();
                combineEffectPointModel2.setResourceId(str2);
                combineEffectPointModel2.setPanel(str3);
                NLEResourceNode effectSDKEffect = nLESegmentEffect.getEffectSDKEffect();
                String str4 = "";
                if (effectSDKEffect == null || (resourceFile = effectSDKEffect.getResourceFile()) == null) {
                    resourceFile = "";
                }
                combineEffectPointModel2.setResDir(resourceFile);
                String effectName = nLESegmentEffect.getEffectName();
                if (effectName != null) {
                    str4 = effectName;
                }
                combineEffectPointModel2.setName(str4);
                magicCombineEffectModel.magicCombineEffectModelList.add(combineEffectPointModel2);
                return;
            }
            combineEffectPointModel.setResourceId(str2);
            combineEffectPointModel.setPanel(str3);
        }
    }
}
