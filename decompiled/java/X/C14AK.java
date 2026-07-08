package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14AK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AK implements SensorEventListener {
    public static long LLJ = 150;
    public static int LLJI = 3;
    public static volatile C14AK LLJIJIL;
    public BPEAHandler LL;
    public HandlerThread LLILLJJLI;
    public final SensorManager LLILLL;
    public final LinkedList<C14AU> LLILZ;
    public final LinkedList<C1699470uKH> LLILZIL;
    public boolean LLILZLL;
    public final float[] LLIZ = new float[9];
    public final float[] LLIZLLLIL = new float[3];

    public final synchronized void LIZJ() {
        try {
            SensorManager sensorManager = this.LLILLL;
            if (sensorManager != null) {
                if (C2204961BRm.LJJL(sensorManager, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPbFx1dY934LgLDOeZAebza3px", null)) == null) {
                    LLJI = 2;
                }
                SensorManager sensorManager2 = this.LLILLL;
                C1300690jx5.LIZIZ(sensorManager2, this, C2204961BRm.LJJL(sensorManager2, 11, new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPbFx1dY934LgLDOeZAebza3px", null)), 0, this.LL, CertProviderManagerKt.findCert("bpea-oec_turing_sdk_register_sensor_info", 1476415505));
            } else {
                LLJI = 1;
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
        if (!this.LLILZLL) {
            HandlerThread handlerThread = new HandlerThread("sensorThread");
            this.LLILLJJLI = handlerThread;
            handlerThread.start();
            this.LL = new BPEAHandler(C786410Ut5.W2(this.LLILLJJLI));
            LIZJ();
            this.LLILZLL = true;
        }
    }

    public final synchronized void LJ() {
        try {
            LJI();
            this.LLILLJJLI.quit();
            this.LLILZLL = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LJI() {
        SensorManager sensorManager;
        try {
            sensorManager = this.LLILLL;
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

    public C14AK(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        if (contextN3 != null) {
            this.LLILLL = (SensorManager) C786410Ut5.H2(contextN3, "sensor");
            LLJ = C202205149z.LIZ();
            if (BdTuring.getInstance() != null && BdTuring.getInstance().getConfig() != null) {
                BdTuring.getInstance().getConfig().getDelayBackupDuration();
            }
            this.LLILZ = new LinkedList<>();
            this.LLILZIL = new LinkedList<>();
        }
    }

    public static JSONObject LIZ(List<C20220914Ad> list) {
        String string;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    jSONArray.put(list.get(i).LIZ());
                }
            }
            if (jSONArray.length() > 0) {
                string = jSONArray.toString();
            } else {
                string = "[]";
            }
            jSONObject.put("gy", string);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static C14AK LIZIZ(Context context) {
        if (LLJIJIL == null) {
            synchronized (C14AK.class) {
                try {
                    if (LLJIJIL == null) {
                        LLJIJIL = new C14AK(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LLJ = C202205149z.LIZ();
        return LLJIJIL;
    }

    public final synchronized void LJFF(JSONObject jSONObject) {
        if (this.LLILZIL != null && this.LLILZ != null) {
            C1699470uKH c1699470uKH = new C1699470uKH(jSONObject, LLJI);
            this.LLILZIL.addLast(c1699470uKH);
            this.LLILZ.addLast(new C14AU(c1699470uKH));
            if (!this.LLILZLL) {
                LIZLLL();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        throw r0;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14AK.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
