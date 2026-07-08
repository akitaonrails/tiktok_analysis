package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837720Wte {
    public static final <T> C814380Vx6<T> LIZ(String str, String str2, Cert cert, Function0<C814380Vx6<T>> function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        C825940Wae c825940Wae = new C825940Wae(cert, C2188811AlT.LIZIZ(sbLIZ), null, Integer.valueOf(EnumC746240TPa.DIRECT_AUTH.getType()), "Collect");
        c825940Wae.LIZ(str, "sdkName");
        c825940Wae.LIZ(str2, "methodName");
        C838040WuA c838040WuA = new C838040WuA(0, null, 7);
        try {
            C837730Wtf.LIZ.LIZ(c825940Wae, c838040WuA);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
        }
        try {
            C814380Vx6<T> c814380Vx6Invoke = function0.invoke();
            try {
                C837730Wtf.LIZ.LIZIZ(c825940Wae, c838040WuA);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return c814380Vx6Invoke;
            } catch (Throwable th2) {
                return c814380Vx6Invoke;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                C837730Wtf.LIZ.LIZIZ(c825940Wae, c838040WuA);
                C189200o6.m2constructorimpl(Unit.LIZ);
                throw th3;
            } finally {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
