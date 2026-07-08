package X;

import com.ss.android.ugc.aweme.IIMAiGroupShotService;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1700606lI implements IIMAiGroupShotService {
    public static final C1700606lI LIZIZ = new C1700606lI();
    public final /* synthetic */ IIMAiGroupShotService LIZ;

    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    public final Object LIZ(C19EG c19eg, AIGroupShotEntry.OutChat outChat, String str, String str2, String str3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LIZ(c19eg, outChat, str, str2, str3, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    public final Object LIZIZ(C19EG c19eg, AIGroupShotEntry.OutChat outChat, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.LIZIZ(c19eg, outChat, str, "notification_page", interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.IIMAiGroupShotService
    public final void LIZJ(C19EG c19eg, AIGroupShotEntry.InChat inChat, AbstractC1682806iQ abstractC1682806iQ, String str, String str2, String str3, Integer num) {
        this.LIZ.LIZJ(c19eg, inChat, abstractC1682806iQ, str, str2, str3, num);
    }

    public C1700606lI() {
        IIMAiGroupShotService iIMAiGroupShotService = (IIMAiGroupShotService) PluggableExtentionKt.pluggableSpi$default(IIMAiGroupShotService.class, false, false, false, 14, null);
        if (iIMAiGroupShotService != null) {
            this.LIZ = iIMAiGroupShotService;
        } else {
            "must be provided".toString();
            throw new IllegalStateException("must be provided");
        }
    }
}
