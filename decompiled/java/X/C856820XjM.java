package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856820XjM {
    public static final C856820XjM LIZ = new C856820XjM();

    public static void LIZ(AbstractC856710XjB abstractC856710XjB, VideoPublishEditModel videoPublishEditModel, int i) {
        boolean z;
        String strValueOf;
        if (abstractC856710XjB == null) {
            return;
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (abstractC856710XjB.LIZ() == C0FPS.ECOMMERCE.getScene()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        String creationId = videoPublishEditModel.getCreationId();
        String str = videoPublishEditModel.mShootWay;
        if (videoPublishEditModel.getDraftId() > 0) {
            strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        } else {
            strValueOf = null;
        }
        iECommerceAnchorService.LJJII(boolValueOf, creationId, str, strValueOf, C1428470nHB.LJIILL(videoPublishEditModel), C1428470nHB.LJIILIIL(videoPublishEditModel), videoPublishEditModel.getMusicId(), Integer.valueOf(i));
    }

    public static void LIZIZ(AbstractC856710XjB abstractC856710XjB, VideoPublishEditModel videoPublishEditModel, Boolean bool, Boolean bool2) {
        String str;
        boolean z;
        Boolean bool3 = Boolean.TRUE;
        String strValueOf = null;
        if (Intrinsics.LJFF(bool, bool3)) {
            str = "1";
        } else if (!Intrinsics.LJFF(bool2, bool3)) {
            return;
        } else {
            str = "2";
        }
        if (abstractC856710XjB != null) {
            IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
            if (abstractC856710XjB.LIZ() == C0FPS.ECOMMERCE.getScene()) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            String creationId = videoPublishEditModel.getCreationId();
            String enterFrom = videoPublishEditModel.getEnterFrom();
            String str2 = videoPublishEditModel.mShootWay;
            if (videoPublishEditModel.getDraftId() > 0) {
                strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
            }
            iECommerceAnchorService.LJJIJL(creationId, enterFrom, str2, strValueOf, C1428470nHB.LJIILL(videoPublishEditModel), C1428470nHB.LJIILIIL(videoPublishEditModel), videoPublishEditModel.getMusicId(), str, str, boolValueOf);
        }
    }
}
