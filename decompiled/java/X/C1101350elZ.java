package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveScoreSystemWeightSettings;
import com.bytedance.android.livesdk.livesetting.gift.ScoreWeights;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0elZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101350elZ {
    public final AFwS254S0000000_17 LIZ = AFwS254S0000000_17.get$arr$(112);
    public final Class<? extends AbstractC1136060ffY>[] LIZIZ = {GiftMessage.class, LikeMessage.class, ChatMessage.class, MemberMessage.class};
    public InterfaceC1100800ekg LIZJ;
    public final IHostPerformanceMonitor LIZLLL;
    public double LJ;
    public final InterfaceC1162920gMs LJFF;
    public float LJI;
    public volatile float LJII;
    public Map<String, Float> LJIIIIZZ;

    public final void LIZ() {
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        InterfaceC1100990ekz interfaceC1100990ekzMessage2;
        InterfaceC1100970ekx interfaceC1100970ekxLIZJ;
        C1100760ekc c1100760ekcLJFF;
        InterfaceC1100980eky interfaceC1100980ekyLJIIJ;
        InterfaceC1100980eky interfaceC1100980ekyLJIIJ2;
        InterfaceC1100960ekw interfaceC1100960ekwLIZIZ;
        InterfaceC1100950ekv interfaceC1100950ekvLJ;
        float fLIZIZ = (float) LIZIZ();
        InterfaceC1100800ekg interfaceC1100800ekg = this.LIZJ;
        float batteryTemperature = (interfaceC1100800ekg == null || (interfaceC1100950ekvLJ = interfaceC1100800ekg.LJ()) == null) ? 0.0f : interfaceC1100950ekvLJ.getBatteryTemperature();
        InterfaceC1100800ekg interfaceC1100800ekg2 = this.LIZJ;
        Number numberValueOf = (interfaceC1100800ekg2 == null || (interfaceC1100960ekwLIZIZ = interfaceC1100800ekg2.LIZIZ()) == null) ? -999 : Double.valueOf(interfaceC1100960ekwLIZIZ.LIZ());
        InterfaceC1100800ekg interfaceC1100800ekg3 = this.LIZJ;
        Number numberValueOf2 = (interfaceC1100800ekg3 == null || (interfaceC1100980ekyLJIIJ2 = interfaceC1100800ekg3.LJIIJ()) == null) ? -999 : Float.valueOf(interfaceC1100980ekyLJIIJ2.LIZJ());
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        InterfaceC1100800ekg interfaceC1100800ekg4 = this.LIZJ;
        Float fValueOf = (interfaceC1100800ekg4 == null || (interfaceC1100980ekyLJIIJ = interfaceC1100800ekg4.LJIIJ()) == null) ? null : Float.valueOf(interfaceC1100980ekyLJIIJ.LIZIZ());
        this.LJI = fValueOf != null ? fValueOf.floatValue() / jMaxMemory : -1.0f;
        InterfaceC1100800ekg interfaceC1100800ekg5 = this.LIZJ;
        float f = (interfaceC1100800ekg5 == null || (c1100760ekcLJFF = interfaceC1100800ekg5.LJFF()) == null) ? 0.0f : c1100760ekcLJFF.LIZ;
        int i = fLIZIZ <= 0.0f ? 1 : 0;
        if (batteryTemperature <= 0.0f) {
            i |= 2;
        }
        if (numberValueOf.intValue() == -999) {
            i |= 4;
        }
        if (LIZJ() < 0.0f) {
            i |= 16;
        }
        if (i != 0) {
            this.LJII = -(i + 10000);
            return;
        }
        ScoreWeights value = LiveScoreSystemWeightSettings.INSTANCE.getValue();
        Float[] fArr = new Float[5];
        fArr[0] = Float.valueOf(value.fpsWeight);
        fArr[1] = Float.valueOf(value.temperatureWeight);
        fArr[2] = Float.valueOf(value.cpuWeight);
        fArr[3] = Float.valueOf(value.memoryWeight);
        fArr[4] = Float.valueOf(f > 0.0f ? value.deviceScoreWeight : 0.0f);
        ArrayList arrayListLJ = C1697810uHb.LJ(fArr);
        float fLJZ = C13LP.LJZ(arrayListLJ);
        if (fLJZ < 1.0f) {
            fLJZ = 1.0f;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLJ, 10));
        Iterator it2 = arrayListLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((Number) it2.next()).floatValue() / fLJZ));
        }
        float fLJ = LJ(this, Float.valueOf(fLIZIZ), 0.025f, -0.5f, 0.0f, 0.0f, null, 504);
        float fLJ2 = LJ(this, Float.valueOf(batteryTemperature), -0.015441f, 1.362142f, -0.072795f, 3.14014f, Float.valueOf(31.0f), 448);
        float fLJ3 = LJ(this, numberValueOf, -0.272727f, 1.0f, -0.142857f, 0.714286f, Float.valueOf(2.2f), 448);
        float fLJ4 = LJ(this, numberValueOf2, -3.4f, 3.92f, -2.33333f, 2.8f, Float.valueOf(1.05f), 448);
        float fLJ5 = LJ(this, Float.valueOf(LIZJ()), -0.32f, 1.005f, -1.989585f, 1.989585f, Float.valueOf(0.59f), 448);
        float f2 = f <= 6.0f ? 0.21f : f <= 8.0f ? 0.58f : 0.89f;
        C1697810uHb.LJ(Float.valueOf(fLIZIZ), Float.valueOf(batteryTemperature), numberValueOf, numberValueOf2, Float.valueOf(f));
        float f3 = 100;
        List listLLIILII = C13LP.LLIILII(arrayList, C1697810uHb.LJ(Float.valueOf(fLJ), Float.valueOf(fLJ2), Float.valueOf(fLJ3), Float.valueOf(fLJ5), Float.valueOf(f2)));
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
        for (Pair pair : (ArrayList) listLLIILII) {
            arrayList2.add(Float.valueOf(((Number) pair.getFirst()).floatValue() * ((Number) pair.getSecond()).floatValue()));
        }
        this.LJII = f3 * C13LP.LJZ(arrayList2);
        Pair[] pairArr = new Pair[20];
        pairArr[0] = new Pair("score", Float.valueOf(LIZLLL()));
        pairArr[1] = new Pair("cached_fps", Float.valueOf(fLIZIZ));
        InterfaceC1100800ekg interfaceC1100800ekg6 = this.LIZJ;
        pairArr[2] = new Pair("collector_fps", Float.valueOf((interfaceC1100800ekg6 == null || (interfaceC1100970ekxLIZJ = interfaceC1100800ekg6.LIZJ()) == null) ? -1.0f : interfaceC1100970ekxLIZJ.LIZJ(15)));
        pairArr[3] = new Pair("temp", Float.valueOf(batteryTemperature));
        pairArr[4] = new Pair("cpu", Float.valueOf(numberValueOf.floatValue()));
        pairArr[5] = new Pair("memory", Float.valueOf(numberValueOf2.floatValue()));
        pairArr[6] = new Pair("jvm_mem_rate", Float.valueOf(LIZJ()));
        pairArr[7] = new Pair("jvm_mem_used(MB)", Float.valueOf(fValueOf != null ? fValueOf.floatValue() / 1048576.0f : -1.0f));
        pairArr[8] = new Pair("jvm_mem_max(MB)", Float.valueOf((jMaxMemory / 1024.0f) / 1024.0f));
        pairArr[9] = new Pair("network", Float.valueOf(-1.0f));
        pairArr[10] = new Pair("device", Float.valueOf(f));
        pairArr[11] = new Pair("fps_norm", Float.valueOf(fLJ));
        pairArr[12] = new Pair("temp_norm", Float.valueOf(fLJ2));
        pairArr[13] = new Pair("cpu_norm", Float.valueOf(fLJ3));
        pairArr[14] = new Pair("memory_norm", Float.valueOf(fLJ4));
        pairArr[15] = new Pair("jvm_mem_norm", Float.valueOf(fLJ5));
        pairArr[16] = new Pair("network_norm", Float.valueOf(-1.0f));
        pairArr[17] = new Pair("device_norm", Float.valueOf(f2));
        InterfaceC1100800ekg interfaceC1100800ekg7 = this.LIZJ;
        pairArr[18] = new Pair("total_qps", Float.valueOf((interfaceC1100800ekg7 == null || (interfaceC1100990ekzMessage2 = interfaceC1100800ekg7.message()) == null) ? 0.0f : interfaceC1100990ekzMessage2.LIZIZ(15)));
        InterfaceC1100800ekg interfaceC1100800ekg8 = this.LIZJ;
        pairArr[19] = new Pair("gift_qps", Float.valueOf((interfaceC1100800ekg8 == null || (interfaceC1100990ekzMessage = interfaceC1100800ekg8.message()) == null) ? 0.0f : interfaceC1100990ekzMessage.LIZ(15, GiftMessage.class)));
        this.LJIIIIZZ = C2097608Jq.LJIIJ(pairArr);
    }

    public final double LIZIZ() {
        float f = Keva.getRepo("overload_mock").getFloat("fps", -1.0f);
        return f > 0.0f ? f : this.LJ;
    }

    public final float LIZJ() {
        float f = Keva.getRepo("overload_mock").getFloat("memory", -1.0f);
        return f <= 0.0f ? this.LJI : f;
    }

    public final float LIZLLL() {
        if (this.LJII == 0.0f) {
            LIZ();
        }
        float f = Keva.getRepo("overload_mock").getFloat("score", -1.0f);
        return f <= 0.0f ? this.LJII : f;
    }

    public C1101350elZ() {
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        this.LIZLLL = iHostPerformanceMonitor;
        this.LJ = -1.0d;
        InterfaceC1162920gMs interfaceC1162920gMsNt0 = iHostPerformanceMonitor.nt0("revenue_overload");
        interfaceC1162920gMsNt0.LIZIZ(new C0VVO() { // from class: X.0ela
            @Override // X.C0VVO
            public final void LIZIZ(double d) {
                this.LIZ.LJ = d;
            }
        });
        this.LJFF = interfaceC1162920gMsNt0;
        this.LJI = -1.0f;
        this.LJIIIIZZ = new LinkedHashMap();
    }

    public static float LJ(C1101350elZ c1101350elZ, Number number, float f, float f2, float f3, float f4, Float f5, int i) {
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i & 16) != 0) {
            f4 = 0.0f;
        }
        if ((i & 32) != 0) {
            f5 = null;
        }
        c1101350elZ.getClass();
        float fFloatValue = number.floatValue();
        if (f5 != null && fFloatValue > f5.floatValue()) {
            return (f3 * fFloatValue) + f4;
        }
        return (f * fFloatValue) + f2;
    }
}
