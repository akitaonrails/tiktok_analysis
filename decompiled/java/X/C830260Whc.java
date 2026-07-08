package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Whc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830260Whc implements Handler.Callback {
    public static final List<String> LLILZLL = Collections.singletonList("NetworkMonitor");
    public boolean LL;
    public BPEAHandler LLILLJJLI;
    public final Map<String, C830250Whb> LLILLL = new ConcurrentHashMap();
    public SharedPreferences LLILZ;
    public final C2210031Beb LLILZIL;

    public final void LIZJ() {
        C830250Whb c830250WhbLIZ;
        SharedPreferences sharedPreferences = this.LLILZ;
        if (sharedPreferences == null) {
            return;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        if (all.isEmpty()) {
            return;
        }
        synchronized (this.LLILLL) {
            try {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !"uptime".equals(entry.getKey()) && (c830250WhbLIZ = C830250Whb.LIZ((String) entry.getValue())) != null) {
                        ((ConcurrentHashMap) this.LLILLL).put(c830250WhbLIZ.LIZ, c830250WhbLIZ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        BPEAHandler bPEAHandler = this.LLILLJJLI;
        if (bPEAHandler != null) {
            bPEAHandler.removeMessages(8);
            C786410Ut5.LJLJJI(8, 500L, this.LLILLJJLI);
        }
    }

    public C830260Whc(C2210031Beb c2210031Beb) {
        this.LLILZIL = c2210031Beb;
    }

    public final Pair<Map<String, C830250Whb>, Long> LIZIZ(long j) {
        if (((ConcurrentHashMap) this.LLILLL).isEmpty()) {
            return new Pair<>(null, Long.valueOf(j));
        }
        HashMap map = new HashMap();
        synchronized (this.LLILLL) {
            try {
                for (Map.Entry entry : ((ConcurrentHashMap) this.LLILLL).entrySet()) {
                    String str = (String) entry.getKey();
                    C830250Whb c830250Whb = (C830250Whb) entry.getValue();
                    if (c830250Whb != null) {
                        j -= ((long) ((c830250Whb.LIZ.length() + c830250Whb.LIZIZ.length()) + c830250Whb.LJII.length())) + 200;
                        if (j <= 0) {
                            break;
                        }
                        map.put(str, c830250Whb);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new Pair<>(map, Long.valueOf(j));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 8) {
            if (i != 16) {
                if (i == 24) {
                    LIZJ();
                    return false;
                }
                return false;
            }
            C830250Whb c830250Whb = (C830250Whb) HandlerHook.getMessageObj(message.obj);
            ((ConcurrentHashMap) this.LLILLL).put(c830250Whb.LIZ, c830250Whb);
            BPEAHandler bPEAHandler = this.LLILLJJLI;
            if (bPEAHandler == null) {
                return false;
            }
            bPEAHandler.removeMessages(8);
            C786410Ut5.LJLJJI(8, 500L, this.LLILLJJLI);
            return false;
        }
        SharedPreferences.Editor editorEdit = this.LLILZ.edit();
        synchronized (this.LLILLL) {
            try {
                if (((ConcurrentHashMap) this.LLILLL).size() > 200) {
                    editorEdit.clear();
                    ((ConcurrentHashMap) this.LLILLL).clear();
                }
                for (Map.Entry entry : ((ConcurrentHashMap) this.LLILLL).entrySet()) {
                    editorEdit.putString((String) entry.getKey(), C786410Ut5.J3(((C830250Whb) entry.getValue()).LIZJ()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        editorEdit.apply();
        return false;
    }

    public static void LIZ(Map map, JSONArray jSONArray) {
        if (map.isEmpty()) {
            return;
        }
        try {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                C830250Whb c830250Whb = (C830250Whb) ((Map.Entry) it2.next()).getValue();
                if (c830250Whb != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event", "sdk_network");
                    jSONObject.put("params", c830250Whb.LIZIZ());
                    jSONObject.put("local_time_ms", System.currentTimeMillis());
                    jSONObject.put("event_id", C830270Whd.LIZIZ.incrementAndGet());
                    jSONObject.put("datetime", C830270Whd.LIZ());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILLIIL(8, LLILZLL, "appendMapToJSONArray failed", th, new Object[0]);
        }
    }

    public final void LIZLLL(String str, String str2, long j, boolean z, int i, int i2, long j2, String str3, long j3, JSONObject jSONObject) {
        if (!this.LL) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLILZLL, "onRequestFinished {} -> {}, {}, {}, {}, {}, {}, {}, {}", str, str2, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), str3, Long.valueOf(j3), jSONObject);
        C830250Whb c830250Whb = new C830250Whb(str, str2, j, z, i, i2, j2, str3, j3, jSONObject);
        BPEAHandler bPEAHandler = this.LLILLJJLI;
        if (bPEAHandler != null) {
            C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(16, c830250Whb));
            return;
        }
        ((ConcurrentHashMap) this.LLILLL).put(str, c830250Whb);
        BPEAHandler bPEAHandler2 = this.LLILLJJLI;
        if (bPEAHandler2 == null) {
            return;
        }
        bPEAHandler2.removeMessages(8);
        C786410Ut5.LJLJJI(8, 500L, this.LLILLJJLI);
    }
}
