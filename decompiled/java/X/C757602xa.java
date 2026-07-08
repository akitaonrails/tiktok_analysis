package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C757602xa extends AbstractC723102s1 {
    public final ExposeUserRightPanel LL;
    public final String LLILLJJLI = "user_right";
    public final String LLILLL = "user_right_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C757602xa) && Intrinsics.LJFF(this.LL, ((C757602xa) obj).LL);
    }

    public final int hashCode() {
        ExposeUserRightPanel exposeUserRightPanel = this.LL;
        if (exposeUserRightPanel == null) {
            return 0;
        }
        return exposeUserRightPanel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserRightVO(userRightModuleInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        return this.LLILLL;
    }

    public C757602xa(ExposeUserRightPanel exposeUserRightPanel) {
        this.LL = exposeUserRightPanel;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C757602xa.class, interfaceC1891350zJl.getClass());
    }
}
