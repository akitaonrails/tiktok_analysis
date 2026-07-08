package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeSdkConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.147t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202147147t {
    public static boolean LIZIZ;
    public static volatile C1909807dw LIZLLL;
    public static SensorManager LJ;
    public static Sensor LJFF;
    public static C202149147v LJI;
    public static HandlerThread LJII;
    public static Cert LJIIIIZZ;
    public static final Object LIZ = new Object();
    public static final C13E8<C1884207Zo> LIZJ = new C13E8<>();

    /* JADX WARN: Type inference failed for: r5v0, types: [X.147v, android.hardware.SensorEventListener] */
    public static void LIZIZ() {
        Context applicationContext;
        SensorManager sensorManager;
        synchronized (LIZ) {
            try {
                if (LIZIZ) {
                    return;
                }
                AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
                if ((abstractC1387200mCcLIZJ == null || (applicationContext = abstractC1387200mCcLIZJ.LIZIZ()) == null) && (applicationContext = C1717770unn.LIZJ().getApplicationContext()) == null) {
                    return;
                }
                Object objH2 = C786410Ut5.H2(applicationContext, "sensor");
                if (!(objH2 instanceof SensorManager) || (sensorManager = (SensorManager) objH2) == null) {
                    return;
                }
                Sensor sensorLJJL = C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SjXtnrJM6I3MevdjL0i/d6YMHs5qI8e0xQ==", null));
                if (sensorLJJL == null) {
                    return;
                }
                HandlerThread handlerThread = new HandlerThread("ProbeLightSampler");
                handlerThread.start();
                BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
                Cert certFindCert = CertProviderManagerKt.findCert("bpea-pipo_probe_kyc_light_detection", 1476415515);
                int i = PipoProbeSdkConfigSettings.LIZ().common.lightSampleRateHz;
                if (i < 1) {
                    i = 1;
                }
                int i2 = 1000000 / i;
                ?? r5 = new SensorEventListener() { // from class: X.147v
                    @Override // android.hardware.SensorEventListener
                    public final void onAccuracyChanged(Sensor sensor, int i3) {
                    }

                    @Override // android.hardware.SensorEventListener
                    public final void onSensorChanged(SensorEvent sensorEvent) {
                        float[] fArr;
                        Float fLJJIII;
                        C13E8<C1884207Zo> c13e8;
                        if (sensorEvent != null && (fArr = sensorEvent.values) != null && (fLJJIII = C13LQ.LJJIII(0, fArr)) != null && Math.abs(fLJJIII.floatValue()) <= Float.MAX_VALUE) {
                            float fFloatValue = fLJJIII.floatValue();
                            Object obj = C202147147t.LIZ;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C1884207Zo c1884207Zo = new C1884207Zo(fFloatValue, jCurrentTimeMillis);
                            synchronized (C202147147t.LIZ) {
                                try {
                                    C202147147t.LIZJ.addLast(c1884207Zo);
                                    int i3 = PipoProbeSdkConfigSettings.LIZ().common.lightSampleWindowSec;
                                    if (i3 < 1) {
                                        i3 = 1;
                                    }
                                    long j = jCurrentTimeMillis - (((long) i3) * 1000);
                                    while (true) {
                                        c13e8 = C202147147t.LIZJ;
                                        if (!(!c13e8.isEmpty()) || c13e8.first().LIZIZ >= j) {
                                            break;
                                        } else {
                                            c13e8.removeFirst();
                                        }
                                    }
                                    C202147147t.LIZLLL = C202147147t.LIZ(c13e8);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                };
                try {
                    C1300690jx5.LIZIZ(sensorManager, r5, sensorLJJL, i2, bPEAHandler, certFindCert);
                    LJ = sensorManager;
                    LJFF = sensorLJJL;
                    LJI = r5;
                    LJII = handlerThread;
                    LJIIIIZZ = certFindCert;
                    LIZIZ = true;
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    handlerThread.quitSafely();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    handlerThread.quitSafely();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ() {
        synchronized (LIZ) {
            try {
                if (LIZIZ) {
                    SensorManager sensorManager = LJ;
                    C202149147v c202149147v = LJI;
                    Sensor sensor = LJFF;
                    Cert cert = LJIIIIZZ;
                    if (sensorManager != null && c202149147v != null && sensor != null && cert != null) {
                        try {
                            C1300690jx5.LIZLLL(sensorManager, c202149147v, sensor, cert);
                        } catch (C838130WuJ e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    HandlerThread handlerThread = LJII;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    LJ = null;
                    LJFF = null;
                    LJI = null;
                    LJII = null;
                    LJIIIIZZ = null;
                    LIZJ.clear();
                    LIZLLL = null;
                    LIZIZ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1909807dw LIZ(C13E8 c13e8) {
        if (c13e8.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<E> it2 = c13e8.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(((C1884207Zo) it2.next()).LIZ));
        }
        double dLJJZZI = C13LP.LJJZZI(arrayList);
        double dLJJLIL = C13LP.LJJLIL(arrayList);
        if (arrayList.size() < 2) {
            return new C1909807dw(dLJJZZI, dLJJLIL, 0.0d);
        }
        double d = PipoProbeSdkConfigSettings.LIZ().common.lightJitterThreshold;
        if (d < 0.0d) {
            d = 0.0d;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            double dDoubleValue = ((Number) ListProtector.get(arrayList, i2 - 1)).doubleValue();
            double dAbs = Math.abs(dDoubleValue);
            if (dAbs < 1.0d) {
                dAbs = 1.0d;
            }
            if (Math.abs(((Number) ListProtector.get(arrayList, i2)).doubleValue() - dDoubleValue) > dAbs * d) {
                i++;
            }
        }
        return new C1909807dw(dLJJZZI, dLJJLIL, ((double) i) / ((double) (arrayList.size() - 1)));
    }

    public static Double LIZLLL(String str) {
        C1909807dw c1909807dw = LIZLLL;
        if (c1909807dw == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -483809126) {
            if (iHashCode != 288669448) {
                if (iHashCode != 1885745431 || !str.equals("light_sensor_jitter_rate")) {
                    return null;
                }
                return Double.valueOf(c1909807dw.LIZJ);
            }
            if (!str.equals("light_sensor_min_value")) {
                return null;
            }
            return Double.valueOf(c1909807dw.LIZ);
        }
        if (!str.equals("light_sensor_max_value")) {
            return null;
        }
        return Double.valueOf(c1909807dw.LIZIZ);
    }
}
