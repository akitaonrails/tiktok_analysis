package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;

/* JADX INFO: renamed from: X.0kGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312890kGl implements InterfaceC1298070jsr {
    public final C1312880kGk LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC1298070jsr
    public final ReadableArray asArray() {
        return this.LIZ.getArray(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final boolean asBoolean() {
        return this.LIZ.getBoolean(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final double asDouble() {
        return this.LIZ.getDouble(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final int asInt() {
        return this.LIZ.getInt(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final long asLong() {
        return this.LIZ.getLong(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final ReadableMap asMap() {
        this.LIZ.getClass();
        return null;
    }

    @Override // X.InterfaceC1298070jsr
    public final String asString() {
        return this.LIZ.getString(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final ReadableType getType() {
        return this.LIZ.getType(this.LIZIZ);
    }

    @Override // X.InterfaceC1298070jsr
    public final boolean isNull() {
        this.LIZ.getClass();
        return false;
    }

    public C1312890kGl(C1312880kGk c1312880kGk, int i) {
        this.LIZ = c1312880kGk;
        this.LIZIZ = i;
    }
}
