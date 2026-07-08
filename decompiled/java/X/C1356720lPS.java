package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356720lPS {
    public static void LIZIZ(Context context) {
        if (!C1358180lRo.LIZ() || context == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (RepostReplyKeyboard.LLJJIJIIJIL != 0 && jUptimeMillis - RepostReplyKeyboard.LLJJIJIIJIL < 60000) {
            return;
        }
        RepostReplyKeyboard.LLJJIJIIJIL = jUptimeMillis;
        C21146717pB.LIZJ(context, R.layout.i6x);
    }

    public static RepostReplyKeyboard LIZ(VideoItemParams videoItemParams, C1356730lPT c1356730lPT, boolean z) {
        RepostReplyKeyboard repostReplyKeyboard = new RepostReplyKeyboard();
        repostReplyKeyboard.LLJILJIL = videoItemParams;
        repostReplyKeyboard.LLJILJILJ = c1356730lPT;
        repostReplyKeyboard.LLJILLL = z;
        return repostReplyKeyboard;
    }
}
