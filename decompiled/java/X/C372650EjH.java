package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0EjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372650EjH {
    public static final AbstractC214814194y LIZ(Scene scene) {
        while (scene != null) {
            if (scene instanceof AbstractC214814194y) {
                return (AbstractC214814194y) scene;
            }
            scene = scene.mParentScene;
        }
        return null;
    }

    public static final AbstractC214814194y LIZIZ(Scene scene) {
        AbstractC214814194y abstractC214814194yLIZ = LIZ(scene);
        if (abstractC214814194yLIZ != null) {
            return abstractC214814194yLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
