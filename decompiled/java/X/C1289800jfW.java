package X;

import Y.ARunnableS31S0101000_20;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0jfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289800jfW implements SensorEventListener {
    public static SensorManager LLILLJJLI;
    public static BPEAHandler LLILLL;
    public static ARunnableS31S0101000_20 LLILZ;
    public static final C1289800jfW LL = new C1289800jfW();
    public static Map<String, ? extends Object> LLILZIL = C2097608Jq.LJ();
    public static final float[] LLILZLL = new float[4];
    public static final float[] LLIZ = new float[9];
    public static final float[] LLIZLLLIL = new float[3];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        double d;
        double d2;
        if (C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrYuhWXK2285AhumM+bjzFtiXOsblKFXfGA1nSaGFI=", null)) == 15) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = LLILZLL;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float[] fArr3 = LLIZ;
            SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
            float[] fArr4 = LLIZLLLIL;
            SensorManager.getOrientation(fArr3, fArr4);
            double d3 = 0.0d;
            if (Float.isNaN(fArr4[0])) {
                d = 0.0d;
            } else {
                d = -fArr4[0];
            }
            if (Float.isNaN(fArr4[1])) {
                d2 = 0.0d;
            } else {
                d2 = -fArr4[1];
            }
            if (!Float.isNaN(fArr4[2])) {
                d3 = fArr4[2];
            }
            LLILZIL = C2097608Jq.LJIIIIZZ(new Pair("yaw", Double.valueOf(d)), new Pair("pitch", Double.valueOf(d2)), new Pair("roll", Double.valueOf(d3)));
        }
    }

    public final void LIZ(Integer num, String str) {
        BPEAHandler bPEAHandler;
        Cert certFindCert;
        try {
            SensorManager sensorManager = LLILLJJLI;
            if (sensorManager != null) {
                if (num == null) {
                    certFindCert = CertProviderManagerKt.findCert("bpea-x_bridge_sensor", 1476415497);
                } else {
                    certFindCert = CertProviderManagerKt.findCert("bpea-x_bridge_sensor", 1476415497);
                    if (str != null) {
                        certFindCert.attachCustomInfo("jsb_referer_url", str);
                    }
                }
                C1300690jx5.LJ(sensorManager, this, certFindCert);
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ARunnableS31S0101000_20 aRunnableS31S0101000_20 = LLILZ;
        if (aRunnableS31S0101000_20 != null && (bPEAHandler = LLILLL) != null) {
            bPEAHandler.removeCallbacks(aRunnableS31S0101000_20);
        }
        LLILLJJLI = null;
        LLILLL = null;
        LLILZ = null;
        LLILZIL = C2097608Jq.LJ();
    }
}
