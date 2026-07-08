package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.starlight.nodes.StarlightNode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.14O7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14O7 extends ViewGroup {
    public C14O8 LL;

    private final View[] getChildren() {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it2 = new C09RD(this).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C14OQ();
    }

    public C14O7(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C14OQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getClipChildren();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C14OQ(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        C14O8 c14o8 = this.LL;
        if (c14o8 != null && c14o8.LIZ.LJ == null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            C20256914Nz.LIZIZ(c14o8, true);
            StarlightNode starlightNode = c14o8.LIZ;
            starlightNode.nativeSetHeightAuto(starlightNode.LIZ);
            StarlightNode starlightNode2 = c14o8.LIZ;
            starlightNode2.nativeSetWidthAuto(starlightNode2.LIZ);
            StarlightNode starlightNode3 = c14o8.LIZ;
            starlightNode3.nativeSetMaxWidth(starlightNode3.LIZ, Float.MAX_VALUE);
            StarlightNode starlightNode4 = c14o8.LIZ;
            starlightNode4.nativeSetMaxHeight(starlightNode4.LIZ, Float.MAX_VALUE);
            if (mode2 == 1073741824) {
                StarlightNode starlightNode5 = c14o8.LIZ;
                starlightNode5.nativeSetHeight(starlightNode5.LIZ, size2);
            }
            if (mode == 1073741824) {
                StarlightNode starlightNode6 = c14o8.LIZ;
                starlightNode6.nativeSetWidth(starlightNode6.LIZ, size);
            }
            if (mode2 == Integer.MIN_VALUE) {
                StarlightNode starlightNode7 = c14o8.LIZ;
                starlightNode7.nativeSetMaxHeight(starlightNode7.LIZ, size2);
            }
            if (mode == Integer.MIN_VALUE) {
                StarlightNode starlightNode8 = c14o8.LIZ;
                starlightNode8.nativeSetMaxWidth(starlightNode8.LIZ, size);
            }
            StarlightNode starlightNode9 = c14o8.LIZ;
            starlightNode9.nativeCalculateLayout(starlightNode9.LIZ, Float.MAX_VALUE, Float.MAX_VALUE);
            starlightNode9.LIZJ(starlightNode9.LIZJ);
            float[] fArr = c14o8.LIZ.LIZJ;
            float f2 = 0.0f;
            if (fArr != null) {
                f = fArr[0];
            } else {
                f = 0.0f;
            }
            int iRound = Math.round(f);
            float[] fArr2 = c14o8.LIZ.LIZJ;
            if (fArr2 != null) {
                f2 = fArr2[1];
            }
            setMeasuredDimension(iRound, Math.round(f2));
            return;
        }
        super.onMeasure(i, i2);
    }

    public C14O7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        C14O8 c14o8 = this.LL;
        if (c14o8 != null) {
            c14o8.LJFF(i, "left");
            c14o8.LJFF(i2, "top");
            c14o8.LJFF(i3, "right");
            c14o8.LJFF(i4, "bottom");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        C14O8 c14o8 = this.LL;
        if (c14o8 != null && c14o8.LIZ.LJ == null) {
            int iLIZ = c14o8.LIZ();
            for (int i5 = 0; i5 < iLIZ; i5++) {
                C14NX c14nx = (C14NX) ((C14O8) ListProtector.get(c14o8.LIZIZ, i5)).LIZ.LJII;
                float[] fArr = c14nx.LJFF().LIZ.LIZJ;
                float f4 = 0.0f;
                if (fArr != null) {
                    f = fArr[2];
                } else {
                    f = 0.0f;
                }
                int i6 = (int) f;
                float[] fArr2 = c14nx.LJFF().LIZ.LIZJ;
                if (fArr2 != null) {
                    f2 = fArr2[3];
                } else {
                    f2 = 0.0f;
                }
                int i7 = (int) f2;
                float[] fArr3 = c14nx.LJFF().LIZ.LIZJ;
                if (fArr3 != null) {
                    f3 = fArr3[0];
                } else {
                    f3 = 0.0f;
                }
                int i8 = ((int) f3) + i6;
                float[] fArr4 = c14nx.LJFF().LIZ.LIZJ;
                if (fArr4 != null) {
                    f4 = fArr4[1];
                }
                c14nx.LJIJI(i6, i7, i8, ((int) f4) + i7);
            }
        }
    }
}
