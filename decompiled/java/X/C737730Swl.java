package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737730Swl implements InterfaceC1891350zJl {
    public final User LL;
    public final Aweme LLILLJJLI;
    public final Integer LLILLL;
    public final C1895007bY LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737730Swl)) {
            return false;
        }
        C737730Swl c737730Swl = (C737730Swl) obj;
        return Intrinsics.LJFF(this.LL, c737730Swl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c737730Swl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c737730Swl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c737730Swl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c737730Swl.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        User user = this.LL;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        Aweme aweme = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiSliderReactionItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", voteVal=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventLogParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (interfaceC1891350zJl instanceof C737730Swl) {
            User user = this.LL;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C737730Swl) interfaceC1891350zJl).LL;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            return Intrinsics.LJFF(uid, uid2);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (interfaceC1891350zJl instanceof C737730Swl) {
            User user = this.LL;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C737730Swl) interfaceC1891350zJl).LL;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            return Intrinsics.LJFF(uid, uid2);
        }
        return false;
    }

    public C737730Swl(User user, Aweme aweme, Integer num, C1895007bY c1895007bY, String str) {
        this.LL = user;
        this.LLILLJJLI = aweme;
        this.LLILLL = num;
        this.LLILZ = c1895007bY;
        this.LLILZIL = str;
    }
}
