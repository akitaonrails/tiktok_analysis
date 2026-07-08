package X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: X.0Mip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576210Mip {
    public static ProgressDialogC1399790mWv LIZ(Context context, EnumC1399820mWy enumC1399820mWy, InterfaceC1399800mWw interfaceC1399800mWw) {
        ProgressDialogC1399790mWv progressDialogC1399790mWv = new ProgressDialogC1399790mWv(context, enumC1399820mWy);
        progressDialogC1399790mWv.LLIZLLLIL = interfaceC1399800mWw;
        progressDialogC1399790mWv.setCancelable(false);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && C1893760zNe.LIZ(activityLIZ, true) && !C20622515mp.LJIILIIL(activityLIZ)) {
            C786410Ut5.O4(progressDialogC1399790mWv);
        }
        return progressDialogC1399790mWv;
    }
}
