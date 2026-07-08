package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.Extra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321120CiM {
    public final Message LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Extra LIZLLL;
    public final C321240CiY LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321120CiM)) {
            return false;
        }
        C321120CiM c321120CiM = (C321120CiM) obj;
        return Intrinsics.LJFF(this.LIZ, c321120CiM.LIZ) && this.LIZIZ == c321120CiM.LIZIZ && Intrinsics.LJFF(this.LIZJ, c321120CiM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c321120CiM.LIZLLL) && Intrinsics.LJFF(this.LJ, c321120CiM.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Extra extra = this.LIZLLL;
        return ((iHashCode + (extra == null ? 0 : extra.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageStatusUpdate(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", responseExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commonInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C321120CiM(Message message, int i, String str, Extra extra, C321240CiY c321240CiY) {
        this.LIZ = message;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = extra;
        this.LJ = c321240CiY;
    }
}
