package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LCK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCK {
    public static boolean LIZ() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        ICreativeSAAService iCreativeSAAService;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C085T.LIZ(activityLIZIZ)) == null) {
            return false;
        }
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording() || "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity".equals(activityLIZ.getLocalClassName()) || Intrinsics.LJFF("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", activityLIZ.getLocalClassName()) || ((iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null && iCreativeSAAService.isSAAActivity(activityLIZ));
    }
}
