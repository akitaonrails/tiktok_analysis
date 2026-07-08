package X;

import com.ss.android.ugc.aweme.experiment.InboxSkylightStoryCacheConfig;

/* JADX INFO: renamed from: X.0rit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599410rit {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (C295190Bhd.LIZ()) {
            return false;
        }
        if (C596340NaC.LIZJ()) {
            C596340NaC.LIZLLL("InboxSkylightSupportCacheUtils#inboxSkylightSupportCache", true);
            return true;
        }
        C596340NaC.LIZLLL("InboxSkylightSupportCacheUtils#inboxSkylightSupportCache", false);
        return (C1209404oG.LIZ() && C1600360rkQ.LIZ().enableDiskCache) || !(C1209404oG.LIZ() || !((InboxSkylightStoryCacheConfig) C1599440riw.LIZIZ.getValue()).inboxStoryDiskCache || C295190Bhd.LIZ());
    }
}
