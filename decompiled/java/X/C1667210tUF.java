package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS111S0210000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667210tUF extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667210tUF(boolean z) {
        super(2);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int i;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1679940tom c1679940tom = C1679930tol.LJ;
            boolean z = this.LL;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1679940tom, c1296860jqu, interfaceC1680500tpg2, 54);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL);
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
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                float f = 44;
                C1668930tX1.LIZIZ(C1669660tYC.k, null, C1685720ty6.LIZIZ(c.LJIILIIL(c1685760tyA, 51), new AwS111S0210000_25(true, (boolean) EnumC1669110tXJ.Clockwise, (EnumC1669110tXJ) C1671550tbF.LIZ(C1671550tbF.LIZLLL(LSPassThroughRecordSizeConfig.DEFAULT, 0, C05Y0.LIZLLL, 2), C0N66.Restart, 0L, 4), (C1677040tk6<Float>) 0)), C1670400tZO.LIZIZ(interfaceC1680500tpg2).B2(), f, f, false, interfaceC1680500tpg2, 221232, 64);
                C1665790tRx.LIZ(c.LJIILIIL(c1685760tyA, 10), interfaceC1680500tpg2);
                if (z) {
                    interfaceC1680500tpg2.LJJIIJZLJL(2073736408);
                    i = 2131849076;
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(2073738520);
                    i = 2131849077;
                }
                String strLIZIZ = C0MBB.LIZIZ(i, interfaceC1680500tpg2);
                interfaceC1680500tpg2.LJ();
                C1685190txF.LIZ(strLIZIZ, null, C1670400tZO.LIZIZ(interfaceC1680500tpg2).B2(), C1670400tZO.LJ(interfaceC1680500tpg2).LJ, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg2, 0, 0, 2034);
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
