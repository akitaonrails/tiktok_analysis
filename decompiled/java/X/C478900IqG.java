package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0IqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478900IqG {
    public final MGModuleTab LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478900IqG)) {
            return false;
        }
        C478900IqG c478900IqG = (C478900IqG) obj;
        return Intrinsics.LJFF(this.LIZ, c478900IqG.LIZ) && this.LIZIZ == c478900IqG.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MGModuleTabWrapper(mgModuleTab=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C478900IqG(MGModuleTab mGModuleTab) {
        this.LIZ = mGModuleTab;
    }
}
