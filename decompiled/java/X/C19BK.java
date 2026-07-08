package X;

import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: renamed from: X.19BK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C19BK {
    void disableSupportRestore();

    String getSceneDebugInfo(Scene scene);

    List<Scene> getSceneList();

    boolean isSupportChildReplaceParentScene();

    boolean isSupportRestore();
}
