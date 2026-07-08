package X;

import Y.ARunnableS66S0300000_33;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Al9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188611Al9 {
    public static long LIZ;

    public static void LIZ(C1768270w7F c1768270w7F) {
        InterfaceC2188711AlJ[] interfaceC2188711AlJArr;
        LIZ = SystemClock.uptimeMillis();
        synchronized (C09QK.LIZ) {
            try {
                interfaceC2188711AlJArr = (InterfaceC2188711AlJ[]) ((ArrayList) C09QK.LIZIZ).toArray(new InterfaceC2188711AlJ[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC2188721AlK[] interfaceC2188721AlKArrLIZ = C2188651AlD.LIZ();
        if (interfaceC2188711AlJArr.length > 1 || interfaceC2188721AlKArrLIZ.length > 1) {
            C20100213km.LIZ().execute(new ARunnableS66S0300000_33(interfaceC2188711AlJArr, interfaceC2188721AlKArrLIZ, c1768270w7F, 15));
        }
    }
}
