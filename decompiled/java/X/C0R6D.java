package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: renamed from: X.0R6D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R6D extends C21386818mo {
    public final Uri LJ;

    public C0R6D() {
        this(null, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0R6D(Uri uri, int i) {
        int i2;
        uri = (i & 1) != 0 ? null : uri;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        super((Drawable) null, i2, (Drawable) null, 8);
        this.LJ = uri;
    }
}
