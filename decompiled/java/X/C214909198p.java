package X;

import com.bytedance.scene.Scene;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.198p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214909198p {
    public static final WeakHashMap<Scene, C214913198t> LIZ = new WeakHashMap<>();

    public static boolean LIZ(Scene scene) {
        C214913198t c214913198t;
        if (scene != null) {
            if (!(scene instanceof AnonymousClass1995)) {
                return false;
            }
            WeakHashMap<Scene, C214913198t> weakHashMap = LIZ;
            if (weakHashMap.size() == 0 || (c214913198t = weakHashMap.get(scene)) == null || c214913198t.LIZ == null) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("Scene can't be null");
    }
}
