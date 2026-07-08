package X;

import android.content.Context;
import android.os.storage.StorageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.09fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2427309fD {
    public static C2427309fD LJI;
    public static volatile boolean LJII;
    public static Context LJIIIIZZ;
    public final InterfaceC2427509fF LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public volatile Boolean LJ;
    public C0VSJ LJFF;

    public final String LIZIZ() {
        C2427409fE c2427409fE;
        Method method;
        Object obj;
        InterfaceC2427509fF interfaceC2427509fF = this.LIZ;
        if (interfaceC2427509fF != null && (method = (c2427409fE = (C2427409fE) interfaceC2427509fF).LIZ) != null && (obj = c2427409fE.LIZIZ) != null) {
            try {
                return (String) C2204961BRm.a0(method, obj, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXcip6z9zD4gMdE+jJ2rLxwqI=", null));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return "unknown";
            }
        }
        return "unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008b -> B:68:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2427309fD.LIZJ():boolean");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", availableSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", path=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C2427309fD LIZ(Context context) {
        Method method;
        Method method2;
        Method method3;
        Object objInvoke;
        int length;
        int i;
        LJIIIIZZ = C786410Ut5.N3(context);
        if (!LJII) {
            synchronized (C2427309fD.class) {
                try {
                    if (!LJII) {
                        try {
                            try {
                                StorageManager storageManager = (StorageManager) C786410Ut5.H2(context, "storage");
                                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                                Method method4 = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                                method = cls.getMethod("getPathFile", new Class[0]);
                                method2 = cls.getMethod("isRemovable", new Class[0]);
                                method3 = cls.getMethod("getState", new Class[0]);
                                objInvoke = method4.invoke(storageManager, new Object[0]);
                                length = Array.getLength(objInvoke);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            for (i = 0; i < length; i++) {
                                Object obj = Array.get(objInvoke, i);
                                if (((Boolean) method2.invoke(obj, new Object[0])).booleanValue()) {
                                    File file = (File) method.invoke(obj, new Object[0]);
                                    C2427309fD c2427309fD = new C2427309fD(new C2427409fE(obj, method3), file.getFreeSpace(), file.getTotalSpace(), file.getPath());
                                    LJI = c2427309fD;
                                    LJII = true;
                                    return c2427309fD;
                                }
                                LJII = true;
                            }
                            LJII = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            LJII = true;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LJI;
    }

    public C2427309fD(C2427409fE c2427409fE, long j, long j2, String str) {
        this.LIZ = c2427409fE;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
    }
}
