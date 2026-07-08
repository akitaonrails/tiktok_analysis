package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604180rqa extends AbstractC1604290rql {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604180rqa)) {
            return false;
        }
        C1604180rqa c1604180rqa = (C1604180rqa) obj;
        return Intrinsics.LJFF(this.LIZ, c1604180rqa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1604180rqa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1604180rqa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1604180rqa.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PluginDownloadStatusFail(pluginId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", retryAction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604180rqa(String str, Function0 function0, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = function0;
    }
}
