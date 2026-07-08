package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586360MzC {
    public static final C586360MzC LIZ = new C586360MzC();

    public static void LIZ(Aweme aweme, String str, String str2, float f, float f2, Context context, long j, C2189821An6 c2189821An6) {
        int duration;
        String str3;
        if (aweme != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LIZJ(C0SXF.LJJIII(context, aweme), "is_landscape_screen");
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            Video video = aweme.getVideo();
            if (video != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            c2344009Gk.LIZJ(duration, "item_duration");
            c2344009Gk.LIZIZ(f, "speed_mode");
            if (aweme.isPaidContent) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_collection_item", str3);
            c2344009Gk.LIZIZ(f2, "prev_speed_mode");
            if (Intrinsics.LJFF(str2, "long_press")) {
                c2344009Gk.LIZLLL(j, "speedup_duration");
            }
            C0SXF.LJFF(c2344009Gk, c2189821An6, aweme, context, false);
            C20684815ws.LJIILLIIL("change_video_speed", c2344009Gk.LIZ);
        }
    }
}
