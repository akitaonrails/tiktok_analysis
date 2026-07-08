package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008510cLp implements SensorEventListener {
    public final C1008500cLo LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public float LLILLL;
    public int LLILZ;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        float[] fArr = sensorEvent.values;
        if (fArr != null) {
            f = fArr[0];
        } else {
            f = 0.0f;
        }
        if (fArr != null) {
            f2 = fArr[1];
        } else {
            f2 = 0.0f;
        }
        if (fArr != null) {
            f3 = fArr[2];
        } else {
            f3 = 0.0f;
        }
        double dSqrt = Math.sqrt(Math.pow(f, 2.0d) + Math.pow(f2, 2.0d) + Math.pow(f3, 2.0d));
        C1008500cLo c1008500cLo = this.LL;
        if (dSqrt >= c1008500cLo.LIZ * ((double) 36) && this.LLILLL * f <= 0.0f) {
            this.LLILZ++;
            this.LLILLL = f;
        }
        if (this.LLILZ >= 2) {
            this.LLILLJJLI.invoke(Boolean.valueOf(c1008500cLo.LIZIZ));
            this.LLILLL = 0.0f;
            this.LLILZ = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1008510cLp(C1008500cLo c1008500cLo, Function1<? super Boolean, Unit> function1) {
        this.LL = c1008500cLo;
        this.LLILLJJLI = function1;
    }
}
