package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534300q1s extends AbstractC1534540q2G {
    public final C1533570q0h LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1535220q3M
    public final String getName() {
        return "GeckoUpdateProvider";
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return EnumC1528510psX.REGISTER_CALLBACK;
    }

    @Override // X.AbstractC1534540q2G
    public final boolean LJIIIZ(C1533790q13 c1533790q13) {
        C1533510q0b c1533510q0b = c1533790q13.LIZ.LJJJJLI;
        if (!c1533510q0b.LJI) {
            if (c1533510q0b.LIZLLL || c1533510q0b.LJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1534540q2G
    public final void LJII(final C1533790q13 c1533790q13, final Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
        final C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        LJ().LIZLLL("update");
        final boolean z = c1533490q0Z.LJJIJL;
        if (z) {
            function1.invoke(null);
            return;
        }
        c1533490q0Z.LJJJJLL = true;
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        String str = c1533510q0b.LIZIZ;
        final String str2 = c1533510q0b.LIZJ;
        GeckoXAdapter.Companion.checkUpdate(c1533490q0Z.LJJJJJ, false, str, c1533490q0Z, new InterfaceC1533390q0P() { // from class: X.0q1h
            public boolean LIZ;

            @Override // X.InterfaceC1533390q0P
            public final void LIZ(String str3, Throwable th) {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download failed with waitGeckoUpdate=");
                sbLIZ.append(c1533490q0Z.LJJJJLI.LIZLLL);
                sbLIZ.append(" ,channel = ");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle = ");
                sbLIZ.append(str2);
                sbLIZ.append(',');
                sbLIZ.append(th.getMessage());
                C1534250q1n.LIZIZ("GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
                this.LIZIZ.LJ().LIZJ("update");
                C1534300q1s c1534300q1s = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CheckUpdate Failed:");
                sbLIZ2.append(th.getMessage());
                c1534300q1s.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", "failed, skip callbacks when onlyLocal is true");
                    return;
                }
                C1534270q1p c1534270q1p = GeckoFetcher.Companion;
                Forest forest = c1533490q0Z.LJJJJJ;
                String str4 = str2;
                C1533790q13 c1533790q132 = c1533790q13;
                C1533570q0h c1533570q0h = this.LIZIZ.LIZLLL;
                c1534270q1p.getClass();
                C0VSJ c0vsjLIZIZ = C1534270q1p.LIZIZ(forest, str3, str4, c1533790q132, c1533570q0h);
                if (c0vsjLIZIZ != null && c0vsjLIZIZ.exists()) {
                    C1534120q1a c1534120q1a = new C1534120q1a(c0vsjLIZIZ, true, false, false, false);
                    this.LIZIZ.LJFF(c1534120q1a);
                    c1534120q1a.LJII(c1533790q13, function1);
                } else {
                    this.LIZIZ.LJIIIIZZ("update gecko but file not exists");
                    function1.invoke(null);
                }
            }

            @Override // X.InterfaceC1533390q0P
            public final void LIZIZ(Long l, String str3) {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                this.LIZIZ.LJ().LIZJ("update");
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download success with waitGeckoUpdate=");
                sbLIZ.append(c1533490q0Z.LJJJJLI.LIZLLL);
                sbLIZ.append(" , channel=");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle=");
                sbLIZ.append(str2);
                C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ));
                C1534300q1s c1534300q1s = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("is expire cleaned:");
                sbLIZ2.append(c1533790q13.LIZLLL.LIZLLL);
                c1534300q1s.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", "success, skip callbacks when onlyLocal is true");
                    return;
                }
                C1534270q1p c1534270q1p = GeckoFetcher.Companion;
                Forest forest = c1533490q0Z.LJJJJJ;
                String str4 = str2;
                C1533790q13 c1533790q132 = c1533790q13;
                C1533570q0h c1533570q0h = this.LIZIZ.LIZLLL;
                c1534270q1p.getClass();
                C0VSJ c0vsjLIZIZ = C1534270q1p.LIZIZ(forest, str3, str4, c1533790q132, c1533570q0h);
                if (c0vsjLIZIZ != null && c0vsjLIZIZ.exists()) {
                    C1534120q1a c1534120q1a = new C1534120q1a(c0vsjLIZIZ, true, false, false, false);
                    this.LIZIZ.LJFF(c1534120q1a);
                    c1534120q1a.LJII(c1533790q13, function1);
                } else {
                    this.LIZIZ.LJIIIIZZ("update gecko but file not exists");
                    function1.invoke(null);
                }
            }
        }, this.LJ, this.LJFF);
    }

    public /* synthetic */ C1534300q1s(C1533570q0h c1533570q0h, boolean z, int i) {
        this(c1533570q0h, (i & 2) != 0 ? false : z, false);
    }

    public C1534300q1s(C1533570q0h c1533570q0h, boolean z, boolean z2) {
        this.LIZLLL = c1533570q0h;
        this.LJ = z;
        this.LJFF = z2;
    }
}
