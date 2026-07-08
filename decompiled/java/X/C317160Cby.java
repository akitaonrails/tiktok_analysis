package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317160Cby implements InterfaceC1891350zJl {
    public final User LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public C317160Cby() {
        this(null, null, false, false, null, 31);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryUserListItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fromSearchKeyword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAlreadyMentioned=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isBlockedUser=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", searchSource=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C317160Cby)) {
            return false;
        }
        C317160Cby c317160Cby = (C317160Cby) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.getUid(), c317160Cby.LL.getUid()) || !Intrinsics.LJFF(this.LLILLJJLI, c317160Cby.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C317160Cby)) {
            return false;
        }
        C317160Cby c317160Cby = (C317160Cby) obj;
        if (!Intrinsics.LJFF(this.LL.getUid(), c317160Cby.LL.getUid()) || !Intrinsics.LJFF(this.LLILLJJLI, c317160Cby.LLILLJJLI)) {
            return false;
        }
        return true;
    }

    public C317160Cby(User user, String str, boolean z, boolean z2, String str2, int i) {
        user = (i & 1) != 0 ? new User() : user;
        str = (i & 2) != 0 ? "" : str;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        str2 = (i & 16) != 0 ? "" : str2;
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str2;
    }
}
