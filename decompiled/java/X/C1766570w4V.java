package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tux.business.base.IDialogShowService;
import com.ss.android.ugc.aweme.tux.business.base.IDialogShowServiceForTTMock;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0w4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766570w4V {
    public static final C1766570w4V LIZ = new C1766570w4V();

    public static void LIZ(InterfaceC1896407bm interfaceC1896407bm) {
        Iterator it2 = ServiceManager.get().getServices(IDialogShowService.class).iterator();
        while (it2.hasNext()) {
            ((IDialogShowService) it2.next()).onDialogShow(interfaceC1896407bm);
        }
        IDialogShowServiceForTTMock iDialogShowServiceForTTMock = (IDialogShowServiceForTTMock) PluggableExtentionKt.pluggableSpi$default(IDialogShowServiceForTTMock.class, false, false, false, 8, null);
        if (iDialogShowServiceForTTMock != null) {
            iDialogShowServiceForTTMock.LIZ();
        }
    }
}
