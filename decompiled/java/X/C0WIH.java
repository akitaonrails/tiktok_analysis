package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0WIH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WIH {
    public final String LIZ;
    public final Bundle LIZIZ;

    public C0WIH(String str, Bundle bundle) {
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = bundle;
            return;
        }
        throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }
}
