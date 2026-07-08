package X;

import android.app.Notification;

/* JADX INFO: renamed from: X.0Uwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788790Uwv {
    public final int LIZ;
    public final int LIZIZ;
    public final Notification LIZJ;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.LIZ + ", mForegroundServiceType=" + this.LIZIZ + ", mNotification=" + this.LIZJ + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C788790Uwv.class != obj.getClass()) {
            return false;
        }
        C788790Uwv c788790Uwv = (C788790Uwv) obj;
        if (this.LIZ != c788790Uwv.LIZ || this.LIZIZ != c788790Uwv.LIZIZ) {
            return false;
        }
        return this.LIZJ.equals(c788790Uwv.LIZJ);
    }

    public C788790Uwv(int i, int i2, Notification notification) {
        this.LIZ = i;
        this.LIZJ = notification;
        this.LIZIZ = i2;
    }
}
