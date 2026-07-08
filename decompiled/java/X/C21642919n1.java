package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* JADX INFO: renamed from: X.19n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21642919n1 {
    public final Context LIZ;

    public final boolean LIZ() {
        FingerprintManager fingerprintManagerLIZJ = C21642619my.LIZJ(this.LIZ);
        return fingerprintManagerLIZJ != null && C21642619my.LIZLLL(fingerprintManagerLIZJ);
    }

    public final boolean LIZIZ() {
        FingerprintManager fingerprintManagerLIZJ = C21642619my.LIZJ(this.LIZ);
        return fingerprintManagerLIZJ != null && C21642619my.LJ(fingerprintManagerLIZJ);
    }

    public C21642919n1(Context context) {
        this.LIZ = context;
    }
}
