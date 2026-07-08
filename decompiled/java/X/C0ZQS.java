package X;

import com.ss.android.ugc.aweme.im.message.template.card.QuickLiveVideoTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZQS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQS {
    public static final String LIZJ(C869590Y9l c869590Y9l) {
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        String strLJIIJ = c912070ZqH.LJIILJJIL().LJIIJ(c869590Y9l);
        if (strLJIIJ != null && strLJIIJ.length() > 0) {
            return strLJIIJ;
        }
        return c912070ZqH.LJIILJJIL().LJIIIIZZ(c869590Y9l);
    }

    public static final VideoCardFallbackInfoComponent LIZ(C869590Y9l c869590Y9l, QuickLiveVideoTemplate quickLiveVideoTemplate) {
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = quickLiveVideoTemplate.fallbackInfo;
        VideoCardFallbackInfoComponent.Companion.getClass();
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent2 = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        if (!Intrinsics.LJFF(videoCardFallbackInfoComponent, videoCardFallbackInfoComponent2)) {
            if (quickLiveVideoTemplate.fallbackInfo.image.iconType == IconTypeComponent.LOADING && C123100dR.LIZ(LIZJ(c869590Y9l))) {
                return videoCardFallbackInfoComponent2;
            }
            return quickLiveVideoTemplate.fallbackInfo;
        }
        return videoCardFallbackInfoComponent2;
    }

    public static final VideoCardFallbackInfoComponent LIZIZ(C869590Y9l c869590Y9l, VideoCardTemplate videoCardTemplate) {
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = videoCardTemplate.fallbackInfo;
        VideoCardFallbackInfoComponent.Companion.getClass();
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent2 = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        if (!Intrinsics.LJFF(videoCardFallbackInfoComponent, videoCardFallbackInfoComponent2)) {
            if (videoCardTemplate.fallbackInfo.image.iconType == IconTypeComponent.LOADING && C123100dR.LIZ(LIZJ(c869590Y9l))) {
                return videoCardFallbackInfoComponent2;
            }
            return videoCardTemplate.fallbackInfo;
        }
        return videoCardFallbackInfoComponent2;
    }
}
