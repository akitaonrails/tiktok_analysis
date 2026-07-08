package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DTJ implements C1DTK {
    public static final C1DTJ LIZIZ = new C1DTJ();
    public final /* synthetic */ C1DTK LIZ = (C1DTK) C2209008l6.LIZIZ.create(C1DTK.class);

    @Override // X.C1DTK
    @InterfaceC1501200pAU("/aweme/v1/recommend/user/dislike/")
    public final C11NZ<Unit> LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) Integer num) {
        return this.LIZ.LIZ(str, str2, num);
    }

    @Override // X.C1DTK
    @InterfaceC1501200pAU("/aweme/v1/following/page/user/recommend/")
    public final C15O7<SuperAccountList> LIZIZ(@InterfaceC1501120pAM("recommend_reason_type") String str) {
        boolean zLJI = MethodIDManager.LJI(202524);
        C15O7<SuperAccountList> c15o7LIZIZ = this.LIZ.LIZIZ(str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c15o7LIZIZ;
    }

    @Override // X.C1DTK
    @InterfaceC1501200pAU("/tiktok/user/relation/maf/list/v1")
    public final C11NZ<MaFListResponse> LIZJ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2) {
        return this.LIZ.LIZJ(i, i2);
    }
}
