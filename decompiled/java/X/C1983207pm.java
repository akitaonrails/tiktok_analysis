package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1983207pm {
    public static final boolean LIZ(Class<?> cls) {
        if (!cls.isPrimitive()) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!((Class) cls.getField("TYPE").get(null)).isPrimitive()) {
                if (!Intrinsics.LJFF(cls, String.class)) {
                    return false;
                }
            }
        }
        return true;
    }
}
