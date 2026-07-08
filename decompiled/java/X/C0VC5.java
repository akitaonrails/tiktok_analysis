package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VC5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC5 {
    public static volatile Context LIZ;
    public static Map<String, String> LIZJ;
    public static C794010VCt LJ;
    public static volatile InterfaceC794070VCz LJI;
    public static final ConcurrentHashMap<Long, JSONObject> LIZIZ = new ConcurrentHashMap<>();
    public static volatile boolean LIZLLL = false;
    public static volatile String LJFF = "";

    public static Map<String, String> LIZ() {
        if (!TextUtils.isEmpty((CharSequence) ((HashMap) LIZJ).get("device_id"))) {
            return LIZJ;
        }
        Iterator<Long> it2 = LIZIZ.keySet().iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject = LIZIZ.get(it2.next());
            if (jSONObject != null) {
                try {
                    CastLongProtector.parseLong(jSONObject.optString("device_id"));
                    ((HashMap) LIZJ).put("device_id", jSONObject.optString("device_id"));
                    break;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LIZJ;
    }

    public static synchronized JSONObject LIZIZ() {
        ConcurrentHashMap<Long, JSONObject> concurrentHashMap = LIZIZ;
        Iterator<Long> it2 = concurrentHashMap.keySet().iterator();
        if (!it2.hasNext()) {
            return null;
        }
        return concurrentHashMap.get(it2.next());
    }

    public static boolean LIZJ() {
        C794010VCt c794010VCt = LJ;
        return c794010VCt != null && c794010VCt.LIZ;
    }

    public static synchronized boolean LIZLLL() {
        FileLock fileLockTryLock;
        try {
            if (LIZLLL) {
                return true;
            }
            C0VSJ c0vsj = new C0VSJ(C0VC2.LJI(), "file.lock");
            if (!c0vsj.exists()) {
                c0vsj.createNewFile();
            }
            FileChannel channel = new RandomAccessFile(c0vsj, "rw").getChannel();
            if (channel != null && (fileLockTryLock = channel.tryLock()) != null) {
                LIZLLL = fileLockTryLock.isValid();
            }
            return LIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static synchronized void LJ(String str, JSONObject jSONObject) {
        try {
            if (LJI != null) {
                C0VJS.LIZ(jSONObject);
            }
            LIZIZ.put(Long.valueOf(CastLongProtector.parseLong(str)), jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VCY.LIZIZ("setHeader", e);
        }
    }
}
