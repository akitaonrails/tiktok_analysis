package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS14S0301000_23;
import Y.ARunnableS1S0200200_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.q;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS13S0101100_23;
import kotlin.jvm.internal.AwS267S0300000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS44S0200100_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516150pYb implements InterfaceC644200POo<Object> {
    public final ExecutorService LIZ;
    public final ExecutorService LIZIZ;
    public final ScheduledExecutorService LIZJ;
    public final INetworkChunk LIZLLL;
    public final AtomicBoolean LJ;
    public final HashMap<Integer, C1516130pYZ<Object>> LJFF;
    public final HashMap<String, Boolean> LJI;
    public final AtomicInteger LJII;
    public int LJIIIIZZ;
    public final AtomicInteger LJIIIZ;
    public boolean LJIIJ;
    public Long LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final List<C2345709Hb> LJIILLIIL;
    public final /* synthetic */ C1516040pYQ<Object> LJIIZILJ;
    public final /* synthetic */ C1515820pY4<byte[]> LJIJ;
    public final /* synthetic */ InterfaceC1515570pXf<? super byte[], Object> LJIJI;

    @Override // X.InterfaceC644200POo
    public final void LIZ(final C0POE<Object> c0poe) {
        final C1515820pY4<byte[]> c1515820pY4 = this.LJIJ;
        c1515820pY4.LIZLLL(new C0POE<byte[]>() { // from class: X.0pYd
            @Override // X.C0POE
            public final void onComplete() {
                C1516150pYb c1516150pYb = this.LIZ;
                c1516150pYb.LIZJ(new AwS424S0200000_23(c1516150pYb, (C1516150pYb) c0poe, (C0POE<Object>) 38));
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                this.LIZ.LJII(new AwS424S0200000_23((C0POE) c0poe, th, (Throwable) 39));
            }

            @Override // X.C0POE
            public final void onNext(byte[] bArr) {
                byte[] bArr2 = bArr;
                int andIncrement = this.LIZ.LJII.getAndIncrement();
                this.LIZ.LJIIIZ.incrementAndGet();
                new AwS13S0101100_23(c1515820pY4, andIncrement, System.currentTimeMillis(), 1);
                C034X.LIZIZ();
                try {
                    C1516150pYb c1516150pYb = this.LIZ;
                    c1516150pYb.LIZIZ.submit(new ARunnableS14S0301000_23(c1516150pYb, bArr2, c0poe, andIncrement, 3));
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LJFF(andIncrement, bArr2, c0poe);
                }
            }
        });
    }

    public final void LIZJ(Function0<Unit> function0) {
        if (this.LJ.get()) {
            return;
        }
        try {
            this.LIZ.submit(new ARunnableS116S0100000_16(function0, (Function0<Unit>) 255));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(C0POE<Object> c0poe) {
        EnumC1516210pYh enumC1516210pYh;
        int i;
        if (this.LJ.get()) {
            return;
        }
        INetworkChunk iNetworkChunk = this.LIZLLL;
        if (iNetworkChunk != null) {
            iNetworkChunk.LIZIZ();
        }
        while (true) {
            try {
                C1516130pYZ<Object> c1516130pYZ = this.LJFF.get(Integer.valueOf(this.LJIIIIZZ));
                if (c1516130pYZ != null) {
                    if (c1516130pYZ.LJ) {
                        this.LJIIIIZZ++;
                    } else {
                        C1516060pYS c1516060pYS = c1516130pYZ.LIZLLL;
                        if (c1516060pYS != null && (enumC1516210pYh = c1516060pYS.LIZIZ) != null && (i = C1516220pYi.LIZ[enumC1516210pYh.ordinal()]) != -1 && i != 1) {
                            if (i == 2) {
                                int iOrdinal = c1516130pYZ.LJFF.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        if (iOrdinal != 2 && iOrdinal != 3) {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        new AwS267S0300000_23((C1515820pY4) this.LJIJ, (C1515820pY4<byte[]>) c1516130pYZ, (C1516130pYZ<Object>) this.LJIIZILJ, (C1516040pYQ<Object>) 7);
                                        C034X.LIZIZ();
                                        INetworkChunk iNetworkChunk2 = this.LIZLLL;
                                        if (iNetworkChunk2 != null) {
                                            iNetworkChunk2.LIZ();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        }
                        LIZIZ(this.LJIIIIZZ, c0poe, "ordered");
                        this.LJIIIIZZ++;
                    }
                } else {
                    INetworkChunk iNetworkChunk3 = this.LIZLLL;
                    if (iNetworkChunk3 != null) {
                        iNetworkChunk3.LIZ();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                INetworkChunk iNetworkChunk4 = this.LIZLLL;
                if (iNetworkChunk4 != null) {
                    iNetworkChunk4.LIZ();
                }
                throw th;
            }
        }
    }

    public final void LJI(C0POE<Object> c0poe) {
        Comparable comparable;
        C08LX c08lx = new C08LX(new C08LY(C09RB.LJIIIZ(new C1939607ik(this.LJFF.values()), AFwS263S0000000_23.get$arr$(52)), AFwS263S0000000_23.get$arr$(53)));
        if (!c08lx.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) c08lx.next();
            while (c08lx.hasNext()) {
                Comparable comparable2 = (Comparable) c08lx.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Long l = (Long) comparable;
        if (l == null) {
            this.LJIIJJI = null;
            this.LJIIL++;
            return;
        }
        Long l2 = this.LJIIJJI;
        if (l2 != null && l2.longValue() <= l.longValue()) {
            return;
        }
        this.LJIIJJI = l;
        long j = this.LJIIL + 1;
        this.LJIIL = j;
        new AwS44S0200100_23((C1515820pY4) this.LJIJ, (C1515820pY4<byte[]>) l, (Long) j, 2L);
        C034X.LIZIZ();
        long jLongValue = l.longValue() - System.currentTimeMillis();
        long jLongValue2 = l.longValue();
        ScheduledExecutorService scheduledExecutorService = this.LIZJ;
        ARunnableS1S0200200_23 aRunnableS1S0200200_23 = new ARunnableS1S0200200_23(this, c0poe, j, jLongValue2, 2);
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        scheduledExecutorService.schedule(aRunnableS1S0200200_23, jLongValue, TimeUnit.MILLISECONDS);
    }

    public final void LJII(Function0<Unit> function0) {
        if (!this.LJ.compareAndSet(false, true)) {
            return;
        }
        try {
            this.LIZ.submit(new ARunnableS92S0200000_23(this, function0, 128));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                function0.invoke();
                this.LIZJ.shutdown();
                this.LIZIZ.shutdown();
                this.LIZ.shutdown();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.shutdown();
                this.LIZIZ.shutdown();
                this.LIZ.shutdown();
                throw th;
            }
        }
    }

    public final void LJIIIIZZ(C0POE<Object> c0poe) {
        if (!this.LJ.get() && this.LJIIJ && this.LJIIIZ.get() == 0) {
            Collection<C1516130pYZ<Object>> collectionValues = this.LJFF.values();
            if (!collectionValues.isEmpty()) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (!((C1516130pYZ) it2.next()).LJ) {
                        return;
                    }
                }
            }
            new AwS424S0200000_23((C1515820pY4) this.LJIJ, (C1515820pY4<byte[]>) this, (C1516150pYb) 42);
            C034X.LIZIZ();
            LJII(new AwS567S0100000_23(c0poe, 206));
        }
    }

    public static boolean LJ(k kVar, k kVar2) {
        if (kVar2 != null) {
            if (kVar == kVar2) {
                return true;
            }
            if ((kVar instanceof q) && (kVar2 instanceof q)) {
                q qVarLJIILJJIL = kVar.LJIILJJIL();
                q qVarLJIILJJIL2 = kVar2.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if ((obj instanceof Boolean) && (qVarLJIILJJIL2.LL instanceof Boolean)) {
                    if (qVarLJIILJJIL.LJ() != qVarLJIILJJIL2.LJ()) {
                        return false;
                    }
                } else if ((obj instanceof Number) && (qVarLJIILJJIL2.LL instanceof Number)) {
                    if (qVarLJIILJJIL.LJJIFFI().compareTo(qVarLJIILJJIL2.LJJIFFI()) != 0) {
                        return false;
                    }
                } else {
                    if (!(obj instanceof String) && !(qVarLJIILJJIL2.LL instanceof String)) {
                        return Intrinsics.LJFF(qVarLJIILJJIL, qVarLJIILJJIL2);
                    }
                    return Intrinsics.LJFF(qVarLJIILJJIL.LJIL(), qVarLJIILJJIL2.LJIL());
                }
                return true;
            }
            if (Intrinsics.LJFF(kVar.getClass(), kVar2.getClass())) {
                return Intrinsics.LJFF(kVar, kVar2);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1516150pYb(X.C1516040pYQ r12, X.C1515820pY4 r13, X.C1516030pYP r14) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516150pYb.<init>(X.0pYQ, X.0pY4, X.0pYP):void");
    }

    public final void LIZIZ(int i, C0POE<Object> c0poe, String str) {
        EnumC1516210pYh enumC1516210pYh;
        C1516130pYZ<Object> c1516130pYZ = this.LJFF.get(Integer.valueOf(i));
        if (c1516130pYZ == null || c1516130pYZ.LJ) {
            return;
        }
        AbstractC1516230pYj<Object> abstractC1516230pYj = c1516130pYZ.LIZIZ;
        if (abstractC1516230pYj instanceof C1516200pYg) {
            LJII(new AwS424S0200000_23((C0POE) c0poe, (C0POE<Object>) abstractC1516230pYj, (AbstractC1516230pYj<Object>) 40));
            return;
        }
        if (abstractC1516230pYj instanceof C1516180pYe) {
            try {
                c0poe.onNext(((C1516180pYe) abstractC1516230pYj).LIZ);
                c1516130pYZ.LJ = true;
                C1516060pYS c1516060pYS = c1516130pYZ.LIZLLL;
                if (c1516060pYS != null) {
                    enumC1516210pYh = c1516060pYS.LIZIZ;
                } else {
                    enumC1516210pYh = null;
                }
                if (enumC1516210pYh == EnumC1516210pYh.LLILLJJLI) {
                    this.LJIILL++;
                }
                new C1516120pYY(this.LJIJ, i, str, this.LJIIZILJ, c1516130pYZ);
                C034X.LIZIZ();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJII(new AwS424S0200000_23((C0POE) c0poe, th, (Throwable) 41));
                return;
            }
        }
        throw new C1954807lC();
    }

    public final void LJFF(int i, byte[] bArr, C0POE<Object> c0poe) {
        AbstractC1516230pYj c1516200pYg;
        try {
            c1516200pYg = new C1516180pYe(this.LJIJI.apply(bArr));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1516200pYg = new C1516200pYg(th);
        }
        LIZJ(new C1516140pYa(this, i, c1516200pYg, System.currentTimeMillis(), c0poe));
    }
}
