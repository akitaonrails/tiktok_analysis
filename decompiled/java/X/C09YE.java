package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09YE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YE implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<ProfileComponents>> LL;

    public C09YE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C09YE) && Intrinsics.LJFF(this.LL, ((C09YE) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C09YE(int i) {
        this(C491101vh.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09YE(AbstractC1623806Xk<? extends List<? extends ProfileComponents>> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
