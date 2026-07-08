package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658150tFd {
    public static final void LIZIZ(C19A3 c19a3, String str) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag(str);
        if (sceneFindSceneByTag != null) {
            c19a3.hide(sceneFindSceneByTag);
        }
    }

    public static final void LIZJ(C19A3 c19a3, String str) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag(str);
        if (sceneFindSceneByTag != null) {
            c19a3.remove(sceneFindSceneByTag);
        }
    }

    public static final void LJ(C19A3 c19a3, String str) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag(str);
        if (sceneFindSceneByTag != null) {
            c19a3.show(sceneFindSceneByTag);
        }
    }

    public static final void LIZ(C19A3 c19a3, int i, Scene scene, String str) {
        c19a3.beginTransaction();
        c19a3.add(i, scene, str);
        c19a3.hide(scene);
        c19a3.commitTransaction();
    }

    public static final void LIZLLL(C19A3 c19a3, int i, C19A3 c19a32, String str) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag(str);
        if (!Intrinsics.LJFF(sceneFindSceneByTag, c19a32)) {
            if (c19a3.isAdded(c19a32)) {
                c19a3.remove(c19a32);
            }
            if (sceneFindSceneByTag == null) {
                c19a3.add(i, c19a32, str, 0);
            } else if (c19a3.isShow(sceneFindSceneByTag)) {
                c19a3.remove(sceneFindSceneByTag);
                c19a3.add(i, c19a32, str, 0);
            } else {
                c19a3.remove(sceneFindSceneByTag);
                LIZ(c19a3, i, c19a32, str);
            }
        }
    }
}
