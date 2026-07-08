package X;

import Y.ARunnableS56S0300000_23;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0pRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511840pRe implements SensorEventListener {
    public Context LL;
    public boolean LLILLJJLI;
    public SensorManager LLILZ;
    public Sensor LLILZIL;
    public Sensor LLILZLL;
    public Sensor LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public C1512040pRy LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public float[] LLJJI;
    public int LLILLL = -999;
    public int LLJI = -999;
    public final List<Float> LLJJIII = new ArrayList(150);
    public final List<Float> LLJJIJI = new ArrayList(150);
    public final List<Float> LLJJIJIIJIL = new ArrayList(150);
    public final List<Float> LLJJIJIL = new ArrayList(150);
    public final List<Float> LLJJJ = new ArrayList(150);
    public final List<Float> LLJJJIL = new ArrayList(150);
    public final List<Float> LLJJJJ = new ArrayList(150);
    public final List<Float> LLJJJJJIL = new ArrayList(150);
    public final List<Float> LLJJJJLIIL = new ArrayList(150);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        if (((ArrayList) this.LLJJIII).size() < 100 || ((ArrayList) this.LLJJIJI).size() < 100 || ((ArrayList) this.LLJJIJIIJIL).size() < 100 || ((ArrayList) this.LLJJIJIL).size() < 100 || ((ArrayList) this.LLJJJ).size() < 100 || ((ArrayList) this.LLJJJIL).size() < 100 || ((ArrayList) this.LLJJJJ).size() < 100 || ((ArrayList) this.LLJJJJJIL).size() < 100 || ((ArrayList) this.LLJJJJLIIL).size() < 100) {
            return;
        }
        int size = ((ArrayList) this.LLJJIII).size();
        int size2 = ((ArrayList) this.LLJJIJIL).size();
        int size3 = ((ArrayList) this.LLJJJJ).size();
        long jCurrentTimeMillis = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
        float[] fArr = new float[900];
        boolean z = false;
        char c = 0;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        do {
            float fFloatValue = ((Float) ListProtector.get(this.LLJJIII, i)).floatValue();
            float fFloatValue2 = ((Float) ListProtector.get(this.LLJJIJI, i)).floatValue();
            float fFloatValue3 = ((Float) ListProtector.get(this.LLJJIJIIJIL, i)).floatValue();
            int i2 = i * 9;
            fArr[i2] = fFloatValue;
            fArr[i2 + 1] = fFloatValue2;
            fArr[i2 + 2] = fFloatValue3;
            if (this.LLJJ) {
                f += fFloatValue;
                f2 += fFloatValue2;
                f3 += fFloatValue3;
            }
            fArr[i2 + 3] = ((Float) ListProtector.get(this.LLJJJJ, i)).floatValue();
            fArr[i2 + 4] = ((Float) ListProtector.get(this.LLJJJJJIL, i)).floatValue();
            fArr[i2 + 5] = ((Float) ListProtector.get(this.LLJJJJLIIL, i)).floatValue();
            fArr[i2 + 6] = ((Float) ListProtector.get(this.LLJJIJIL, i)).floatValue();
            fArr[i2 + 7] = ((Float) ListProtector.get(this.LLJJJ, i)).floatValue();
            fArr[i2 + 8] = ((Float) ListProtector.get(this.LLJJJIL, i)).floatValue();
            i++;
        } while (i < 100);
        ((ArrayList) this.LLJJIII).clear();
        ((ArrayList) this.LLJJIJI).clear();
        ((ArrayList) this.LLJJIJIIJIL).clear();
        ((ArrayList) this.LLJJJJ).clear();
        ((ArrayList) this.LLJJJJJIL).clear();
        ((ArrayList) this.LLJJJJLIIL).clear();
        ((ArrayList) this.LLJJIJIL).clear();
        ((ArrayList) this.LLJJJ).clear();
        ((ArrayList) this.LLJJJIL).clear();
        if (this.LLJJ) {
            this.LLJJI = new float[6];
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            float[] fArr2 = this.LLJJI;
            fArr2[0] = f / 100.0f;
            fArr2[1] = f2 / 100.0f;
            fArr2[2] = f3 / 100.0f;
            int i3 = 0;
            float fPow = 0.0f;
            float fPow2 = 0.0f;
            float fPow3 = 0.0f;
            do {
                int i4 = i3 * 9;
                fPow2 = (float) (((double) fPow2) + Math.pow(fArr[i4] - this.LLJJI[c], 2.0d));
                fPow = (float) (((double) fPow) + Math.pow(fArr[i4 + 1] - this.LLJJI[1], 2.0d));
                fPow3 = (float) (((double) fPow3) + Math.pow(fArr[i4 + 2] - this.LLJJI[2], 2.0d));
                i3++;
                c = 0;
                z = false;
                z = false;
            } while (i3 < 100);
            float[] fArr3 = this.LLJJI;
            fArr3[3] = fPow2 / 100.0f;
            fArr3[4] = fPow / 100.0f;
            fArr3[5] = fPow3 / 100.0f;
            if (C1512080pS2.LIZ) {
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HarSensorManager.buildSensorValueArray:");
                sbLIZ.append(Arrays.toString(this.LLJJI));
                sbLIZ.append(" cost:");
                sbLIZ.append(jCurrentTimeMillis3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (C1512080pS2.LIZ) {
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HarSensorManager.buildPredictInputData cost: ");
            sbLIZ2.append(jCurrentTimeMillis4);
            sbLIZ2.append(" aSize:");
            sbLIZ2.append(size);
            sbLIZ2.append(" gSize:");
            sbLIZ2.append(size2);
            sbLIZ2.append(" lSize:");
            sbLIZ2.append(size3);
            sbLIZ2.append(" inputs.size:");
            sbLIZ2.append(900);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1512040pRy c1512040pRy = this.LLJIJIL;
        if (c1512040pRy != null) {
            float[] fArr4 = this.LLJJI;
            if (C1512080pS2.LIZ) {
                InterfaceC1511960pRq interfaceC1511960pRq = c1512040pRy.LIZ.LIZLLL;
                boolean z2 = interfaceC1511960pRq != null && interfaceC1511960pRq.isReady();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("HARService.onOnePredictSensorDataReady inputs.size:");
                sbLIZ3.append(900);
                sbLIZ3.append(" isEngineReady:");
                sbLIZ3.append(z2);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            InterfaceC1511960pRq interfaceC1511960pRq2 = c1512040pRy.LIZ.LIZLLL;
            if (interfaceC1511960pRq2 != null && interfaceC1511960pRq2.isReady()) {
                BPEAHandler bPEAHandler = c1512040pRy.LIZ.LJIILIIL;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                    C786410Ut5.LJJZZIII(c1512040pRy.LIZ.LJIILIIL, new ARunnableS56S0300000_23(fArr4, c1512040pRy, fArr, 20));
                    C1511830pRd c1511830pRd = c1512040pRy.LIZ;
                    if (c1511830pRd.LIZ) {
                        c1511830pRd.LIZJ();
                    }
                }
            } else {
                c1512040pRy.LIZ.LJIIJ(-2, z, null);
                c1512040pRy.LIZ.LJIIJJI(null, z);
            }
        }
        if (this.LLJILJIL) {
            this.LLJILJIL = z;
            this.LLJILJILJ = true;
        }
    }

    public final void LIZLLL() {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HarSensorManager.unInit hasInit:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" lastInitErrCode:");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" appContext:");
            sbLIZ.append(this.LL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            LJ();
            this.LL = null;
            this.LLILZ = null;
            this.LLILZIL = null;
            this.LLILZLL = null;
            this.LLIZ = null;
            this.LLILLL = -999;
            ((ArrayList) this.LLJJIII).clear();
            ((ArrayList) this.LLJJIJI).clear();
            ((ArrayList) this.LLJJIJIIJIL).clear();
            ((ArrayList) this.LLJJIJIL).clear();
            ((ArrayList) this.LLJJJ).clear();
            ((ArrayList) this.LLJJJIL).clear();
            ((ArrayList) this.LLJJJJ).clear();
            ((ArrayList) this.LLJJJJJIL).clear();
            ((ArrayList) this.LLJJJJLIIL).clear();
        }
    }

    public final void LJ() {
        long jCurrentTimeMillis = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
        boolean z = this.LLIZLLLIL;
        SensorManager sensorManager = this.LLILZ;
        Sensor sensor = this.LLILZIL;
        Sensor sensor2 = this.LLILZLL;
        Sensor sensor3 = this.LLIZ;
        if (z && sensorManager != null && sensor != null && sensor2 != null && sensor3 != null) {
            try {
                C1300690jx5.LIZLLL(sensorManager, this, sensor, CertProviderManagerKt.findCert("bpea-har_get_sensor_accelerometer", 1476415501));
                C1300690jx5.LIZLLL(sensorManager, this, sensor2, CertProviderManagerKt.findCert("bpea-har_get_sensor_gyroscope", 1476415501));
                C1300690jx5.LIZLLL(sensorManager, this, sensor3, CertProviderManagerKt.findCert("bpea-har_get_sensor_linear_acceleration", 1476415501));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLIZLLLIL = false;
        }
        if (C1512080pS2.LIZ) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HarSensorManager.unregister cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append(" hasRegister:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final int LIZIZ(Context context) {
        long jCurrentTimeMillis;
        if (C1512080pS2.LIZ) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        if (!this.LLILLJJLI && context != null) {
            Context contextN3 = C786410Ut5.N3(context);
            this.LL = contextN3;
            this.LLILLJJLI = true;
            SensorManager sensorManager = (SensorManager) C786410Ut5.H2(contextN3, "sensor");
            if (sensorManager != null) {
                this.LLILZIL = C1511930pRn.LIZ(sensorManager, 1);
                this.LLILZLL = C1511930pRn.LIZ(sensorManager, 4);
                this.LLIZ = C1511930pRn.LIZ(sensorManager, 10);
                this.LLILZ = sensorManager;
                if (C1512080pS2.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("HarSensorManager getDefaultSensor, accelerometer:");
                    sbLIZ.append(this.LLILZIL);
                    sbLIZ.append(" gyroscope:");
                    sbLIZ.append(this.LLILZLL);
                    sbLIZ.append(" linearAcceleration:");
                    sbLIZ.append(this.LLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("HarSensorManager useScreenStatus:");
                    sbLIZ2.append(this.LLJJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            if (this.LLILZIL == null) {
                this.LLILLL = -1;
            } else if (this.LLILZLL == null) {
                this.LLILLL = -2;
            } else if (this.LLIZ == null) {
                this.LLILLL = -3;
            } else {
                this.LLILLL = 0;
            }
            if (this.LLILLL != 0) {
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LLILZLL = null;
                this.LLIZ = null;
            }
        }
        if (C1512080pS2.LIZ) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HarSensorManager.init cost:");
            sbLIZ3.append(jCurrentTimeMillis2);
            sbLIZ3.append(" hasInit:");
            sbLIZ3.append(this.LLILLJJLI);
            sbLIZ3.append(" lastInitErrCode:");
            sbLIZ3.append(this.LLILLL);
            sbLIZ3.append(" appContext:");
            sbLIZ3.append(this.LL);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        return this.LLILLL;
    }

    public final void LIZJ(boolean z) {
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HarSensorManager.onlyTrackDataOnceWithSensorKeepRegister only:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJILJIL = z;
        this.LLJILJILJ = false;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.LLILLJJLI && this.LLJILLL && !this.LLJILJILJ) {
            Sensor sensor = sensorEvent.sensor;
            if (C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKbptjdWc/PRXSLoeWdqCKlLpvSp8Q/HEazGTqiw==", null)) == 1) {
                if (((ArrayList) this.LLJJIII).size() < 300) {
                    ((ArrayList) this.LLJJIII).add(Float.valueOf(sensorEvent.values[0]));
                    ((ArrayList) this.LLJJIJI).add(Float.valueOf(sensorEvent.values[1]));
                    ((ArrayList) this.LLJJIJIIJIL).add(Float.valueOf(sensorEvent.values[2]));
                    LIZ();
                    return;
                }
                return;
            }
            if (C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKbptjdWc/PRXSLoeWdqCKlLpvSp8Q/HEazGTqiw==", null)) == 4) {
                if (((ArrayList) this.LLJJIJIL).size() >= 300) {
                    return;
                }
                ((ArrayList) this.LLJJIJIL).add(Float.valueOf(sensorEvent.values[0]));
                ((ArrayList) this.LLJJJ).add(Float.valueOf(sensorEvent.values[1]));
                ((ArrayList) this.LLJJJIL).add(Float.valueOf(sensorEvent.values[2]));
                LIZ();
                return;
            }
            if (C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKbptjdWc/PRXSLoeWdqCKlLpvSp8Q/HEazGTqiw==", null)) != 10 || ((ArrayList) this.LLJJJJ).size() >= 300) {
                return;
            }
            ((ArrayList) this.LLJJJJ).add(Float.valueOf(sensorEvent.values[0]));
            ((ArrayList) this.LLJJJJJIL).add(Float.valueOf(sensorEvent.values[1]));
            ((ArrayList) this.LLJJJJLIIL).add(Float.valueOf(sensorEvent.values[2]));
            LIZ();
        }
    }
}
