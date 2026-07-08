package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ljj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551290Ljj {
    public final MentionDataItem LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;
    public boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551290Ljj)) {
            return false;
        }
        C551290Ljj c551290Ljj = (C551290Ljj) obj;
        return Intrinsics.LJFF(this.LIZ, c551290Ljj.LIZ) && this.LIZIZ == c551290Ljj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c551290Ljj.LIZJ) && this.LIZLLL == c551290Ljj.LIZLLL && this.LJ == c551290Ljj.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Integer num = this.LIZJ;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickMentionEvent(mentionDataItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteExistingMentionAtSelection=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", handled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551290Ljj(MentionDataItem mentionDataItem, boolean z, Integer num, int i, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        num = (i2 & 4) != 0 ? 0 : num;
        i = (i2 & 8) != 0 ? EnumC551350Ljp.MENTION_LIST.getFrom() : i;
        this.LIZ = mentionDataItem;
        this.LIZIZ = z;
        this.LIZJ = num;
        this.LIZLLL = i;
        this.LJ = false;
    }
}
