package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08MJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MJ {
    public static final void LIZ(Function0 function0, boolean z) {
        Object c098200Yq;
        if (!z) {
            function0.invoke();
            return;
        }
        int iMyTid = Process.myTid();
        try {
            c098200Yq = Integer.valueOf(Process.getThreadPriority(iMyTid));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            try {
                Process.setThreadPriority(iMyTid, -2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        try {
            function0.invoke();
            if (num != null) {
                try {
                    Process.setThreadPriority(iMyTid, num.intValue());
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            if (num != null) {
                try {
                    Process.setThreadPriority(iMyTid, num.intValue());
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    throw th4;
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                    throw th4;
                }
            }
            throw th4;
        }
    }
}
