package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650750Pfl implements InterfaceC648680PcQ {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(573));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(574));

    public final InterfaceC650760Pfm LIZIZ() {
        return (InterfaceC650760Pfm) this.LIZIZ.getValue();
    }

    public C650750Pfl(RecyclerView recyclerView) {
        if (C07EX.LIZ()) {
            recyclerView.addItemDecoration(new C689730R3r(this, 3));
        }
    }

    @Override // X.InterfaceC648680PcQ
    public final List<InterfaceC650860Pfw> LIZ(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i) {
        boolean z;
        C650770Pfn c650770Pfn;
        C650770Pfn c650770Pfn2;
        if (i < 20 && i > 2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = C648710PcT.LIZ[enumC648690PcR.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return LIZIZ().LIZIZ(enumC648690PcR, recyclerView, list, i, z);
                }
                throw new C1954807lC();
            }
            return LIZIZ().LIZIZ(enumC648690PcR, recyclerView, list, i, z);
        }
        InterfaceC650760Pfm interfaceC650760PfmLIZIZ = LIZIZ();
        InterfaceC650860Pfw interfaceC650860Pfw = null;
        if ((interfaceC650760PfmLIZIZ instanceof C650770Pfn) && (c650770Pfn2 = (C650770Pfn) interfaceC650760PfmLIZIZ) != null) {
            c650770Pfn2.LIZLLL = false;
            c650770Pfn2.LJ = false;
            c650770Pfn2.LJFF = null;
            c650770Pfn2.LJI = new C650820Pfs();
        }
        List<InterfaceC650860Pfw> listLIZ = ((InterfaceC650760Pfm) this.LIZ.getValue()).LIZ(recyclerView, list);
        InterfaceC650760Pfm interfaceC650760PfmLIZIZ2 = LIZIZ();
        if (!(interfaceC650760PfmLIZIZ2 instanceof C650770Pfn) || (c650770Pfn = (C650770Pfn) interfaceC650760PfmLIZIZ2) == null) {
            return listLIZ;
        }
        if (listLIZ != null && (interfaceC650860Pfw = (InterfaceC650860Pfw) C13LP.LJJJLL(listLIZ)) != null && interfaceC650860Pfw.LJFF() == 1) {
            return listLIZ;
        }
        c650770Pfn.LJFF = interfaceC650860Pfw;
        return listLIZ;
    }
}
