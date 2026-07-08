package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Ss0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734780Ss0 {
    public static final void LIZ(C2344009Gk c2344009Gk, Context context, C2189821An6 c2189821An6) {
        if (c2189821An6 == null) {
            c2189821An6 = C0SUC.LIZ(context);
        }
        String str = c2189821An6.getExtra().get("playlist_session_id");
        if (str != null && str.length() != 0) {
            c2344009Gk.LJFF("playlist_session_id", c2189821An6.getExtra().get("playlist_session_id"));
        }
        String playListId = c2189821An6.getPlayListId();
        if (playListId != null && playListId.length() != 0) {
            c2344009Gk.LJFF("playlist_id", c2189821An6.getPlayListId());
        }
    }
}
