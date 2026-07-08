package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import kotlin.jvm.internal.AFwS347S0000000_25;

/* JADX INFO: renamed from: X.0ssU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643800ssU extends C11SY {
    public static final C1643800ssU LIZJ;
    public static final C10EP LIZLLL;
    public static final C199609138d<String, NotificationLiveStatus> LJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.10EP, X.11T4] */
    static {
        C1643800ssU c1643800ssU = new C1643800ssU();
        LIZJ = c1643800ssU;
        ?? r1 = new C11T3<String, NotificationLiveStatus, C10EO, NotificationLiveStatus>() { // from class: X.10EP
            public final C10EQ LIZ;

            {
                C10EQ.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLIIIJ());
                this.LIZ = (C10EQ) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(C10EQ.class);
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return ((C10EO) obj).LIZ;
            }

            @Override // X.C11T3
            public final C11NZ<NotificationLiveStatus> requestActual(C10EO c10eo) {
                C10EO c10eo2 = c10eo;
                return this.LIZ.LIZ(c10eo2.LIZIZ, c10eo2.LIZ);
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return obj2;
            }
        };
        LIZLLL = r1;
        C199609138d<String, NotificationLiveStatus> c199609138d = new C199609138d<>();
        LJ = c199609138d;
        c1643800ssU.LJJIJIIJIL(C11T2.LIZIZ(r1), C11T2.LIZ(c199609138d), C0LJ7.LIZ(AFwS347S0000000_25.get$arr$(15)));
    }
}
