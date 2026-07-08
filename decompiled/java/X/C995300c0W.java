package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995300c0W implements InterfaceC995310c0X {
    public final User LIZ;

    public C995300c0W() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995300c0W) && Intrinsics.LJFF(this.LIZ, ((C995300c0W) obj).LIZ);
    }

    public final int hashCode() {
        User user = this.LIZ;
        if (user == null) {
            return 0;
        }
        return user.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigCardFrequencyCheckContext(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995300c0W(User user) {
        this.LIZ = user;
    }
}
