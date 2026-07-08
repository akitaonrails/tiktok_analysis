package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KXU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXU extends ConstraintLayout implements C0KXV {
    public static final int[] LLILZ = {R.attr.background, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.paddingStart, R.attr.paddingEnd};
    public boolean LL;
    public final int LLILLJJLI;
    public Integer LLILLL;

    public final int getConsumedBottomInset() {
        int paddingBottom = getPaddingBottom() - this.LLILLJJLI;
        if (paddingBottom < 0) {
            return 0;
        }
        return paddingBottom;
    }

    public final void e0(int i) {
        View viewFindViewById;
        int paddingBottom;
        if (!this.LL || (viewFindViewById = findViewById(com.zhiliaoapp.musically.R.id.d7i)) == null) {
            return;
        }
        Integer num = this.LLILLL;
        if (num != null) {
            paddingBottom = num.intValue();
        } else {
            paddingBottom = viewFindViewById.getPaddingBottom();
            this.LLILLL = Integer.valueOf(paddingBottom);
        }
        int paddingBottom2 = getPaddingBottom() - this.LLILLJJLI;
        int i2 = 0;
        if (paddingBottom2 < 0) {
            paddingBottom2 = 0;
        }
        int i3 = i - paddingBottom2;
        if (i3 >= 0) {
            i2 = i3;
        }
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), paddingBottom + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
    
        if (r2 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(android.content.res.TypedArray r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KXU.h0(android.content.res.TypedArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(android.content.res.TypedArray r11) {
        /*
            r10 = this;
            r0 = 1
            int r9 = r10.l0(r11, r0)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r8) goto L9c
            r7 = r9
            if (r9 == r8) goto La0
            r6 = r9
            if (r9 == r8) goto La4
            r5 = r9
            if (r9 == r8) goto La8
            r4 = r9
            if (r9 == r8) goto Lac
            r3 = r9
            if (r9 == r8) goto Lb0
        L18:
            r0 = 2
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L9a
            r0 = 1
        L28:
            if (r0 == 0) goto L2e
            int r7 = r1.intValue()
        L2e:
            r0 = 3
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L41
            int r6 = r1.intValue()
        L41:
            r0 = 4
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L54
            int r5 = r1.intValue()
        L54:
            r0 = 5
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L67
            int r4 = r1.intValue()
        L67:
            r0 = 6
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L98
            int r3 = r1.intValue()
            r2 = 1
        L7b:
            r0 = 7
            int r0 = r10.l0(r11, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r8) goto L92
            int r9 = r1.intValue()
        L8e:
            r10.setPaddingRelative(r3, r6, r9, r4)
            return
        L92:
            if (r2 != 0) goto L8e
            r10.setPadding(r7, r6, r5, r4)
            return
        L98:
            r2 = 0
            goto L7b
        L9a:
            r0 = 0
            goto L28
        L9c:
            int r7 = r10.getPaddingLeft()
        La0:
            int r6 = r10.getPaddingTop()
        La4:
            int r5 = r10.getPaddingRight()
        La8:
            int r4 = r10.getPaddingBottom()
        Lac:
            int r3 = r10.getPaddingStart()
        Lb0:
            int r9 = r10.getPaddingEnd()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KXU.i0(android.content.res.TypedArray):void");
    }

    public final void setEnableFullPageBottomInsetFallback(boolean z) {
        int paddingBottom;
        this.LL = z;
        if (!z) {
            View viewFindViewById = findViewById(com.zhiliaoapp.musically.R.id.d7i);
            if (viewFindViewById != null) {
                Integer num = this.LLILLL;
                if (num != null) {
                    paddingBottom = num.intValue();
                } else {
                    paddingBottom = viewFindViewById.getPaddingBottom();
                }
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), paddingBottom);
                return;
            }
            return;
        }
        C20097313kJ.LIZJ(this);
    }

    public C0KXU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean j0(Context context, TypedValue typedValue) {
        boolean z = false;
        if (typedValue.type != 2) {
            return false;
        }
        int i = typedValue.data;
        if (i != 0) {
            TypedValue typedValue2 = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue2, true) && typedValue2.type != 2) {
                z = true;
            }
        }
        return !z;
    }

    public final int l0(TypedArray typedArray, int i) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        int dimensionPixelSize = Integer.MIN_VALUE;
        if (typedValuePeekValue == null) {
            return Integer.MIN_VALUE;
        }
        if (typedValuePeekValue.type != 0 && !j0(getContext(), typedValuePeekValue)) {
            try {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i, Integer.MIN_VALUE);
                return dimensionPixelSize;
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return dimensionPixelSize;
    }

    public C0KXU(Context context, AttributeSet attributeSet, int i) {
        super(C0HE8.LIZ(context), attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, LLILZ, i, 0);
            try {
                h0(typedArrayObtainStyledAttributes);
                i0(typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.LLILLJJLI = getPaddingBottom();
        C14K9.LJIJJ(this, new C522010Kdb(this, 3));
    }
}
