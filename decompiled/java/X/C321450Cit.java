package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentSug;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321450Cit implements InterfaceC1467705op {
    public final C321240CiY LIZ;
    public final CommerceAgentSug LIZIZ;
    public final Message LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321450Cit)) {
            return false;
        }
        C321450Cit c321450Cit = (C321450Cit) obj;
        return Intrinsics.LJFF(this.LIZ, c321450Cit.LIZ) && Intrinsics.LJFF(this.LIZIZ, c321450Cit.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321450Cit.LIZJ);
    }

    public final int hashCode() {
        C321240CiY c321240CiY = this.LIZ;
        int iHashCode = (((c321240CiY == null ? 0 : c321240CiY.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        Message message = this.LIZJ;
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerSug(commonInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sugs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C321450Cit(C321240CiY c321240CiY, CommerceAgentSug commerceAgentSug, Message message) {
        this.LIZ = c321240CiY;
        this.LIZIZ = commerceAgentSug;
        this.LIZJ = message;
        C321460Ciu.LIZ();
    }

    public /* synthetic */ C321450Cit(C321240CiY c321240CiY, CommerceAgentSug commerceAgentSug, Message message, int i) {
        this((i & 1) != 0 ? null : c321240CiY, commerceAgentSug, (i & 4) != 0 ? null : message);
    }
}
