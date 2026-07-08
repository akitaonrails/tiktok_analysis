package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01h3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C400301h3 extends AbstractC399701gx {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C400301h3)) {
            return false;
        }
        C400301h3 c400301h3 = (C400301h3) obj;
        return Intrinsics.LJFF(this.LIZ, c400301h3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c400301h3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchAIBeautyResp(imageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", beautyParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C400301h3(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
