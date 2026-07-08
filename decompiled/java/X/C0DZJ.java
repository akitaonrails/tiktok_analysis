package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZJ {
    public final List<ThoughtAggregatedModel> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C0DZJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DZJ)) {
            return false;
        }
        C0DZJ c0dzj = (C0DZJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0dzj.LIZ) && this.LIZIZ == c0dzj.LIZIZ && this.LIZJ == c0dzj.LIZJ && this.LIZLLL == c0dzj.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregatedUiState(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loading=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstLoadFailed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DZJ(int i) {
        this(C13BV.INSTANCE, true, false, false);
    }

    public C0DZJ(List<ThoughtAggregatedModel> list, boolean z, boolean z2, boolean z3) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }

    public static C0DZJ LIZ(C0DZJ c0dzj, List list, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = c0dzj.LIZ;
        }
        if ((i & 2) != 0) {
            z = c0dzj.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c0dzj.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c0dzj.LIZLLL;
        }
        c0dzj.getClass();
        return new C0DZJ(list, z, z2, z3);
    }
}
