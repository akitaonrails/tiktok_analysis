package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SBF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SBF implements IEvent {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SBF)) {
            return false;
        }
        C0SBF c0sbf = (C0SBF) obj;
        return Intrinsics.LJFF(this.LIZ, c0sbf.LIZ) && this.LIZIZ == c0sbf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0sbf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0sbf.LIZLLL) && this.LJ == c0sbf.LJ && this.LJFF == c0sbf.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentBubbleClickEvent(commentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forceRefresh=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", descLines=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", navigateToPostModeOnClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needShowReplyPanel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SBF(String str, String str2, Integer num, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        str2 = (i & 4) != 0 ? null : str2;
        num = (i & 8) != 0 ? null : num;
        z = (i & 16) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = z2;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = z;
        this.LJFF = false;
    }
}
