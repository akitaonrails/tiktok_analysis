package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZP implements SensorEventListener {
    public static final /* synthetic */ int LL = 0;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float fFloatValue;
        float fFloatValue2;
        Float fLJJIII;
        Float fLJJIII2;
        Float fLJJIII3;
        if (sensorEvent != null && C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodjmteOITq7YcivYy3qxs9i2OJGSgr2gTI8cx//8vMZGru7Yy9zb8N1OXkA7NmnIDySPjEh8IJZeeDVc=", null)) == 1) {
            float[] fArr = sensorEvent.values;
            float fFloatValue3 = 0.0f;
            if (fArr != null && (fLJJIII3 = C13LQ.LJJIII(0, fArr)) != null) {
                fFloatValue = fLJJIII3.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            float[] fArr2 = sensorEvent.values;
            if (fArr2 != null && (fLJJIII2 = C13LQ.LJJIII(1, fArr2)) != null) {
                fFloatValue2 = fLJJIII2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            float[] fArr3 = sensorEvent.values;
            if (fArr3 != null && (fLJJIII = C13LQ.LJJIII(2, fArr3)) != null) {
                fFloatValue3 = fLJJIII.floatValue();
            }
            C1548820qPI.LIZIZ(new C397901gf(0L, new C1323890kYV(new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("x", Float.valueOf(fFloatValue)), new Pair("y", Float.valueOf(fFloatValue2)), new Pair("z", Float.valueOf(fFloatValue3))))), "onAccelerometerChange"));
        }
    }
}
