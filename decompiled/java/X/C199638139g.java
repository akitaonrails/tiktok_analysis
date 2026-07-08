package X;

import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.falconx.statistic.Common;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.139g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199638139g {
    public static volatile C199638139g LIZJ;
    public final Executor LIZ = C786410Ut5.i4(new ThreadFactory() { // from class: X.139h
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, "falconx-io-thread");
            ThreadMethodProxy.setPriority(bPEAThread, 3);
            return bPEAThread;
        }
    });
    public C19866412oA LIZIZ;

    public static C199638139g LIZIZ() {
        if (LIZJ == null) {
            synchronized (C199638139g.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C199638139g();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static void LIZ(InterceptorModel interceptorModel, Common common) throws JSONException {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        String str = interceptorModel.pageUrl;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        jSONObject.put("page_url", str);
        String str3 = interceptorModel.resRootDir;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("res_root_dir", str3);
        String str4 = interceptorModel.url;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("resource_url", str4);
        String str5 = interceptorModel.offlineRule;
        if (str5 != null) {
            str2 = str5;
        }
        jSONObject.put("offline_rule", str2);
        jSONObject.put("mime_type", interceptorModel.mimeType);
        jSONObject.put("offline_status", interceptorModel.offlineStatus);
        Long l = interceptorModel.offlineDuration;
        long jLongValue3 = 0;
        if (l == null) {
            jLongValue = 0;
        } else {
            jLongValue = l.longValue();
        }
        jSONObject.put("offline_duration", jLongValue);
        Long l2 = interceptorModel.onlineDuration;
        if (l2 == null) {
            jLongValue2 = 0;
        } else {
            jLongValue2 = l2.longValue();
        }
        jSONObject.put("online_duration", jLongValue2);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("sdk_version", common.sdkVersion);
        Long l3 = interceptorModel.pkgVersion;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        jSONObject.put("pkg_version", jLongValue3);
        jSONObject.put("access_key", interceptorModel.accessKey);
        jSONObject.put("channel", interceptorModel.channel);
        jSONObject.put("os", common.os);
        jSONObject.put("device_id", common.deviceId);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("region", common.region);
        jSONObject.put("ac", interceptorModel.ac);
        jSONObject.put("err_code", interceptorModel.errCode);
        jSONObject.put("err_msg", interceptorModel.errMsg);
        jSONObject.put("log_id", interceptorModel.logId);
    }

    public final void LIZJ(String str, String str2, String str3, InterceptorModel interceptorModel) {
        try {
            if (!TextUtils.isEmpty(this.LIZIZ.LJII) && interceptorModel != null) {
                StatisticData statisticData = new StatisticData();
                Common common = new Common();
                statisticData.mCommon = common;
                common.appVersion = str;
                common.deviceId = str2;
                common.region = str3;
                String string = UUID.randomUUID().toString();
                interceptorModel.startTime = null;
                interceptorModel.logId = string;
                InterfaceC19866612oC interfaceC19866612oC = this.LIZIZ.LJFF;
                if (interfaceC19866612oC != null) {
                    LIZ(interceptorModel, statisticData.mCommon);
                    if ((interfaceC19866612oC instanceof AbstractC199640139i) && interceptorModel.offlineStatus.intValue() == 1) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("aid", String.valueOf(0));
                        jSONObject.put("gecko_sdk_version", BuildConfig.VERSION_NAME);
                        jSONObject.put("access_key", interceptorModel.accessKey);
                        jSONObject.put("channel", interceptorModel.channel);
                        jSONObject.put("package_id", interceptorModel.pkgVersion);
                        jSONObject.put("from", "1");
                        jSONObject.put("isCombo", interceptorModel.isCombo);
                        if (!TextUtils.isEmpty(interceptorModel.channel) && !TextUtils.isEmpty(interceptorModel.url)) {
                            String str4 = interceptorModel.url;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(interceptorModel.channel);
                            sbLIZ.append("/");
                            String[] strArrSplit = str4.split(C2188811AlT.LIZIZ(sbLIZ));
                            if (strArrSplit.length == 2) {
                                jSONObject.put("path", strArrSplit[1]);
                            }
                        }
                        jSONObject.put("offline_rule", interceptorModel.offlineRule);
                        new JSONObject().put("read_duration", interceptorModel.offlineDuration);
                        String.valueOf(1234);
                        ((AbstractC199640139i) interfaceC19866612oC).LIZ();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1553130qWF.LJ("gecko-debug-tag", "falconx-report:", th);
        }
    }
}
