package X;

import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627720Oji implements InterfaceC0148002o {
    public final AbstractC1623806Xk<CreativeToolDetailModel> LL;

    public C627720Oji() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C627720Oji) && Intrinsics.LJFF(this.LL, ((C627720Oji) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeToolDetailState(pageDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C627720Oji(int i) {
        this(C491101vh.LIZ);
    }

    public C627720Oji(AbstractC1623806Xk<CreativeToolDetailModel> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
