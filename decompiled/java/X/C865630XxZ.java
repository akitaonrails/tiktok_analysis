package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865630XxZ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C865630XxZ)) {
            return false;
        }
        C865630XxZ c865630XxZ = (C865630XxZ) obj;
        return Intrinsics.LJFF(this.LIZ, c865630XxZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c865630XxZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c865630XxZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c865630XxZ.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateConversationInfoInput(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C865630XxZ(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
