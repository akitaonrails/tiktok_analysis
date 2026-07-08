package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0koz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334110koz {
    public final Map<String, Long> LIZ;
    public final JSONObject LIZIZ;
    public List<C1334130kp1> LIZJ;
    public Map<String, C1334130kp1> LIZLLL;
    public final List<String> LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public final Long LIZ() {
        return (Long) this.LJFF.getValue();
    }

    public final Pair<Long, String> LIZIZ() {
        C1334130kp1 c1334130kp1 = this.LIZLLL.get("DecodeProducer");
        if (c1334130kp1 == null) {
            return new Pair<>(null, null);
        }
        Long l = c1334130kp1.LIZIZ;
        if (l == null) {
            return new Pair<>(null, "DecodeProducer");
        }
        long jLongValue = l.longValue();
        Iterator<C1334130kp1> it2 = this.LIZJ.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!Intrinsics.LJFF(it2.next().LIZ, "DecodeProducer")) {
                i++;
            } else if (i != -1) {
                for (int i2 = i - 1; -1 < i2; i2--) {
                    C1334130kp1 c1334130kp12 = (C1334130kp1) ListProtector.get(this.LIZJ, i2);
                    Long l2 = c1334130kp12.LIZJ;
                    if (l2 != null) {
                        return new Pair<>(Long.valueOf(jLongValue - l2.longValue()), c1334130kp12.LIZ);
                    }
                }
                return new Pair<>(null, null);
            }
        }
        return new Pair<>(null, null);
    }

    public final Long LIZJ() {
        return (Long) this.LJI.getValue();
    }

    public final Long LIZLLL() {
        return (Long) this.LJIIIIZZ.getValue();
    }

    public final Long LJ() {
        return (Long) this.LJII.getValue();
    }

    public final Long LJFF(String str) {
        Long l;
        C1334130kp1 c1334130kp1 = this.LIZLLL.get(str);
        if (c1334130kp1 != null && c1334130kp1.LIZIZ != null && (l = c1334130kp1.LIZJ) != null) {
            return Long.valueOf(l.longValue() - c1334130kp1.LIZIZ.longValue());
        }
        return null;
    }

    public C1334110koz(JSONObject jSONObject, Map<String, Long> map) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        boolean z;
        this.LIZ = map;
        if (jSONObject != null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("image_monitor_data");
        } else {
            jSONObjectOptJSONObject = null;
        }
        this.LIZIZ = jSONObjectOptJSONObject;
        this.LIZJ = C13BV.INSTANCE;
        this.LIZLLL = C2097608Jq.LJ();
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("BitmapMemoryCacheGetProducer", "BackgroundThreadHandoffProducer", "BitmapMemoryCacheProducer", "EncodedMemoryCacheProducer", "DiskCacheProducer", "NetworkFetchProducer", "DiskCacheWriteProducer", "DecodeProducer");
        this.LJ = listLJIIJJI;
        if (jSONObjectOptJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : listLJIIJJI) {
                if (jSONObjectOptJSONObject.has(str) && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                    if (jSONObjectOptJSONObject2.has("producer_start") && !jSONObjectOptJSONObject2.isNull("producer_start")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = jSONObjectOptJSONObject2.has("producer_end") && !jSONObjectOptJSONObject2.isNull("producer_end");
                    if (z || z2) {
                        C1334130kp1 c1334130kp1 = new C1334130kp1(str, LJI("producer_start", jSONObjectOptJSONObject2), LJI("producer_end", jSONObjectOptJSONObject2));
                        arrayList.add(c1334130kp1);
                        linkedHashMap.put(str, c1334130kp1);
                    }
                }
            }
            this.LIZJ = arrayList;
            this.LIZLLL = linkedHashMap;
        }
        this.LJFF = C452501pT.LIZIZ(new AwS564S0100000_20(this, 57));
        this.LJI = C452501pT.LIZIZ(new AwS564S0100000_20(this, 58));
        this.LJII = C452501pT.LIZIZ(new AwS564S0100000_20(this, 60));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 59));
    }

    public static Long LJI(String str, JSONObject jSONObject) {
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return C2095008Iq.LJIILIIL((String) obj);
        }
        return null;
    }
}
