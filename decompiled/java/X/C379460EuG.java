package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379460EuG {
    public static final String LIZIZ(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(editorProAIGCMediaItemModel.param.aspectRatio);
        sbLIZ.append(editorProAIGCMediaItemModel.param.imagePath);
        sbLIZ.append(editorProAIGCMediaItemModel.param.promptDescription);
        sbLIZ.append(editorProAIGCMediaItemModel.param.imagePathList);
        sbLIZ.append(editorProAIGCMediaItemModel.param.styleEffectId);
        sbLIZ.append(editorProAIGCMediaItemModel.param.duration);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final List<List<EditorProAIGCMediaItemModel>> LIZJ(List<EditorProAIGCMediaItemModel> list) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(77), list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLJLLLL) {
            if (!a0.LJJJIL(((EditorProAIGCMediaItemModel) obj).epAIGCAsyncTaskId)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list2) {
            String str = ((EditorProAIGCMediaItemModel) obj2).epAIGCAsyncTaskId;
            Object arrayList4 = linkedHashMap.get(str);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(str, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList5.add(C13LP.LJLLLL(new AComparatorS24S0000000_5(78), (Iterable) it2.next()));
        }
        arrayList3.addAll(arrayList5);
        if (!list3.isEmpty()) {
            arrayList3.addAll(C13LP.LJJJIL(list3, 4));
        }
        return arrayList3;
    }

    public static final boolean LIZLLL(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!u.LJIIZILJ(lowerCase, ".png", false) && !u.LJIIZILJ(lowerCase, ".jpg", false) && !u.LJIIZILJ(lowerCase, ".jpeg", false) && !u.LJIIZILJ(lowerCase, ".webp", false) && !u.LJIIZILJ(lowerCase, ".gif", false) && !u.LJIIZILJ(lowerCase, ".bmp", false) && !u.LJIIZILJ(lowerCase, ".heic", false) && !u.LJIIZILJ(lowerCase, ".heif", false)) {
            return false;
        }
        return true;
    }

    public static final EnumC378720Et4 LJ(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModel.param;
        if (aIGCGenerationParam.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
            return EnumC378720Et4.AI_TRANSITION_RESULT;
        }
        AIGCGenerationParamType aIGCGenerationParamType = aIGCGenerationParam.mediaType;
        if (aIGCGenerationParamType != AIGCGenerationParamType.T2I_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2I_TYPE) {
            if (aIGCGenerationParamType != AIGCGenerationParamType.T2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.FL2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.V2V_TYPE) {
                return null;
            }
            return EnumC378720Et4.TEXT_TO_VIDEO_RESULT;
        }
        return EnumC378720Et4.TEXT_TO_IMAGE_RESULT;
    }

    public static final C379470EuH LIZ(EnumC378720Et4 enumC378720Et4, Context context, boolean z) {
        List listLJIIJJI;
        String string;
        int i = C378340EsS.LIZ[enumC378720Et4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    listLJIIJJI = C13BV.INSTANCE;
                    string = null;
                } else {
                    listLJIIJJI = C1697810uHb.LJIIJJI(new C379910Euz(EnumC379800Euo.REGENERATE, z), new C379910Euz(EnumC379800Euo.MODIFY, true));
                    string = context.getString(2131825355);
                }
            } else {
                listLJIIJJI = Collections.singletonList(new C379910Euz(EnumC379800Euo.REGENERATE, z));
                string = context.getString(2131834196);
            }
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(new C379910Euz(EnumC379800Euo.REGENERATE, z), new C379910Euz(EnumC379800Euo.MODIFY, true));
            string = context.getString(2131825356);
        }
        return new C379470EuH(enumC378720Et4, string, listLJIIJJI);
    }
}
