package X;

import Y.ARunnableS130S0100000_30;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.effectplatform.abtest.EffectCleanConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13SG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SG {
    public static final Regex LJJ = new Regex("[a-z0-9_-]{1,120}");
    public static final C01GW<Boolean> LJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(406));
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public long LIZLLL;
    public final C13SP LJ;
    public final boolean LJFF;
    public final Pair<Boolean, C13SO> LJI;
    public final C13M9 LJII;
    public final C13M9 LJIIIIZZ;
    public final C13M9 LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public C13SM LJIILIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public long LJIJ;
    public InterfaceC20004913Pb LJIJJ;
    public final C2278408wI LJIILJJIL = new C2278408wI();
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 302));
    public final LinkedHashMap<String, C13SI> LJIJI = new LinkedHashMap<>(0, 0.75f, true);
    public final C13QJ LJIJJLI = new C13QJ();
    public final ARunnableS130S0100000_30 LJIL = new ARunnableS130S0100000_30(this, 27);

    public final void LIZ() {
        Double d;
        Pair<Boolean, C13SO> pair;
        C13SO second;
        C13SB.LJIILLIIL(this.LJIIIIZZ);
        Iterator<C13SI> it2 = this.LJIJI.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C13SI next = it2.next();
            if (next.LIZLLL == null) {
                int i = this.LIZJ;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!LJIIIIZZ() || (pair = this.LJI) == null || (second = pair.getSecond()) == null || !second.LIZIZ(next.LJFF)) {
                        this.LJIIJ += ((Number) ListProtector.get(next.LIZIZ, i2)).longValue();
                    } else {
                        this.LJIIJJI += ((Number) ListProtector.get(next.LIZIZ, i2)).longValue();
                    }
                }
            } else {
                next.LIZLLL = null;
                int i3 = this.LIZJ;
                for (int i4 = 0; i4 < i3; i4++) {
                    C20012413Ry.LJ(next.LIZ(i4));
                    C20012413Ry.LJ(next.LIZIZ(i4));
                }
                it2.remove();
            }
        }
        Iterator<T> it3 = this.LJIJI.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            if (((C13SI) entry.getValue()).LJ.size() > 0) {
                long jDoubleValue = 0;
                if (((Number) ListProtector.get(((C13SI) entry.getValue()).LJ, 0)).longValue() <= 0 && C13SB.LIZLLL(((C13SI) entry.getValue()).LIZ(0))) {
                    C20012513Rz c20012513RzLJFF = C13SB.LJFF(((C13SI) entry.getValue()).LIZ(0));
                    if (c20012513RzLJFF != null && (d = c20012513RzLJFF.LIZJ) != null) {
                        jDoubleValue = (long) d.doubleValue();
                    }
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) entry.getKey());
                    sbLIZ.append(":modifiedAt:");
                    sbLIZ.append(jDoubleValue);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZ("DiskLruCache", strLIZIZ);
                    ListProtector.set(((C13SI) entry.getValue()).LJ, 0, Long.valueOf(jDoubleValue));
                }
            }
        }
    }

    public final void LIZIZ() {
        int i;
        C20008813Qo c20008813QoLJIIJJI = C13SB.LJIIJJI(this.LJII);
        if (c20008813QoLJIIJJI == null) {
            return;
        }
        C20009713Qx c20009713Qx = new C20009713Qx(c20008813QoLJIIJJI, EnumC20009313Qt.Ascii);
        try {
            try {
                String strLIZIZ = c20009713Qx.LIZIZ();
                String strLIZIZ2 = c20009713Qx.LIZIZ();
                String strLIZIZ3 = c20009713Qx.LIZIZ();
                String strLIZIZ4 = c20009713Qx.LIZIZ();
                String strLIZIZ5 = c20009713Qx.LIZIZ();
                boolean z = (this.LJFF || Intrinsics.LJFF(String.valueOf(this.LIZIZ), strLIZIZ3)) ? false : true;
                if (!Intrinsics.LJFF("libcore.io.DiskLruCache", strLIZIZ) || !Intrinsics.LJFF("1", strLIZIZ2) || z || !Intrinsics.LJFF(String.valueOf(this.LIZJ), strLIZIZ4) || !Intrinsics.LJFF(strLIZIZ5, "")) {
                    C13SS.LIZ.getClass();
                    C13SS.LIZIZ("ToolsDiskInitialize", "failed unexpected journal header", null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unexpected journal header: [");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(", ");
                    sbLIZ.append(strLIZIZ2);
                    sbLIZ.append(", ");
                    sbLIZ.append(strLIZIZ4);
                    sbLIZ.append(", ");
                    sbLIZ.append(strLIZIZ5);
                    sbLIZ.append(']');
                    throw new C564610MCl(C2188811AlT.LIZIZ(sbLIZ));
                }
                int i2 = 0;
                while (true) {
                    try {
                        String strLIZIZ6 = c20009713Qx.LIZIZ();
                        if (strLIZIZ6 == null) {
                            break;
                        }
                        C2278408wI c2278408wI = this.LJIILJJIL;
                        c2278408wI.LIZ();
                        try {
                            boolean zLIZJ = LIZJ(strLIZIZ6);
                            c2278408wI.LIZIZ();
                            if (!zLIZJ) {
                                break;
                            } else {
                                i2++;
                            }
                        } finally {
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                Collection<C13SI> collectionValues = this.LJIJI.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (C13SI c13si : collectionValues) {
                        if (c13si.LJ.size() > 0 && c13si.LJ.get(0).longValue() > 0 && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                this.LJIIL = (i2 - this.LJIJI.size()) - i;
                if (c20009713Qx.LJ == -1) {
                    LJIIZILJ();
                } else {
                    this.LJIILIIL = new C13SM(C13SB.LJIILIIL(this.LJII, true));
                }
                C13SB.LIZIZ(c20009713Qx);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("failed e -> ");
                sbLIZ2.append(e2);
                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZIZ("ToolsDiskInitialize", strLIZIZ7, null);
                throw e2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20009713Qx);
            throw th;
        }
    }

    public final void LIZLLL() {
        if (this.LJIILLIIL) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void LJFF() {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiskLruCache delete trace: directory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", caller=");
        sbLIZ.append(C20519082b.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LJ("CKResource", strLIZIZ);
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            if (!this.LJIILL || this.LJIILLIIL) {
                this.LJIILLIIL = true;
            } else {
                Iterator it2 = new ArrayList(this.LJIJI.values()).iterator();
                while (it2.hasNext()) {
                    C13SK c13sk = ((C13SI) it2.next()).LIZLLL;
                    if (c13sk != null) {
                        c13sk.LIZ();
                    }
                }
                if (!C19997713Mh.LIZIZ) {
                    C13SS.LIZ.getClass();
                    C13SS.LIZ("CKResource", "DiskLruCache: close: LRU optimization is disabled, delete file here");
                    LJIJJLI(this.LIZLLL);
                }
                C13SM c13sm = this.LJIILIIL;
                if (c13sm != null) {
                    c13sm.close();
                }
                this.LJIILIIL = null;
                this.LJIILLIIL = true;
            }
            c2278408wI.LIZIZ();
            if (C20012413Ry.LJFF(this.LIZ)) {
                C13SB.LJIIJ(this.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJIIZILJ.getValue()).booleanValue();
    }

    public final Set<String> LJIIJ() {
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            Set<String> setLLIIJI = C13LP.LLIIJI(new LinkedHashSet(this.LJIJI.keySet()));
            c2278408wI.LIZIZ();
            return setLLIIJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SG.LJIIJJI():void");
    }

    public final void LJIIL() {
        if (this.LJIILL) {
            return;
        }
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            if (C13SB.LIZLLL(this.LJIIIZ)) {
                if (!C13SB.LIZLLL(this.LJII)) {
                    C13SJ.LIZIZ(this.LJIIIZ, this.LJII, false);
                } else if (C13SB.LJIILLIIL(this.LJIIIZ) && C13SB.LIZLLL(this.LJIIIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete ");
                    sbLIZ.append(this.LJIIIZ);
                    throw new C564610MCl(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (C13SB.LIZLLL(this.LJII)) {
                try {
                    LJIILLIIL();
                    LJIILJJIL();
                    this.LJIILL = true;
                    c2278408wI.LIZIZ();
                    return;
                } catch (C564610MCl e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DiskLruCache ");
                    sbLIZ2.append(this.LIZ);
                    sbLIZ2.append(" is corrupt: ");
                    sbLIZ2.append(e.getMessage());
                    sbLIZ2.append(", removing");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss.getClass();
                    C13SS.LIZIZ("DiskLruCache", strLIZIZ, null);
                    try {
                        LJFF();
                        this.LJIILLIIL = false;
                        LJIIZILJ();
                        this.LJIILL = true;
                        c2278408wI.LIZIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJIILLIIL = false;
                        throw th;
                    }
                }
            }
            LJIIZILJ();
            this.LJIILL = true;
            c2278408wI.LIZIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c2278408wI.LIZIZ();
            throw th2;
        }
    }

    public final boolean LJIILIIL() {
        int i = this.LJIIL;
        return i >= 2000 && i >= this.LJIJI.size();
    }

    public final void LJIILJJIL() {
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LIZ();
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0015, B:9:0x0021, B:8:0x001a, B:11:0x002c, B:20:0x0071, B:22:0x0079, B:23:0x007e, B:15:0x0037, B:19:0x0070, B:16:0x0068), top: B:30:0x0005, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            r6 = this;
            X.08wI r3 = r6.LJIILJJIL
            r3.LIZ()
            X.13M9 r0 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L85
            boolean r0 = X.C13SB.LIZLLL(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L1a
            X.13M9 r0 = r6.LJII     // Catch: java.lang.Throwable -> L85
            boolean r0 = X.C13SB.LIZLLL(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L21
            X.13M9 r0 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L85
            X.C13SB.LJIILLIIL(r0)     // Catch: java.lang.Throwable -> L85
        L1a:
            X.13M9 r0 = r6.LJII     // Catch: java.lang.Throwable -> L85
            boolean r0 = X.C13SB.LIZLLL(r0)     // Catch: java.lang.Throwable -> L85
            goto L2a
        L21:
            X.13M9 r2 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L85
            X.13M9 r1 = r6.LJII     // Catch: java.lang.Throwable -> L85
            r0 = 0
            X.C13SJ.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L85
            goto L1a
        L2a:
            if (r0 == 0) goto L71
            r6.LJIILLIIL()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L85
            r6.LJIILJJIL()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L85
            r3.LIZIZ()
            return
        L36:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> L85
            X.13SS r4 = X.C13SS.LIZ     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "DiskLruCache"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "DiskLruCache "
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Throwable -> L85
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = " is corrupt: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r5.getMessage()     // Catch: java.lang.Throwable -> L85
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = ", removing"
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L85
            r4.getClass()     // Catch: java.lang.Throwable -> L85
            r0 = 0
            X.C13SS.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L85
            r6.LJFF()     // Catch: java.lang.Throwable -> L6c
            goto L71
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L85
        L71:
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Throwable -> L85
            boolean r0 = X.C13SB.LJ(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L7e
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Throwable -> L85
            X.C13SB.LJIIJ(r0)     // Catch: java.lang.Throwable -> L85
        L7e:
            r6.LJIIZILJ()     // Catch: java.lang.Throwable -> L85
            r3.LIZIZ()
            return
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L85
            r3.LIZIZ()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SG.LJIILL():void");
    }

    public final void LJIILLIIL() {
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LIZIZ();
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final void LJIIZILJ() {
        C13SD c13sdLJIILIIL;
        C13SS.LIZ.getClass();
        C13SS.LIZ("DiskLruCache", "rebuildJournal");
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            C13SM c13sm = this.LJIILIIL;
            if (c13sm != null) {
                c13sm.close();
            }
            try {
                c13sdLJIILIIL = C13SB.LJIILIIL(this.LJIIIIZZ, false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String str = this.LJIIIIZZ.LIZ;
                if (str != null) {
                    new C0VSJ(str).getAbsoluteFile().createNewFile();
                }
                c13sdLJIILIIL = C13SB.LJIILIIL(this.LJIIIIZZ, false);
            }
            if (c13sdLJIILIIL == null) {
                c2278408wI.LIZIZ();
                return;
            }
            C13SM c13sm2 = new C13SM(c13sdLJIILIIL);
            try {
                c13sm2.LIZIZ("libcore.io.DiskLruCache");
                c13sm2.LIZIZ("\n");
                c13sm2.LIZIZ("1");
                c13sm2.LIZIZ("\n");
                if (this.LJFF) {
                    c13sm2.LIZIZ(CardStruct.IStatusCode.DEFAULT);
                } else {
                    c13sm2.LIZIZ(String.valueOf(this.LIZIZ));
                }
                c13sm2.LIZIZ("\n");
                c13sm2.LIZIZ(String.valueOf(this.LIZJ));
                c13sm2.LIZIZ("\n");
                c13sm2.LIZIZ("\n");
                for (C13SI c13si : this.LJIJI.values()) {
                    if (c13si.LIZLLL != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DIRTY ");
                        sbLIZ.append(c13si.LIZ);
                        sbLIZ.append('\n');
                        c13sm2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    } else if (LJIIIIZZ()) {
                        C13SM c13sm3 = this.LJIILIIL;
                        if (c13sm3 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("CLEAN ");
                            sbLIZ2.append(c13si.LIZ);
                            sbLIZ2.append(' ');
                            sbLIZ2.append(c13si.LJFF);
                            sbLIZ2.append(c13si.LIZJ());
                            sbLIZ2.append('\n');
                            c13sm3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("CLEAN ");
                        sbLIZ3.append(c13si.LIZ);
                        sbLIZ3.append(c13si.LIZJ());
                        sbLIZ3.append('\n');
                        c13sm2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (c13si.LJ.size() > 0 && c13si.LJ.get(0).longValue() > 0) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("USE ");
                        sbLIZ4.append(c13si.LIZ);
                        sbLIZ4.append(c13si.LIZLLL());
                        sbLIZ4.append('\n');
                        c13sm2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                c13sm2.close();
                if (C13SB.LIZLLL(this.LJII)) {
                    C13SJ.LIZIZ(this.LJII, this.LJIIIZ, true);
                }
                C13SJ.LIZIZ(this.LJIIIIZZ, this.LJII, false);
                C13SB.LJIILLIIL(this.LJIIIZ);
                this.LJIILIIL = new C13SM(C13SB.LJIILIIL(this.LJII, true));
                c2278408wI.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c13sm2.close();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c2278408wI.LIZIZ();
            throw th2;
        }
    }

    public final void LJIL() {
        long j = C19997713Mh.LJ.cacheAfterCleanMb;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnableEffectCleanupOnUsing: trimToSizeOnUsing start directory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" size: ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(" sizeAfterClear: ");
        sbLIZ.append(j);
        sbLIZ.append(", caller=");
        sbLIZ.append(C20519082b.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("CKResource", strLIZIZ, null);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        C13QE c13qeLIZ = C13QF.LIZ();
        long jLJZL = 0;
        for (Map.Entry<String, C13SI> entry : this.LJIJI.entrySet()) {
            C13SP c13sp = this.LJ;
            if (c13sp == null || !c13sp.LIZ(entry.getKey())) {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("remove ");
                sbLIZ2.append(entry.getKey());
                sbLIZ2.append(" because exceed to maxSize(");
                sbLIZ2.append(this.LIZLLL);
                sbLIZ2.append(')');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LIZ("DiskLruCache", strLIZIZ2);
                jLJZL += C13LP.LJZL(entry.getValue().LIZIZ);
                linkedHashSet.add(entry.getKey());
                if (this.LJIIJ - jLJZL < j) {
                    break;
                }
            }
        }
        if (jLJZL > 0) {
            for (String str : linkedHashSet) {
                try {
                    LJIJ(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13SS c13ss3 = C13SS.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Failed to remove key ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(": ");
                    sbLIZ3.append(e.getMessage());
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    c13ss3.getClass();
                    C13SS.LIZIZ("DiskLruCache", strLIZIZ3, null);
                }
            }
            C13SS c13ss4 = C13SS.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("EnableEffectCleanupOnUsing: trimToSizeOnUsing finished. clearKeys: ");
            sbLIZ4.append(linkedHashSet);
            sbLIZ4.append(", currentSize: ");
            sbLIZ4.append(this.LJIIJ);
            sbLIZ4.append(", currentMaxSize: ");
            sbLIZ4.append(this.LIZLLL);
            sbLIZ4.append(", clearSize: ");
            sbLIZ4.append(jLJZL);
            sbLIZ4.append(", duration: ");
            sbLIZ4.append(c13qeLIZ.LIZ());
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            c13ss4.getClass();
            C13SS.LIZIZ("CKResource", strLIZIZ4, null);
            InterfaceC20004913Pb interfaceC20004913Pb = this.LJIJJ;
            if (interfaceC20004913Pb != null) {
                interfaceC20004913Pb.LIZ(2, C13LP.LLIIII(linkedHashSet), this.LJIIJ, this.LIZLLL, jLJZL, c13qeLIZ.LIZ());
            }
        }
    }

    public static long LJIIIZ(C13M9 c13m9) {
        String str;
        String str2;
        if (LJJI.getValue().booleanValue()) {
            if (c13m9 != null && (str2 = c13m9.LIZ) != null) {
                return C08QQ.LIZ(str2);
            }
            return 0L;
        }
        C20012513Rz c20012513RzLJFF = C13SB.LJFF(c13m9);
        if (c20012513RzLJFF != null) {
            if (c20012513RzLJFF.LJ == EnumC1287920jcU.Directory) {
                if (c13m9 != null) {
                    str = c13m9.LIZ;
                } else {
                    str = null;
                }
                return C20012413Ry.LJIIJ(str);
            }
            Long l = c20012513RzLJFF.LIZLLL;
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    public static boolean LJJ(String str) {
        return LJJ.matches(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SG.LIZJ(java.lang.String):boolean");
    }

    public final C13SL LJII(String str) {
        C20008813Qo c20008813Qo;
        if (str == null) {
            return null;
        }
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LJIIL();
            LIZLLL();
            if (LJJ(str)) {
                C13SI c13si = this.LJIJI.get(str);
                if (c13si == null) {
                    c2278408wI.LIZIZ();
                    return null;
                }
                if (!c13si.LIZJ) {
                    c2278408wI.LIZIZ();
                    return null;
                }
                int i = this.LIZJ;
                C20008813Qo[] c20008813QoArr = new C20008813Qo[i];
                C13M9[] c13m9Arr = new C13M9[i];
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        C13M9 c13m9LIZ = c13si.LIZ(i2);
                        c13m9Arr[i2] = c13m9LIZ;
                        if (c13m9LIZ != null) {
                            c20008813QoArr[i2] = C13SB.LJIIJJI(c13m9LIZ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        for (int i3 = 0; i3 < this.LIZJ && (c20008813Qo = c20008813QoArr[i3]) != null; i3++) {
                            C13SB.LIZIZ(c20008813Qo);
                        }
                        c2278408wI.LIZIZ();
                        return null;
                    }
                }
                this.LJIIL++;
                C13SM c13sm = this.LJIILIIL;
                if (c13sm != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("READ ");
                    sbLIZ.append(str);
                    sbLIZ.append('\n');
                    c13sm.LIZ.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                }
                if (LJIILIIL()) {
                    this.LJIJJLI.execute(this.LJIL);
                }
                C13LP.LLIIIILZ(c13si.LIZIZ);
                C13SL c13sl = new C13SL(c13m9Arr, c20008813QoArr);
                c2278408wI.LIZIZ();
                return c13sl;
            }
            LJIJ(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sbLIZ2.append(str);
            sbLIZ2.append('\"');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final boolean LJIJ(String str) {
        Pair<Boolean, C13SO> pair;
        C13SO second;
        if (str == null) {
            return false;
        }
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LJIIL();
            LIZLLL();
            if (LJJ(str)) {
                C13SI c13si = this.LJIJI.get(str);
                if (c13si != null && c13si.LIZLLL == null) {
                    this.LJIIL++;
                    C13SM c13sm = this.LJIILIIL;
                    if (c13sm != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("REMOVE ");
                        sbLIZ.append(str);
                        sbLIZ.append('\n');
                        c13sm.LIZ.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C13SM c13sm2 = this.LJIILIIL;
                    if (c13sm2 != null) {
                        c13sm2.LIZ();
                    }
                    this.LJIJI.remove(str);
                    int i = this.LIZJ;
                    for (int i2 = 0; i2 < i; i2++) {
                        C13M9 c13m9LIZ = c13si.LIZ(i2);
                        try {
                            C20012413Ry.LJ(c13m9LIZ);
                            if (LJIIIIZZ() && (pair = this.LJI) != null && (second = pair.getSecond()) != null && second.LIZIZ(c13si.LJFF)) {
                                this.LJIIJJI -= c13si.LIZIZ.get(i2).longValue();
                            } else {
                                this.LJIIJ -= c13si.LIZIZ.get(i2).longValue();
                            }
                            c13si.LIZIZ.set(i2, 0L);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("failed to delete ");
                            sbLIZ2.append(c13m9LIZ);
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    if (LJIILIIL()) {
                        this.LJIJJLI.execute(this.LJIL);
                    }
                    c2278408wI.LIZIZ();
                    return true;
                }
                c2278408wI.LIZIZ();
                return false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sbLIZ3.append(str);
            sbLIZ3.append('\"');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final Pair<Integer, Long> LJIJI(long j) {
        long jLongValue;
        List<Long> list;
        C13SP c13sp;
        C13SO second;
        Double d;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeUnused trace: directory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", caller=");
        sbLIZ.append(C20519082b.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LJ("CKResource", strLIZIZ);
        C13QE c13qeLIZ = C13QF.LIZ();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LJIIL();
            LIZLLL();
            Iterator<T> it2 = this.LJIJI.entrySet().iterator();
            while (true) {
                long jDoubleValue = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((C13SI) entry.getValue()).LJ.size() > 0 && ((C13SI) entry.getValue()).LJ.get(0).longValue() <= 0 && C13SB.LIZLLL(((C13SI) entry.getValue()).LIZ(0))) {
                    C20012513Rz c20012513RzLJFF = C13SB.LJFF(((C13SI) entry.getValue()).LIZ(0));
                    if (c20012513RzLJFF != null && (d = c20012513RzLJFF.LIZJ) != null) {
                        jDoubleValue = (long) d.doubleValue();
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((String) entry.getKey());
                    sbLIZ2.append(":modifiedAt:");
                    sbLIZ2.append(jDoubleValue);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("DiskLruCache", strLIZIZ2);
                    ((C13SI) entry.getValue()).LJ.set(0, Long.valueOf(jDoubleValue));
                }
                if (LJIIIIZZ()) {
                    Pair<Boolean, C13SO> pair = this.LJI;
                    if (pair != null && (second = pair.getSecond()) != null && second.LIZ() && System.currentTimeMillis() - ((C13SI) entry.getValue()).LJ.get(0).longValue() > this.LJI.getSecond().LJ()) {
                        c13sp = this.LJ;
                        if (c13sp == null && c13sp.LIZ((String) entry.getKey())) {
                            C13SS c13ss3 = C13SS.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append((String) entry.getKey());
                            sbLIZ3.append(" cannot remove because in allowlist");
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            c13ss3.getClass();
                            C13SS.LIZ("DiskLruCache", strLIZIZ3);
                        } else {
                            linkedHashSet.add(entry.getKey());
                        }
                    } else {
                        C13SS c13ss4 = C13SS.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append((String) entry.getKey());
                        sbLIZ4.append(" not exceeding the usage time");
                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                        c13ss4.getClass();
                        C13SS.LIZ("DiskLruCache", strLIZIZ4);
                    }
                } else if (System.currentTimeMillis() - ((C13SI) entry.getValue()).LJ.get(0).longValue() > j) {
                    c13sp = this.LJ;
                    if (c13sp == null) {
                    }
                    linkedHashSet.add(entry.getKey());
                } else {
                    C13SS c13ss42 = C13SS.LIZ;
                    StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                    sbLIZ42.append((String) entry.getKey());
                    sbLIZ42.append(" not exceeding the usage time");
                    String strLIZIZ42 = C2188811AlT.LIZIZ(sbLIZ42);
                    c13ss42.getClass();
                    C13SS.LIZ("DiskLruCache", strLIZIZ42);
                }
            }
            c2278408wI.LIZIZ();
            long j2 = 0;
            for (String str : linkedHashSet) {
                if (!C20002113Nz.LIZ) {
                    C13SS c13ss5 = C13SS.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("remove ");
                    sbLIZ5.append(str);
                    sbLIZ5.append(" because that have not been used for a period of time.");
                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
                    c13ss5.getClass();
                    C13SS.LIZ("DiskLruCache", strLIZIZ5);
                    C13SI c13si = this.LJIJI.get(str);
                    if (c13si != null && (list = c13si.LIZIZ) != null) {
                        jLongValue = ((Number) ListProtector.get(list, 0)).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (LJIJ(str)) {
                        j2 += jLongValue;
                    }
                }
            }
            C13SS c13ss6 = C13SS.LIZ;
            String str2 = "DiskLruCache: remove unused resources finished. isAborted: " + C20002113Nz.LIZ + " clearKeys: " + linkedHashSet + ", currentSize: " + this.LJIIJ + ", currentMaxSize: " + this.LIZLLL + ", clearSize: " + j2 + ", duration: " + c13qeLIZ.LIZ();
            c13ss6.getClass();
            C13SS.LIZ("CKResource", str2);
            InterfaceC20004913Pb interfaceC20004913Pb = this.LJIJJ;
            if (interfaceC20004913Pb != null) {
                interfaceC20004913Pb.LIZ(1, C13LP.LLIIII(linkedHashSet), this.LJIIJ, this.LIZLLL, j2, c13qeLIZ.LIZ());
            }
            return new Pair<>(Integer.valueOf(linkedHashSet.size()), Long.valueOf(j2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final Pair<Integer, Long> LJIJJ(long j) {
        if (C20002113Nz.LIZ) {
            C13SS.LIZ.getClass();
            C13SS.LJ("CKResource", "triggerCacheClean: failed to trigger cache clean, abort by client side!");
            return new Pair<>(0, 0L);
        }
        C13SS.LIZ.getClass();
        C13SS.LIZ("CKResource", "triggerCacheClean: start to clean cache!");
        Pair<Integer, Long> pairLJIJI = LJIJI(j);
        Pair<Integer, Long> pair = new Pair<>(0, 0L);
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            if (LJIIIIZZ()) {
                LJIIJJI();
            } else {
                pair = LJIJJLI(this.LIZLLL);
            }
            c2278408wI.LIZIZ();
            return new Pair<>(Integer.valueOf(pairLJIJI.getFirst().intValue() + pair.getFirst().intValue()), Long.valueOf(pairLJIJI.getSecond().longValue() + pair.getSecond().longValue()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final Pair<Integer, Long> LJIJJLI(long j) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiskLruCache: trimToSize start... directory=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needAbortCleanup: ");
        sbLIZ.append(C20002113Nz.LIZ);
        sbLIZ.append(", size: ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(" maxSize: ");
        sbLIZ.append(j);
        sbLIZ.append(", caller=");
        sbLIZ.append(C20519082b.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LJ("CKResource", strLIZIZ);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C13QE c13qeLIZ = C13QF.LIZ();
        long jLJZL = 0;
        while (!C20002113Nz.LIZ && this.LJIIJ > j) {
            int size = this.LJIJI.size();
            int i = 0;
            for (Map.Entry<String, C13SI> entry : this.LJIJI.entrySet()) {
                C13SP c13sp = this.LJ;
                if (c13sp != null && c13sp.LIZ(entry.getKey())) {
                    i++;
                } else {
                    if (size - i < 10) {
                        C2278408wI c2278408wI = this.LJIILJJIL;
                        c2278408wI.LIZ();
                        try {
                            long j2 = this.LIZLLL;
                            c2278408wI.LIZIZ();
                            long j3 = j2 * ((long) 2);
                            c2278408wI = this.LJIILJJIL;
                            c2278408wI.LIZ();
                            try {
                                this.LIZLLL = j3;
                                if (this.LJIILL) {
                                    this.LJIJJLI.execute(this.LJIL);
                                }
                                c2278408wI.LIZIZ();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("remove ");
                    sbLIZ2.append(entry.getKey());
                    sbLIZ2.append(" because exceed to maxSize(");
                    sbLIZ2.append(j);
                    sbLIZ2.append(')');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("DiskLruCache", strLIZIZ2);
                    jLJZL += C13LP.LJZL(entry.getValue().LIZIZ);
                    linkedHashSet.add(entry.getKey());
                    LJIJ(entry.getKey());
                }
            }
        }
        if (jLJZL > 0) {
            C13SS c13ss3 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("DiskLruCache: trimToSize finished. isAborted: ");
            sbLIZ3.append(C20002113Nz.LIZ);
            sbLIZ3.append(", clearKeys: ");
            sbLIZ3.append(linkedHashSet);
            sbLIZ3.append(", currentSize: ");
            sbLIZ3.append(this.LJIIJ);
            sbLIZ3.append(", currentMaxSize: ");
            sbLIZ3.append(j);
            sbLIZ3.append(", clearSize: ");
            sbLIZ3.append(jLJZL);
            sbLIZ3.append(", duration: ");
            sbLIZ3.append(c13qeLIZ.LIZ());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss3.getClass();
            C13SS.LIZ("CKResource", strLIZIZ3);
            InterfaceC20004913Pb interfaceC20004913Pb = this.LJIJJ;
            if (interfaceC20004913Pb != null) {
                interfaceC20004913Pb.LIZ(0, C13LP.LLIIII(linkedHashSet), this.LJIIJ, j, jLJZL, c13qeLIZ.LIZ());
            }
        }
        return new Pair<>(Integer.valueOf(linkedHashSet.size()), Long.valueOf(jLJZL));
    }

    public final void LJ(C13SK c13sk, boolean z) {
        long j;
        long jLongValue;
        Pair<Boolean, C13SO> pair;
        C13SO second;
        Long l;
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            C13SI c13si = c13sk.LIZ;
            if (Intrinsics.LJFF(c13si.LIZLLL, c13sk)) {
                if (z && !c13si.LIZJ) {
                    int i = this.LIZJ;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (c13sk.LIZIZ[i2]) {
                            if (c13si.LIZIZ(i2) != null && !C13SB.LIZLLL(c13si.LIZIZ(i2))) {
                                c13sk.LIZ();
                                c2278408wI.LIZIZ();
                                return;
                            }
                        } else {
                            c13sk.LIZ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Newly created entry didn't create value for index ");
                            sbLIZ.append(i2);
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                int i3 = this.LIZJ;
                for (int i4 = 0; i4 < i3; i4++) {
                    C13M9 c13m9LIZIZ = c13si.LIZIZ(i4);
                    if (c13m9LIZIZ != null) {
                        if (z) {
                            if (C13SB.LIZLLL(c13m9LIZIZ)) {
                                C13M9 c13m9LIZ = c13si.LIZ(i4);
                                C13SB.LJIJ(c13m9LIZIZ, c13m9LIZ);
                                long jLongValue2 = c13si.LIZIZ.get(i4).longValue();
                                C20012513Rz c20012513RzLJFF = C13SB.LJFF(c13m9LIZ);
                                if (c20012513RzLJFF != null && (l = c20012513RzLJFF.LIZLLL) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                c13si.LIZIZ.set(i4, Long.valueOf(jLongValue));
                                if (LJIIIIZZ() && (pair = this.LJI) != null && (second = pair.getSecond()) != null && second.LIZIZ(c13si.LJFF)) {
                                    this.LJIIJJI = (this.LJIIJJI - jLongValue2) + jLongValue;
                                } else {
                                    this.LJIIJ = (this.LJIIJ - jLongValue2) + jLongValue;
                                }
                            }
                        } else {
                            C20012413Ry.LJ(c13m9LIZIZ);
                        }
                    }
                }
                this.LJIIL++;
                c13si.LIZLLL = null;
                if (c13si.LIZJ | z) {
                    c13si.LIZJ = true;
                    if (LJIIIIZZ()) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("completeEdit: entry.panel: ");
                        sbLIZ2.append(c13si.LJFF);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss.getClass();
                        C13SS.LIZ("EffectResourceLevelOpt", strLIZIZ);
                        C13SM c13sm = this.LJIILIIL;
                        if (c13sm != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("CLEAN ");
                            sbLIZ3.append(c13si.LIZ);
                            sbLIZ3.append(' ');
                            sbLIZ3.append(c13si.LJFF);
                            sbLIZ3.append(c13si.LIZJ());
                            sbLIZ3.append('\n');
                            c13sm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        C13SM c13sm2 = this.LJIILIIL;
                        if (c13sm2 != null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("CLEAN ");
                            sbLIZ4.append(c13si.LIZ);
                            sbLIZ4.append(c13si.LIZJ());
                            sbLIZ4.append('\n');
                            c13sm2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                    if (z) {
                        this.LJIJ++;
                        c13si.getClass();
                    }
                } else {
                    this.LJIJI.remove(c13si.LIZ);
                    C13SM c13sm3 = this.LJIILIIL;
                    if (c13sm3 != null) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("REMOVE ");
                        sbLIZ5.append(c13si.LIZ);
                        sbLIZ5.append('\n');
                        c13sm3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                C13SM c13sm4 = this.LJIILIIL;
                if (c13sm4 != null) {
                    c13sm4.LIZ();
                }
                EffectCleanConfig effectCleanConfig = C19997713Mh.LJ;
                if (effectCleanConfig.isOpen) {
                    j = effectCleanConfig.cacheThresholdMb;
                } else {
                    j = this.LIZLLL;
                }
                if (this.LJIIJ > j || LJIILIIL()) {
                    this.LJIJJLI.execute(this.LJIL);
                }
                c2278408wI.LIZIZ();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final C13SK LJI(String str, String str2) {
        C13SK c13sk = null;
        if (str == null) {
            return null;
        }
        C2278408wI c2278408wI = this.LJIILJJIL;
        c2278408wI.LIZ();
        try {
            LJIIL();
            LIZLLL();
            if (LJJ(str)) {
                C13SI c13si = this.LJIJI.get(str);
                if (c13si == null) {
                    c13si = new C13SI(this, str);
                    this.LJIJI.put(str, c13si);
                } else {
                    if (c13si.LIZLLL != null) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("key: ");
                        sbLIZ.append(str);
                        sbLIZ.append(" is now in editing, return null!");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("DiskLruCache", strLIZIZ);
                    }
                    c2278408wI.LIZIZ();
                    return c13sk;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("panel_");
                sbLIZ2.append(str2);
                c13si.LJFF = C2188811AlT.LIZIZ(sbLIZ2);
                c13sk = new C13SK(this, c13si);
                c13si.LIZLLL = c13sk;
                C13SM c13sm = this.LJIILIIL;
                if (c13sm != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("DIRTY ");
                    sbLIZ3.append(str);
                    sbLIZ3.append('\n');
                    c13sm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C13SM c13sm2 = this.LJIILIIL;
                if (c13sm2 != null) {
                    c13sm2.LIZ();
                }
                c2278408wI.LIZIZ();
                return c13sk;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sbLIZ4.append(str);
            sbLIZ4.append('\"');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13SG(String str, int i, int i2, long j, C13SP c13sp, boolean z, Pair<Boolean, ? extends C13SO> pair) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = c13sp;
        this.LJFF = z;
        this.LJI = pair;
        this.LJII = new C13M9(str).LIZ("journal");
        this.LJIIIIZZ = new C13M9(str).LIZ("journal.tmp");
        this.LJIIIZ = new C13M9(str).LIZ("journal.bkp");
    }
}
