package X;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.applog.priority.PriorityCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.KeyGenerator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS88S0500000_34;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191771AqF {
    public static final void LIZ(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && sQLiteDatabase.inTransaction()) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void LIZJ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("magic_tag", "ss_app_log");
        jSONObject.put("local_time", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        jSONObject.put("_gen_time", System.currentTimeMillis());
    }

    public static final int LJ(String str) {
        int i = 0;
        if (str.length() == 0) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                i2++;
            } else if (cCharAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        r3 = r3 % 1;
        r3 = 1;
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LJI(java.util.List<java.lang.Long> r7) {
        /*
            int r2 = r7.size()
            if (r2 == 0) goto L48
            r0 = 0
            r5 = 1
            r1 = 1
            if (r2 == r1) goto L38
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            int r0 = r7.size()
            java.util.List r0 = r7.subList(r1, r0)
            long r1 = LJI(r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L28
            r3 = 1
        L28:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            r5 = r1
        L2d:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L4d
        L33:
            long r3 = r3 % r5
            r0 = r3
            r3 = r5
            r5 = r0
            goto L2d
        L38:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            return r1
        L47:
            return r5
        L48:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191771AqF.LJI(java.util.List):long");
    }

    public static final Pair<String, String> LIZLLL(JSONObject jSONObject, boolean z) throws JSONException {
        jSONObject.put("uid_enable", 1);
        if (!z) {
            return null;
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(128, secureRandom);
            String strLIZ = C08E8.LIZ(keyGenerator.generateKey().getEncoded());
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            String strLIZ2 = C08E8.LIZ(bArr);
            if (strLIZ != null && strLIZ2 != null && strLIZ.length() == 32 && strLIZ2.length() == 16) {
                Pair pair = new Pair(strLIZ, strLIZ2);
                Object first = pair.getFirst();
                Object second = pair.getSecond();
                jSONObject.put("key", first);
                jSONObject.put("iv", second);
                return new Pair<>(first, second);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public static final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.length() <= 0) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, jSONObject2.get(next));
        }
    }

    public static final JSONObject LJIIJ(PriorityCallback priorityCallback, int i) throws InterruptedException {
        String headerJson = priorityCallback.getHeaderJson();
        if (headerJson != null && headerJson.length() != 0) {
            return new JSONObject(headerJson);
        }
        if (i > 0) {
            Thread.sleep(300L);
            return LJIIJ(priorityCallback, i - 1);
        }
        return null;
    }

    public static final void LIZIZ(JSONObject jSONObject, Map<C2191641Aq2, ? extends JSONObject> map, InterfaceC2190561AoI interfaceC2190561AoI) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        JSONArray jSONArray5 = new JSONArray();
        for (Map.Entry<C2191641Aq2, ? extends JSONObject> entry : map.entrySet()) {
            C2191641Aq2 key = entry.getKey();
            JSONObject value = entry.getValue();
            int i = C2191911AqT.LIZ[key.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                jSONArray5.put(value);
                            }
                        } else {
                            jSONArray4.put(value);
                        }
                    } else {
                        jSONArray3.put(value);
                    }
                } else {
                    jSONArray2.put(value);
                }
            } else {
                jSONArray.put(value);
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject.put("event_v3", jSONArray);
        }
        if (jSONArray2.length() > 0) {
            jSONObject.put("event", jSONArray2);
        }
        if (jSONArray3.length() > 0) {
            jSONObject.put("log_data", jSONArray3);
        }
        if (jSONArray4.length() > 0) {
            jSONObject.put("launch", jSONArray4);
        }
        if (jSONArray5.length() > 0) {
            jSONObject.put("terminate", jSONArray5);
        }
        interfaceC2190561AoI.LIZ("fillEventToPackJson", new AwS88S0500000_34(jSONArray, jSONArray2, jSONArray3, jSONArray4, jSONArray5, 1));
    }

    public static final void LJII(PriorityCallback priorityCallback, int i, Map<C2191641Aq2, ? extends JSONObject> map) {
        for (C2191641Aq2 c2191641Aq2 : map.keySet()) {
            priorityCallback.monitorLatency(i, c2191641Aq2.LIZLLL.getType(), (int) ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - c2191641Aq2.LIZJ));
        }
    }

    public static final void LJIIIZ(PriorityCallback priorityCallback, String str, Map<C2191641Aq2, ? extends JSONObject> map, EnumC2191941AqW enumC2191941AqW, int i) {
        if (!priorityCallback.isStageEnabled()) {
            return;
        }
        for (Map.Entry<C2191641Aq2, ? extends JSONObject> entry : map.entrySet()) {
            C2191641Aq2 key = entry.getKey();
            LJIIIIZZ(priorityCallback, str, key.LIZLLL.getType(), entry.getValue(), enumC2191941AqW, i);
        }
    }

    public static final void LJIIIIZZ(PriorityCallback priorityCallback, String str, int i, JSONObject jSONObject, EnumC2191941AqW enumC2191941AqW, int i2) {
        String strOptString;
        if (!priorityCallback.isStageEnabled() || jSONObject.optInt("event_stained") <= 0) {
            return;
        }
        String strName = enumC2191941AqW.name();
        EnumC2191921AqU.Companion.getClass();
        EnumC2191921AqU enumC2191921AqULIZ = C2191891AqR.LIZ(i);
        int i3 = C2191911AqT.LIZ[enumC2191921AqULIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    strOptString = enumC2191921AqULIZ.getAlias();
                } else {
                    strOptString = jSONObject.optString("log_type");
                }
            } else {
                strOptString = jSONObject.optString("tag");
            }
        } else {
            strOptString = jSONObject.optString("event");
        }
        priorityCallback.monitorStage(str, strName, i2, i, strOptString, jSONObject.optString("monitor_id"), jSONObject.optLong("local_time_ms", System.currentTimeMillis()));
    }
}
