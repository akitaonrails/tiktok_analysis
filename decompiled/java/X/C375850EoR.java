package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0EoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375850EoR {
    public static void LIZ(Scene scene) {
        while (scene != null) {
            if (scene instanceof C214799194j) {
                C214799194j c214799194j = (C214799194j) scene;
                if (c214799194j != null) {
                    c214799194j.LLLLIL();
                    return;
                }
                return;
            }
            scene = scene.mParentScene;
        }
    }
}
