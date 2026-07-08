package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICU {
    public static StickerTemplate LIZIZ(C0ICT c0ict) {
        BaseTemplate baseTemplateLJIIIIZZ;
        StickerTemplate stickerTemplate;
        C0ICM c0icmLJJJIL;
        C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ(c0ict);
        StickerTemplate stickerTemplate2 = (StickerTemplate) C0Z2Z.LIZ(c869590Y9lLIZ, StickerTemplate.class);
        Class<StickerTemplate> cls = null;
        if (stickerTemplate2 == null) {
            return null;
        }
        C0Z9Y c0z9y = (C0Z9Y) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (c0z9y != null && (c0icmLJJJIL = c0z9y.LJJJIL()) != null) {
            baseTemplateLJIIIIZZ = c0icmLJJJIL.LJIIIIZZ(c869590Y9lLIZ, stickerTemplate2.attachment, stickerTemplate2.baseResponseComponent.extras.get("enter_from"), stickerTemplate2.baseResponseComponent.extras.get("enter_method"));
        } else {
            baseTemplateLJIIIIZZ = null;
        }
        if (baseTemplateLJIIIIZZ instanceof StickerTemplate) {
            stickerTemplate = (StickerTemplate) baseTemplateLJIIIIZZ;
        } else {
            stickerTemplate = null;
        }
        if (stickerTemplate != null) {
            cls = StickerTemplate.class;
        }
        if (!Intrinsics.LJFF(StickerTemplate.class, cls)) {
            return stickerTemplate2;
        }
        return stickerTemplate;
    }

    public static C461530I7z LIZ(C0ICT c0ict, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ICT c0ict2;
        if ((interfaceC1891350zJl instanceof C0ICT) && (c0ict2 = (C0ICT) interfaceC1891350zJl) != null) {
            boolean z = true;
            boolean z2 = !Intrinsics.LJFF(c0ict.LIZJ(), c0ict2.LIZJ());
            if (Intrinsics.LJFF(c0ict.LLILII().LIZ.LIZ.getContentPB(), c0ict2.LLILII().LIZ.LIZ.getContentPB()) && Intrinsics.LJFF(c0ict.LJJLL(), c0ict2.LJJLL()) && C901060ZWm.LIZJ(c0ict.LLILII().LIZ.LIZ) == C901060ZWm.LIZJ(c0ict2.LLILII().LIZ.LIZ)) {
                z = false;
            }
            C0ICZ c0icz = new C0ICZ(z, z2);
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0ict, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0icz, 5);
        }
        return C461450I7r.LIZIZ(c0ict, interfaceC1891350zJl);
    }
}
