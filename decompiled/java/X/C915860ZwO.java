package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915860ZwO {
    public boolean LIZ = true;
    public String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C915860ZwO)) {
            return false;
        }
        C915860ZwO c915860ZwO = (C915860ZwO) obj;
        return this.LIZ == c915860ZwO.LIZ && Intrinsics.LJFF(this.LIZIZ, c915860ZwO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c915860ZwO.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreParseData(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C915860ZwO(String str, String str2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
