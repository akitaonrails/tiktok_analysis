package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604210rqd extends AbstractC1604290rql {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604210rqd)) {
            return false;
        }
        C1604210rqd c1604210rqd = (C1604210rqd) obj;
        return Intrinsics.LJFF(this.LIZ, c1604210rqd.LIZ) && this.LIZIZ == c1604210rqd.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1604210rqd.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PluginDownloadStatusProgress(pluginId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604210rqd(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
