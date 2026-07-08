package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736750SvB extends C723430SZh {
    public final AssemViewModel<?> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C736750SvB) && Intrinsics.LJFF(this.LIZJ, ((C736750SvB) obj).LIZJ);
    }

    public final int hashCode() {
        AssemViewModel<?> assemViewModel = this.LIZJ;
        if (assemViewModel == null) {
            return 0;
        }
        return assemViewModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewModelSubscribePerformanceParams(vm=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C736750SvB(AssemViewModel<?> assemViewModel) {
        this.LIZJ = assemViewModel;
    }
}
