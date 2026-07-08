package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0VIE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIE {
    public final Uri LIZ;
    public final boolean LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VIE.class != obj.getClass()) {
            return false;
        }
        C0VIE c0vie = (C0VIE) obj;
        if (this.LIZIZ == c0vie.LIZIZ && this.LIZ.equals(c0vie.LIZ)) {
            return true;
        }
        return false;
    }

    public C0VIE(boolean z, Uri uri) {
        this.LIZ = uri;
        this.LIZIZ = z;
    }
}
