package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.14zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20444214zA {
    public final Bundle LIZIZ;
    public final Bundle LIZJ;
    public final C13XF LJ;
    public final String LJFF;
    public final String LIZ = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL";
    public final boolean LIZLLL = false;

    public AbstractC20444214zA(Bundle bundle, Bundle bundle2, boolean z, C13XF c13xf, String str, boolean z2) {
        this.LIZIZ = bundle;
        this.LIZJ = bundle2;
        this.LJ = c13xf;
        this.LJFF = str;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
    }
}
