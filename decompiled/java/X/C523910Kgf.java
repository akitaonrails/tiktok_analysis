package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523910Kgf {
    public static final boolean LIZ(Scene scene, NavigationScene navigationScene) {
        for (Object obj : (ArrayList) navigationScene.getSceneList()) {
            if (Intrinsics.LJFF(obj, scene)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(NavigationScene navigationScene, Class<? extends Scene> cls) {
        for (Object obj : (ArrayList) navigationScene.getSceneList()) {
            if (Intrinsics.LJFF(obj.getClass(), cls)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
