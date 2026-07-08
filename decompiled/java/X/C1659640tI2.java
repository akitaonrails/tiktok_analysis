package X;

import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0tI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659640tI2 {
    public static C1659660tI4 LIZJ(View view) {
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            return LIZ(view, (C19EG) sceneLIZ.requireActivity());
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static C1659660tI4 LIZLLL(Scene scene) {
        return LIZIZ((C19EG) scene.requireActivity(), scene);
    }

    public static final C1659660tI4 LIZ(View view, C19EG c19eg) {
        if (C1659630tI1.LIZJ(c19eg, C0EBE.LIZ(view))) {
            return C1659650tI3.LIZ(c19eg);
        }
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            return LIZIZ(c19eg, sceneLIZ);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final C1659660tI4 LIZIZ(C19EG c19eg, Scene scene) {
        ViewModelStoreOwner viewModelStoreOwnerLIZIZ = C1659630tI1.LIZIZ(c19eg, scene);
        if (viewModelStoreOwnerLIZIZ instanceof C19EG) {
            return C1659650tI3.LIZ((C19EG) viewModelStoreOwnerLIZIZ);
        }
        return new C1659660tI4(viewModelStoreOwnerLIZIZ.getViewModelStore(), new C1143250fr9());
    }
}
