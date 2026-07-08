package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246870iYH {
    public final String LIZ;
    public final EnumC1392960mLu LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1246870iYH)) {
            return false;
        }
        C1246870iYH c1246870iYH = (C1246870iYH) obj;
        return Intrinsics.LJFF(this.LIZ, c1246870iYH.LIZ) && this.LIZIZ == c1246870iYH.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingFeedback(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", muteType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1246870iYH(String str, EnumC1392960mLu enumC1392960mLu) {
        this.LIZ = str;
        this.LIZIZ = enumC1392960mLu;
    }
}
