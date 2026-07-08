package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xe7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853570Xe7 implements InterfaceC853610XeB {
    public final String LIZ;
    public final EnumC852660Xce LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C853570Xe7)) {
            return false;
        }
        C853570Xe7 c853570Xe7 = (C853570Xe7) obj;
        return Intrinsics.LJFF(this.LIZ, c853570Xe7.LIZ) && this.LIZIZ == c853570Xe7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c853570Xe7.LIZJ);
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

    public C853570Xe7(String str, EnumC852660Xce enumC852660Xce, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC852660Xce;
        this.LIZJ = str2;
    }
}
