package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326890Crf {
    public boolean LIZ;
    public final Message LIZIZ;
    public boolean LIZJ;
    public Boolean LIZLLL;
    public boolean LJ;

    public C326890Crf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326890Crf)) {
            return false;
        }
        C326890Crf c326890Crf = (C326890Crf) obj;
        return this.LIZ == c326890Crf.LIZ && Intrinsics.LJFF(this.LIZIZ, c326890Crf.LIZIZ) && this.LIZJ == c326890Crf.LIZJ && Intrinsics.LJFF(this.LIZLLL, c326890Crf.LIZLLL) && this.LJ == c326890Crf.LJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Message message = this.LIZIZ;
        int iHashCode = (((iZ2 + (message == null ? 0 : message.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Boolean bool = this.LIZLLL;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraInfo(showNewInteraction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", answerMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showMessageDisclaimer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tnsMsgPreMsgHasInteraction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showRegenerateIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C326890Crf(int i) {
        this.LIZ = false;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = null;
        this.LJ = false;
    }
}
