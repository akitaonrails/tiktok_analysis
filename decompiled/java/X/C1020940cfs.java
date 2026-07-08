package X;

import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020940cfs {
    public static boolean LIZ(PhotoCarouselProductStruct photoCarouselProductStruct) {
        HintsConfig hintsConfig;
        BotConfig botConfig;
        if (photoCarouselProductStruct != null) {
            hintsConfig = photoCarouselProductStruct.getHintsConfig();
        } else {
            hintsConfig = null;
        }
        if (hintsConfig == null || (botConfig = photoCarouselProductStruct.getBotConfig()) == null || !Intrinsics.LJFF(botConfig.aiBotEnable, Boolean.TRUE)) {
            return false;
        }
        return true;
    }
}
