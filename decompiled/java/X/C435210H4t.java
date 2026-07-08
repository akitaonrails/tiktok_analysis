package X;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.concurrent.CancellationException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0H4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435210H4t {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public static View LIZ(int i, View view) {
        Object c098200Yq;
        Object obj = null;
        try {
            c098200Yq = view.findViewById(i);
            if (!(c098200Yq instanceof View)) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (View) obj;
    }

    public static void LIZLLL(TuxTextView tuxTextView, String str) {
        tuxTextView.getContext();
        Integer numLIZIZ = LIZIZ(str);
        if (numLIZIZ != null) {
            tuxTextView.setTextColor(numLIZIZ.intValue());
        }
    }

    public static void LIZJ(ViewGroup viewGroup, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (num != null) {
                marginLayoutParams.setMarginStart(num.intValue());
            }
            if (num2 != null) {
                marginLayoutParams.topMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.setMarginEnd(num3.intValue());
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
            C786410Ut5.X5(marginLayoutParams, viewGroup);
        }
    }
}
