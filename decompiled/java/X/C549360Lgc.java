package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549360Lgc {
    public final MentionDataItem LIZ;
    public final int LIZIZ;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549360Lgc)) {
            return false;
        }
        C549360Lgc c549360Lgc = (C549360Lgc) obj;
        return Intrinsics.LJFF(this.LIZ, c549360Lgc.LIZ) && this.LIZIZ == c549360Lgc.LIZIZ && this.LIZJ == c549360Lgc.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionPanelActiveItemShowEvent(mentionDataItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", handled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C549360Lgc(MentionDataItem mentionDataItem, int i) {
        this.LIZ = mentionDataItem;
        this.LIZIZ = i;
    }
}
