package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604220rqe extends AbstractC1604290rql {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604220rqe)) {
            return false;
        }
        C1604220rqe c1604220rqe = (C1604220rqe) obj;
        return Intrinsics.LJFF(this.LIZ, c1604220rqe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1604220rqe.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PluginDownloadStatusStart(pluginId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604220rqe(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
