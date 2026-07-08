package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858070yS5 {
    public static final BaseVideo LIZ(TakoSug takoSug) {
        BaseVideo baseVideo = takoSug.videoInfo;
        if (baseVideo == null || !(!baseVideo.urlList.isEmpty())) {
            return null;
        }
        return baseVideo;
    }

    public static final boolean LIZIZ(TakoSug takoSug) {
        if (takoSug.extra.containsKey("bot_first_round_sug") && Intrinsics.LJFF(takoSug.extra.get("bot_first_round_sug"), "1")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(TakoSug takoSug) {
        if (takoSug.sugShowType == 103) {
            return true;
        }
        return false;
    }
}
