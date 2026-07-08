package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.task.SendTokenTask;
import com.bytedance.push.third.PushManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808870VoD {
    public final InterfaceC808880VoE LIZ;
    public final C809220Vom LIZIZ;

    public final Pair<String, String> LIZ(int i) {
        C809470VpB c809470VpBLJIIIIZZ = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ);
        C809220Vom c809220Vom = this.LIZIZ;
        c809470VpBLJIIIIZZ.getClass();
        if (i == 10) {
            c809220Vom.LJIILJJIL.getClass();
            return new Pair<>("C710bn1nxBwC00KggWcGok848", "7551870Ae6c7c40920917252a89C8675");
        }
        return null;
    }

    public C808870VoD(C808900VoG c808900VoG, C809220Vom c809220Vom) {
        this.LIZ = c808900VoG;
        this.LIZIZ = c809220Vom;
    }

    public static final void LIZIZ(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerSenderFailed: pushType=");
        sbLIZ.append(i);
        sbLIZ.append(" ,errorId=");
        sbLIZ.append(str);
        sbLIZ.append(" ,msg=");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(Context context, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdSupportService.registerSenderSuccessAndUploadToken(");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (C0V4R.LJII(context)) {
            C808850VoB c808850VoB = new C808850VoB(str, i);
            C809030VoT.LJIIZILJ().getClass();
            boolean zLJI = MethodIDManager.LJI(137919);
            RunnableC823120WQs.LIZIZ(new SendTokenTask(context, c808850VoB));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PushSupporter.thirdService().sendToken(");
            sbLIZ2.append(i);
            sbLIZ2.append(", ");
            sbLIZ2.append(str);
            sbLIZ2.append(")");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (((PushOnlineSettings) C0WFE.LIZ(C809360Vp0.LIZ, PushOnlineSettings.class)).LJIJJLI() > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("forbid set alias. pushType = ");
            sbLIZ3.append(i);
            sbLIZ3.append(", token = ");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        Application application = C809360Vp0.LIZ;
        C808950VoL.LIZIZ().getClass();
        C809040VoU c809040VoULIZ = C809040VoU.LIZ();
        c809040VoULIZ.getClass();
        HashMap map = new HashMap();
        c809040VoULIZ.LIZIZ(map);
        String str2 = (String) map.get("device_id");
        if (!TextUtils.isEmpty(str2)) {
            InterfaceC808880VoE interfaceC808880VoE = this.LIZ;
            Context contextN3 = C786410Ut5.N3(application);
            interfaceC808880VoE.getClass();
            PushManager.inst().setAlias(contextN3, str2, i);
        }
    }
}
