package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ED, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00ED {
    public final List<User> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00ED)) {
            return false;
        }
        C00ED c00ed = (C00ED) obj;
        return Intrinsics.LJFF(this.LIZ, c00ed.LIZ) && this.LIZIZ == c00ed.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixSearchSugResult(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C00ED(List<? extends User> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
