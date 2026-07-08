package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877380yxE {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static final void LIZ() {
        Object c098200Yq;
        if (LIZ.compareAndSet(false, true)) {
            LIZIZ(C2214151BlF.class);
            LIZIZ(C1870620ymK.class);
            LIZIZ(C1874650ysp.class);
            LIZIZ(C1871240ynK.class);
            LIZIZ(C1871880yoM.class);
            LIZIZ(C1870790ymb.class);
            LIZIZ(C1870730ymV.class);
            LIZIZ(C1870840ymg.class);
            LIZIZ(C1324250kZ5.class);
            LIZIZ(C1871780yoC.class);
            LIZIZ(C1877420yxI.class);
            LIZIZ(C1872050yod.class);
            LIZIZ(C1872340yp6.class);
            LIZIZ(C1872370yp9.class);
            LIZIZ(C1871740yo8.class);
            LIZIZ(C1890130zHn.class);
            try {
                final InterfaceC1063710dmr interfaceC1063710dmr = (InterfaceC1063710dmr) C1533960q1K.class.newInstance();
                Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
                ((HashSet) C1542450qF1.LIZ).add(new C1BP1(interfaceC1063710dmr.getName(), new InterfaceC1537230q6b() { // from class: X.0yxG
                    @Override // X.InterfaceC1537230q6b
                    public final Object create() {
                        return new C1BPH(interfaceC1063710dmr);
                    }

                    @Override // X.InterfaceC1537230q6b
                    public final Object LIZ(Object obj) {
                        return create();
                    }
                }));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public static void LIZIZ(Class cls) {
        Object c098200Yq;
        try {
            final InterfaceC1063690dmp interfaceC1063690dmp = (InterfaceC1063690dmp) cls.newInstance();
            Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
            ((HashSet) C1542450qF1.LIZ).add(new C1BP1(interfaceC1063690dmp.getName(), new InterfaceC1537230q6b() { // from class: X.0yxF
                @Override // X.InterfaceC1537230q6b
                public final Object create() {
                    return new C2204221BOq(interfaceC1063690dmp);
                }

                @Override // X.InterfaceC1537230q6b
                public final Object LIZ(Object obj) {
                    return create();
                }
            }));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
