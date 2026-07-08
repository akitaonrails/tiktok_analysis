package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.0nmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447800nmM {
    public static NavigationScene LIZ(Scene scene) {
        C12WP.LIZ();
        while (scene != null) {
            scene = scene.mParentScene;
            if (scene instanceof NavigationScene) {
                return (NavigationScene) scene;
            }
        }
        return null;
    }

    public static NavigationScene LIZIZ(Scene scene) {
        C12WP.LIZ();
        NavigationScene navigationSceneLIZ = LIZ(scene);
        if (navigationSceneLIZ == null) {
            if (scene.getApplicationContext() != null) {
                if (scene instanceof NavigationScene) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scene ");
                    sbLIZ.append(scene);
                    sbLIZ.append(" is root Scene");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Scene ");
            sbLIZ2.append(scene);
            sbLIZ2.append(" is not attached to any Scene");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return navigationSceneLIZ;
    }
}
