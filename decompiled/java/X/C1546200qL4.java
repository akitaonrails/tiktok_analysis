package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546200qL4 {
    public static int LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
        }
        if (layoutParams instanceof C16G1) {
            return ((C16G1) view.getLayoutParams()).LIZJ;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity;
        }
        return 0;
    }

    public static void LIZJ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof C16G1) {
            ((C16G1) layoutParams).LIZJ = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        }
        view.requestLayout();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZIZ(SparkPopupSchemaParam sparkPopupSchemaParam, View view, Integer[] numArr) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        int i;
        String realGravityWithoutDefault = sparkPopupSchemaParam.getRealGravityWithoutDefault(view.getContext());
        switch (realGravityWithoutDefault.hashCode()) {
            case -1383228885:
                if (realGravityWithoutDefault.equals("bottom")) {
                    return 81;
                }
                break;
            case -1364013995:
                if (realGravityWithoutDefault.equals("center")) {
                    return 17;
                }
                break;
            case 100571:
                if (realGravityWithoutDefault.equals("end")) {
                    return 8388613;
                }
                break;
            case 3317767:
                if (realGravityWithoutDefault.equals("left")) {
                    return 3;
                }
                break;
            case 108511772:
                if (realGravityWithoutDefault.equals("right")) {
                    return 5;
                }
                break;
            case 109757538:
                if (realGravityWithoutDefault.equals("start")) {
                    return 8388611;
                }
                break;
        }
        try {
            c098200Yq = Integer.valueOf(numArr[0].intValue());
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
            c098200Yq2 = Integer.valueOf(numArr[1].intValue());
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
            c098200Yq3 = Integer.valueOf(numArr[2].intValue());
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
            c098200Yq4 = Integer.valueOf(numArr[3].intValue());
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = 0;
        }
        ((Number) c098200Yq4).intValue();
        try {
            c098200Yq5 = Integer.valueOf(numArr[4].intValue());
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq5)) {
            c098200Yq5 = 0;
        }
        int iIntValue4 = ((Number) c098200Yq5).intValue();
        try {
            c098200Yq6 = Integer.valueOf(numArr[5].intValue());
            C189200o6.m2constructorimpl(c098200Yq6);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq6 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq6);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq6)) {
            c098200Yq6 = 0;
        }
        int iIntValue5 = ((Number) c098200Yq6).intValue();
        if (iIntValue2 > 0) {
            i = 48;
        } else {
            i = 80;
        }
        C1545540qK0.LIZIZ(view.getContext());
        if (iIntValue4 > 0) {
            return i | 8388611;
        }
        if (iIntValue5 > 0) {
            return i | 8388613;
        }
        if (iIntValue > 0) {
            return i | 3;
        }
        if (iIntValue3 > 0) {
            return i | 5;
        }
        return i | 17;
    }
}
