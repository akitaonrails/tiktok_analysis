package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694260uBs {
    public C1686970u07 LIZ = new C1686970u07(C1692250u8d.LIZ, C1692280u8g.LIZIZ, (C1692280u8g) null);
    public C1694290uBv LIZIZ;

    public C1694260uBs() {
        C1686970u07 c1686970u07 = this.LIZ;
        this.LIZIZ = new C1694290uBv(c1686970u07.LIZ, c1686970u07.LIZIZ);
    }

    public final C1686970u07 LIZ(List<? extends InterfaceC1694390uC5> list) {
        long jLIZ;
        InterfaceC1694390uC5 interfaceC1694390uC5 = null;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    InterfaceC1694390uC5 interfaceC1694390uC52 = list.get(i);
                    try {
                        interfaceC1694390uC52.LIZ(this.LIZIZ);
                        i++;
                        interfaceC1694390uC5 = interfaceC1694390uC52;
                    } catch (Exception e) {
                        e = e;
                        interfaceC1694390uC5 = interfaceC1694390uC52;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error while applying EditCommand batch to buffer (length=");
                        sbLIZ.append(this.LIZIZ.LIZLLL());
                        sbLIZ.append(", composition=");
                        sbLIZ.append(this.LIZIZ.LIZJ());
                        sbLIZ.append(", selection=");
                        C1694290uBv c1694290uBv = this.LIZIZ;
                        sbLIZ.append((Object) C1692280u8g.LJIIIIZZ(C1680680tpy.LIZ(c1694290uBv.LIZIZ, c1694290uBv.LIZJ)));
                        sbLIZ.append("):");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        sb.append('\n');
                        C13LP.LJJLIIIIJ(list, sb, "\n", new AwS391S0200000_25(interfaceC1694390uC5, this, 181), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            C1694290uBv c1694290uBv2 = this.LIZIZ;
            c1694290uBv2.getClass();
            C1692220u8a c1692220u8a = new C1692220u8a(c1694290uBv2.toString());
            C1694290uBv c1694290uBv3 = this.LIZIZ;
            long jLIZ2 = C1680680tpy.LIZ(c1694290uBv3.LIZIZ, c1694290uBv3.LIZJ);
            C1692280u8g c1692280u8g = new C1692280u8g(jLIZ2);
            if (!C1692280u8g.LJII(this.LIZ.LIZIZ)) {
                jLIZ = c1692280u8g.LIZ;
            } else {
                jLIZ = C1680680tpy.LIZ(C1692280u8g.LJFF(jLIZ2), C1692280u8g.LJI(jLIZ2));
            }
            C1686970u07 c1686970u07 = new C1686970u07(c1692220u8a, jLIZ, this.LIZIZ.LIZJ());
            this.LIZ = c1686970u07;
            return c1686970u07;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void LIZIZ(C1686970u07 c1686970u07, C1692530u95 c1692530u95) {
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(c1686970u07.LIZJ, this.LIZIZ.LIZJ());
        boolean z3 = false;
        if (!Intrinsics.LJFF(this.LIZ.LIZ.LLILLJJLI, c1686970u07.LIZ.LLILLJJLI)) {
            this.LIZIZ = new C1694290uBv(c1686970u07.LIZ, c1686970u07.LIZIZ);
        } else if (!C1692280u8g.LIZIZ(this.LIZ.LIZIZ, c1686970u07.LIZIZ)) {
            this.LIZIZ.LJI(C1692280u8g.LJI(c1686970u07.LIZIZ), C1692280u8g.LJFF(c1686970u07.LIZIZ));
            z3 = true;
            z = false;
        } else {
            z = false;
        }
        C1692280u8g c1692280u8g = c1686970u07.LIZJ;
        if (c1692280u8g == null) {
            C1694290uBv c1694290uBv = this.LIZIZ;
            c1694290uBv.LIZLLL = -1;
            c1694290uBv.LJ = -1;
        } else if (!C1692280u8g.LIZJ(c1692280u8g.LIZ)) {
            this.LIZIZ.LJFF(C1692280u8g.LJI(c1686970u07.LIZJ.LIZ), C1692280u8g.LJFF(c1686970u07.LIZJ.LIZ));
        }
        if (z || (!z3 && z2)) {
            C1694290uBv c1694290uBv2 = this.LIZIZ;
            c1694290uBv2.LIZLLL = -1;
            c1694290uBv2.LJ = -1;
            c1686970u07 = C1686970u07.LIZIZ(c1686970u07, null, 0L, 3);
        }
        C1686970u07 c1686970u072 = this.LIZ;
        this.LIZ = c1686970u07;
        if (c1692530u95 != null && Intrinsics.LJFF(c1692530u95.LIZ.LIZIZ.get(), c1692530u95)) {
            c1692530u95.LIZIZ.LIZLLL(c1686970u072, c1686970u07);
        }
    }
}
