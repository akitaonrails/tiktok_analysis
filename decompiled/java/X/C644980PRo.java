package X;

import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644980PRo implements InterfaceC0148002o {
    public ResearchFilterStruct LL;

    public C644980PRo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C644980PRo) && Intrinsics.LJFF(this.LL, ((C644980PRo) obj).LL);
    }

    public final int hashCode() {
        ResearchFilterStruct researchFilterStruct = this.LL;
        if (researchFilterStruct == null) {
            return 0;
        }
        return researchFilterStruct.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResearchFilterState(selectedItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C644980PRo(ResearchFilterStruct researchFilterStruct) {
        this.LL = researchFilterStruct;
    }
}
