package X;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670000tYk extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670000tYk(String str, float f, float f2, float f3, boolean z) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = z;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 16, 0.0f, 0.0f, 13), this.LL), this.LL);
            boolean z = this.LLILLJJLI;
            float f = this.LLILLL;
            float f2 = this.LLILZ;
            String str = this.LLILZIL;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LJI);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                interfaceC1680500tpg2.LJJIIJZLJL(-622735865);
                if (!z) {
                    C1671420tb2.LJ(f, 0, interfaceC1680500tpg2, c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), "share_user_qr_code_left_top");
                    C1671420tb2.LJ(f, 0, interfaceC1680500tpg2, c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LIZLLL), "share_user_qr_code_top_right");
                    C1671420tb2.LJ(f, 0, interfaceC1680500tpg2, c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJII), "share_user_qr_code_bottom_left");
                    C1671420tb2.LJ(f, 0, interfaceC1680500tpg2, c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIZ), "share_user_qr_code_right_bottom");
                }
                interfaceC1680500tpg2.LJ();
                C1671420tb2.LIZLLL(f2, 0, interfaceC1680500tpg2, c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), str);
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
