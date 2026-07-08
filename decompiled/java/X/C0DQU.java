package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DQU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQU implements InterfaceC1554280qY6 {
    public final View LIZ;
    public final Integer[] LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        try {
            c098200Yq = Integer.valueOf(this.LIZIZ[0].intValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        try {
            c098200Yq2 = Integer.valueOf(this.LIZIZ[1].intValue());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = 0;
        }
        int iIntValue2 = ((Number) c098200Yq2).intValue();
        try {
            c098200Yq3 = Integer.valueOf(this.LIZIZ[2].intValue());
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = 0;
        }
        int iIntValue3 = ((Number) c098200Yq3).intValue();
        try {
            c098200Yq4 = Integer.valueOf(this.LIZIZ[3].intValue());
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = 0;
        }
        int iIntValue4 = ((Number) c098200Yq4).intValue();
        if (iIntValue2 > 0 || iIntValue4 > 0 || iIntValue > 0 || iIntValue3 > 0) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = iIntValue;
                marginLayoutParams.topMargin = iIntValue2;
                marginLayoutParams.rightMargin = iIntValue3;
                marginLayoutParams.bottomMargin = iIntValue4;
            }
            this.LIZ.requestLayout();
        }
    }

    public C0DQU(View view, Integer[] numArr) {
        this.LIZ = view;
        this.LIZIZ = numArr;
    }
}
