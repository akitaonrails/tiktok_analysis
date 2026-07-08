package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* JADX INFO: renamed from: X.0kXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323460kXo implements InterfaceC1871820yoG {
    public final InterfaceC1298070jsr LIZ;

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1871920yoQ asArray() {
        ReadableArray readableArrayAsArray = this.LIZ.asArray();
        if (readableArrayAsArray == null) {
            return null;
        }
        return new C1323440kXm(readableArrayAsArray);
    }

    @Override // X.InterfaceC1871820yoG
    public final boolean asBoolean() {
        return this.LIZ.asBoolean();
    }

    @Override // X.InterfaceC1871820yoG
    public final double asDouble() {
        return this.LIZ.asDouble();
    }

    @Override // X.InterfaceC1871820yoG
    public final int asInt() {
        return this.LIZ.asInt();
    }

    @Override // X.InterfaceC1871820yoG
    public final InterfaceC1107590evd asMap() {
        ReadableMap readableMapAsMap = this.LIZ.asMap();
        if (readableMapAsMap == null) {
            return null;
        }
        return new C1323450kXn(readableMapAsMap);
    }

    @Override // X.InterfaceC1871820yoG
    public final String asString() {
        return this.LIZ.asString();
    }

    @Override // X.InterfaceC1871820yoG
    public final EnumC1323480kXq getType() {
        ReadableType type = this.LIZ.getType();
        if (type != null) {
            switch (C1297730jsJ.LIZ[type.ordinal()]) {
            }
            return EnumC1323480kXq.Null;
        }
        return EnumC1323480kXq.Null;
    }

    public C1323460kXo(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LIZ = interfaceC1298070jsr;
    }
}
