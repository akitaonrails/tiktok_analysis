package Y;

import X.C0CN1;
import X.C13LP;
import X.C15438062q;
import X.C1BCA;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1902760zcA;
import X.EnumC312610CNf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS6S0210000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        EnumC1902760zcA enumC1902760zcA = (EnumC1902760zcA) this.l0;
        c2344009Gk.LJIIIIZZ("request_type", enumC1902760zcA != null ? enumC1902760zcA.getDesc() : null);
        c2344009Gk.LIZJ(((List) this.l1).size(), "diff_item_count");
        List list = (List) this.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Pair) it2.next()).getFirst()).intValue()));
        }
        c2344009Gk.LJIIIIZZ("diff_item_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        c2344009Gk.LIZJ(this.z2 ? 1 : 0, "is_first_refresh");
        C20684815ws.LJIILLIIL("entrance_list_request_diff", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS6S0210000_3 aRunnableS6S0210000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StartupStateUtils@39b4.runAfterFirstFeedCompleted$1");
        try {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new C0CN1((Long) aRunnableS6S0210000_3.l0, (Runnable) aRunnableS6S0210000_3.l1, aRunnableS6S0210000_3.z2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StartupStateUtils@39b4.runAfterFirstFeedCompleted$1");
    }

    public static final void run$1(ARunnableS6S0210000_3 aRunnableS6S0210000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EntranceRequestDiffHelperKt@57d8.reportEntranceCellDiffEvent$1");
        try {
            aRunnableS6S0210000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EntranceRequestDiffHelperKt@57d8.reportEntranceCellDiffEvent$1");
    }

    public ARunnableS6S0210000_3(Long l, ARunnableS83S0000000_3 aRunnableS83S0000000_3, int i) {
        this.$t = i;
        this.l0 = l;
        this.z2 = false;
        this.l1 = aRunnableS83S0000000_3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S0210000_3(EnumC1902760zcA enumC1902760zcA, EnumC1902760zcA enumC1902760zcA2, List<Pair<Integer, String>> list, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = enumC1902760zcA;
        this.l1 = enumC1902760zcA2;
        this.z2 = list;
    }
}
