package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892807bC implements InterfaceC871310YGb {
    public final BusinessCommandMessage LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1892807bC) && Intrinsics.LJFF(this.LJIIIZ, ((C1892807bC) obj).LJIIIZ);
    }

    public final int hashCode() {
        return this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessCommandMessageReceived(message=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1892807bC(BusinessCommandMessage businessCommandMessage) {
        this.LJIIIZ = businessCommandMessage;
    }
}
