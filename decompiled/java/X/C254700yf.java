package X;

import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C254700yf {
    public final GiftGuideMessage LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254700yf)) {
            return false;
        }
        C254700yf c254700yf = (C254700yf) obj;
        return Intrinsics.LJFF(this.LIZ, c254700yf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c254700yf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c254700yf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c254700yf.LIZLLL) && this.LJ == c254700yf.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TpBubbleEvent(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bubbleKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tooltipPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", periodId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C254700yf(GiftGuideMessage giftGuideMessage, String str, String str2, String str3, long j) {
        this.LIZ = giftGuideMessage;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = j;
    }
}
