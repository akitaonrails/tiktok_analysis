package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.08Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2088108Fz {
    public static final Integer LIZ(String str) {
        Object objValueOf;
        Object obj = null;
        if (str == null) {
            objValueOf = null;
        } else {
            try {
                objValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objValueOf = new C098200Yq(th);
                C189200o6.m2constructorimpl(objValueOf);
            }
        }
        C189200o6.m2constructorimpl(objValueOf);
        if (!C189200o6.m7isFailureimpl(objValueOf)) {
            obj = objValueOf;
        }
        return (Integer) obj;
    }

    public static final String LIZIZ(Object obj, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('@');
        int iIdentityHashCode = System.identityHashCode(obj);
        CharsKt__CharJVMKt.checkRadix(16);
        sbLIZ.append(Integer.toString(iIdentityHashCode, 16));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
