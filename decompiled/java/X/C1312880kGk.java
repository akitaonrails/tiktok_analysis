package X;

import com.lynx.react.bridge.PiperData;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312880kGk implements ReadableArray {
    public final InterfaceC1312870kGj LL;

    @Override // com.lynx.react.bridge.ReadableArray
    public final ArrayList<Object> asArrayList() {
        return null;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final byte[] getByteArray(int i) {
        return new byte[0];
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final char getChar(int i) {
        return (char) 0;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final ReadableMap getMap(int i) {
        return null;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final PiperData getPiperData(int i) {
        return null;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final boolean isNull(int i) {
        return false;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final ArrayList<Object> toArrayList() {
        return null;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final int size() {
        return this.LL.count();
    }

    public C1312880kGk(InterfaceC1312870kGj interfaceC1312870kGj) {
        this.LL = interfaceC1312870kGj;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final ReadableArray getArray(int i) {
        return new C1312880kGk(this.LL.LJJJZ(i));
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final boolean getBoolean(int i) {
        return this.LL.getBoolean(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final byte getByte(int i) {
        return (byte) getInt(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final double getDouble(int i) {
        return this.LL.getDouble(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final InterfaceC1298070jsr getDynamic(int i) {
        return new C1312890kGl(this, i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final int getInt(int i) {
        return this.LL.getInt(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final long getLong(int i) {
        return this.LL.getLong(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final short getShort(int i) {
        return (short) getInt(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final String getString(int i) {
        return this.LL.getString(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public final ReadableType getType(int i) {
        switch (C1312850kGh.LIZ[this.LL.getType(i).ordinal()]) {
            case 1:
                return ReadableType.String;
            case 2:
                return ReadableType.Number;
            case 3:
                return ReadableType.Array;
            case 4:
                return ReadableType.Null;
            case 5:
                return ReadableType.Long;
            case 6:
                return ReadableType.Int;
            case 7:
                return ReadableType.Boolean;
            default:
                return ReadableType.Null;
        }
    }
}
