package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372740lpI {
    public static String LIZ(C1372730lpH c1372730lpH) {
        Aweme aweme = c1372730lpH.LIZJ;
        if (aweme != null && aweme.getAwemeType() == 43) {
            if (C729980SkG.LJIIIIZZ(c1372730lpH.LIZJ)) {
                Aweme aweme2 = c1372730lpH.LIZJ;
                if (aweme2 != null && AwemeExtKt.isPrivate(aweme2)) {
                    return "now_video_memory";
                }
                return "now_video";
            }
            return "now_others_video_post";
        }
        if (C729980SkG.LJIIIIZZ(c1372730lpH.LIZJ)) {
            Aweme aweme3 = c1372730lpH.LIZJ;
            if (aweme3 != null && AwemeExtKt.isPrivate(aweme3)) {
                return "now_post_memory";
            }
            return "now_post";
        }
        return "now_others_post";
    }

    public static boolean LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, "now_post_memory") && !Intrinsics.LJFF(str, "now_video_memory")) {
            return false;
        }
        return true;
    }
}
