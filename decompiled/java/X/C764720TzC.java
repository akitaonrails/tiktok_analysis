package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764720TzC extends AbstractC764660Tz6 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764720TzC)) {
            return false;
        }
        C764720TzC c764720TzC = (C764720TzC) obj;
        return Intrinsics.LJFF(this.LIZ, c764720TzC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c764720TzC.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowToast(msg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764720TzC(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
