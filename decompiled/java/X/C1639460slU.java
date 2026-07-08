package X;

import android.content.Context;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import j1d.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0slU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639460slU implements InterfaceC1639580slg {
    public final Context LIZ;
    public final InterfaceC1456340o08<InterfaceC1635390sev> LIZIZ;
    public final InterfaceC1456340o08<String> LIZJ;
    public final InterfaceC1639390slN LIZLLL;
    public final boolean LJ = false;
    public final Function1<Context, Boolean> LJFF;
    public InterfaceC1456340o08<InterfaceC1639450slT> LJI;
    public InterfaceC1456340o08<InterfaceC1639300slE> LJII;
    public InterfaceC1456340o08<AbstractC1524320plm> LJIIIIZZ;
    public Boolean LJIIIZ;
    public InterfaceC1456340o08<InterfaceC1635100seS> LJIIJ;
    public InterfaceC1456340o08<InterfaceC1639610slj> LJIIJJI;

    @Override // X.InterfaceC1639580slg
    public final a create() {
        InterfaceC1639450slT c1639600sli;
        InterfaceC1639300slE interfaceC1639300slE;
        InterfaceC1456340o08<InterfaceC1639450slT> interfaceC1456340o08 = this.LJI;
        if (interfaceC1456340o08 == null || (c1639600sli = interfaceC1456340o08.get()) == null) {
            c1639600sli = new C1639600sli(new C1639500slY(new C0VSJ(C2286708xd.LJIILIIL(this.LIZ), "filters").getAbsolutePath()));
        }
        C1638240sjW.LIZIZ = c1639600sli.LIZIZ();
        InterfaceC1456340o08<InterfaceC1639610slj> interfaceC1456340o082 = this.LJIIJJI;
        if (interfaceC1456340o082 != null) {
            c1639600sli.LIZLLL(interfaceC1456340o082.get());
        }
        InterfaceC1456340o08<InterfaceC1639300slE> interfaceC1456340o083 = this.LJII;
        if (interfaceC1456340o083 == null || (interfaceC1639300slE = interfaceC1456340o083.get()) == null) {
            interfaceC1639300slE = C1639560sle.LIZ;
        }
        InterfaceC1456340o08<AbstractC1524320plm> interfaceC1456340o084 = this.LJIIIIZZ;
        if (interfaceC1456340o084 == null) {
            interfaceC1456340o084 = new InterfaceC1456340o08<AbstractC1524320plm>() { // from class: X.0slZ
                public final C01GW LL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(443));

                /* JADX WARN: Type inference failed for: r0v1, types: [X.0plm, java.lang.Object] */
                @Override // X.InterfaceC1456340o08
                public final AbstractC1524320plm get() {
                    return this.LL.getValue();
                }
            };
        }
        C1639350slJ c1639350slJ = new C1639350slJ(c1639600sli, interfaceC1639300slE, interfaceC1456340o084);
        InterfaceC1456340o08<InterfaceC1635100seS> interfaceC1456340o085 = this.LJIIJ;
        if (interfaceC1456340o085 != null) {
            c1639350slJ.LJI = interfaceC1456340o085.get();
        }
        C1639330slH c1639330slH = new C1639330slH(interfaceC1639300slE, c1639350slJ, c1639600sli);
        C1638420sjo c1638420sjo = new C1638420sjo(new p0(interfaceC1639300slE), new C1638410sjn(this.LIZIZ, this.LIZJ, this.LJ, new AwS569S0100000_25(this, 837)));
        C1639620slk c1639620slk = new C1639620slk();
        Boolean bool = this.LJIIIZ;
        return new a(c1639600sli, c1639350slJ, interfaceC1639300slE, c1638420sjo, c1639330slH, c1639620slk, bool != null ? bool.booleanValue() : true, this.LIZLLL, this.LIZJ);
    }

    public C1639460slU(Context context, C1639540slc c1639540slc, InterfaceC1456340o08 interfaceC1456340o08, C1639530slb c1639530slb, AFwS228S0000000_1 aFwS228S0000000_1) {
        this.LIZ = context;
        this.LIZIZ = c1639540slc;
        this.LIZJ = interfaceC1456340o08;
        this.LIZLLL = c1639530slb;
        this.LJFF = aFwS228S0000000_1;
    }
}
