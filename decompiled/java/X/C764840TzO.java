package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764840TzO extends AbstractC764660Tz6 {
    public final String LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764840TzO)) {
            return false;
        }
        C764840TzO c764840TzO = (C764840TzO) obj;
        return Intrinsics.LJFF(this.LIZ, c764840TzO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c764840TzO.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokeDebugState(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detailObj=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764840TzO(String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
