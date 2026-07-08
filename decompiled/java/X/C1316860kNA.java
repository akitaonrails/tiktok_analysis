package X;

import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316860kNA {
    public final int LIZ;
    public final float LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C1316860kNA(ReadableArray readableArray) {
        this.LIZIZ = (float) readableArray.getDouble(0);
        this.LIZ = readableArray.getInt(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1316860kNA.class != obj.getClass()) {
            return false;
        }
        C1316860kNA c1316860kNA = (C1316860kNA) obj;
        if (this.LIZIZ == c1316860kNA.LIZIZ && this.LIZ == c1316860kNA.LIZ) {
            return true;
        }
        return false;
    }
}
