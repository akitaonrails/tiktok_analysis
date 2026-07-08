package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1D38, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D38 {
    public final HashMap<String, C1D36> LIZ = new HashMap<>();
    public C1D37 LIZIZ;

    public final C1D36 LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1D36 c1d36 = this.LIZ.get(str);
        if (c1d36 == null) {
            C1D36 c1d362 = new C1D36(str);
            this.LIZ.put(str, c1d362);
            return c1d362;
        }
        return c1d36;
    }
}
