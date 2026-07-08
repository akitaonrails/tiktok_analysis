package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0byW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994060byW extends AbstractC994080byY {
    public final List<User> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C994060byW) && Intrinsics.LJFF(this.LL, ((C994060byW) obj).LL);
    }

    @Override // X.InterfaceC1606880ruw
    public final String getString() {
        return "story_reveal_centralized_entry_two_avatars";
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DualAvatar(users=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C994060byW(List<? extends User> list) {
        this.LL = list;
    }
}
