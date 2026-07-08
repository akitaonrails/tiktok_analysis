package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151510g4T extends C21674119s3 {
    public final int $t;
    public Object l0;

    public static final PointF LIZ$0(C1151510g4T c1151510g4T, int i) {
        return null;
    }

    public static final void LJ$0(C1151510g4T c1151510g4T) {
    }

    @Override // X.AbstractC21674019s2
    public final PointF LIZ(int i) {
        return 2 - this.$t != 0 ? super.LIZ(i) : LIZ$0(this, i);
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJ() {
        if (3 - this.$t != 0) {
            super.LJ();
        } else {
            LJ$0(this);
        }
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        if (3 - this.$t != 0) {
            super.LJFF();
        } else {
            LJFF$0(this);
        }
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        switch (this.$t) {
            case 0:
                LJI$0(this, view, c21673919s1, c21675319sF);
                break;
            case 1:
            default:
                super.LJI(view, c21673919s1, c21675319sF);
                break;
            case 2:
                LJI$1(this, view, c21673919s1, c21675319sF);
                break;
        }
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return this.$t != 0 ? super.LJIIIIZZ(i, i2, i3, i4, i5) : LJIIIIZZ$0(this, i, i2, i3, i4, i5);
    }

    @Override // X.C21674119s3
    public final int LJIIJ(int i, View view) {
        switch (this.$t) {
            case 0:
                return LJIIJ$0(this, i, view);
            case 1:
            case 2:
            default:
                return super.LJIIJ(i, view);
            case 3:
                return LJIIJ$1(this, i, view);
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
                return LJIIJJI$2(this, displayMetrics);
            case 3:
                return LJIIJJI$3(this, displayMetrics);
            default:
                return super.LJIIJJI(displayMetrics);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        return 2 - this.$t != 0 ? super.LJIILIIL(i) : LJIILIIL$0(this, i);
    }

    public static final void LJFF$0(C1151510g4T c1151510g4T) {
        super.LJFF();
        ((Function0) c1151510g4T.l0).invoke();
    }

    public static final float LJIIJJI$0(C1151510g4T c1151510g4T, DisplayMetrics displayMetrics) {
        return ((SmoothLinearLayoutManager) c1151510g4T.l0).LL / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$1(C1151510g4T c1151510g4T, DisplayMetrics displayMetrics) {
        return ((SmoothLinearLayoutManager) c1151510g4T.l0).LL / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$2(C1151510g4T c1151510g4T, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final float LJIIJJI$3(C1151510g4T c1151510g4T, DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public static final int LJIILIIL$0(C1151510g4T c1151510g4T, int i) {
        return Math.min(100, super.LJIILIIL(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151510g4T(Context context, Object obj, int i) {
        super(context);
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJIIJ$0(C1151510g4T c1151510g4T, int i, View view) {
        ((SmoothLinearLayoutManager) c1151510g4T.l0).getClass();
        return super.LJIIJ(i, view);
    }

    public static final int LJIIJ$1(C1151510g4T c1151510g4T, int i, View view) {
        int iLJIIJ = super.LJIIJ(i, view);
        if (Math.abs(iLJIIJ) < 20) {
            return 0;
        }
        return iLJIIJ;
    }

    public static final void LJI$0(C1151510g4T c1151510g4T, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        int iLJIIIZ = c1151510g4T.LJIIIZ(c1151510g4T.LJIILJJIL(), view);
        int iLJIIJ = c1151510g4T.LJIIJ(c1151510g4T.LJIILL(), view);
        int iLJIILIIL = c1151510g4T.LJIILIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
        if (iLJIILIIL > 0) {
            c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, c1151510g4T.LJII, iLJIILIIL);
        }
    }

    public static final void LJI$1(C1151510g4T c1151510g4T, View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        C21683819tc c21683819tc = (C21683819tc) c1151510g4T.l0;
        int[] iArrLIZJ = c21683819tc.LIZJ(c21683819tc.LIZ.getLayoutManager(), view);
        int i = iArrLIZJ[0];
        int i2 = iArrLIZJ[1];
        int iLJIIL = c1151510g4T.LJIIL(Math.max(Math.abs(i), Math.abs(i2)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(i, i2, c1151510g4T.LJIIIIZZ, iLJIIL);
        }
    }

    public static final int LJIIIIZZ$0(C1151510g4T c1151510g4T, int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
