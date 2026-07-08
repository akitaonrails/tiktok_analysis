package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import defpackage.Config;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S1402000_25;
import kotlin.jvm.internal.AwS176S0400000_25;
import kotlin.jvm.internal.AwS1S0502000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0ta5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670830ta5 {
    public static final <T> void LIZ(C1676910tjt<T> c1676910tjt, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1675680thu<Float> interfaceC1675680thu, Function1<? super T, ? extends Object> function1, InterfaceC1631620sYq<? super T, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        Function1<? super T, ? extends Object> function12 = function1;
        InterfaceC1675680thu<Float> interfaceC1675680thuLIZLLL = interfaceC1675680thu;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(679005231);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1675680thuLIZLLL)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                interfaceC1675680thuLIZLLL = C1671550tbF.LIZLLL(0, 0, null, 7);
            }
            if (i11 != 0) {
                function12 = AFwS266S0000000_25.get$arr$(391);
            }
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C13ES c13es = new C13ES();
                c13es.add(c1676910tjt.LIZJ());
                c13zcLJIIJ.LJJIJIIJI(c13es);
                obj = c13es;
            }
            C13ES c13es2 = (C13ES) obj;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C19992013Kc.LIZIZ();
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C19991913Kb c19991913Kb = (C19991913Kb) objLJJ2;
            if (Intrinsics.LJFF(c1676910tjt.LIZJ(), c1676910tjt.LJI())) {
                c13zcLJIIJ.LJJIIJZLJL(860925177);
                if (c13es2.size() == 1 && Intrinsics.LJFF(c13es2.get(0), c1676910tjt.LJI())) {
                    c13zcLJIIJ.LJJIIJZLJL(861249809);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(861059531);
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    if (z2 || objLJJ3 == c1680520tpi) {
                        objLJJ3 = new AwS604S0100000_25(c1676910tjt, 548);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    C19719612Di.LJJIIJ(c13es2, (Function1) objLJJ3, true);
                    c19991913Kb.LJFF();
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(861255761);
                c13zcLJIIJ.LJJJJL(false);
            }
            if (!c19991913Kb.LIZ(c1676910tjt.LJI())) {
                c13zcLJIIJ.LJJIIJZLJL(861316428);
                ListIterator<T> listIterator = c13es2.listIterator();
                int i12 = 0;
                while (true) {
                    C13EU c13eu = (C13EU) listIterator;
                    if (!c13eu.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(function12.invoke((Object) c13eu.next()), function12.invoke(c1676910tjt.LJI()))) {
                        if (i12 != -1) {
                            c13es2.set(i12, c1676910tjt.LJI());
                        }
                    } else {
                        i12++;
                    }
                }
                c13es2.add(c1676910tjt.LJI());
                c19991913Kb.LJFF();
                int size = c13es2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj2 = ListProtector.get(c13es2, i13);
                    c19991913Kb.LJIIJJI(obj2, C13Z4.LIZJ(-1426421288, new AwS176S0400000_25((C1676910tjt) c1676910tjt, (C1676910tjt<InterfaceC1631620sYq<? super T, ? super InterfaceC1680500tpg, ? super Integer, Unit>>) interfaceC1675680thuLIZLLL, (InterfaceC1675680thu<Float>) obj2, interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1631620sYq<? super T, ? super InterfaceC1680500tpg, ? super Integer, Unit>, ? super InterfaceC1680500tpg, ? super Integer, Unit>) 5), c13zcLJIIJ));
                }
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(862059281);
                c13zcLJIIJ.LJJJJL(false);
            }
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                c13zcLJIIJ.LJJIIJZLJL(-187474512);
                int size2 = c13es2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    Config.a aVar = (Object) ListProtector.get(c13es2, i14);
                    c13zcLJIIJ.LJIIL(-1081865889, function12.invoke(aVar));
                    Function2 function2 = (Function2) c19991913Kb.LIZLLL(aVar);
                    if (function2 == null) {
                        c13zcLJIIJ.LJJIIJZLJL(821932266);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-1081864713);
                        function2.invoke(c13zcLJIIJ, 0);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0502000_25((C1676910tjt) c1676910tjt, interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1675680thuLIZLLL, (InterfaceC1675680thu<Float>) function12, (InterfaceC1631620sYq) interfaceC1631620sYq, i, i2, 2);
        }
    }

    public static final <T> void LIZIZ(T t, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1675680thu<Float> interfaceC1675680thu, String str, InterfaceC1631620sYq<? super T, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        String str2 = str;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1675680thu<Float> interfaceC1675680thuLIZLLL = interfaceC1675680thu;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-310686752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(t);
            } else {
                zLJII = c13zcLJIIJ.LJII(t);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1675680thuLIZLLL)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                interfaceC1675680thuLIZLLL = C1671550tbF.LIZLLL(0, 0, null, 7);
            }
            if (i11 != 0) {
                str2 = "Crossfade";
            }
            LIZ(C1676860tjo.LJ(t, str2, c13zcLJIIJ, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), interfaceC1685750ty92, interfaceC1675680thuLIZLLL, null, interfaceC1631620sYq, c13zcLJIIJ, (i3 & 112) | (i3 & 896) | (i3 & 57344), 4);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1402000_25((Object) t, interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1675680thuLIZLLL, (InterfaceC1675680thu<Float>) str2, (String) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 2);
        }
    }
}
