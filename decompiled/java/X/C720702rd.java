package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RightGuidanceModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720702rd extends AbstractC756202xM {
    public final RightGuidanceModule LLILZLL;
    public final String LLIZ = "right_guidance_module";
    public final String LLIZLLLIL = "right_guidance_module_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C720702rd) && Intrinsics.LJFF(this.LLILZLL, ((C720702rd) obj).LLILZLL);
    }

    public final int hashCode() {
        RightGuidanceModule rightGuidanceModule = this.LLILZLL;
        if (rightGuidanceModule == null) {
            return 0;
        }
        return rightGuidanceModule.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightGuidanceModuleVO(rightGuidanceModule=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C720702rd(RightGuidanceModule rightGuidanceModule) {
        this.LLILZLL = rightGuidanceModule;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C720702rd;
    }
}
