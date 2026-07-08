package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13YE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YE {
    public static C13BZ LIZLLL;
    public static long LJ;
    public static List<? extends Function2<? super Set<? extends Object>, ? super C13YG, Unit>> LJII;
    public static List<? extends Function1<Object, Unit>> LJIIIIZZ;
    public static final C13YB LJIIIZ;
    public static final C1514410pVn LJIIJ;
    public static final C13YC LIZ = new C13YC();
    public static final C13YU<C13YG> LIZIZ = new C13YU<>();
    public static final Object LIZJ = new Object();
    public static final C13YN LJFF = new C13YN();
    public static final C13YO<C13YP> LJI = new C13YO<>();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.13YB, X.13YG] */
    static {
        LIZLLL = C13BZ.LLILZIL;
        LJ = ((long) 1) + 1;
        C13BV c13bv = C13BV.INSTANCE;
        LJII = c13bv;
        LJIIIIZZ = c13bv;
        final long j = LJ;
        LJ = 1 + j;
        ?? r3 = new C13YF(j) { // from class: X.13YB
            @Override // X.C13YF, X.C13YG
            public final void LIZJ() {
                synchronized (C13YE.LIZJ) {
                    try {
                        LJIILJJIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.C13YF, X.C13YG
            public final void LJIIL() {
                C13YE.LJ(C13YE.LIZ);
            }

            @Override // X.C13YF
            public final C13YQ LJIL() {
                "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString();
                throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
            }

            @Override // X.C13YF, X.C13YG
            public final void LJIIJ() {
                C19977013Ei.LIZ();
                throw null;
            }

            @Override // X.C13YF, X.C13YG
            public final void LJIIJJI() {
                C19977013Ei.LIZ();
                throw null;
            }

            {
                C13BZ c13bz = C13BZ.LLILZIL;
                C19977213Ek c19977213Ek = new C19977213Ek();
            }

            @Override // X.C13YF, X.C13YG
            public final C13YG LJIJJ(Function1<Object, Unit> function1) {
                return (C13YG) C13YE.LJ(new AwS609S0100000_30(new AwS609S0100000_30(function1, (Function1<? super EffectPlatformBuilder, Unit>) 260), (Function1<? super EffectPlatformBuilder, Unit>) 262));
            }

            @Override // X.C13YF
            public final C13YF LJJIIJZLJL(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
                return (C13YF) ((C13YG) C13YE.LJ(new AwS609S0100000_30(new AwS396S0200000_30(function1, function12, (Function1<Object, Unit>) 48), (Function1<? super EffectPlatformBuilder, Unit>) 262)));
            }
        };
        LIZLLL = LIZLLL.LJIIIZ(r3.LIZIZ);
        LJIIIZ = r3;
        LJIIJ = new C1514410pVn(0);
    }

    public static final void LJFF() {
        C13YP c13yp;
        C13YO<C13YP> c13yo = LJI;
        int i = c13yo.LIZ;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C256500yx<C13YP> c256500yx = c13yo.LIZJ[i3];
            if (c256500yx != null && (c13yp = c256500yx.get()) != null && !(!LJIILL(c13yp))) {
                if (i2 != i3) {
                    c13yo.LIZJ[i2] = c256500yx;
                    int[] iArr = c13yo.LIZIZ;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            c13yo.LIZJ[i4] = null;
            c13yo.LIZIZ[i4] = 0;
        }
        if (i2 != i) {
            c13yo.LIZ = i2;
        }
    }

    public static final C13YG LJIIIZ() {
        C13YG c13ygLIZ = LIZIZ.LIZ();
        return c13ygLIZ == null ? LJIIIZ : c13ygLIZ;
    }

    public static final void LJIIZILJ() {
        "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString();
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final void LIZJ(C13YG c13yg) {
        Object objValueOf;
        long j;
        C13YF c13yf;
        if (!LIZLLL.LJFF(c13yg.LJI())) {
            StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
            sb.append(c13yg.LJI());
            sb.append(", disposed=");
            sb.append(c13yg.LIZJ);
            sb.append(", applied=");
            if ((c13yg instanceof C13YF) && (c13yf = (C13YF) c13yg) != null) {
                objValueOf = Boolean.valueOf(c13yf.LJIILIIL);
            } else {
                objValueOf = "read-only";
            }
            sb.append(objValueOf);
            sb.append(", lowestPin=");
            synchronized (LIZJ) {
                try {
                    C13YN c13yn = LJFF;
                    if (c13yn.LIZ > 0) {
                        j = c13yn.LIZIZ[0];
                    } else {
                        j = -1;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            sb.append(j);
            String string = sb.toString();
            string.toString();
            throw new IllegalStateException(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T LJ(kotlin.jvm.functions.Function1<? super X.C13BZ, ? extends T> r15) {
        /*
            X.13YB r7 = X.C13YE.LJIIIZ
            java.lang.Object r2 = X.C13YE.LIZJ
            monitor-enter(r2)
            X.13Kx<X.13YP> r6 = r7.LJIIIIZZ     // Catch: java.lang.Throwable -> L99
            r1 = 1
            if (r6 == 0) goto Lf
            X.0pVn r0 = X.C13YE.LJIIJ     // Catch: java.lang.Throwable -> L99
            r0.add(r1)     // Catch: java.lang.Throwable -> L99
        Lf:
            java.lang.Object r15 = LJIJJLI(r7, r15)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r2)
            if (r6 == 0) goto L40
            r5 = -1
            java.util.List<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super X.13YG, kotlin.Unit>> r4 = X.C13YE.LJII     // Catch: java.lang.Throwable -> L31
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L31
            r2 = 0
        L1e:
            if (r2 >= r3) goto L3b
            java.lang.Object r1 = r4.get(r2)     // Catch: java.lang.Throwable -> L31
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L31
            X.13Kt r0 = new X.13Kt     // Catch: java.lang.Throwable -> L31
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r1.invoke(r0, r7)     // Catch: java.lang.Throwable -> L31
            int r2 = r2 + 1
            goto L1e
        L31:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L31
            X.0pVn r0 = X.C13YE.LJIIJ
            r0.add(r5)
            throw r1
        L3b:
            X.0pVn r0 = X.C13YE.LJIIJ
            r0.add(r5)
        L40:
            java.lang.Object r14 = X.C13YE.LIZJ
            monitor-enter(r14)
            LJFF()     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L97
            java.lang.Object[] r11 = r6.LIZIZ     // Catch: java.lang.Throwable -> L91
            long[] r10 = r6.LIZ     // Catch: java.lang.Throwable -> L91
            int r0 = r10.length     // Catch: java.lang.Throwable -> L91
            int r9 = r0 + (-2)
            if (r9 < 0) goto L97
            r8 = 0
        L52:
            r3 = r10[r8]     // Catch: java.lang.Throwable -> L91
            long r0 = ~r3     // Catch: java.lang.Throwable -> L91
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L8c
            int r0 = r8 - r9
            int r0 = ~r0     // Catch: java.lang.Throwable -> L91
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L6c:
            if (r5 >= r6) goto L8a
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
            r0 = 1
        L78:
            if (r0 == 0) goto L84
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]     // Catch: java.lang.Throwable -> L91
            X.13YP r0 = (X.C13YP) r0     // Catch: java.lang.Throwable -> L91
            LJIILLIIL(r0)     // Catch: java.lang.Throwable -> L91
        L84:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L6c
        L88:
            r0 = 0
            goto L78
        L8a:
            if (r6 != r7) goto L97
        L8c:
            if (r8 == r9) goto L97
            int r8 = r8 + 1
            goto L52
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r14)
            throw r0
        L97:
            monitor-exit(r14)
            return r15
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YE.LJ(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final <T extends AbstractC19977113Ej> T LJII(T t) {
        C13YG c13ygLJIIIZ = LJIIIZ();
        T t2 = (T) LJIJ(t, c13ygLJIIIZ.LJI(), c13ygLJIIIZ.LIZLLL());
        if (t2 == null) {
            synchronized (LIZJ) {
                try {
                    C13YG c13ygLJIIIZ2 = LJIIIZ();
                    t2 = (T) LJIJ(t, c13ygLJIIIZ2.LJI(), c13ygLJIIIZ2.LIZLLL());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (t2 == null) {
                LJIIZILJ();
                throw null;
            }
        }
        return t2;
    }

    public static final boolean LJIILL(C13YP c13yp) {
        AbstractC19977113Ej abstractC19977113Ej;
        C13YN c13yn = LJFF;
        long j = LJ;
        if (c13yn.LIZ > 0) {
            j = c13yn.LIZIZ[0];
        }
        AbstractC19977113Ej abstractC19977113Ej2 = null;
        AbstractC19977113Ej abstractC19977113EjLJIIZILJ = null;
        int i = 0;
        for (AbstractC19977113Ej abstractC19977113EjLJIIZILJ2 = c13yp.LJIIZILJ(); abstractC19977113EjLJIIZILJ2 != null; abstractC19977113EjLJIIZILJ2 = abstractC19977113EjLJIIZILJ2.LIZIZ) {
            long j2 = abstractC19977113EjLJIIZILJ2.LIZ;
            if (j2 != 0) {
                if (j2 < j) {
                    if (abstractC19977113Ej2 == null) {
                        i++;
                        abstractC19977113Ej2 = abstractC19977113EjLJIIZILJ2;
                    } else {
                        if (j2 < abstractC19977113Ej2.LIZ) {
                            abstractC19977113Ej = abstractC19977113Ej2;
                            abstractC19977113Ej2 = abstractC19977113EjLJIIZILJ2;
                        } else {
                            abstractC19977113Ej = abstractC19977113EjLJIIZILJ2;
                        }
                        if (abstractC19977113EjLJIIZILJ == null) {
                            abstractC19977113EjLJIIZILJ = c13yp.LJIIZILJ();
                            AbstractC19977113Ej abstractC19977113Ej3 = abstractC19977113EjLJIIZILJ;
                            while (true) {
                                if (abstractC19977113EjLJIIZILJ != null) {
                                    long j3 = abstractC19977113EjLJIIZILJ.LIZ;
                                    if (j3 >= j) {
                                        break;
                                    }
                                    if (abstractC19977113Ej3.LIZ < j3) {
                                        abstractC19977113Ej3 = abstractC19977113EjLJIIZILJ;
                                    }
                                    abstractC19977113EjLJIIZILJ = abstractC19977113EjLJIIZILJ.LIZIZ;
                                } else {
                                    abstractC19977113EjLJIIZILJ = abstractC19977113Ej3;
                                    break;
                                }
                            }
                        }
                        abstractC19977113Ej2.LIZ = 0L;
                        abstractC19977113Ej2.LIZ(abstractC19977113EjLJIIZILJ);
                        abstractC19977113Ej2 = abstractC19977113Ej;
                    }
                } else {
                    i++;
                }
            }
        }
        if (i <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        if (r2 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(final X.C13YP r10) {
        /*
            boolean r0 = LJIILL(r10)
            if (r0 == 0) goto L7f
            X.13YO<X.13YP> r6 = X.C13YE.LJI
            int r5 = r6.LIZ
            int r4 = java.lang.System.identityHashCode(r10)
            r3 = 0
            r2 = -1
            if (r5 <= 0) goto L80
            int r0 = r6.LIZ
            int r7 = r0 + (-1)
            r1 = 0
        L17:
            if (r1 > r7) goto L7a
            int r0 = r1 + r7
            int r8 = r0 >>> 1
            int[] r0 = r6.LIZIZ
            r0 = r0[r8]
            if (r0 >= r4) goto L26
            int r1 = r8 + 1
            goto L17
        L26:
            if (r0 <= r4) goto L2b
            int r7 = r8 + (-1)
            goto L17
        L2b:
            X.00yx<T>[] r0 = r6.LIZJ
            r0 = r0[r8]
            r7 = 0
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.get()
        L36:
            if (r10 != r0) goto L3c
            r2 = r8
            goto L7d
        L3a:
            r0 = r7
            goto L36
        L3c:
            int r1 = r8 + (-1)
        L3e:
            if (r2 >= r1) goto L57
            int[] r0 = r6.LIZIZ
            r0 = r0[r1]
            if (r0 != r4) goto L57
            X.00yx<T>[] r0 = r6.LIZJ
            r0 = r0[r1]
            if (r0 == 0) goto L55
            java.lang.Object r0 = r0.get()
        L50:
            if (r0 == r10) goto L7f
            int r1 = r1 + (-1)
            goto L3e
        L55:
            r0 = r7
            goto L50
        L57:
            int r2 = r8 + 1
            int r1 = r6.LIZ
        L5b:
            if (r2 >= r1) goto L74
            int[] r0 = r6.LIZIZ
            r0 = r0[r2]
            if (r0 != r4) goto L76
            X.00yx<T>[] r0 = r6.LIZJ
            r0 = r0[r2]
            if (r0 == 0) goto L72
            java.lang.Object r0 = r0.get()
        L6d:
            if (r0 == r10) goto L7d
            int r2 = r2 + 1
            goto L5b
        L72:
            r0 = r7
            goto L6d
        L74:
            int r2 = r6.LIZ
        L76:
            int r0 = r2 + 1
            int r2 = -r0
            goto L7d
        L7a:
            int r0 = r1 + 1
            int r2 = -r0
        L7d:
            if (r2 < 0) goto L80
        L7f:
            return
        L80:
            int r0 = r2 + 1
            int r2 = -r0
            X.00yx<T>[] r9 = r6.LIZJ
            int r0 = r9.length
            if (r5 != r0) goto Lbc
            int r0 = r0 * 2
            X.00yx[] r8 = new X.C256500yx[r0]
            int[] r7 = new int[r0]
            int r1 = r2 + 1
            int r5 = r5 - r2
            java.lang.System.arraycopy(r9, r2, r8, r1, r5)
            X.00yx<T>[] r0 = r6.LIZJ
            java.lang.System.arraycopy(r0, r3, r8, r3, r2)
            int[] r0 = r6.LIZIZ
            java.lang.System.arraycopy(r0, r2, r7, r1, r5)
            int[] r1 = r6.LIZIZ
            r0 = 6
            X.C13DL.LIZLLL(r1, r7, r3, r2, r0)
            r6.LIZJ = r8
            r6.LIZIZ = r7
        La8:
            X.00yx<T>[] r1 = r6.LIZJ
            X.00yx r0 = new X.00yx
            r0.<init>(r10)
            r1[r2] = r0
            int[] r0 = r6.LIZIZ
            r0[r2] = r4
            int r0 = r6.LIZ
            int r0 = r0 + 1
            r6.LIZ = r0
            return
        Lbc:
            int r1 = r2 + 1
            int r5 = r5 - r2
            java.lang.System.arraycopy(r9, r2, r9, r1, r5)
            int[] r0 = r6.LIZIZ
            java.lang.System.arraycopy(r0, r2, r0, r1, r5)
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YE.LJIILLIIL(X.13YP):void");
    }

    public static final void LJIJJ(int i) {
        C13YN c13yn = LJFF;
        int i2 = c13yn.LIZLLL[i];
        c13yn.LIZIZ(i2, c13yn.LIZ - 1);
        c13yn.LIZ--;
        long[] jArr = c13yn.LIZIZ;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (jArr[i4] <= j) {
                break;
            }
            c13yn.LIZIZ(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = c13yn.LIZIZ;
        int i5 = c13yn.LIZ >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c13yn.LIZ) {
                long j2 = jArr2[i6];
                if (j2 < jArr2[i7]) {
                    if (j2 >= jArr2[i2]) {
                        break;
                    }
                    c13yn.LIZIZ(i6, i2);
                    i2 = i6;
                }
            }
            if (jArr2[i7] >= jArr2[i2]) {
                break;
            }
            c13yn.LIZIZ(i7, i2);
            i2 = i7;
        }
        c13yn.LIZLLL[i] = c13yn.LJ;
        c13yn.LJ = i;
    }

    public static final Function1 LIZ(Function1 function1, Function1 function12) {
        if (function1 != null) {
            if (function12 != null && function1 != function12) {
                return new AwS384S0200000_18(function1, (Function1<Object, Unit>) function12, (Function1<Object, Unit>) 236);
            }
            return function1;
        }
        return function12;
    }

    public static final <T extends AbstractC19977113Ej> T LJIIIIZZ(T t, C13YG c13yg) {
        T t2 = (T) LJIJ(t, c13yg.LJI(), c13yg.LIZLLL());
        if (t2 == null) {
            synchronized (LIZJ) {
                try {
                    t2 = (T) LJIJ(t, c13yg.LJI(), c13yg.LIZLLL());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (t2 == null) {
                LJIIZILJ();
                throw null;
            }
        }
        return t2;
    }

    public static final <T extends AbstractC19977113Ej> T LJIIJJI(T t, C13YP c13yp) {
        AbstractC19977113Ej abstractC19977113EjLJIIZILJ = c13yp.LJIIZILJ();
        C13YN c13yn = LJFF;
        long j = LJ;
        if (c13yn.LIZ > 0) {
            j = c13yn.LIZIZ[0];
        }
        long j2 = j - 1;
        C13BZ c13bz = C13BZ.LLILZIL;
        T t2 = null;
        AbstractC19977113Ej abstractC19977113Ej = null;
        while (true) {
            if (abstractC19977113EjLJIIZILJ == null) {
                break;
            }
            long j3 = abstractC19977113EjLJIIZILJ.LIZ;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && j3 <= j2 && !c13bz.LJFF(j3)) {
                if (abstractC19977113Ej == null) {
                    abstractC19977113Ej = abstractC19977113EjLJIIZILJ;
                } else if (abstractC19977113EjLJIIZILJ.LIZ >= abstractC19977113Ej.LIZ) {
                    t2 = (T) abstractC19977113Ej;
                }
            }
            abstractC19977113EjLJIIZILJ = abstractC19977113EjLJIIZILJ.LIZIZ;
        }
        t2 = (T) abstractC19977113EjLJIIZILJ;
        if (t2 != null) {
            t2.LIZ = Long.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.LIZJ(Long.MAX_VALUE);
        t3.LIZIZ = c13yp.LJIIZILJ();
        c13yp.LJIIL(t3);
        return t3;
    }

    public static final void LJIILIIL(C13YG c13yg, C13YP c13yp) {
        c13yg.LJIJI(c13yg.LJII() + 1);
        Function1<Object, Unit> function1LJIIIIZZ = c13yg.LJIIIIZZ();
        if (function1LJIIIIZZ != null) {
            function1LJIIIIZZ.invoke(c13yp);
        }
    }

    public static final <T extends AbstractC19977113Ej> T LJIJI(T t, C13YP c13yp) {
        C13YG c13ygLJIIIZ = LJIIIZ();
        Function1<Object, Unit> function1LJ = c13ygLJIIIZ.LJ();
        if (function1LJ != null) {
            function1LJ.invoke(c13yp);
        }
        T t2 = (T) LJIJ(t, c13ygLJIIIZ.LJI(), c13ygLJIIIZ.LIZLLL());
        if (t2 == null) {
            synchronized (LIZJ) {
                try {
                    C13YG c13ygLJIIIZ2 = LJIIIZ();
                    t2 = (T) LJIJ(c13yp.LJIIZILJ(), c13ygLJIIIZ2.LJI(), c13ygLJIIIZ2.LIZLLL());
                    if (t2 == null) {
                        LJIIZILJ();
                        throw null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return t2;
    }

    public static final <T> T LJIJJLI(C13YB c13yb, Function1<? super C13BZ, ? extends T> function1) {
        long j = c13yb.LIZIZ;
        T tInvoke = function1.invoke(LIZLLL.LJ(j));
        long j2 = LJ;
        LJ = 1 + j2;
        C13BZ c13bzLJ = LIZLLL.LJ(j);
        LIZLLL = c13bzLJ;
        c13yb.LIZIZ = j2;
        c13yb.LIZ = c13bzLJ;
        c13yb.LJII = 0;
        c13yb.LJIIIIZZ = null;
        c13yb.LJIILJJIL();
        LIZLLL = LIZLLL.LJIIIZ(j2);
        return tInvoke;
    }

    public static final Map LIZIZ(long j, C13YF c13yf, C13BZ c13bz) {
        C13YP c13yp;
        AbstractC19977113Ej abstractC19977113EjLJIIZILJ;
        AbstractC19977113Ej abstractC19977113EjLJIJ;
        AbstractC19977113Ej abstractC19977113EjLJIJ2;
        C19994113Kx<C13YP> c19994113KxLJJ = c13yf.LJJ();
        if (c19994113KxLJJ != null) {
            C13BZ c13bzLJIIIIZZ = c13yf.LIZLLL().LJIIIZ(c13yf.LJI()).LJIIIIZZ(c13yf.LJIIJ);
            Object[] objArr = c19994113KxLJJ.LIZIZ;
            long[] jArr = c19994113KxLJJ.LIZ;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                HashMap map = null;
                loop0: while (true) {
                    long j2 = jArr[i];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j2 & 255) < 128 && (abstractC19977113EjLJIJ = LJIJ((abstractC19977113EjLJIIZILJ = (c13yp = (C13YP) objArr[(i << 3) + i3]).LJIIZILJ()), j, c13bz)) != null && (abstractC19977113EjLJIJ2 = LJIJ(abstractC19977113EjLJIIZILJ, j, c13bzLJIIIIZZ)) != null && !Intrinsics.LJFF(abstractC19977113EjLJIJ, abstractC19977113EjLJIJ2)) {
                                AbstractC19977113Ej abstractC19977113EjLJIJ3 = LJIJ(abstractC19977113EjLJIIZILJ, c13yf.LJI(), c13yf.LIZLLL());
                                if (abstractC19977113EjLJIJ3 != null) {
                                    AbstractC19977113Ej abstractC19977113EjLJIILIIL = c13yp.LJIILIIL(abstractC19977113EjLJIJ2, abstractC19977113EjLJIJ, abstractC19977113EjLJIJ3);
                                    if (abstractC19977113EjLJIILIIL == null) {
                                        break loop0;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC19977113EjLJIJ, abstractC19977113EjLJIILIIL);
                                } else {
                                    LJIIZILJ();
                                    throw null;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i2 != 8) {
                            return map;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return map;
                    }
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static final C13BZ LIZLLL(long j, long j2, C13BZ c13bz) {
        while (j < j2) {
            c13bz = c13bz.LJIIIZ(j);
            j++;
        }
        return c13bz;
    }

    public static final C13YG LJI(C13YG c13yg, Function1<Object, Unit> function1, boolean z) {
        C13YF c13yf;
        boolean z2 = c13yg instanceof C13YF;
        if (!z2 && c13yg != null) {
            return new C13YK(c13yg, function1, z);
        }
        if (z2) {
            c13yf = (C13YF) c13yg;
        } else {
            c13yf = null;
        }
        return new C13YJ(c13yf, function1, null, false, z);
    }

    public static final Function1<Object, Unit> LJIIJ(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null) {
            if (function12 != null && function1 != function12) {
                return new AwS396S0200000_30(function1, function12, (Function1<Object, Unit>) 49);
            }
            return function1;
        }
        return function12;
    }

    public static final AbstractC19977113Ej LJIIL(C20028213Ya c20028213Ya, C13YP c13yp, C13YG c13yg) {
        AbstractC19977113Ej abstractC19977113EjLJIIJJI;
        synchronized (LIZJ) {
            try {
                abstractC19977113EjLJIIJJI = LJIIJJI(c20028213Ya, c13yp);
                abstractC19977113EjLJIIJJI.LIZ(c20028213Ya);
                abstractC19977113EjLJIIJJI.LIZ = c13yg.LJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC19977113EjLJIIJJI;
    }

    public static final <T extends AbstractC19977113Ej> T LJIJ(T t, long j, C13BZ c13bz) {
        T t2 = null;
        while (t != null) {
            long j2 = t.LIZ;
            if (j2 != 0 && j2 <= j && !c13bz.LJFF(j2) && (t2 == null || t2.LIZ < t.LIZ)) {
                t2 = t;
            }
            t = (T) t.LIZIZ;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends AbstractC19977113Ej> T LJIL(T t, C13YP c13yp, C13YG c13yg) {
        T t2;
        if (c13yg.LJFF()) {
            c13yg.LJIILIIL(c13yp);
        }
        long jLJI = c13yg.LJI();
        T t3 = (T) LJIJ(t, jLJI, c13yg.LIZLLL());
        if (t3 != null) {
            if (t3.LIZ == c13yg.LJI()) {
                return t3;
            }
            synchronized (LIZJ) {
                try {
                    t2 = (T) LJIJ(c13yp.LJIIZILJ(), jLJI, c13yg.LIZLLL());
                    if (t2 != null) {
                        if (t2.LIZ != jLJI) {
                            AbstractC19977113Ej abstractC19977113EjLJIIJJI = LJIIJJI(t2, c13yp);
                            abstractC19977113EjLJIIJJI.LIZ(t2);
                            abstractC19977113EjLJIIJJI.LIZ = c13yg.LJI();
                            t2 = (T) abstractC19977113EjLJIIJJI;
                        }
                    } else {
                        LJIIZILJ();
                        throw null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (t3.LIZ != 1) {
                c13yg.LJIILIIL(c13yp);
            }
            return t2;
        }
        LJIIZILJ();
        throw null;
    }

    public static final <T extends AbstractC19977113Ej> T LJIILJJIL(T t, C13YP c13yp, C13YG c13yg, T t2) {
        T t3;
        if (c13yg.LJFF()) {
            c13yg.LJIILIIL(c13yp);
        }
        long jLJI = c13yg.LJI();
        if (t2.LIZ == jLJI) {
            return t2;
        }
        synchronized (LIZJ) {
            try {
                t3 = (T) LJIIJJI(t, c13yp);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        t3.LIZ = jLJI;
        if (t2.LIZ != 1) {
            c13yg.LJIILIIL(c13yp);
        }
        return t3;
    }
}
