package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1729606py extends ConstraintLayout {
    public abstract void i0(boolean z, boolean z2);

    public abstract void setChildViewAlpha(float f);

    public final TuxTextView e0() {
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        C19ME c19me = new C19ME(-2, -2);
        tuxTextView.setGravity(8388613);
        c19me.topToTop = 0;
        c19me.endToEnd = 0;
        C786410Ut5.R6(tuxTextView, c19me);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.gp);
        tuxTextView.setTuxFont(92);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        return tuxTextView;
    }

    public AbstractC1729606py(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(android.view.View r7, boolean r8, boolean r9, float r10, float r11, float r12) {
        /*
            r6 = this;
            if (r9 == 0) goto L68
            android.content.Context r1 = r6.getContext()
            r0 = 2131100631(0x7f0603d7, float:1.7813649E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L7a
            int r4 = r0.intValue()
        L13:
            if (r8 == 0) goto L5a
            r0 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
        L23:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
            java.lang.Object r0 = r5.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Object r0 = r5.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r3.setStroke(r2, r4, r1, r0)
            r3.setCornerRadius(r10)
            r7.setBackground(r3)
            if (r8 == 0) goto L7c
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setChildViewAlpha(r0)
            return
        L5a:
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
            goto L23
        L68:
            android.content.Context r1 = r6.getContext()
            r0 = 2131100568(0x7f060398, float:1.7813521E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L7a
            int r4 = r0.intValue()
            goto L13
        L7a:
            r4 = 0
            goto L13
        L7c:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r6.setChildViewAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1729606py.h0(android.view.View, boolean, boolean, float, float, float):void");
    }
}
