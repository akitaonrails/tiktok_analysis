package X;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08ss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257208ss implements InterfaceC2257308st {
    public static volatile C2257208ss LJI;
    public final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;

    public static C2257208ss LIZ() {
        if (LJI == null) {
            synchronized (C2257208ss.class) {
                try {
                    if (LJI == null) {
                        LJI = new C2257208ss();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.LIZJ = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.LJ = jMaxMemory / 1048576;
            long j2 = j - jFreeMemory;
            this.LJFF = j2 / 1048576;
            this.LIZLLL = ((float) j2) > ((float) jMaxMemory) * 0.95f;
            jSONObject.put("apm_native_heap_size", this.LIZJ);
            jSONObject.put("apm_java_heap_leak", this.LIZLLL);
            jSONObject.put("apm_java_heap_used", this.LJFF);
            jSONObject.put("apm_java_heap_max", this.LJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String LJ() {
        String strLIZ = C08GN.LIZ(this.LIZ.toArray());
        if (!TextUtils.isEmpty(strLIZ)) {
            return strLIZ;
        }
        C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
        return c0v7r != null ? c0v7r.LIZLLL() : "";
    }

    public final JSONObject LIZJ(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("RealRefreshRate", String.valueOf(C0VXC.LJFF));
            jSONObject.put("RealMaxRefreshRate", String.valueOf(C0VXC.LJFF));
            if (z) {
                C2165908e9 c2165908e9 = C2166008eA.LIZ;
                c2165908e9.LIZJ(jSONObject);
                c2165908e9.LIZIZ(jSONObject);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
