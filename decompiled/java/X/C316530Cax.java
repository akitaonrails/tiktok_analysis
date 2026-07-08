package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316530Cax {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316530Cax)) {
            return false;
        }
        C316530Cax c316530Cax = (C316530Cax) obj;
        return Intrinsics.LJFF(this.LIZ, c316530Cax.LIZ) && Intrinsics.LJFF(this.LIZIZ, c316530Cax.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c316530Cax.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupMentionTrackingExtra(chatType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupOwnerAccountType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C316530Cax() {
        this("", "", "");
    }

    public C316530Cax(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
