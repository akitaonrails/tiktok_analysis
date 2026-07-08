package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.template.AIGCTemplateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377880Eri {
    public static final int LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII;
        int i2 = 0;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null && !slots.isEmpty()) {
                    i = 0;
                    for (NLETrackSlot nLETrackSlot : slots) {
                        AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
                        if (LJIIJJI(nLETrackSlot) && aIGCTemplateModelLJI != null && nLETrackSlot.getRenderProxy() == null && ((editorProAIGCTemplateModelLJII = LJII(nLETrackSlot)) == null || editorProAIGCTemplateModelLJII.getAiCreateStylizedType() != AICreateStylizedType.STYLIZED_FL2V.getType())) {
                            if (aIGCTemplateModelLJI.getImagePaths().size() == 2 && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static final int LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i;
        int i2 = 0;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null && !slots.isEmpty()) {
                    i = 0;
                    for (NLETrackSlot nLETrackSlot : slots) {
                        AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
                        if (LJIIL(nLETrackSlot) && aIGCTemplateModelLJI != null && nLETrackSlot.getRenderProxy() == null && aIGCTemplateModelLJI.getImagePaths().size() == 1 && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static final int LIZLLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return 0;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = it2.next().getSlots();
            if (slots != null && !slots.isEmpty()) {
                i = 0;
                for (NLETrackSlot nLETrackSlot : slots) {
                    AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
                    if (LJIIJJI(nLETrackSlot) && aIGCTemplateModelLJI != null && nLETrackSlot.getRenderProxy() == null && ((editorProAIGCTemplateModelLJII = LJII(nLETrackSlot)) == null || editorProAIGCTemplateModelLJII.getAiCreateStylizedType() != AICreateStylizedType.STYLIZED_I2V.getType())) {
                        if (aIGCTemplateModelLJI.getImagePaths().size() == 1 && ((CharSequence) ListProtector.get(aIGCTemplateModelLJI.getImagePaths(), 0)).length() > 0 && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static final int LJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII;
        int i2 = 0;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null && !slots.isEmpty()) {
                    i = 0;
                    for (NLETrackSlot nLETrackSlot : slots) {
                        AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
                        if (LJIIJJI(nLETrackSlot) && aIGCTemplateModelLJI != null && nLETrackSlot.getRenderProxy() == null && (editorProAIGCTemplateModelLJII = LJII(nLETrackSlot)) != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_FL2V.getType() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static final int LJFF(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i;
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII;
        int i2 = 0;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null && !slots.isEmpty()) {
                    i = 0;
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (LJIIJJI(nLETrackSlot) && LJI(nLETrackSlot) != null && nLETrackSlot.getRenderProxy() == null && (editorProAIGCTemplateModelLJII = LJII(nLETrackSlot)) != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_I2V.getType() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static final AIGCTemplateModel LJI(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_async_param");
        if (extra == null) {
            return null;
        }
        return (AIGCTemplateModel) C051R.LIZ(extra, AIGCTemplateModel.class);
    }

    public static final EditorProAIGCTemplateModel LJII(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_async_param");
        if (extra == null) {
            return null;
        }
        return (EditorProAIGCTemplateModel) C051R.LIZ(extra, EditorProAIGCTemplateModel.class);
    }

    public static final boolean LJIIIZ(NLETemplateModel nLETemplateModel) {
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        if (tracks == null || tracks.isEmpty()) {
            return false;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = it2.next().getSlots();
            if (slots != null && !slots.isEmpty()) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (it3.hasNext()) {
                    EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII = LJII(it3.next());
                    if (editorProAIGCTemplateModelLJII != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_FL2V.getType()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJ(NLETemplateModel nLETemplateModel) {
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        if (tracks == null || tracks.isEmpty()) {
            return false;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = it2.next().getSlots();
            if (slots != null && !slots.isEmpty()) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (it3.hasNext()) {
                    EditorProAIGCTemplateModel editorProAIGCTemplateModelLJII = LJII(it3.next());
                    if (editorProAIGCTemplateModelLJII != null && editorProAIGCTemplateModelLJII.getAiCreateStylizedType() == AICreateStylizedType.STYLIZED_I2V.getType()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJJI(NLETrackSlot nLETrackSlot) {
        String taskType;
        if (nLETrackSlot.hasExtra("ep_async_param")) {
            AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
            if (aIGCTemplateModelLJI != null) {
                taskType = aIGCTemplateModelLJI.getTaskType();
            } else {
                taskType = null;
            }
            if (!Intrinsics.LJFF(taskType, "image2image")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIL(NLETrackSlot nLETrackSlot) {
        String taskType;
        if (nLETrackSlot.hasExtra("ep_async_param")) {
            AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
            if (aIGCTemplateModelLJI != null) {
                taskType = aIGCTemplateModelLJI.getTaskType();
            } else {
                taskType = null;
            }
            if (Intrinsics.LJFF(taskType, "image2image")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILIIL(NLETrackSlot nLETrackSlot) {
        AIGCTemplateModel aIGCTemplateModelLJI;
        List<String> imagePaths;
        if (!nLETrackSlot.hasExtra("ep_async_param") || (aIGCTemplateModelLJI = LJI(nLETrackSlot)) == null || (imagePaths = aIGCTemplateModelLJI.getImagePaths()) == null || imagePaths.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = imagePaths.iterator();
        while (it2.hasNext()) {
            if (it2.next().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILJJIL(NLETrackSlot nLETrackSlot) {
        String taskType;
        if (nLETrackSlot.hasExtra("ep_async_param")) {
            AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
            if (aIGCTemplateModelLJI != null) {
                taskType = aIGCTemplateModelLJI.getTaskType();
            } else {
                taskType = null;
            }
            if (Intrinsics.LJFF(taskType, "text2image")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILL(NLETrackSlot nLETrackSlot) {
        String taskType;
        List<String> imagePaths;
        if (nLETrackSlot.hasExtra("ep_async_param")) {
            AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
            if (aIGCTemplateModelLJI != null) {
                taskType = aIGCTemplateModelLJI.getTaskType();
            } else {
                taskType = null;
            }
            if (Intrinsics.LJFF(taskType, "text2video")) {
                AIGCTemplateModel aIGCTemplateModelLJI2 = LJI(nLETrackSlot);
                if (aIGCTemplateModelLJI2 != null && (imagePaths = aIGCTemplateModelLJI2.getImagePaths()) != null && !imagePaths.isEmpty()) {
                    Iterator<String> it2 = imagePaths.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().length() > 0) {
                        }
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static final void LIZ(C0LAB c0lab, NLEModel nLEModel) {
        c0lab.LIZ(LIZJ(nLEModel), "ai_create_i2i_cnt");
        c0lab.LIZ(LIZLLL(nLEModel), "ai_create_i2v_cnt");
        c0lab.LIZ(LIZIZ(nLEModel), "ai_create_fl2v_cnt");
        c0lab.LIZ(LJFF(nLEModel), "ai_create_stylized_i2v_cnt");
        c0lab.LIZ(LJ(nLEModel), "ai_create_stylized_fl2v_cnt");
    }

    public static final boolean LJIIIIZZ(NLETemplateModel nLETemplateModel, boolean z) {
        String taskType;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V") && LJI(nLETrackSlot) != null) {
                AIGCTemplateModel aIGCTemplateModelLJI = LJI(nLETrackSlot);
                if (aIGCTemplateModelLJI != null) {
                    taskType = aIGCTemplateModelLJI.getTaskType();
                } else {
                    taskType = null;
                }
                if (!Intrinsics.LJFF(taskType, "text2image") && !LJIILL(nLETrackSlot) && (!z || ((mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && resourceFile.length() > 0))) {
                    return true;
                }
            }
        }
        return false;
    }
}
