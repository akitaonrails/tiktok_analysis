package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237190iIf implements InterfaceC1237210iIh {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC1237100iIW LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1237190iIf)) {
            return false;
        }
        C1237190iIf c1237190iIf = (C1237190iIf) obj;
        return Intrinsics.LJFF(this.LIZ, c1237190iIf.LIZ) && this.LIZIZ == c1237190iIf.LIZIZ && this.LIZJ == c1237190iIf.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyPhoneCodeActionParamsV1(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPastedUsingToolTip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inputType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1237190iIf(String str, boolean z, EnumC1237100iIW enumC1237100iIW) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = enumC1237100iIW;
    }
}
