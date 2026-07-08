package X;

import com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS4S0112000_25;

/* JADX INFO: renamed from: X.0tYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670050tYp {
    public static final C978560bZW LIZLLL(C05P1<C978560bZW> c05p1) {
        return c05p1.getValue();
    }

    public static final void LIZJ(final MatchOnlyGiftViewModel matchOnlyGiftViewModel, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1530755142);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(matchOnlyGiftViewModel)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                z3 = false;
            }
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(matchOnlyGiftViewModel.LLJI, c13zcLJIIJ, 0);
            C1690080u58 c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new InterfaceC346701Wf<List<? extends C06XG>>(matchOnlyGiftViewModel) { // from class: X.0s9O
                    public final MatchOnlyGiftViewModel LL;

                    {
                        this.LL = matchOnlyGiftViewModel;
                    }

                    @Override // X.InterfaceC346701Wf
                    public final Object emit(List<? extends C06XG> list, InterfaceC1364105Vn interfaceC1364105Vn) {
                        GiftMode giftMode;
                        List<AbstractC1557520qdK> list2 = ((C978560bZW) this.LL.LLJI.getValue()).LIZIZ;
                        Iterator<? extends C06XG> it2 = list.iterator();
                        while (it2.hasNext()) {
                            AbstractC1557520qdK abstractC1557520qdK = (AbstractC1557520qdK) C13LP.LJJJLZIJ(it2.next().getIndex(), list2);
                            if (abstractC1557520qdK instanceof C1557530qdL) {
                                MatchOnlyGiftViewModel matchOnlyGiftViewModel2 = this.LL;
                                int i7 = ((C1557530qdL) abstractC1557520qdK).LIZLLL;
                                if (matchOnlyGiftViewModel2.LLJ.add(Integer.valueOf(i7)) && (giftMode = (GiftMode) C13LP.LJJJLZIJ(i7, matchOnlyGiftViewModel2.LLJIJIL)) != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Gift ");
                                    sbLIZ.append(giftMode.giftId);
                                    sbLIZ.append(", ");
                                    sbLIZ.append(giftMode.giftName);
                                    sbLIZ.append(" shown");
                                    C20441214yg.LIZIZ("MatchOnlyGiftViewModel", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1615840s9O c1615840s9O = (C1615840s9O) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1690080u58LIZ) | c13zcLJIIJ.LJII(c1615840s9O);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1615830s9N(c1615840s9O, c1690080u58LIZ, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1690080u58LIZ, (Function2) objLJJ2, c13zcLJIIJ);
            Boolean boolValueOf = Boolean.valueOf(!LIZLLL(c05p0LIZIZ).LIZIZ.isEmpty());
            Integer numValueOf = Integer.valueOf(((C978560bZW) c05p0LIZIZ.getValue()).LIZLLL);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | z2 | c13zcLJIIJ.LJJIIJ(c1690080u58LIZ);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1670060tYq(z3, c1690080u58LIZ, c05p0LIZIZ, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(boolValueOf, numValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            if (z3) {
                c13zcLJIIJ.LJJIIJZLJL(1237230123);
                C1670020tYm c1670020tYm = new C1670020tYm(4);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1682530tsx c1682530tsxLIZIZ = C1682520tsw.LIZIZ(8, 0.0f, 2);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ3 = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJII(matchOnlyGiftViewModel);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ3 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS391S0200000_25(c05p0LIZIZ, matchOnlyGiftViewModel, 36);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1670240tZ8.LIZ(c1670020tYm, c1685760tyA, null, c1682530tsxLIZIZ, false, null, null, null, false, null, (Function1) objLJJ4, c13zcLJIIJ, 3120, 0, 1012);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                z3 = false;
                c13zcLJIIJ.LJJIIJZLJL(1237954841);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(InterfaceC1685750ty9.LIZ, 16, 0.0f, 2);
                float f = 12;
                C1682530tsx c1682530tsxLIZJ = C1682520tsw.LIZJ(0.0f, f, 0.0f, f, 5);
                InterfaceC1668050tVb.LIZ.getClass();
                C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
                C1666950tTp c1666950tTpLJI = C1679930tol.LJI(f);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ4 = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJII(matchOnlyGiftViewModel);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ4 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS391S0200000_25(c05p0LIZIZ, matchOnlyGiftViewModel, 37);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                C636400Oxi.LIZ(interfaceC1685750ty9LJIIJ, c1690080u58LIZ, c1682530tsxLIZJ, false, c1666950tTpLJI, c1296860jqu, null, false, null, (Function1) objLJJ5, c13zcLJIIJ, 221574, 456);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S0112000_25(matchOnlyGiftViewModel, z3, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.List<java.lang.String> r55, java.lang.String r56, long r57, boolean r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, X.InterfaceC1680500tpg r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670050tYp.LIZ(java.util.List, java.lang.String, long, boolean, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Type inference failed for: r32v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r33v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [X.0ty9, java.lang.Throwable, java.util.Map] */
    /* JADX WARN: Type inference failed for: r39v2, types: [X.0NVj, X.0tYx, java.util.Map, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r40v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r50v0, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.util.List<java.lang.String> r52, java.lang.String r53, java.lang.String r54, long r55, boolean r57, java.lang.String r58, boolean r59, boolean r60, boolean r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.InterfaceC1680500tpg r63, int r64, int r65) {
        /*
            Method dump skipped, instruction units count: 1767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670050tYp.LIZIZ(java.util.List, java.lang.String, java.lang.String, long, boolean, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
