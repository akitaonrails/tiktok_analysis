package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343280Dd0 implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final LogPbBean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C343280Dd0)) {
            return false;
        }
        C343280Dd0 c343280Dd0 = (C343280Dd0) obj;
        return Intrinsics.LJFF(this.LL, c343280Dd0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c343280Dd0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c343280Dd0.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.LLILLL;
        return iHashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveDualFeedItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C343280Dd0 c343280Dd0;
        Aweme aweme = null;
        if ((interfaceC1891350zJl instanceof C343280Dd0) && (c343280Dd0 = (C343280Dd0) interfaceC1891350zJl) != null) {
            aweme = c343280Dd0.LL;
        }
        return Intrinsics.LJFF(aweme, this.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C343280Dd0 c343280Dd0;
        Aweme aweme;
        String aid = null;
        if (interfaceC1891350zJl instanceof C343280Dd0) {
            c343280Dd0 = (C343280Dd0) interfaceC1891350zJl;
        } else {
            c343280Dd0 = null;
        }
        String aid2 = this.LL.getAid();
        if (c343280Dd0 != null && (aweme = c343280Dd0.LL) != null) {
            aid = aweme.getAid();
        }
        return Intrinsics.LJFF(aid2, aid);
    }

    public C343280Dd0(Aweme aweme, String str, LogPbBean logPbBean) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = logPbBean;
    }
}
