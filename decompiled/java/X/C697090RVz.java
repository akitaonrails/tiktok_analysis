package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0RVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697090RVz {
    public static final Map<String, Set<String>> LIZ = C2097608Jq.LJIIIIZZ(new Pair("low_tag", C13LQ.LJLIIL(new String[]{"low_tag_story", "low_tag_photo", "low_tag_text", "low_tag_live_photo", "low_tag_paid_content_preview_tag"})), new Pair("high_tag", C13LQ.LJLIIL(new String[]{"high_tag_studio_followers_viewed", "high_tag_studio_similar_creators", "sov_preview", "high_tag_dm_shared", "high_tag_paid_content_preview_tag", "high_tag_privacy", "high_tag_friend", "high_tag_following", "high_tag_relation_unknown", "high_tag_maf", "high_tag_live_related", "high_tag_multilabel", "high_tag_label", "high_tag_poi", "high_tag_fan_spotlight", "high_tag_reconsumption", "high_tag_prompt_related", "high_tag_interest_reselection", "high_tag_ttec_recommend_tag_creator", "high_tag_ttec_recommend_tag_customer", "high_tag_drama_reservation_fyp_tag"})), new Pair("genre_tag", C13LQ.LJLIIL(new String[]{"genre_tag_story", "genre_tag_photo", "genre_tag_text", "genre_tag_live_photo", "genre_tag_recast"})));

    public static final Map<String, Set<String>> LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, Set<String>> map = LIZ;
        Map<String, Set<String>> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("feed_left_tag_priority_settings", Map.class, map);
        return map2 != null ? map2 : map;
    }
}
