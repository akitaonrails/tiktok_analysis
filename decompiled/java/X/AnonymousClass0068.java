package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0068, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0068 {
    public final List<User> LIZ;

    public AnonymousClass0068() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0068) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0068) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightStoryRevealInfo(displayUsers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0068(Object obj) {
        this.LIZ = C13BV.INSTANCE;
    }
}
