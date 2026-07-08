package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AgeConfirmModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C719902rV extends AbstractC756202xM {
    public final AgeConfirmModule LLILZLL;
    public final String LLIZ = "age_confirm_module";
    public final String LLIZLLLIL = "age_confirm_module_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C719902rV) && Intrinsics.LJFF(this.LLILZLL, ((C719902rV) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeConfirmVO(ageConfirmModule=");
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

    public C719902rV(AgeConfirmModule ageConfirmModule) {
        this.LLILZLL = ageConfirmModule;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C719902rV.class, interfaceC1891350zJl.getClass());
    }
}
