package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15399061d extends AbstractC15396061a {
    public final DataSource LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15399061d) && Intrinsics.LJFF(this.LIZ, ((C15399061d) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(dataSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15399061d(DataSource dataSource) {
        this.LIZ = dataSource;
    }
}
