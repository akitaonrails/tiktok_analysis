package X;

import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OCY implements InterfaceC0148002o {
    public final AbstractC1623806Xk<AIPortraitDetailHeaderModel> LL;

    public C0OCY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0OCY) && Intrinsics.LJFF(this.LL, ((C0OCY) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitDetailState(detail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OCY(int i) {
        this(C491101vh.LIZ);
    }

    public C0OCY(AbstractC1623806Xk<AIPortraitDetailHeaderModel> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
