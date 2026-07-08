package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0L3U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3U {
    public static final ViewModelProvider LIZ(C19EG c19eg) {
        Scene currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(c19eg);
        if (currentScene != null) {
            if (C12WG.LIZIZ(currentScene)) {
                return null;
            }
            return C1659630tI1.LJIIIIZZ(currentScene, c19eg, null, 4);
        }
        return ViewModelProviders.of(c19eg);
    }
}
