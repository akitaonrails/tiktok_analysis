package X;

import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242711CqD {
    public static final VideoCardFallbackInfoComponent LIZ(C2242721CqE c2242721CqE) {
        ImageComponent imageComponentLIZ;
        TextComponent textComponentLIZ;
        ActionLinkComponent actionLinkComponentLIZ;
        FallbackStatusComponent fallbackStatusComponentLIZ;
        C2244091CsR c2244091CsR = c2242721CqE.image;
        if (c2244091CsR != null) {
            imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        C2243521CrW c2243521CrW = c2242721CqE.text;
        if (c2243521CrW == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW)) == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        C2244321Cso c2244321Cso = c2242721CqE.link_info;
        if (c2244321Cso != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso);
        } else {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        C0IBA c0iba = c2242721CqE.status;
        if (c0iba == null || (fallbackStatusComponentLIZ = C0IB8.LIZ(c0iba)) == null) {
            fallbackStatusComponentLIZ = FallbackStatusComponent.UNKNOWN;
        }
        return new VideoCardFallbackInfoComponent(imageComponentLIZ, textComponentLIZ, actionLinkComponentLIZ, fallbackStatusComponentLIZ);
    }

    public static final C2242281CpW LIZIZ(VideoCardFallbackInfoComponent videoCardFallbackInfoComponent) {
        VideoCardFallbackInfoComponent.Companion.getClass();
        if (Intrinsics.LJFF(videoCardFallbackInfoComponent, VideoCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            return null;
        }
        return new C2242281CpW(videoCardFallbackInfoComponent.linkInfo, videoCardFallbackInfoComponent.image, videoCardFallbackInfoComponent.text);
    }
}
