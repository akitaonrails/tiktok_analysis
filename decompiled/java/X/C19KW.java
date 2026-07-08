package X;

import Y.ARunnableS101S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19KW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KW {
    public final C19KZ LIZ;
    public final Runnable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19KW)) {
            return false;
        }
        C19KW c19kw = (C19KW) obj;
        return this.LIZ == c19kw.LIZ && Intrinsics.LJFF(this.LIZIZ, c19kw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTask(tabId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", runnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19KW(C19KZ c19kz, ARunnableS101S0200000_32 aRunnableS101S0200000_32) {
        this.LIZ = c19kz;
        this.LIZIZ = aRunnableS101S0200000_32;
    }
}
