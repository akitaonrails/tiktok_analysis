package X;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0xtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1836520xtK {
    public CharSequence LIZ;
    public CharSequence LIZIZ;
    public boolean LIZJ = true;
    public int LIZLLL;

    public final C1836540xtM LIZ() {
        if (TextUtils.isEmpty(this.LIZ)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!C1836530xtL.LIZJ(this.LIZLLL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Authenticator combination is unsupported on API ");
            sbLIZ.append(Build.VERSION.SDK_INT);
            sbLIZ.append(": ");
            int i = this.LIZLLL;
            sbLIZ.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i2 = this.LIZLLL;
        boolean zLIZIZ = i2 != 0 ? C1836530xtL.LIZIZ(i2) : false;
        if (TextUtils.isEmpty(this.LIZIZ) && !zLIZIZ) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty(this.LIZIZ) || !zLIZIZ) {
            return new C1836540xtM(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }
}
