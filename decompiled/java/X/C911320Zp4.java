package X;

import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911320Zp4 {
    public static final C2242281CpW LIZ(PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent) {
        PictureCardFallbackInfoComponent.Companion.getClass();
        if (Intrinsics.LJFF(pictureCardFallbackInfoComponent, PictureCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            return null;
        }
        return new C2242281CpW(pictureCardFallbackInfoComponent.linkInfo, pictureCardFallbackInfoComponent.image, pictureCardFallbackInfoComponent.text);
    }
}
