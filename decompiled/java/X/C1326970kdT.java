package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326970kdT {
    public static final Class<?> LIZIZ = C1326970kdT.class;
    public final Map<InterfaceC1324680kZm, C1328480kfu> LIZ = new HashMap();

    public final void LIZ() {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList(((HashMap) this.LIZ).values());
                ((HashMap) this.LIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C1328480kfu c1328480kfu = (C1328480kfu) arrayList.get(i);
            if (c1328480kfu != null) {
                c1328480kfu.close();
            }
        }
    }

    public final synchronized void LIZJ() {
        C1328570kg3.LJIIJJI(LIZIZ, "Count = %d", Integer.valueOf(((HashMap) this.LIZ).size()));
    }

    public final synchronized C1328480kfu LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        interfaceC1324680kZm.getClass();
        C1328480kfu c1328480kfuLIZ = (C1328480kfu) ((HashMap) this.LIZ).get(interfaceC1324680kZm);
        if (c1328480kfuLIZ != null) {
            synchronized (c1328480kfuLIZ) {
                try {
                    if (!C1328480kfu.LJIIZILJ(c1328480kfuLIZ)) {
                        ((HashMap) this.LIZ).remove(interfaceC1324680kZm);
                        C1328570kg3.LJIIZILJ(LIZIZ, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c1328480kfuLIZ)), interfaceC1324680kZm.LIZ(), Integer.valueOf(System.identityHashCode(interfaceC1324680kZm)));
                        return null;
                    }
                    c1328480kfuLIZ = C1328480kfu.LIZ(c1328480kfuLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1328480kfuLIZ;
    }

    public final void LIZLLL(InterfaceC1324680kZm interfaceC1324680kZm) {
        C1328480kfu c1328480kfu;
        interfaceC1324680kZm.getClass();
        synchronized (this) {
            try {
                c1328480kfu = (C1328480kfu) ((HashMap) this.LIZ).remove(interfaceC1324680kZm);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c1328480kfu == null) {
            return;
        }
        try {
            c1328480kfu.LJIILLIIL();
            c1328480kfu.close();
        } catch (Throwable th) {
            c1328480kfu.close();
            throw th;
        }
    }

    public final synchronized void LJ(InterfaceC1324680kZm interfaceC1324680kZm, C1328480kfu c1328480kfu) {
        interfaceC1324680kZm.getClass();
        c1328480kfu.getClass();
        C1322350kW1.LIZIZ(C1328480kfu.LJIIZILJ(c1328480kfu));
        C1328480kfu c1328480kfu2 = (C1328480kfu) ((HashMap) this.LIZ).get(interfaceC1324680kZm);
        if (c1328480kfu2 == null) {
            return;
        }
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = c1328480kfu2.LJFF();
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF2 = c1328480kfu.LJFF();
        if (c1323050kX9LJFF != null && c1323050kX9LJFF2 != null) {
            try {
                if (c1323050kX9LJFF.get() == c1323050kX9LJFF2.get()) {
                    ((HashMap) this.LIZ).remove(interfaceC1324680kZm);
                    C1323050kX9.LJII(c1323050kX9LJFF2);
                    C1323050kX9.LJII(c1323050kX9LJFF);
                    C1328480kfu.LIZIZ(c1328480kfu2);
                    LIZJ();
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1323050kX9.LJII(c1323050kX9LJFF2);
                C1323050kX9.LJII(c1323050kX9LJFF);
                C1328480kfu.LIZIZ(c1328480kfu2);
                throw th;
            }
        }
        C1323050kX9.LJII(c1323050kX9LJFF2);
        C1323050kX9.LJII(c1323050kX9LJFF);
        C1328480kfu.LIZIZ(c1328480kfu2);
    }
}
