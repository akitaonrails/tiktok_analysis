package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537550L6j {
    public final MentionDataItem LIZ;
    public final EnumC551300Ljk LIZIZ;
    public final C0LRE LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C537550L6j)) {
            return false;
        }
        C537550L6j c537550L6j = (C537550L6j) obj;
        return Intrinsics.LJFF(this.LIZ, c537550L6j.LIZ) && this.LIZIZ == c537550L6j.LIZIZ && this.LIZJ == c537550L6j.LIZJ && Intrinsics.LJFF(this.LIZLLL, c537550L6j.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0LRE c0lre = this.LIZJ;
        int iHashCode2 = (iHashCode + (c0lre == null ? 0 : c0lre.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExceptionEvent(mentionDataItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", locationArea=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", locationNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C537550L6j(MentionDataItem mentionDataItem, EnumC551300Ljk enumC551300Ljk, C0LRE c0lre, Integer num) {
        this.LIZ = mentionDataItem;
        this.LIZIZ = enumC551300Ljk;
        this.LIZJ = c0lre;
        this.LIZLLL = num;
    }
}
