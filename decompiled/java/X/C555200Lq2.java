package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555200Lq2 {
    public final MentionDataItem LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555200Lq2)) {
            return false;
        }
        C555200Lq2 c555200Lq2 = (C555200Lq2) obj;
        return Intrinsics.LJFF(this.LIZ, c555200Lq2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555200Lq2.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeUserEvent(mentionDataItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", changeID=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C555200Lq2(MentionDataItem mentionDataItem) {
        String strLIZ = C1017903yT.LIZ();
        this.LIZ = mentionDataItem;
        this.LIZIZ = strLIZ;
    }
}
