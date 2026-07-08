package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1D39, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D39 {
    public final HashMap<String, C1D38> LIZ = new HashMap<>();

    public final void LIZ(String str, String str2) {
        C1D36 c1d36;
        C1D38 c1d38 = this.LIZ.get(str);
        if (c1d38 != null && !TextUtils.isEmpty(str2) && (c1d36 = c1d38.LIZ.get(str2)) != null) {
            C1D3B c1d3b = c1d36.LIZJ;
            C1D3A c1d3a = c1d3b.LIZJ;
            C1D3A c1d3a2 = c1d3b.LIZLLL;
            c1d3a.LIZJ = c1d3a2;
            c1d3a2.LIZLLL = c1d3a;
            c1d3b.LIZIZ.clear();
        }
    }

    public final C1D36 LIZIZ(String str, String str2) {
        C1D38 c1d38 = this.LIZ.get(str);
        if (c1d38 == null) {
            c1d38 = new C1D38();
            this.LIZ.put(str, c1d38);
        }
        return c1d38.LIZ(str2);
    }
}
