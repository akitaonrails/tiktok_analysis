package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionParams;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S1412000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674100tfM {
    public static final PurchaseOptionWithPrice LIZIZ(C05P0<PurchaseOptionWithPrice> c05p0) {
        return c05p0.getValue();
    }

    public static final void LIZLLL(C1674030tfF c1674030tfF, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        List<String> list;
        boolean z;
        boolean z2;
        List<String> list2;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(148307358);
        int i5 = 2;
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1674030tfF)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            PurchaseOptionParams purchaseOptionParams = c1674030tfF.LIZIZ.purchaseOptionComponent;
            C1615420s8i c1615420s8i = c1674030tfF.LIZJ;
            Function1<? super AbstractC1556970qcR, Unit> function1 = c1674030tfF.LIZLLL;
            if (purchaseOptionParams != null) {
                c13zcLJIIJ.LJJIIJZLJL(789467036);
                boolean z3 = false;
                if (function1 != null) {
                    try {
                        i3 = CastIntegerProtector.parseInt(purchaseOptionParams.preselectedPurchaseOptionIndex);
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        i3 = 0;
                    }
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    Object obj = objLJJ;
                    if (objLJJ == c1680520tpi) {
                        C05P0 c05p0LJI = C20028913Yh.LJI(C13LP.LJJJLZIJ(i3, purchaseOptionParams.purchaseOptions));
                        c13zcLJIIJ.LJJIJIIJI(c05p0LJI);
                        obj = c05p0LJI;
                    }
                    C05P0 c05p0 = (C05P0) obj;
                    c13zcLJIIJ.LJJJJL(false);
                    List<PurchaseOptionWithPrice> list3 = purchaseOptionParams.purchaseOptions;
                    Integer numValueOf = Integer.valueOf(i3);
                    c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                    boolean zLJII = c13zcLJIIJ.LJII(list3) | c13zcLJIIJ.LJIJI(i3) | c13zcLJIIJ.LJJIIJ(function1);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    Object obj2 = objLJJ2;
                    if (zLJII || objLJJ2 == c1680520tpi) {
                        C1566330qrX c1566330qrX = new C1566330qrX(i3, list3, null, function1);
                        c13zcLJIIJ.LJJIJIIJI(c1566330qrX);
                        obj2 = c1566330qrX;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1680540tpk.LJFF(numValueOf, (Function2) obj2, c13zcLJIIJ);
                    int i6 = 1;
                    if (!Intrinsics.LJFF(purchaseOptionParams.shouldShowPurchaseOptions, Boolean.FALSE) && Intrinsics.LJFF(c1615420s8i.LIZIZ, Boolean.TRUE)) {
                        c13zcLJIIJ.LJJIIJZLJL(-30419939);
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 16, 0.0f, 2);
                        C1680030tov c1680030tov = C1679930tol.LIZJ;
                        InterfaceC1668050tVb.LIZ.getClass();
                        C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                        int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
                        g.LJLIIIL.getClass();
                        AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                            AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                            ArrayList<PurchaseOptionWithPrice> arrayList = new ArrayList();
                            c13zcLJIIJ.LJJIIJZLJL(-1104852331);
                            Iterator<PurchaseOptionWithPrice> it2 = list3.iterator();
                            int i7 = 0;
                            while (true) {
                                int i8 = 5004770;
                                if (it2.hasNext()) {
                                    PurchaseOptionWithPrice next = it2.next();
                                    int i9 = i7 + 1;
                                    if (i7 >= 0) {
                                        PurchaseOptionWithPrice purchaseOptionWithPrice = next;
                                        if (i9 < list3.size() && ((PurchaseOptionWithPrice) ListProtector.get(list3, i9)).isFullWidth) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (purchaseOptionWithPrice.isFullWidth || (arrayList.size() == i6 && z)) {
                                            List<String> list4 = null;
                                            c13zcLJIIJ.LJJIIJZLJL(-448889256);
                                            c13zcLJIIJ.LJJIIJZLJL(678259401);
                                            if (!arrayList.isEmpty()) {
                                                for (PurchaseOptionWithPrice purchaseOptionWithPrice2 : arrayList) {
                                                    String str = c1615420s8i.LIZ;
                                                    PurchaseOptionWithPrice purchaseOptionWithPrice3 = (PurchaseOptionWithPrice) c05p0.getValue();
                                                    if (purchaseOptionWithPrice3 != null) {
                                                        list2 = purchaseOptionWithPrice3.skuIds;
                                                    } else {
                                                        list2 = null;
                                                    }
                                                    boolean zLJFF = Intrinsics.LJFF(list2, purchaseOptionWithPrice2.skuIds);
                                                    c13zcLJIIJ.LJJIIJZLJL(i8);
                                                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                                                    InterfaceC1680500tpg.LIZ.getClass();
                                                    if (objLJJ3 == C1680510tph.LIZIZ) {
                                                        objLJJ3 = new AwS604S0100000_25(c05p0, (C05P0<Boolean>) 812);
                                                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                                                    }
                                                    c13zcLJIIJ.LJJJJL(z3);
                                                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                                                    LIZ(str, purchaseOptionWithPrice2, zLJFF, (Function1) objLJJ3, function1, c.LJ(c1685760tyA, 1.0f), c13zcLJIIJ, 199680, z3 ? 1 : 0);
                                                    C1665790tRx.LIZ(c.LJI(c1685760tyA, 8), c13zcLJIIJ);
                                                    i8 = 5004770;
                                                    z3 = false;
                                                }
                                                z2 = false;
                                                arrayList.clear();
                                            } else {
                                                z2 = false;
                                            }
                                            c13zcLJIIJ.LJJJJL(z2);
                                            String str2 = c1615420s8i.LIZ;
                                            PurchaseOptionWithPrice purchaseOptionWithPrice4 = (PurchaseOptionWithPrice) c05p0.getValue();
                                            if (purchaseOptionWithPrice4 != null) {
                                                list4 = purchaseOptionWithPrice4.skuIds;
                                            }
                                            boolean zLJFF2 = Intrinsics.LJFF(list4, purchaseOptionWithPrice.skuIds);
                                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                                            Object objLJJ4 = c13zcLJIIJ.LJJ();
                                            InterfaceC1680500tpg.LIZ.getClass();
                                            Object obj3 = objLJJ4;
                                            if (objLJJ4 == C1680510tph.LIZIZ) {
                                                AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c05p0, (C05P0<Boolean>) 813);
                                                c13zcLJIIJ.LJJIJIIJI(awS604S0100000_25);
                                                obj3 = awS604S0100000_25;
                                            }
                                            c13zcLJIIJ.LJJJJL(z2);
                                            C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                                            z3 = false;
                                            LIZ(str2, purchaseOptionWithPrice, zLJFF2, (Function1) obj3, function1, c.LJ(c1685760tyA2, 1.0f), c13zcLJIIJ, 199680, 0);
                                            C1665790tRx.LIZ(c.LJI(c1685760tyA2, 8), c13zcLJIIJ);
                                            c13zcLJIIJ.LJJJJL(false);
                                        } else {
                                            c13zcLJIIJ.LJJIIJZLJL(-447239188);
                                            arrayList.add(purchaseOptionWithPrice);
                                            if (arrayList.size() == i5) {
                                                String str3 = c1615420s8i.LIZ;
                                                InterfaceC1665500tRU interfaceC1665500tRULIZ = C1687430u0r.LIZ(arrayList);
                                                PurchaseOptionWithPrice purchaseOptionWithPrice5 = (PurchaseOptionWithPrice) c05p0.getValue();
                                                c13zcLJIIJ.LJJIIJZLJL(5004770);
                                                Object objLJJ5 = c13zcLJIIJ.LJJ();
                                                InterfaceC1680500tpg.LIZ.getClass();
                                                Object obj4 = objLJJ5;
                                                if (objLJJ5 == C1680510tph.LIZIZ) {
                                                    AwS604S0100000_25 awS604S0100000_252 = new AwS604S0100000_25(c05p0, (C05P0<Boolean>) 814);
                                                    c13zcLJIIJ.LJJIJIIJI(awS604S0100000_252);
                                                    obj4 = awS604S0100000_252;
                                                }
                                                c13zcLJIIJ.LJJJJL(z3);
                                                LIZJ(str3, interfaceC1665500tRULIZ, purchaseOptionWithPrice5, (Function1) obj4, function1, c13zcLJIIJ, 3072);
                                                arrayList.clear();
                                            }
                                            c13zcLJIIJ.LJJJJL(z3);
                                        }
                                        i6 = 1;
                                        i5 = 2;
                                        i7 = i9;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                } else {
                                    int i10 = 5004770;
                                    c13zcLJIIJ.LJJJJL(z3);
                                    c13zcLJIIJ.LJJIIJZLJL(-1104767030);
                                    if (!arrayList.isEmpty()) {
                                        for (PurchaseOptionWithPrice purchaseOptionWithPrice6 : arrayList) {
                                            String str4 = c1615420s8i.LIZ;
                                            PurchaseOptionWithPrice purchaseOptionWithPrice7 = (PurchaseOptionWithPrice) c05p0.getValue();
                                            if (purchaseOptionWithPrice7 != null) {
                                                list = purchaseOptionWithPrice7.skuIds;
                                            } else {
                                                list = null;
                                            }
                                            boolean zLJFF3 = Intrinsics.LJFF(list, purchaseOptionWithPrice6.skuIds);
                                            c13zcLJIIJ.LJJIIJZLJL(i10);
                                            Object objLJJ6 = c13zcLJIIJ.LJJ();
                                            InterfaceC1680500tpg.LIZ.getClass();
                                            if (objLJJ6 == C1680510tph.LIZIZ) {
                                                objLJJ6 = new AwS604S0100000_25(c05p0, (C05P0<Boolean>) 815);
                                                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                                            }
                                            c13zcLJIIJ.LJJJJL(z3);
                                            C1685760tyA c1685760tyA3 = InterfaceC1685750ty9.LIZ;
                                            z3 = false;
                                            LIZ(str4, purchaseOptionWithPrice6, zLJFF3, (Function1) objLJJ6, function1, c.LJ(c1685760tyA3, 1.0f), c13zcLJIIJ, 199680, 0);
                                            C1665790tRx.LIZ(c.LJI(c1685760tyA3, 8), c13zcLJIIJ);
                                            i10 = 5004770;
                                        }
                                    }
                                    c13zcLJIIJ.LJJJJL(z3);
                                    c13zcLJIIJ.LJJJJL(true);
                                    c13zcLJIIJ.LJJJJL(z3);
                                }
                            }
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-26808532);
                        k.LIZ(C1675980tiO.LIZIZ(c.LJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 1), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669430tXp.LIZ), c13zcLJIIJ, 0);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                }
                c13zcLJIIJ.LJJJJL(z3);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1674030tfF, i, 93);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.lang.String r20, X.InterfaceC1665500tRU<com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice> r21, com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice r22, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice, kotlin.Unit> r23, kotlin.jvm.functions.Function1<? super X.AbstractC1556970qcR, kotlin.Unit> r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674100tfM.LIZJ(java.lang.String, X.0tRU, com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tpg, X.13ZC] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    public static final void LIZ(String str, PurchaseOptionWithPrice purchaseOptionWithPrice, boolean z, Function1<? super PurchaseOptionWithPrice, Unit> function1, Function1<? super AbstractC1556970qcR, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long jT2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        ?? LJIIJ = interfaceC1680500tpg.LJIIJ(-803588302);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (LJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (LJIIJ.LJII(purchaseOptionWithPrice)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (LJIIJ.LJIIZILJ(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (LJIIJ.LJII(function1)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (LJIIJ.LJII(function12)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (LJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && LJIIJ.LIZ()) {
            LJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (z) {
                LJIIJ.LJJIIJZLJL(845765407);
                jT2 = C1670400tZO.LIZIZ(LJIIJ).R3();
            } else {
                LJIIJ.LJJIIJZLJL(845766529);
                jT2 = C1670400tZO.LIZIZ(LJIIJ).T2();
            }
            LJIIJ.LJJJJL(false);
            LJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = LJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C05P0 c05p0LJI = C20028913Yh.LJI(purchaseOptionWithPrice);
                LJIIJ.LJJIJIIJI(c05p0LJI);
                obj = c05p0LJI;
            }
            C05P0 c05p0 = (C05P0) obj;
            LJIIJ.LJJJJL(false);
            LJIIJ.LJJIIJZLJL(-1746271574);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII = z2 | LJIIJ.LJII(purchaseOptionWithPrice);
            Object objLJJ2 = LJIIJ.LJJ();
            Object obj2 = objLJJ2;
            if (zLJII || objLJJ2 == c1680520tpi) {
                C1615450s8l c1615450s8l = new C1615450s8l(str, purchaseOptionWithPrice, c05p0, null);
                LJIIJ.LJJIJIIJI(c1615450s8l);
                obj2 = c1615450s8l;
            }
            LJIIJ.LJJJJL(false);
            C05P0 c05p0LJII = C20028913Yh.LJII("Loading...", (Function2) obj2, LJIIJ);
            LJIIJ.LJJIIJZLJL(-1746271574);
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | z3;
            Object objLJJ3 = LJIIJ.LJJ();
            Object obj3 = objLJJ3;
            if (z6 || objLJJ3 == c1680520tpi) {
                AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24((Function1) function1, (Function1<? super PurchaseOptionWithPrice, Unit>) function12, (Function1<? super AbstractC1556970qcR, Unit>) c05p0, (C05P0<PurchaseOptionWithPrice>) 20);
                LJIIJ.LJJIJIIJI(awS268S0300000_24);
                obj3 = awS268S0300000_24;
            }
            LJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty92, false, null, (Function0) obj3, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(LJIIJ);
            C13D2 c13d2LJJJIL = LJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LIZJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                LJIIJ.LJJIII();
                if (LJIIJ.LJJJI) {
                    LJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    LJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(LJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    LJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 8;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1675890tiF.LIZ(c.LJ(c.LJI(C1682520tsw.LJIIL(c1685760tyA, 0.0f, f, 0.0f, 0.0f, 13), 91), 1.0f), 2, jT2, C1669050tXD.LIZIZ(f));
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                int iLIZ2 = C0MXE.LIZ(LJIIJ);
                C13D2 c13d2LJJJIL2 = LJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LIZ);
                if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    LJIIJ.LJJIII();
                    if (LJIIJ.LJJJI) {
                        LJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        LJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(LJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        LJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LIZIZ(interfaceC1685750ty92, 1.0f), 16);
                    C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LJI, C1668040tVa.LJIILIIL, LJIIJ, 6);
                    int iLIZ3 = C0MXE.LIZ(LJIIJ);
                    C13D2 c13d2LJJJIL3 = LJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LJIIIIZZ);
                    if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        LJIIJ.LJJIII();
                        if (LJIIJ.LJJJI) {
                            LJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            LJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(LJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                        C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            LJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        ?? r6 = 0;
                        C1685190txF.LIZ(purchaseOptionWithPrice.title, null, C1670400tZO.LIZIZ(LJIIJ).K3(), C1670400tZO.LJ(LJIIJ).LJIILIIL, 0L, 0, 0, false, 2, null, null, LJIIJ, 100663296, 0, 1778);
                        LJIIJ.LJJIIJZLJL(-73062573);
                        if (C123100dR.LIZ(purchaseOptionWithPrice.subtitle)) {
                            C1685190txF.LIZ(purchaseOptionWithPrice.subtitle, null, C1670400tZO.LIZIZ(LJIIJ).N3(), C1670400tZO.LJ(LJIIJ).LJJ, C1682430tsn.LJ(6), 0, 0, false, 1, null, null, LJIIJ, 100687872, 0, 1762);
                        }
                        LJIIJ.LJJJJL(false);
                        C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, LJIIJ, 48);
                        int iLIZ4 = C0MXE.LIZ(LJIIJ);
                        C13D2 c13d2LJJJIL4 = LJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(LJIIJ, c1685760tyA);
                        if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            LJIIJ.LJJIII();
                            if (LJIIJ.LJJJI) {
                                LJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                LJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(LJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                            C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                            if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                LJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                            C1685190txF.LIZ((String) c05p0LJII.getValue(), null, 0L, C1670400tZO.LJ(LJIIJ).LJ, 0L, 0, 0, false, 1, null, null, LJIIJ, 100663296, 0, 1782);
                            LJIIJ.LJJIIJZLJL(-1024809846);
                            if (C123100dR.LIZ(purchaseOptionWithPrice.discountTag)) {
                                float f2 = 4;
                                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, f2), LJIIJ);
                                String str2 = purchaseOptionWithPrice.discountTag;
                                C1693430uAX c1693430uAX = C1670400tZO.LJ(LJIIJ).LJIL;
                                long jP3 = C1670400tZO.LIZIZ(LJIIJ).p3();
                                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(LJIIJ).V2(), C1669050tXD.LIZIZ(C1670400tZO.LIZJ(LJIIJ).LIZ)), f2, 1);
                                r6 = 0;
                                C1685190txF.LIZ(str2, interfaceC1685750ty9LJIIIZ, jP3, c1693430uAX, 0L, 0, 0, false, 1, null, null, LJIIJ, 100663296, 0, 1776);
                            }
                            LJIIJ.LJJJJL(r6);
                            LJIIJ.LJJJJL(true);
                            LJIIJ.LJJJJL(true);
                            LJIIJ.LJJJJL(true);
                            LJIIJ.LJJIIJZLJL(-1808459567);
                            if (z && C123100dR.LIZ(purchaseOptionWithPrice.promotionText)) {
                                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ2 = C1682520tsw.LJIIIZ(C1675980tiO.LIZIZ(C1684150tvZ.LIZ(C1688600u2k.LIZJ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LIZLLL), -10, (float) r6), 2.0f), C1685850tyJ.LIZLLL(4294957536L), C1669050tXD.LIZIZ(C1670400tZO.LIZJ(LJIIJ).LIZ)), 5, 1);
                                InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(c1296870jqv, r6);
                                int iLIZ5 = C0MXE.LIZ(LJIIJ);
                                C13D2 c13d2LJJJIL5 = LJIIJ.LJJJIL();
                                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL5 = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LJIIIZ2);
                                if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                    LJIIJ.LJJIII();
                                    if (LJIIJ.LJJJI) {
                                        LJIIJ.LJJI(aFwS214S0000000_25);
                                    } else {
                                        LJIIJ.LJIILJJIL();
                                    }
                                    C1665930tSB.LIZ(LJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_25);
                                    C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL5, aFwS311S0000000_252);
                                    if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ5))) {
                                        LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ5));
                                        LJIIJ.LIZIZ(Integer.valueOf(iLIZ5), aFwS311S0000000_253);
                                    }
                                    C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL5, aFwS311S0000000_254);
                                    z5 = true;
                                    C1685190txF.LIZ(purchaseOptionWithPrice.promotionText, null, C1670400tZO.LIZIZ(LJIIJ).R3(), C1670400tZO.LJ(LJIIJ).LJIL, 0L, r6 == true ? 1 : 0, r6 == true ? 1 : 0, r6, r6 == true ? 1 : 0, null, null, LJIIJ, r6 == true ? 1 : 0, r6 == true ? 1 : 0, 2034);
                                    LJIIJ.LJJJJL(true);
                                } else {
                                    C0MXE.LIZIZ();
                                    throw null;
                                }
                            } else {
                                z5 = true;
                            }
                            LJIIJ.LJJJJL(r6);
                            LJIIJ.LJJJJL(z5);
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = LJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1412000_25(str, (String) purchaseOptionWithPrice, (PurchaseOptionWithPrice) z, (boolean) function1, (Function1<? super PurchaseOptionWithPrice, Unit>) function12, (Function1<? super AbstractC1556970qcR, Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 2);
        }
    }
}
