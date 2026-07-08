package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.1Ahl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186511Ahl implements SensorEventListener {
    public final SensorManager LL;
    public final Sensor LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public C2186611Ahv LLIZLLLIL;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C2186511Ahl(ActivityC2186501Ahk activityC2186501Ahk) {
        SensorManager sensorManager = (SensorManager) C786410Ut5.H2(activityC2186501Ahk, "sensor");
        this.LL = sensorManager;
        this.LLILLJJLI = C2204961BRm.LJJL(sensorManager, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ2hbjUb4U6S4lNIoPyOyYt4uLyZCc", null));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C2186771AiB c2186771AiB;
        if (sensorEvent.sensor == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LLILZLL >= LSPassThroughRecordSizeConfig.DEFAULT && C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmMuLgQZ2hbjUb4U6S4lNIoPyOyYt4uLyZCc", null)) == 1) {
            float[] fArr = sensorEvent.values;
            int i = (int) fArr[0];
            int i2 = (int) fArr[1];
            int i3 = (int) fArr[2];
            if (this.LLIZ != 0) {
                int iAbs = Math.abs(this.LLILLL - i);
                int iAbs2 = Math.abs(this.LLILZ - i2);
                int iAbs3 = Math.abs(this.LLILZIL - i3);
                if (Math.sqrt((iAbs * iAbs) + (iAbs2 * iAbs2) + (iAbs3 * iAbs3)) >= 1.4d) {
                    this.LLIZ = 2;
                } else {
                    if (this.LLIZ == 2) {
                        this.LLILZLL = jElapsedRealtime;
                        C2186611Ahv c2186611Ahv = this.LLIZLLLIL;
                        if (c2186611Ahv != null && c2186611Ahv.LIZ.LIZIZ() && (c2186771AiB = c2186611Ahv.LIZ.LIZ.LLJI.LL) != null && !c2186771AiB.LJI && c2186771AiB.LIZ != null && c2186771AiB.LJFF) {
                            c2186771AiB.LIZ.LIZIZ(c2186771AiB.LJIIL);
                        }
                    }
                    this.LLIZ = 1;
                }
            } else {
                this.LLILZLL = jElapsedRealtime;
                this.LLIZ = 1;
            }
            this.LLILLL = i;
            this.LLILZ = i2;
            this.LLILZIL = i3;
        }
    }
}
