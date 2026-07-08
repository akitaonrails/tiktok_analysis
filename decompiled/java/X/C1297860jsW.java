package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator;
import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.sdui.render.bridge.WritableArray;
import com.bytedance.sdui.render.bridge.WritableMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297860jsW extends HashMap<String, Object> implements ReadableMap, WritableMap {
    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator(this) { // from class: X.0jhn
            public final Iterator<String> LIZ;

            @Override // com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator
            public final boolean hasNextKey() {
                return this.LIZ.hasNext();
            }

            @Override // com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator
            public final String nextKey() {
                return this.LIZ.next();
            }

            {
                this.LIZ = this.keySet().iterator();
            }
        };
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        if (size() == 0) {
            return jSONObject;
        }
        for (String str : keySet()) {
            Object obj = get(str);
            try {
                if (getType(str) == ReadableType.Map) {
                    jSONObject.putOpt(str, ((C1297860jsW) obj).toJSONObject());
                } else if (getType(str) == ReadableType.Array) {
                    jSONObject.putOpt(str, ((C1297910jsb) obj).toJSONArray());
                } else if (getType(str) == ReadableType.Null) {
                    jSONObject.putOpt(str, JSONObject.NULL);
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, com.bytedance.sdui.render.bridge.ReadableMap
    public int size() {
        return super.size();
    }

    public C1297860jsW() {
    }

    public C1297860jsW(Map map) {
        super(map);
    }

    public static C1297860jsW deepClone(ReadableMap readableMap) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (C1297870jsX.LIZ[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    c1297860jsW.putNull(strNextKey);
                    break;
                case 2:
                    c1297860jsW.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    c1297860jsW.putInt(strNextKey, readableMap.getInt(strNextKey));
                    break;
                case 4:
                    c1297860jsW.putLong(strNextKey, readableMap.getLong(strNextKey));
                    break;
                case 5:
                    c1297860jsW.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 6:
                    c1297860jsW.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 7:
                    c1297860jsW.putMap(strNextKey, deepClone(readableMap.getMap(strNextKey)));
                    break;
                case 8:
                    c1297860jsW.putArray(strNextKey, C1297910jsb.deepClone(readableMap.getArray(strNextKey)));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c1297860jsW.putByteArray(strNextKey, (byte[]) readableMap.getByteArray(strNextKey).clone());
                    break;
            }
        }
        return c1297860jsW;
    }

    public static C1297860jsW from(Map map) {
        return new C1297860jsW(map);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public C1297910jsb getArray(String str) {
        Object obj = get(str);
        if (obj instanceof C1297910jsb) {
            return (C1297910jsb) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(C1297910jsb.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.equalsIgnoreCase("true") && !str2.equalsIgnoreCase("yes")) {
                return false;
            }
            return true;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key: ");
            sbLIZ.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(obj.getClass().getName());
        sbLIZ2.append(" cannot be cast to java.lang.Boolean, key: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", value: ");
        sbLIZ2.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public byte[] getByteArray(String str) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(byte[].class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to double, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Number, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public InterfaceC1314540kJQ getDynamic(String str) {
        C1297890jsZ c1297890jsZLIZIZ = C1297890jsZ.LIZJ.LIZIZ();
        if (c1297890jsZLIZIZ == null) {
            c1297890jsZLIZIZ = new C1297890jsZ();
        }
        c1297890jsZLIZIZ.LIZ = this;
        c1297890jsZLIZIZ.LIZIZ = str;
        return c1297890jsZLIZIZ;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to int, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Number, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("String cannot be cast to long int, key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(obj);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key: ");
            sbLIZ2.append(str);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(obj.getClass().getName());
        sbLIZ3.append(" cannot be cast to java.lang.Long, key: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", value: ");
        sbLIZ3.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public ReadableMap getMap(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to ");
        sbLIZ.append(ReadableMap.class.getName());
        sbLIZ.append(", key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append(" cannot be cast to java.lang.String, key: ");
        sbLIZ.append(str);
        sbLIZ.append(", value: ");
        sbLIZ.append(obj);
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public ReadableType getType(String str) {
        Object obj = get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if (!(obj instanceof Number) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return ReadableType.String;
            }
            if (obj instanceof Boolean) {
                return ReadableType.Boolean;
            }
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            if (obj instanceof ReadableArray) {
                return ReadableType.Array;
            }
            if (obj instanceof byte[]) {
                return ReadableType.ByteArray;
            }
            if (obj instanceof InterfaceC1314540kJQ) {
                return ((InterfaceC1314540kJQ) obj).getType();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid value ");
            sbLIZ.append(obj.toString());
            sbLIZ.append(" for key ");
            sbLIZ.append(str);
            sbLIZ.append("contained in JavaOnlyMap");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return ReadableType.Number;
    }

    public int getTypeIndex(String str) {
        return getType(str).ordinal();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((C1297860jsW) readableMap);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("yes")) {
                return true;
            }
            if (str2.equalsIgnoreCase("false") || str2.equalsIgnoreCase("no")) {
                return false;
            }
        }
        return z;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return d;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return str2;
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }
}
