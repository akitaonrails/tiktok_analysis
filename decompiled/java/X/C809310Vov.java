package X;

import Y.ARunnableS18S0100100_13;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809310Vov implements WeakHandler.IHandler {
    public static volatile C809310Vov LLJJIJIIJIL;
    public final boolean LL;
    public final InterfaceC808500Vnc LLILLJJLI;
    public final Context LLILLL;
    public final WeakHandler LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public final C854540Xfg LLJJIII;
    public final AtomicBoolean LLJJIJI;

    public final void LIZIZ() {
        boolean zLIZIZ;
        if (this.LLILZIL) {
            try {
                this.LLILZ.removeMessages(0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis < this.LLJILLL) {
                    this.LLJILLL = jCurrentTimeMillis - ((long) (this.LLJJ * LSPassThroughRecordSizeConfig.DEFAULT));
                    C809350Voz.LIZ(this.LLILLL).LIZIZ(this.LLJILLL);
                }
                C809320Vow c809320Vow = C809040VoU.LIZ().LIZ;
                if (c809320Vow.LIZIZ) {
                    C813110Vv3.LIZJ().getClass();
                    zLIZIZ = !C813110Vv3.LLIZLLLIL;
                } else {
                    zLIZIZ = c809320Vow.LIZIZ("current_app_foreground", false);
                }
                if (zLIZIZ && C808480Vna.LIZ().LJJLIIIJLJLI()) {
                    if (C809190Voj.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isApplicationForeground = true now = ");
                        sbLIZ.append(jCurrentTimeMillis);
                        sbLIZ.append(" mIsForeground = ");
                        sbLIZ.append(this.LLJJI);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    WeakHandler weakHandler = this.LLILZ;
                    weakHandler.sendMessage(weakHandler.obtainMessage(4, Long.valueOf(jCurrentTimeMillis)));
                    return;
                }
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("isApplicationForeground = false now = ");
                    sbLIZ2.append(jCurrentTimeMillis);
                    sbLIZ2.append(" mIsForeground = ");
                    sbLIZ2.append(this.LLJJI);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("mLastLeaveTime = ");
                    sbLIZ3.append(this.LLJILJIL);
                    sbLIZ3.append(" mLastLaunchTime = ");
                    sbLIZ3.append(this.LLJIJIL);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
                long j = this.LLJILJIL;
                long j2 = this.LLJIJIL;
                long j3 = j < j2 ? (jCurrentTimeMillis - j2) - 900000 : jCurrentTimeMillis - j;
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("duration = ");
                    sbLIZ4.append(j3 / 1000);
                    sbLIZ4.append(" mQueryWaitingDuration = ");
                    sbLIZ4.append(this.LLIZ);
                    sbLIZ4.append(" mNextQueryInterval = ");
                    sbLIZ4.append(this.LLJJ);
                    sbLIZ4.append(" mLastRequestTime = ");
                    sbLIZ4.append(this.LLJILLL);
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
                if (j3 < this.LLIZ * LSPassThroughRecordSizeConfig.DEFAULT || jCurrentTimeMillis - this.LLJILLL < this.LLJJ * LSPassThroughRecordSizeConfig.DEFAULT) {
                    WeakHandler weakHandler2 = this.LLILZ;
                    weakHandler2.sendMessage(weakHandler2.obtainMessage(4, Long.valueOf(jCurrentTimeMillis)));
                    return;
                }
                boolean zLJI = MethodIDManager.LJI(137705);
                if (this.LLJJIJI.get()) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } else {
                    this.LLJJIJI.getAndSet(true);
                    RunnableC823120WQs.LIZIZ(new ARunnableS18S0100100_13(jCurrentTimeMillis, this, 4));
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIIIZZ() {
        String strLJ = C809350Voz.LIZ(this.LLILLL).LIZ.LJ("red_badge_last_valid_response");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryUseLastValidResponse: lastRes = ");
        sbLIZ.append(strLJ);
        sbLIZ.append("  isUseRedBadgeLastValidResponse() = ");
        sbLIZ.append(C809350Voz.LIZ(this.LLILLL).LIZ.LIZIZ("red_badge_is_use_last_valid_response", true));
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C809350Voz.LIZ(this.LLILLL).LIZ.LIZIZ("red_badge_is_use_last_valid_response", true) || TextUtils.isEmpty(strLJ)) {
            return;
        }
        try {
            int iLIZJ = C809350Voz.LIZ(this.LLILLL).LIZ.LIZJ("red_badge_show_times", 0);
            if (!DateUtils.isToday(this.LLJILJILJ) && iLIZJ > 0) {
                iLIZJ = 0;
            }
            if (iLIZJ >= this.LLILZLL) {
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("badge_show_times = ");
                    sbLIZ2.append(iLIZJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                C809330Vox.LIZ("event_v1", "red_badge", "outdo_max_show_times", iLIZJ, this.LLILZLL, null);
                return;
            }
            JSONObject jSONObject = new JSONObject(strLJ);
            if ("success".equals(JSONObjectProtectorUtils.getString(jSONObject, "reason"))) {
                jSONObject.put("content", jSONObject.optInt("content", 0) + 1);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("tryUseLastValidResponse: res = ");
                sbLIZ3.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ3);
                C809330Vox.LIZIZ("use_last_valid_response", jSONObject);
                this.LLJILLL = System.currentTimeMillis();
                this.LLJJ = jSONObject.optInt("next_query_interval", 0) + 600;
                try {
                    C809350Voz c809350VozLIZ = C809350Voz.LIZ(this.LLILLL);
                    String strJ3 = C786410Ut5.J3(jSONObject);
                    C809340Voy c809340VoyLIZ = c809350VozLIZ.LIZ.LIZ();
                    c809340VoyLIZ.LIZIZ.put("red_badge_last_valid_response", strJ3);
                    c809340VoyLIZ.LIZ();
                    Intent intent = new Intent("com.ss.android.redbadge.message");
                    intent.putExtra("message_data", C786410Ut5.J3(jSONObject));
                    intent.setPackage(this.LLILLL.getPackageName());
                    if (Build.VERSION.SDK_INT < 26 || C809360Vp0.LIZ.getApplicationInfo().targetSdkVersion < 26) {
                        C786410Ut5.s3(this.LLILLL, intent);
                    } else {
                        Context context = this.LLILLL;
                        C2204961BRm.LJJJJ(context, intent, new ServiceConnectionC805290ViR(context, intent), 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI7zvlImrF4sWInjo5Rj/BQ37Aj", null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C809350Voz.LIZ(this.LLILLL).LIZIZ(this.LLJILLL);
                C809350Voz c809350VozLIZ2 = C809350Voz.LIZ(this.LLILLL);
                int i = this.LLJJ;
                C809340Voy c809340VoyLIZ2 = c809350VozLIZ2.LIZ.LIZ();
                c809340VoyLIZ2.LIZIZ.put("red_badge_next_query_interval", Integer.valueOf(i));
                c809340VoyLIZ2.LIZ();
            }
            C809350Voz.LIZ(this.LLILLL).LIZIZ(this.LLJILLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C809310Vov(InterfaceC808500Vnc interfaceC808500Vnc) throws Exception {
        C808510Vnd.LIZ().getClass();
        final WeakHandler weakHandler = new WeakHandler(C786410Ut5.W2(C808510Vnd.LLILLL), this);
        this.LLILZ = weakHandler;
        this.LLJJI = false;
        this.LLJJIII = new C854540Xfg(this, 6);
        this.LLJJIJI = new AtomicBoolean(false);
        ContentObserver contentObserver = new ContentObserver(weakHandler) { // from class: X.0Vp1
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                C809310Vov c809310Vov = this.LIZ;
                c809310Vov.LIZLLL(c809310Vov.LLILLL);
            }
        };
        ContentObserver contentObserver2 = new ContentObserver(weakHandler) { // from class: X.0Vp2
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                C809310Vov c809310Vov = this.LIZ;
                c809310Vov.LIZLLL(c809310Vov.LLILLL);
            }
        };
        ContentObserver contentObserver3 = new ContentObserver(weakHandler) { // from class: X.0Vp3
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                C809310Vov c809310Vov = this.LIZ;
                c809310Vov.LJ(c809310Vov.LLILLL);
            }
        };
        this.LLILLJJLI = interfaceC808500Vnc;
        Context contextN3 = C786410Ut5.N3(((C809130Vod) interfaceC808500Vnc).LIZ.LIZ);
        this.LLILLL = contextN3;
        LIZLLL(contextN3);
        if (contextN3 != null) {
            try {
                contextN3.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZJ(contextN3, "is_desktop_red_badge_show", "boolean"), true, contentObserver);
                contextN3.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZJ(contextN3, "desktop_red_badge_args", "string"), true, contentObserver2);
                contextN3.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZJ(contextN3, "red_badge_last_time_paras", "string"), true, contentObserver3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (this.LLILZIL) {
            C786410Ut5.LJIJJ(this.LLILLL, this.LLJJIII, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            LJ(this.LLILLL);
            this.LLILZ.sendEmptyMessageDelayed(0, 10000L);
        }
        this.LL = true;
    }

    public static C809310Vov LIZJ(InterfaceC808500Vnc interfaceC808500Vnc) {
        if (LLJJIJIIJIL == null) {
            synchronized (C809310Vov.class) {
                try {
                    if (LLJJIJIIJIL == null) {
                        LLJJIJIIJIL = new C809310Vov(interfaceC808500Vnc);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJJIJIIJIL;
    }

    public static JSONObject LJII(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (C2093608Ic.LJ(str)) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            LIZ("launch", jSONObject);
            LIZ("leave", jSONObject);
            LIZ("badge", jSONObject);
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            TryCatchGuardChecker.doCheck(th);
            return jSONObject2;
        }
    }

    public final void LIZLLL(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.LLILZIL = C809350Voz.LIZ(this.LLILLL).LIZ.LIZIZ("is_desktop_red_badge_show", false);
            String strLJ = C809350Voz.LIZ(this.LLILLL).LIZ.LJ("desktop_red_badge_args");
            if (C2093608Ic.LJ(strLJ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strLJ);
            this.LLILZLL = jSONObject.optInt("max_show_times", 5);
            this.LLIZ = jSONObject.optInt("query_waiting_duration", 30);
            this.LLIZLLLIL = jSONObject.optString("strategy");
            if (!this.LLILZIL) {
                this.LLILZ.removeMessages(0);
                this.LLILZ.removeMessages(1);
                this.LLILZ.removeMessages(2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.LLJILLL = C809350Voz.LIZ(this.LLILLL).LIZ.LIZLLL("red_badge_last_request_time", 0L);
            this.LLJJ = C809350Voz.LIZ(this.LLILLL).LIZ.LIZJ("red_badge_next_query_interval", 600);
            this.LLJ = C809350Voz.LIZ(this.LLILLL).LIZ.LJ("red_badge_last_time_paras");
            this.LLJI = C809350Voz.LIZ(this.LLILLL).LIZ.LJ("red_badge_last_last_time_paras");
            if (C2093608Ic.LJ(this.LLJ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(this.LLJ);
            this.LLJIJIL = jSONObject.optLong("launch");
            this.LLJILJIL = jSONObject.optLong("leave");
            this.LLJILJILJ = jSONObject.optLong("badge");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                long jLongValue = ((Long) HandlerHook.getMessageObj(message.obj)).longValue();
                                long j = this.LLJJ * LSPassThroughRecordSizeConfig.DEFAULT;
                                long j2 = this.LLJILLL + j;
                                if (jLongValue <= j2) {
                                    j = j2 - jLongValue;
                                }
                                if (C809190Voj.LIZ()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("next schedule time = ");
                                    sbLIZ.append(DateFormat.getDateTimeInstance().format(new Date(jLongValue + j)));
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                                this.LLILZ.sendEmptyMessageDelayed(0, j);
                                return;
                            }
                            return;
                        }
                        long jLongValue2 = ((Long) HandlerHook.getMessageObj(message.obj)).longValue();
                        long j3 = this.LLJJ * LSPassThroughRecordSizeConfig.DEFAULT;
                        if (C809190Voj.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("next schedule time = ");
                            sbLIZ2.append(DateFormat.getDateTimeInstance().format(new Date(jLongValue2 + j3)));
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        this.LLILZ.sendEmptyMessageDelayed(0, j3);
                        return;
                    }
                    if (this.LLILZIL) {
                        this.LLJJI = false;
                        this.LLILZ.removeMessages(0);
                        this.LLILZ.sendEmptyMessageDelayed(0, this.LLIZ * LSPassThroughRecordSizeConfig.DEFAULT);
                        return;
                    }
                    return;
                }
                if (this.LLILZIL) {
                    this.LLJJI = true;
                    if (!this.LLILZ.hasMessages(0)) {
                        this.LLILZ.sendEmptyMessageDelayed(0, this.LLJJ * LSPassThroughRecordSizeConfig.DEFAULT);
                        return;
                    }
                    return;
                }
                return;
            }
            LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        if (!C2093608Ic.LJ(str)) {
            try {
                jSONObject.put(str, jSONObject.optLong(str) / 1000);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJFF(String str, Bundle bundle) {
        Object obj;
        if (C2093608Ic.LJ(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_event_v3", 1);
            for (String str2 : bundle.keySet()) {
                try {
                    obj = bundle.get(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                jSONObject.put(str2, obj);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C809330Vox.LIZ("event_v3", str, null, 0L, 0L, jSONObject);
    }

    public final void LJI(int i, int i2, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" red_badge_request_result result: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("result", str, bundle);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append("");
        C786410Ut5.LJJJI("badge_show_times", C2188811AlT.LIZIZ(sbLIZ2), bundle);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i2);
        sbLIZ3.append("");
        C786410Ut5.LJJJI("max_badge_show_times", C2188811AlT.LIZIZ(sbLIZ3), bundle);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(System.currentTimeMillis());
        sbLIZ4.append("");
        C786410Ut5.LJJJI("client_utc_time_ms", C2188811AlT.LIZIZ(sbLIZ4), bundle);
        C786410Ut5.LJJJI("exception_str", str2, bundle);
        LJFF("red_badge_request_result", bundle);
    }
}
