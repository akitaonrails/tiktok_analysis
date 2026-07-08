package X;

import Y.ARunnableS89S0000000_10;
import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Qx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC686980Qx6 implements Runnable {
    public final Runnable LL;

    public final void LIZ() {
        this.LL.run();
        C686990Qx7 c686990Qx7 = C686990Qx7.LIZLLL;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (Build.VERSION.SDK_INT > 23 || c686990Qx7.LIZIZ) {
            return;
        }
        ArrayList arrayList = c686990Qx7.LIZ;
        if (arrayList != null && arrayList.size() > 0) {
            C086I.LIZ(c686990Qx7.LIZ);
            return;
        }
        if (c686990Qx7.LIZJ || c686990Qx7.LIZ != null) {
            return;
        }
        try {
            HandlerHook.viewPost(new TextView(contextLIZ), new ARunnableS89S0000000_10(1));
            try {
                Thread threadU3 = C786410Ut5.u3();
                Field declaredField = Thread.class.getDeclaredField("localValues");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(threadU3);
                Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                declaredField2.setAccessible(true);
                for (Object obj2 : (Object[]) declaredField2.get(obj)) {
                    if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                        Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                        declaredField3.setAccessible(true);
                        C086I.LIZ(declaredField3.get(obj2));
                        c686990Qx7.LIZ = (ArrayList) declaredField3.get(obj2);
                        c686990Qx7.LIZJ = true;
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c686990Qx7.LIZIZ = true;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("WidgetRunnable@f706.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WidgetRunnable@f706.run");
    }

    public RunnableC686980Qx6(Runnable runnable) {
        this.LL = runnable;
    }
}
