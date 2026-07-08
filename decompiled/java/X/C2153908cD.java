package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2153908cD {
    public static final C2153908cD LIZ = new C2153908cD();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ);

    public static void LIZ(String str, Function0 function0) {
        Object objInvoke = function0.invoke();
        if (objInvoke != null) {
            LIZ.getClass();
            LIZJ(6, objInvoke, str);
        }
    }

    public static void LIZIZ(String str, Function0 function0) {
        Object objInvoke = function0.invoke();
        if (objInvoke != null) {
            LIZ.getClass();
            LIZJ(4, objInvoke, str);
        }
    }

    public static void LIZJ(int i, Object obj, String str) {
        Object c098200Yq;
        String string;
        try {
            if (obj instanceof Throwable) {
                string = Log.getStackTraceString((Throwable) obj);
            } else if (obj instanceof Object[]) {
                string = Arrays.toString((Object[]) obj);
            } else {
                string = obj.toString();
            }
            if (i >= 4) {
                C23250099c.LIZLLL(LIZIZ, null, null, new C2153808cC(i, str, string, obj, null), 3);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }
}
