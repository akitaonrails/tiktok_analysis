package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CameoAssetInfo;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034J implements InterfaceC1891350zJl {
    public final UserBaseInfo LL;
    public final CameoAssetInfo LLILLJJLI;
    public final Aweme LLILLL;
    public final String LLILZ;

    public C034J() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C034J)) {
            return false;
        }
        C034J c034j = (C034J) obj;
        return Intrinsics.LJFF(this.LL, c034j.LL) && Intrinsics.LJFF(this.LLILLJJLI, c034j.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c034j.LLILLL) && Intrinsics.LJFF(this.LLILZ, c034j.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UserBaseInfo userBaseInfo = this.LL;
        int iHashCode = (userBaseInfo == null ? 0 : userBaseInfo.hashCode()) * 31;
        CameoAssetInfo cameoAssetInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (cameoAssetInfo == null ? 0 : cameoAssetInfo.hashCode())) * 31;
        Aweme aweme = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str = this.LLILZ;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CastUserItem(userInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cameoInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
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

    public C034J(UserBaseInfo userBaseInfo, CameoAssetInfo cameoAssetInfo, Aweme aweme, String str) {
        this.LL = userBaseInfo;
        this.LLILLJJLI = cameoAssetInfo;
        this.LLILLL = aweme;
        this.LLILZ = str;
    }
}
