package X;

import Y.ARunnableS89S0000000_10;
import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Qx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687000Qx8 {
    public ArrayList LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ(Context context) {
        if (Build.VERSION.SDK_INT <= 23 && !this.LIZIZ) {
            ArrayList arrayList = this.LIZ;
            if (arrayList != null && arrayList.size() > 0) {
                this.LIZ.clear();
                return;
            }
            if (this.LIZJ || this.LIZ != null) {
                return;
            }
            HandlerHook.viewPost(new TextView(context), new ARunnableS89S0000000_10(2));
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
                        ArrayList arrayList2 = (ArrayList) declaredField3.get(obj2);
                        this.LIZ = arrayList2;
                        arrayList2.clear();
                        this.LIZJ = true;
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ = true;
            }
        }
    }
}
