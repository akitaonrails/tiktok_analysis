package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Wrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836490Wrf implements InterfaceC826030Wan {
    public static final C836490Wrf LIZ = new C836490Wrf();
    public static int LIZIZ;
    public static C836520Wri LIZJ;
    public static Object LIZLLL;
    public static volatile boolean LJ;

    public final void LIZIZ(Context context) {
        Object c098200Yq;
        long jClearCallingIdentity;
        Object c098200Yq2;
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            try {
                LIZJ = new C836520Wri(this);
                jClearCallingIdentity = Binder.clearCallingIdentity();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            try {
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), LIZJ);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                LJ = true;
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
                    return;
                }
                return;
            } finally {
            }
        }
        if (i >= 29) {
            try {
                final ExecutorC822880WPu executorC822880WPu = new ExecutorC822880WPu(Looper.getMainLooper());
                LIZLLL = new PhoneStateListener(executorC822880WPu) { // from class: X.0Wrg
                    @Override // android.telephony.PhoneStateListener
                    public final void onDataConnectionStateChanged(int i2, int i3) {
                        C836490Wrf.LIZ.getClass();
                        C836490Wrf.LIZIZ = i3;
                    }
                };
                jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    telephonyManager.listen((PhoneStateListener) LIZLLL, 64);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    LJ = true;
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } finally {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                C823280WRi.LIZLLL(thM5exceptionOrNullimpl2);
                return;
            }
            return;
        }
        C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS113S0100000_13(telephonyManager, 267));
    }

    @Override // X.InterfaceC826030Wan
    public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str, int i, String str2, String str3, String str4, C0WZW c0wzw) {
        if (!LJ) {
            return true;
        }
        interfaceC826050Wap.LIZIZ(str, Integer.valueOf(LIZIZ));
        return false;
    }
}
