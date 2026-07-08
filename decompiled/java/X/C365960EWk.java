package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEAllowListOperationType;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS89S0210000_5;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365960EWk {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0FGC.LIZ(2);
    }

    public static void LIZ(NLEModel nLEModel) {
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = it2.next().getSlots();
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                if (nLETrackSlot.getKeyframes().size() > 0) {
                    arrayList.add(nLETrackSlot);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                for (NLETrackSlot nLETrackSlot2 : ((NLETrackSlot) it3.next()).getKeyframes()) {
                    if (nLETrackSlot2.getScale() == 1.0f) {
                        nLETrackSlot2.setScale(1.0f);
                    }
                    if (nLETrackSlot2.getTransformX() == 0.0f) {
                        nLETrackSlot2.setTransformX(0.0f);
                    }
                    if (nLETrackSlot2.getTransformY() == 0.0f) {
                        nLETrackSlot2.setTransformY(0.0f);
                    }
                    if (nLETrackSlot2.getRotation() == 0.0f) {
                        nLETrackSlot2.setRotation(0.0f);
                    }
                }
            }
        }
    }

    public static boolean LIZIZ(NLEVideoEffect nLEVideoEffect) {
        String extra;
        NLESegmentEffect segment;
        String jsonParam;
        if (!nLEVideoEffect.hasExtra("ep_magic_resource_id") || (extra = nLEVideoEffect.getExtra("ep_magic_resource_id")) == null || !(!a0.LJJJIL(extra)) || (segment = nLEVideoEffect.getSegment()) == null || (jsonParam = segment.getJsonParam()) == null || TextUtils.isEmpty(jsonParam)) {
            return false;
        }
        return !TextUtils.isEmpty(new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url"));
    }

    public static void LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        VecNLEVideoEffectSPtr videoEffects;
        NLESegmentEffect segment;
        String jsonParam;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                if (nLETrackSlot != null && (videoEffects = nLETrackSlot.getVideoEffects()) != null) {
                    for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                        if (LIZIZ(nLEVideoEffect) && (segment = nLEVideoEffect.getSegment()) != null && (jsonParam = segment.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
                            String strOptString = new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url");
                            if (!TextUtils.isEmpty(strOptString)) {
                                NLEMediaUtil.operateGlobalAllowedPaths(new VecString(new String[]{strOptString}), NLEAllowListOperationType.NLE_ALLOWLISTOPERATION_TYPE_ADD);
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean LIZJ(String str, String str2) {
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static void LJFF(NLEModel nLEModel, Map map) {
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            if (C123100dR.LIZ(nLEResourceNode.getResourceFile()) && map.containsKey(nLEResourceNode.getResourceFile())) {
                String str = (String) map.get(nLEResourceNode.getResourceFile());
                if (C123100dR.LIZ(str)) {
                    nLEResourceNode.setResourceFile(str);
                }
            }
        }
    }

    public static void LJ(AwemeDraft awemeDraft, boolean z, int i) {
        EditorProModel editorProModel;
        String strLJJIFFI;
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = false;
        }
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NLEFeedbackLog updateNLEPath start nleData: ");
        sbLIZ.append(awemeDraft.LJIIJJI);
        C571450Mb9.LIZ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<String, String> map = awemeDraft.LIZ.nleInfoModel.copyResMap;
        if (map != null) {
            awemeDraft.LJIJJ.putAll(map);
        }
        if (!awemeDraft.LJIJJ.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[NLE update]: copyResMap size  ");
            sbLIZ2.append(awemeDraft.LJIJJ.keySet().size());
            C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            awemeDraft.LIZ.editorProDraftModel.copyResMap.putAll(awemeDraft.LJIJJ);
            StringBuilder sb = new StringBuilder();
            if (C123100dR.LIZ(awemeDraft.LJIIJJI)) {
                for (String str : awemeDraft.LJIJJ.keySet()) {
                    String str2 = awemeDraft.LJIJJ.get(str);
                    if (LIZJ(str, str2) && str2 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append(" -> ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append("; ");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                        String str3 = awemeDraft.LJIIJJI;
                        if (str3 != null) {
                            strLJJIFFI = u.LJJIFFI(str3, str, str2, false);
                        } else {
                            strLJJIFFI = null;
                        }
                        awemeDraft.LJIJJ(strLJJIFFI);
                    }
                }
            }
            C1662160tM6 c1662160tM62 = C1662160tM6.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("NLEFeedbackLog updateNLEPath replaceMap str: ");
            sbLIZ4.append((Object) sb);
            C571450Mb9.LIZ(c1662160tM62, C2188811AlT.LIZIZ(sbLIZ4));
        } else {
            C349910Dnh.LIZ("[NLE update]: moveFileMap empty");
        }
        if (C123100dR.LIZ(awemeDraft.LJIIJJI)) {
            CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
            if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && editorProModel.isAdvancedEditDraft()) {
                z2 = true;
            }
            if (C295990Biv.LIZ() && z2) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("NLEFeedbackLog updateNLEPath skip editor round-trip for advanced edit draft isSave=");
                sbLIZ5.append(z);
                C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                if (C350300DoK.LIZ()) {
                    AnonymousClass0941.LIZ(new AwS89S0210000_5(awemeDraft, (VideoPublishEditModel) null, z, 1));
                }
            } else {
                AnonymousClass0941.LIZ(new AwS89S0210000_5(awemeDraft, (VideoPublishEditModel) null, z, 2));
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("updateNLEPathDirectly cost: ");
        sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
