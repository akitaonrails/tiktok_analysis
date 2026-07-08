package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129380fUm {
    public final Gift LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129380fUm)) {
            return false;
        }
        C1129380fUm c1129380fUm = (C1129380fUm) obj;
        return Intrinsics.LJFF(this.LIZ, c1129380fUm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129380fUm.LIZIZ) && this.LIZJ == c1129380fUm.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1129380fUm.LIZLLL);
    }

    public final int hashCode() {
        Gift gift = this.LIZ;
        int iHashCode = (((((gift == null ? 0 : gift.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Long l = this.LIZLLL;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftSelectionResult(gift=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", updatedStoredGiftId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1129380fUm(Gift gift, String str, Long l, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(gift, str, i2, (i & 8) != 0 ? null : l);
    }

    public C1129380fUm(Gift gift, String str, int i, Long l) {
        this.LIZ = gift;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = l;
    }
}
