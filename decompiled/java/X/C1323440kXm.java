package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import java.util.List;

/* JADX INFO: renamed from: X.0kXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323440kXm implements InterfaceC1871920yoQ {
    public final ReadableArray LIZ;

    @Override // X.InterfaceC1871920yoQ
    public final int size() {
        return this.LIZ.size();
    }

    @Override // X.InterfaceC1871920yoQ
    public final List<Object> toList() {
        return this.LIZ.toArrayList();
    }

    public C1323440kXm(ReadableArray readableArray) {
        this.LIZ = readableArray;
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1871820yoG get(int i) {
        return new C1323460kXo(this.LIZ.getDynamic(i));
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1871920yoQ getArray(int i) {
        ReadableArray array = this.LIZ.getArray(i);
        if (array == null) {
            return null;
        }
        return new C1323440kXm(array);
    }

    @Override // X.InterfaceC1871920yoQ
    public final boolean getBoolean(int i) {
        return this.LIZ.getBoolean(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final double getDouble(int i) {
        return this.LIZ.getDouble(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final int getInt(int i) {
        return this.LIZ.getInt(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final InterfaceC1107590evd getMap(int i) {
        ReadableMap map = this.LIZ.getMap(i);
        if (map == null) {
            return null;
        }
        return new C1323450kXn(map);
    }

    @Override // X.InterfaceC1871920yoQ
    public final String getString(int i) {
        return this.LIZ.getString(i);
    }

    @Override // X.InterfaceC1871920yoQ
    public final EnumC1323480kXq getType(int i) {
        ReadableType type = this.LIZ.getType(i);
        if (type != null) {
            switch (C1297740jsK.LIZ[type.ordinal()]) {
            }
            return EnumC1323480kXq.Null;
        }
        return EnumC1323480kXq.Null;
    }

    @Override // X.InterfaceC1871920yoQ
    public final boolean isNull(int i) {
        return this.LIZ.isNull(i);
    }
}
