package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.AwS224S0300000_15;

/* JADX INFO: renamed from: X.0a1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919280a1u {
    public final User LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public AwS224S0300000_15 LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModeratorInviteGuestEvent{user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inviteSource='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", inviteSourceCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", invitationMicIdx=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C919280a1u(User user, String str, int i) {
        this.LJ = -1;
        this.LIZ = user;
        this.LIZIZ = str;
        this.LIZLLL = 1;
        this.LJ = i;
    }

    public C919280a1u(int i, User user, String str) {
        this.LJ = -1;
        this.LIZ = user;
        this.LIZIZ = str;
        this.LIZLLL = i;
    }
}
