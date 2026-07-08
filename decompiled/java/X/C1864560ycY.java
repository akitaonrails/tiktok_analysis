package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: X.0ycY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864560ycY extends C21674119s3 {
    public final int $t;

    public static final int LJIILJJIL$0(C1864560ycY c1864560ycY) {
        return 1;
    }

    public static final int LJIILJJIL$1(C1864560ycY c1864560ycY) {
        return -1;
    }

    public static final int LJIILL$0(C1864560ycY c1864560ycY) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIZ(int i, View view) {
        switch (this.$t) {
            case 0:
                return LJIIIZ$0(this, i, view);
            case 1:
                return LJIIIZ$1(this, i, view);
            default:
                return super.LJIIIZ(i, view);
        }
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        switch (this.$t) {
            case 0:
                return LJIIJJI$0(this, displayMetrics);
            case 1:
                return LJIIJJI$1(this, displayMetrics);
            default:
                return super.LJIIJJI(displayMetrics);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILJJIL() {
        switch (this.$t) {
            case 0:
                return LJIILJJIL$0(this);
            case 1:
                return LJIILJJIL$1(this);
            default:
                return super.LJIILJJIL();
        }
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        return 2 - this.$t != 0 ? super.LJIILL() : LJIILL$0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864560ycY(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final float LJIIJJI$0(C1864560ycY c1864560ycY, DisplayMetrics displayMetrics) {
        float f;
        if (displayMetrics != null) {
            f = displayMetrics.densityDpi;
        } else {
            f = 1.0f;
        }
        return 100.0f / f;
    }

    public static final float LJIIJJI$1(C1864560ycY c1864560ycY, DisplayMetrics displayMetrics) {
        float f;
        if (displayMetrics != null) {
            f = displayMetrics.densityDpi;
        } else {
            f = 1.0f;
        }
        return 100.0f / f;
    }

    public static final int LJIIIZ$0(C1864560ycY c1864560ycY, int i, View view) {
        return super.LJIIIZ(i, view) - C341940Daq.LIZ(3.0d);
    }

    public static final int LJIIIZ$1(C1864560ycY c1864560ycY, int i, View view) {
        return super.LJIIIZ(i, view) + C341940Daq.LIZ(3.0d);
    }
}
