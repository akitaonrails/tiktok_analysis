package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0teR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673530teR extends C09AY implements InterfaceC1631620sYq<InterfaceC1686920u02, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<AlertToneValueItem> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;
    public final /* synthetic */ InterfaceC1676320tiw LLILZIL;
    public final /* synthetic */ Function1<AlertToneValueItem, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1673530teR(List<AlertToneValueItem> list, int i, boolean z, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1676320tiw interfaceC1676320tiw2, Function1<? super AlertToneValueItem, Unit> function1, String str) {
        super(3);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = interfaceC1676320tiw;
        this.LLILZIL = interfaceC1676320tiw2;
        this.LLILZLL = function1;
        this.LLIZ = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            List<AlertToneValueItem> list = this.LL;
            int i = this.LLILLJJLI;
            boolean z = this.LLILLL;
            InterfaceC1676320tiw interfaceC1676320tiw = this.LLILZ;
            InterfaceC1676320tiw interfaceC1676320tiw2 = this.LLILZIL;
            Function1<AlertToneValueItem, Unit> function1 = this.LLILZLL;
            String str = this.LLIZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, interfaceC1680500tpg2, 0);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, c1685760tyA);
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
                C1689210u3j.LJIIIIZZ(6, 0, interfaceC1680500tpg2, C13Z4.LIZJ(9654706, new C1673520teQ(list, i, z, interfaceC1676320tiw, interfaceC1676320tiw2, function1, str), interfaceC1680500tpg2));
                interfaceC1680500tpg2.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
