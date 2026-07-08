package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleEventObserver;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207850hXL {
    public final Activity LIZ;
    public final C1207520hWo LIZIZ;
    public final Cert LIZJ;
    public LifecycleEventObserver LIZLLL;
    public final C1208130hXn LJ;
    public boolean LJFF;
    public final C01GW LJI;
    public InterfaceC1207030hW1 LJII;

    public static void LIZ(int i) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", "location_permission_callback");
            linkedHashMap.put("value_int1", String.valueOf(i));
            C20684815ws.LJIILLIIL("location_power_track", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1207850hXL(Activity activity, C1207520hWo c1207520hWo, Cert cert) {
        this.LIZ = activity;
        this.LIZIZ = c1207520hWo;
        this.LIZJ = cert;
        C1208440hYI.LIZ.getClass();
        this.LJ = C1208440hYI.LIZIZ;
        this.LJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2421));
        C786410Ut5.L3(activity);
    }
}
