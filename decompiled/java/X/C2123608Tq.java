package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.channels.FileLock;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123608Tq {
    public static final C2123608Tq LIZ = new C2123608Tq();

    public static boolean LIZ(int i) {
        if (i == Process.myPid()) {
            return true;
        }
        C0VSJ c0vsj = new C0VSJ((File) null, String.valueOf(i));
        if (!c0vsj.isFile()) {
            return false;
        }
        try {
            FileLock fileLockTryLock = new C0VSV(c0vsj).getChannel().tryLock();
            if (fileLockTryLock == null) {
                return true;
            }
            try {
                fileLockTryLock.release();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            c0vsj.delete();
            return false;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return true;
            }
            return false;
        }
    }
}
