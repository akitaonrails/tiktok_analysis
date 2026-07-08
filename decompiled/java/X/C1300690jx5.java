package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS229S0300000_20;
import kotlin.jvm.internal.AwS386S0200000_20;

/* JADX INFO: renamed from: X.0jx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300690jx5 {
    public static C825940Wae LIZ(int i, String str, Cert cert) {
        return new C825940Wae(cert, str, new String[]{"sensor"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static void LJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100701, "sensor_unregisterListener", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/SensorManager", "unregisterListener(Landroid/hardware/SensorEventListener;)V", C2097908Jt.LIZJ(new Pair("listener", sensorEventListener)));
        C838080WuE.LIZ(c825940WaeLIZ, new AwS386S0200000_20(sensorManager, sensorEventListener, 10));
    }

    public static void LIZLLL(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100701, "sensor_unregisterListener", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/SensorManager", "unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V", C2097608Jq.LJIIIIZZ(new Pair("listener", sensorEventListener), new Pair("sensor", sensor)));
        C838080WuE.LIZ(c825940WaeLIZ, new AwS229S0300000_20(sensorManager, sensorEventListener, sensor, 5));
    }

    public static boolean LIZJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100700, "sensor_registerListener", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/SensorManager", "registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", C2097608Jq.LJIIIIZZ(new Pair("listener", sensorEventListener), new Pair("sensor", sensor), new Pair("samplingPeriodUs", Integer.valueOf(i))));
        return ((Boolean) C838080WuE.LIZ(c825940WaeLIZ, new C1300670jx3(sensorManager, sensorEventListener, sensor, i))).booleanValue();
    }

    public static boolean LIZIZ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100700, "sensor_registerListener", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/SensorManager", "registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z", C2097608Jq.LJIIIIZZ(new Pair("listener", sensorEventListener), new Pair("sensor", sensor), new Pair("samplingPeriodUs", Integer.valueOf(i)), new Pair("handler", handler)));
        return ((Boolean) C838080WuE.LIZ(c825940WaeLIZ, new C1300680jx4(sensorManager, sensorEventListener, sensor, i, handler))).booleanValue();
    }
}
