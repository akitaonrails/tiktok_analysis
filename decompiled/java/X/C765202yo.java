package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C765202yo {
    public final EnumC545980LbA LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765202yo)) {
            return false;
        }
        C765202yo c765202yo = (C765202yo) obj;
        return this.LIZ == c765202yo.LIZ && Intrinsics.LJFF(this.LIZIZ, c765202yo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c765202yo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c765202yo.LIZLLL) && this.LJ == c765202yo.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixVideoMessageModel(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765202yo() {
        this(EnumC545980LbA.COMPLETED, null, null, null, 0L);
    }

    public C765202yo(EnumC545980LbA enumC545980LbA, String str, String str2, String str3, long j) {
        this.LIZ = enumC545980LbA;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = j;
    }
}
