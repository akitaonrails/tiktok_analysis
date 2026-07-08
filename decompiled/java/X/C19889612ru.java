package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.12ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19889612ru {
    public static void LIZ(C0VSJ c0vsj, C0VSJ c0vsj2) throws Throwable {
        C19864312np.LIZIZ(c0vsj, c0vsj2, "Source %s and destination %s must be different", !c0vsj.equals(c0vsj2));
        C19889312rr c19889312rr = new C19889312rr(c0vsj2, new EnumC19889512rt[0]);
        C19889712rv c19889712rv = new C19889712rv(C19889712rv.LLILZ);
        try {
            C0VSP c0vsp = new C0VSP(c0vsj);
            ((ArrayDeque) c19889712rv.LLILLJJLI).addFirst(c0vsp);
            C0VSV c0vsv = new C0VSV(c0vsj2, c19889312rr.LIZIZ.contains(EnumC19889512rt.APPEND));
            ((ArrayDeque) c19889712rv.LLILLJJLI).addFirst(c0vsv);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = c0vsp.read(bArr);
                if (i != -1) {
                    c0vsv.write(bArr, 0, i);
                } else {
                    c19889712rv.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                c19889712rv.LLILLL = th;
                Object obj = C08KI.LIZ;
                if (!IOException.class.isInstance(th)) {
                    C08KI.LIZIZ(th);
                    throw new RuntimeException(th);
                }
                throw ((Throwable) IOException.class.cast(th));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c19889712rv.close();
                throw th2;
            }
        }
    }
}
