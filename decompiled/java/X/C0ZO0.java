package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZO0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZO0 extends C0ZO4 {
    public final DataSource LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZO0)) {
            return false;
        }
        C0ZO0 c0zo0 = (C0ZO0) obj;
        return Intrinsics.LJFF(this.LIZ, c0zo0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zo0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zo0.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpeningNow(datasource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fortune=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZO0(DataSource dataSource, String str, String str2) {
        this.LIZ = dataSource;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
