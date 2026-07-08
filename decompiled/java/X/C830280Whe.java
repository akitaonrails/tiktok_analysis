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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Whe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830280Whe implements Handler.Callback {
    public static final List<String> LLILZLL = Collections.singletonList("StatsMonitor");
    public BPEAHandler LLILLJJLI;
    public SharedPreferences LLILZ;
    public final C2210031Beb LLILZIL;
    public boolean LL = true;
    public final Map<String, Integer> LLILLL = new ConcurrentHashMap();

    public final void LJ() {
        SharedPreferences sharedPreferences = this.LLILZ;
        if (sharedPreferences == null) {
            return;
        }
        long j = sharedPreferences.getLong("uptime", 0L);
        if (j > 0 && System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(this.LLILZIL.LJIIIIZZ)) {
            this.LLILZ.edit().clear().apply();
            return;
        }
        Map<String, ?> all = this.LLILZ.getAll();
        if (all.isEmpty()) {
            return;
        }
        synchronized (this.LLILLL) {
            try {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key) && !"uptime".equals(entry.getKey())) {
                        int iIntValue = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                        Integer num = (Integer) ((ConcurrentHashMap) this.LLILLL).get(key);
                        if (num == null) {
                            ((ConcurrentHashMap) this.LLILLL).put(key, Integer.valueOf(iIntValue));
                        } else {
                            ((ConcurrentHashMap) this.LLILLL).put(key, Integer.valueOf(iIntValue + num.intValue()));
                        }
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

    public C830280Whe(C2210031Beb c2210031Beb) {
        this.LLILZIL = c2210031Beb;
    }

    public final Pair<Map<String, Integer>, Long> LIZIZ(long j) {
        if (((ConcurrentHashMap) this.LLILLL).isEmpty()) {
            return new Pair<>(null, Long.valueOf(j));
        }
        return new Pair<>(new HashMap(this.LLILLL), Long.valueOf(j - (((long) ((ConcurrentHashMap) this.LLILLL).size()) * 30)));
    }

    public final void LIZLLL(C830290Whf c830290Whf) {
        int iIntValue;
        synchronized (this.LLILLL) {
            try {
                Integer num = (Integer) ((ConcurrentHashMap) this.LLILLL).get(c830290Whf.LIZ);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = iIntValue + c830290Whf.LIZIZ;
                ((ConcurrentHashMap) this.LLILLL).put(c830290Whf.LIZ, Integer.valueOf(i));
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

    public final void LJFF(Map<String, Integer> map) {
        int iIntValue;
        if (map != null && !map.isEmpty()) {
            synchronized (this.LLILLL) {
                try {
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (entry.getValue() != null) {
                            iIntValue = entry.getValue().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer num = (Integer) ((ConcurrentHashMap) this.LLILLL).get(key);
                        if (num != null) {
                            int iMax = Math.max(0, num.intValue() - iIntValue);
                            if (iMax == 0) {
                                ((ConcurrentHashMap) this.LLILLL).remove(key);
                            } else {
                                ((ConcurrentHashMap) this.LLILLL).put(key, Integer.valueOf(iMax));
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLILLJJLI.removeMessages(8);
            C786410Ut5.LJLJJI(8, 500L, this.LLILLJJLI);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int iIntValue;
        int i = message.what;
        if (i != 8) {
            if (i != 16) {
                if (i == 24) {
                    LJ();
                }
                return false;
            }
            LIZLLL((C830290Whf) HandlerHook.getMessageObj(message.obj));
            return false;
        }
        SharedPreferences.Editor editorEdit = this.LLILZ.edit();
        editorEdit.clear();
        synchronized (this.LLILLL) {
            try {
                for (Map.Entry entry : ((ConcurrentHashMap) this.LLILLL).entrySet()) {
                    String str = (String) entry.getKey();
                    if (entry.getValue() != null) {
                        iIntValue = ((Integer) entry.getValue()).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    editorEdit.putInt(str, iIntValue);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        editorEdit.putLong("uptime", System.currentTimeMillis());
        editorEdit.apply();
        return false;
    }

    public static void LIZ(Map map, JSONArray jSONArray) {
        if (map.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "sdk_stats");
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                Integer num = (Integer) entry.getValue();
                if (num != null && num.intValue() > 0) {
                    jSONObject2.put((String) entry.getKey(), num);
                }
            }
            jSONObject.put("params", jSONObject2);
            jSONObject.put("local_time_ms", System.currentTimeMillis());
            jSONObject.put("event_id", C830270Whd.LIZIZ.incrementAndGet());
            jSONObject.put("datetime", C830270Whd.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILLIIL(8, LLILZLL, "appendMapToJSONArray failed", th, new Object[0]);
        }
        jSONArray.put(jSONObject);
    }

    public final void LIZJ(int i, String str) {
        if (!this.LL) {
            return;
        }
        C830290Whf c830290Whf = new C830290Whf(str, i);
        BPEAHandler bPEAHandler = this.LLILLJJLI;
        if (bPEAHandler != null) {
            C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(16, c830290Whf), 16L);
        } else {
            LIZLLL(c830290Whf);
        }
    }
}
