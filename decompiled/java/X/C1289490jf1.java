package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.SparseArray;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289490jf1 implements SensorEventListener {
    public final Handler LL;
    public final Map<String, String> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final long LLILZIL;
    public final InterfaceC1289500jf2 LLILZLL;
    public final Cert LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(80));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1081));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(228));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3082));

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final Map<String, List<String>> LIZ() {
        return (Map) this.LLJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0gHo] */
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
    public final void LIZJ(boolean z) throws JSONException {
        String str;
        Iterator it2 = ((Map) this.LLJ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            try {
                C1300690jx5.LIZLLL((SensorManager) this.LLIZLLLIL.getValue(), this, (Sensor) ((Map.Entry) it2.next()).getValue(), this.LLIZ);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((Map) this.LLJ.getValue()).clear();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : LIZ().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.LLILZLL.LIZ(0, new Object(linkedHashMap) { // from class: X.0gHo
            public final Map<String, List<String>> LIZ;

            {
                this.LIZ = linkedHashMap;
            }
        });
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry2 : LIZ().entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Integer.valueOf(entry2.getValue().size()));
        }
        C185100nR c185100nR = C185100nR.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_timeout", str);
        C185100nR.LIZIZ(c185100nR, "sensor_status", jSONObject, new JSONObject(linkedHashMap2), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) throws Throwable {
        if (sensorEvent != null) {
            Sensor sensor = sensorEvent.sensor;
            if (sensor != null) {
                C2204961BRm.LJJLIIIJJIZ(sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oL7xltTcpXh8lWAN2kqIEjvHcMSl", null));
            }
            Object obj = ((SparseArray) this.LLJIJIL.getValue()).get(C2204961BRm.LJJLIIIJLJLI(sensorEvent.sensor, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oL7xltTcpXh8lWAN2kqIEjvHcMSl", null)));
            if (obj != null) {
                String str = this.LLILLJJLI.get(obj);
                if (str != null) {
                    obj = str;
                }
                JSONObject jSONObject = new JSONObject();
                LIZIZ(sensorEvent, 0, "x", jSONObject);
                LIZIZ(sensorEvent, 1, "y", jSONObject);
                LIZIZ(sensorEvent, 2, "z", jSONObject);
                LIZIZ(sensorEvent, 3, "w", jSONObject);
                String data = RopaEncrypt.getEncryptSeq(C786410Ut5.J3(jSONObject), true).getData();
                if (!LIZ().containsKey(obj)) {
                    LIZ().put(obj, C1697810uHb.LJIILJJIL(data));
                } else {
                    List<String> list = LIZ().get(obj);
                    if (list != null && list.size() < this.LLILZ) {
                        list.add(data);
                    }
                }
            }
            Iterator<Map.Entry<String, List<String>>> it2 = LIZ().entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().getValue().size() >= this.LLILZ) {
                    i++;
                }
            }
            if (i == ((Map) this.LLJ.getValue()).size()) {
                this.LL.removeCallbacks((Runnable) this.LLJILJIL.getValue());
                LIZJ(false);
            }
        }
    }

    public static void LIZIZ(SensorEvent sensorEvent, int i, String str, JSONObject jSONObject) {
        Object c098200Yq;
        float[] fArr = sensorEvent.values;
        if (fArr.length > i) {
            Float fValueOf = Float.valueOf(fArr[i]);
            if (Math.abs(fValueOf.floatValue()) <= Float.MAX_VALUE) {
                try {
                    c098200Yq = jSONObject.put(str, Float.valueOf(fValueOf.floatValue()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1289490jf1(android.content.Context r8, com.bytedance.bpea.transmit.delegate.BPEAHandler r9, java.util.Map r10, int r11, int r12, long r13, X.InterfaceC1289500jf2 r15, com.bytedance.bpea.basics.Cert r16) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.<init>()
            r7.LL = r9
            r7.LLILLJJLI = r10
            r7.LLILLL = r11
            r7.LLILZ = r12
            r7.LLILZIL = r13
            r7.LLILZLL = r15
            r0 = r16
            r7.LLIZ = r0
            kotlin.jvm.internal.AwS560S0100000_16 r1 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 794(0x31a, float:1.113E-42)
            r1.<init>(r8, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r7.LLIZLLLIL = r0
            r0 = 80
            kotlin.jvm.internal.AFwS208S0000000_20 r0 = kotlin.jvm.internal.AFwS208S0000000_20.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r7.LLJ = r0
            r0 = 1081(0x439, float:1.515E-42)
            kotlin.jvm.internal.AFwS187S0000000_2 r0 = kotlin.jvm.internal.AFwS187S0000000_2.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r7.LLJI = r0
            r0 = 228(0xe4, float:3.2E-43)
            kotlin.jvm.internal.AFwS205S0000000_17 r0 = kotlin.jvm.internal.AFwS205S0000000_17.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r7.LLJIJIL = r0
            kotlin.jvm.internal.AwS563S0100000_19 r1 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3082(0xc0a, float:4.319E-42)
            r1.<init>(r7, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r7.LLJILJIL = r0
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r6 = r0.iterator()
        L59:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r4.hashCode()
            r0 = 93213925(0x58e54e5, float:1.3384801E-35)
            if (r1 == r0) goto Lb9
            r0 = 1542654287(0x5bf3094f, float:1.3681731E17)
            if (r1 == r0) goto Lae
            r0 = 1559901556(0x5cfa3574, float:5.6342013E17)
            if (r1 != r0) goto L59
            java.lang.String r0 = "android.sensor.magnetic_field"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L59
            r5 = 2
        L81:
            X.01GW r0 = r7.LLIZLLLIL
            java.lang.Object r3 = r0.getValue()
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oL7xltTcpXh8lWAN2kqIEjvHcMSl"
            r0 = 0
            r2.<init>(r1, r0)
            android.hardware.Sensor r1 = X.C2204961BRm.LJJL(r3, r5, r2)
            if (r1 == 0) goto L59
            X.01GW r0 = r7.LLJ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r4, r1)
            X.01GW r0 = r7.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.put(r5, r4)
            goto L59
        Lae:
            java.lang.String r0 = "android.sensor.rotation_vector"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L59
            r5 = 11
            goto L81
        Lb9:
            java.lang.String r0 = "android.sensor.geomagnetic_rotation_vector"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L59
            r5 = 20
            goto L81
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1289490jf1.<init>(android.content.Context, com.bytedance.bpea.transmit.delegate.BPEAHandler, java.util.Map, int, int, long, X.0jf2, com.bytedance.bpea.basics.Cert):void");
    }
}
