package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.ecommerce.network.EcomWeakNetworkConfigModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0X2K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2K implements Runnable {
    public final /* synthetic */ int LL;

    public C0X2K(int i) {
        this.LL = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EcomNetworkHelper@2e09.onNQERTTOrThroughputReceived$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcomNetworkHelper@2e09.onNQERTTOrThroughputReceived$1");
    }

    public final void LIZ() {
        try {
            EcomWeakNetworkConfigModel ecomWeakNetworkConfigModelLIZ = C0X2J.LIZ();
            int i = this.LL;
            if (i <= 0 || ecomWeakNetworkConfigModelLIZ.throughputFilterList.contains(Integer.valueOf(i))) {
                return;
            }
            C08JB c08jb = C0X2L.LIZJ;
            c08jb.LIZ(this.LL);
            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
            c08jb.LIZIZ();
            boolean zContains = C0X2J.LIZ().weakNetworkLevels.contains(Integer.valueOf(effectiveConnectionType));
            boolean z = C0X2L.LIZ;
            C0X2L.LIZ = zContains;
            C0X4L c0x4lLIZ = C0X2L.LIZ();
            synchronized (C327301Ot.LIZ) {
                if (!c0x4lLIZ.LIZ) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01NS(C327301Ot.LIZIZ.remove("tag.GoodNetwork"), null), 2);
                }
            }
            if (z != zContains) {
                Iterator<C0X2M> it2 = C0X2L.LIZLLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("###onNQERTTOrThroughputComputed: type: ");
            sbLIZ.append(TTNetInit.getEffectiveConnectionType());
            sbLIZ.append(", throughput: ");
            sbLIZ.append(C0X2L.LIZJ.LIZIZ());
            sbLIZ.append(", isWeak: ");
            sbLIZ.append(C0X2L.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
