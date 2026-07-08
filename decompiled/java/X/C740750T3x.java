package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740750T3x {
    public static InterfaceC742320T9y LIZ(final C0T0O c0t0o) {
        int i = c0t0o.LIZJ;
        if (i <= 10 && i >= 1) {
            if (10 == i) {
                return new InterfaceC742320T9y() { // from class: X.0T9v
                    @Override // X.InterfaceC742320T9y
                    public final C098D<Object> LIZIZ(C11NZ<Object> c11nz) {
                        return c11nz.LJL(C11S5.LJ).LJJJLZIJ(C1701940uOG.LIZIZ());
                    }
                };
            }
            return new InterfaceC742320T9y() { // from class: X.0T9w
                @Override // X.InterfaceC742320T9y
                public final C098D<Object> LIZIZ(C11NZ<Object> c11nz) {
                    final C0TCN c0tcn = C742310T9x.LIZ;
                    final C0T0O c0t0o2 = c0t0o;
                    c0tcn.getClass();
                    return c11nz.LJL(new C11RO(c0t0o2) { // from class: X.0TCK
                        public final C0T0O LIZIZ;

                        @Override // X.C11RO
                        public final C11RN LIZ() {
                            C0TCN c0tcn2 = this.LIZJ;
                            synchronized (c0tcn2.LIZIZ) {
                                try {
                                    if (c0tcn2.LIZIZ.get() < 1) {
                                        c0tcn2.LIZIZ.incrementAndGet();
                                        c0tcn2.LIZJ.submit(new ARunnableS112S0100000_12(c0tcn2, 291));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C740380T2m.LIZ.getClass();
                            C740410T2p.LIZ.getClass();
                            return new C0TG1(this.LIZIZ, this.LIZJ.LIZ);
                        }

                        {
                            this.LIZIZ = c0t0o2;
                        }
                    }).LJJJLZIJ(C1701940uOG.LIZIZ());
                }
            };
        }
        "Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!".toString();
        throw new IllegalArgumentException("Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!");
    }
}
