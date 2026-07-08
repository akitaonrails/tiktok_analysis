package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0Qfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676330Qfv {
    public Bitmap LIZ;
    public byte[] LIZIZ;

    public final Bitmap LIZ() {
        Bitmap bitmap = this.LIZ;
        if (bitmap == null || !bitmap.isRecycled()) {
            return this.LIZ;
        }
        this.LIZ = null;
        return null;
    }
}
