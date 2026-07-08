package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWO {
    public final String LIZ;
    public final EnumC442280HVy LIZIZ;

    public final boolean LIZ() {
        return this.LIZIZ == EnumC442280HVy.GRANTED;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LIZ);
        sbLIZ.append(':');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C0HWO.class, cls)) {
            return false;
        }
        C0HWO c0hwo = (C0HWO) obj;
        if (Intrinsics.LJFF(this.LIZ, c0hwo.LIZ) && this.LIZIZ == c0hwo.LIZIZ) {
            return true;
        }
        return false;
    }

    public C0HWO(String str, EnumC442280HVy enumC442280HVy) {
        this.LIZ = str;
        this.LIZIZ = enumC442280HVy;
    }
}
