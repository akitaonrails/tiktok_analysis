package X;

import androidx.compose.foundation.layout.c;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS20S0202000_19;
import kotlin.jvm.internal.AwS25S2200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669520tXy {
    public static final C1238980iLY LIZJ(C05P1<C1238980iLY> c05p1) {
        return c05p1.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669520tXy.LIZ(X.0tpg, int):void");
    }

    public static final void LIZIZ(SignupViewModel signupViewModel, SmsInputViewModel smsInputViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        int i5;
        float f;
        C1666330tSp c1666330tSpLIZ;
        String str;
        Object obj;
        long j;
        boolean z;
        C1669370tXj c1669370tXjLIZ;
        int i6;
        SmsInputViewModel smsInputViewModel2 = smsInputViewModel;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1971725932);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(signupViewModel)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJII(smsInputViewModel2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else if ((i2 & 2) != 0) {
                c13zcLJIIJ.LJJIJIIJIL(1729797275);
                ViewModelStoreOwner viewModelStoreOwnerLIZ = C1685320txS.LIZ(c13zcLJIIJ);
                if (viewModelStoreOwnerLIZ != null) {
                    if (viewModelStoreOwnerLIZ instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZ).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = C903300Zc8.LIZJ;
                    }
                    ViewModel viewModelLIZIZ = C1674760tgQ.LIZIZ(SmsInputViewModel.class, viewModelStoreOwnerLIZ, null, defaultViewModelCreationExtras, c13zcLJIIJ);
                    c13zcLJIIJ.LJJJJL(false);
                    smsInputViewModel2 = (SmsInputViewModel) viewModelLIZIZ;
                } else {
                    "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(smsInputViewModel2.LLILLJJLI, c13zcLJIIJ, 0);
            String enterFrom = signupViewModel.getEnterFrom();
            String enterMethod = signupViewModel.getEnterMethod();
            String strYQ2 = signupViewModel.yQ2();
            String strLIZIZ = C0MBB.LIZIZ(2131838756, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131829357, c13zcLJIIJ);
            String strLIZIZ3 = C0MBB.LIZIZ(2131829357, c13zcLJIIJ);
            String strLIZIZ4 = C0MBB.LIZIZ(2131835079, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj2 = objLJJ;
            if (objLJJ == c1680520tpi) {
                Boolean boolValueOf = Boolean.valueOf(((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ());
                c13zcLJIIJ.LJJIJIIJI(boolValueOf);
                obj2 = boolValueOf;
            }
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(enterFrom) | c13zcLJIIJ.LJII(smsInputViewModel2) | c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJJIIJ(enterMethod);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                Object obj3 = objLJJ2;
                if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                    AwS25S2200000_19 awS25S2200000_19 = new AwS25S2200000_19(enterFrom, smsInputViewModel2, enterMethod, c05p0LIZIZ, 6);
                    c13zcLJIIJ.LJJIJIIJI(awS25S2200000_19);
                    obj3 = awS25S2200000_19;
                }
                Function1 function1 = (Function1) obj3;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI2 = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJJIIJ(strLIZIZ2);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                Object obj4 = objLJJ3;
                if (zLJJIIJ2 || objLJJ3 == c1680520tpi) {
                    AwS133S1100000_19 awS133S1100000_19 = new AwS133S1100000_19(c05p0LIZIZ, strLIZIZ2, 32);
                    c13zcLJIIJ.LJJIJIIJI(awS133S1100000_19);
                    obj4 = awS133S1100000_19;
                }
                c13zcLJIIJ.LJJJJL(false);
                boolean z2 = false;
                C20084413iE.LIZ(48, 0, c13zcLJIIJ, interfaceC1685750ty9LJIJI2, function1, (Function1) obj4);
                c13zcLJIIJ.LJJIIJZLJL(76056594);
                if (LIZJ(c05p0LIZIZ).LIZ && zBooleanValue) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 12, 0.0f, 0.0f, 13), 1.0f);
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    boolean zLJII = c13zcLJIIJ.LJII(smsInputViewModel2);
                    Object objLJJ4 = c13zcLJIIJ.LJJ();
                    Object obj5 = objLJJ4;
                    if (zLJII || objLJJ4 == c1680520tpi) {
                        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(smsInputViewModel2, 3414);
                        c13zcLJIIJ.LJJIJIIJI(awS563S0100000_19);
                        obj5 = awS563S0100000_19;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LJ, false, null, (Function0) obj5, 7);
                    C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                        boolean z3 = ((C1238980iLY) c05p0LIZIZ.getValue()).LJFF;
                        C1669440tXq c1669440tXq = C1669440tXq.LIZIZ;
                        C1669500tXw c1669500tXw = C1669500tXw.LIZJ;
                        if (C294000Bfi.LIZ()) {
                            c13zcLJIIJ.LJJIIJZLJL(127562304);
                            j = 0;
                            z = false;
                            c1669370tXjLIZ = C1669380tXk.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).R2(), 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).o3(), c13zcLJIIJ, 0, 10);
                            z2 = false;
                            c13zcLJIIJ.LJJJJL(false);
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(127817496);
                            j = 0;
                            z = false;
                            c1669370tXjLIZ = C1669380tXk.LIZ(0L, 0L, 0L, c13zcLJIIJ, 0, 15);
                            z2 = false;
                            c13zcLJIIJ.LJJJJL(false);
                        }
                        C1669470tXt.LIZ(z3, null, null, z, c1669440tXq, c1669500tXw, z, null, c1669370tXjLIZ, c13zcLJIIJ, 48, 204);
                        C1685190txF.LIZ(C0MBB.LIZIZ(2131845757, c13zcLJIIJ), C1682520tsw.LJIIL(c1685760tyA, 8, 0.0f, 0.0f, 0.0f, 14), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, j, z ? 1 : 0, z ? 1 : 0, z, z ? 1 : 0, null, null, c13zcLJIIJ, 48, z ? 1 : 0, 2032);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                }
                c13zcLJIIJ.LJJJJL(z2);
                if (AccountGSMAPhase2Experiment.LIZJ() && ((C1238980iLY) c05p0LIZIZ.getValue()).LIZ) {
                    i5 = 2131824511;
                } else {
                    i5 = 2131837635;
                }
                String strLIZIZ5 = C0MBB.LIZIZ(i5, c13zcLJIIJ);
                C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15);
                if (C294000Bfi.LIZ()) {
                    c13zcLJIIJ.LJJIIJZLJL(-1929927880);
                    f = 0.0f;
                    c1666330tSpLIZ = C1666340tSq.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).o3(), C1670400tZO.LIZIZ(c13zcLJIIJ).R2(), 0.0f, C1670400tZO.LIZIZ(c13zcLJIIJ).o3(), c13zcLJIIJ, 0, 12);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-1929635519);
                    f = 0.0f;
                    c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31);
                    c13zcLJIIJ.LJJJJL(false);
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, 24, f, f, 13);
                boolean z4 = ((C1238980iLY) c05p0LIZIZ.getValue()).LIZLLL;
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJII2 = c13zcLJIIJ.LJII(smsInputViewModel2) | c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJJIIJ(strLIZIZ) | c13zcLJIIJ.LJJIIJ(enterMethod) | c13zcLJIIJ.LJJIIJ(enterFrom) | c13zcLJIIJ.LJJIIJ(strYQ2) | c13zcLJIIJ.LJJIIJ(strLIZIZ2) | c13zcLJIIJ.LJII(signupViewModel) | c13zcLJIIJ.LJJIIJ(strLIZIZ3) | c13zcLJIIJ.LJJIIJ(strLIZIZ4);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (!zLJII2 && objLJJ5 != c1680520tpi) {
                    str = strLIZIZ;
                    obj = objLJJ5;
                } else {
                    str = strLIZIZ;
                    C1238950iLV c1238950iLV = new C1238950iLV(smsInputViewModel2, strLIZIZ, enterMethod, enterFrom, strYQ2, strLIZIZ2, zBooleanValue, signupViewModel, c05p0LIZIZ, strLIZIZ3, strLIZIZ4);
                    c13zcLJIIJ.LJJIJIIJI(c1238950iLV);
                    obj = c1238950iLV;
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673400teE.LIZJ((Function0) obj, strLIZIZ5, interfaceC1685750ty9LJIIL, false, 0L, false, null, null, null, c1666930tTnLIZ, c1666330tSpLIZ, null, z4, c13zcLJIIJ, 384, 0, 2552);
                c13zcLJIIJ.LJJIIJZLJL(76310314);
                if (((C1238980iLY) c05p0LIZIZ.getValue()).LIZ && AccountGSMAPhase2Experiment.LIZIZ()) {
                    String strLIZIZ6 = C0MBB.LIZIZ(2131824507, c13zcLJIIJ);
                    C1666930tTn c1666930tTnLIZ2 = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15);
                    C1666330tSp c1666330tSpLIZIZ = C1666340tSq.LIZIZ(0L, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), 0L, c13zcLJIIJ, 0, 29);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(c1685760tyA, 1.0f);
                    boolean z5 = ((C1238980iLY) c05p0LIZIZ.getValue()).LIZLLL;
                    c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                    boolean zLJII3 = c13zcLJIIJ.LJII(smsInputViewModel2) | c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJJIIJ(str) | c13zcLJIIJ.LJJIIJ(enterFrom) | c13zcLJIIJ.LJJIIJ(enterMethod) | c13zcLJIIJ.LJJIIJ(strLIZIZ2) | c13zcLJIIJ.LJII(signupViewModel) | c13zcLJIIJ.LJJIIJ(strLIZIZ3);
                    Object objLJJ6 = c13zcLJIIJ.LJJ();
                    Object obj6 = objLJJ6;
                    if (zLJII3 || objLJJ6 == c1680520tpi) {
                        C1238970iLX c1238970iLX = new C1238970iLX(smsInputViewModel2, str, enterFrom, enterMethod, strLIZIZ2, signupViewModel, zBooleanValue, c05p0LIZIZ, strLIZIZ3);
                        c13zcLJIIJ.LJJIJIIJI(c1238970iLX);
                        obj6 = c1238970iLX;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1673400teE.LIZJ((Function0) obj6, strLIZIZ6, interfaceC1685750ty9LJ2, false, 0L, false, null, null, null, c1666930tTnLIZ2, c1666330tSpLIZIZ, null, z5, c13zcLJIIJ, 384, 0, 2552);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(76374443);
                if (((C1238980iLY) c05p0LIZIZ.getValue()).LIZ) {
                    LIZ(c13zcLJIIJ, 0);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS20S0202000_19(signupViewModel, smsInputViewModel2, i, i2, 3);
        }
    }
}
