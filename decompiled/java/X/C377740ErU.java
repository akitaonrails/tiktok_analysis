package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ErU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377740ErU {
    public static final /* synthetic */ int LIZ = 0;

    public static EditorProAIGCTemplateModel LIZ(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_async_param");
        if (extra == null) {
            return null;
        }
        return (EditorProAIGCTemplateModel) LJI(extra, EditorProAIGCTemplateModel.class);
    }

    public static String LIZIZ(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_aigc_id");
        if (extra == null || extra.length() == 0) {
            return null;
        }
        return extra;
    }

    public static String LIZJ(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_aigc_media_item_id");
        if (extra == null || extra.length() == 0) {
            return null;
        }
        return extra;
    }

    public static List LJ(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("creation_async_task_history");
        if (extra != null) {
            if (extra.length() == 0) {
                return C13BV.INSTANCE;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJFF(EnumC381960EyI enumC381960EyI) {
        if (enumC381960EyI != EnumC381960EyI.EDITOR_PRO_AIGC_T2I && enumC381960EyI != EnumC381960EyI.EDITOR_PRO_AIGC_T2V) {
            return false;
        }
        return true;
    }

    public static EnumC378030Erx LJIIIZ(AIGCGenerationParamType aIGCGenerationParamType) {
        switch (C377770ErX.LIZ[aIGCGenerationParamType.ordinal()]) {
            case 1:
                return EnumC378030Erx.T2I;
            case 2:
                return EnumC378030Erx.I2I;
            case 3:
                return EnumC378030Erx.T2V;
            case 4:
                return EnumC378030Erx.I2V;
            case 5:
                return EnumC378030Erx.FL2V;
            case 6:
                return EnumC378030Erx.V2V;
            default:
                return EnumC378030Erx.NONE;
        }
    }

    public static boolean LJIIJJI(EditorProAIGCTemplateModel editorProAIGCTemplateModel) {
        if (editorProAIGCTemplateModel.getImagePaths().size() == 2 && editorProAIGCTemplateModel.getAiCreateStylizedType() != AICreateStylizedType.STYLIZED_FL2V.getType()) {
            return true;
        }
        return false;
    }

    public static NLETrackSlot LIZLLL(NLEModel nLEModel, String str) {
        Object next;
        Iterator it2 = ((ArrayList) C352250DrT.LJFF(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(LIZIZ((NLETrackSlot) next), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (NLETrackSlot) next;
    }

    public static Object LJI(String str, Class cls) {
        try {
            return C2292508yZ.LIZ(str, cls);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "GenAIX2IHandler", "safeFromJson: e");
            return null;
        }
    }

    public static void LJII(NLETrackSlot nLETrackSlot, EditorProAIGCTemplateModel editorProAIGCTemplateModel) {
        Object c098200Yq;
        try {
            c098200Yq = C2292508yZ.LIZJ(editorProAIGCTemplateModel);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            return;
        }
        nLETrackSlot.setExtra("ep_async_param", str);
    }

    public static void LJIIJ(NLETrackSlot nLETrackSlot, String str) {
        EditorProAIGCTemplateModel editorProAIGCTemplateModelLIZ;
        if (!C0E5J.LIZ(nLETrackSlot) || str == null || str.length() == 0 || (editorProAIGCTemplateModelLIZ = LIZ(nLETrackSlot)) == null) {
            return;
        }
        LJII(nLETrackSlot, editorProAIGCTemplateModelLIZ.copy(editorProAIGCTemplateModelLIZ.bizScene, editorProAIGCTemplateModelLIZ.taskType, editorProAIGCTemplateModelLIZ.extra, editorProAIGCTemplateModelLIZ.algoRaw, editorProAIGCTemplateModelLIZ.imageFds, editorProAIGCTemplateModelLIZ.imagePaths, str, editorProAIGCTemplateModelLIZ.aiCreateStylizedType, editorProAIGCTemplateModelLIZ.stylizedAiStages));
    }

    public static void LJIIIIZZ(NLETrackSlot nLETrackSlot, String str, String str2, String str3) {
        nLETrackSlot.setExtra("ep_aigc_id", str);
        nLETrackSlot.setExtra("creation_async_task_id", str2);
        nLETrackSlot.setExtra("ep_aigc_media_item_id", str3);
    }
}
