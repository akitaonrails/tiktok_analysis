package X;

import android.content.Context;
import com.ss.android.ugc.aweme.main.service.IFeedPanelStateVMService;
import com.ss.android.ugc.aweme.share.viewmodel.FeedStateVMServiceImpl;

/* JADX INFO: renamed from: X.0SHW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SHW {
    public static final /* synthetic */ C0SHW LIZ = new C0SHW();

    public static C0SHT LIZ(Context context) {
        IFeedPanelStateVMService iFeedPanelStateVMService;
        Object objLIZ = C04TD.LIZ(IFeedPanelStateVMService.class, false);
        if (objLIZ != null) {
            iFeedPanelStateVMService = (IFeedPanelStateVMService) objLIZ;
        } else {
            if (C04TD.b5 == null) {
                synchronized (IFeedPanelStateVMService.class) {
                    if (C04TD.b5 == null) {
                        C04TD.b5 = new FeedStateVMServiceImpl();
                    }
                }
            }
            iFeedPanelStateVMService = C04TD.b5;
        }
        return iFeedPanelStateVMService.LIZ(context);
    }
}
