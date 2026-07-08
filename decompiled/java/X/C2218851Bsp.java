package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1Bsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218851Bsp extends AbstractC2218781Bsi {
    public final InterfaceC2218931Bsx LLILLJJLI;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        int i2 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        if (f2 > 0.0f && Math.abs(f) < f2) {
            i = 0;
        } else if (f > 0.0f && Math.abs(f2) < f) {
            i = 270;
        } else if (f2 < 0.0f && Math.abs(f) < (-f2)) {
            i = 180;
        } else {
            i = 90;
        }
        if (!TextUtils.equals(Build.MODEL, "vivo X9")) {
            i2 = i;
        }
        if (this.LL) {
            this.LLILLJJLI.LIZ(i2);
        }
    }

    public C2218851Bsp(InterfaceC2218931Bsx interfaceC2218931Bsx, boolean z) {
        super(z);
        this.LLILLJJLI = interfaceC2218931Bsx;
    }
}
