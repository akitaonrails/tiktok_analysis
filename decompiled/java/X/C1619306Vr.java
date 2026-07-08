package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619306Vr implements InterfaceC2257971DZj {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1619306Vr)) {
            return false;
        }
        C1619306Vr c1619306Vr = (C1619306Vr) obj;
        return Intrinsics.LJFF(this.LIZ, c1619306Vr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1619306Vr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatCustomizeExternalEntrance(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2257971DZj
    public final String getEnterMethod() {
        return this.LIZ;
    }

    public C1619306Vr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
