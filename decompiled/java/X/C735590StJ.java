package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0StJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735590StJ implements InterfaceC1606880ruw {
    public final User LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C735590StJ) && Intrinsics.LJFF(this.LL, ((C735590StJ) obj).LL);
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
        sbLIZ.append("AvatarStoryRelationState(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1606880ruw
    public final String getString() {
        return this.LLILLJJLI;
    }

    public C735590StJ(User user) {
        this.LL = user;
        this.LLILLJJLI = String.valueOf(C10EU.LJIILJJIL(user));
    }
}
