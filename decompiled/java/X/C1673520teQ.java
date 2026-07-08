package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS156S1200000_19;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0teQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673520teQ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<AlertToneValueItem> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;
    public final /* synthetic */ InterfaceC1676320tiw LLILZIL;
    public final /* synthetic */ Function1<AlertToneValueItem, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1673520teQ(List<AlertToneValueItem> list, int i, boolean z, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1676320tiw interfaceC1676320tiw2, Function1<? super AlertToneValueItem, Unit> function1, String str) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = interfaceC1676320tiw;
        this.LLILZIL = interfaceC1676320tiw2;
        this.LLILZLL = function1;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            List<AlertToneValueItem> list = this.LL;
            int i = this.LLILLJJLI;
            boolean z = this.LLILLL;
            InterfaceC1676320tiw interfaceC1676320tiw = this.LLILZ;
            InterfaceC1676320tiw interfaceC1676320tiw2 = this.LLILZIL;
            Function1<AlertToneValueItem, Unit> function1 = this.LLILZLL;
            String str = this.LLIZ;
            boolean z2 = false;
            int i2 = 0;
            for (AlertToneValueItem alertToneValueItem : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AlertToneValueItem alertToneValueItem2 = alertToneValueItem;
                    interfaceC1680500tpg2.LJJIIJZLJL(688241920);
                    if (i2 == i && z) {
                        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                        interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
                        Object objLJJ = interfaceC1680500tpg2.LJJ();
                        InterfaceC1680500tpg.LIZ.getClass();
                        if (objLJJ == C1680510tph.LIZIZ) {
                            objLJJ = new AwS391S0200000_25(interfaceC1676320tiw, interfaceC1676320tiw2, 48);
                            interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
                        }
                        interfaceC1680500tpg2.LJ();
                        interfaceC1685750ty9LIZ = C1685330txT.LIZ(c1685760tyA, (Function1) objLJJ);
                    } else {
                        interfaceC1685750ty9LIZ = InterfaceC1685750ty9.LIZ;
                    }
                    interfaceC1680500tpg2.LJ();
                    InterfaceC1668050tVb.LIZ.getClass();
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, z2);
                    int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
                    C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LIZ);
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
                        C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(C1689570u4J.LIZ), C13Z4.LIZJ(-727281525, new AwS156S1200000_19(alertToneValueItem2, (AlertToneValueItem) function1, (Function1<? super AlertToneValueItem, Unit>) str, (String) 0), interfaceC1680500tpg2), interfaceC1680500tpg2, 56);
                        interfaceC1680500tpg2.LJIIIZ();
                        i2 = i3;
                        z2 = false;
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }
}
