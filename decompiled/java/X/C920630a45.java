package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHLeaveJoinGroupBizContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920630a45 extends C920640a46 {
    public final String LIZIZ;
    public final MHLeaveJoinGroupBizContent LIZJ;
    public final List<String> LIZLLL;

    public C920630a45() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920630a45)) {
            return false;
        }
        C920630a45 c920630a45 = (C920630a45) obj;
        return Intrinsics.LJFF(this.LIZIZ, c920630a45.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c920630a45.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920630a45.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        MHLeaveJoinGroupBizContent mHLeaveJoinGroupBizContent = this.LIZJ;
        return ((iHashCode + (mHLeaveJoinGroupBizContent == null ? 0 : mHLeaveJoinGroupBizContent.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHLeaveResult(logId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", leaveGroupBizContent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920630a45(String str, MHLeaveJoinGroupBizContent mHLeaveJoinGroupBizContent, int i) {
        str = (i & 1) != 0 ? "" : str;
        mHLeaveJoinGroupBizContent = (i & 2) != 0 ? null : mHLeaveJoinGroupBizContent;
        C13BV c13bv = (i & 4) != 0 ? C13BV.INSTANCE : null;
        super(c13bv);
        this.LIZIZ = str;
        this.LIZJ = mHLeaveJoinGroupBizContent;
        this.LIZLLL = c13bv;
    }
}
