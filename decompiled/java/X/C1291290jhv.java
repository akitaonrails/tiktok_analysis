package X;

import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;

/* JADX INFO: renamed from: X.0jhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291290jhv {
    public final ReadableMap LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ ");
        sbLIZ.append(C1291290jhv.class.getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZ.toString());
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1291290jhv(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    public final ReadableArray LIZ(String str) {
        return this.LIZ.getArray(str);
    }

    public final InterfaceC1314540kJQ LIZLLL(String str) {
        return this.LIZ.getDynamic(str);
    }

    public final String LJI(String str) {
        return this.LIZ.getString(str);
    }

    public final boolean LJII(String str) {
        return this.LIZ.hasKey(str);
    }

    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.isNull(str);
    }

    public final boolean LIZIZ(String str, boolean z) {
        if (!this.LIZ.isNull(str)) {
            return this.LIZ.getBoolean(str);
        }
        return z;
    }

    public final double LIZJ(String str, double d) {
        if (!this.LIZ.isNull(str)) {
            return this.LIZ.getDouble(str);
        }
        return d;
    }

    public final float LJ(String str, float f) {
        if (!this.LIZ.isNull(str)) {
            return (float) this.LIZ.getDouble(str);
        }
        return f;
    }

    public final int LJFF(String str, int i) {
        if (!this.LIZ.isNull(str)) {
            return this.LIZ.getInt(str);
        }
        return i;
    }
}
