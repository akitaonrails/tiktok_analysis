package X;

import android.content.ComponentCallbacks2;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0KzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535500KzM {
    public static final InterfaceC535600KzW LIZ(Scene scene) {
        if (scene == null) {
            return null;
        }
        C128Y c128yLIZ = C372650EjH.LIZ(scene);
        if (c128yLIZ instanceof InterfaceC535600KzW) {
            return (InterfaceC535600KzW) c128yLIZ;
        }
        ComponentCallbacks2 componentCallbacks2 = scene.mActivity;
        if (!(componentCallbacks2 instanceof InterfaceC535600KzW)) {
            return null;
        }
        return (InterfaceC535600KzW) componentCallbacks2;
    }
}
