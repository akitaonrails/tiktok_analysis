package X;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: X.0tuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683780tuy {
    public static final Shader.TileMode LIZ(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                return Shader.TileMode.DECAL;
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
