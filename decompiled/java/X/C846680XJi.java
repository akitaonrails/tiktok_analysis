package X;

import Y.ARunnableS5S1400000_13;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0XJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846680XJi {
    public static C846680XJi LIZIZ;
    public final LruCache<String, Integer> LIZ = new LruCache<>(100);

    public static C846680XJi LIZ() {
        if (LIZIZ == null) {
            synchronized (C846680XJi.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C846680XJi();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(C1288950je9 c1288950je9, InterfaceC846700XJk interfaceC846700XJk) {
        C846690XJj c846690XJj = new C846690XJj();
        String str = c1288950je9.LIZ;
        if (TextUtils.isEmpty(str)) {
            c846690XJj.LIZIZ = "url is empty!";
            interfaceC846700XJk.LIZIZ(c846690XJj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("url:");
            sbLIZ.append(str);
            sbLIZ.append(" is empty!");
            LynxLog.w("lynx_ResManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1301610jyZ.LIZIZ().execute(new ARunnableS5S1400000_13(this, c1288950je9, str, interfaceC846700XJk, c846690XJj, 2));
    }
}
