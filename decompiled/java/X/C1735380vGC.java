package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AuthPopup;
import com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity;

/* JADX INFO: renamed from: X.0vGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735380vGC {
    public static Object LIZ(Context context, AuthPopup authPopup, C1407900mk0 c1407900mk0, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ComplianceDialogActivity.LLJJIJIL = c23260099m;
        Intent intent = new Intent(context, (Class<?>) ComplianceDialogActivity.class);
        if (authPopup != null) {
            intent.putExtra("auth_data", authPopup);
            intent.putExtra("is_error", false);
            intent.putExtra("dialog_config", c1407900mk0);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYepNpqoZjfA5k7w2/VR4V2syErHlkG8RPi7Og+S9c1HSjlAPN8AjuQ==", null));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
