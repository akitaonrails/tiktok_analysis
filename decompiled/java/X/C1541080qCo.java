package X;

import X.InterfaceC1541240qD4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541080qCo<Output extends InterfaceC1541240qD4> extends AbstractC1541140qCu<Output> implements InterfaceC1166350gSP, InterfaceC1541360qDG {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final Long LJI;
    public Function1<? super Output, Unit> LJII;
    public final C1541070qCn<?, Output> LJIIIIZZ;
    public volatile AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> LJIIIZ;
    public final boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public final C08AB LJIIL;
    public volatile Integer LJIILIIL;
    public volatile C1541160qCw<?> LJIILJJIL;
    public volatile WeakReference<?> LJIILL;
    public final C1541190qCz LJIILLIIL;

    public final C1540860qCS LJIIJ() {
        return this.LIZ.LIZ();
    }

    public final String LJIIJJI() {
        Integer num = this.LJIILIIL;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == -2) {
            return "failure_retry";
        }
        if (iIntValue == -1) {
            return "timeout";
        }
        if (iIntValue == 0) {
            return "hit_request";
        }
        if (iIntValue == 1) {
            return "hit_cache";
        }
        return null;
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean cancel() {
        return LJII(EnumC1541150qCv.EXPLICIT_RELEASE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00cf A[EDGE_INSN: B:102:0x00cf->B:22:0x00cf BREAK  A[LOOP:0: B:15:0x00ad->B:96:0x028d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0qCx] */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, Y.AObjectS397S0100000_23] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, Y.AObjectS397S0100000_23] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // X.InterfaceC1541360qDG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute() {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541080qCo.execute():void");
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean isValid() {
        return this.LJIILLIIL.LIZ.get() >= 0;
    }

    public final void LJIILIIL() {
        Object c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJIILLIIL.LIZLLL(1, 2)) {
            this.LJIIL.LJ(jCurrentTimeMillis, "executing");
            if (!Intrinsics.LJFF(this.LJIIIIZZ.LIZ, "resource")) {
                AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = this.LJIIIZ;
                if (abstractC1541130qCt != null) {
                    abstractC1541130qCt.execute();
                    return;
                }
                return;
            }
            try {
                AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt2 = this.LJIIIZ;
                if (abstractC1541130qCt2 != null) {
                    abstractC1541130qCt2.execute();
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1532930pzf c1532930pzf = C1532930pzf.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error occurs when execute on ");
                sbLIZ.append(this.LJIIIIZZ.LIZ);
                C1532760pzO.LIZIZ(c1532930pzf, "FetchTask", "realExecute", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl, null, 32);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = this.LJIIIZ;
        if (abstractC1541130qCt == null || !abstractC1541130qCt.LIZ(c1540930qCZ)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1541140qCu, X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = this.LJIIIZ;
        if (abstractC1541130qCt == null || !abstractC1541130qCt.LIZJ(c1540930qCZ)) {
            return false;
        }
        return true;
    }

    public final boolean LJII(EnumC1541150qCv enumC1541150qCv) {
        Object c098200Yq;
        C1535940q4W c1535940q4W = this.LIZ.LIZJ;
        if (c1535940q4W != null) {
            c1535940q4W.LJ = EnumC1533170q03.REMOVE_ON_CONSUME;
        }
        boolean z = false;
        if (!this.LJIILLIIL.LIZ(0)) {
            return false;
        }
        this.LJIIL.LIZ();
        this.LJIIIIZZ.LJIIJJI.LIZJ(this.LIZ, this, enumC1541150qCv);
        try {
            AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = this.LJIIIZ;
            if (abstractC1541130qCt != null && !abstractC1541130qCt.LIZIZ()) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(!z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
    }

    public final void LJIIIIZZ(EnumC1541150qCv enumC1541150qCv) {
        Boolean boolValueOf;
        if (this.LJIILLIIL.LIZ(1)) {
            this.LJIIL.LIZ();
            this.LJIIIIZZ.LJIIJJI.LIZJ(this.LIZ, this, enumC1541150qCv);
            try {
                AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = this.LJIIIZ;
                if (abstractC1541130qCt != null) {
                    boolValueOf = Boolean.valueOf(abstractC1541130qCt.LIZIZ());
                } else {
                    boolValueOf = null;
                }
                C189200o6.m2constructorimpl(boolValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIIZ(EnumC1541150qCv enumC1541150qCv) {
        this.LJIIIIZZ.LJIIJJI.LIZJ(this.LIZ, this, enumC1541150qCv);
    }

    public final boolean LJIIL(C1541080qCo<Output> c1541080qCo) {
        int i;
        if (this == c1541080qCo) {
            C1532760pzO.LIZJ(C1532930pzf.LIZJ, "FetchTask", "onReuse", "self reuse", null, null, 48);
            return false;
        }
        C1541190qCz c1541190qCz = this.LJIILLIIL;
        do {
            i = c1541190qCz.LIZ.get();
            if (i < 0) {
                return false;
            }
        } while (!c1541190qCz.LIZ.compareAndSet(i, i + 1));
        AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = c1541080qCo.LJIIIZ;
        if ((abstractC1541130qCt instanceof AbstractC1541130qCt) && abstractC1541130qCt != null) {
            c1541080qCo.LJIIL.LIZJ("reusing");
            c1541080qCo.LIZ.LJI = this.LIZ.LIZIZ;
            AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt2 = this.LJIIIZ;
            if ((abstractC1541130qCt2 instanceof AbstractC1541130qCt) && abstractC1541130qCt2 != null) {
                boolean zLJ = abstractC1541130qCt2.LJ(abstractC1541130qCt);
                if (!zLJ) {
                    c1541080qCo.LIZ.LJI = null;
                    if (this.LIZ.LIZ && !this.LJIIIIZZ.LJI) {
                        LJIIIIZZ(EnumC1541150qCv.CANCELLED_REUSE_FAILED);
                        return zLJ;
                    }
                    C1541190qCz.LIZIZ(this.LJIILLIIL);
                    return zLJ;
                }
                this.LJ = Long.valueOf(System.currentTimeMillis());
                this.LJFF++;
                return zLJ;
            }
            c1541080qCo.LIZ.LJI = null;
            AtomicBoolean atomicBoolean = this.LIZ.LJII;
            if (atomicBoolean != null && atomicBoolean.get()) {
                return false;
            }
            C1532760pzO.LIZJ(C1532930pzf.LIZJ, "FetchTask", "onReuse", "requestOperation is null", null, null, 48);
            return false;
        }
        C1532760pzO.LIZJ(C1532930pzf.LIZJ, "FetchTask", "onReuse", "other requestOperation is null", null, null, 48);
        return false;
    }

    public final void LJIILJJIL(int i) {
        this.LJIIL.LIZ();
        C1541190qCz c1541190qCz = this.LJIILLIIL;
        if (i < 0) {
            c1541190qCz.LIZ.getAndSet(i);
        } else {
            c1541190qCz.getClass();
            throw new IllegalArgumentException("Failure status must be a negative number.");
        }
    }

    public final void LJIILL(Boolean bool, EnumC1541150qCv enumC1541150qCv) {
        C1540930qCZ c1540930qCZ = this.LIZ;
        C1535940q4W c1535940q4W = c1540930qCZ.LIZJ;
        if (c1535940q4W == null) {
            return;
        }
        if (c1540930qCZ.LIZ && Intrinsics.LJFF(bool, Boolean.FALSE) && c1535940q4W.LJ == EnumC1533170q03.REMOVE_ON_CONSUME) {
            this.LJIIIIZZ.LJIIJJI.LIZJ(this.LIZ, this, enumC1541150qCv);
            this.LJIILLIIL.LIZJ(251);
        } else {
            if (!C1541190qCz.LIZIZ(this.LJIILLIIL)) {
                return;
            }
            this.LJIIIIZZ.LJIIJJI.LIZJ(this.LIZ, this, enumC1541150qCv);
        }
    }

    public C1541080qCo(Long l, Function1<? super Output, Unit> function1, C1541070qCn<?, Output> c1541070qCn, C1540930qCZ c1540930qCZ) {
        EnumC1533170q03 enumC1533170q03;
        boolean z;
        C08AB c08ab;
        super(c1540930qCZ);
        this.LJI = l;
        this.LJII = function1;
        this.LJIIIIZZ = c1541070qCn;
        C1535940q4W c1535940q4W = c1540930qCZ.LIZJ;
        if (c1535940q4W != null) {
            enumC1533170q03 = c1535940q4W.LJ;
        } else {
            enumC1533170q03 = null;
        }
        if (enumC1533170q03 == EnumC1533170q03.KEEP_ALIVE) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJ = z;
        this.LJIIL = (c1535940q4W == null || (c08ab = c1535940q4W.LJI) == null) ? new C08AB() : c08ab;
        this.LJIILLIIL = new C1541190qCz();
    }
}
