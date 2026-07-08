package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19ZQ {
    public static C19ZQ LIZLLL;
    public final Context LIZ;
    public final LocationManager LIZIZ;
    public final C19ZT LIZJ = new C19ZT();

    public final Location LIZ(String str) {
        try {
            if (this.LIZIZ.isProviderEnabled(str)) {
                return C2204961BRm.LJJLJLI(this.LIZIZ, str, new C0WZX("dTF6Tg0zW9KSVEcxRh2JdnOJLi2AqKe7DWQuc4gKQ/gypwUNUj4=", new String[]{"01789"}));
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C19ZQ(Context context, LocationManager locationManager) {
        this.LIZ = context;
        this.LIZIZ = locationManager;
    }
}
