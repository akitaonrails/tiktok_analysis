package X;

import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;

/* JADX INFO: renamed from: X.0rgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598200rgw {
    public static final boolean LIZ(InboxLiveNotice inboxLiveNotice, long j) {
        if (!inboxLiveNotice.isCache() && inboxLiveNotice.receiveTime > j) {
            return false;
        }
        return true;
    }
}
