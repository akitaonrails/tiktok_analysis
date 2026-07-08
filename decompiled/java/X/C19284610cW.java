package X;

import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19284610cW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19284610cW(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LJII();
        ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LIZLLL();
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.init(this.LL);
        }
        Context context = this.LL;
        if (context != null) {
            LocalBroadcastManager.LIZ(context).LIZIZ(C1879500z0e.LIZ, new IntentFilter("com.ss.android.ugc.tiktok.pns.screen.broadcast"));
        }
        return Unit.LIZ;
    }
}
