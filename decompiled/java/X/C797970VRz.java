package X;

import android.text.TextUtils;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.awemepushapi.IPushApi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797970VRz {
    public static final C797970VRz LIZ = new C797970VRz();

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C797970VRz.LIZJ():boolean");
    }

    public static boolean LIZ(PushBody pushBody) {
        try {
            C844470XAv.LIZ.getClass();
            C0VS0 c0vs0LIZLLL = C0VS0.LIZLLL(C844470XAv.LIZ());
            C808950VoL.LIZIZ().getClass();
            c0vs0LIZLLL.LIZJ(C808950VoL.LIZLLL().LJIILJJIL().LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkDuplicate() - delete expired msgs ERROR: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append('!');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZLLL().LJIILJJIL().LIZ) {
            return false;
        }
        if (pushBody.expire_time > 0 && System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > pushBody.expire_time) {
            return true;
        }
        C844470XAv.LIZ.getClass();
        return C0VS0.LIZLLL(C844470XAv.LIZ()).LIZIZ(pushBody.rid64);
    }

    public static boolean LIZIZ(PushBody pushBody, JSONObject jSONObject) throws JSONException {
        InterfaceC809060VoW interfaceC809060VoW;
        boolean z;
        if (pushBody.id <= 0 && jSONObject != null) {
            jSONObject.put("message_invalid_reason", "id<0");
        }
        if (TextUtils.isEmpty(pushBody.open_url) && jSONObject != null) {
            jSONObject.put("message_invalid_reason", "no_open_url");
        }
        if (TextUtils.isEmpty(pushBody.groupId) && jSONObject != null) {
            jSONObject.put("message_invalid_reason", "no_groupId");
        }
        if (TextUtils.isEmpty(pushBody.targetSecUid) || (interfaceC809060VoW = C809030VoT.LJIIJ.LIZIZ.LJIJJ) == null) {
            return true;
        }
        if (pushBody.needFilterMsgByUid && !TextUtils.equals(interfaceC809060VoW.getSecUid(), pushBody.targetSecUid)) {
            z = true;
            if (jSONObject != null) {
                jSONObject.put("message_invalid_reason", "change_account");
            }
            ((IPushApi) ServiceManager.get().getService(IPushApi.class)).sendPushShowInterceptEvent(pushBody.LIZ(), 10000, "change_account");
        } else {
            z = false;
        }
        return !z;
    }

    public static void LIZLLL(C797970VRz c797970VRz, PushBody pushBody) {
        c797970VRz.getClass();
        try {
            C0VS1 c0vs1 = new C0VS1(10000, pushBody.rid64, C0V4R.LJ(), String.valueOf(pushBody), false);
            c0vs1.LJII = pushBody;
            C844470XAv.LIZ.getClass();
            C0VS0.LIZLLL(C844470XAv.LIZ()).LIZ(c0vs1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordNotification() - error: ");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
