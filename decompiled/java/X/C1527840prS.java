package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0prS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527840prS extends AbstractC1527850prT {
    @Override // X.AbstractC1527850prT
    public final int LIZJ() {
        return 2;
    }

    @Override // X.AbstractC1527850prT
    public final void LIZ() {
        this.LIZIZ.LIZIZ(new Object[0]).removeCallbacks(this.LJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("cancelPoll");
        C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1527850prT
    public final void LIZIZ() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append("start send poll");
            C1527890prX.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.LJIILLIIL((this.LJFF ? EnumC1526180pom.Ping : EnumC1526180pom.BackgroundPing).getValue(), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pollRotation executeOnce error: ");
            sbLIZ2.append(Log.getStackTraceString(th));
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.AbstractC1527850prT
    public final boolean LIZLLL(C1527060pqC c1527060pqC) {
        List<C1527020pq8> list = c1527060pqC.topics;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public C1527840prS(InterfaceC1527580pr2 interfaceC1527580pr2, InterfaceC1525730po3 interfaceC1525730po3, AbstractC1526380pp6 abstractC1526380pp6, C1527900prY c1527900prY) {
        super(interfaceC1527580pr2, interfaceC1525730po3, abstractC1526380pp6, c1527900prY);
    }
}
