package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719720SLa {
    public static final List<WeakReference<Function0<String>>> LIZ = new ArrayList();

    public static void LIZ() {
        List<WeakReference<Function0<String>>> list = LIZ;
        synchronized (list) {
            try {
                C19719612Di.LJJIIJ(list, AFwS243S0000000_11.get$arr$(696), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZIZ(Function0<String> function0) {
        List<WeakReference<Function0<String>>> list = LIZ;
        synchronized (list) {
            try {
                C19719612Di.LJJIIJ(list, new AwS590S0100000_11(function0, (Function0<String>) 468), true);
                ((ArrayList) list).add(new WeakReference(function0));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZJ(Function0<String> function0) {
        List<WeakReference<Function0<String>>> list = LIZ;
        synchronized (list) {
            try {
                C19719612Di.LJJIIJ(list, new AwS590S0100000_11(function0, (Function0<String>) 469), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
