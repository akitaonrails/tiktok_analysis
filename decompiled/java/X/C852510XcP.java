package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852510XcP implements Serializable {
    public static final int $stable = 8;
    public final String avatar_url;
    public final String email;
    public final String mobile;
    public boolean needStoreLastMethod;
    public final String nickname;
    public final List<String> oauth_platform;
    public final boolean safe;
    public final String ticket;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C852510XcP)) {
            return false;
        }
        C852510XcP c852510XcP = (C852510XcP) obj;
        return Intrinsics.LJFF(this.avatar_url, c852510XcP.avatar_url) && Intrinsics.LJFF(this.nickname, c852510XcP.nickname) && Intrinsics.LJFF(this.email, c852510XcP.email) && Intrinsics.LJFF(this.mobile, c852510XcP.mobile) && Intrinsics.LJFF(this.oauth_platform, c852510XcP.oauth_platform) && Intrinsics.LJFF(this.ticket, c852510XcP.ticket) && this.safe == c852510XcP.safe && this.needStoreLastMethod == c852510XcP.needStoreLastMethod;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecoverAccountModel(avatar_url=");
        sbLIZ.append(this.avatar_url);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", email=");
        sbLIZ.append(this.email);
        sbLIZ.append(", mobile=");
        sbLIZ.append(this.mobile);
        sbLIZ.append(", oauth_platform=");
        sbLIZ.append(this.oauth_platform);
        sbLIZ.append(", ticket=");
        sbLIZ.append(this.ticket);
        sbLIZ.append(", safe=");
        sbLIZ.append(this.safe);
        sbLIZ.append(", needStoreLastMethod=");
        sbLIZ.append(this.needStoreLastMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setNeedStoreLastMethod(boolean z) {
        this.needStoreLastMethod = z;
    }

    public C852510XcP(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
        this.avatar_url = str;
        this.nickname = str2;
        this.email = str3;
        this.mobile = str4;
        this.oauth_platform = list;
        this.ticket = str5;
        this.safe = z;
        this.needStoreLastMethod = z2;
    }
}
