package X;

import Y.AObjectS386S0100000_11;
import Y.AObjectS64S0000000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703290RiJ {
    public static final /* synthetic */ int LJIIJ = 0;
    public final Function0<Long> LIZ;
    public final Function2<String, String, Unit> LIZIZ;
    public final C1451205mA LIZJ;
    public final C054G LIZLLL;
    public final C099V LJ;
    public final Map<String, C09AE> LJFF;
    public final Map<String, List<C703450RiZ>> LJI;
    public final C703020Rhs LJII;
    public final C703270RiH LJIIIIZZ;
    public final C01GW LJIIIZ;

    public C703290RiJ() {
        this(C0PEM.LIZ, new AObjectS64S0000000_11(6), C702930Rhj.LL, EnumC703530Rih.ASYNC);
    }

    public final void LIZ() {
        LIZIZ(((LinkedHashMap) this.LJFF).keySet());
    }

    public final InterfaceC1449905lx<C702990Rhp> LJI() {
        return (InterfaceC1449905lx) this.LJIIIZ.getValue();
    }

    public final void LIZIZ(Collection<String> collection) {
        List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(C13LP.LLIIJI(collection)));
        if (listLJLLJ.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearPendingForSlotsLocked, slotIds=");
        sbLIZ.append(listLJLLJ);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        for (Object obj : listLJLLJ) {
            C09AE c09aeRemove = this.LJFF.remove(obj);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            this.LJI.remove(obj);
        }
        LIZLLL(new C1233104s5(C13LP.LLIIJI(listLJLLJ)));
    }

    public final void LIZLLL(InterfaceC702960Rhm interfaceC702960Rhm) {
        LJI().LIZ().invoke(interfaceC702960Rhm);
    }

    public final C703110Ri1 LJII(String str) {
        C702990Rhp state = LJI().getState();
        C702940Rhk c702940RhkLIZJ = state.LIZIZ;
        if (c702940RhkLIZJ == null) {
            c702940RhkLIZJ = this.LJII.LIZJ();
        }
        return new C703110Ri1(state, c702940RhkLIZJ, c702940RhkLIZJ.LIZIZ.get(str));
    }

    public final <T> T LJIIIIZZ(Function0<? extends T> function0) {
        T tInvoke;
        synchronized (this.LIZJ.LIZ) {
            try {
                tInvoke = function0.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }

    public final void LJIIIZ(String str, String str2) {
        boolean z;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LIZIZ.invoke("SlotStrategyCore", str);
            return;
        }
        Function2<String, String, Unit> function2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[uniqueId=");
        sbLIZ.append(str2);
        sbLIZ.append("] ");
        sbLIZ.append(str);
        function2.invoke("SlotStrategyCore", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C703290RiJ(CoroutineContext coroutineContext, Function0<Long> function0, Function2<? super String, ? super String, Unit> function2, EnumC703530Rih enumC703530Rih) {
        C099V c099v;
        this.LIZ = function0;
        this.LIZIZ = function2;
        this.LIZJ = new C1451205mA();
        this.LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), coroutineContext));
        int i = C703520Rig.LIZ[enumC703530Rih.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c099v = C099V.UNDISPATCHED;
            } else {
                throw new C1954807lC();
            }
        } else {
            c099v = C099V.DEFAULT;
        }
        this.LJ = c099v;
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LJII = new C703020Rhs();
        this.LJIIIIZZ = new C703270RiH();
        this.LJIIIZ = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:11:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(long r18, java.lang.String r20, java.lang.String r21, java.util.List r22, X.InterfaceC1364105Vn r23) {
        /*
            r17 = this;
            r3 = r23
            r9 = r20
            r13 = r21
            r7 = r18
            boolean r0 = r3 instanceof X.C703390RiT
            r6 = r17
            if (r0 == 0) goto L85
            r14 = r3
            X.0RiT r14 = (X.C703390RiT) r14
            int r2 = r14.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r14.LLJI = r2
        L1c:
            java.lang.Object r5 = r14.LLIZLLLIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r14.LLJI
            r3 = 1
            if (r0 == 0) goto L77
            if (r0 != r3) goto L97
            int r10 = r14.LLIZ
            long r7 = r14.LL
            X.013C r3 = r14.LLILZLL
            java.lang.Object r2 = r14.LLILZIL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.013C r1 = r14.LLILZ
            java.lang.Object r13 = r14.LLILLL
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r9 = r14.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r5)
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            r3.element = r0
            r3 = 1
        L49:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r11 = r2.next()
            int r0 = r10 + 1
            if (r10 < 0) goto L8b
            X.0RiV r11 = (X.C703410RiV) r11
            boolean r12 = r1.element
            r14.LLILLJJLI = r9
            r14.LLILLL = r13
            r14.LLILZ = r1
            r14.LLILZIL = r2
            r14.LLILZLL = r1
            r14.LL = r7
            r14.LLIZ = r0
            r14.LLJI = r3
            r15 = r7
            java.lang.Object r5 = r6.LJ(r7, r9, r10, r11, r12, r13, r14)
            if (r5 != r4) goto L73
            return r4
        L73:
            r3 = r1
            r10 = r0
            r7 = r15
            goto L40
        L77:
            X.C155000ia.LIZIZ(r5)
            X.013C r1 = new X.013C
            r1.<init>()
            java.util.Iterator r2 = r22.iterator()
            r10 = 0
            goto L49
        L85:
            X.0RiT r14 = new X.0RiT
            r14.<init>(r6, r3)
            goto L1c
        L8b:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L90:
            boolean r0 = r1.element
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C703290RiJ.LJFF(long, java.lang.String, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008d -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r7, java.lang.String r9, int r10, X.C703410RiV r11, long r12, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r6 = this;
            boolean r0 = r15 instanceof X.C703380RiS
            if (r0 == 0) goto L94
            r4 = r15
            X.0RiS r4 = (X.C703380RiS) r4
            int r2 = r4.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.LLJI = r2
        L12:
            java.lang.Object r2 = r4.LLIZLLLIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLJI
            r3 = 1
            if (r0 == 0) goto L90
            if (r0 != r3) goto L9e
            long r0 = r4.LLILLL
            long r12 = r4.LLILLJJLI
            int r10 = r4.LLIZ
            long r7 = r4.LL
            java.lang.Object r14 = r4.LLILZLL
            X.0RiV r11 = r4.LLILZIL
            java.lang.Object r9 = r4.LLILZ
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r2)
        L32:
            long r12 = r12 - r0
            X.0Rib r1 = new X.0Rib
            r1.<init>(r6)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "executeStrategy delay tick, executeId="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = ", slotId="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = ", operationIndex="
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = ", actionType="
            r2.append(r0)
            X.0Ri9 r0 = r11.LIZIZ
            r2.append(r0)
            java.lang.String r0 = ", remainingMs="
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r1.invoke(r0, r14)
        L6d:
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9b
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = java.lang.Math.min(r12, r0)
            r4.LLILZ = r9
            r4.LLILZIL = r11
            r4.LLILZLL = r14
            r4.LL = r7
            r4.LLIZ = r10
            r4.LLILLJJLI = r12
            r4.LLILLL = r0
            r4.LLJI = r3
            java.lang.Object r2 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r2 != r5) goto L32
            return r5
        L90:
            X.C155000ia.LIZIZ(r2)
            goto L6d
        L94:
            X.0RiS r4 = new X.0RiS
            r4.<init>(r6, r15)
            goto L12
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C703290RiJ.LIZJ(long, java.lang.String, int, X.0RiV, long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(long r29, java.lang.String r31, int r32, X.C703410RiV r33, boolean r34, java.lang.String r35, X.InterfaceC1364105Vn<? super java.lang.Boolean> r36) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C703290RiJ.LJ(long, java.lang.String, int, X.0RiV, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
