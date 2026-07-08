package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665480tRS implements InterfaceC1665350tRF<C1665490tRT>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 390));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1665480tRS.class, "shootComponent", "getShootComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/ShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1665480tRS.class, "recordControlCompatBridge", "getRecordControlCompatBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/bridge/RecordControlCompatBridgeApiComponent;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1665350tRF
    public final C05YD<C1665490tRT> LIZ() {
        return (C05YD) this.LLILZ.getValue();
    }

    public final InterfaceC1655300tB2 LIZLLL() {
        return (InterfaceC1655300tB2) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1665480tRS(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1655300tB2.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1656640tDC.class, null);
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [T, X.0ttv] */
    @Override // X.InterfaceC1665350tRF
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(C1665490tRT c1665490tRT, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1816255489);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1665490tRT)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C1665510tRV c1665510tRV = new C1665510tRV();
                c1665510tRV.LIZ = C1683130ttv.LJ;
                c13zcLJIIJ.LJJIJIIJI(c1665510tRV);
                obj = c1665510tRV;
            }
            C1665510tRV c1665510tRV2 = (C1665510tRV) obj;
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(c1665510tRV2);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(c1665510tRV2, (C1665510tRV<C1378605aS>) 272);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(c1685760tyA, (Function1) objLJJ2);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                c13zcLJIIJ.LJJIIJZLJL(-1634315612);
                if (c1665490tRT.LIZ) {
                    C1665540tRY.LIZ(c1665490tRT.LIZIZ, c13zcLJIIJ, 0);
                    Function0<Unit> function0 = c1665490tRT.LIZJ;
                    Function0<Unit> function02 = c1665490tRT.LIZLLL;
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    boolean zLJII2 = c13zcLJIIJ.LJII(c1665510tRV2);
                    if ((i2 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z | zLJII2;
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    if (z2 || objLJJ3 == c1680520tpi) {
                        objLJJ3 = new AwS391S0200000_25(c1665510tRV2, (C1665510tRV<C1683130ttv>) c1665490tRT, (C1665490tRT) 91);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1665840tS2.LIZ(function0, function02, (Function1) objLJJ3, c1665490tRT.LIZIZ, 0L, false, c13zcLJIIJ, 0, 48);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1665490tRT, i, 47);
        }
    }
}
