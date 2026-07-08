package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186440gyo implements InterfaceC1186470gyr {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186440gyo)) {
            return false;
        }
        C1186440gyo c1186440gyo = (C1186440gyo) obj;
        return Intrinsics.LJFF(this.LIZ, c1186440gyo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1186440gyo.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataParseResultTrackAction(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186440gyo(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
