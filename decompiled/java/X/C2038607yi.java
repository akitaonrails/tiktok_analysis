package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2038607yi implements IEvent {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZ = 3;
    public final List<String> LIZLLL = null;
    public final String LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038607yi)) {
            return false;
        }
        C2038607yi c2038607yi = (C2038607yi) obj;
        return this.LIZ == c2038607yi.LIZ && Intrinsics.LJFF(this.LIZIZ, c2038607yi.LIZIZ) && this.LIZJ == c2038607yi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2038607yi.LIZLLL) && Intrinsics.LJFF(this.LJ, c2038607yi.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        List<String> list = this.LIZLLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
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
        sbLIZ.append("OpenCommentListPageEvent(pageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forceSmoothScrollOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetIds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2038607yi(String str, boolean z) {
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
