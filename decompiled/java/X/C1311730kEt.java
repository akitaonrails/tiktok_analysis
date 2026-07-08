package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: renamed from: X.0kEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311730kEt {
    public final ReadableMap LIZ;
    public final InterfaceC1312870kGj LIZIZ;

    public final boolean LJIIIZ() {
        ReadableMap readableMap = this.LIZ;
        if (readableMap != null && readableMap.size() != 0) {
            return false;
        }
        InterfaceC1312870kGj interfaceC1312870kGj = this.LIZIZ;
        return interfaceC1312870kGj == null || interfaceC1312870kGj.count() == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ ");
        sbLIZ.append(C1311730kEt.class.getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZ.toString());
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1311730kEt(ReadableMap readableMap) {
        this.LIZ = readableMap;
    }

    public final ReadableArray LIZ(String str) {
        return this.LIZ.getArray(str);
    }

    public final InterfaceC1298070jsr LIZLLL(String str) {
        return this.LIZ.getDynamic(str);
    }

    public final ReadableMap LJI(String str) {
        return this.LIZ.getMap(str);
    }

    public final String LJII(String str) {
        return this.LIZ.getString(str);
    }

    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.hasKey(str);
    }

    public final boolean LJIIJ(String str) {
        return this.LIZ.isNull(str);
    }

    public C1311730kEt(ReadableMap readableMap, InterfaceC1312870kGj interfaceC1312870kGj) {
        this.LIZ = readableMap;
        this.LIZIZ = interfaceC1312870kGj;
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
