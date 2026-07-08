package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: X.12f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19810112f5 implements InterfaceC19813012fY {
    public final InterfaceC19812412fS LIZ;
    public final /* synthetic */ AppMeasurementDynamiteService LIZIZ;

    public C19810112f5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC19812412fS interfaceC19812412fS) {
        this.LIZIZ = appMeasurementDynamiteService;
        this.LIZ = interfaceC19812412fS;
    }

    @Override // X.InterfaceC19813012fY
    public final void LIZ(long j, String str, String str2, Bundle bundle) {
        try {
            this.LIZ.LJLL(j, str, str2, bundle);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            C19804712eD c19804712eD = this.LIZIZ.LL;
            if (c19804712eD != null) {
                c19804712eD.LJIILJJIL().LJIIIIZZ.LIZ(e, "Event listener threw exception");
            }
        }
    }
}
