package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261050iv9 implements InterfaceC1891350zJl {
    public final User LL;
    public final Map<String, String> LLILLJJLI;
    public final UrlModel LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final MatchedFriendStruct LLILZLL;
    public final EnumC1070050dx5 LLIZ;

    public C1261050iv9() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1261050iv9)) {
            return false;
        }
        C1261050iv9 c1261050iv9 = (C1261050iv9) obj;
        return Intrinsics.LJFF(this.LL, c1261050iv9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1261050iv9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1261050iv9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1261050iv9.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1261050iv9.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1261050iv9.LLILZLL) && this.LLIZ == c1261050iv9.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        UrlModel urlModel = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        MatchedFriendStruct matchedFriendStruct = this.LLILZLL;
        return ((iHashCode2 + (matchedFriendStruct != null ? matchedFriendStruct.hashCode() : 0)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFriendItem(rawUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", avatarUri=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", username=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", matchFriend=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", section=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1261050iv9(User user, Map map, EnumC1070050dx5 enumC1070050dx5) {
        UrlModel avatarMedium = user.getAvatarMedium();
        String nickname = user.getNickname();
        nickname = nickname == null ? "" : nickname;
        String uniqueId = user.getUniqueId();
        String str = uniqueId != null ? uniqueId : "";
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        this.LL = user;
        this.LLILLJJLI = map;
        this.LLILLL = avatarMedium;
        this.LLILZ = nickname;
        this.LLILZIL = str;
        this.LLILZLL = matchedFriendStruct;
        this.LLIZ = enumC1070050dx5;
    }
}
