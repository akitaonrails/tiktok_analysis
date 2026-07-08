package X;

import Y.ARunnableS14S0400000_5;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12WG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12WG {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1870480ym6());

    @InterfaceC1294060jmO
    public static final boolean LIZIZ(Scene scene) {
        if (scene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static final C19EG LJ(Scene scene) {
        return (C19EG) scene.requireActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12WI, X.12WK] */
    public static final void LIZ(final Scene scene, final Function1<? super Configuration, Unit> function1) {
        final Activity activity = scene.mActivity;
        if (activity != null) {
            final ?? r3 = new C12WK() { // from class: X.12WI
                @Override // X.C12WK
                public final void onConfigurationChanged(Configuration configuration) {
                    function1.invoke(configuration);
                }
            };
            C12WP.LIZ();
            if (!C12WM.LIZIZ(activity, scene)) {
                final SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragmentLIZ = C12WM.LIZ(activity);
                if (sceneActivityCompatibilityLayerFragmentLIZ.isAdded()) {
                    sceneActivityCompatibilityLayerFragmentLIZ.LIZ(scene, r3);
                } else {
                    ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).add(new C12WJ() { // from class: X.12WH
                        @Override // X.C12WJ
                        public final void LIZ() {
                            ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).remove(this);
                            if (C12WM.LIZIZ(activity, scene)) {
                                return;
                            }
                            sceneActivityCompatibilityLayerFragmentLIZ.LIZ(scene, r3);
                        }
                    });
                }
            }
        }
    }

    public static final void LIZJ(Scene scene, Runnable runnable) {
        if (scene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), LJFF(scene, runnable));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.AwS573S0100000_29] */
    public static final ARunnableS14S0400000_5 LJFF(final Scene scene, Runnable runnable) {
        final C259800zU c259800zU = new C259800zU();
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.bytedance.scene.ktx.SceneExtensionsKt$wrapRunnable$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    scene.getLifecycle().removeObserver(this);
                    Function0<Unit> function0 = c259800zU.element;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        };
        scene.getLifecycle().addObserver(lifecycleEventObserver);
        ARunnableS14S0400000_5 aRunnableS14S0400000_5 = new ARunnableS14S0400000_5(runnable, scene, lifecycleEventObserver, c259800zU, 6);
        c259800zU.element = new AwS573S0100000_29(aRunnableS14S0400000_5, 881);
        return aRunnableS14S0400000_5;
    }

    public static final void LIZLLL(Scene scene, Runnable runnable, long j) {
        if (scene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C786410Ut5.LJLIIL(j, (Handler) LIZ.getValue(), LJFF(scene, runnable));
    }
}
