package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237910iJp {
    public final String LIZ;
    public final EnumC852660Xce LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1237910iJp)) {
            return false;
        }
        C1237910iJp c1237910iJp = (C1237910iJp) obj;
        return Intrinsics.LJFF(this.LIZ, c1237910iJp.LIZ) && this.LIZIZ == c1237910iJp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1237910iJp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickSendCodeActionParams(phoneNumber=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1237910iJp(String str, EnumC852660Xce enumC852660Xce, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC852660Xce;
        this.LIZJ = str2;
    }
}
