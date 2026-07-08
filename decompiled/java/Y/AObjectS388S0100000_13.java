package Y;

import X.C0VU0;
import X.C0XNW;
import X.C0XQ7;
import X.C2237608pi;
import X.C2344809Gs;
import X.C813830VwD;
import X.C824170WUt;
import X.C835170WpX;
import X.C844720XBu;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.sdk.ticketguard.TicketGuardApiKt;
import com.bytedance.android.sdk.ticketguard.TicketGuardFramework;
import com.bytedance.android.sdk.ticketguard.TicketGuardService;
import com.bytedance.android.sdk.ticketguard.UseTicketSnapshot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootRejectStrategyV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS388S0100000_13 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        C0VU0 c0vu0 = (C0VU0) aObjectS388S0100000_13.l0;
        c0vu0.getClass();
        String strLIZIZ = C835170WpX.LIZIZ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        c0vu0.LIZIZ = strLIZIZ;
        if (strLIZIZ == null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Npth", "getScopedDeviceId: null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        TrimMemoryTask trimMemoryTask = (TrimMemoryTask) aObjectS388S0100000_13.l0;
        trimMemoryTask.getClass();
        C2344809Gs.LJ("TrimMemoryTask");
        C2237608pi.LIZIZ(trimMemoryTask.LL);
        return null;
    }

    public static final Object invoke$2(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        C813830VwD c813830VwD = (C813830VwD) aObjectS388S0100000_13.l0;
        c813830VwD.put("digg_push", 2131847791);
        c813830VwD.put("comment_push", 2131847788);
        c813830VwD.put("follow_push", 2131847790);
        c813830VwD.put("mention_push", 2131847793);
        c813830VwD.put("im_push", 2131847789);
        c813830VwD.put("follow_new_video_push", 2131847800);
        c813830VwD.put("recommend_video_push", 2131847801);
        c813830VwD.put("live_push", 2131847792);
        c813830VwD.put("other_channel", 2131847795);
        return null;
    }

    public static final Object invoke$3(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        ((ColdBootRejectStrategyV2) aObjectS388S0100000_13.l0).LIZ();
        return null;
    }

    public static final Object invoke$4(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        C0XQ7.LIZJ().logoutWithLoadingIndicator("user_logout", "user_logout", (Bundle) aObjectS388S0100000_13.l0, null);
        return null;
    }

    public static final Object invoke$5(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        final C844720XBu c844720XBu = (C844720XBu) aObjectS388S0100000_13.l0;
        String strValueOf = String.valueOf(c844720XBu.LL.LIZ);
        C824170WUt.LIZJ(strValueOf).execute(new Runnable() { // from class: X.0XC3
            public final void LIZ() {
                String strOptString;
                String strOptString2;
                C844720XBu c844720XBu2 = c844720XBu;
                c844720XBu2.getClass();
                String first = C0XC5.LIZ.LIZIZ().getFirst();
                String base64ReePub = "";
                if (TextUtils.isEmpty(first)) {
                    strOptString = "";
                    strOptString2 = "";
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(first.substring(first.indexOf(124) + 1));
                        strOptString = jSONObject.optString("did", "");
                        try {
                            strOptString2 = jSONObject.optString("iid", "");
                        } catch (JSONException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            strOptString2 = "";
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        strOptString = "";
                    }
                }
                String string = c844720XBu2.LL.LIZJ().getString("device_id", "");
                String string2 = c844720XBu2.LL.LIZJ().getString("install_id", "");
                int i = (TextUtils.isEmpty(string) || !TextUtils.equals(string, strOptString)) ? 0 : 1;
                int i2 = (TextUtils.isEmpty(string2) || !TextUtils.equals(string2, strOptString2)) ? 0 : 1;
                if (i == 0 || i2 == 0) {
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("did", i);
                            jSONObject2.put("iid", i2);
                            ((C2210711Bfh) c844720XBu2.LL.LJJII).LIZ("device_zti_dtoken_not_match", jSONObject2);
                        } catch (JSONException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkOnDidNotMatch retryDSign :didMatch = ");
                        sbLIZ.append(i);
                        sbLIZ.append(" iIdMatch = ");
                        sbLIZ.append(i2);
                        C844870XCj.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        C0XCI.LJII(String.valueOf(c844720XBu2.LL.LIZ)).LJIIJ("zti_client_err", "10002");
                    }
                }
                C844720XBu c844720XBu3 = c844720XBu;
                c844720XBu3.getClass();
                InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
                if (interfaceC844780XCa == null || !interfaceC844780XCa.LIZJ("enable_check_public_key_on_init").booleanValue()) {
                    return;
                }
                SharedPreferences sharedPreferencesLIZIZ = C844580XBg.LIZIZ(c844720XBu3.LL.LIZJ);
                String string3 = sharedPreferencesLIZIZ == null ? "" : sharedPreferencesLIZIZ.getString("public_key_bound_device_token", "");
                if (TextUtils.isEmpty(string3)) {
                    return;
                }
                TicketGuardService service = TicketGuardFramework.INSTANCE.getService();
                if (service != null) {
                    try {
                        base64ReePub = service.getBase64ReePub();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getNewPublicKey failed: ");
                        sbLIZ2.append(th);
                        C844870XCj.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                if (TextUtils.isEmpty(base64ReePub) || TextUtils.equals(base64ReePub, string3)) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkOnPublicKeyChanged : newPublicKey = ");
                sbLIZ3.append(base64ReePub);
                sbLIZ3.append(" localPublicKey = ");
                sbLIZ3.append(string3);
                C844870XCj.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C0XCI.LJII(String.valueOf(c844720XBu3.LL.LIZ)).LJIIJ("zti_client_err", "10003");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InstallDispatcher@b733.realPerformZTIStartupChecks$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InstallDispatcher@b733.realPerformZTIStartupChecks$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS388S0100000_13 aObjectS388S0100000_13) {
        return GsonProtectorUtils.toJson(TicketGuardApiKt.getGson(), new UseTicketSnapshot((C0XNW) aObjectS388S0100000_13.l0));
    }

    public AObjectS388S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
