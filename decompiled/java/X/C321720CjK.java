package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321720CjK implements InterfaceC1467605oo {
    public final Message LIZIZ;
    public final Integer LIZ = -2000;
    public final int LIZJ = 2131828530;
    public final int LIZLLL = 2131828529;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321720CjK)) {
            return false;
        }
        C321720CjK c321720CjK = (C321720CjK) obj;
        return Intrinsics.LJFF(this.LIZ, c321720CjK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c321720CjK.LIZIZ) && this.LIZJ == c321720CjK.LIZJ && this.LIZLLL == c321720CjK.LIZLLL;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Message message = this.LIZIZ;
        return ((((iHashCode + (message != null ? message.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentAnswerRetryMessage(msgType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", plaintTextResourceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", interativeTextResourceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C321720CjK(Message message) {
        this.LIZIZ = message;
        C321460Ciu.LIZ();
    }
}
