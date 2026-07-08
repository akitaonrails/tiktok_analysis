package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AJ implements SensorEventListener {
    public static int LLJILJIL = 3;
    public static long LLJILJILJ = 150;
    public static volatile C14AJ LLJILLL;
    public BPEAHandler LL;
    public HandlerThread LLILLJJLI;
    public boolean LLILLL;
    public final SensorManager LLILZ;
    public final ArrayList<C20220914Ad> LLILZIL;
    public JSONObject LLILZLL;
    public final int LLJ;
    public long LLIZ = SystemClock.elapsedRealtime();
    public PthreadTimer LLIZLLLIL = null;
    public final float[] LLJI = new float[9];
    public final float[] LLJIJIL = new float[3];

    public final synchronized JSONObject LIZ() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (!this.LLILZIL.isEmpty()) {
                for (int i = 0; i < this.LLILZIL.size(); i++) {
                    jSONArray.put(this.LLILZIL.get(i).LIZ());
                }
            }
            jSONObject.put("gy", jSONArray.length() > 0 ? jSONArray.toString() : "[]");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final synchronized void LIZJ() {
        try {
            SensorManager sensorManager = this.LLILZ;
            if (sensorManager != null) {
                if (C2204961BRm.LJJL(sensorManager, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPbFx1dY934LgLDOeZAebz", null)) == null) {
                    LLJILJIL = 2;
                }
                SensorManager sensorManager2 = this.LLILZ;
                C1300690jx5.LIZIZ(sensorManager2, this, C2204961BRm.LJJL(sensorManager2, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPbFx1dY934LgLDOeZAebz", null)), 0, this.LL, CertProviderManagerKt.findCert("bpea-oec_turing_sdk_register_sensor_info", 1476415505));
            } else {
                LLJILJIL = 1;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
        }
    }

    public final synchronized void LIZLLL() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!this.LLILLL) {
            HandlerThread handlerThread = new HandlerThread("sensorThread");
            this.LLILLJJLI = handlerThread;
            handlerThread.start();
            this.LL = new BPEAHandler(C786410Ut5.W2(this.LLILLJJLI));
            this.LLIZ = SystemClock.elapsedRealtime();
            LIZJ();
            this.LLILLL = true;
        }
    }

    public final synchronized void LJ() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILLL) {
            LJI();
            this.LLILLJJLI.quit();
            this.LLILLL = false;
            this.LLILZIL.clear();
        } else {
            this.LLILZIL.clear();
        }
    }

    public final synchronized void LJI() {
        SensorManager sensorManager;
        try {
            sensorManager = this.LLILZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
        }
        if (sensorManager != null) {
            C1300690jx5.LJ(sensorManager, this, CertProviderManagerKt.findCert("bpea-oec_turing_sdk_unregister_sensor_info", 1476415505));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C14AJ(Context context) {
        this.LLJ = 100;
        Context contextN3 = C786410Ut5.N3(context);
        if (contextN3 != null) {
            this.LLILZ = (SensorManager) C786410Ut5.H2(contextN3, "sensor");
            this.LLILZIL = new ArrayList<>();
            this.LLILZLL = new JSONObject();
            LLJILJILJ = C202205149z.LIZ();
            if (BdTuring.getInstance() != null && BdTuring.getInstance().getConfig() != null) {
                this.LLJ = BdTuring.getInstance().getConfig().getDelayBackupDuration();
            }
        }
    }

    public final synchronized void LIZIZ(JSONObject jSONObject) {
        try {
            this.LLILZLL = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LLILZLL.put(next, jSONObject.get(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LJFF(JSONObject jSONObject) {
        try {
            if (this.LLILLL) {
                PthreadTimer pthreadTimer = this.LLIZLLLIL;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                    this.LLIZLLLIL = null;
                }
                C202191149l.LJ(LLJILJIL, LIZ(), this.LLILZLL);
                LJ();
            }
            this.LLILZIL.clear();
            LIZIZ(jSONObject);
            LIZLLL();
            PthreadTimer pthreadTimer2 = this.LLIZLLLIL;
            if (pthreadTimer2 != null) {
                pthreadTimer2.cancel();
                this.LLIZLLLIL = null;
            }
            PthreadTimer pthreadTimer3 = new PthreadTimer("SensorCollector");
            this.LLIZLLLIL = pthreadTimer3;
            pthreadTimer3.schedule(new C0W9W() { // from class: X.14AO
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SensorCollector@2ec9.triggerOrientationSensor$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        C202191149l.LJ(C14AJ.LLJILJIL, this.LL.LIZ(), this.LL.LLILZLL);
                        this.LL.LJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("SensorCollector@2ec9.triggerOrientationSensor$1");
                }
            }, LLJILJILJ + ((long) this.LLJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPbFx1dY934LgLDOeZAebz", null)) == 11) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - this.LLIZ > LLJILJILJ) {
                    PthreadTimer pthreadTimer = this.LLIZLLLIL;
                    if (pthreadTimer != null) {
                        pthreadTimer.cancel();
                        this.LLIZLLLIL = null;
                    }
                    C202191149l.LJ(LLJILJIL, LIZ(), this.LLILZLL);
                    LJ();
                }
                SensorManager.getRotationMatrixFromVector(this.LLJI, sensorEvent.values);
                SensorManager.getOrientation(this.LLJI, this.LLJIJIL);
                float[] fArr = this.LLJIJIL;
                C20220914Ad c20220914Ad = new C20220914Ad(fArr[0], fArr[1], fArr[2], jElapsedRealtime - this.LLIZ);
                this.LLILZIL.add(c20220914Ad);
                C786410Ut5.j4("[orientation] %s", new Object[]{c20220914Ad.LIZ()});
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
