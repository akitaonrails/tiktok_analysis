package X;

import Y.ARunnableS104S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334150D8b {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final ArrayDeque<String> LIZIZ = new ArrayDeque<>();
    public static boolean LIZJ;

    public static void LIZ(Context context) {
        String strRemoveFirst;
        String str;
        boolean zIsEmpty;
        long j;
        if (LIZJ) {
            return;
        }
        ArrayDeque<String> arrayDeque = LIZIZ;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    strRemoveFirst = null;
                } else {
                    strRemoveFirst = arrayDeque.removeFirst();
                }
                str = strRemoveFirst;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (str == null) {
            return;
        }
        LIZJ = true;
        synchronized (arrayDeque) {
            try {
                zIsEmpty = true ^ arrayDeque.isEmpty();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (zIsEmpty) {
            j = 1500;
        } else {
            j = 3000;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        C786410Ut5.LJLIIL(j, LIZ, new ARunnableS104S0100000_4(context, 140));
    }

    public static void LIZIZ(Context context, String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        ArrayDeque<String> arrayDeque = LIZIZ;
        synchronized (arrayDeque) {
            try {
                arrayDeque.addLast(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(LIZ, new ARunnableS104S0100000_4(context, 141));
    }
}
