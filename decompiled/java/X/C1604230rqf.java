package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604230rqf extends AbstractC1604290rql {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604230rqf)) {
            return false;
        }
        C1604230rqf c1604230rqf = (C1604230rqf) obj;
        return Intrinsics.LJFF(this.LIZ, c1604230rqf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1604230rqf.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PluginDownloadStatusSuccess(pluginId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604230rqf(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
