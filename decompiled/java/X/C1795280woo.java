package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0woo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795280woo {
    public Uri LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final C1795310wor LIZ() {
        int i = this.LIZJ;
        if (i == 0) {
            throw new IllegalArgumentException("Link type is required.");
        }
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            throw new IllegalArgumentException("Launch mode is required.");
        }
        if (i2 != 1 && i == 2) {
            throw new IllegalArgumentException("App downloads must launch in an external browser or app.");
        }
        if (this.LIZLLL == 0) {
            throw new IllegalArgumentException("Billing program is required.");
        }
        Uri uri = this.LIZ;
        if (uri == null) {
            throw new IllegalArgumentException("URI must be set.");
        }
        if (uri.getScheme() != null) {
            return new C1795310wor(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
        throw new IllegalArgumentException("URI must have a scheme.");
    }
}
