package X;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0tI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659670tI5 {
    public static ViewModelProvider LIZ(Scene scene) {
        Activity activity = scene.mActivity;
        if (activity == null) {
            Scene scene2 = scene.mParentScene;
            if (scene2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can't create ViewModelProvider for scene, current scene state: ");
                sbLIZ.append(scene.getLifecycle().getCurrentState());
                sbLIZ.append(" parent scene state: ");
                sbLIZ.append(scene2.getLifecycle().getCurrentState());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Can't create ViewModelProvider for scene, current scene state: ");
            sbLIZ2.append(scene.getLifecycle().getCurrentState());
            sbLIZ2.append(" don't have parent scene");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Application application = activity.getApplication();
        if (application != null) {
            return new ViewModelProvider(scene.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.getInstance(application));
        }
        throw new IllegalStateException("Your activity is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
