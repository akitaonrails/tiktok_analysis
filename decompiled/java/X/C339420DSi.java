package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339420DSi implements InterfaceC339430DSj {
    public final String LL;
    public final User LLILLJJLI;
    public final Boolean LLILLL;
    public final Boolean LLILZ;
    public final Integer LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C339420DSi)) {
            return false;
        }
        C339420DSi c339420DSi = (C339420DSi) obj;
        return Intrinsics.LJFF(this.LL, c339420DSi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c339420DSi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c339420DSi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c339420DSi.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c339420DSi.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.LLILZIL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolUserItem(nickname=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isConnectionFilterSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInSearchPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", initialRelationStatus=");
        sbLIZ.append(this.LLILZIL);
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

    public C339420DSi(String str, User user, Boolean bool, Boolean bool2, Integer num) {
        this.LL = str;
        this.LLILLJJLI = user;
        this.LLILLL = bool;
        this.LLILZ = bool2;
        this.LLILZIL = num;
    }
}
