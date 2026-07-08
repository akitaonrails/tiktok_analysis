package X;

import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08XO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08XO {
    public static volatile C08XO LIZJ;
    public final Context LIZ;
    public List<Integer> LIZIZ = new ArrayList();

    public C08XO(Context context) {
        this.LIZ = null;
        this.LIZ = context;
    }

    public static C08XO LIZ(Context context) {
        if (LIZJ == null) {
            synchronized (C08XO.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C08XO(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final int LIZIZ() throws Exception {
        if (C786410Ut5.LJIJJ(this.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1;
        }
        return Math.round(((r3.getIntExtra("level", -1) / r3.getIntExtra("scale", -1)) * 100.0f) * 10.0f) / 10;
    }
}
