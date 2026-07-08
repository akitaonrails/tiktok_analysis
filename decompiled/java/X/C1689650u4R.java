package X;

import android.bluetooth.BluetoothManager;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0u4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689650u4R {
    public final C11NJ LIZ;
    public final BluetoothManager LIZIZ = (BluetoothManager) C446980Hfs.LIZIZ(((IAppContextService) ServiceManager.get().getService(IAppContextService.class)).getApplicationContext(), BluetoothManager.class);
    public final ExecutorService LIZJ;
    public final C19501611Rm LIZLLL;
    public final C11O1 LJ;
    public final C01GW LJFF;
    public final LinkedList<C1689710u4X> LJI;
    public final ConcurrentHashMap<String, Long> LJII;
    public final C11RK<C1689710u4X> LJIIIIZZ;
    public final ConcurrentHashMap<String, String> LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;

    public final void LIZ() {
        C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBleManager", "calling pruneObsoleteItems");
        synchronized (this.LJI) {
            try {
                Iterator<C1689710u4X> it2 = this.LJI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1689710u4X next = it2.next();
                    Long l = this.LJII.get(next.LIZ);
                    if ((l != null ? l.longValue() + ((Number) this.LJFF.getValue()).longValue() : 0L) < System.currentTimeMillis()) {
                        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EXPIRE removed ");
                        sbLIZ.append(next.LIZ);
                        c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ));
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (String str : this.LJII.keySet()) {
            Long l2 = this.LJII.get(str);
            if ((l2 != null ? l2.longValue() + ((Number) this.LJFF.getValue()).longValue() : 0L) < System.currentTimeMillis()) {
                this.LJII.remove(str);
            }
        }
    }

    public C1689650u4R(C11NJ c11nj) {
        this.LIZ = c11nj;
        ExecutorService executorServiceD4 = C786410Ut5.d4(1);
        this.LIZJ = executorServiceD4;
        C11RO c11ro = C11S5.LIZ;
        this.LIZLLL = new C19501611Rm(executorServiceD4);
        this.LJ = C11NZ.LJJJJLI(((Number) C0BHL.LIZ.getValue()).intValue(), TimeUnit.MILLISECONDS);
        this.LJFF = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(524));
        this.LJI = new LinkedList<>();
        this.LJII = new ConcurrentHashMap<>(new HashMap());
        this.LJIIIIZZ = new C11RK<>();
        this.LJIIIZ = new ConcurrentHashMap<>(new HashMap());
        this.LJIIJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(523));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(520));
        this.LJIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(522));
        this.LJIILIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(521));
    }
}
