package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640770PBj implements InterfaceC0148002o {
    public final C291001Au<DynamicPatch> LL;
    public final int LLILLJJLI;

    public C640770PBj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640770PBj)) {
            return false;
        }
        C640770PBj c640770PBj = (C640770PBj) obj;
        return Intrinsics.LJFF(this.LL, c640770PBj.LL) && this.LLILLJJLI == c640770PBj.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHubHeaderState(lynxDataChangeEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lynxTabIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C640770PBj(int i) {
        this(0, new C291001Au(null));
    }

    public C640770PBj(int i, C291001Au c291001Au) {
        this.LL = c291001Au;
        this.LLILLJJLI = i;
    }
}
