package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNB implements InterfaceC898720ZNm {
    public final String LIZ;
    public final int LIZIZ = 2131832288;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZNB)) {
            return false;
        }
        C0ZNB c0znb = (C0ZNB) obj;
        return Intrinsics.LJFF(this.LIZ, c0znb.LIZ) && this.LIZIZ == c0znb.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMVoiceMessageCannotReceive(serverProvidedTip=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stringRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZNB(String str) {
        this.LIZ = str;
    }
}
