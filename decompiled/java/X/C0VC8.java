package X;

import Y.ARunnableS7S2100000_13;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdklib.apm6.http.DefaultTTNetImpl;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0VC8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC8 {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static boolean LIZIZ = true;
    public static String LIZJ;

    public static void LIZIZ(String str, byte[] bArr) {
        try {
            if (C036E.LIZ.LIZIZ() && bArr != null && bArr.length != 0) {
                try {
                    HashMap map = new HashMap();
                    byte[] bArrLIZIZ = C793460VAq.LIZIZ(bArr, map);
                    HashMap map2 = new HashMap(C0VC5.LIZ());
                    map2.put("aid", "44444");
                    String strLIZ = C015O.LIZ(str, map2);
                    boolean zLJI = MethodIDManager.LJI(137375);
                    IHttpService defaultTTNetImpl = C0VCC.LJJIIJ;
                    if (defaultTTNetImpl == null) {
                        defaultTTNetImpl = new DefaultTTNetImpl();
                    }
                    defaultTTNetImpl.doPost(strLIZ, bArrLIZIZ, map);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(LIZJ) && LIZIZ) {
            AtomicInteger atomicInteger = LIZ;
            if (atomicInteger.get() < 3) {
                atomicInteger.incrementAndGet();
                C793980VCq.LIZ.LIZIZ(new ARunnableS7S2100000_13(th, str, str2, 5));
            }
        }
    }
}
