package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C878403by {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878403by)) {
            return false;
        }
        C878403by c878403by = (C878403by) obj;
        return Intrinsics.LJFF(this.LIZ, c878403by.LIZ) && Intrinsics.LJFF(this.LIZIZ, c878403by.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c878403by.LIZJ) && this.LIZLLL == c878403by.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneInputResult(phoneE164=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", countryCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", phoneNumber=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", saveEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C878403by(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
