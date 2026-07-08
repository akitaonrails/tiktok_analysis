package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621500OZg implements InterfaceC1891350zJl {
    public final User LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C621500OZg)) {
            return false;
        }
        C621500OZg c621500OZg = (C621500OZg) obj;
        return Intrinsics.LJFF(this.LL, c621500OZg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c621500OZg.LLILLJJLI) && this.LLILLL == c621500OZg.LLILLL && this.LLILZ == c621500OZg.LLILZ && this.LLILZIL == c621500OZg.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiDetailItem(actionUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actionEmoji=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isCreatorAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isAllTab=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", orderNum=");
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

    public C621500OZg(User user, String str, boolean z, boolean z2, int i) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = i;
    }
}
