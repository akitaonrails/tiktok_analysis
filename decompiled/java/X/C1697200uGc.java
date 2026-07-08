package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0uGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1697200uGc extends ViewGroup {
    public boolean LL;

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

    public C1697200uGc(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.jm5, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1697150uGX) getChildAt(i)).LLIZLLLIL) {
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

    public final void LIZ(InterfaceC1686290tz1 interfaceC1686290tz1, View view, long j) {
        Canvas canvas = C1296530jqN.LIZ;
        super.drawChild(((C1696880uG6) interfaceC1686290tz1).LIZ, view, j);
    }
}
