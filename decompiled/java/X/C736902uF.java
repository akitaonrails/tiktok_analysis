package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02uF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C736902uF extends AbstractC723102s1 {
    public final ExposeUserRightPanel LL;
    public final String LLILLJJLI = "user_right";
    public final String LLILLL = "user_right_v2_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C736902uF) && Intrinsics.LJFF(this.LL, ((C736902uF) obj).LL);
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
        sbLIZ.append("UserRightVOV2(userRightModuleInfo=");
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

    public C736902uF(ExposeUserRightPanel exposeUserRightPanel) {
        this.LL = exposeUserRightPanel;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C736902uF.class, interfaceC1891350zJl.getClass());
    }
}
