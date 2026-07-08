package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530500KrI {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C530500KrI)) {
            return false;
        }
        C530500KrI c530500KrI = (C530500KrI) obj;
        return Intrinsics.LJFF(this.LIZ, c530500KrI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c530500KrI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeckoResourceKey(channel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fileRelativePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C530500KrI(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
