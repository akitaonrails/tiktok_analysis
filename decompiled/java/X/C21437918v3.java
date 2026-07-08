package X;

import android.graphics.Bitmap;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21437918v3 {
    public final Bitmap LIZ;
    public final int LIZIZ = R.raw.icon_quotation;

    public final int hashCode() {
        return this.LIZIZ;
    }

    public C21437918v3(Bitmap bitmap) {
        this.LIZ = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C21437918v3) && this.LIZIZ == ((C21437918v3) obj).LIZIZ) {
            return true;
        }
        return false;
    }
}
