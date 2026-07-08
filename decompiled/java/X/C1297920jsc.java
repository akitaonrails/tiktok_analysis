package X;

import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableType;

/* JADX INFO: renamed from: X.0jsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297920jsc implements InterfaceC1314540kJQ {
    public static final C1085650eMF<C1297920jsc> LIZJ = new C1085650eMF<>(10);
    public ReadableArray LIZ;
    public int LIZIZ = -1;

    @Override // X.InterfaceC1314540kJQ
    public final boolean asBoolean() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getBoolean(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // X.InterfaceC1314540kJQ
    public final int asInt() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getInt(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // X.InterfaceC1314540kJQ
    public final String asString() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getString(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // X.InterfaceC1314540kJQ
    public final ReadableType getType() {
        ReadableArray readableArray = this.LIZ;
        if (readableArray != null) {
            return readableArray.getType(this.LIZIZ);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
