package X;

import Y.ACallableS248S0200000_20;
import Y.ACallableS425S0100000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326950kdR {
    public static final Class<?> LJII = C1326950kdR.class;
    public final InterfaceC1326920kdO LIZ;
    public final InterfaceC1327440keE LIZIZ;
    public final C1327960kf4 LIZJ;
    public final Executor LIZLLL;
    public final Executor LJ;
    public final C1326970kdT LJFF = new C1326970kdT();
    public final InterfaceC1327000kdW LJI;

    public final void LIZJ() {
        this.LJFF.LIZ();
        try {
            C15O7.LIZIZ(new ACallableS425S0100000_20(this, 17), this.LJ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(LJII, e, "Failed to schedule disk-cache clear", new Object[0]);
            C15O7.LJIIIZ(e);
        }
    }

    public final boolean LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        C1328480kfu c1328480kfuLIZIZ = this.LJFF.LIZIZ(interfaceC1324680kZm);
        Class<?> cls = LJII;
        if (c1328480kfuLIZIZ != null) {
            c1328480kfuLIZIZ.close();
            C1328570kg3.LJIIJJI(cls, "Found image for %s in staging area", interfaceC1324680kZm.LIZ());
            this.LJI.LIZLLL();
            return true;
        }
        C1328570kg3.LJIIJJI(cls, "Did not find image for %s in staging area", interfaceC1324680kZm.LIZ());
        this.LJI.LJIIIIZZ();
        try {
            return this.LIZ.LJII(interfaceC1324680kZm);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final C15O7<Boolean> LIZLLL(InterfaceC1324680kZm interfaceC1324680kZm) {
        if (LJ(interfaceC1324680kZm)) {
            return C15O7.LJIIJ(Boolean.TRUE);
        }
        try {
            return C15O7.LIZIZ(new ACallableS248S0200000_20(this, interfaceC1324680kZm, 1), this.LIZLLL, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(LJII, e, "Failed to schedule disk-cache read for %s", interfaceC1324680kZm.LIZ());
            return C15O7.LJIIIZ(e);
        }
    }

    public final boolean LJ(InterfaceC1324680kZm interfaceC1324680kZm) {
        C1326970kdT c1326970kdT = this.LJFF;
        synchronized (c1326970kdT) {
            interfaceC1324680kZm.getClass();
            if (((HashMap) c1326970kdT.LIZ).containsKey(interfaceC1324680kZm)) {
                C1328480kfu c1328480kfu = (C1328480kfu) ((HashMap) c1326970kdT.LIZ).get(interfaceC1324680kZm);
                synchronized (c1328480kfu) {
                    try {
                        if (C1328480kfu.LJIIZILJ(c1328480kfu)) {
                            return true;
                        }
                        ((HashMap) c1326970kdT.LIZ).remove(interfaceC1324680kZm);
                        C1328570kg3.LJIIZILJ(C1326970kdT.LIZIZ, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c1328480kfu)), interfaceC1324680kZm.LIZ(), Integer.valueOf(System.identityHashCode(interfaceC1324680kZm)));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (this.LIZ.LJIIIZ(interfaceC1324680kZm)) {
                return true;
            }
            return false;
        }
    }

    public final boolean LJFF(InterfaceC1324680kZm interfaceC1324680kZm) {
        if (LJ(interfaceC1324680kZm)) {
            return true;
        }
        return LIZIZ(interfaceC1324680kZm);
    }

    public final InterfaceC1327060kdc LJIIIIZZ(InterfaceC1324680kZm interfaceC1324680kZm) throws Exception {
        Class<?> cls = LJII;
        try {
            String strLIZ = interfaceC1324680kZm.LIZ();
            Boolean bool = Boolean.FALSE;
            C1328570kg3.LJIIL(cls, "fall back main Disk cache read for %s needEncrypt = %s", strLIZ, bool);
            InterfaceC1326920kdO interfaceC1326920kdO = C1328730kgJ.LJIJJ;
            if (interfaceC1326920kdO == null) {
                return null;
            }
            InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = interfaceC1326920kdO.LJIIJ(interfaceC1324680kZm);
            if (interfaceC1317730kOZLJIIJ == null) {
                C1328570kg3.LJIIJJI(cls, "Disk cache miss for %s", interfaceC1324680kZm.LIZ());
                this.LJI.LJII();
                return null;
            }
            C1328570kg3.LJIIJJI(cls, "Found entry in disk cache for %s", interfaceC1324680kZm.LIZ());
            this.LJI.LIZIZ();
            C1335740krc c1335740krc = (C1335740krc) interfaceC1317730kOZLJIIJ;
            C0VSP c0vsp = new C0VSP(c1335740krc.LIZ);
            try {
                C1328830kgT c1328830kgTLIZJ = this.LIZIZ.LIZJ(c0vsp, (int) c1335740krc.LIZ());
                c0vsp.close();
                C1328570kg3.LJIIL(cls, "Successful read from disk cache for %s needEncrypt = %s", interfaceC1324680kZm.LIZ(), bool);
                return c1328830kgTLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsp.close();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(cls, e, "Exception reading from cache for %s needEncrypt = %s", interfaceC1324680kZm.LIZ(), Boolean.FALSE);
            this.LJI.LJIIJJI();
            throw e;
        }
    }

    public final void LJIIIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        interfaceC1324680kZm.getClass();
        this.LJFF.LIZLLL(interfaceC1324680kZm);
        try {
            C15O7.LIZIZ(new ACallableS248S0200000_20(this, interfaceC1324680kZm, 2), this.LJ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(LJII, e, "Failed to schedule disk-cache remove for %s", interfaceC1324680kZm.LIZ());
            C15O7.LJIIIZ(e);
        }
    }

    public static InterfaceC1327060kdc LIZ(C1326950kdR c1326950kdR, InterfaceC1324680kZm interfaceC1324680kZm) throws Exception {
        c1326950kdR.getClass();
        Class<?> cls = LJII;
        try {
            String strLIZ = interfaceC1324680kZm.LIZ();
            Boolean bool = Boolean.FALSE;
            C1328570kg3.LJIIL(cls, "Disk cache read for %s needEncrypt = %s", strLIZ, bool);
            InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = c1326950kdR.LIZ.LJIIJ(interfaceC1324680kZm);
            if (interfaceC1317730kOZLJIIJ == null) {
                C1328570kg3.LJIIJJI(cls, "Disk cache miss for %s", interfaceC1324680kZm.LIZ());
                c1326950kdR.LJI.LJII();
                return null;
            }
            C1328570kg3.LJIIJJI(cls, "Found entry in disk cache for %s", interfaceC1324680kZm.LIZ());
            c1326950kdR.LJI.LIZIZ();
            C1335740krc c1335740krc = (C1335740krc) interfaceC1317730kOZLJIIJ;
            C0VSP c0vsp = new C0VSP(c1335740krc.LIZ);
            try {
                C1328830kgT c1328830kgTLIZJ = c1326950kdR.LIZIZ.LIZJ(c0vsp, (int) c1335740krc.LIZ());
                c0vsp.close();
                C1328570kg3.LJIIL(cls, "Successful read from disk cache for %s needEncrypt = %s", interfaceC1324680kZm.LIZ(), bool);
                return c1328830kgTLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsp.close();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(cls, e, "Exception reading from cache for %s needEncrypt = %s", interfaceC1324680kZm.LIZ(), Boolean.FALSE);
            c1326950kdR.LJI.LJIIJJI();
            throw e;
        }
    }

    public final C15O7<C1328480kfu> LJI(final InterfaceC1324680kZm interfaceC1324680kZm, final AtomicBoolean atomicBoolean) {
        C15O7<C1328480kfu> c15o7LJIIIZ;
        C1326970kdT c1326970kdT;
        try {
            C1336010ks3.LIZIZ();
            C1328480kfu c1328480kfuLIZIZ = this.LJFF.LIZIZ(interfaceC1324680kZm);
            if (c1328480kfuLIZIZ == null && C1328730kgJ.LJIJ && (c1326970kdT = C1328730kgJ.LJIJI) != this.LJFF && c1326970kdT != null) {
                c1328480kfuLIZIZ = c1326970kdT.LIZIZ(interfaceC1324680kZm);
            }
            Class<?> cls = LJII;
            if (c1328480kfuLIZIZ != null) {
                C1328570kg3.LJIIJJI(cls, "Found image for %s in staging area", interfaceC1324680kZm.LIZ());
                this.LJI.LIZLLL();
                C15O7<C1328480kfu> c15o7LJIIJ = C15O7.LJIIJ(c1328480kfuLIZIZ);
                C1336010ks3.LIZIZ();
                return c15o7LJIIJ;
            }
            try {
                c15o7LJIIIZ = C15O7.LIZIZ(new Callable<C1328480kfu>() { // from class: X.0kdS
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
                    
                        if (r0 == null) goto L34;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C1328480kfu call() {
                        /*
                            Method dump skipped, instruction units count: 261
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.CallableC1326960kdS.call():java.lang.Object");
                    }
                }, this.LIZLLL, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJIJ(cls, e, "Failed to schedule disk-cache read for %s", interfaceC1324680kZm.LIZ());
                c15o7LJIIIZ = C15O7.LJIIIZ(e);
            }
            C1336010ks3.LIZIZ();
            return c15o7LJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public final void LJII(final InterfaceC1324680kZm interfaceC1324680kZm, C1328480kfu c1328480kfu) {
        try {
            C1336010ks3.LIZIZ();
            interfaceC1324680kZm.getClass();
            C1322350kW1.LIZIZ(C1328480kfu.LJIIZILJ(c1328480kfu));
            C1326970kdT c1326970kdT = this.LJFF;
            synchronized (c1326970kdT) {
                C1322350kW1.LIZIZ(C1328480kfu.LJIIZILJ(c1328480kfu));
                C1328480kfu.LIZIZ((C1328480kfu) ((HashMap) c1326970kdT.LIZ).put(interfaceC1324680kZm, C1328480kfu.LIZ(c1328480kfu)));
                c1326970kdT.LIZJ();
            }
            final C1328480kfu c1328480kfuLIZ = C1328480kfu.LIZ(c1328480kfu);
            try {
                this.LJ.execute(new Runnable() { // from class: X.0kdU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BufferedDiskCache@f3ba.put$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BufferedDiskCache@f3ba.put$2");
                    }

                    public final void LIZ() {
                        try {
                            C1336010ks3.LIZIZ();
                            this.LLILLL.getClass();
                            this.LLILLL.LJIIJ(interfaceC1324680kZm, c1328480kfuLIZ);
                            this.LLILLL.LJFF.LJ(interfaceC1324680kZm, c1328480kfuLIZ);
                            C1328480kfu.LIZIZ(c1328480kfuLIZ);
                            C1336010ks3.LIZIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LLILLL.LJFF.LJ(interfaceC1324680kZm, c1328480kfuLIZ);
                            C1328480kfu.LIZIZ(c1328480kfuLIZ);
                            C1336010ks3.LIZIZ();
                            throw th;
                        }
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1328570kg3.LJIJ(LJII, e, "Failed to schedule disk-cache write for %s", interfaceC1324680kZm.LIZ());
                this.LJFF.LJ(interfaceC1324680kZm, c1328480kfu);
                C1328480kfu.LIZIZ(c1328480kfuLIZ);
            }
            C1336010ks3.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    public final void LJIIJ(InterfaceC1324680kZm interfaceC1324680kZm, final C1328480kfu c1328480kfu) {
        Class<?> cls = LJII;
        C1328570kg3.LJIIJJI(cls, "About to write to disk-cache for key %s", interfaceC1324680kZm.LIZ());
        try {
            this.LIZ.LJIIIIZZ(new C1324710kZp(interfaceC1324680kZm, c1328480kfu.LLJILLL), new InterfaceC1327040kda() { // from class: X.0kdV
                @Override // X.InterfaceC1327040kda
                public final void LIZ(C1335560krK c1335560krK) {
                    this.LIZIZ.LIZJ.LIZ(c1328480kfu.LJII(), c1335560krK);
                }
            });
            C1328570kg3.LJIIJJI(cls, "Successful disk-cache write for key %s", interfaceC1324680kZm.LIZ());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJIJ(cls, e, "Failed to write to disk-cache for key %s", interfaceC1324680kZm.LIZ());
        }
    }

    public C1326950kdR(InterfaceC1326920kdO interfaceC1326920kdO, InterfaceC1327440keE interfaceC1327440keE, C1327960kf4 c1327960kf4, Executor executor, Executor executor2, InterfaceC1327000kdW interfaceC1327000kdW) {
        this.LIZ = interfaceC1326920kdO;
        this.LIZIZ = interfaceC1327440keE;
        this.LIZJ = c1327960kf4;
        this.LIZLLL = executor;
        this.LJ = executor2;
        this.LJI = interfaceC1327000kdW;
    }
}
