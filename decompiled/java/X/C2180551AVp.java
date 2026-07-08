package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1AVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180551AVp {
    public static final Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> LIZ = new LinkedHashMap();

    static {
        if (C1AW1.LIZIZ()) {
            C2180561AVq c2180561AVq = C2180561AVq.LIZ;
            Iterator<T> it2 = C2180561AVq.LIZJ().iterator();
            while (it2.hasNext()) {
                LIZ.put((EnumC2180541AVo) it2.next(), c2180561AVq);
            }
        }
    }

    public static void LIZ(EnumC2180541AVo enumC2180541AVo, Object obj, Object obj2) {
        InterfaceC2180591AVt interfaceC2180591AVt;
        if (!C1AW1.LIZIZ() || C1E7D.LIZIZ()) {
            return;
        }
        try {
            Object obj3 = ((LinkedHashMap) LIZ).get(enumC2180541AVo);
            if ((obj3 instanceof InterfaceC2180591AVt) && (interfaceC2180591AVt = (InterfaceC2180591AVt) obj3) != null) {
                interfaceC2180591AVt.LIZIZ(enumC2180541AVo, obj, obj2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2180601AVu.LIZ.logException(th);
        }
    }

    public static void LIZIZ(EnumC2180541AVo enumC2180541AVo, Object obj, Object obj2) {
        InterfaceC2180591AVt interfaceC2180591AVt;
        if (!C1AW1.LIZIZ() || C1E7D.LIZIZ()) {
            return;
        }
        try {
            Object obj3 = ((LinkedHashMap) LIZ).get(enumC2180541AVo);
            if ((obj3 instanceof InterfaceC2180591AVt) && (interfaceC2180591AVt = (InterfaceC2180591AVt) obj3) != null) {
                interfaceC2180591AVt.LIZ(enumC2180541AVo, obj);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2180601AVu.LIZ.logException(th);
        }
    }
}
