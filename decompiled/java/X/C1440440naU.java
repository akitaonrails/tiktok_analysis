package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.0naU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440440naU extends C21674119s3 {
    public float LJIILL;

    public C1440440naU(Context context) {
        super(context);
        this.LJIILL = 1.0f;
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return (25.0f / displayMetrics.densityDpi) / this.LJIILL;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
