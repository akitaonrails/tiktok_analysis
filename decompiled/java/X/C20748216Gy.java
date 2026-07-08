package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStickyLayoutManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* JADX INFO: renamed from: X.16Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748216Gy extends C21674119s3 {
    public final int $t;
    public Object l0;

    public static final PointF LIZ$3(C20748216Gy c20748216Gy, int i) {
        return null;
    }

    @Override // X.AbstractC21674019s2
    public final PointF LIZ(int i) {
        switch (this.$t) {
            case 2:
                return LIZ$0(this, i);
            case 3:
                return LIZ$1(this, i);
            case 4:
                return LIZ$2(this, i);
            case 5:
            default:
                return super.LIZ(i);
            case 6:
                return LIZ$3(this, i);
        }
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        switch (this.$t) {
            case 0:
                LJI$0(this, view, c21673919s1, c21675319sF);
                break;
            case 1:
                LJI$1(this, view, c21673919s1, c21675319sF);
                break;
            case 2:
            case 3:
            case 4:
            default:
                super.LJI(view, c21673919s1, c21675319sF);
                break;
            case 5:
                LJI$2(this, view, c21673919s1, c21675319sF);
                break;
            case 6:
                LJI$3(this, view, c21673919s1, c21675319sF);
                break;
        }
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        switch (this.$t) {
            case 0:
                return LJIIJJI$0(this, displayMetrics);
            case 1:
                return LJIIJJI$1(this, displayMetrics);
            case 2:
            case 3:
            case 4:
            default:
                return super.LJIIJJI(displayMetrics);
            case 5:
                return LJIIJJI$2(this, displayMetrics);
            case 6:
                return LJIIJJI$3(this, displayMetrics);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        switch (this.$t) {
            case 0:
                return LJIILIIL$0(this, i);
            case 1:
            case 5:
            default:
                return super.LJIILIIL(i);
            case 2:
                return LJIILIIL$1(this, i);
            case 3:
                return LJIILIIL$2(this, i);
            case 4:
                return LJIILIIL$3(this, i);
            case 6:
                return LJIILIIL$4(this, i);
        }
    }

    public static final PointF LIZ$0(C20748216Gy c20748216Gy, int i) {
        return ((MixStickyLayoutManager) c20748216Gy.l0).computeScrollVectorForPosition(i);
    }

    public static final PointF LIZ$1(C20748216Gy c20748216Gy, int i) {
        return ((WrapGridLayoutManager) c20748216Gy.l0).computeScrollVectorForPosition(i);
    }

    public static final PointF LIZ$2(C20748216Gy c20748216Gy, int i) {
        return ((com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager) c20748216Gy.l0).computeScrollVectorForPosition(i);
    }

    public static final float LJIIJJI$0(C20748216Gy c20748216Gy, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$1(C20748216Gy c20748216Gy, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$2(C20748216Gy c20748216Gy, DisplayMetrics displayMetrics) {
        return 40.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$3(C20748216Gy c20748216Gy, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final int LJIILIIL$0(C20748216Gy c20748216Gy, int i) {
        return Math.min(100, super.LJIILIIL(i));
    }

    public static final int LJIILIIL$1(C20748216Gy c20748216Gy, int i) {
        return super.LJIILIIL(i) * 3;
    }

    public static final int LJIILIIL$2(C20748216Gy c20748216Gy, int i) {
        return super.LJIILIIL(i) * 3;
    }

    public static final int LJIILIIL$3(C20748216Gy c20748216Gy, int i) {
        return super.LJIILIIL(i) * 3;
    }

    public static final int LJIILIIL$4(C20748216Gy c20748216Gy, int i) {
        return Math.min(100, super.LJIILIIL(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20748216Gy(Object obj, Context context, int i) {
        super(context);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJI$0(C20748216Gy c20748216Gy, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        C20635115or c20635115or = (C20635115or) c20748216Gy.l0;
        int[] iArrLIZJ = c20635115or.LIZJ(c20635115or.LIZ.getLayoutManager(), view);
        int i = iArrLIZJ[0];
        int i2 = iArrLIZJ[1];
        int iLJIIL = c20748216Gy.LJIIL(Math.max(Math.abs(i), Math.abs(i2)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(i, i2, c20748216Gy.LJIIIIZZ, iLJIIL);
        }
    }

    public static final void LJI$1(C20748216Gy c20748216Gy, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        AbstractC20634115oh abstractC20634115oh = (AbstractC20634115oh) c20748216Gy.l0;
        RecyclerView recyclerView = abstractC20634115oh.LIZ;
        if (recyclerView == null) {
            return;
        }
        int[] iArrLIZJ = abstractC20634115oh.LIZJ(recyclerView.getLayoutManager(), view);
        int i = iArrLIZJ[0];
        int i2 = iArrLIZJ[1];
        int iLJIIL = c20748216Gy.LJIIL(Math.max(Math.abs(i), Math.abs(i2)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(i, i2, c20748216Gy.LJIIIIZZ, iLJIIL);
        }
    }

    public static final void LJI$2(C20748216Gy c20748216Gy, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = ((C20635015oq) c20748216Gy.l0).LJIIIZ;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int[] iArrLIZJ = ((C20635015oq) c20748216Gy.l0).LIZJ(layoutManager, view);
            int i = iArrLIZJ[0];
            int i2 = iArrLIZJ[1];
            int iLJIIL = c20748216Gy.LJIIL(Math.max(Math.abs(i), Math.abs(i2)));
            if (iLJIIL > 0) {
                c21675319sF.LIZIZ(i, i2, c20748216Gy.LJIIIIZZ, iLJIIL);
            }
        }
    }

    public static final void LJI$3(C20748216Gy c20748216Gy, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        C20635215os c20635215os = (C20635215os) c20748216Gy.l0;
        int[] iArrLIZIZ = c20635215os.LIZIZ(c20635215os.LIZ.getLayoutManager(), view);
        int i = iArrLIZIZ[0];
        int i2 = iArrLIZIZ[1];
        int iLJIIL = c20748216Gy.LJIIL(Math.max(Math.abs(i), Math.abs(i2)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(i, i2, c20748216Gy.LJIIIIZZ, iLJIIL);
        }
    }
}
