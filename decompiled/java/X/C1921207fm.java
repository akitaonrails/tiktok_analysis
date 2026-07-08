package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921207fm extends AbstractC1921407fo {
    public final List<String> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921207fm)) {
            return false;
        }
        C1921207fm c1921207fm = (C1921207fm) obj;
        return Intrinsics.LJFF(this.LIZ, c1921207fm.LIZ) && this.LIZIZ == c1921207fm.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginImageUploadFrameTaskParam(imageList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", compressLongSide=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C1921207fm)) {
            return false;
        }
        C1921207fm c1921207fm = (C1921207fm) abstractC1921407fo;
        if (c1921207fm.LIZ.size() != this.LIZ.size() || c1921207fm.LIZIZ != this.LIZIZ) {
            return false;
        }
        return Intrinsics.LJFF(C13LP.LLIIJI(this.LIZ), C13LP.LLIIJI(c1921207fm.LIZ));
    }

    public C1921207fm(List<String> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
