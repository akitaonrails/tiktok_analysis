package X;

import android.os.Build;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630710OoX {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZ(ViewParent viewParent, View view) {
        TouchDelegate touchDelegate;
        View view2;
        if (Build.VERSION.SDK_INT >= 34 || !(viewParent instanceof View) || (touchDelegate = ((View) viewParent).getTouchDelegate()) == null) {
            return false;
        }
        try {
            Field declaredField = TouchDelegate.class.getDeclaredField("mDelegateView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(touchDelegate);
            if (obj instanceof View) {
                view2 = (View) obj;
            } else {
                view2 = null;
            }
            return Intrinsics.LJFF(view2, view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
