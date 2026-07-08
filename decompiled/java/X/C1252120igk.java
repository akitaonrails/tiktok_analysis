package X;

import Y.AfS188S0100000_19;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;

/* JADX INFO: renamed from: X.0igk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252120igk {
    public static void LIZ(InterfaceC1252130igl interfaceC1252130igl, String str) {
        C11NZ<C1641660sp2<NotificationLiveStatus>> c11nzLJIIJJI;
        if (str != null && str.length() != 0 && (c11nzLJIIJJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LJIIJJI(str)) != null) {
            interfaceC1252130igl.Dd((C11JF) c11nzLJIIJJI.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(interfaceC1252130igl, 22), new C09JN() { // from class: X.0igj
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("INotificationLiveViewModel@33cc.observeChangeOptions$2");
                    C1C7U.LIZIZ("INotificationLiveViewModel@33cc.observeChangeOptions$2");
                }
            }));
        }
    }
}
