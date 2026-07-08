package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808940VoK {
    public final InterfaceC808880VoE LIZ;
    public volatile boolean LIZIZ;
    public volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public C808940VoK(InterfaceC808880VoE interfaceC808880VoE) {
        this.LIZ = interfaceC808880VoE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ec A[Catch: all -> 0x022f, TryCatch #3 {all -> 0x022f, blocks: (B:27:0x0119, B:30:0x012a, B:32:0x015f, B:33:0x016a, B:37:0x01c4, B:39:0x01d6, B:42:0x01e6, B:44:0x01ec, B:45:0x01f6, B:41:0x01e3, B:34:0x01b5), top: B:80:0x0119, outer: #0, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZJ(boolean r20) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808940VoK.LIZJ(boolean):void");
    }

    public final void LIZ(Context context, int i, String str) {
        C809030VoT.LJIIJJI().LIZJ(i, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request UPDATE_SENDER_URL failed: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.compareAndSet(false, true)) {
            C808950VoL.LIZIZ().getClass();
            LIZLLL(context, C808950VoL.LIZJ().LJIL(), false);
        }
    }

    public final void LIZLLL(Context context, String str, boolean z) {
        boolean zLJ = C809470VpB.LJIIIIZZ(context).LJ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRegisterServerPush ");
        sbLIZ.append(str);
        sbLIZ.append(" hasSupport = ");
        sbLIZ.append(zLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UpdateSenderTask.tryRegisterAllSelectedPush(hasSupport: ");
        sbLIZ2.append(zLJ);
        sbLIZ2.append(", fromServer: ");
        sbLIZ2.append(z);
        sbLIZ2.append("; pushChannelJson: ");
        sbLIZ2.append(str);
        sbLIZ2.append(")");
        C2188811AlT.LIZIZ(sbLIZ2);
        boolean z2 = false;
        if (z && !zLJ) {
            C808950VoL.LIZIZ().getClass();
            str = C808950VoL.LIZJ().LJIL();
            if (!C809470VpB.LJIIIIZZ(context).LJ(str)) {
                C809030VoT.LJIIJJI().LJI(str, false);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("tryRegisterAllSelectedPush: the senders = ");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        if (z && zLJ) {
            z2 = true;
        }
        AbstractC809480VpC.LIZLLL(str, z2);
        C809030VoT.LJIIJJI().LJI(str, ((C808900VoG) this.LIZ).LIZ(context));
    }

    public final void LIZIZ(String str, Application application, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UpdateSenderTask.parseResponse(");
            sbLIZ.append(str6);
            sbLIZ.append(") fail: response is empty!!!");
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ(application, 304, str);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!TextUtils.equals("success", jSONObject.optString("message"))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UpdateSenderTask.parseResponse(");
            sbLIZ2.append(str6);
            sbLIZ2.append(") fail: ");
            sbLIZ2.append(jSONObject.optString("message"));
            sbLIZ2.append("!!!");
            C2188811AlT.LIZIZ(sbLIZ2);
            LIZ(application, 302, str);
            return;
        }
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        jSONObject.optJSONObject("frontier_setting");
        c809030VoT.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("channels");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            ArrayList<C810540Vqu> arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                    String strOptString = jSONObject2.optString(FollowStatusChangeMethod.PARAM_UID);
                    String strOptString2 = jSONObject2.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        arrayList.add(new C810540Vqu(jSONObject2));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C809030VoT.LJIIJ.LJIIIIZZ().getClass();
            if (!C086I.LIZIZ(arrayList)) {
                for (C810540Vqu c810540Vqu : arrayList) {
                    if (c810540Vqu != null) {
                        try {
                            if (c810540Vqu.LIZIZ) {
                                C808970VoN.LIZ.LIZIZ(application, c810540Vqu);
                            } else if (!TextUtils.equals(c810540Vqu.LIZJ, "push")) {
                                C808970VoN.LIZ.LIZLLL(application, c810540Vqu);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            }
        }
        String strOptString3 = jSONObject.optString("allow_push_list");
        boolean zEquals = Objects.equals(jSONObject.optString("token_refresh_flag"), "token_refresh");
        C809340Voy c809340VoyLIZ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZ();
        c809340VoyLIZ.LIZIZ.put("need_force_refresh_fcm", Boolean.valueOf(zEquals));
        c809340VoyLIZ.LIZ();
        int iOptInt = jSONObject.optInt("token_refresh_frequency");
        C809340Voy c809340VoyLIZ2 = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZ();
        c809340VoyLIZ2.LIZIZ.put("force_refresh_fcm_frequency", Integer.valueOf(iOptInt));
        c809340VoyLIZ2.LIZ();
        if (zEquals) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "server_return");
                ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("reset_token_result", jSONObject3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (TextUtils.isEmpty(strOptString3)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("UpdateSenderTask.parseResponse(");
            sbLIZ3.append(str6);
            sbLIZ3.append(") fail: pushListJsonStr is empty!!!");
            C2188811AlT.LIZIZ(sbLIZ3);
            LIZ(application, 303, str);
            return;
        }
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C0WFE.LIZ(application, LocalFrequencySettings.class);
        localFrequencySettings.LJFF(System.currentTimeMillis());
        localFrequencySettings.LJIIZILJ(str3);
        localFrequencySettings.LIZ(str4);
        localFrequencySettings.LJJIJIL(str5);
        localFrequencySettings.LJJI(str6);
        localFrequencySettings.LJIILJJIL(str2);
        try {
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (new JSONArray(strOptString3).length() <= 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("UpdateSenderTask.parseResponse(");
            sbLIZ4.append(str6);
            sbLIZ4.append(") fail: no validSenderList!!!");
            C2188811AlT.LIZIZ(sbLIZ4);
            LIZ(application, 303, str);
        } else {
            C809030VoT.LJIIJJI().LJFF();
        }
        this.LIZJ.set(true);
        LIZLLL(C809360Vp0.LIZ, strOptString3, true);
    }
}
