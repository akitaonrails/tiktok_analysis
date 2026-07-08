package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0byX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994070byX extends AbstractC994080byY {
    public final List<User> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C994070byX) && Intrinsics.LJFF(this.LL, ((C994070byX) obj).LL);
    }

    @Override // X.InterfaceC1606880ruw
    public final String getString() {
        return "story_reveal_centralized_entry_three_avatars";
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TripleAvatar(users=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C994070byX(List<? extends User> list) {
        this.LL = list;
    }
}
