package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.0hYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208660hYe extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C1208660hYe c1208660hYe) {
        return -1;
    }

    public static final int LJIILL$1(C1208660hYe c1208660hYe) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return 1 - this.$t != 0 ? super.LJIIIIZZ(i, i2, i3, i4, i5) : LJIIIIZZ$0(this, i, i2, i3, i4, i5);
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        switch (this.$t) {
            case 1:
                return LJIIJJI$0(this, displayMetrics);
            case 2:
                return LJIIJJI$1(this, displayMetrics);
            default:
                return super.LJIIJJI(displayMetrics);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        return 2 - this.$t != 0 ? super.LJIILIIL(i) : LJIILIIL$0(this, i);
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        switch (this.$t) {
            case 0:
                return LJIILL$0(this);
            case 1:
            default:
                return super.LJIILL();
            case 2:
                return LJIILL$1(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208660hYe(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final float LJIIJJI$0(C1208660hYe c1208660hYe, DisplayMetrics displayMetrics) {
        return 200.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$1(C1208660hYe c1208660hYe, DisplayMetrics displayMetrics) {
        return 50.0f / displayMetrics.densityDpi;
    }

    public static final int LJIILIIL$0(C1208660hYe c1208660hYe, int i) {
        return Math.max(super.LJIILIIL(i), 150);
    }

    public static final int LJIIIIZZ$0(C1208660hYe c1208660hYe, int i, int i2, int i3, int i4, int i5) {
        return ((i3 + i4) / 2) - ((i + i2) / 2);
    }
}
