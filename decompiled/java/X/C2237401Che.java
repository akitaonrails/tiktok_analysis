package X;

import com.bytedance.scene.Scene;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Che, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237401Che extends Message.Builder<C2237381Chc, C2237401Che> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237381Chc build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2237381Chc(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "is_zoom_layout", this.LJ, "offset_y", this.LJFF, Scene.SCENE_SERVICE);
        throw null;
    }
}
