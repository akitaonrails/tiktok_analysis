package X;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038610d8N {
    public final Size LIZ;
    public final C1038600d8M LIZIZ;
    public final C1038620d8O LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1038610d8N() {
        this((C1038600d8M) null, (C1038620d8O) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1038610d8N)) {
            return false;
        }
        C1038610d8N c1038610d8N = (C1038610d8N) obj;
        return Intrinsics.LJFF(this.LIZ, c1038610d8N.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1038610d8N.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1038610d8N.LIZJ);
    }

    public final int hashCode() {
        Size size = this.LIZ;
        return ((((size == null ? 0 : size.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomEcPipConfig(pipDraggableSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showStrategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", replayStrategy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1038610d8N(C1038600d8M c1038600d8M, C1038620d8O c1038620d8O, int i) {
        this((Size) null, (i & 2) != 0 ? new C1038600d8M(false, 3) : c1038600d8M, (i & 4) != 0 ? new C1038620d8O(0, 3) : c1038620d8O);
    }

    public C1038610d8N(Size size, C1038600d8M c1038600d8M, C1038620d8O c1038620d8O) {
        this.LIZ = size;
        this.LIZIZ = c1038600d8M;
        this.LIZJ = c1038620d8O;
    }
}
