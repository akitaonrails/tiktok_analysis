package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ydx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878950Ydx implements InterfaceC879010Ye3 {
    public final C0YM2 LL;
    public final String LLILLJJLI;
    public final FilterTabType LLILLL;
    public final Set<EnumC880480YgQ> LLILZ;
    public final C05RV LLILZIL;
    public final long LLILZLL;

    public C878950Ydx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878950Ydx)) {
            return false;
        }
        C878950Ydx c878950Ydx = (C878950Ydx) obj;
        return this.LL == c878950Ydx.LL && Intrinsics.LJFF(this.LLILLJJLI, c878950Ydx.LLILLJJLI) && this.LLILLL == c878950Ydx.LLILLL && Intrinsics.LJFF(this.LLILZ, c878950Ydx.LLILZ) && this.LLILZIL == c878950Ydx.LLILZIL && this.LLILZLL == c878950Ydx.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationPageKey(bizId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", filterTypes=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", inboxMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", createdTimestamp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC879010Ye3
    public final C0YM2 getBizId() {
        return this.LL;
    }

    public C878950Ydx(String str, FilterTabType filterTabType, Set set, long j, int i) {
        C0YM2 c0ym2;
        NoticeFeature noticeFeatureLIZ;
        C05RV c05rvLIZJ = null;
        if ((i & 1) != 0) {
            c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        } else {
            c0ym2 = null;
        }
        str = (i & 2) != 0 ? "notification_page" : str;
        if ((i & 16) != 0 && ((noticeFeatureLIZ = NoticeFeature.LIZ.LIZ()) == null || (c05rvLIZJ = noticeFeatureLIZ.LIZJ()) == null)) {
            c05rvLIZJ = C05RV.PERSONAL_INBOX;
        }
        this.LL = c0ym2;
        this.LLILLJJLI = str;
        this.LLILLL = filterTabType;
        this.LLILZ = set;
        this.LLILZIL = c05rvLIZJ;
        this.LLILZLL = j;
    }
}
