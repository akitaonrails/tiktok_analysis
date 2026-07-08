package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.relation.model.BigCardMusicUrlResponse;

/* JADX INFO: renamed from: X.0CmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323680CmU implements InterfaceC323690CmV {
    public static final C323680CmU LIZIZ = new C323680CmU();
    public final /* synthetic */ InterfaceC323690CmV LIZ = (InterfaceC323690CmV) C2208208ky.LIZIZ.create(InterfaceC323690CmV.class);

    @Override // X.InterfaceC323690CmV
    @InterfaceC1501200pAU("/tiktok/user/relation/config/v1")
    public final AbstractC19484711Kz<BigCardMusicUrlResponse> LIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("clip_id") String str) {
        return this.LIZ.LIZ(i, str);
    }

    @Override // X.InterfaceC323690CmV
    @InterfaceC1501200pAU("/tiktok/user/relation/config/v1")
    public final AbstractC19484711Kz<BigCardMusicUrlResponse> LIZIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i) {
        return this.LIZ.LIZIZ(i);
    }
}
