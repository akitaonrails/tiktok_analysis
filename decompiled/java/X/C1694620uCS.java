package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694620uCS {
    public final C1691930u87 LIZ;
    public final C1692140u8S LIZIZ;
    public final C1686970u07 LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C1694460uCC LJFF;
    public final InterfaceC1692600u9C LJI;
    public final C1694630uCT LJII;
    public final C1694470uCD LJIIIIZZ;
    public final InterfaceC1694760uCg LJIIIZ;
    public final Function1<C1686970u07, Unit> LJIIJ;
    public final int LJIIJJI;

    public C1694620uCS() {
        throw null;
    }

    public final void LIZ(List<? extends InterfaceC1694390uC5> list) {
        C1694260uBs c1694260uBs = this.LIZ.LIZLLL;
        ArrayList arrayList = new ArrayList(list);
        ListProtector.add(arrayList, 0, new C1694340uC0());
        this.LJIIJ.invoke(c1694260uBs.LIZ(arrayList));
    }

    public C1694620uCS(C1691930u87 c1691930u87, C1692140u8S c1692140u8S, C1686970u07 c1686970u07, boolean z, boolean z2, C1694460uCC c1694460uCC, InterfaceC1692600u9C interfaceC1692600u9C, C1694630uCT c1694630uCT, C1694470uCD c1694470uCD, Function1 function1, int i) {
        C2281421ERo c2281421ERo = C1694780uCi.LIZ;
        this.LIZ = c1691930u87;
        this.LIZIZ = c1692140u8S;
        this.LIZJ = c1686970u07;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = c1694460uCC;
        this.LJI = interfaceC1692600u9C;
        this.LJII = c1694630uCT;
        this.LJIIIIZZ = c1694470uCD;
        this.LJIIIZ = c2281421ERo;
        this.LJIIJ = function1;
        this.LJIIJJI = i;
    }
}
