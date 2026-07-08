package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164040gOg extends AbstractC1157040gDO {
    public final User LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1164040gOg) && Intrinsics.LJFF(this.LL, ((C1164040gOg) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchivePostItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164040gOg(User user) {
        this.LL = user;
    }

    @Override // X.AbstractC1157040gDO, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1164040gOg) && Intrinsics.LJFF(this.LL.getUid(), ((C1164040gOg) interfaceC1891350zJl).LL.getUid())) {
            return true;
        }
        return false;
    }
}
