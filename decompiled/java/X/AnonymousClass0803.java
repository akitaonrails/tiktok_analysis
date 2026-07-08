package X;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0803, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0803 {
    public static volatile boolean LIZ;

    public static AnonymousClass0806 LIZ() throws C081H {
        try {
            return LIZ ? new AnonymousClass0804(C1967707nH.LJI(), null) : new AnonymousClass0805(Reflect.on("com.bytedance.ttnet.NQEManager"), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C081H(e.getMessage(), e.getCause());
        }
    }

    public static AnonymousClass0806 LIZIZ(Class<?> cls) throws C081H {
        try {
            if (LIZ) {
                return new AnonymousClass0804(new C1967707nH(cls), null);
            }
            return new AnonymousClass0805(Reflect.on(cls), null);
        } catch (Exception e) {
            try {
                TryCatchGuardChecker.doCheck(e);
                throw new C081H(e.getMessage(), e.getCause());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C081H(e2.getMessage(), e2.getCause());
            }
        }
    }

    public static AnonymousClass0806 LIZJ(Object obj) throws C081H {
        try {
            return LIZLLL(obj, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C081H(e.getMessage(), e.getCause());
        }
    }

    public static AnonymousClass0806 LIZLLL(Object obj, C1494570ozn c1494570ozn) throws C081H {
        try {
            if (LIZ) {
                if (obj != null) {
                    return new AnonymousClass0804(new C1967707nH(obj), c1494570ozn);
                }
                throw new C1967807nI("Instance object cannot be null");
            }
            return new AnonymousClass0805(Reflect.on(obj), c1494570ozn);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C081H(e.getMessage(), e.getCause());
        }
    }
}
