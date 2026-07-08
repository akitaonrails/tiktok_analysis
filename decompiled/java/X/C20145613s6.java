package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS144S1100000_30;
import kotlin.jvm.internal.AwS66S1300000_30;

/* JADX INFO: renamed from: X.13s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145613s6 {
    public static C825940Wae LIZ(int i, String str, Cert cert) {
        if (cert != null) {
            cert.attachCustomInfo("dataflowID", 1476403201);
        }
        return new C825940Wae(cert, str, new String[]{"location"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static Location LIZIZ(LocationManager locationManager, String str, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100000, "location_getLastKnownLocation", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/location/LocationManager", "getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;", C2097908Jt.LIZJ(new Pair("provider", str)));
        return (Location) C838080WuE.LIZ(c825940WaeLIZ, new AwS144S1100000_30(locationManager, str, 14));
    }

    public static void LIZJ(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100002, "location_requestSingleUpdate", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/location/LocationManager", "requestSingleUpdate(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V", C2097608Jq.LJIIIIZZ(new Pair("provider", str), new Pair("listener", locationListener), new Pair("looper", looper)));
        C838080WuE.LIZ(c825940WaeLIZ, new AwS66S1300000_30(locationManager, str, locationListener, looper, 1));
    }
}
