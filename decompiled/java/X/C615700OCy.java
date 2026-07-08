package X;

import com.ss.android.ugc.aweme.aime.model.AIMEDetailModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615700OCy implements InterfaceC0148002o {
    public final AbstractC1623806Xk<AIMEDetailModel> LL;

    public C615700OCy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C615700OCy) && Intrinsics.LJFF(this.LL, ((C615700OCy) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIMEDetailState(aimeDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C615700OCy(int i) {
        this(C491101vh.LIZ);
    }

    public C615700OCy(AbstractC1623806Xk<AIMEDetailModel> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
