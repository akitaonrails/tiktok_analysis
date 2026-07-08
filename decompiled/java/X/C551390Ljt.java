package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ljt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551390Ljt {
    public final MentionDataItem LIZ;
    public final int LIZIZ;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551390Ljt)) {
            return false;
        }
        C551390Ljt c551390Ljt = (C551390Ljt) obj;
        return Intrinsics.LJFF(this.LIZ, c551390Ljt.LIZ) && this.LIZIZ == c551390Ljt.LIZIZ && this.LIZJ == c551390Ljt.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickChangeMentionItemEvent(oldItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", handled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551390Ljt(MentionDataItem mentionDataItem, int i) {
        this.LIZ = mentionDataItem;
        this.LIZIZ = i;
    }
}
