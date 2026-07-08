package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Bsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218751Bsf {
    public final SensorManager LIZ;
    public final Sensor LIZIZ;
    public float LIZLLL;
    public final float[] LIZJ = new float[3];
    public final CopyOnWriteArrayList<InterfaceC2218771Bsh> LJ = new CopyOnWriteArrayList<>();
    public final C2218761Bsg LJFF = new SensorEventListener() { // from class: X.1Bsg
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            float f = this.LL.LIZLLL;
            if (f != 0.0f) {
                float f2 = (sensorEvent.timestamp - f) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = fArr[2];
                float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4) + (f5 * f5));
                float[] fArr2 = this.LL.LIZJ;
                float f6 = fArr2[0];
                float[] fArr3 = sensorEvent.values;
                fArr2[0] = f6 + (fArr3[0] * f2);
                fArr2[1] = fArr2[1] + (fArr3[1] * f2);
                fArr2[2] = fArr2[2] + (fArr3[2] * f2);
                float fSqrt2 = (float) Math.sqrt((r5 * r5) + (r2 * r2) + (r1 * r1));
                if (fSqrt > 0.5f || fSqrt2 > 0.5f) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSensorChanged omegaMagnitude = ");
                    sbLIZ.append(fSqrt);
                    sbLIZ.append(" angle = ");
                    sbLIZ.append(fSqrt2);
                    C2183341Ace.LIZ("Gyro", C2188811AlT.LIZIZ(sbLIZ));
                    Iterator<InterfaceC2218771Bsh> it2 = this.LL.LJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ();
                    }
                    this.LL.LIZ();
                }
            }
            this.LL.LIZLLL = sensorEvent.timestamp;
        }
    };

    public final void LIZ() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("Gyro", "clearAngle");
        float[] fArr = this.LIZJ;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Bsg] */
    public C2218751Bsf(Context context) {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("Gyro", "Gyro");
        if (context != null) {
            SensorManager sensorManager = (SensorManager) C786410Ut5.H2(context, "sensor");
            this.LIZ = sensorManager;
            this.LIZIZ = C2217911BrJ.LIZJ(sensorManager);
        } else {
            this.LIZ = null;
            this.LIZIZ = null;
            C2183341Ace.LIZIZ("Gyro", "Gyro init failed, no context");
        }
    }

    public final void LIZJ(C1DNP c1dnp, Cert cert) {
        if (this.LIZ == null) {
            return;
        }
        if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
            cert = CertProviderManagerKt.findCert("bpea-ve_sensor", 1476415509);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregister sensor, Cert: ");
        sbLIZ.append(cert);
        C2183341Ace.LIZLLL("Gyro", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.remove(c1dnp);
        if (this.LJ.isEmpty()) {
            try {
                C1300690jx5.LIZLLL(this.LIZ, this.LJFF, this.LIZIZ, cert);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LJFF("Gyro", "sensorManager unregister listener exception occurred.", e);
            }
            C2183341Ace.LIZ("Gyro", "sensorManager unregister listener");
        }
        LIZ();
    }

    public final void LIZIZ(C1DNP c1dnp, Handler handler, Cert cert) {
        Cert certFindCert = cert;
        if (this.LIZ == null || this.LJ.contains(c1dnp)) {
            return;
        }
        if (certFindCert == null || C825920Wac.LIZ(certFindCert) == null || C825920Wac.LIZ(certFindCert).intValue() <= 0) {
            certFindCert = CertProviderManagerKt.findCert("bpea-ve_sensor", 1476415509);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register sensor, Cert: ");
        sbLIZ.append(certFindCert);
        C2183341Ace.LIZLLL("Gyro", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.add(c1dnp);
        if (this.LJ.size() == 1) {
            try {
                C1300690jx5.LIZIZ(this.LIZ, this.LJFF, this.LIZIZ, 3, handler, certFindCert);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C2183341Ace.LJFF("Gyro", "sensorManager register listener exception occurred.", e);
                this.LJ.remove(c1dnp);
            }
            C2183341Ace.LIZ("Gyro", "sensorManager register listener");
        }
        LIZ();
    }
}
