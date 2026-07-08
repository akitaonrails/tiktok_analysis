package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1174704if {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1174704if) && Intrinsics.LJFF(this.LIZ, ((C1174704if) obj).LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixModeMatchTips(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1174704if(String str) {
        this.LIZ = str;
    }
}
