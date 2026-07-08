package X;

import android.util.Log;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569150MTx {
    public Function0<Unit> LIZ;
    public Function0<Unit> LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        IExternalService.ServiceLoadCallback serviceLoadCallback = new IExternalService.ServiceLoadCallback() { // from class: X.0MTw
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                Function0<Unit> function0 = this.LIZ.LIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress fail");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LIZ.getClass();
                sbLIZ.append("So decompress: AbilityServiceImpl");
                sbLIZ.append(", ");
                sbLIZ.append(runtimeException.getMessage());
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(runtimeException));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                Function0<Unit> function0 = this.LIZ.LIZIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress success");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LIZ.getClass();
                sbLIZ.append("So decompress: AbilityServiceImpl");
                sbLIZ.append(", ");
                sbLIZ.append(runtimeException.getMessage());
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(runtimeException));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        if (this.LIZJ) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("AbilityService", serviceLoadCallback);
        } else {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel("AbilityService", serviceLoadCallback);
        }
    }
}
