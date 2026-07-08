package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552210qUl {
    public static final Map<Class<? extends AbstractC1552240qUo<?, ?>>, C1552220qUm> LIZ = new HashMap();

    public static AbstractC1552800qVi LIZ(Class<? extends AbstractC1552240qUo<?, ?>> cls) {
        AbstractC1552800qVi abstractC1552800qVi;
        Map<Class<? extends AbstractC1552240qUo<?, ?>>, C1552220qUm> map = LIZ;
        synchronized (map) {
            try {
                abstractC1552800qVi = (AbstractC1552800qVi) ((HashMap) map).get(cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1552800qVi;
    }

    public static void LIZIZ(Class<? extends AbstractC1552240qUo<?, ?>> cls, AbstractC1552800qVi abstractC1552800qVi) {
        Map<Class<? extends AbstractC1552240qUo<?, ?>>, C1552220qUm> map = LIZ;
        synchronized (map) {
            try {
                C1552220qUm c1552220qUm = (C1552220qUm) ((HashMap) map).get(cls);
                if (c1552220qUm == null) {
                    c1552220qUm = new C1552220qUm(new AbstractC1552800qVi[0]);
                    ((HashMap) map).put(cls, c1552220qUm);
                }
                if (abstractC1552800qVi != null) {
                    ((CopyOnWriteArrayList) c1552220qUm.LIZ).add(abstractC1552800qVi);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(Class<? extends AbstractC1552240qUo<?, ?>> cls, AbstractC1552800qVi abstractC1552800qVi) {
        Map<Class<? extends AbstractC1552240qUo<?, ?>>, C1552220qUm> map = LIZ;
        synchronized (map) {
            try {
                C1552220qUm c1552220qUm = (C1552220qUm) ((HashMap) map).get(cls);
                if (c1552220qUm == null) {
                    return;
                }
                if (abstractC1552800qVi != null) {
                    ((CopyOnWriteArrayList) c1552220qUm.LIZ).remove(abstractC1552800qVi);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
