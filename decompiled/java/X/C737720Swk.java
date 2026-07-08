package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737720Swk implements InterfaceC1891350zJl {
    public final User LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final SocialAvatarStickerStruct LLILZ;
    public final C1895007bY LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737720Swk)) {
            return false;
        }
        C737720Swk c737720Swk = (C737720Swk) obj;
        return Intrinsics.LJFF(this.LL, c737720Swk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c737720Swk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c737720Swk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c737720Swk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c737720Swk.LLILZIL);
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
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SocialAvatarStickerStruct socialAvatarStickerStruct = this.LLILZ;
        return ((iHashCode3 + (socialAvatarStickerStruct != null ? socialAvatarStickerStruct.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractiveEmojiReactionItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", socialAvatarSticker=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", eventLogParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (interfaceC1891350zJl instanceof C737720Swk) {
            User user = this.LL;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C737720Swk) interfaceC1891350zJl).LL;
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
        if (interfaceC1891350zJl instanceof C737720Swk) {
            User user = this.LL;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C737720Swk) interfaceC1891350zJl).LL;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            return Intrinsics.LJFF(uid, uid2);
        }
        return false;
    }

    public /* synthetic */ C737720Swk(User user, Aweme aweme, String str, C1895007bY c1895007bY) {
        this(user, aweme, str, null, c1895007bY);
    }

    public C737720Swk(User user, Aweme aweme, String str, SocialAvatarStickerStruct socialAvatarStickerStruct, C1895007bY c1895007bY) {
        this.LL = user;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = socialAvatarStickerStruct;
        this.LLILZIL = c1895007bY;
    }
}
