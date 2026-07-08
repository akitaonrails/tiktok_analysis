package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0kUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1321680kUw extends ViewGroup {
    public boolean LL;

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.LL) {
            return super.getChildCount();
        }
        return 0;
    }

    public C1321680kUw(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.jm1, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1696660uFk) getChildAt(i)).LLILZ) {
                this.LL = true;
                try {
                    super.dispatchDraw(canvas);
                    this.LL = false;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LL = false;
                    throw th;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void LIZ(InterfaceC1686290tz1 interfaceC1686290tz1, C1696660uFk c1696660uFk, long j) {
        Canvas canvas = C1296530jqN.LIZ;
        super.drawChild(((C1696880uG6) interfaceC1686290tz1).LIZ, c1696660uFk, j);
    }
}
