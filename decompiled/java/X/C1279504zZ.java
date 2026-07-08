package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279504zZ {
    public final String LIZ;
    public final List<MentionDataItem> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1279504zZ)) {
            return false;
        }
        C1279504zZ c1279504zZ = (C1279504zZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1279504zZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1279504zZ.LIZIZ) && this.LIZJ == c1279504zZ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionSearchEvent(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentFollowPathUsersShouldFiltered=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", higherPanel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1279504zZ(String str, boolean z) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = str;
        this.LIZIZ = c13bv;
        this.LIZJ = z;
    }
}
