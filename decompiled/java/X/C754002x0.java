package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C754002x0 extends AbstractC756202xM {
    public final ExtraFeeStatement LLILZLL;
    public final String LLIZ = "extra_fee_statement";
    public final String LLIZLLLIL = "extra_fee_hint_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C754002x0) && Intrinsics.LJFF(this.LLILZLL, ((C754002x0) obj).LLILZLL);
    }

    public final int hashCode() {
        ExtraFeeStatement extraFeeStatement = this.LLILZLL;
        if (extraFeeStatement == null) {
            return 0;
        }
        return extraFeeStatement.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraFeeHintVO(extraFeeStatement=");
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

    public C754002x0(ExtraFeeStatement extraFeeStatement) {
        this.LLILZLL = extraFeeStatement;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C754002x0.class, interfaceC1891350zJl.getClass());
    }
}
