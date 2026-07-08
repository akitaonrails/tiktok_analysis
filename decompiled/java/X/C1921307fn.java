package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921307fn extends AbstractC1921407fo {
    public final List<String> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1921307fn) && Intrinsics.LJFF(this.LIZ, ((C1921307fn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MVUploadFrameTaskParam(imageList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1921307fn(List<String> list) {
        this.LIZ = list;
    }

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C1921307fn)) {
            return false;
        }
        C1921307fn c1921307fn = (C1921307fn) abstractC1921407fo;
        if (c1921307fn.LIZ.size() != this.LIZ.size()) {
            return false;
        }
        return Intrinsics.LJFF(C13LP.LLIIJI(this.LIZ), C13LP.LLIIJI(c1921307fn.LIZ));
    }
}
