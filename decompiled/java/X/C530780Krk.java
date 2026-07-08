package X;

import android.view.View;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Krk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530780Krk {
    public static final View LIZ(InterfaceC530790Krl interfaceC530790Krl, int i, Scene scene) {
        View viewLIZIZ = interfaceC530790Krl.getInflater().LIZIZ(i);
        if (!Intrinsics.LJFF(viewLIZIZ.getContext(), scene.requireSceneContext())) {
            scene.setTheme(0);
        }
        return viewLIZIZ;
    }
}
