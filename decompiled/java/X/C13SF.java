package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.effectplatform.abtest.EffectCleanConfig;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13SF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SF implements InterfaceC20004513Ox {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final C13SP LJ;
    public final boolean LJFF;
    public final Pair<Boolean, C13SO> LJI;
    public C13SG LJII;
    public final C2278408wI LJIIIIZZ = new C2278408wI();

    @Override // X.InterfaceC20004513Ox
    public final void LJIIL(List<String> list) {
    }

    public final C13SG LJIIZILJ() {
        Object c098200Yq;
        C2278408wI c2278408wI = this.LJIIIIZZ;
        c2278408wI.LIZ();
        try {
            C13SG c13sg = this.LJII;
            if (c13sg == null || !C13SB.LJ(c13sg.LIZ) || !C13SB.LIZLLL(c13sg.LJII)) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(" is creating");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("DiskLruCacheImpl", strLIZIZ);
                try {
                    Regex regex = C13SG.LJJ;
                    c098200Yq = C13SJ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DiskLruCache.open fails, ex: ");
                    sbLIZ2.append(thM5exceptionOrNullimpl);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("DiskLruCacheImpl", strLIZIZ2, null);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                this.LJII = (C13SG) c098200Yq;
            }
            C13SG c13sg2 = this.LJII;
            c2278408wI.LIZIZ();
            return c13sg2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c2278408wI.LIZIZ();
            throw th2;
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final Set<String> LIZJ() {
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            return c13sgLJIIZILJ.LJIIJ();
        }
        return null;
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Long, Long> LJIILLIIL() {
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        return c13sgLJIIZILJ != null ? new Pair<>(Long.valueOf(c13sgLJIIZILJ.LJIIJ), Long.valueOf(c13sgLJIIZILJ.LJIIJJI)) : new Pair<>(0L, 0L);
    }

    @Override // X.InterfaceC20004513Ox
    public final void clear() {
        try {
            C13SG c13sgLJIIZILJ = LJIIZILJ();
            if (c13sgLJIIZILJ != null) {
                c13sgLJIIZILJ.LJFF();
            }
            C13SG c13sgLJIIZILJ2 = LJIIZILJ();
            if (c13sgLJIIZILJ2 != null) {
                c13sgLJIIZILJ2.LJIILL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("DiskLruCacheImpl", "clear: exception", e);
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final void LIZ(long j) {
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            c13sgLJIIZILJ.LJIJJ(j);
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Integer, Long> LIZIZ(long j) {
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            return c13sgLJIIZILJ.LJIJI(j);
        }
        return new Pair<>(0, 0L);
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJ(InterfaceC20004913Pb interfaceC20004913Pb) {
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            c13sgLJIIZILJ.LJIJJ = interfaceC20004913Pb;
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final String LJFF(String str) {
        C20008813Qo c20008813QoLJIILIIL = LJIILIIL(str);
        if (c20008813QoLJIILIIL == null) {
            return null;
        }
        return C13SB.LJIIIZ(c20008813QoLJIILIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    @Override // X.InterfaceC20004513Ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJJI(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r4 = 0
            X.13SG r0 = r5.LJIIZILJ()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            if (r0 == 0) goto Lc
            X.13SL r3 = r0.LJII(r6)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L22
            goto Ld
        Lc:
            r3 = r4
        Ld:
            if (r3 != 0) goto L10
            return r4
        L10:
            X.13M9[] r1 = r3.LIZ     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L40
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L40
            if (r0 == 0) goto L19
            java.lang.String r4 = r0.LIZ     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L40
        L19:
            r3.close()
            return r4
        L1d:
            r1 = move-exception
            goto L24
        L1f:
            r0 = move-exception
            r3 = r4
            goto L41
        L22:
            r1 = move-exception
            r3 = r4
        L24:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L40
            X.13SS r0 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "DiskLruCache"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L33
            java.lang.String r1 = ""
        L33:
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            r0 = 0
            X.C13SS.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L3f
            r3.close()
        L3f:
            return r4
        L40:
            r0 = move-exception
        L41:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L49
            r3.close()
        L49:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SF.LJIIJJI(java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC20004513Ox
    public final C20008813Qo LJIILIIL(String str) {
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        try {
            C13SG c13sgLJIIZILJ = LJIIZILJ();
            if (c13sgLJIIZILJ != null) {
                C13SL c13slLJII = c13sgLJIIZILJ.LJII(strLIZJ);
                if (c13slLJII != null) {
                    return c13slLJII.LIZIZ[0];
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get key:");
            sbLIZ.append(str);
            sbLIZ.append(" exception");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("DiskLruCacheImpl", strLIZIZ, e);
        }
        return null;
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean LJIILJJIL(String str) {
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        boolean z = false;
        if (c13sgLJIIZILJ != null) {
            C2278408wI c2278408wI = c13sgLJIIZILJ.LJIILJJIL;
            c2278408wI.LIZ();
            try {
                c13sgLJIIZILJ.LIZLLL();
                if (C13SG.LJJ(strLIZJ)) {
                    C13SI c13si = c13sgLJIIZILJ.LJIJI.get(strLIZJ);
                    if (c13si != null && c13si.LIZJ) {
                        z = true;
                        try {
                            c13sgLJIIZILJ.LJIIL++;
                            C13SM c13sm = c13sgLJIIZILJ.LJIILIIL;
                            if (c13sm != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("READ ");
                                sbLIZ.append(strLIZJ);
                                sbLIZ.append('\n');
                                c13sm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            C13SM c13sm2 = c13sgLJIIZILJ.LJIILIIL;
                            if (c13sm2 != null) {
                                c13sm2.LIZ();
                            }
                            if (c13sgLJIIZILJ.LJIILIIL()) {
                                c13sgLJIIZILJ.LJIJJLI.execute(c13sgLJIIZILJ.LJIL);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    c2278408wI.LIZIZ();
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
                    sbLIZ2.append(strLIZJ);
                    sbLIZ2.append('\"');
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2278408wI.LIZIZ();
                throw th;
            }
        }
        return z;
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJIILL(String str) {
        Set<String> setLJIIJ;
        if (str == null) {
            return;
        }
        Regex regex = C13SG.LJJ;
        Regex regex2 = new Regex(C13SJ.LIZLLL(str));
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null && (setLJIIJ = c13sgLJIIZILJ.LJIIJ()) != null) {
            for (String str2 : setLJIIJ) {
                if (regex2.matches(str2)) {
                    remove(str2);
                }
            }
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean remove(String str) {
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        try {
            C13SG c13sgLJIIZILJ = LJIIZILJ();
            if (c13sgLJIIZILJ != null) {
                return c13sgLJIIZILJ.LJIJ(strLIZJ);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove key:");
            sbLIZ.append(str);
            sbLIZ.append(" exception");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("DiskLruCacheImpl", strLIZIZ, e);
            return false;
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final void LIZLLL(String str, String str2) {
        Regex regex = C13SG.LJJ;
        String strLIZJ = C13SJ.LIZJ(str);
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            C2278408wI c2278408wI = c13sgLJIIZILJ.LJIILJJIL;
            c2278408wI.LIZ();
            try {
                c13sgLJIIZILJ.LJIIL();
                c13sgLJIIZILJ.LIZLLL();
                if (C13SG.LJJ(strLIZJ)) {
                    C13SI c13si = c13sgLJIIZILJ.LJIJI.get(strLIZJ);
                    if (c13si == null) {
                        c13si = new C13SI(c13sgLJIIZILJ, strLIZJ);
                        c13sgLJIIZILJ.LJIJI.put(strLIZJ, c13si);
                    }
                    c13si.LJ.set(0, Long.valueOf(System.currentTimeMillis()));
                    C13SM c13sm = c13sgLJIIZILJ.LJIILIIL;
                    if (c13sm != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("USE ");
                        sbLIZ.append(c13si.LIZ);
                        sbLIZ.append(c13si.LIZLLL());
                        sbLIZ.append('\n');
                        c13sm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C13SM c13sm2 = c13sgLJIIZILJ.LJIILIIL;
                    if (c13sm2 != null) {
                        c13sm2.LIZ();
                    }
                    c2278408wI.LIZIZ();
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
                sbLIZ2.append(strLIZJ);
                sbLIZ2.append('\"');
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2278408wI.LIZIZ();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJI(String str, String str2) {
        long j;
        Pair<Boolean, C13SO> pair;
        C13SO second;
        C13SG c13sgLJIIZILJ = LJIIZILJ();
        if (c13sgLJIIZILJ != null) {
            C2278408wI c2278408wI = c13sgLJIIZILJ.LJIILJJIL;
            c2278408wI.LIZ();
            try {
                c13sgLJIIZILJ.LIZLLL();
                if (C13SG.LJJ(str)) {
                    C13SI c13si = c13sgLJIIZILJ.LJIJI.get(str);
                    if (c13si == null) {
                        c13si = new C13SI(c13sgLJIIZILJ, str);
                        c13sgLJIIZILJ.LJIJI.put(str, c13si);
                    } else {
                        if (c13si.LIZLLL != null) {
                        }
                        c2278408wI.LIZIZ();
                        return;
                    }
                    C13M9 c13m9LIZ = c13si.LIZ(0);
                    if (C13SB.LIZLLL(c13m9LIZ)) {
                        long jLongValue = c13si.LIZIZ.get(0).longValue();
                        long jLJIIIZ = C13SG.LJIIIZ(c13m9LIZ);
                        c13si.LIZIZ.set(0, Long.valueOf(jLJIIIZ));
                        if (c13sgLJIIZILJ.LJIIIIZZ() && (pair = c13sgLJIIZILJ.LJI) != null && (second = pair.getSecond()) != null && second.LIZIZ(c13si.LJFF)) {
                            c13sgLJIIZILJ.LJIIJJI = (c13sgLJIIZILJ.LJIIJJI - jLongValue) + jLJIIIZ;
                        } else {
                            c13sgLJIIZILJ.LJIIJ = (c13sgLJIIZILJ.LJIIJ - jLongValue) + jLJIIIZ;
                        }
                        c13sgLJIIZILJ.LJIIL++;
                        c13si.LIZLLL = null;
                        c13si.LIZJ = true;
                        if (c13sgLJIIZILJ.LJIIIIZZ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("panel_");
                            sbLIZ.append(str2);
                            c13si.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                            C13SM c13sm = c13sgLJIIZILJ.LJIILIIL;
                            if (c13sm != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("CLEAN ");
                                sbLIZ2.append(c13si.LIZ);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(c13si.LJFF);
                                sbLIZ2.append(c13si.LIZJ());
                                sbLIZ2.append('\n');
                                c13sm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            C13SS c13ss = C13SS.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("addEntryToCache: entry.panel: ");
                            sbLIZ3.append(c13si.LJFF);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            c13ss.getClass();
                            C13SS.LIZ("EffectResourceLevelOpt", strLIZIZ);
                        } else {
                            C13SM c13sm2 = c13sgLJIIZILJ.LJIILIIL;
                            if (c13sm2 != null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("CLEAN ");
                                sbLIZ4.append(c13si.LIZ);
                                sbLIZ4.append(c13si.LIZJ());
                                sbLIZ4.append('\n');
                                c13sm2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                        c13sgLJIIZILJ.LJIJ++;
                        c13si.getClass();
                        C13SM c13sm3 = c13sgLJIIZILJ.LJIILIIL;
                        if (c13sm3 != null) {
                            c13sm3.LIZ();
                        }
                        EffectCleanConfig effectCleanConfig = C19997713Mh.LJ;
                        if (effectCleanConfig.isOpen) {
                            j = effectCleanConfig.cacheThresholdMb;
                        } else {
                            j = c13sgLJIIZILJ.LIZLLL;
                        }
                        if (c13sgLJIIZILJ.LJIIJ > j || c13sgLJIIZILJ.LJIILIIL()) {
                            c13sgLJIIZILJ.LJIJJLI.execute(c13sgLJIIZILJ.LJIL);
                        }
                    } else {
                        c13sgLJIIZILJ.LJIJI.remove(c13si.LIZ);
                        C13SM c13sm4 = c13sgLJIIZILJ.LJIILIIL;
                        if (c13sm4 != null) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("REMOVE ");
                            sbLIZ5.append(c13si.LIZ);
                            sbLIZ5.append('\n');
                            c13sm4.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                    c2278408wI.LIZIZ();
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("keys must match regex [a-z0-9_-]{1,120}: \"");
                sbLIZ6.append(str);
                sbLIZ6.append('\"');
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2278408wI.LIZIZ();
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x00a8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC20004513Ox
    public final long LJII(java.lang.String r10, X.C20008713Qn r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r7 = "DiskLruCacheImpl"
            kotlin.text.Regex r0 = X.C13SG.LJJ
            java.lang.String r6 = X.C13SJ.LIZJ(r10)
            r2 = 0
            r8 = 0
            X.13SS r5 = X.C13SS.LIZ     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            java.lang.String r4 = "EffectResourceLevelOpt"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            java.lang.String r0 = "save(inputStream): key: "
            r1.append(r0)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            r1.append(r10)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            r5.getClass()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            X.C13SS.LIZ(r4, r0)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            X.13SG r1 = r9.LJIIZILJ()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            if (r1 == 0) goto La1
            java.lang.String r0 = ""
            X.13SK r1 = r1.LJI(r6, r0)     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> La8
            if (r1 == 0) goto La1
            X.13S7 r6 = new X.13S7     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> La8
            X.13SD r0 = r1.LIZJ()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> La8
            r6.<init>(r0)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> La8
            X.C20012413Ry.LIZIZ(r11, r6, r2, r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r1.LIZIZ()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r8 = r6
            long r2 = r6.LIZJ     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> La8
            r6.close()     // Catch: java.lang.Exception -> L9d
            return r2
        L49:
            r1 = move-exception
            goto La3
        L4b:
            r5 = move-exception
            r8 = r6
            goto L4f
        L4e:
            r5 = move-exception
        L4f:
            r6 = r8
            r8 = r1
            goto L54
        L52:
            r5 = move-exception
            r6 = r8
        L54:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> La2
            X.13SS r4 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "save key:"
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            r1.append(r10)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = " exception"
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> La2
            r4.getClass()     // Catch: java.lang.Throwable -> La2
            X.C13SS.LIZIZ(r7, r0, r5)     // Catch: java.lang.Throwable -> La2
            if (r8 == 0) goto L97
            r8.LIZ()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La2
            goto L97
        L7a:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> La2
            X.13SS r4 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "abort :"
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            r1.append(r5)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> La2
            r4.getClass()     // Catch: java.lang.Throwable -> La2
            r0 = 0
            X.C13SS.LIZIZ(r7, r1, r0)     // Catch: java.lang.Throwable -> La2
        L97:
            if (r6 == 0) goto La1
            r6.close()     // Catch: java.lang.Exception -> L9d
            return r2
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La1:
            return r2
        La2:
            r1 = move-exception
        La3:
            r8 = r6
        La4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r1 = move-exception
            goto La4
        Laa:
            if (r8 == 0) goto Lb4
            r8.close()     // Catch: java.lang.Exception -> Lb0
            throw r1
        Lb0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SF.LJII(java.lang.String, X.13Qn, java.lang.String):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC20004513Ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIJ(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r8 = "DiskLruCacheImpl"
            kotlin.text.Regex r0 = X.C13SG.LJJ
            java.lang.String r6 = X.C13SJ.LIZJ(r11)
            r3 = 0
            r9 = 0
            X.13SS r5 = X.C13SS.LIZ     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            java.lang.String r2 = "EffectResourceLevelOpt"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            java.lang.String r0 = "save(value): key: "
            r1.append(r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            r1.append(r11)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            r5.getClass()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            X.C13SS.LIZ(r2, r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            X.13SG r1 = r10.LJIIZILJ()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            if (r1 == 0) goto L61
            java.lang.String r0 = "effect_value"
            X.13SK r2 = r1.LJI(r6, r0)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> Lb3
            if (r2 == 0) goto L61
            X.13S7 r7 = new X.13S7     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> Lb3
            X.13SD r0 = r2.LIZJ()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> Lb3
            r7.<init>(r0)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> Lb3
            byte[] r1 = X.C20009813Qy.LIZ(r12)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            int r0 = r1.length     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r7.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r7.LIZ()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r7.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r2.LIZIZ()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r9 = r7
            long r3 = r7.LIZJ     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> Lb3
            r7.close()     // Catch: java.lang.Exception -> L5d
            return r3
        L54:
            r1 = move-exception
            goto Lae
        L56:
            r5 = move-exception
            r9 = r7
            goto L5a
        L59:
            r5 = move-exception
        L5a:
            r7 = r9
            r9 = r2
            goto L64
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            return r3
        L62:
            r5 = move-exception
            r7 = r9
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> Lad
            X.13SS r2 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "save :"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            r1.append(r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lad
            r2.getClass()     // Catch: java.lang.Throwable -> Lad
            r6 = 0
            X.C13SS.LIZIZ(r8, r0, r6)     // Catch: java.lang.Throwable -> Lad
            if (r9 == 0) goto La2
            r9.LIZ()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> Lad
            goto La2
        L86:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> Lad
            X.13SS r2 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "abort :"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            r1.append(r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lad
            r2.getClass()     // Catch: java.lang.Throwable -> Lad
            X.C13SS.LIZIZ(r8, r0, r6)     // Catch: java.lang.Throwable -> Lad
        La2:
            if (r7 == 0) goto Lac
            r7.close()     // Catch: java.lang.Exception -> La8
            return r3
        La8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lac:
            return r3
        Lad:
            r1 = move-exception
        Lae:
            r9 = r7
        Laf:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lb3
            goto Lb5
        Lb3:
            r1 = move-exception
            goto Laf
        Lb5:
            if (r9 == 0) goto Lbf
            r9.close()     // Catch: java.lang.Exception -> Lbb
            throw r1
        Lbb:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbf:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SF.LJIIJ(java.lang.String, java.lang.String, java.lang.String):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[Catch: Exception -> 0x0123, all -> 0x01af, TryCatch #4 {Exception -> 0x0123, blocks: (B:17:0x007a, B:19:0x0086, B:21:0x008c, B:25:0x0095, B:26:0x00d7, B:27:0x00d8, B:30:0x00fc, B:29:0x00de), top: B:74:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[Catch: Exception -> 0x01c2, TRY_LEAVE, TryCatch #6 {Exception -> 0x01c2, blocks: (B:60:0x01b6, B:62:0x01be), top: B:75:0x01b6 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.13SD] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.13S7, X.13SD] */
    @Override // X.InterfaceC20004513Ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LJIIIIZZ(java.lang.String r14, X.C20008713Qn r15, java.lang.String r16, long r17, java.lang.String r19, kotlin.jvm.functions.Function2 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SF.LJIIIIZZ(java.lang.String, X.13Qn, java.lang.String, long, java.lang.String, kotlin.jvm.functions.Function2):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[Catch: all -> 0x00db, Exception -> 0x00dd, TryCatch #11 {Exception -> 0x00dd, all -> 0x00db, blocks: (B:8:0x0044, B:10:0x004d, B:12:0x0053, B:16:0x005c, B:17:0x0098, B:18:0x0099, B:21:0x00b8, B:20:0x009f), top: B:70:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC20004513Ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> LJIIIZ(java.lang.String r12, X.C20008813Qo r13, java.lang.String r14, long r15, java.lang.String r17, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SF.LJIIIZ(java.lang.String, X.13Qo, java.lang.String, long, java.lang.String, kotlin.jvm.functions.Function2):kotlin.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13SF(String str, int i, int i2, long j, C13SP c13sp, boolean z, Pair<Boolean, ? extends C13SO> pair) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = c13sp;
        this.LJFF = z;
        this.LJI = pair;
    }
}
