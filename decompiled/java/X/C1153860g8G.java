package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153860g8G {
    public final List<InterfaceC1204490hRv> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153860g8G)) {
            return false;
        }
        C1153860g8G c1153860g8G = (C1153860g8G) obj;
        return Intrinsics.LJFF(this.LIZ, c1153860g8G.LIZ) && this.LIZIZ == c1153860g8G.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergeResult(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", purgedPreviewCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1153860g8G(List<? extends InterfaceC1204490hRv> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
