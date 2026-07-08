package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377130EqV {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModel.param;
        AIGCBusinessType aIGCBusinessType = aIGCGenerationParam.businessType;
        AIGCBusinessType aIGCBusinessType2 = AIGCBusinessType.AI_EXTEND;
        if (aIGCBusinessType != aIGCBusinessType2 && editorProAIGCMediaItemModel.businessType != aIGCBusinessType2) {
            AIGCGenerationParamType aIGCGenerationParamType = aIGCGenerationParam.mediaType;
            AIGCGenerationParamType aIGCGenerationParamType2 = AIGCGenerationParamType.V2V_TYPE;
            if (aIGCGenerationParamType == aIGCGenerationParamType2 || editorProAIGCMediaItemModel.type == aIGCGenerationParamType2 || aIGCGenerationParam.inheritEditProperties) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (C0E5J.LIZ((NLETrackSlot) it3.next())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static List LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (nLEModel != null && videoPublishEditModel != null) {
            ArrayList arrayList = new ArrayList();
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String strLIZIZ = C377740ErU.LIZIZ((NLETrackSlot) it3.next());
                if (strLIZIZ != null && strLIZIZ.length() > 0) {
                    C377150EqX c377150EqX = C377150EqX.LIZ;
                    EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ, AIGCGenerationParamType.FL2V_TYPE, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                    if (editorProAIGCMediaItemModelLJIIJJI != null && editorProAIGCMediaItemModelLJIIJJI.param.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
                        arrayList.add(editorProAIGCMediaItemModelLJIIJJI.serverTaskId);
                    }
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        C377150EqX c377150EqX = C377150EqX.LIZ;
        ArrayList arrayList = (ArrayList) C377150EqX.LJIILLIIL(videoPublishEditModel, str, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((EditorProAIGCMediaItemModel) it2.next()).isSelected) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static List LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, AIGCGenerationParamType aIGCGenerationParamType) {
        String str;
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String strLIZIZ = C377740ErU.LIZIZ((NLETrackSlot) it3.next());
            if (strLIZIZ != null && strLIZIZ.length() > 0) {
                C377150EqX c377150EqX = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ, aIGCGenerationParamType, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI != null && (str = editorProAIGCMediaItemModelLJIIJJI.serverDownloadUrl) != null) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }
}
