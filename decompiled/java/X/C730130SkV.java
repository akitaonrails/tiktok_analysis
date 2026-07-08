package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730130SkV implements InterfaceC360001aY {
    public final StoryInteractionUser LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewerItem(storyInteractionUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hostIsStory=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hostIsRevealStory=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFriendsSimpleDetail=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String uid;
        User user = this.LL.user;
        return (user == null || (uid = user.getUid()) == null) ? super.hashCode() : uid.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C730130SkV) && interfaceC1891350zJl != null) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C730130SkV c730130SkV;
        String uid;
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C730130SkV) && (c730130SkV = (C730130SkV) interfaceC1891350zJl) != null) {
            User user = c730130SkV.LL.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = this.LL.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            return Intrinsics.LJFF(uid, uid2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        C730130SkV c730130SkV;
        if ((obj instanceof C730130SkV) && (c730130SkV = (C730130SkV) obj) != null) {
            return Intrinsics.LJFF(this.LL, c730130SkV.LL);
        }
        return false;
    }

    public C730130SkV(StoryInteractionUser storyInteractionUser, boolean z, boolean z2, boolean z3) {
        this.LL = storyInteractionUser;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }
}
