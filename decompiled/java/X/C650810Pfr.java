package X;

import Y.ARunnableS110S0100000_10;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Pfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650810Pfr implements InterfaceC648680PcQ {
    public final RecyclerView LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C650780Pfo LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1108));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1107));

    public final void LIZIZ() {
        if (this.LIZIZ > 0) {
            return;
        }
        int iLIZLLL = (C418440Gaw.LIZLLL(this.LIZ.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 3)) / 2;
        this.LIZIZ = iLIZLLL;
        int i = (int) (((double) iLIZLLL) / 0.625d);
        this.LIZJ = i;
        this.LIZLLL = i + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) AnonymousClass0756.LIZ.getValue()).intValue())));
    }

    public C650810Pfr(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        C823050WQl.LIZJ().execute(new ARunnableS110S0100000_10(this, 152));
    }

    @Override // X.InterfaceC648680PcQ
    public final List<InterfaceC650860Pfw> LIZ(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i) {
        InterfaceC650760Pfm interfaceC650760Pfm;
        int i2 = C648700PcS.LIZ[enumC648690PcR.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    interfaceC650760Pfm = (InterfaceC650760Pfm) this.LJI.getValue();
                } else {
                    throw new C1954807lC();
                }
            } else {
                interfaceC650760Pfm = (InterfaceC650760Pfm) this.LJFF.getValue();
            }
        } else {
            interfaceC650760Pfm = this.LJ;
        }
        if (interfaceC650760Pfm != null) {
            return interfaceC650760Pfm.LIZ(recyclerView, list);
        }
        return null;
    }
}
