package X;

import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350490Dod {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLESegmentEffect] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.ies.nle.editor_jni.NLESegment] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter, com.bytedance.ies.nle.editor_jni.NLESegmentFilter] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    public static NLETrackSlot LIZ(EffectModel effectModel, long j, long j2) {
        NLEResTag nLEResTag;
        ?? nLESegmentEffect;
        boolean zLIZ = C350500Doe.LIZ();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        if (zLIZ && effectModel.isNewEngineEffect.booleanValue()) {
            nLEResTag = NLEResTag.AMAZING;
        } else {
            nLEResTag = NLEResTag.NORMAL;
        }
        nLEResourceNode.setResourceTag(nLEResTag);
        nLEResourceNode.setResourceFile(effectModel.resDir);
        nLEResourceNode.setResourceName(effectModel.name);
        nLEResourceNode.setResourceId(effectModel.key);
        nLEResourceNode.setResourceType(NLEResType.COMPOSER);
        ?? nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(j);
        nLETrackSlot.setEndTime(j2);
        int i = 0;
        if (!effectModel.isNewEngineEffect.booleanValue()) {
            nLESegmentEffect = new NLESegmentComposerFilter();
            nLESegmentEffect.setEffectSDKFilter(nLEResourceNode);
            nLESegmentEffect.setStatus(1);
            nLESegmentEffect.setFilterName(effectModel.name);
            String[] strArr = new String[1];
            String str = effectModel.extra;
            if (str == null) {
                str = "";
            }
            strArr[0] = str;
            nLESegmentEffect.setEffectTags(new VecString(strArr));
            EffectSearchModel effectSearchModel = effectModel.searchModel;
            if (effectSearchModel != null) {
                nLESegmentEffect.setExtra("searched_effect_info", C051R.LIZIZ(effectSearchModel.copy(effectSearchModel.searchFrom, effectSearchModel.tokenType, effectSearchModel.searchId, effectSearchModel.searchKeyword, effectSearchModel.searchResultId, effectSearchModel.searchUniversalRank, effectSearchModel.creatorSearchInfo, effectSearchModel.isFirstScreen, effectSearchModel.insertedFromSearchPanel, Boolean.FALSE, effectSearchModel.applyTime)));
                if (Intrinsics.LJFF(effectSearchModel.getAppliedFromSearchPanel(), Boolean.TRUE) && !nLESegmentEffect.hasExtra("applied_from_search_panel")) {
                    nLESegmentEffect.setExtra("applied_from_search_panel", "true");
                }
            }
        } else {
            nLESegmentEffect = new NLESegmentEffect();
            nLESegmentEffect.setEffectSDKEffect(nLEResourceNode);
            nLESegmentEffect.setEffectName(effectModel.name);
            nLESegmentEffect.setExtra("nleExtraEffectSelectFrom", effectModel.selectFrom);
            nLESegmentEffect.setExtra("nleExtraEffectEntrancePoint", effectModel.entrancePoint);
            EffectSearchModel effectSearchModel2 = effectModel.searchModel;
            if (effectSearchModel2 != null) {
                nLESegmentEffect.setExtra("searched_effect_info", C051R.LIZIZ(effectSearchModel2.copy(effectSearchModel2.searchFrom, effectSearchModel2.tokenType, effectSearchModel2.searchId, effectSearchModel2.searchKeyword, effectSearchModel2.searchResultId, effectSearchModel2.searchUniversalRank, effectSearchModel2.creatorSearchInfo, effectSearchModel2.isFirstScreen, effectSearchModel2.insertedFromSearchPanel, Boolean.FALSE, effectSearchModel2.applyTime)));
                if (Intrinsics.LJFF(effectSearchModel2.getAppliedFromSearchPanel(), Boolean.TRUE) && !nLESegmentEffect.hasExtra("applied_from_search_panel")) {
                    nLESegmentEffect.setExtra("applied_from_search_panel", "true");
                }
            }
            if (effectModel.isNewEngineEffect.booleanValue()) {
                if (C350510Dof.LIZ()) {
                    i = 2;
                }
                nLESegmentEffect.setApplyTargetType(i);
                try {
                    JSONObject jSONObject = new JSONObject(effectModel.adjustParams);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                        nLEStringFloatPair.setFirst(next);
                        nLEStringFloatPair.setSecond((float) jSONObject.optDouble(next));
                        nLESegmentEffect.addAdjustParams(nLEStringFloatPair);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        nLETrackSlot.setMainSegment(nLESegmentEffect);
        return nLETrackSlot;
    }
}
