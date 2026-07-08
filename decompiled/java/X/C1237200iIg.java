package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237200iIg implements InterfaceC1237210iIh {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1237200iIg) && Intrinsics.LJFF(this.LIZ, ((C1237200iIg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickResendPhoneCodeActionParamsV1(phone=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1237200iIg(String str) {
        this.LIZ = str;
    }
}
