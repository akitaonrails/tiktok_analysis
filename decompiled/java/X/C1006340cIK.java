package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006340cIK {
    public static final /* synthetic */ int LIZLLL = 0;
    public final long LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006340cIK)) {
            return false;
        }
        C1006340cIK c1006340cIK = (C1006340cIK) obj;
        return this.LIZ == c1006340cIK.LIZ && Intrinsics.LJFF(this.LIZIZ, c1006340cIK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1006340cIK.LIZJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.LIZJ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayableCardIdentity(cardId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1006340cIK(long j, String str, Map<String, String> map) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
