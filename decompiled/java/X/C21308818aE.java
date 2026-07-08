package X;

import com.benchmark.strategy.nativePort.BXDataProviderPort;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18aE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21308818aE {
    public static final C21308818aE LIZJ = new C21308818aE();
    public final BXDataProviderPort LIZ = new BXDataProviderPort();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();

    public final <T> T LIZIZ(Class<T> cls, InterfaceC1865190ydZ interfaceC1865190ydZ) {
        T t;
        String simpleName = cls.getSimpleName();
        if (this.LIZIZ.contains(simpleName) && (t = (T) this.LIZIZ.get(simpleName)) != null) {
            return t;
        }
        T t2 = (T) interfaceC1865190ydZ.create(cls);
        this.LIZIZ.put(simpleName, t2);
        return t2;
    }

    public final String LJ(int i, String str) {
        Object objLIZ;
        if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
            return (String) objLIZ;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.LIZ.getString(i, str);
        LJFF(i, jCurrentTimeMillis, str);
        return string;
    }

    public static void LJFF(int i, long j, String str) {
        if (!C21309218aI.LIZ("bytebench_strategy_get_operation_cost_time")) {
            C806930Vl5.LIZ("AppLogOpt");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", jCurrentTimeMillis);
            jSONObject.put("appid", i);
            jSONObject.put("request_key", str);
            C21309418aK.LIZ("bytebench_strategy_get_operation_cost_time", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final boolean LIZ(int i, String str, boolean z) {
        Object objLIZ;
        if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
            return ((Boolean) objLIZ).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.LIZ.getBoolean(i, str, z);
        LJFF(i, jCurrentTimeMillis, str);
        return z2;
    }

    public final float LIZJ(int i, String str, float f) {
        Object objLIZ;
        if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
            return ((Float) objLIZ).floatValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f2 = this.LIZ.getFloat(i, str, f);
        LJFF(i, jCurrentTimeMillis, str);
        return f2;
    }

    public final int LIZLLL(int i, String str, int i2) {
        Object objLIZ;
        if (C21309718aN.LJIIZILJ.LJIIIZ && (objLIZ = C21310218aS.LIZ(str)) != null) {
            return ((Integer) objLIZ).intValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i3 = this.LIZ.getInt(i, str, i2);
        LJFF(i, jCurrentTimeMillis, str);
        return i3;
    }
}
