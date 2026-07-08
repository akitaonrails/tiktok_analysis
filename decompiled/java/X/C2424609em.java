package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.09em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2424609em implements C1BLY {
    public static final long LJIILJJIL = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int LJIILL = 0;
    public final BPEAHandler LIZ;
    public final Context LIZIZ;
    public final C08TE LIZJ;
    public final InterfaceC2425909ez LIZLLL;
    public final C2424709en LJ;
    public final C2424909ep LJFF;
    public final C2424909ep LJI;
    public final Executor LJII;
    public final EnumC2121908Sz LJIIIIZZ;
    public final File LJIIIZ;
    public final AtomicReference LJIIJ;
    public final Set LJIIJJI;
    public final Set LJIIL;
    public final AtomicBoolean LJIILIIL;

    @Override // X.C1BLY
    public final boolean LJ(AbstractC2457909k9 abstractC2457909k9, Activity activity) {
        return false;
    }

    @Override // X.C1BLY
    public final void LIZ() {
        C2458209kC c2458209kC = C2458209kC.LIZ;
        C2424909ep c2424909ep = this.LJI;
        synchronized (c2424909ep) {
            ((HashSet) c2424909ep.LIZ).add(c2458209kC);
        }
    }

    @Override // X.C1BLY
    public final Set<String> LJFF() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.LIZJ.LIZIZ());
        hashSet.addAll(this.LJIIJJI);
        return hashSet;
    }

    @Override // X.C1BLY
    public final Set<String> LJI() {
        HashSet hashSet = new HashSet();
        if (this.LIZJ.LIZJ() != null) {
            hashSet.addAll(this.LIZJ.LIZJ());
        }
        hashSet.addAll(this.LJIIL);
        return hashSet;
    }

    public final C1961407mG LJIIIZ() {
        try {
            C1961407mG c1961407mGLIZ = this.LIZJ.LIZ(C786410Ut5.Y3(this.LIZIZ.getPackageManager(), this.LIZIZ.getPackageName(), 128).applicationInfo.metaData);
            if (c1961407mGLIZ != null) {
                return c1961407mGLIZ;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0262: INVOKE (r0 I:X.0Wq5) = (r2 I:X.09em), (r0 I:int) VIRTUAL call: X.09em.LJIIIIZZ(int):X.0Wq5 A[MD:(int):X.0Wq5 (m)] (LINE:16777826), block:B:74:0x0253 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.09em] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09em] */
    @Override // X.C1BLY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC835450Wpz<java.lang.Integer> LIZIZ(final X.C2459809kS r20) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2424609em.LIZIZ(X.09kS):X.0Wpz");
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LIZJ(List<String> list) {
        return C835460Wq0.LIZLLL(new C812870Vuf(-5));
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LIZLLL(final int i) {
        try {
            AbstractC2457909k9 abstractC2457909k9LJIIJ = LJIIJ(new InterfaceC2425509ev() { // from class: X.09es
                @Override // X.InterfaceC2425509ev
                public final AbstractC2457909k9 LIZ(final AbstractC2457909k9 abstractC2457909k9) {
                    final int i2 = i;
                    return (AbstractC2457909k9) C08KR.zzc(new Callable() { // from class: X.09ex
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws C812870Vuf {
                            int iLJII;
                            C1C7U.LIZ("zzo@4296.call");
                            AbstractC2457909k9 abstractC2457909k92 = abstractC2457909k9;
                            int i3 = i2;
                            if (abstractC2457909k92 == null || i3 != abstractC2457909k92.LJI() || ((iLJII = abstractC2457909k92.LJII()) != 1 && iLJII != 2 && iLJII != 8 && iLJII != 9 && iLJII != 7)) {
                                throw new C812870Vuf(-3);
                            }
                            C2458109kB c2458109kBLIZIZ = AbstractC2457909k9.LIZIZ(i3, 7, abstractC2457909k92.LIZJ(), abstractC2457909k92.LIZ(), abstractC2457909k92.LJIIIIZZ(), abstractC2457909k92.LJ(), abstractC2457909k92.LIZLLL());
                            C1C7U.LIZIZ("zzo@4296.call");
                            return c2458109kBLIZIZ;
                        }
                    });
                }
            });
            if (abstractC2457909k9LJIIJ != null) {
                C786410Ut5.LJJZZIII(this.LIZ, new RunnableC2424809eo(this, abstractC2457909k9LJIIJ));
            }
            return C835460Wq0.LJ(null);
        } catch (C08KR e) {
            TryCatchGuardChecker.doCheck(e);
            return C835460Wq0.LIZLLL(e.zzb(C812870Vuf.class));
        }
    }

    @Override // X.C1BLY
    public final AbstractC835450Wpz<Void> LJII(List<String> list) {
        return C835460Wq0.LIZLLL(new C812870Vuf(-5));
    }

    public final C835510Wq5 LJIIIIZZ(final int i) {
        LJIIJ(new InterfaceC2425509ev() { // from class: X.09ey
            @Override // X.InterfaceC2425509ev
            public final AbstractC2457909k9 LIZ(AbstractC2457909k9 abstractC2457909k9) {
                int i2 = i;
                if (abstractC2457909k9 == null) {
                    return null;
                }
                return AbstractC2457909k9.LIZIZ(abstractC2457909k9.LJI(), 6, i2, abstractC2457909k9.LIZ(), abstractC2457909k9.LJIIIIZZ(), abstractC2457909k9.LJ(), abstractC2457909k9.LIZLLL());
            }
        });
        return C835460Wq0.LIZLLL(new C812870Vuf(i));
    }

    public final synchronized AbstractC2457909k9 LJIIJ(InterfaceC2425509ev interfaceC2425509ev) {
        AbstractC2457909k9 abstractC2457909k9 = (AbstractC2457909k9) this.LJIIJ.get();
        AbstractC2457909k9 abstractC2457909k9LIZ = interfaceC2425509ev.LIZ(abstractC2457909k9);
        AtomicReference atomicReference = this.LJIIJ;
        while (!atomicReference.compareAndSet(abstractC2457909k9, abstractC2457909k9LIZ)) {
            if (atomicReference.get() != abstractC2457909k9 && atomicReference.get() != abstractC2457909k9) {
                return null;
            }
        }
        return abstractC2457909k9LIZ;
    }

    public C2424609em(Context context, File file, C08TE c08te, InterfaceC2425909ez interfaceC2425909ez) {
        Executor executorLIZIZ = C08UU.LIZIZ();
        C2424709en c2424709en = new C2424709en(context);
        this.LIZ = new BPEAHandler(Looper.getMainLooper());
        this.LJIIJ = new AtomicReference();
        this.LJIIJJI = Collections.synchronizedSet(new HashSet());
        this.LJIIL = Collections.synchronizedSet(new HashSet());
        this.LJIILIIL = new AtomicBoolean(false);
        this.LIZIZ = context;
        this.LJIIIZ = file;
        this.LIZJ = c08te;
        this.LIZLLL = interfaceC2425909ez;
        this.LJII = executorLIZIZ;
        this.LJ = c2424709en;
        this.LJI = new C2424909ep();
        this.LJFF = new C2424909ep();
        this.LJIIIIZZ = EnumC2121908Sz.zza;
    }

    public final boolean LJIIJJI(final int i, final int i2, final Integer num, final Long l, final Long l2, final List list, final List list2) {
        AbstractC2457909k9 abstractC2457909k9LJIIJ = LJIIJ(new InterfaceC2425509ev() { // from class: X.09ew
            @Override // X.InterfaceC2425509ev
            public final AbstractC2457909k9 LIZ(AbstractC2457909k9 abstractC2457909k9) {
                int iIntValue;
                long jLongValue;
                long jLongValue2;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List<String> listLJ = list;
                List<String> listLIZLLL = list2;
                if (abstractC2457909k9 == null) {
                    abstractC2457909k9 = AbstractC2457909k9.LIZIZ(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                if (num2 == null) {
                    iIntValue = abstractC2457909k9.LJI();
                } else {
                    iIntValue = num2.intValue();
                }
                if (l3 == null) {
                    jLongValue = abstractC2457909k9.LIZ();
                } else {
                    jLongValue = l3.longValue();
                }
                if (l4 == null) {
                    jLongValue2 = abstractC2457909k9.LJIIIIZZ();
                } else {
                    jLongValue2 = l4.longValue();
                }
                if (listLJ == null) {
                    listLJ = abstractC2457909k9.LJ();
                }
                if (listLIZLLL == null) {
                    listLIZLLL = abstractC2457909k9.LIZLLL();
                }
                return AbstractC2457909k9.LIZIZ(iIntValue, i3, i4, jLongValue, jLongValue2, listLJ, listLIZLLL);
            }
        });
        if (abstractC2457909k9LJIIJ != null) {
            C786410Ut5.LJJZZIII(this.LIZ, new RunnableC2424809eo(this, abstractC2457909k9LJIIJ));
            return true;
        }
        return false;
    }
}
