package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0GcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C419200GcA extends LinearLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.LLILLJJLI != z) {
            if (!z || this.LL) {
                this.LLILLJJLI = z;
                setOrientation(z ? 1 : 0);
                if (z) {
                    i = 8388613;
                } else {
                    i = 80;
                }
                setGravity(i);
                View viewFindViewById = findViewById(R.id.vrz);
                if (viewFindViewById != null) {
                    if (z) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.LL != z) {
            this.LL = z;
            if (!z && this.LLILLJJLI) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public C419200GcA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = -1;
        int[] iArr = R$styleable.ButtonBarLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        q0.LJIIZILJ(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.LL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.LL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2 A[EDGE_INSN: B:48:0x00a2->B:36:0x00a2 BREAK  A[LOOP:0: B:24:0x004b->B:44:0x00ba], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.LL
            r3 = 0
            if (r0 == 0) goto L16
            int r0 = r5.LLILLL
            if (r2 <= r0) goto L14
            boolean r0 = r5.LLILLJJLI
            if (r0 == 0) goto L14
            r5.setStacked(r3)
        L14:
            r5.LLILLL = r2
        L16:
            boolean r0 = r5.LLILLJJLI
            r4 = 1
            if (r0 != 0) goto Lc0
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto Lc0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L2a:
            super.onMeasure(r0, r7)
            boolean r0 = r5.LL
            if (r0 == 0) goto Lbd
            boolean r0 = r5.LLILLJJLI
            if (r0 != 0) goto Lbd
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto Lbd
            r5.setStacked(r4)
        L43:
            super.onMeasure(r6, r7)
        L46:
            int r1 = r5.getChildCount()
            r2 = 0
        L4b:
            if (r2 >= r1) goto La2
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lba
            if (r2 < 0) goto La2
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r3 = r5.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            int r0 = r1.topMargin
            int r3 = r3 + r0
            int r0 = r1.bottomMargin
            int r3 = r3 + r0
            boolean r0 = r5.LLILLJJLI
            if (r0 == 0) goto Lb4
            int r2 = r2 + 1
            int r1 = r5.getChildCount()
        L7c:
            if (r2 >= r1) goto La2
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb1
            if (r2 < 0) goto La2
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 + r0
            int r3 = r3 + r2
        La2:
            int r0 = r5.getMinimumHeight()
            if (r0 == r3) goto Lb0
            r5.setMinimumHeight(r3)
            if (r7 != 0) goto Lb0
            super.onMeasure(r6, r7)
        Lb0:
            return
        Lb1:
            int r2 = r2 + 1
            goto L7c
        Lb4:
            int r0 = r5.getPaddingBottom()
            int r3 = r3 + r0
            goto La2
        Lba:
            int r2 = r2 + 1
            goto L4b
        Lbd:
            if (r2 == 0) goto L46
            goto L43
        Lc0:
            r0 = r6
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C419200GcA.onMeasure(int, int):void");
    }
}
