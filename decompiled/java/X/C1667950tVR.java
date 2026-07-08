package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667950tVR extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ LoginChooseAccountsFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667950tVR(String str, LoginChooseAccountsFragment loginChooseAccountsFragment, String str2, String str3, String str4) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = loginChooseAccountsFragment;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        C19719212De c19719212DeLIZJ;
        String curUserId;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LJ(c1685760tyA, 1.0f), 12);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            String str = this.LL;
            LoginChooseAccountsFragment loginChooseAccountsFragment = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg2, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LJIIIIZZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(interfaceC1680500tpg2, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                C1175204ik c1175204ik = new C1175204ik(str);
                float f = 16;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJI(c.LJIILLIIL(c1685760tyA, 64), 48), 0.0f, 0.0f, f, 0.0f, 11);
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg2.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS266S0000000_25.get$arr$(78);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg2.LJ();
                C1670540tZc.LIZ(c1175204ik, "avatar", interfaceC1685750ty9LJIIL, null, null, null, null, null, null, null, (Function1) objLJJ, null, interfaceC1680500tpg2, 432, 6, 3064);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = c1687980u1k.LIZ(c1685760tyA, 1.0f, true);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, interfaceC1680500tpg2, 0);
                int iLIZ2 = C0MXE.LIZ(interfaceC1680500tpg2);
                C13D2 c13d2LJJIFFI2 = interfaceC1680500tpg2.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZ);
                if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                    interfaceC1680500tpg2.LJJIII();
                    if (interfaceC1680500tpg2.LJJIIZ()) {
                        interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                    } else {
                        interfaceC1680500tpg2.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg2, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI2, aFwS311S0000000_252);
                    if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ2))) {
                        interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    String str5 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    interfaceC1680500tpg2.LJJIIJZLJL(-836109243);
                    loginChooseAccountsFragment.getClass();
                    IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                    if (iAccountUserService != null && (curUserId = iAccountUserService.getCurUserId()) != null) {
                        str5 = curUserId;
                    }
                    if (Intrinsics.LJFF(str5, str3)) {
                        c19719212DeLIZJ = C13Z4.LIZJ(573539441, new AwS639S0100000_25(loginChooseAccountsFragment, 15), interfaceC1680500tpg2);
                    } else {
                        c19719212DeLIZJ = null;
                    }
                    interfaceC1680500tpg2.LJ();
                    loginChooseAccountsFragment.RS(str2, c19719212DeLIZJ, null, interfaceC1680500tpg2, 0, 4);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(c1685760tyA, 0.0f, 6, 0.0f, 0.0f, 13);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(str4);
                    C1685190txF.LIZ(C2188811AlT.LIZIZ(sbLIZ), interfaceC1685750ty9LJIIL2, C1670400tZO.LIZIZ(interfaceC1680500tpg2).N3(), C1670400tZO.LJ(interfaceC1680500tpg2).LJIIZILJ, 0L, 1, 2, false, 1, null, null, interfaceC1680500tpg2, 102236208, 0, 1680);
                    interfaceC1680500tpg2.LJIIIZ();
                    C1668880tWw c1668880tWw = C1669660tYC.LJJLIIIIJ;
                    long jQ3 = C1670400tZO.LIZIZ(interfaceC1680500tpg2).Q3();
                    interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                    Object objLJJ2 = interfaceC1680500tpg2.LJJ();
                    if (objLJJ2 == c1680520tpi) {
                        objLJJ2 = AFwS214S0000000_25.get$arr$(82);
                        interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
                    }
                    interfaceC1680500tpg2.LJ();
                    C1668930tX1.LIZIZ(c1668880tWw, "", C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 7), jQ3, f, f, false, interfaceC1680500tpg2, 221232, 64);
                    interfaceC1680500tpg2.LJIIIZ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
