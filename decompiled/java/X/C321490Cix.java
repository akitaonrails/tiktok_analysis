package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321490Cix implements InterfaceC1467705op {
    public final C321240CiY LIZ;
    public final C321500Ciy LIZIZ;
    public final Message LIZJ;
    public C321610Cj9 LIZLLL;
    public int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321490Cix)) {
            return false;
        }
        C321490Cix c321490Cix = (C321490Cix) obj;
        return Intrinsics.LJFF(this.LIZ, c321490Cix.LIZ) && Intrinsics.LJFF(this.LIZIZ, c321490Cix.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321490Cix.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c321490Cix.LIZLLL) && this.LJ == c321490Cix.LJ;
    }

    public final int hashCode() {
        C321240CiY c321240CiY = this.LIZ;
        return ((((((((c321240CiY == null ? 0 : c321240CiY.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerMessage(commonInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", locatorConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bubbleLayoutStyle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C321490Cix LIZ(C321490Cix c321490Cix, C321610Cj9 c321610Cj9) {
        C321240CiY c321240CiY = c321490Cix.LIZ;
        C321500Ciy c321500Ciy = c321490Cix.LIZIZ;
        Message message = c321490Cix.LIZJ;
        int i = c321490Cix.LJ;
        c321490Cix.getClass();
        return new C321490Cix(c321240CiY, c321500Ciy, message, c321610Cj9, i);
    }

    public /* synthetic */ C321490Cix(C321240CiY c321240CiY, Message message, C321610Cj9 c321610Cj9) {
        this(c321240CiY, new C321500Ciy(), message, c321610Cj9, 0);
    }

    public C321490Cix(C321240CiY c321240CiY, C321500Ciy c321500Ciy, Message message, C321610Cj9 c321610Cj9, int i) {
        this.LIZ = c321240CiY;
        this.LIZIZ = c321500Ciy;
        this.LIZJ = message;
        this.LIZLLL = c321610Cj9;
        this.LJ = i;
    }
}
