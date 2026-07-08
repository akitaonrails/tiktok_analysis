package X;

import com.bytedance.scene.Scene;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1C9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225741C9k extends Message.Builder<C2225731C9j, C2225741C9k> {
    public EnumC2225751C9l LIZLLL;
    public Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225731C9j build() {
        EnumC2225751C9l enumC2225751C9l = this.LIZLLL;
        if (enumC2225751C9l != null) {
            return new C2225731C9j(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2225751C9l, Scene.SCENE_SERVICE);
        throw null;
    }
}
