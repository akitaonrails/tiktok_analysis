package X;

import android.view.View;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0Kzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535690Kzf {
    public static final AbstractC214814194y LIZ(View view) {
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            return C372650EjH.LIZ(sceneLIZ);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final AbstractC214814194y LIZIZ(View view) {
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(sceneLIZ);
            if (abstractC214814194yLIZ != null) {
                return abstractC214814194yLIZ;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Scene not found");
    }
}
