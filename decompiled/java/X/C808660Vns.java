package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808660Vns {
    public static volatile C808660Vns LIZIZ;
    public final Context LIZ;

    public final synchronized InterfaceC808670Vnt LIZIZ() {
        Class<?> cls;
        try {
            cls = Class.forName("com.a.b.AKeeperImpl");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
        return (InterfaceC808670Vnt) cls.getMethod("inst", new Class[0]).invoke(cls, new Object[0]);
    }

    public final void LIZ() {
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 233);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC823120WQs.LIZIZ(aRunnableS113S0100000_13);
        } else {
            aRunnableS113S0100000_13.run();
        }
    }

    public C808660Vns(Context context) {
        this.LIZ = C786410Ut5.N3(context);
        C808510Vnd.LIZ();
    }

    public static C808660Vns LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (C808660Vns.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C808660Vns(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
