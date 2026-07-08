package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ktb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336970ktb {
    public static C1319530kRT LIZ(Context context) {
        Object c098200Yq;
        C1319530kRT c1319530kRT = new C1319530kRT(context, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1319530kRT);
        c1319530kRT.setLayoutParams(layoutParams);
        c1319530kRT.setTabMode(0);
        c1319530kRT.setSelectedTabIndicator(R.drawable.cle);
        c1319530kRT.setSelectedTabIndicatorHeight(-1);
        c1319530kRT.setBackgroundResource(R.drawable.clf);
        c1319530kRT.getBackground().mutate();
        Drawable tabSelectedIndicator = c1319530kRT.getTabSelectedIndicator();
        if (tabSelectedIndicator != null) {
            tabSelectedIndicator.mutate();
        }
        int i = LynxTabBarView.LLJIJIL;
        try {
            Field declaredField = C19U1.class.getDeclaredField("tabPaddingStart");
            declaredField.setAccessible(true);
            declaredField.set(c1319530kRT, 0);
            Field declaredField2 = C19U1.class.getDeclaredField("tabPaddingEnd");
            declaredField2.setAccessible(true);
            declaredField2.set(c1319530kRT, 0);
            Field declaredField3 = C19U1.class.getDeclaredField("tabPaddingTop");
            declaredField3.setAccessible(true);
            declaredField3.set(c1319530kRT, 0);
            Field declaredField4 = C19U1.class.getDeclaredField("tabPaddingBottom");
            declaredField4.setAccessible(true);
            declaredField4.set(c1319530kRT, 0);
            Field declaredField5 = C19U1.class.getDeclaredField("requestedTabMinWidth");
            declaredField5.setAccessible(true);
            declaredField5.set(c1319530kRT, 0);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return c1319530kRT;
    }
}
