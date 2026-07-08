package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0teX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673590teX extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C13ES<C1673620tea> LL;
    public final /* synthetic */ C1689500u4C LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ IUpdateSettingService LLILZIL;
    public final /* synthetic */ ISettingService LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673590teX(C13ES<C1673620tea> c13es, C1689500u4C c1689500u4C, String str, String str2, IUpdateSettingService iUpdateSettingService, ISettingService iSettingService) {
        super(2);
        this.LL = c13es;
        this.LLILLJJLI = c1689500u4C;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = iUpdateSettingService;
        this.LLILZLL = iSettingService;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, interfaceC1680500tpg2);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1671840tbi.LIZ(C1682520tsw.LJIIIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 12, 8)), C1670400tZO.LIZIZ(interfaceC1680500tpg2).J3(), C1669050tXD.LIZIZ(C1670400tZO.LIZJ(interfaceC1680500tpg2).LJ));
            C13ES<C1673620tea> c13es = this.LL;
            C1689500u4C c1689500u4C = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            IUpdateSettingService iUpdateSettingService = this.LLILZIL;
            ISettingService iSettingService = this.LLILZLL;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, interfaceC1680500tpg2, 0);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(C1689570u4J.LIZ), C13Z4.LIZJ(1729350368, new C1673600teY(c13es, c1689500u4C, str, str2, iUpdateSettingService, interfaceC497601wk, iSettingService), interfaceC1680500tpg2), interfaceC1680500tpg2, 56);
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
