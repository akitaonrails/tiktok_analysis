package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902420zbc {
    public final TuxTextView LIZ;
    public final TuxTextView LIZIZ;
    public final TuxIconView LIZJ;
    public final C417460GYm LIZLLL;
    public final C417460GYm LJ;
    public final TuxIconView LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final HorizontalScrollView LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final int LIZJ() {
        View view;
        View view2 = this.LJIIIIZZ;
        if (view2 == null || (view = this.LJIIIZ) == null) {
            return 0;
        }
        C417460GYm c417460GYm = this.LIZLLL;
        Integer numValueOf = c417460GYm != null ? Integer.valueOf(c417460GYm.getVisibility()) : null;
        C417460GYm c417460GYm2 = this.LJ;
        Integer numValueOf2 = c417460GYm2 != null ? Integer.valueOf(c417460GYm2.getVisibility()) : null;
        C417460GYm c417460GYm3 = this.LIZLLL;
        if (c417460GYm3 != null) {
            C786410Ut5.g0(c417460GYm3, 8);
        }
        C417460GYm c417460GYm4 = this.LJ;
        if (c417460GYm4 != null) {
            C786410Ut5.g0(c417460GYm4, 8);
        }
        int i = this.LJIIL ? 42 : 32;
        TuxTextView tuxTextView = this.LIZ;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
        TuxTextView tuxTextView2 = this.LIZIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.W5(view2, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = -2;
        C786410Ut5.W5(view, layoutParams2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 1073741824);
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMax = Math.max(view2.getMeasuredWidth(), view.getMeasuredWidth());
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        layoutParams3.width = iMax;
        C786410Ut5.W5(view2, layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        layoutParams4.width = iMax;
        C786410Ut5.W5(view, layoutParams4);
        C417460GYm c417460GYm5 = this.LIZLLL;
        if (c417460GYm5 != null) {
            C786410Ut5.g0(c417460GYm5, numValueOf != null ? numValueOf.intValue() : 8);
        }
        C417460GYm c417460GYm6 = this.LJ;
        if (c417460GYm6 != null) {
            C786410Ut5.g0(c417460GYm6, numValueOf2 != null ? numValueOf2.intValue() : 8);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("equalizeTabWidths: actW=");
        sbLIZ.append(view2.getMeasuredWidth());
        sbLIZ.append(", folW=");
        sbLIZ.append(view.getMeasuredWidth());
        sbLIZ.append(", maxW=");
        sbLIZ.append(iMax);
        C1720106oR.LJI("MergedTabBarHelper", C2188811AlT.LIZIZ(sbLIZ));
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(int r9) {
        /*
            r8 = this;
            X.0GYm r1 = r8.LJ
            r5 = 0
            if (r1 == 0) goto L88
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L88
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r1.measure(r0, r0)
            int r7 = r1.getMeasuredWidth()
            if (r7 <= 0) goto L88
            X.0GYm r0 = r8.LJ
            r1 = 0
            if (r0 == 0) goto L86
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L21:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L84
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L84
            int r4 = r2.getMarginStart()
        L2d:
            com.bytedance.tux.input.TuxTextView r2 = r8.LIZIZ
            r6 = 8
            if (r2 == 0) goto L82
            int r0 = r2.getVisibility()
            if (r0 == r6) goto L82
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r2.measure(r0, r0)
            int r3 = r2.getMeasuredWidth()
        L44:
            com.bytedance.tux.icon.TuxIconView r2 = r8.LJFF
            if (r2 == 0) goto L80
            int r0 = r2.getVisibility()
            if (r0 == r6) goto L80
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r2.measure(r0, r0)
            int r2 = r2.getMeasuredWidth()
            if (r2 <= 0) goto L80
            com.bytedance.tux.icon.TuxIconView r0 = r8.LJFF
            if (r0 == 0) goto L63
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L63:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L7e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L7e
            int r0 = r1.getMarginStart()
        L6f:
            int r2 = r2 + r0
        L70:
            int r9 = r9 - r3
            int r9 = r9 + r2
            int r0 = r9 / 2
            if (r0 >= 0) goto L77
            r0 = 0
        L77:
            int r4 = r4 + r7
            int r4 = r4 - r0
            int r0 = java.lang.Math.max(r5, r4)
            return r0
        L7e:
            r0 = 0
            goto L6f
        L80:
            r2 = 0
            goto L70
        L82:
            r3 = 0
            goto L44
        L84:
            r4 = 0
            goto L2d
        L86:
            r2 = r1
            goto L21
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902420zbc.LIZIZ(int):int");
    }

    public static final Pair<Integer, Boolean> LIZ(C1902420zbc c1902420zbc, int i, HorizontalScrollView horizontalScrollView, int i2, boolean z) {
        c1902420zbc.LJIIL = z;
        int iLIZJ = c1902420zbc.LIZJ();
        int i3 = (iLIZJ * 2) + i2;
        int iLIZIZ = c1902420zbc.LIZIZ(iLIZJ);
        boolean z2 = true;
        int i4 = 0;
        if (iLIZIZ <= 0 || (i * 2) + i3 + (iLIZIZ * 2) <= horizontalScrollView.getWidth()) {
            iLIZIZ = 0;
        }
        if (((i + iLIZIZ) * 2) + i3 <= horizontalScrollView.getWidth()) {
            i4 = iLIZIZ;
        } else {
            z2 = false;
        }
        int i5 = i + i4;
        HorizontalScrollView horizontalScrollView2 = c1902420zbc.LJIIJ;
        if (horizontalScrollView2 != null) {
            horizontalScrollView2.setPaddingRelative(i5, horizontalScrollView2.getPaddingTop(), i5, horizontalScrollView2.getPaddingBottom());
        }
        return new Pair<>(Integer.valueOf(i3), Boolean.valueOf(z2));
    }

    public C1902420zbc(TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxIconView tuxIconView, C417460GYm c417460GYm, C417460GYm c417460GYm2, TuxIconView tuxIconView2, View view, View view2, View view3, View view4, HorizontalScrollView horizontalScrollView) {
        this.LIZ = tuxTextView;
        this.LIZIZ = tuxTextView2;
        this.LIZJ = tuxIconView;
        this.LIZLLL = c417460GYm;
        this.LJ = c417460GYm2;
        this.LJFF = tuxIconView2;
        this.LJI = view;
        this.LJII = view2;
        this.LJIIIIZZ = view3;
        this.LJIIIZ = view4;
        this.LJIIJ = horizontalScrollView;
    }
}
