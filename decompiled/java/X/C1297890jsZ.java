package X;

import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableType;

/* JADX INFO: renamed from: X.0jsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297890jsZ implements InterfaceC1314540kJQ {
    public static final C1085650eMF<C1297890jsZ> LIZJ = new C1085650eMF<>(10);
    public ReadableMap LIZ;
    public String LIZIZ;

    @Override // X.InterfaceC1314540kJQ
    public final boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap == null || (str = this.LIZIZ) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getBoolean(str);
    }

    @Override // X.InterfaceC1314540kJQ
    public final int asInt() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap == null || (str = this.LIZIZ) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getInt(str);
    }

    @Override // X.InterfaceC1314540kJQ
    public final String asString() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap == null || (str = this.LIZIZ) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getString(str);
    }

    @Override // X.InterfaceC1314540kJQ
    public final ReadableType getType() {
        String str;
        ReadableMap readableMap = this.LIZ;
        if (readableMap == null || (str = this.LIZIZ) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return readableMap.getType(str);
    }
}
