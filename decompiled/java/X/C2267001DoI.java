package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS24S0100001_25;
import kotlin.jvm.internal.AwS2S0201001_25;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1DoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267001DoI implements InterfaceC2267341Doq {
    public InterfaceC2267361Dos LIZ;
    public final C2267091DoR LIZIZ;
    public final Map<InterfaceC1673370teB, AbstractC1686530tzP> LIZJ;
    public final Map<InterfaceC1673370teB, Integer[]> LIZLLL;
    public final Map<InterfaceC1673370teB, C2262541Dh6> LJ;
    public InterfaceC1690500u5o LJFF;
    public InterfaceC1689940u4u LJI;
    public final C01GW LJII;
    public final int[] LJIIIIZZ;
    public final int[] LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final ArrayList<C1EV9> LJIILIIL;

    @Override // X.InterfaceC2267341Doq
    public final void LIZ() {
    }

    public final C2267041DoM LJFF() {
        return (C2267041DoM) this.LJII.getValue();
    }

    public C2267001DoI() {
        C2267091DoR c2267091DoR = new C2267091DoR(0);
        c2267091DoR.LJJLJLI = this;
        c2267091DoR.LJJLIL.LJ = this;
        this.LIZIZ = c2267091DoR;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJII = C452501pT.LIZ(EnumC452301pR.NONE, new AwS579S0100000_35(this, 391));
        this.LJIIIIZZ = new int[2];
        this.LJIIIZ = new int[2];
        this.LJIIJ = Float.NaN;
        this.LJIILIIL = new ArrayList<>();
    }

    public static C1693430uAX LJI(HashMap map) {
        long jLIZLLL;
        String str = (String) map.get("size");
        long j = C1682440tso.LIZJ;
        if (str != null) {
            jLIZLLL = C1682430tsn.LIZLLL(CastFloatProtector.parseFloat(str));
        } else {
            jLIZLLL = j;
        }
        return new C1693430uAX(new C1693450uAZ(LJ(C1685910tyP.LIZIZ, (String) map.get("color")), jLIZLLL, (C1680190tpB) null, (C1693240uAE) null, (C1695610uE3) null, (AbstractC1696400uFK) null, (String) null, j, (C1160090gIJ) null, (C1693560uAk) null, (C1694560uCM) null, C1685910tyP.LJIIJ, (C1693510uAf) null, (C1693340uAO) null, (C1693870uBF) null, (AbstractC1695860uES) null), new C1693480uAc(Integer.MIN_VALUE, Integer.MIN_VALUE, j, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static long LJ(long j, String str) {
        if (str != null && a0.LJJLIIIJJIZ(str, '#')) {
            String strSubstring = str.substring(1);
            if (strSubstring.length() == 6) {
                strSubstring = Intrinsics.LJIIJJI(strSubstring, "FF");
            }
            try {
                return C1685850tyJ.LIZIZ((int) CastLongProtector.parseLong(strSubstring, 16));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    @Override // X.InterfaceC2267341Doq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C2267081DoQ r19, X.C2267311Don r20) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267001DoI.LIZIZ(X.1DoQ, X.1Don):void");
    }

    public final void LIZJ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-186576797);
        for (C1EV9 c1ev9 : this.LJIILIIL) {
            c1ev9.getClass();
            HashMap<String, InterfaceC1631630sYr<String, HashMap<String, String>, InterfaceC1680500tpg, Integer, Unit>> map = C540810LIx.LIZ;
            c1ev9.getClass();
            InterfaceC1631630sYr<String, HashMap<String, String>, InterfaceC1680500tpg, Integer, Unit> interfaceC1631630sYr = map.get(null);
            if (interfaceC1631630sYr != null) {
                c13zcLJIIJ.LJJIJIIJIL(-186576600);
                c1ev9.getClass();
                interfaceC1631630sYr.invoke(null, null, c13zcLJIIJ, 64);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIJIIJIL(-186576534);
                c1ev9.getClass();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 81);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0345 A[PHI: r0
      0x0345: PHI (r0v96 java.lang.Object) = (r0v95 java.lang.Object), (r0v98 java.lang.Object) binds: [B:65:0x0226, B:71:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.AbstractC1683310tuD r14, java.util.List<? extends X.InterfaceC1673370teB> r15) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267001DoI.LJIIIIZZ(X.0tuD, java.util.List):void");
    }

    public final void LIZLLL(InterfaceC1665870tS5 interfaceC1665870tS5, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-756996390);
        C1668170tVn.LIZ(interfaceC1665870tS5.LIZ(InterfaceC1685750ty9.LIZ), new AwS24S0100001_25(this, f, 5), c13zcLJIIJ, 0);
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0201001_25(this, interfaceC1665870tS5, f, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:316:0x075b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x062e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v212, types: [X.1DoP] */
    /* JADX WARN: Type inference failed for: r0v217, types: [X.1DoS] */
    /* JADX WARN: Type inference failed for: r0v228, types: [X.1DoS] */
    /* JADX WARN: Type inference failed for: r8v26, types: [X.1DoP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIZ(long r30, X.EnumC1671200tag r32, X.InterfaceC1686690tzf r33, java.util.List<? extends X.InterfaceC1673370teB> r34, int r35, X.InterfaceC1689940u4u r36) {
        /*
            Method dump skipped, instruction units count: 2888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267001DoI.LJIIIZ(long, X.0tag, X.0tzf, java.util.List, int, X.0u4u):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r1 = false;
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.EnumC2266981DoG r5, int r6, int r7, int r8, boolean r9, boolean r10, int r11, int[] r12) {
        /*
            int[] r1 = X.C2266991DoH.LIZ
            int r0 = r5.ordinal()
            r4 = r1[r0]
            r3 = 0
            r2 = 1
            if (r4 == r2) goto L50
            r1 = 2
            if (r4 == r1) goto L4b
            r0 = 3
            if (r4 == r0) goto L33
            r0 = 4
            if (r4 != r0) goto L1a
            r12[r3] = r11
            r12[r2] = r11
            return
        L1a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            java.lang.String r0 = " is not supported"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            if (r10 != 0) goto L39
            if (r8 == r2) goto L43
            if (r8 != r1) goto L48
        L39:
            r1 = 1
            r0 = r6
        L3b:
            r12[r3] = r0
            if (r1 != 0) goto L40
            r6 = r11
        L40:
            r12[r2] = r6
            return
        L43:
            if (r7 != r2) goto L39
            if (r9 == 0) goto L48
            goto L39
        L48:
            r1 = 0
            r0 = 0
            goto L3b
        L4b:
            r12[r3] = r3
            r12[r2] = r11
            return
        L50:
            r12[r3] = r6
            r12[r2] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267001DoI.LJII(X.1DoG, int, int, int, boolean, boolean, int, int[]):void");
    }
}
