package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085708Fb {
    public final File LIZ;
    public final List<File> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2085708Fb)) {
            return false;
        }
        C2085708Fb c2085708Fb = (C2085708Fb) obj;
        return Intrinsics.LJFF(this.LIZ, c2085708Fb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2085708Fb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilePathComponents(root=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", segments=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZ() {
        return this.LIZIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2085708Fb(File file, List<? extends File> list) {
        this.LIZ = file;
        this.LIZIZ = list;
    }
}
