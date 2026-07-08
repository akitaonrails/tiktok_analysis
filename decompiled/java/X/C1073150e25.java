package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPopupRecordService;

/* JADX INFO: renamed from: X.0e25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073150e25 implements InterfaceC1072840e1a {
    public static final C1073150e25 LIZ = new C1073150e25();

    @Override // X.InterfaceC1072840e1a
    public final void LIZ(int i, int i2, String str, boolean z) {
        IPopupRecordService iPopupRecordService = (IPopupRecordService) ServiceManager.get().getService(IPopupRecordService.class);
        System.currentTimeMillis();
        iPopupRecordService.LIZ();
    }
}
