package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DTK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1DTK {
    @InterfaceC1501200pAU("/aweme/v1/recommend/user/dislike/")
    C11NZ<Unit> LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) Integer num);

    @InterfaceC1501200pAU("/aweme/v1/following/page/user/recommend/")
    C15O7<SuperAccountList> LIZIZ(@InterfaceC1501120pAM("recommend_reason_type") String str);

    @InterfaceC1501200pAU("/tiktok/user/relation/maf/list/v1")
    C11NZ<MaFListResponse> LIZJ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2);
}
