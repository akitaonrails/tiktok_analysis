package X;

import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;

/* JADX INFO: renamed from: X.0IMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465190IMb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, long j, ShareFromInfo shareFromInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "follow_page_source");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
        c474500IjALIZ.LJJIL(shareFromInfo);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, long j, ShareFromInfo shareFromInfo) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_unfollow");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "follow_page_source");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
        c474500IjALIZ.LJJIL(shareFromInfo);
        c474500IjALIZ.LIZ();
    }
}
