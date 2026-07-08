package X;

import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.sdui.render.bridge.WritableArray;
import com.bytedance.sdui.render.bridge.WritableMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0jsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297910jsb extends ArrayList<Object> implements ReadableArray, WritableArray, InterfaceC1297930jsd {
    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushNull() {
        add(null);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this);
    }

    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = get(i);
            try {
                if (getType(i) == ReadableType.Map) {
                    jSONArray.put(((C1297860jsW) obj).toJSONObject());
                } else if (getType(i) == ReadableType.Array) {
                    jSONArray.put(((C1297910jsb) obj).toJSONArray());
                } else {
                    jSONArray.put(obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONArray;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List, com.bytedance.sdui.render.bridge.ReadableArray
    public int size() {
        return super.size();
    }

    public C1297910jsb() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
    }

    public C1297910jsb(List list) {
        super(list);
    }

    public static C1297910jsb deepClone(ReadableArray readableArray) {
        C1297910jsb c1297910jsb = new C1297910jsb();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C1297880jsY.LIZ[readableArray.getType(i).ordinal()]) {
                case 1:
                    c1297910jsb.pushNull();
                    break;
                case 2:
                    c1297910jsb.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    c1297910jsb.pushInt(readableArray.getInt(i));
                    break;
                case 4:
                    c1297910jsb.pushLong(readableArray.getLong(i));
                    break;
                case 5:
                    c1297910jsb.pushDouble(readableArray.getDouble(i));
                    break;
                case 6:
                    c1297910jsb.pushString(readableArray.getString(i));
                    break;
                case 7:
                    c1297910jsb.pushMap(C1297860jsW.deepClone(readableArray.getMap(i)));
                    break;
                case 8:
                    c1297910jsb.pushArray(deepClone(readableArray.getArray(i)));
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c1297910jsb.pushByteArray((byte[]) readableArray.getByteArray(i).clone());
                    break;
            }
        }
        return c1297910jsb;
    }

    public static C1297910jsb from(List list) {
        return new C1297910jsb(list);
    }

    public static C1297910jsb of(Object... objArr) {
        return new C1297910jsb(Arrays.asList(objArr));
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public C1297910jsb getArray(int i) {
        return (C1297910jsb) get(i);
    }

    public Object getAt(int i) {
        return get(i);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) get(i)).booleanValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public byte getByte(int i) {
        return ((Number) get(i)).byteValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public byte[] getByteArray(int i) {
        return (byte[]) get(i);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public char getChar(int i) {
        return (char) ((Number) get(i)).shortValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Number) get(i)).doubleValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public InterfaceC1314540kJQ getDynamic(int i) {
        C1297920jsc c1297920jscLIZIZ = C1297920jsc.LIZJ.LIZIZ();
        if (c1297920jscLIZIZ == null) {
            c1297920jscLIZIZ = new C1297920jsc();
        }
        c1297920jscLIZIZ.LIZ = this;
        c1297920jscLIZIZ.LIZIZ = i;
        return c1297920jscLIZIZ;
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public int getInt(int i) {
        return ((Number) get(i)).intValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public long getLong(int i) {
        return ((Number) get(i)).longValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public C1297860jsW getMap(int i) {
        return (C1297860jsW) get(i);
    }

    public Object getObject(int i) {
        return get(i);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public short getShort(int i) {
        return ((Number) get(i)).shortValue();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public String getString(int i) {
        return (String) get(i);
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public ReadableType getType(int i) {
        Object obj = get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
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
            if (obj instanceof ReadableArray) {
                return ReadableType.Array;
            }
            if (obj instanceof ReadableMap) {
                return ReadableType.Map;
            }
            if (obj instanceof byte[]) {
                return ReadableType.ByteArray;
            }
            return null;
        }
        return ReadableType.Number;
    }

    public int getTypeIndex(int i) {
        return getType(i).ordinal();
    }

    @Override // com.bytedance.sdui.render.bridge.ReadableArray
    public boolean isNull(int i) {
        if (get(i) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushArray(WritableArray writableArray) {
        add(writableArray);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushBoolean(boolean z) {
        add(Boolean.valueOf(z));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushByteArray(byte[] bArr) {
        add(bArr);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushDouble(double d) {
        add(Double.valueOf(d));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushInt(int i) {
        add(Integer.valueOf(i));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushLong(long j) {
        add(Long.valueOf(j));
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushMap(WritableMap writableMap) {
        add(writableMap);
    }

    @Override // com.bytedance.sdui.render.bridge.WritableArray
    public void pushString(String str) {
        add(str);
    }
}
