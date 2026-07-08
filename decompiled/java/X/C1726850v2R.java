package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726850v2R implements InterfaceC1726640v26 {
    public volatile String LIZ;
    public volatile String LIZIZ;

    @Override // X.InterfaceC1726640v26
    public final String LIZJ() {
        return "jsb";
    }

    @Override // X.InterfaceC1726640v26
    public final String LIZLLL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1726850v2R)) {
            return false;
        }
        C1726850v2R c1726850v2R = (C1726850v2R) obj;
        return Intrinsics.LJFF(this.LIZ, c1726850v2R.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1726850v2R.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + (this.LIZIZ == null ? 0 : this.LIZIZ.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecurityCertContext(host=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fpSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1726640v26
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1726640v26
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public C1726850v2R(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
