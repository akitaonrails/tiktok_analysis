package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;

/* JADX INFO: renamed from: X.0iTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1243990iTd {
    @InterfaceC1501200pAU("/tiktok/user/relation/user/info/v1")
    AbstractC19484711Kz<MutualRelationListResponse> LIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("to_user_ids") String str, @InterfaceC1501120pAM("to_sec_user_ids") String str2, @InterfaceC1501120pAM("mention_type") Long l, @InterfaceC1501120pAM("aweme_id") Long l2, @InterfaceC1501120pAM("timeout") String str3, @InterfaceC1501120pAM("detect_by") String str4, @InterfaceC1501120pAM("self_follow_tier") String str5, @InterfaceC1501120pAM("other_follow_tier") String str6);
}
