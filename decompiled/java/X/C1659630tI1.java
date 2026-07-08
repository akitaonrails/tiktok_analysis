package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0tI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659630tI1 {
    public static final /* synthetic */ int LIZ = 0;

    public static final ViewModelProvider LIZLLL(View view) {
        return LJII(view, null, 6);
    }

    public static final ViewModelProvider LJFF(Scene scene) {
        return LJIIIIZZ(scene, null, null, 6);
    }

    public static final ViewModelProvider LJ(Fragment fragment) {
        Scene sceneLIZ = C0EBE.LIZ(fragment.getView());
        if (sceneLIZ != null) {
            return LJIIIIZZ(sceneLIZ, fragment.requireActivity(), null, 4);
        }
        return ViewModelProviders.of(fragment.requireActivity());
    }

    public static final ViewModelStoreOwner LIZ(View view, C19EG c19eg) {
        if (LIZJ(c19eg, C0EBE.LIZ(view))) {
            return c19eg;
        }
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            return LIZIZ((C19EG) sceneLIZ.requireActivity(), sceneLIZ);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final ViewModelStoreOwner LIZIZ(C19EG c19eg, Scene scene) {
        if (LIZJ(c19eg, scene)) {
            return c19eg;
        }
        while (scene != null) {
            if (scene instanceof C0MGD) {
                return scene;
            }
            scene = scene.mParentScene;
        }
        throw new IllegalArgumentException("ViewModelStoreOwnerRoot not found");
    }

    public static final boolean LIZJ(Activity activity, Scene scene) {
        InterfaceC569700MWa interfaceC569700MWaLIZIZ = C565530MFz.LIZIZ(activity, scene);
        if (interfaceC569700MWaLIZIZ == null) {
            return true;
        }
        return interfaceC569700MWaLIZIZ.LJLJJI();
    }

    public static final ViewModelProvider LJI(Scene scene, C19EG c19eg, ViewModelProvider.Factory factory) {
        ViewModelStoreOwner viewModelStoreOwnerLIZIZ = LIZIZ(c19eg, scene);
        if (viewModelStoreOwnerLIZIZ instanceof Scene) {
            if (factory != null) {
                return new ViewModelProvider(((Scene) viewModelStoreOwnerLIZIZ).getViewModelStore(), factory);
            }
            return C1659670tI5.LIZ((Scene) viewModelStoreOwnerLIZIZ);
        }
        return ViewModelProviders.of((C19EG) viewModelStoreOwnerLIZIZ, factory);
    }

    public static ViewModelProvider LJII(View view, C19EG c19eg, int i) {
        if ((i & 2) != 0) {
            Scene sceneLIZ = C0EBE.LIZ(view);
            if (sceneLIZ != null) {
                c19eg = (C19EG) sceneLIZ.requireActivity();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (LIZJ(c19eg, C0EBE.LIZ(view))) {
            return ViewModelProviders.of(c19eg, (ViewModelProvider.Factory) null);
        }
        Scene sceneLIZ2 = C0EBE.LIZ(view);
        if (sceneLIZ2 != null) {
            return LJI(sceneLIZ2, c19eg, null);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static ViewModelProvider LJIIIIZZ(Scene scene, C19EG c19eg, ViewModelProvider.Factory factory, int i) {
        if ((i & 2) != 0) {
            c19eg = (C19EG) scene.requireActivity();
        }
        if ((i & 4) != 0) {
            factory = null;
        }
        return LJI(scene, c19eg, factory);
    }
}
