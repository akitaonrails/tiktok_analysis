package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Np3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605550Np3 implements InterfaceC605380Nom {
    public final C0OI4 LIZ;
    public final C605530Np1 LIZIZ;
    public final long LIZJ;
    public final C23119094b LIZLLL;
    public final C054G LJ;
    public final ConcurrentHashMap<String, AbstractC605390Non> LJFF;
    public final ConcurrentHashMap<String, InterfaceC332260D0u<EnumC605580Np6>> LJI;
    public final ConcurrentHashMap<String, C09AE> LJII;
    public final ConcurrentHashMap<String, C605640NpC> LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LIZIZ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LIZLLL.LIZIZ(null);
        this.LJII.clear();
        this.LJI.clear();
        this.LJIIIIZZ.clear();
        C605530Np1 c605530Np1 = this.LIZIZ;
        for (C605540Np2 c605540Np2 : c605530Np1.LIZ.values()) {
            synchronized (c605540Np2) {
                try {
                    c605540Np2.LIZ.LIZIZ();
                    c605540Np2.LIZIZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c605530Np1.LIZ.clear();
        C0OPX.LJII("BBArch [SignalHub] disposed");
        this.LJFF.clear();
        C0OPX.LJII("BBArch [Scheduler] disposed");
    }

    @Override // X.InterfaceC605380Nom
    public final C638950P4j LIZ(String str) {
        C605540Np2 c605540Np2PutIfAbsent;
        ConcurrentHashMap<String, C605540Np2> concurrentHashMap = this.LIZIZ.LIZ;
        C605540Np2 c605540Np2 = concurrentHashMap.get(str);
        if (c605540Np2 == null && (c605540Np2PutIfAbsent = concurrentHashMap.putIfAbsent(str, (c605540Np2 = new C605540Np2()))) != null) {
            c605540Np2 = c605540Np2PutIfAbsent;
        }
        return new C638950P4j(c605540Np2.LIZ, 3);
    }

    public final void LIZLLL(AbstractC605390Non abstractC605390Non) {
        boolean z = true;
        if (!this.LJIIIZ) {
            if (this.LJFF.containsKey(abstractC605390Non.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BBArch [Scheduler] duplicate submit ignored: ");
                sbLIZ.append(abstractC605390Non.LIZ);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.LJFF.put(abstractC605390Non.LIZ, abstractC605390Non);
            this.LJIIIIZZ.put(abstractC605390Non.LIZ, new C605640NpC(System.currentTimeMillis()));
            C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC605580Np6.IDLE);
            this.LJI.put(abstractC605390Non.LIZ, c2252321DDqLIZ);
            InterfaceC346201Wa<Boolean> interfaceC346201WaLIZ = abstractC605390Non.LIZ(this);
            this.LJII.put(abstractC605390Non.LIZ, C23250099c.LIZLLL(this.LJ, null, null, new C605570Np5(interfaceC346201WaLIZ, c2252321DDqLIZ, this, abstractC605390Non, null), 3));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BBArch [Scheduler] submitted: ");
            sbLIZ2.append(abstractC605390Non.LIZ);
            sbLIZ2.append(" (total=");
            sbLIZ2.append(this.LJFF.size());
            sbLIZ2.append(", cancelWhen=");
            if (interfaceC346201WaLIZ == null) {
                z = false;
            }
            sbLIZ2.append(z);
            sbLIZ2.append(')');
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        "Cannot submit to a disposed TaskScheduler".toString();
        throw new IllegalStateException("Cannot submit to a disposed TaskScheduler");
    }

    public C605550Np3(C0OI4 c0oi4, C605530Np1 c605530Np1, long j) {
        this.LIZ = c0oi4;
        this.LIZIZ = c605530Np1;
        this.LIZJ = j;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LIZLLL = c23119094bLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new ConcurrentHashMap<>();
        this.LJII = new ConcurrentHashMap<>();
        this.LJIIIIZZ = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, X.AbstractC605390Non r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605550Np3.LIZJ(java.lang.String, X.0Non, X.05Vn):java.lang.Object");
    }

    public final void LJ(String str, EnumC605580Np6 enumC605580Np6, String str2) {
        boolean z;
        long j;
        long j2;
        InterfaceC332260D0u<EnumC605580Np6> interfaceC332260D0u = this.LJI.get(str);
        if (interfaceC332260D0u != null) {
            interfaceC332260D0u.setValue(enumC605580Np6);
        }
        if (!enumC605580Np6.isTerminal()) {
            return;
        }
        C605530Np1 c605530Np1 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(enumC605580Np6.name());
        C605530Np1.LIZ(c605530Np1, C2188811AlT.LIZIZ(sbLIZ));
        C605640NpC c605640NpC = this.LJIIIIZZ.get(str);
        if (c605640NpC == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = c605640NpC.LIZ;
        long j4 = c605640NpC.LIZIZ;
        if (j4 > 0) {
            z = true;
            j = j4 - j3;
        } else {
            z = false;
            j = jCurrentTimeMillis - j3;
        }
        if (z) {
            j2 = jCurrentTimeMillis - j4;
        } else {
            j2 = 0;
        }
        long j5 = jCurrentTimeMillis - j3;
        C455801q0 c455801q0 = C455801q0.LIZ;
        long j6 = this.LIZJ;
        String strName = enumC605580Np6.name();
        c455801q0.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BBArch [Monitor] task: id=");
        sbLIZ2.append(str);
        sbLIZ2.append(", state=");
        sbLIZ2.append(strName);
        sbLIZ2.append(", wait=");
        sbLIZ2.append(j);
        sbLIZ2.append("ms, run=");
        sbLIZ2.append(j2);
        sbLIZ2.append("ms, total=");
        sbLIZ2.append(j5);
        sbLIZ2.append("ms, err=");
        sbLIZ2.append(str2);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j6, "channel_id");
        c2344009Gk.LJIIIIZZ("task_id", str);
        c2344009Gk.LJIIIIZZ("state", strName);
        c2344009Gk.LIZLLL(j, "wait_ms");
        c2344009Gk.LIZLLL(j2, "run_ms");
        c2344009Gk.LIZLLL(j5, "total_ms");
        if (str2 != null && str2.length() != 0) {
            c2344009Gk.LJFF("error_msg", str2);
        }
        C20684815ws.LJIILLIIL("bb_arch_task", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r9, X.AbstractC605390Non r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C605590Np7
            if (r0 == 0) goto L98
            r7 = r11
            X.0Np7 r7 = (X.C605590Np7) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r0 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r2 = r7.LLILZIL
            r5 = 1
            if (r2 == 0) goto L2a
            if (r2 == r5) goto L4b
            r1 = 2
            if (r2 != r1) goto L9f
            X.C155000ia.LIZIZ(r0)
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r0)
            X.0Noq r4 = r10.LIZJ
            boolean r0 = r4 instanceof X.C605410Nop
            if (r0 == 0) goto La7
            r0 = r4
            X.0Nop r0 = (X.C605410Nop) r0
            long r0 = r0.LIZ
            X.0Np8 r3 = new X.0Np8
            r2 = 0
            r3.<init>(r10, r8, r2)
            r7.LL = r9
            r7.LLILLJJLI = r4
            r7.LLILZIL = r5
            java.lang.Object r0 = X.C099A.LIZJ(r0, r3, r7)
            if (r0 != r6) goto L54
            return r6
        L4b:
            X.0Noq r4 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r0)
        L54:
            if (r0 != 0) goto L25
            X.0Np6 r3 = X.EnumC605580Np6.TIMEOUT
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "timeout="
            r2.append(r0)
            X.0Nop r4 = (X.C605410Nop) r4
            long r0 = r4.LIZ
            r2.append(r0)
            java.lang.String r0 = "ms"
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r8.LJ(r9, r3, r0)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BBArch [Scheduler] ACTIVATION TIMEOUT: "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " ("
            r2.append(r0)
            long r0 = r4.LIZ
            r2.append(r0)
            java.lang.String r0 = "ms)"
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C0OPX.LJII(r0)
            r5 = 0
            goto L25
        L98:
            X.0Np7 r7 = new X.0Np7
            r7.<init>(r8, r11)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La7:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605550Np3.LJFF(java.lang.String, X.0Non, X.05Vn):java.lang.Object");
    }
}
