package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00GS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GS implements InterfaceC0148002o {
    public final User LL;

    public C00GS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00GS) && Intrinsics.LJFF(this.LL, ((C00GS) obj).LL);
    }

    public final int hashCode() {
        User user = this.LL;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoUserCardState(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00GS(int i) {
        this.LL = null;
    }
}
