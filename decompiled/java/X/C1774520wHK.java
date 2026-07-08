package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wHK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774520wHK {
    public final float LIZ;
    public final float LIZIZ;
    public final Integer LIZJ;

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31;
        Integer num = this.LIZJ;
        return iFloatToIntBits + (num != null ? num.intValue() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1774520wHK) {
            C1774520wHK c1774520wHK = (C1774520wHK) obj;
            if (this.LIZ == c1774520wHK.LIZ && this.LIZIZ == c1774520wHK.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1774520wHK.LIZJ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C1774520wHK(float f, float f2, Integer num) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = num;
    }
}
