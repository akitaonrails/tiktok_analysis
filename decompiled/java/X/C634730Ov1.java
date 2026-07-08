package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcPhotoSearchBubbleGuideModel;

/* JADX INFO: renamed from: X.0Ov1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634730Ov1 {
    public static final C634730Ov1 LIZ = new C634730Ov1();
    public static final EcPhotoSearchBubbleGuideModel LIZIZ = new EcPhotoSearchBubbleGuideModel(false, 90, EnumC634740Ov2.SMALL.getStyle(), 3, 3);

    public static EcPhotoSearchBubbleGuideModel LIZ() {
        Object c098200Yq;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            c098200Yq = LIZIZ;
            EcPhotoSearchBubbleGuideModel ecPhotoSearchBubbleGuideModel = (EcPhotoSearchBubbleGuideModel) c0c64LJIILLIIL.LJJII(EcPhotoSearchBubbleGuideModel.class, c098200Yq, "ec_middle_photo_search_bubble_guide_exp", true);
            if (ecPhotoSearchBubbleGuideModel != null) {
                c098200Yq = ecPhotoSearchBubbleGuideModel;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        EcPhotoSearchBubbleGuideModel ecPhotoSearchBubbleGuideModel2 = (EcPhotoSearchBubbleGuideModel) c098200Yq;
        return ecPhotoSearchBubbleGuideModel2 == null ? LIZIZ : ecPhotoSearchBubbleGuideModel2;
    }
}
