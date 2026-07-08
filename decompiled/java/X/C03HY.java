package X;

import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03HY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HY implements InterfaceC1891350zJl {
    public final MutualRelationViewModel LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C03HY) && Intrinsics.LJFF(this.LL, ((C03HY) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualRelationEmptyItem(viewModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03HY(MutualRelationViewModel mutualRelationViewModel) {
        this.LL = mutualRelationViewModel;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
