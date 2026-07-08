package X;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1ASm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179741ASm {
    public final C2179751ASn LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C2179741ASm(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.LIZ = new C2179761ASo(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2179741ASm)) {
            return false;
        }
        return this.LIZ.equals(((C2179741ASm) obj).LIZ);
    }

    public C2179741ASm(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.LIZ = new C2179761ASo(str, i, i2);
                    return;
                } else {
                    this.LIZ = new C2179751ASn(str, i, i2);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
