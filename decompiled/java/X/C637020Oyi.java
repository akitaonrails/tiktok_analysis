package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637020Oyi implements InterfaceC20677715vj {
    public final InboxBannerInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C637020Oyi) && Intrinsics.LJFF(this.LIZ, ((C637020Oyi) obj).LIZ);
    }

    public final int hashCode() {
        InboxBannerInfo inboxBannerInfo = this.LIZ;
        if (inboxBannerInfo == null) {
            return 0;
        }
        return inboxBannerInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxOutreachRecordCacheKey(bannerInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20677715vj
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC20654715s1.INBOX_BANNER.getTypeName());
        sbLIZ.append('_');
        InboxBannerInfo inboxBannerInfo = this.LIZ;
        sbLIZ.append(inboxBannerInfo != null ? inboxBannerInfo.bannerKey : null);
        sbLIZ.append('_');
        InboxBannerInfo inboxBannerInfo2 = this.LIZ;
        sbLIZ.append(inboxBannerInfo2 != null ? inboxBannerInfo2.strategyKey : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C637020Oyi(InboxBannerInfo inboxBannerInfo) {
        this.LIZ = inboxBannerInfo;
    }
}
