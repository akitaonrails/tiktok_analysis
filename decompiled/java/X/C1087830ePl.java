package X;

import android.graphics.Color;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ePl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087830ePl {
    public static final void LIZ(C21538519Qx c21538519Qx, String str) {
        Object c098200Yq;
        if (c21538519Qx != null && str != null && str.length() != 0) {
            try {
                c098200Yq = Integer.valueOf(Color.parseColor(str));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = -1;
            }
            c21538519Qx.setStrokeColor(((Number) c098200Yq).intValue());
        }
    }

    public static final void LIZIZ(TextView textView, String str, String str2) {
        int color;
        Object c098200Yq;
        int color2;
        Object c098200Yq2;
        if (textView == null) {
            return;
        }
        if (C500260Jjc.LJJIIZ(str)) {
            if (str == null) {
                color2 = -1;
            } else {
                try {
                    color2 = Color.parseColor(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
            }
            c098200Yq2 = Integer.valueOf(color2);
            C189200o6.m2constructorimpl(c098200Yq2);
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = -1;
            }
            textView.setBackgroundColor(((Number) c098200Yq2).intValue());
        }
        if (C500260Jjc.LJJIIZ(str2)) {
            if (str2 == null) {
                color = -1;
            } else {
                try {
                    color = Color.parseColor(str2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
            c098200Yq = Integer.valueOf(color);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = -1;
            }
            textView.setTextColor(((Number) c098200Yq).intValue());
        }
    }
}
