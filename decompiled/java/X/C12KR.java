package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.LruCache;

/* JADX INFO: renamed from: X.12KR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KR {
    public final C12KS LIZ = new LruCache<String, LinearGradient>() { // from class: X.12KS
        @Override // android.util.LruCache
        public final LinearGradient create(String str) {
            return null;
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, LinearGradient linearGradient, LinearGradient linearGradient2) {
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, LinearGradient linearGradient) {
            return 1;
        }
    };

    public final LinearGradient LIZ(int i, int i2, int i3, int i4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('-');
        sbLIZ.append(i2);
        sbLIZ.append('-');
        sbLIZ.append(0);
        sbLIZ.append('-');
        sbLIZ.append(0);
        sbLIZ.append('-');
        sbLIZ.append(i3);
        sbLIZ.append('-');
        sbLIZ.append(i4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LinearGradient linearGradient = get(strLIZIZ);
        if (linearGradient == null) {
            float f = 0;
            linearGradient = new LinearGradient(f, f, i3, i4, i, i2, Shader.TileMode.REPEAT);
        }
        put(strLIZIZ, linearGradient);
        return linearGradient;
    }
}
