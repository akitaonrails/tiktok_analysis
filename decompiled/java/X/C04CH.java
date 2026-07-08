package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* JADX INFO: renamed from: X.04CH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CH extends AbstractC1748750vbl {
    public final String LJIIJJI;

    @Override // X.AbstractC1748790vbp
    public final C1748850vbv LIZ() {
        return new C1748850vbv(new C1748840vbu(Scene.SCENE_SERVICE, new C1747940vaS[0]));
    }

    public C04CH(String str) {
        super("rd_tiktokec_use_check", "lib_track_builtin_lane_rd");
        this.LJIIJJI = str;
    }

    @Override // X.AbstractC1748750vbl
    public final void LJI(LaneParams laneParams) {
        laneParams.put(Scene.SCENE_SERVICE, this.LJIIJJI);
    }
}
