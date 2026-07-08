package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.12MS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12MS extends ViewPager {
    public C12MS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    @Override // androidx.viewpager.widget.ViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canScroll(android.view.View r7, boolean r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C12MO
            if (r0 == 0) goto L4d
            r4 = r7
            X.12MM r4 = (X.C12MM) r4
            android.graphics.RectF r3 = r4.getBitmapRect()
            android.graphics.RectF r0 = r4.LLJJJIL
            r4.LJIIJJI(r3, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.getGlobalVisibleRect(r0)
            r5 = 1
            if (r3 == 0) goto L45
            float r2 = r3.right
            int r0 = r0.right
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L32
            if (r9 >= 0) goto L32
            float r2 = r2 - r1
            float r1 = java.lang.Math.abs(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L45
        L31:
            return r5
        L32:
            float r1 = r3.left
            android.graphics.RectF r0 = r4.LLJJJIL
            float r0 = r0.left
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            double r3 = (double) r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L45
            return r5
        L45:
            boolean r0 = super.canScroll(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L31
            r5 = 0
            return r5
        L4d:
            boolean r0 = super.canScroll(r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12MS.canScroll(android.view.View, boolean, int, int, int):boolean");
    }
}
