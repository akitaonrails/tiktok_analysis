package X;

import Y.ARunnableS29S0201000_23;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526100poe implements InterfaceC1527570pr1 {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1526070pob());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1526060poa(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1526130poh());
    public final C01GW LJ = C452501pT.LIZIZ(new C1526080poc());
    public final C01GW LJFF = C452501pT.LIZIZ(new C1526110pof());

    public C1526100poe(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC1527570pr1
    public final void LIZ(int i, C1527060pqC c1527060pqC) {
        ARunnableS29S0201000_23 aRunnableS29S0201000_23 = new ARunnableS29S0201000_23(i, this, c1527060pqC, 4);
        if (Intrinsics.LJFF(Looper.myLooper(), ((Handler) this.LJFF.getValue()).getLooper())) {
            aRunnableS29S0201000_23.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LJFF.getValue(), aRunnableS29S0201000_23);
        }
    }

    public final void LIZIZ(int i, EnumC1527170pqN enumC1527170pqN, C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1526120pog interfaceC1526120pog = (InterfaceC1526120pog) it2.next();
            if (interfaceC1526120pog.LIZ(enumC1527170pqN)) {
                interfaceC1526120pog.LIZIZ(c1527010pq7, list);
                break;
            }
        }
        for (InterfaceC1526090pod interfaceC1526090pod : (List) this.LIZJ.getValue()) {
            if (interfaceC1526090pod.LIZ(enumC1527170pqN)) {
                interfaceC1526090pod.LIZIZ(i, c1527010pq7, list);
            }
        }
    }
}
