package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356600DyU {
    public static int LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(382));

    public static int LJ() {
        return Math.max(((Number) LIZIZ.getValue()).intValue(), LIZ);
    }

    public static Pair LIZJ(NLETrackSlot nLETrackSlot) {
        NLEVideoEffect next;
        NLEFilter next2;
        String resourceId;
        NLEResourceNode effectSDKFilter;
        String resourceId2;
        NLEResourceNode effectSDKEffect;
        if (nLETrackSlot == null) {
            return null;
        }
        Iterator<NLEVideoEffect> it2 = nLETrackSlot.getVideoEffects().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C123100dR.LIZ(next.getExtra("editor_pro_effect_category"))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEVideoEffect nLEVideoEffect = next;
        if (nLEVideoEffect != null) {
            NLESegmentEffect segment = nLEVideoEffect.getSegment();
            if (segment != null && (effectSDKEffect = segment.getEffectSDKEffect()) != null) {
                resourceId2 = effectSDKEffect.getResourceId();
            } else {
                resourceId2 = null;
            }
            String extra = nLEVideoEffect.getExtra("editor_pro_effect_category");
            if (C123100dR.LIZ(resourceId2) && C123100dR.LIZ(extra)) {
                return new Pair(resourceId2, extra);
            }
        }
        Iterator<NLEFilter> it3 = nLETrackSlot.getFilters().iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (C123100dR.LIZ(next2.getExtra("editor_pro_effect_category"))) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        NLEFilter nLEFilter = next2;
        if (nLEFilter == null) {
            return null;
        }
        NLESegmentFilter segment2 = nLEFilter.getSegment();
        if (segment2 != null && (effectSDKFilter = segment2.getEffectSDKFilter()) != null) {
            resourceId = effectSDKFilter.getResourceId();
        } else {
            resourceId = null;
        }
        String extra2 = nLEFilter.getExtra("editor_pro_effect_category");
        if (!C123100dR.LIZ(resourceId) || !C123100dR.LIZ(extra2)) {
            return null;
        }
        return new Pair(resourceId, extra2);
    }

    public static int LIZLLL(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("original_effect_order");
        if (extra != null && extra.length() != 0) {
            return CastIntegerProtector.parseInt(extra);
        }
        return -1;
    }

    public static boolean LJFF(NLEModel nLEModel) {
        NLETrackSlot slotByIndex;
        List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        NLETrack nLETrackLIZLLL = C348520DlS.LIZLLL(nLEModel);
        if (nLETrackLIZLLL != null && (slotByIndex = nLETrackLIZLLL.getSlotByIndex(0)) != null) {
            arrayList2.add(slotByIndex);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (Boolean.parseBoolean(((NLENode) it3.next()).getExtra("is_edit_effect_duration"))) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(NLESegment nLESegment, EditEffectModel editEffectModel) {
        String extra;
        EffectSearchModel effectSearchModel;
        String extra2 = nLESegment.getExtra("applied_from_search_panel");
        if (extra2 == null || !Intrinsics.LJFF(a0.LJLI(extra2), Boolean.TRUE) || (extra = nLESegment.getExtra("searched_effect_info")) == null || extra.length() == 0 || (effectSearchModel = (EffectSearchModel) C051R.LIZ(extra, EffectSearchModel.class)) == null) {
            return;
        }
        editEffectModel.editingEffectSearchFrom.add(effectSearchModel.getSearchFrom());
        editEffectModel.searchId.add(effectSearchModel.getSearchId());
        editEffectModel.searchKeyword.add(effectSearchModel.getSearchKeyword());
        editEffectModel.searchResultId.add(effectSearchModel.getSearchResultId());
        editEffectModel.searchUniversalRank.add(effectSearchModel.getSearchUniversalRank());
        editEffectModel.creatorSearchInfo.add(effectSearchModel.getCreatorSearchInfo());
    }

    public static NLETrack LIZIZ(List list, Pair pair) {
        NLETrack nLETrack = null;
        for (NLETrack nLETrack2 : C13LP.LJLJJLL(list)) {
            VecNLETrackSlotSPtr sortedSlots = nLETrack2.getSortedSlots();
            if (!(sortedSlots instanceof Collection) || !sortedSlots.isEmpty()) {
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    if (nLETrackSlot.getStartTime() < ((Number) pair.getSecond()).longValue() && ((Number) pair.getFirst()).longValue() < nLETrackSlot.getEndTime()) {
                        return nLETrack;
                    }
                }
            }
            nLETrack = nLETrack2;
        }
        return (NLETrack) C13LP.LJJJLZIJ(0, list);
    }

    public static void LJI(NLEModel nLEModel, ArrayList arrayList) {
        String strLJJZ;
        List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(nLEModel);
        ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = listLJJIJLIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
        }
        for (NLETrackSlot nLETrackSlot : arrayList2) {
            EffectPointModel effectPointModel = (EffectPointModel) C13LP.LJJJLZIJ(LJIIIIZZ(nLETrackSlot, arrayList), arrayList);
            if (effectPointModel != null && ((strLJJZ = C351220Dpo.LJJZ(nLETrackSlot)) == null || strLJJZ.length() == 0)) {
                NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentEffectDynamicCast != null) {
                    NLEResourceNode effectSDKEffect = nLESegmentEffectDynamicCast.getEffectSDKEffect();
                    effectSDKEffect.setResourceId(effectPointModel.getKey());
                    effectSDKEffect.setResourceName(effectPointModel.getName());
                }
                NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentComposerFilterDynamicCast != null) {
                    NLEResourceNode effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter();
                    effectSDKFilter.setResourceId(effectPointModel.getKey());
                    effectSDKFilter.setResourceName(effectPointModel.getName());
                }
            }
        }
    }

    public static int LJIIIIZZ(NLETrackSlot nLETrackSlot, ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((EffectPointModel) it2.next()).getUuid(), nLETrackSlot.getUUID())) {
                if (i > 0 && i < arrayList.size() && !nLETrackSlot.hasExtra("original_effect_order")) {
                    nLETrackSlot.setExtra("original_effect_order", String.valueOf(i));
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void LJIIIZ(NLETrack nLETrack, List list) {
        int iIndexOf = list.indexOf(nLETrack);
        if (iIndexOf < 0) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Integer numValueOf = Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer());
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                iIndexOf = numValueOf.intValue() + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        nLETrack.setLayer(iIndexOf);
        nLETrack.setExtra("EffectTrackType", "NORMAL");
        nLETrack.setExtra("track_type", "video_effect");
        C351220Dpo.LLLLJI(nLETrack);
    }

    public static void LJII(NLETrackSlot nLETrackSlot, EffectModel effectModel, NLEModel nLEModel, EnumC356310Dy1 enumC356310Dy1) {
        NLEResourceNode effectSDKFilter;
        NLEResourceNode effectSDKEffect;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && effectModel != null) {
            mainSegment.setExtra("nleExtraEffectSelectedColor", String.valueOf(effectModel.color));
            mainSegment.setExtra("nleExtraEffectKey", effectModel.key);
            mainSegment.setExtra("nleExtraEffectType", String.valueOf(effectModel.type));
            mainSegment.setExtra("nleExtraEffectCategory", effectModel.category);
            mainSegment.setExtra("nleExtraEffectIndex", String.valueOf(effectModel.index));
            mainSegment.setExtra("nleExtraEffectSource", String.valueOf(effectModel.source));
            mainSegment.setExtra("nleExtraEffectDesignerId", effectModel.designerId);
            mainSegment.setExtra("nleExtraEffectDesignerEncryptedId", effectModel.designerEncryptedId);
            mainSegment.setExtra("nleExtraIsEditPro", String.valueOf(effectModel.isFromEditPro));
            mainSegment.setExtra("nleExtraEffectSelectFrom", effectModel.selectFrom);
            mainSegment.setExtra("nleExtraEffectExtra", effectModel.extra);
            mainSegment.setExtra("nleExtraEffectEntrancePoint", effectModel.entrancePoint);
            mainSegment.setExtra("nle_extra_resource_id", effectModel.resourceId);
            String str = effectModel.challenge;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            mainSegment.setExtra("nleExtraEffectChallenge", str);
            String str3 = effectModel.iconUrl;
            if (str3 != null) {
                str2 = str3;
            }
            mainSegment.setExtra("nleExtraEffectIconUrl", str2);
            String str4 = effectModel.recommendReason;
            if (str4 != null) {
                mainSegment.setExtra("nle_extra_effect_recommend_reason", str4);
            }
            String str5 = effectModel.recommendRuleTags;
            if (str5 != null) {
                mainSegment.setExtra("nle_extra_effect_recommend_rule_tags", str5);
            }
            mainSegment.setExtra("effect_file_url", effectModel.fileUrl);
            NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(mainSegment);
            if (nLESegmentEffectDynamicCast != null && (effectSDKEffect = nLESegmentEffectDynamicCast.getEffectSDKEffect()) != null) {
                effectSDKEffect.setExtra("biz_res_id", C0FGD.LIZ(effectModel.resId, C1451980nt6.LIZ("normal_effect")));
            }
            NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment);
            if (nLESegmentComposerFilterDynamicCast != null && (effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter()) != null) {
                effectSDKFilter.setExtra("biz_res_id", C0FGD.LIZ(effectModel.resId, C1451980nt6.LIZ("normal_effect")));
            }
        }
        nLETrackSlot.setExtra("original_effect_order", String.valueOf(C348400DlG.LIZ(nLEModel) + 1));
        nLETrackSlot.setExtra("extra_video_effect_source", String.valueOf(enumC356310Dy1.getValue()));
        nLETrackSlot.setExtra("global_filter_type", "composer_effect");
        if (effectModel != null) {
            nLETrackSlot.setExtra("editor_pro_effect_category", effectModel.category);
        }
    }
}
