package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Map;

/* JADX INFO: renamed from: X.0kXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323450kXn implements InterfaceC1107590evd {
    public final ReadableMap LIZ;

    @Override // X.InterfaceC1107590evd
    public final Map<String, Object> LIZ() {
        return this.LIZ.toHashMap();
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1107470evR LIZIZ() {
        final ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.LIZ.keySetIterator();
        return new InterfaceC1107470evR(readableMapKeySetIteratorKeySetIterator) { // from class: X.0kXp
            public final ReadableMapKeySetIterator LIZ;

            @Override // X.InterfaceC1107470evR
            public final boolean hasNextKey() {
                return this.LIZ.hasNextKey();
            }

            @Override // X.InterfaceC1107470evR
            public final String nextKey() {
                return this.LIZ.nextKey();
            }

            {
                this.LIZ = readableMapKeySetIteratorKeySetIterator;
            }
        };
    }

    public C1323450kXn(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1871820yoG get(String str) {
        return new C1323460kXo(this.LIZ.getDynamic(str));
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1871920yoQ getArray(String str) {
        ReadableArray array = this.LIZ.getArray(str);
        if (array == null) {
            return null;
        }
        return new C1323440kXm(array);
    }

    @Override // X.InterfaceC1107590evd
    public final boolean getBoolean(String str) {
        return this.LIZ.getBoolean(str);
    }

    @Override // X.InterfaceC1107590evd
    public final double getDouble(String str) {
        return this.LIZ.getDouble(str);
    }

    @Override // X.InterfaceC1107590evd
    public final int getInt(String str) {
        return this.LIZ.getInt(str);
    }

    @Override // X.InterfaceC1107590evd
    public final long getLong(String str) {
        return this.LIZ.getLong(str);
    }

    @Override // X.InterfaceC1107590evd
    public final InterfaceC1107590evd getMap(String str) {
        ReadableMap map = this.LIZ.getMap(str);
        if (map == null) {
            return null;
        }
        return new C1323450kXn(map);
    }

    @Override // X.InterfaceC1107590evd
    public final String getString(String str) {
        return this.LIZ.getString(str);
    }

    @Override // X.InterfaceC1107590evd
    public final EnumC1323480kXq getType(String str) {
        ReadableType type = this.LIZ.getType(str);
        if (type != null) {
            switch (C1297750jsL.LIZ[type.ordinal()]) {
            }
            return EnumC1323480kXq.Null;
        }
        return EnumC1323480kXq.Null;
    }

    @Override // X.InterfaceC1107590evd
    public final boolean hasKey(String str) {
        return this.LIZ.hasKey(str);
    }

    @Override // X.InterfaceC1107590evd
    public final boolean isNull(String str) {
        return this.LIZ.isNull(str);
    }
}
