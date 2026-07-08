package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.1Amb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189511Amb extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C2189511Amb c2189511Amb) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        switch (this.$t) {
            case 1:
                return LJIIIIZZ$0(this, i, i2, i3, i4, i5);
            case 2:
                return LJIIIIZZ$1(this, i, i2, i3, i4, i5);
            case 3:
                return LJIIIIZZ$2(this, i, i2, i3, i4, i5);
            default:
                return super.LJIIIIZZ(i, i2, i3, i4, i5);
        }
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        switch (this.$t) {
            case 1:
                return LJIIJJI$0(this, displayMetrics);
            case 2:
                return LJIIJJI$1(this, displayMetrics);
            case 3:
                return LJIIJJI$2(this, displayMetrics);
            default:
                return super.LJIIJJI(displayMetrics);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        return this.$t != 0 ? super.LJIILL() : LJIILL$0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189511Amb(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final float LJIIJJI$0(C2189511Amb c2189511Amb, DisplayMetrics displayMetrics) {
        return 150.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$1(C2189511Amb c2189511Amb, DisplayMetrics displayMetrics) {
        return 150.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$2(C2189511Amb c2189511Amb, DisplayMetrics displayMetrics) {
        return 150.0f / displayMetrics.densityDpi;
    }

    public static final int LJIIIIZZ$0(C2189511Amb c2189511Amb, int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }

    public static final int LJIIIIZZ$1(C2189511Amb c2189511Amb, int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }

    public static final int LJIIIIZZ$2(C2189511Amb c2189511Amb, int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
