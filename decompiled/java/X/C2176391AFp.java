package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176391AFp implements Handler.Callback {
    public static final List<String> LLIZLLLIL = Collections.singletonList("SentryMonitor");
    public BPEAHandler LLILLL;
    public SharedPreferences LLILZ;
    public final C2210031Beb LLILZIL;
    public final Map<String, C21655019oy> LL = Collections.synchronizedMap(new LinkedHashMap());
    public boolean LLILLJJLI = true;
    public boolean LLILZLL = true;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);

    public final boolean LIZLLL() {
        return this.LLILZLL || this.LLILZIL.LJIILJJIL;
    }

    public final void LJFF() {
        C21655019oy c21655019oy;
        ArrayList arrayList;
        C21655019oy c21655019oy2;
        if (this.LLILZ == null) {
            return;
        }
        int i = 0;
        C2209791BeD.LJIJJ().LJIIIZ(8, LLIZLLLIL, "start load cache map from sp...", new Object[0]);
        long j = this.LLILZ.getLong("uptime", 0L);
        if (j > 0 && System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(this.LLILZIL.LJIIIIZZ)) {
            this.LLILZ.edit().clear().apply();
            return;
        }
        Map<String, ?> all = this.LLILZ.getAll();
        if (all.isEmpty()) {
            return;
        }
        int i2 = 2;
        HashMap map = new HashMap(all.size() * 2);
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && !"uptime".equals(key)) {
                String str = (String) entry.getValue();
                if (!TextUtils.isEmpty(str)) {
                    AtomicLong atomicLong = C830270Whd.LIZ;
                    if (str == null || str.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList();
                        int length = str.length();
                        int i3 = 0;
                        for (int i4 = 0; i4 < length; i4++) {
                            if (str.charAt(i4) == '|') {
                                arrayList.add(str.substring(i3, i4));
                                i3 = i4 + 1;
                            }
                        }
                        if (i3 <= length) {
                            arrayList.add(str.substring(i3));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        int i5 = -1;
                        if (((String) ListProtector.get(arrayList, i)).equals("v4")) {
                            try {
                                i5 = CastIntegerProtector.parseInt((String) arrayList.get(i2));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c21655019oy2 = new C21655019oy(EnumC21646419na.fromName((String) ListProtector.get(arrayList, 3)), new C21655119oz(TextUtils.isEmpty((CharSequence) ListProtector.get(arrayList, 1)) ? null : (String) ListProtector.get(arrayList, 1), i5, (String) ListProtector.get(arrayList, 4), key, CastLongProtector.parseLong((String) ListProtector.get(arrayList, 5)), EnumC2176421AFs.parse((String) ListProtector.get(arrayList, 6))));
                            try {
                                c21655019oy2.LIZ(new JSONObject((String) arrayList.get(7)));
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        } else if (((String) ListProtector.get(arrayList, 0)).equals("v3")) {
                            try {
                                i5 = CastIntegerProtector.parseInt((String) arrayList.get(2));
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                            c21655019oy2 = new C21655019oy(EnumC21646419na.fromName((String) ListProtector.get(arrayList, 3)), new C21655119oz(TextUtils.isEmpty((CharSequence) ListProtector.get(arrayList, 1)) ? null : (String) ListProtector.get(arrayList, 1), i5, (String) ListProtector.get(arrayList, 4), key, CastLongProtector.parseLong((String) ListProtector.get(arrayList, 5)), EnumC2176421AFs.parse((String) ListProtector.get(arrayList, 6))));
                        } else if (arrayList.size() == 4) {
                            c21655019oy2 = new C21655019oy(EnumC21646419na.fromName((String) ListProtector.get(arrayList, 0)), new C21655119oz(CastLongProtector.parseLong((String) ListProtector.get(arrayList, 2)), EnumC2176421AFs.V3_EVENT, (String) ListProtector.get(arrayList, 1), key));
                        } else if (arrayList.size() == 5) {
                            c21655019oy2 = new C21655019oy(EnumC21646419na.fromName((String) ListProtector.get(arrayList, 0)), new C21655119oz(CastLongProtector.parseLong((String) ListProtector.get(arrayList, 2)), EnumC2176421AFs.parse((String) ListProtector.get(arrayList, 3)), (String) ListProtector.get(arrayList, 1), key));
                        }
                        c21655019oy2.LIZJ = true;
                        map.put(key, c21655019oy2);
                    }
                }
                i2 = 2;
                i = 0;
            }
        }
        synchronized (this.LL) {
            try {
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    C21655019oy c21655019oy3 = (C21655019oy) entry2.getValue();
                    if (this.LL.containsKey(entry2.getKey()) && (c21655019oy = this.LL.get(entry2.getKey())) != null) {
                        c21655019oy3.LIZJ = false;
                        c21655019oy3.LIZ.LIZ(c21655019oy.LIZ);
                    }
                    this.LL.put(str2, c21655019oy3);
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    public C2176391AFp(C2210031Beb c2210031Beb) {
        this.LLILZIL = c2210031Beb;
    }

    public final void LIZ(C21655019oy c21655019oy) {
        C2209791BeD.LJIJJ().LJIIIZ(8, LLIZLLLIL, "start handle stage ({})", c21655019oy);
        synchronized (this.LL) {
            try {
                if (!LJ(c21655019oy.LIZ.LIZ)) {
                    return;
                }
                C21655019oy c21655019oy2 = this.LL.get(c21655019oy.LIZ.LIZIZ);
                if (c21655019oy2 == null) {
                    this.LL.put(c21655019oy.LIZ.LIZIZ, c21655019oy);
                } else {
                    c21655019oy2.LIZJ = false;
                    c21655019oy2.LIZ.LIZ(c21655019oy.LIZ);
                    if (c21655019oy.LIZIZ.ordinal() > c21655019oy2.LIZIZ.ordinal()) {
                        c21655019oy2.LIZIZ = c21655019oy.LIZIZ;
                    }
                    c21655019oy2.LIZ(c21655019oy.LIZLLL);
                }
                BPEAHandler bPEAHandler = this.LLILLL;
                if (bPEAHandler != null) {
                    bPEAHandler.removeMessages(4);
                    C786410Ut5.LJLJJI(4, 500L, this.LLILLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Pair<Map<String, C21655019oy>, Long> LIZJ(long j) {
        int length;
        if (this.LL.isEmpty()) {
            return new Pair<>(null, Long.valueOf(j));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.LL) {
            try {
                for (Map.Entry<String, C21655019oy> entry : this.LL.entrySet()) {
                    C21655019oy value = entry.getValue();
                    linkedHashMap.put(entry.getKey(), value);
                    C21655119oz c21655119oz = value.LIZ;
                    if (c21655119oz != null) {
                        length = c21655119oz.LIZ.length();
                    } else {
                        length = 0;
                    }
                    j -= (long) (length + 223);
                    if (j < 0) {
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new Pair<>(linkedHashMap, Long.valueOf(j));
    }

    public final boolean LJ(String str) {
        if (LIZLLL()) {
            return true;
        }
        Map<String, Integer> map = this.LLILZIL.LJIIL;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public final void LJI(Map<String, C21655019oy> map) {
        SharedPreferences.Editor editorEdit;
        if (map != null && !map.isEmpty()) {
            SharedPreferences sharedPreferences = this.LLILZ;
            if (sharedPreferences != null) {
                editorEdit = sharedPreferences.edit();
            } else {
                editorEdit = null;
            }
            synchronized (this.LL) {
                try {
                    for (String str : map.keySet()) {
                        this.LL.remove(str);
                        if (editorEdit != null) {
                            editorEdit.remove(str);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (editorEdit != null) {
                editorEdit.apply();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i != 8) {
                if (i == 12) {
                    LJFF();
                }
                return false;
            }
            LIZ((C21655019oy) HandlerHook.getMessageObj(message.obj));
            return false;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLIZLLLIL, "start flush cache map (size={}) to sp...", Integer.valueOf(this.LL.size()));
        SharedPreferences.Editor editorEdit = this.LLILZ.edit();
        synchronized (this.LL) {
            try {
                Iterator<Map.Entry<String, C21655019oy>> it2 = this.LL.entrySet().iterator();
                while (it2.hasNext()) {
                    C21655019oy value = it2.next().getValue();
                    if (!value.LIZJ && LJ(value.LIZ.LIZ)) {
                        editorEdit.putString(value.LIZ.LIZIZ, value.LIZIZ());
                        value.LIZJ = true;
                    }
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

    public static void LIZIZ(Map map, JSONArray jSONArray) {
        if (map.isEmpty()) {
            return;
        }
        HashMap map2 = new HashMap();
        for (C21655019oy c21655019oy : map.values()) {
            JSONArray jSONArray2 = (JSONArray) map2.get(c21655019oy.LIZIZ);
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
                map2.put(c21655019oy.LIZIZ, jSONArray2);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("monitor_id", c21655019oy.LIZ.LIZIZ);
                EnumC2176421AFs enumC2176421AFs = c21655019oy.LIZ.LIZLLL;
                if (enumC2176421AFs != null) {
                    jSONObject.put("event_type", enumC2176421AFs.getLabel());
                }
                if (!TextUtils.isEmpty(c21655019oy.LIZ.LIZ)) {
                    jSONObject.put("event", c21655019oy.LIZ.LIZ);
                }
                long j = c21655019oy.LIZ.LIZJ;
                if (j > 0) {
                    jSONObject.put("local_time_ms", j);
                }
                if (!TextUtils.isEmpty(c21655019oy.LIZ.LJ)) {
                    jSONObject.put("event_priority", c21655019oy.LIZ.LJ);
                }
                int i = c21655019oy.LIZ.LJFF;
                if (i >= 0) {
                    jSONObject.put("global_priority", i);
                }
                if (c21655019oy.LIZLLL.length() > 0) {
                    jSONObject.put("stage_ms", c21655019oy.LIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            jSONArray2.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("event", "sdk_stage");
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry : map2.entrySet()) {
                jSONObject3.put(((EnumC21646419na) entry.getKey()).toString(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            jSONObject2.put("local_time_ms", System.currentTimeMillis());
            jSONObject2.put("event_id", C830270Whd.LIZIZ.incrementAndGet());
            jSONObject2.put("datetime", C830270Whd.LIZ());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        jSONArray.put(jSONObject2);
    }
}
