package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1591806Lc implements InterfaceC111300bX {
    public final InterfaceC332260D0u<InnerPushMessage> LL;
    public final InterfaceC1591906Ld LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1591806Lc)) {
            return false;
        }
        C1591806Lc c1591806Lc = (C1591806Lc) obj;
        return Intrinsics.LJFF(this.LL, c1591806Lc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1591806Lc.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedHierarchyData(msgFlow=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", controller=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1591806Lc(InterfaceC332260D0u interfaceC332260D0u, C20671715ul c20671715ul) {
        this.LL = interfaceC332260D0u;
        this.LLILLJJLI = c20671715ul;
    }
}
