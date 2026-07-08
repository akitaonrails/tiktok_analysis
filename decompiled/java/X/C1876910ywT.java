package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ywT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876910ywT {
    public static final long LIZ(File file) {
        if (((Boolean) C272460Am4.LIZ.getValue()).booleanValue()) {
            return 0L;
        }
        return C2260008tK.LJII(file.getAbsolutePath());
    }

    public static final boolean LIZIZ(List<String> list) {
        if (list.size() != 4) {
            return false;
        }
        C1876890ywR c1876890ywR = EnumC1876880ywQ.Companion;
        Object obj = ListProtector.get(list, 0);
        c1876890ywR.getClass();
        if (obj == null || !EnumC1876880ywQ.byToken.containsKey(obj) || a0.LJJJIL((CharSequence) ListProtector.get(list, 1)) || C2095008Iq.LJIILIIL((String) ListProtector.get(list, 2)) == null || C2095008Iq.LJIILIIL((String) ListProtector.get(list, 3)) == null) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(ReentrantReadWriteLock.WriteLock writeLock, Function0 function0, Function1 function1) {
        writeLock.lock();
        try {
            try {
                function0.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                function1.invoke(e);
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            writeLock.unlock();
            throw th;
        }
    }
}
