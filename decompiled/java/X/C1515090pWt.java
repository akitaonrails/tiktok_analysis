package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0pWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515090pWt {
    public static volatile C1515090pWt LJIIIIZZ;
    public final Retrofit LIZLLL;
    public final Retrofit LJ;
    public final Retrofit LJFF;
    public final Retrofit LJI;
    public final List<InterfaceC1502020pBo> LJII = new CopyOnWriteArrayList();
    public final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZJ = new ConcurrentHashMap<>();

    public static C1515090pWt LIZ() {
        if (LJIIIIZZ == null) {
            synchronized (C1515090pWt.class) {
                try {
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = new C1515090pWt();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1515090pWt() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515090pWt.<init>():void");
    }
}
