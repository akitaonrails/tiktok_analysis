package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19370210qK {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC19366710pl LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19370210qK)) {
            return false;
        }
        C19370210qK c19370210qK = (C19370210qK) obj;
        return Intrinsics.LJFF(this.LIZ, c19370210qK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19370210qK.LIZIZ) && this.LIZJ == c19370210qK.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mediaKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19370210qK(String str, String str2, EnumC19366710pl enumC19366710pl) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC19366710pl;
    }
}
