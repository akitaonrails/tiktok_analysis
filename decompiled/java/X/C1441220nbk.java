package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.ss.android.ugc.tiktok.eventtracking.group.PropBasicParamGroup;
import java.util.List;

/* JADX INFO: renamed from: X.0nbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441220nbk {
    public static PropBasicParamGroup LIZ(Effect effect) {
        String strLJJLIIIJ;
        List<String> v2Tags;
        String effectId = effect.getEffectId();
        String resourceId = effect.getResourceId();
        String name = effect.getName();
        EffectLabel effectLabel = effect.getEffectLabel();
        String str = "";
        if (effectLabel == null || (v2Tags = effectLabel.getV2Tags()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        String recommend_reason = effect.getRecommend_reason();
        if (recommend_reason == null) {
            recommend_reason = "";
        }
        String recommendRuleTags = effect.getRecommendRuleTags();
        if (recommendRuleTags != null) {
            str = recommendRuleTags;
        }
        String recId = effect.getRecId();
        if (recId == null) {
            recId = CardStruct.IStatusCode.DEFAULT;
        }
        return new PropBasicParamGroup(effectId, resourceId, name, strLJJLIIIJ, recommend_reason, str, recId, effect.getLogId(), String.valueOf(effect.is_cached_data() ? 1 : 0));
    }
}
