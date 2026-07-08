package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347430lAT {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347430lAT)) {
            return false;
        }
        C1347430lAT c1347430lAT = (C1347430lAT) obj;
        return Intrinsics.LJFF(this.LIZ, c1347430lAT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1347430lAT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1347430lAT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1347430lAT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1347430lAT.LJ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((((((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAIChatParams(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterAIChatMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needConfirmReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1347430lAT(Aweme aweme, String str, String str2, String str3, String str4) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
