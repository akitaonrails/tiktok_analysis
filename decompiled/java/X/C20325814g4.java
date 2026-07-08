package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.14g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20325814g4 {
    public static final C20325814g4 LIZ = new C20325814g4();
    public static Integer LIZIZ;

    public static final String LIZ() {
        String currentUploadFrameResult = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getCurrentUploadFrameResult();
        LIZIZ = currentUploadFrameResult.length() > 0 ? 2 : 3;
        return currentUploadFrameResult;
    }
}
