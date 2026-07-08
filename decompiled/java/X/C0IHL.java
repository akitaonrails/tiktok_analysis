package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IHL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHL {
    public final HashMap<String, String> LIZ;

    public C0IHL() {
        this.LIZ = new HashMap<>();
    }

    public C0IHL(int i) {
        this.LIZ = new HashMap<>(64);
    }

    public final void LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.LIZ.put(str, str2);
        }
    }
}
