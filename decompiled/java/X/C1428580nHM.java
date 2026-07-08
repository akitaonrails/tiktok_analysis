package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;

/* JADX INFO: renamed from: X.0nHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428580nHM {
    public static final C1428580nHM LIZ = new C1428580nHM();

    public static final boolean LIZ(boolean z) {
        if (z || ((INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)).LJFF() || C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_save_local_with_watermark_in_edit", true) != 1) {
            return false;
        }
        return true;
    }
}
