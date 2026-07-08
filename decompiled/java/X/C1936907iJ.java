package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07iJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1936907iJ implements InterfaceC1277930jMN {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1936907iJ) && Intrinsics.LJFF(this.LIZ, ((C1936907iJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalPushStreamData(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1277930jMN
    public final boolean isValid() {
        return this.LIZ.length() > 0;
    }

    public C1936907iJ(String str) {
        this.LIZ = str;
    }
}
