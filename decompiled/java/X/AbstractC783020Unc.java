package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: X.0Unc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC783020Unc {
    public final SensorManager LIZIZ;
    public boolean LIZJ;
    public int LIZ = -1;
    public final C783030Und LIZLLL = new SensorEventListener() { // from class: X.0Und
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            int iRound2;
            float[] fArr = sensorEvent.values;
            float f = -fArr[0];
            float f2 = -fArr[1];
            float f3 = -fArr[2];
            if (4 * ((f * f) + (f2 * f2)) >= f3 * f3) {
                iRound = 90 - Math.round(((float) Math.atan2(-f2, f)) * 57.29578f);
                while (iRound >= 360) {
                    iRound -= 360;
                }
                while (iRound < 0) {
                    iRound += 360;
                }
                iRound2 = 90 - Math.round(((float) Math.atan2(-f3, (float) Math.sqrt(r7))) * 57.29578f);
                while (iRound2 > 180) {
                    iRound2 -= 180;
                }
                while (iRound2 < 0) {
                    iRound2 += 180;
                }
            } else {
                iRound = -1;
                iRound2 = -1;
            }
            AbstractC783020Unc abstractC783020Unc = this.LL;
            if (iRound != abstractC783020Unc.LIZ) {
                abstractC783020Unc.LIZ = iRound;
                abstractC783020Unc.LIZ(iRound, iRound2);
            }
        }
    };

    public abstract void LIZ(int i, int i2);

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Und] */
    public AbstractC783020Unc(Context context) {
        this.LIZIZ = (SensorManager) C786410Ut5.H2(context, "sensor");
    }
}
