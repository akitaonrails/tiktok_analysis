package X;

import com.bytedance.scene.Scene;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0MFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC565380MFk implements InterfaceC363130ELn {
    public final WeakReference<Scene> callerSceneRef;

    public final void onCallerSceneUnavailable(Scene scene) {
    }

    public final WeakReference<Scene> getCallerSceneRef$scene_navigation_release() {
        return this.callerSceneRef;
    }

    public AbstractC565380MFk(Scene scene) {
        this.callerSceneRef = new WeakReference<>(scene);
    }
}
