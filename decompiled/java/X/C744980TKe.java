package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.freq.CommentDisplayInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744980TKe {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    public static CommentDisplayInfo LIZIZ;

    public static String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = LIZ.format(Calendar.getInstance().getTime());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static CommentDisplayInfo LIZIZ(String str) {
        Object obj;
        Object obj2 = null;
        try {
            Keva repo = KevaImpl.getRepo("live_preview_real_time_comment_repo", 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("comment_box_display_record_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            CommentDisplayInfo commentDisplayInfo = LIZIZ;
            if (commentDisplayInfo != null && Intrinsics.LJFF(commentDisplayInfo.useId, str) && commentDisplayInfo.freqVersion == C745010TKh.LIZIZ().freqVersion) {
                return commentDisplayInfo;
            }
            String string = repo.getString(strLIZIZ, "");
            if (string == null || string.length() == 0) {
                return null;
            }
            CommentDisplayInfo commentDisplayInfo2 = (CommentDisplayInfo) C293501Bt.LIZ().LJII(string, CommentDisplayInfo.class);
            int i = commentDisplayInfo2.freqVersion;
            CommentDisplayInfo commentDisplayInfo3 = commentDisplayInfo2;
            if (i != C745010TKh.LIZIZ().freqVersion) {
                commentDisplayInfo3 = null;
            }
            C189200o6.m2constructorimpl(commentDisplayInfo3);
            obj = commentDisplayInfo3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        C189200o6.m5exceptionOrNullimpl(obj);
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (CommentDisplayInfo) obj2;
    }
}
