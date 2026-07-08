package X;

import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200741BBg extends C09AY implements Function1<Set<AbstractC2201091BCp<?>>, Unit> {
    public C2200741BBg() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<AbstractC2201091BCp<?>> set) {
        Set<AbstractC2201091BCp<?>> set2 = set;
        set2.add(C2200681BBa.LJFF);
        set2.add(C2200941BCa.LJFF);
        set2.add(new AbstractC2201091BCp<C1512850pTH>() { // from class: X.1BBV
            public static final C798120VSo LJI = new C798120VSo();

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILL() {
                return true;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJII() {
                C2200821BBo.LIZ.getClass();
                return C2200821BBo.LJIIJJI.LJFF;
            }

            @Override // X.AbstractC2201091BCp
            public final C1512850pTH LJIILIIL() {
                return new C1512850pTH();
            }

            /* JADX WARN: Removed duplicated region for block: B:126:0x01dc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x01fe A[SYNTHETIC] */
            @Override // X.AbstractC2201091BCp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1512850pTH LJIILJJIL() {
                /*
                    Method dump skipped, instruction units count: 560
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BBV.LJIILJJIL():java.lang.Object");
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIIZILJ() {
                C2200821BBo.LIZ.getClass();
                return C2200821BBo.LJIIJJI.LJ;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIJJLI() {
                C2200821BBo.LIZ.getClass();
                return C2200821BBo.LJIIJJI.LIZLLL;
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return C1BC9.Traffic;
            }

            @Override // X.AbstractC2201091BCp
            public final C1512850pTH LJIIJ(C1057250dcR c1057250dcR) {
                C1057120dcE c1057120dcE;
                Number numberValueOf;
                EnumC1006810cJ5 enumC1006810cJ5;
                C1512850pTH c1512850pTHLJIIIZ = LJIIIZ();
                if ((c1057250dcR instanceof C1057120dcE) && (c1057120dcE = (C1057120dcE) c1057250dcR) != null) {
                    long j = c1512850pTHLJIIIZ.LIZLLL;
                    if (j > 0) {
                        numberValueOf = Long.valueOf((c1512850pTHLJIIIZ.LIZIZ + c1512850pTHLJIIIZ.LIZJ) / ((long) 60));
                    } else {
                        numberValueOf = Float.valueOf((c1512850pTHLJIIIZ.LIZIZ + c1512850pTHLJIIIZ.LIZJ) / (j / LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                    long jLongValue = numberValueOf.longValue();
                    if (jLongValue > c1057120dcE.LIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Critical;
                    } else if (jLongValue > c1057120dcE.LIZIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.High;
                    } else if (jLongValue > c1057120dcE.LIZJ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Medium;
                    } else {
                        enumC1006810cJ5 = EnumC1006810cJ5.Low;
                    }
                    C1512850pTH c1512850pTH = new C1512850pTH();
                    c1512850pTH.LIZJ = c1512850pTHLJIIIZ.LIZJ;
                    c1512850pTH.LIZIZ = c1512850pTHLJIIIZ.LIZIZ;
                    c1512850pTH.LIZLLL = c1512850pTHLJIIIZ.LIZLLL;
                    c1512850pTH.LIZ = enumC1006810cJ5;
                    return c1512850pTH;
                }
                return c1512850pTHLJIIIZ;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILLIIL(C1512850pTH c1512850pTH, C1512850pTH c1512850pTH2) {
                if (c1512850pTH.LIZ != c1512850pTH2.LIZ) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC2201091BCp
            public final void LJJI(C2201121BCs<C1512850pTH> c2201121BCs, C1512850pTH c1512850pTH, C1057250dcR c1057250dcR) {
                C1057120dcE c1057120dcE;
                Number numberValueOf;
                EnumC1006810cJ5 enumC1006810cJ5;
                EnumC1006810cJ5 enumC1006810cJ52;
                C1512850pTH c1512850pTH2 = c1512850pTH;
                if ((c1057250dcR instanceof C1057120dcE) && (c1057120dcE = (C1057120dcE) c1057250dcR) != null) {
                    long j = c1512850pTH2.LIZLLL;
                    if (j > 0) {
                        numberValueOf = Long.valueOf((c1512850pTH2.LIZIZ + c1512850pTH2.LIZJ) / ((long) 60));
                    } else {
                        numberValueOf = Float.valueOf((c1512850pTH2.LIZIZ + c1512850pTH2.LIZJ) / (j / LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                    long jLongValue = numberValueOf.longValue();
                    if (jLongValue > c1057120dcE.LIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Critical;
                    } else if (jLongValue > c1057120dcE.LIZIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.High;
                    } else if (jLongValue > c1057120dcE.LIZJ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Medium;
                    } else {
                        enumC1006810cJ5 = EnumC1006810cJ5.Low;
                    }
                    C1702170uOd c1702170uOd = c2201121BCs.LJ;
                    C1512850pTH c1512850pTH3 = new C1512850pTH();
                    c1512850pTH3.LIZJ = c1512850pTH2.LIZJ;
                    c1512850pTH3.LIZIZ = c1512850pTH2.LIZIZ;
                    c1512850pTH3.LIZLLL = c1512850pTH2.LIZLLL;
                    c1512850pTH3.LIZ = enumC1006810cJ5;
                    c2201121BCs.LJ = c1512850pTH3;
                    if (c1702170uOd != null && (enumC1006810cJ52 = c1702170uOd.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                        c2201121BCs.LIZ(c1702170uOd, c1512850pTH3);
                    }
                }
            }
        });
        set2.add(new AbstractC2201091BCp<C1512820pTE>() { // from class: X.1BBp
            public static final C2200851BBr LJI = C2200851BBr.LIZ;

            @Override // X.AbstractC2201091BCp
            public final long LJII() {
                return 3000L;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILL() {
                return true;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIIZILJ() {
                return 1000L;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIJJLI() {
                return 1000L;
            }

            @Override // X.AbstractC2201091BCp
            public final C1512820pTE LJIILIIL() {
                return new C1512820pTE();
            }

            @Override // X.AbstractC2201091BCp
            public final C1512820pTE LJIILJJIL() {
                C2200821BBo.LIZ.getClass();
                boolean z = C2200821BBo.LJIJI;
                LJI.getClass();
                long j = Runtime.getRuntime().totalMemory();
                long jMaxMemory = Runtime.getRuntime().maxMemory() - (j - Runtime.getRuntime().freeMemory());
                C1512820pTE c1512820pTE = new C1512820pTE();
                c1512820pTE.LIZIZ = jMaxMemory;
                c1512820pTE.LIZJ = j;
                long j2 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
                long j3 = j2 - C2200851BBr.LIZIZ;
                C2200851BBr.LIZIZ = j2;
                c1512820pTE.LIZLLL = j3;
                long j4 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
                long j5 = j4 - C2200851BBr.LIZJ;
                C2200851BBr.LIZJ = j4;
                c1512820pTE.LJ = j5;
                long j6 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
                long j7 = j6 - C2200851BBr.LIZLLL;
                C2200851BBr.LIZLLL = j6;
                c1512820pTE.LJFF = j7;
                long j8 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
                long j9 = j8 - C2200851BBr.LJ;
                C2200851BBr.LJ = j8;
                c1512820pTE.LJI = j9;
                C2200841BBq c2200841BBq = C2200821BBo.LJIIJ;
                c1512820pTE.LIZ = jMaxMemory < ((long) c2200841BBq.LIZ) ? EnumC1006810cJ5.Critical : jMaxMemory < ((long) c2200841BBq.LIZIZ) ? EnumC1006810cJ5.High : jMaxMemory < ((long) c2200841BBq.LIZJ) ? EnumC1006810cJ5.Medium : EnumC1006810cJ5.Low;
                return c1512820pTE;
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return C1BC9.Memory;
            }

            @Override // X.AbstractC2201091BCp
            public final C1512820pTE LJIIJ(C1057250dcR c1057250dcR) {
                C2200841BBq c2200841BBq;
                EnumC1006810cJ5 enumC1006810cJ5;
                C1512820pTE c1512820pTELJIIIZ = LJIIIZ();
                if ((c1057250dcR instanceof C2200841BBq) && (c2200841BBq = (C2200841BBq) c1057250dcR) != null) {
                    long j = c1512820pTELJIIIZ.LIZIZ;
                    if (j < c2200841BBq.LIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Critical;
                    } else if (j < c2200841BBq.LIZIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.High;
                    } else if (j < c2200841BBq.LIZJ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Medium;
                    } else {
                        enumC1006810cJ5 = EnumC1006810cJ5.Low;
                    }
                    C1512820pTE c1512820pTE = new C1512820pTE();
                    c1512820pTE.LIZ = enumC1006810cJ5;
                    c1512820pTE.LIZJ = c1512820pTELJIIIZ.LIZJ;
                    c1512820pTE.LIZIZ = c1512820pTELJIIIZ.LIZIZ;
                    c1512820pTE.LJ = c1512820pTELJIIIZ.LJ;
                    c1512820pTE.LIZLLL = c1512820pTELJIIIZ.LIZLLL;
                    c1512820pTE.LJFF = c1512820pTELJIIIZ.LJFF;
                    c1512820pTE.LJI = c1512820pTELJIIIZ.LJI;
                    return c1512820pTE;
                }
                return c1512820pTELJIIIZ;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILLIIL(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
                if (c1512820pTE.LIZ != c1512820pTE2.LIZ) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC2201091BCp
            public final void LJJI(C2201121BCs<C1512820pTE> c2201121BCs, C1512820pTE c1512820pTE, C1057250dcR c1057250dcR) {
                C2200841BBq c2200841BBq;
                EnumC1006810cJ5 enumC1006810cJ5;
                EnumC1006810cJ5 enumC1006810cJ52;
                C1512820pTE c1512820pTE2 = c1512820pTE;
                if ((c1057250dcR instanceof C2200841BBq) && (c2200841BBq = (C2200841BBq) c1057250dcR) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current cpuChangeListener has defined config level, media: ");
                    sbLIZ.append(c2200841BBq.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    long j = c1512820pTE2.LIZIZ;
                    if (j < c2200841BBq.LIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Critical;
                    } else if (j < c2200841BBq.LIZIZ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.High;
                    } else if (j < c2200841BBq.LIZJ) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Medium;
                    } else {
                        enumC1006810cJ5 = EnumC1006810cJ5.Low;
                    }
                    C1702170uOd c1702170uOd = c2201121BCs.LJ;
                    C1512820pTE c1512820pTE3 = new C1512820pTE();
                    c1512820pTE3.LIZ = enumC1006810cJ5;
                    c1512820pTE3.LIZJ = c1512820pTE2.LIZJ;
                    c1512820pTE3.LIZIZ = c1512820pTE2.LIZIZ;
                    c1512820pTE3.LJ = c1512820pTE2.LJ;
                    c1512820pTE3.LIZLLL = c1512820pTE2.LIZLLL;
                    c1512820pTE3.LJFF = c1512820pTE2.LJFF;
                    c1512820pTE3.LJI = c1512820pTE2.LJI;
                    c2201121BCs.LJ = c1512820pTE3;
                    if (c1702170uOd != null && (enumC1006810cJ52 = c1702170uOd.LIZ) != EnumC1006810cJ5.Unknown && enumC1006810cJ52 != enumC1006810cJ5) {
                        c2201121BCs.LIZ(c1702170uOd, c1512820pTE3);
                    }
                }
            }
        });
        set2.add(new AbstractC2201091BCp<C1512830pTF>() { // from class: X.1BBh
            public static final C08VC LJI = new C08VC();

            @Override // X.AbstractC2201091BCp
            public final long LJIJJLI() {
                return 180000L;
            }

            @Override // X.AbstractC2201091BCp
            public final C1512830pTF LJIILIIL() {
                return new C1512830pTF();
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // X.AbstractC2201091BCp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1512830pTF LJIILJJIL() {
                /*
                    r8 = this;
                    X.08VC r0 = X.C2200751BBh.LJI
                    r0.getClass()
                    X.0pTF r5 = new X.0pTF
                    r5.<init>()
                    android.content.Context r0 = X.C798140VSq.LIZ
                    r3 = 0
                    if (r0 == 0) goto L24
                    java.io.File r0 = X.C786410Ut5.x2(r0)
                    if (r0 == 0) goto L24
                    java.lang.String r0 = r0.getPath()
                    long r6 = X.C08VC.LIZ(r0)
                    r1 = -1
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r0 != 0) goto L26
                L24:
                    r6 = 0
                L26:
                    r5.LIZJ = r6
                    java.io.File r0 = android.os.Environment.getDataDirectory()
                    if (r0 == 0) goto L3a
                    java.io.File r0 = android.os.Environment.getDataDirectory()
                    java.lang.String r0 = r0.getPath()
                    long r3 = X.C08VC.LIZ(r0)
                L3a:
                    r5.LIZIZ = r3
                    X.1BBo r0 = X.C2200821BBo.LIZ
                    r0.getClass()
                    X.1BBj r0 = X.C2200821BBo.LJIIIIZZ
                    r0.getClass()
                    r1 = 2097152(0x200000, double:1.036131E-317)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L52
                    X.0cJ5 r0 = X.EnumC1006810cJ5.Critical
                L4f:
                    r5.LIZ = r0
                    return r5
                L52:
                    X.1BBj r0 = X.C2200821BBo.LJIIIIZZ
                    r0.getClass()
                    r1 = 4194304(0x400000, double:2.0722615E-317)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L61
                    X.0cJ5 r0 = X.EnumC1006810cJ5.High
                    goto L4f
                L61:
                    X.1BBj r0 = X.C2200821BBo.LJIIIIZZ
                    r0.getClass()
                    r1 = 6291456(0x600000, double:3.1083923E-317)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L70
                    X.0cJ5 r0 = X.EnumC1006810cJ5.Medium
                    goto L4f
                L70:
                    X.0cJ5 r0 = X.EnumC1006810cJ5.Low
                    goto L4f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2200751BBh.LJIILJJIL():java.lang.Object");
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return C1BC9.Storage;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILLIIL(C1512830pTF c1512830pTF, C1512830pTF c1512830pTF2) {
                C1512830pTF c1512830pTF3 = c1512830pTF;
                C1512830pTF c1512830pTF4 = c1512830pTF2;
                if (Math.abs(c1512830pTF4.LIZIZ - c1512830pTF3.LIZIZ) >= 104857600 || Math.abs(c1512830pTF4.LIZJ - c1512830pTF3.LIZJ) >= 104857600 || c1512830pTF3.LIZ != c1512830pTF4.LIZ) {
                    return true;
                }
                return false;
            }
        });
        set2.add(new C2200711BBd());
        set2.add(new C2200801BBm());
        set2.add(C2200781BBk.LJFF);
        if (C2200821BBo.LJ) {
            set2.add(C2201191BCz.LJFF);
        }
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJIJ) {
            set2.add(new C1BBW());
        }
        return Unit.LIZ;
    }
}
