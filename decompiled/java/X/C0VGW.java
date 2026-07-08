package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VGW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VGW<T> implements InterfaceC789890Uyh<T> {
    public final List<String> LIZ = new ArrayList();
    public T LIZIZ;
    public final C0VG7<T> LIZJ;
    public InterfaceC794920VGg LIZLLL;

    public abstract boolean LIZIZ(C0VIG c0vig);

    public abstract boolean LIZJ(T t);

    public C0VGW(C0VG7<T> c0vg7) {
        this.LIZJ = c0vg7;
    }

    @Override // X.InterfaceC789890Uyh
    public final void LIZ(T t) {
        this.LIZIZ = t;
        LJ(this.LIZLLL, t);
    }

    public final void LIZLLL(Iterable<C0VIG> iterable) {
        ((ArrayList) this.LIZ).clear();
        for (C0VIG c0vig : iterable) {
            if (LIZIZ(c0vig)) {
                ((ArrayList) this.LIZ).add(c0vig.LIZ);
            }
        }
        if (((ArrayList) this.LIZ).isEmpty()) {
            this.LIZJ.LIZIZ(this);
        } else {
            C0VG7<T> c0vg7 = this.LIZJ;
            synchronized (c0vg7.LIZJ) {
                try {
                    if (c0vg7.LIZLLL.add(this)) {
                        if (c0vg7.LIZLLL.size() == 1) {
                            c0vg7.LJ = c0vg7.LIZ();
                            C0VI8 c0vi8LIZ = C0VI8.LIZ();
                            C786410Ut5.j4("%s: initial state = %s", new Object[]{c0vg7.getClass().getSimpleName(), c0vg7.LJ});
                            c0vi8LIZ.getClass();
                            c0vg7.LIZLLL();
                        }
                        LIZ(c0vg7.LJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJ(this.LIZLLL, this.LIZIZ);
    }

    public final void LJ(InterfaceC794920VGg interfaceC794920VGg, T t) {
        if (!((ArrayList) this.LIZ).isEmpty() && interfaceC794920VGg != null) {
            if (t != null && !LIZJ(t)) {
                ((C0VGY) interfaceC794920VGg).LIZIZ(this.LIZ);
                return;
            }
            List<String> list = this.LIZ;
            C0VGY c0vgy = (C0VGY) interfaceC794920VGg;
            synchronized (c0vgy.LIZJ) {
                try {
                    C0VGX c0vgx = c0vgy.LIZ;
                    if (c0vgx != null) {
                        c0vgx.LIZJ(list);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
