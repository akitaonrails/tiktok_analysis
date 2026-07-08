package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;

/* JADX INFO: renamed from: X.0lPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357030lPx implements InterfaceC1357040lPy {
    public static final C1357030lPx LIZIZ = new C1357030lPx();
    public final /* synthetic */ InterfaceC1357040lPy LIZ = (InterfaceC1357040lPy) C2208108kx.LIZIZ.create(InterfaceC1357040lPy.class);

    @Override // X.InterfaceC1357040lPy
    @InterfaceC1501240pAY("/tiktok/video/view/v1")
    @InterfaceC1485505rh
    public final C11NZ<ViewerListResponse> LIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("offset") long j2, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i2, @InterfaceC1501100pAK("insert_ids") String str2, @InterfaceC1501100pAK("is_social_fresh_content") boolean z, @InterfaceC1501100pAK("need_cold_start_view_count") boolean z2, @InterfaceC1501100pAK("check_milestone_view") boolean z3) {
        return this.LIZ.LIZ(str, j, j2, i, i2, str2, z, z2, z3);
    }
}
