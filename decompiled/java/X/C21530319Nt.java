package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.19Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21530319Nt implements C19O0 {
    public final ConstraintLayout LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final /* synthetic */ ConstraintLayout LJII;

    @Override // X.C19O0
    public final void LIZ() {
        int childCount = this.LIZ.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LIZ.getChildAt(i2);
            if (childAt instanceof C12MG) {
                C12MG c12mg = (C12MG) childAt;
                if (c12mg.LLILLJJLI != null) {
                    C19ME c19me = (C19ME) c12mg.getLayoutParams();
                    C19ME c19me2 = (C19ME) c12mg.LLILLJJLI.getLayoutParams();
                    c19me2.widget.mVisibility = 0;
                    C19O3 horizontalDimensionBehaviour = c19me.widget.getHorizontalDimensionBehaviour();
                    C19O3 c19o3 = C19O3.FIXED;
                    if (horizontalDimensionBehaviour != c19o3) {
                        c19me.widget.setWidth(c19me2.widget.getWidth());
                    }
                    if (c19me.widget.getVerticalDimensionBehaviour() != c19o3) {
                        c19me.widget.setHeight(c19me2.widget.getHeight());
                    }
                    c19me2.widget.mVisibility = 8;
                }
            }
        }
        int size = this.LIZ.mConstraintHelpers.size();
        if (size > 0) {
            do {
                ((C19MX) ListProtector.get(this.LIZ.mConstraintHelpers, i)).updatePostMeasure(this.LIZ);
                i++;
            } while (i < size);
        }
    }

    public C21530319Nt(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.LJII = constraintLayout;
        this.LIZ = constraintLayout2;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0203  */
    @Override // X.C19O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C19OA r19, X.C21530919Nz r20) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21530319Nt.LIZIZ(X.19OA, X.19Nz):void");
    }

    public static boolean LIZJ(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
        return false;
    }
}
