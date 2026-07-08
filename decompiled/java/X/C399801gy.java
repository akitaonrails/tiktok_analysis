package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C399801gy extends AbstractC399701gx {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C399801gy)) {
            return false;
        }
        C399801gy c399801gy = (C399801gy) obj;
        return Intrinsics.LJFF(this.LIZ, c399801gy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c399801gy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchEffectList(panel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tab=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C399801gy(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
