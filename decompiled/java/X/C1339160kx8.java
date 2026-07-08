package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0kx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339160kx8 extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C1339160kx8 c1339160kx8) {
        return -1;
    }

    public static final int LJIILL$1(C1339160kx8 c1339160kx8) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIZ(int i, View view) {
        return 1 - this.$t != 0 ? super.LJIIIZ(i, view) : LJIIIZ$0(this, i, view);
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        switch (this.$t) {
            case 0:
                return LJIIJJI$0(this, displayMetrics);
            case 1:
                return LJIIJJI$1(this, displayMetrics);
            case 2:
                return LJIIJJI$2(this, displayMetrics);
            default:
                return super.LJIIJJI(displayMetrics);
        }
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
    public C1339160kx8(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final float LJIIJJI$0(C1339160kx8 c1339160kx8, DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 40.0f / displayMetrics.densityDpi;
        }
        throw new NullPointerException("densityDpi");
    }

    public static final float LJIIJJI$1(C1339160kx8 c1339160kx8, DisplayMetrics displayMetrics) {
        return (25.0f / displayMetrics.densityDpi) * 2;
    }

    public static final float LJIIJJI$2(C1339160kx8 c1339160kx8, DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 40.0f / displayMetrics.densityDpi;
        }
        throw new NullPointerException("densityDpi");
    }

    public static final int LJIIIZ$0(C1339160kx8 c1339160kx8, int i, View view) {
        RecyclerView.LayoutManager layoutManager = c1339160kx8.LIZJ;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - marginLayoutParams.leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + marginLayoutParams.rightMargin;
            int paddingLeft = layoutManager.getPaddingLeft();
            return ((paddingLeft + (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - paddingLeft) / 2)) - ((decoratedRight - decoratedLeft) / 2)) - decoratedLeft;
        }
        return 0;
    }
}
