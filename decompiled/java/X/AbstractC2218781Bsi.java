package X;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;

/* JADX INFO: renamed from: X.1Bsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2218781Bsi implements SensorEventListener {
    public boolean LL;

    public AbstractC2218781Bsi(boolean z) {
        this.LL = z;
    }

    public static double LIZ(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        long jAbs = Math.abs(System.nanoTime() - j);
        long jAbs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - j);
        long jAbs3 = Math.abs((SystemClock.uptimeMillis() * ((long) 1000000)) - j);
        if (jAbs > jAbs2) {
            jAbs = jAbs2;
        }
        if (jAbs <= jAbs3) {
            jAbs3 = jAbs;
        }
        return r3 - jAbs3;
    }
}
