package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import java.util.HashSet;

/* JADX INFO: renamed from: X.12WM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12WM {
    public static SceneActivityCompatibilityLayerFragment LIZ(Activity activity) {
        SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragment = (SceneActivityCompatibilityLayerFragment) activity.getFragmentManager().findFragmentByTag(SceneActivityCompatibilityLayerFragment.class.getName());
        if (sceneActivityCompatibilityLayerFragment == null) {
            SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragment2 = new SceneActivityCompatibilityLayerFragment();
            C19BL.LIZ(activity.getFragmentManager(), activity.getFragmentManager().beginTransaction().add(sceneActivityCompatibilityLayerFragment2, SceneActivityCompatibilityLayerFragment.class.getName()), false);
            return sceneActivityCompatibilityLayerFragment2;
        }
        return sceneActivityCompatibilityLayerFragment;
    }

    public static boolean LIZIZ(Activity activity, LifecycleOwner lifecycleOwner) {
        if (!C19BL.LJ(activity) || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static void LIZJ(final C19EG c19eg, final LifecycleOwner lifecycleOwner, final String[] strArr, final int i, final C12WO c12wo) {
        C12WP.LIZ();
        if (LIZIZ(c19eg, lifecycleOwner)) {
            return;
        }
        final SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragmentLIZ = LIZ(c19eg);
        if (sceneActivityCompatibilityLayerFragmentLIZ.isAdded()) {
            sceneActivityCompatibilityLayerFragmentLIZ.LIZJ(lifecycleOwner, strArr, i, c12wo);
        } else {
            ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).add(new C12WJ() { // from class: X.12WL
                @Override // X.C12WJ
                public final void LIZ() throws Throwable {
                    ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).remove(this);
                    if (C12WM.LIZIZ(c19eg, lifecycleOwner)) {
                        return;
                    }
                    sceneActivityCompatibilityLayerFragmentLIZ.LIZJ(lifecycleOwner, strArr, i, c12wo);
                }
            });
        }
    }

    public static void LIZLLL(final C19EG c19eg, final LifecycleOwner lifecycleOwner, final Intent intent, final int i, final Bundle bundle, final C12WN c12wn) {
        C12WP.LIZ();
        if (LIZIZ(c19eg, lifecycleOwner)) {
            return;
        }
        final SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragmentLIZ = LIZ(c19eg);
        if (sceneActivityCompatibilityLayerFragmentLIZ.isAdded()) {
            sceneActivityCompatibilityLayerFragmentLIZ.LIZLLL(lifecycleOwner, intent, i, bundle, c12wn);
        } else {
            ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).add(new C12WJ() { // from class: X.12W8
                @Override // X.C12WJ
                public final void LIZ() throws Throwable {
                    ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).remove(this);
                    if (C12WM.LIZIZ(c19eg, lifecycleOwner)) {
                        return;
                    }
                    sceneActivityCompatibilityLayerFragmentLIZ.LIZLLL(lifecycleOwner, intent, i, bundle, c12wn);
                }
            });
        }
    }
}
