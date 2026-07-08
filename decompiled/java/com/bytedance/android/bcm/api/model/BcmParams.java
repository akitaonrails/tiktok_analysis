package com.bytedance.android.bcm.api.model;

import X.C051S;
import X.C212367188v;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class BcmParams implements Serializable {
    public static final C212367188v Companion = new C212367188v();
    public final Map<String, Object> map = new LinkedHashMap();

    public static final BcmParams fromJSON(String str) {
        Companion.getClass();
        return C212367188v.LIZ(str);
    }

    public static final BcmParams fromJSON(JSONObject jSONObject) {
        Companion.getClass();
        return C212367188v.LIZIZ(jSONObject);
    }

    public static final BcmParams fromMap(Map<String, ? extends Object> map) {
        Companion.getClass();
        return C212367188v.LIZJ(map);
    }

    public final boolean optBoolean(String str) {
        return optBoolean$default(this, str, false, 2, null);
    }

    public final double optDouble(String str) {
        return optDouble$default(this, str, 0.0d, 2, null);
    }

    public final int optInt(String str) {
        return optInt$default(this, str, 0, 2, null);
    }

    public final long optLong(String str) {
        return optLong$default(this, str, 0L, 2, null);
    }

    public final String optString(String str) {
        return optString$default(this, str, null, 2, null);
    }

    public final BcmParams copy() {
        BcmParams bcmParams = new BcmParams();
        bcmParams.map.putAll(this.map);
        return bcmParams;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final JSONObject toJSONObject() {
        return C051S.LIZ(this.map);
    }

    public final String toJSON() {
        return C786410Ut5.J3(toJSONObject());
    }

    public String toString() {
        return toJSON();
    }

    public final Map<String, Object> toMap() {
        return this.map;
    }

    public final BcmParams merge(Map<String, ? extends Object> map) {
        if (map == null) {
            return this;
        }
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this;
    }

    public final Object opt(String str) {
        return this.map.get(str);
    }

    public final BcmParams put(Pair<String, ? extends Object>... pairArr) {
        for (Pair<String, ? extends Object> pair : pairArr) {
            put(pair.getFirst(), pair.getSecond());
        }
        return this;
    }

    public final BcmParams remove(String str) {
        this.map.remove(str);
        return this;
    }

    public final BcmParams reset(BcmParams bcmParams) {
        this.map.clear();
        if (bcmParams != null) {
            this.map.putAll(bcmParams.toMap());
        }
        return this;
    }

    public final BcmParams merge(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this;
    }

    public final BcmParams merge(Pair<String, ? extends Object>... pairArr) {
        try {
            for (Pair<String, ? extends Object> pair : pairArr) {
                put(pair.getFirst(), pair.getSecond());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this;
    }

    public final BcmParams merge(String str) {
        if (str != null && str.length() > 0) {
            try {
                merge(new JSONObject(str));
                return this;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this;
    }

    public final BcmParams merge(BcmParams bcmParams) {
        if (bcmParams != null) {
            merge(bcmParams.map);
        }
        return this;
    }

    public final boolean optBoolean(String str, boolean z) {
        Boolean bool;
        Object obj = this.map.get(str);
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            if (!(obj instanceof String)) {
                return z;
            }
            String str2 = (String) obj;
            if (u.LJIJI("true", str2, true)) {
                bool = Boolean.TRUE;
            } else {
                if (!u.LJIJI("false", str2, true)) {
                    return z;
                }
                bool = Boolean.FALSE;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public final double optDouble(String str, double d) {
        Double dValueOf;
        Object obj = this.map.get(str);
        if (obj instanceof Double) {
            dValueOf = (Double) obj;
        } else if (obj instanceof Number) {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
        } else {
            if (!(obj instanceof String)) {
                return d;
            }
            try {
                dValueOf = Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return d;
            }
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return d;
    }

    public final int optInt(String str, int i) {
        Integer numValueOf;
        Object obj = this.map.get(str);
        if (obj instanceof Integer) {
            numValueOf = (Integer) obj;
        } else if (obj instanceof Number) {
            numValueOf = Integer.valueOf(((Number) obj).intValue());
        } else {
            if (!(obj instanceof String)) {
                return i;
            }
            try {
                numValueOf = 0;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return i;
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return i;
    }

    public final long optLong(String str, long j) {
        Long lValueOf;
        Object obj = this.map.get(str);
        if (obj instanceof Long) {
            lValueOf = (Long) obj;
        } else if (obj instanceof Number) {
            lValueOf = Long.valueOf(((Number) obj).longValue());
        } else {
            if (!(obj instanceof String)) {
                return j;
            }
            try {
                lValueOf = 0L;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return j;
            }
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return j;
    }

    public final String optString(String str, String str2) {
        String string;
        Object obj = this.map.get(str);
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            if (obj != null) {
                string = obj.toString();
            }
            return str2;
        }
        if (string != null) {
            return string;
        }
        return str2;
    }

    @InterfaceC1294060jmO
    public final BcmParams put(String str, Object obj) {
        if (obj != null) {
            if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
                if (obj instanceof JSONObject) {
                    this.map.put(str, obj);
                } else {
                    if (obj instanceof JSONArray) {
                        this.map.put(str, obj);
                        return this;
                    }
                    this.map.put(str, JSONObject.wrap(obj));
                    return this;
                }
            } else {
                this.map.put(str, obj.toString());
                return this;
            }
        }
        return this;
    }

    public final BcmParams putIfNull(String str, Object obj) {
        if (this.map.get(str) == null) {
            put(str, obj);
        }
        return this;
    }

    public final BcmParams putOrRemove(String str, Object obj) {
        if (obj == null) {
            remove(str);
            return this;
        }
        put(str, obj);
        return this;
    }

    public final BcmParams put(String str, double d) {
        this.map.put(str, Double.valueOf(d));
        return this;
    }

    public final BcmParams put(String str, float f) {
        this.map.put(str, Float.valueOf(f));
        return this;
    }

    public final BcmParams put(String str, int i) {
        this.map.put(str, Integer.valueOf(i));
        return this;
    }

    public final BcmParams put(String str, long j) {
        this.map.put(str, Long.valueOf(j));
        return this;
    }

    public final BcmParams put(String str, String str2) {
        if (str2 != null) {
            this.map.put(str, str2);
        }
        return this;
    }

    public static /* synthetic */ boolean optBoolean$default(BcmParams bcmParams, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return bcmParams.optBoolean(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optBoolean");
    }

    public static /* synthetic */ double optDouble$default(BcmParams bcmParams, String str, double d, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                d = Double.NaN;
            }
            return bcmParams.optDouble(str, d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optDouble");
    }

    public static /* synthetic */ int optInt$default(BcmParams bcmParams, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return bcmParams.optInt(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optInt");
    }

    public static /* synthetic */ long optLong$default(BcmParams bcmParams, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            return bcmParams.optLong(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optLong");
    }

    public static /* synthetic */ String optString$default(BcmParams bcmParams, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return bcmParams.optString(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optString");
    }
}
