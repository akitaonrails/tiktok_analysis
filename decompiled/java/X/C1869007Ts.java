package X;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1869007Ts extends AbstractC1869107Tt {
    public final Uri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1869007Ts) && Intrinsics.LJFF(this.LIZ, ((C1869007Ts) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchemaRoute(uri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869007Ts(Uri uri) {
        this.LIZ = uri;
    }
}
