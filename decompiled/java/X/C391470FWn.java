package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0FWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391470FWn extends C21674119s3 {
    public final int $t;

    @Override // X.AbstractC21674019s2
    public final PointF LIZ(int i) {
        return this.$t != 0 ? super.LIZ(i) : LIZ$0(this, i);
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        switch (this.$t) {
            case 0:
                return LJIIIIZZ$0(this, i, i2, i3, i4, i5);
            case 1:
                return LJIIIIZZ$1(this, i, i2, i3, i4, i5);
            case 2:
                return LJIIIIZZ$2(this, i, i2, i3, i4, i5);
            default:
                return super.LJIIIIZZ(i, i2, i3, i4, i5);
        }
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return this.$t != 0 ? super.LJIIJJI(displayMetrics) : LJIIJJI$0(this, displayMetrics);
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        switch (this.$t) {
            case 1:
                return LJIILIIL$0(this, i);
            case 2:
                return LJIILIIL$1(this, i);
            default:
                return super.LJIILIIL(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391470FWn(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final PointF LIZ$0(C391470FWn c391470FWn, int i) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = c391470FWn.LIZJ;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return null;
        }
        return linearLayoutManager.computeScrollVectorForPosition(i);
    }

    public static final float LJIIJJI$0(C391470FWn c391470FWn, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final int LJIILIIL$0(C391470FWn c391470FWn, int i) {
        int iLJIILIIL = super.LJIILIIL(i);
        if (100 <= iLJIILIIL) {
            return 100;
        }
        return iLJIILIIL;
    }

    public static final int LJIILIIL$1(C391470FWn c391470FWn, int i) {
        int iLJIILIIL = super.LJIILIIL(i);
        if (100 <= iLJIILIIL) {
            return 100;
        }
        return iLJIILIIL;
    }

    public static final int LJIIIIZZ$0(C391470FWn c391470FWn, int i, int i2, int i3, int i4, int i5) {
        return ((i3 + ((i4 - i3) / 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - (i + ((i2 - i) / 2));
    }

    public static final int LJIIIIZZ$1(C391470FWn c391470FWn, int i, int i2, int i3, int i4, int i5) {
        return ((i3 + i4) / 2) - ((i + i2) / 2);
    }

    public static final int LJIIIIZZ$2(C391470FWn c391470FWn, int i, int i2, int i3, int i4, int i5) {
        return ((i3 + i4) / 2) - ((i + i2) / 2);
    }
}
