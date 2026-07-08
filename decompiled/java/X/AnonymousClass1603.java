package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.1603, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class AnonymousClass1603 extends AnonymousClass1608 {
    public final void LJI(C2344009Gk c2344009Gk) {
        Object objValueOf;
        Video video;
        Aweme aweme = this.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            objValueOf = Integer.valueOf(video.getDuration());
        } else {
            objValueOf = "";
        }
        c2344009Gk.LJ(objValueOf, "item_duration");
    }

    public AnonymousClass1603(String str, String str2, String str3, Aweme aweme) {
        super(str, str2, str3, aweme);
    }
}
