package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708250RqJ {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C708250RqJ)) {
            return false;
        }
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        return this.LIZ == c708250RqJ.LIZ && Intrinsics.LJFF(this.LIZIZ, c708250RqJ.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MasterToggleState(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C708250RqJ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
