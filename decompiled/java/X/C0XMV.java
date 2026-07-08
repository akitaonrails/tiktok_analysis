package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.sdk.ticketguard.TicketGuardService;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ShowDialogActivity;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XMV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMV implements WeakHandler.IHandler {
    public static C0XMV LLJJJIL;
    public static volatile boolean LLJJJJ;
    public static volatile boolean LLJJJJJIL;
    public volatile boolean LL;
    public volatile boolean LLILLJJLI;
    public volatile boolean LLILLL;
    public final C0XMX LLILZLL;
    public final Context LLIZ;
    public final WeakHandler LLIZLLLIL;
    public final C847460XMi LLJ;
    public C0XMW LLJIJIL;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJILLL;
    public volatile boolean LLJJI;
    public volatile boolean LLJJIII;
    public volatile JSONObject LLJJIJI;
    public final C0WFU LLJJIJIIJIL;
    public final Object LLILZ = new Object();
    public volatile C847470XMj LLILZIL = new C847470XMj("", "", "");
    public volatile int LLJI = 0;
    public volatile boolean LLJILJIL = true;
    public volatile boolean LLJJ = true;
    public volatile boolean LLJJIJIL = false;
    public final Object LLJJJ = new Object();

    /* JADX WARN: Type inference failed for: r1v7, types: [X.0XMY] */
    public final void LIZ() {
        Context contextLIZLLL;
        synchronized (this.LLJJJ) {
            try {
                this.LLJJIJIL = true;
                this.LLJJJ.notifyAll();
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!LLJJJJJIL) {
            HashMap map = new HashMap();
            map.put("error_case", "sIsMainProcess is false in afterInit");
            C847400XMc.LJIILIIL("TokenBeatException", new Throwable(map.toString()), map.toString(), map);
            return;
        }
        TicketGuardService ticketGuardService = C0XNB.LIZ;
        if (ticketGuardService != null) {
            ticketGuardService.setNTPTimeProvider(this.LLJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        boolean z = C847400XMc.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("https://");
        C847400XMc.LJ();
        sbLIZ2.append("api-va.tiktokv.com");
        sbLIZ2.append("/passport/account/info/v2/");
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append("cache");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean zLJII = C847400XMc.LJII();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("isLogin = ");
        sbLIZ3.append(zLJII);
        C847400XMc.LJIIIZ("TokenFactory", C2188811AlT.LIZIZ(sbLIZ3));
        String strOptString = null;
        if (zLJII) {
            C847410XMd.LIZ();
            if (C847410XMd.LIZLLL) {
                C847400XMc.LJIIIZ("TokenFactory", "do account/info request, login");
                C847400XMc.LJIILL(null, "boot");
            }
        } else {
            C310980CGy c310980CGyLIZ = C310980CGy.LIZ();
            c310980CGyLIZ.getClass();
            if (!TextUtils.isEmpty(strLIZIZ)) {
                if (c310980CGyLIZ.LIZ == null && (contextLIZLLL = C847400XMc.LIZLLL()) != null) {
                    c310980CGyLIZ.LIZ = C810670Vr7.LIZJ(contextLIZLLL, 0, "com_bytedance_sdk_account_utils_common_request_cache_helper");
                }
                SharedPreferences sharedPreferences = c310980CGyLIZ.LIZ;
                if (sharedPreferences != null) {
                    String strLIZIZ2 = C310980CGy.LIZIZ(strLIZIZ);
                    String string = sharedPreferences.getString(strLIZIZ2, "");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            if (System.currentTimeMillis() < jSONObject.optLong("expire_timing")) {
                                strOptString = jSONObject.optString("cache_value", "");
                            } else {
                                sharedPreferences.edit().putString(strLIZIZ2, "").apply();
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cache = ");
            sbLIZ4.append(strOptString);
            C847400XMc.LJIIIZ("TokenFactory", C2188811AlT.LIZIZ(sbLIZ4));
            if (TextUtils.isEmpty(strOptString)) {
                C847400XMc.LJIIIZ("TokenFactory", "do account/info request, un-login");
                C847400XMc.LJIILL(new InterfaceC847590XMv() { // from class: X.0XMY
                    @Override // X.InterfaceC847590XMv
                    public final void LIZ(C847380XMa c847380XMa) {
                        try {
                            if (c847380XMa.LJ.optLong("user_id", 0L) > 0) {
                                C0XMZ.LJIIJ("syn_login_status_error", null);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            HashMap map2 = new HashMap();
                            map2.put("error_case", "parsing data after get user info success");
                            map2.put("error_detail", e2.getMessage());
                            C847400XMc.LJIILIIL("TokenBeatException", new Throwable(map2.toString()), map2.toString(), map2);
                        }
                        C310980CGy.LIZ().LIZJ(System.currentTimeMillis() + 86400000, strLIZIZ);
                    }

                    @Override // X.InterfaceC847590XMv
                    public final void LIZIZ(C847380XMa c847380XMa) {
                        C310980CGy.LIZ().LIZJ(System.currentTimeMillis() + 86400000, strLIZIZ);
                    }
                }, "normal");
            }
        }
        LJIIIZ(true);
    }

    public final void LIZIZ() {
        C847400XMc.LJIIIZ("TokenFactory", "clearToken");
        LJIIIIZZ(new C847470XMj("", "", ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r12 = this;
            java.lang.Object r2 = r12.LLILZ
            monitor-enter(r2)
            X.0WFU r3 = r12.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "X-Tt-Token"
            java.lang.String r0 = ""
            java.lang.String r5 = r3.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lbc
            r7 = 0
            if (r0 != 0) goto L42
            X.0WFU r3 = r12.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "ts_sign"
            java.lang.String r0 = ""
            java.lang.String r3 = r3.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            X.0WFU r1 = r12.LLJJIJIIJIL     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "uid"
            java.lang.String r1 = r1.LIZ(r0, r7)     // Catch: java.lang.Throwable -> Lbc
        L2a:
            X.0XMj r0 = new X.0XMj     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r5, r3, r1)     // Catch: java.lang.Throwable -> Lbc
            r12.LLILZIL = r0     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "change.token"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> Lbc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L46
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L46
            goto L44
        L42:
            r1 = r7
            goto L2a
        L44:
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r12.LLILLJJLI = r0     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbc
            X.0WFU r1 = r12.LLJJIJIIJIL
            java.lang.String r2 = "first_beat"
            r1.getClass()
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L5c
            android.content.SharedPreferences r0 = r1.LIZJ     // Catch: java.lang.Throwable -> Lb2
            boolean r3 = r0.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> Lb2
            goto Lb9
        L5c:
            android.content.Context r0 = r1.LIZ     // Catch: java.lang.Throwable -> Lb2
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lb2
            android.content.Context r1 = r1.LIZ     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "boolean"
            android.net.Uri r6 = com.ss.android.token.AuthTokenMultiProcessSharedProvider.LIZIZ(r1, r2, r0)     // Catch: java.lang.Throwable -> Lb2
            X.0WZX r11 = new X.0WZX     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKco0nino4bHADTxvbY1AZTMpKa5gKsrgM4xWFcxC4Ak/yVrvtbHUd310="
            r11.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lb2
            r8 = r7
            r9 = r7
            r10 = r7
            android.database.Cursor r2 = X.C2204961BRm.LJJJ(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto Lb9
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L86
            int r0 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L8d
            if (r0 <= 0) goto L87
        L86:
            r4 = 1
        L87:
            r2.close()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb2
            goto La0
        L8b:
            r0 = move-exception
            goto L9a
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La2
            X.C0XMZ.LIZJ(r0)     // Catch: java.lang.Throwable -> La2
            r2.close()     // Catch: java.lang.Exception -> L98 java.lang.Throwable -> Lb2
            goto Lb9
        L98:
            r0 = move-exception
            r4 = 1
        L9a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb2
            X.C0XMZ.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb2
        La0:
            r3 = r4
            goto Lb9
        La2:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La2
            r2.close()     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb2
            goto Lb1
        Laa:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb2
            X.C0XMZ.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            throw r1     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C0XMZ.LIZJ(r0)
        Lb9:
            r12.LLJILJILJ = r3
            return
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XMV.LJFF():void");
    }

    public static String LIZJ(Object obj) {
        if (obj == null) {
            return "";
        }
        String string = obj.toString();
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.length() > 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, 9));
            sbLIZ.append("***");
            sbLIZ.append(string.substring(string.length() - 5));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return string;
    }

    public final boolean LJ(String str) {
        if (!this.LLJILJIL) {
            return false;
        }
        Set<String> set = this.LLILZLL.LIZIZ;
        if (TextUtils.isEmpty(str) || set == null) {
            return false;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = (CopyOnWriteArraySet) set;
        if (copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        for (String strLIZIZ : copyOnWriteArraySet) {
            if (!TextUtils.isEmpty(strLIZIZ)) {
                if (!str.equals(strLIZIZ)) {
                    if (!strLIZIZ.startsWith(e3.d)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(e3.d);
                        sbLIZ.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (str.endsWith(strLIZIZ)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIIIIZZ(C847470XMj c847470XMj) {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setTokenObject ");
                sbLIZ.append(c847470XMj.LIZ());
                C847400XMc.LJIIIZ("TokenFactory", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZIL = c847470XMj;
                C0WFU c0wfu = this.LLJJIJIIJIL;
                c0wfu.getClass();
                C0WFT c0wft = new C0WFT(c0wfu.LIZ);
                c0wft.LIZIZ.put("X-Tt-Token", c847470XMj.LIZ);
                c0wft.LIZIZ.put("ts_sign", c847470XMj.LIZIZ);
                String str = c847470XMj.LIZJ;
                if (str != null) {
                    c0wft.LIZIZ.put("uid", str);
                }
                c0wft.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C847400XMc.LJIIJJI();
        String str2 = c847470XMj.LIZ;
        if (!"change.token".equals(str2) && !TextUtils.isEmpty(str2)) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
        String str3 = c847470XMj.LIZ;
        String str4 = c847470XMj.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ticket", C0XNP.LIZ(str3));
        jSONObject.put("ts_sign", C0XNP.LIZ(str4));
        C0XNL.LIZ("ticket_sign_update", "x-tt-token", 0, null, C786410Ut5.J3(jSONObject), null);
    }

    public final void LJIIIZ(boolean z) {
        boolean zLJI = MethodIDManager.LJI(137822);
        LJIIJ(z, null, null, null, null, null, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C0XN7 c0xn7;
        int i = message.what;
        if (i == 1000) {
            this.LLIZLLLIL.removeMessages(LSPassThroughRecordSizeConfig.DEFAULT);
            LJIIIZ(false);
            return;
        }
        if (i != 2000 || !LLJJJJJIL) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = C847400XMc.LJ;
        if (C847400XMc.LJII() && !this.LLJILLL) {
            String string = this.LLIZ.getString(2131836235);
            if (!z) {
                C0XMZ.LIZIZ("token_beat_not_poll", string, null);
                HashMap map = new HashMap();
                map.put("error_case", "token_beat_not_poll");
                C847400XMc.LJIILIIL("TokenBeatException", new Throwable(map.toString()), map.toString(), map);
            }
            sb.append(string);
        }
        if (!this.LLJJ) {
            String string2 = this.LLIZ.getString(2131829416);
            if (!z) {
                C0XMZ.LIZIZ("token_beat_not_config", string2, this.LLJJIJI);
                HashMap map2 = new HashMap();
                map2.put("error_case", "token_beat_not_config");
                C847400XMc.LJIILIIL("TokenBeatException", new Throwable(map2.toString()), map2.toString(), map2);
            }
            sb.append(string2);
        }
        if (C847400XMc.LJIIIIZZ() && (!this.LLJJI || !this.LLJJIII)) {
            String string3 = this.LLIZ.getString(2131847059);
            if (!z) {
                C0XMZ.LIZIZ("sdk-version-not-add", string3, null);
            }
            sb.append(string3);
        }
        if (!this.LLILZLL.LIZJ) {
            if (!z) {
                C0XMZ.LJIIL("tt_token_not_call_add_host_list", null);
            }
            sb.append(this.LLIZ.getString(2131850561));
        }
        String string4 = sb.toString();
        if (!z || TextUtils.isEmpty(string4) || (c0xn7 = C847400XMc.LJFF) == null) {
            return;
        }
        Context contextLIZ = C848000XOk.LIZ();
        Intent intent = new Intent(contextLIZ, (Class<?>) ShowDialogActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("event", "event_dialog");
        intent.putExtra("title", "token sdk status error");
        intent.putExtra("message", string4);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, contextLIZ);
        C2204961BRm.LJJJJJL(contextLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKVW3C/8nDR0BssbJ4LrLfQl7u", null));
    }

    public C0XMV(Context context, C0XMX c0xmx) {
        SharedPreferences sharedPreferencesLIZJ;
        C0WFU c0wfu;
        SharedPreferences sharedPreferencesLIZJ2;
        Set<String> stringSet;
        this.LLILZLL = c0xmx;
        ((CopyOnWriteArraySet) c0xmx.LIZIZ).addAll(Arrays.asList("tiktokv.com", "tiktokv.us", "tiktokv.eu"));
        Context contextLIZLLL = C847400XMc.LIZLLL();
        if (contextLIZLLL != null) {
            sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLIZLLL, 0, "com_ss_android_token_sp_host");
        } else {
            sharedPreferencesLIZJ = null;
        }
        if (sharedPreferencesLIZJ != null && (stringSet = sharedPreferencesLIZJ.getStringSet("share_cookie_host_list", null)) != null) {
            ((CopyOnWriteArraySet) c0xmx.LIZIZ).addAll(stringSet);
        }
        Context contextLIZLLL2 = C847400XMc.LIZLLL();
        if (contextLIZLLL2 != null && (sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(contextLIZLLL2, 0, "ss_app_config")) != null) {
            String string = sharedPreferencesLIZJ2.getString("share_cookie_host_list", "");
            HashSet hashSet = new HashSet();
            if (!TextUtils.isEmpty(string)) {
                String[] strArrSplit = string.split(",");
                if (strArrSplit.length > 0) {
                    for (String strSubstring : strArrSplit) {
                        if (!TextUtils.isEmpty(strSubstring)) {
                            if (strSubstring.length() > 1 && strSubstring.startsWith(e3.d)) {
                                strSubstring = strSubstring.substring(1);
                            }
                            hashSet.add(strSubstring);
                        }
                    }
                }
            }
            ((CopyOnWriteArraySet) c0xmx.LIZIZ).addAll(hashSet);
        }
        c0xmx.LIZ();
        Context contextN3 = C786410Ut5.N3(context);
        this.LLIZ = contextN3;
        Application application = (Application) contextN3;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0XMo
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    C847580XMu.LIZIZ.remove(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    C847580XMu.LIZ++;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    C847580XMu.LIZ--;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C847580XMu.LIZIZ.add(activity);
                }
            });
        }
        LLJJJJJIL = C2104208Me.LIZ(contextN3);
        boolean z = LLJJJJJIL;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            if (AuthTokenMultiProcessSharedProvider.LLIZLLLIL == null) {
                AuthTokenMultiProcessSharedProvider.LLIZLLLIL = new C0WFU(contextN3, z);
            }
            c0wfu = AuthTokenMultiProcessSharedProvider.LLIZLLLIL;
        }
        this.LLJJIJIIJIL = c0wfu;
        WeakHandler weakHandler = new WeakHandler(Looper.getMainLooper(), this);
        this.LLIZLLLIL = weakHandler;
        this.LLJ = new C847460XMi(contextN3);
        if (LLJJJJJIL) {
            if (!TextUtils.isEmpty(c0xmx.LIZ)) {
                LJFF();
            } else {
                HashMap map = new HashMap();
                map.put("error_case", "beat host is empty");
                C847400XMc.LJIILIIL("TokenBeatException", new Throwable(map.toString()), map.toString(), map);
                throw new IllegalStateException("not set beat host");
            }
        }
        C786410Ut5.LJLJJI(2000, 60000L, weakHandler);
        if (c0xmx.LIZLLL) {
            CopyOnWriteArrayList<InterfaceC847570XMt> copyOnWriteArrayList = C847560XMs.LIZ;
            Function1<Boolean, Unit> function1 = new Function1<Boolean, Unit>() { // from class: X.0XMm
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Boolean bool) {
                    this.LL.LIZ();
                    return null;
                }
            };
            boolean zLJI = MethodIDManager.LJI(196613);
            try {
                Class.forName("com.bytedance.sdk.account.ticketguard.AccountTicketGuardHelper").getDeclaredMethod("initTicketGuard", Context.class, Long.TYPE, Function1.class).invoke(null, contextN3, Long.valueOf(c0xmx.LJ), function1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                function1.invoke(Boolean.FALSE);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            C0XNL.LIZ("start_ticket_guard_sdk", "all", 0, null, null, null);
        } else {
            LIZ();
        }
        LLJJJJ = true;
    }

    public static void LJII(final String str, Object obj) {
        C0XNJ c0xnj;
        C0XNJ c0xnj2;
        C0XA4 c0xa4;
        C0XMX c0xmx;
        C0XMX c0xmx2;
        Activity activityLIZIZ = null;
        if (C847400XMc.LIZ && (c0xmx2 = LLJJJIL.LLILZLL) != null) {
            c0xnj = c0xmx2.LJII;
        } else {
            c0xnj = null;
        }
        if (c0xnj != null) {
            if (C847400XMc.LIZ && (c0xmx = LLJJJIL.LLILZLL) != null) {
                c0xnj2 = c0xmx.LJII;
            } else {
                c0xnj2 = null;
            }
            c0xnj2.getClass();
            try {
                c0xa4 = (C0XA4) obj;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0xa4 = null;
            }
            if (c0xa4 == null) {
                C0XQ5.LIZLLL();
                c0xa4 = new C0XA4();
                if ("frontier".equals(str) || "sdk_expired_logout".equals(str)) {
                    c0xa4.LIZ = true;
                }
            }
            if (C290680BaM.LIZ() && c0xa4.LIZ) {
                C01GW<C0XA3> c01gw = C0XA3.LIZIZ;
                C0XA3 c0xa3LIZ = C842840X4o.LIZ();
                c0xa3LIZ.getClass();
                try {
                    if (c0xa3LIZ.LIZ.compareAndSet(false, true)) {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                        }
                        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                        if (activityLIZIZ != null && iUserService != null && iUserService.isLogin()) {
                            C0XA3.LIZLLL(c0xa4);
                            C0XA3.LIZIZ(c0xa4);
                            String str2 = c0xa4.LIZJ;
                            String str3 = LogoutDialogActivity._pnsPageId;
                            Bundle bundle = new Bundle();
                            if (str2 != null) {
                                C786410Ut5.LJJJI("from_path", str2, bundle);
                            }
                            C0D97.LIZ(activityLIZIZ, bundle);
                            return;
                        }
                        c0xa3LIZ.LIZ.set(false);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            C0XU6.LIZ().LIZJ("expired_logout", "sdk_expired_logout", null, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("error_case", "getLogoutProcessor = null");
        C847400XMc.LJIILIIL("SessionExpiredLogout", new Throwable(map.toString()), map.toString(), map);
        HashMap map2 = new HashMap();
        map2.put("logout_from", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        C847400XMc.LJ();
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append("/passport/user/logout/");
        C847400XMc.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ), null, map2, false, new InterfaceC847590XMv() { // from class: X.0XMh
            public final /* synthetic */ InterfaceC847590XMv LIZ = null;

            @Override // X.InterfaceC847590XMv
            public final void LIZ(C847380XMa c847380XMa) {
                InterfaceC847590XMv interfaceC847590XMv = this.LIZ;
                if (interfaceC847590XMv != null) {
                    interfaceC847590XMv.LIZ(c847380XMa);
                }
                C0XNG c0xng = C847400XMc.LJI;
                if (c0xng != null) {
                    String str4 = str;
                    C0XGH c0xgh = new C0XGH(1);
                    C0XGH.LIZ(str4);
                    C0XO0.LIZLLL(C848000XOk.LIZ()).LJII(c0xgh);
                }
            }

            @Override // X.InterfaceC847590XMv
            public final void LIZIZ(C847380XMa c847380XMa) {
                InterfaceC847590XMv interfaceC847590XMv = this.LIZ;
                if (interfaceC847590XMv != null) {
                    interfaceC847590XMv.LIZIZ(c847380XMa);
                }
            }
        });
    }

    public static void LJI(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("error_type", str);
        map.put("path", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put("error_code", str3);
        }
        C847400XMc.LJIILIIL("ZtiException", new Throwable(map.toString()), map.toString(), map);
    }

    public final String LIZLLL(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4 = this.LLILZLL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str4);
        sbLIZ.append("/passport/token/beat/v2/");
        C018L c018l = new C018L(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            str2 = "boot";
        } else {
            str2 = "polling";
        }
        if (z2) {
            str2 = "wap_login";
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        c018l.LIZ(Scene.SCENE_SERVICE, str);
        if (this.LLJILJILJ) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        c018l.LIZ("first_beat", str3);
        return c018l.toString();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0XMW] */
    public final void LJIIJ(boolean z, final String str, final String str2, final String str3, final String str4, final String str5, final Object obj) {
        boolean zLJI = MethodIDManager.LJI(137822);
        if (!LLJJJJJIL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!this.LL) {
            this.LL = true;
            this.LLJILLL = true;
            if (!C847400XMc.LJIIIIZZ()) {
                this.LLJI++;
                C786410Ut5.LJLJJI(LSPassThroughRecordSizeConfig.DEFAULT, Math.min(((long) this.LLJI) * 10000, this.LLILZLL.LJI), this.LLIZLLLIL);
                this.LL = false;
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (!C847400XMc.LJII()) {
                C786410Ut5.LJLJJI(LSPassThroughRecordSizeConfig.DEFAULT, this.LLILZLL.LJI, this.LLIZLLLIL);
                this.LL = false;
                EnumC846850XJz enumC846850XJz = EnumC846850XJz.NOT_LOGIN;
                if (TextUtils.equals(str, "session_expired")) {
                    C0XMZ.LJIIIIZZ(str2, str3, str4, str5, enumC846850XJz);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            this.LLJI = 0;
            final String strLIZLLL = LIZLLL(str, z, false);
            if (!TextUtils.isEmpty(strLIZLLL)) {
                this.LLJIJIL = new InterfaceC847590XMv() { // from class: X.0XMW
                    @Override // X.InterfaceC847590XMv
                    public final void LIZ(C847380XMa c847380XMa) {
                        try {
                            this.LJII.LL = false;
                            C0XMV c0xmv = this.LJII;
                            C786410Ut5.LJLJJI(LSPassThroughRecordSizeConfig.DEFAULT, c0xmv.LLILZLL.LJI, c0xmv.LLIZLLLIL);
                            if (this.LJII.LLJILJILJ) {
                                this.LJII.LLJILJILJ = false;
                                C0WFU c0wfu = this.LJII.LLJJIJIIJIL;
                                if (c0wfu != null) {
                                    C0WFT c0wft = new C0WFT(c0wfu.LIZ);
                                    c0wft.LIZIZ.put("first_beat", Boolean.FALSE);
                                    c0wft.LIZ();
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0XMZ.LIZJ(e);
                        }
                        C0XMZ.LJI(c847380XMa.LIZ, strLIZLLL, c847380XMa.LIZJ, true);
                        C0XMV c0xmv2 = this.LJII;
                        String str6 = str;
                        String str7 = str2;
                        String str8 = str3;
                        String str9 = str4;
                        String str10 = str5;
                        EnumC846850XJz enumC846850XJz2 = EnumC846850XJz.IGNORE;
                        c0xmv2.getClass();
                        if (TextUtils.equals(str6, "session_expired")) {
                            C0XMZ.LJIIIIZZ(str7, str8, str9, str10, enumC846850XJz2);
                        }
                    }

                    @Override // X.InterfaceC847590XMv
                    public final void LIZIZ(C847380XMa c847380XMa) {
                        String strOptString;
                        String strOptString2;
                        try {
                            EnumC846850XJz enumC846850XJz2 = EnumC846850XJz.TOKEN_BEAT_FAIL;
                            this.LJII.LL = false;
                            JSONObject jSONObject = c847380XMa.LJ;
                            if (jSONObject != null) {
                                strOptString = jSONObject.optString("error_name");
                                strOptString2 = c847380XMa.LJ.optString("log_id");
                            } else {
                                strOptString = null;
                                strOptString2 = null;
                            }
                            if ("session_expired".equalsIgnoreCase(strOptString)) {
                                ArrayList arrayList = new ArrayList();
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    arrayList.add(new C20667087t("X-TT-LOGID", strOptString2));
                                }
                                C0XMV c0xmv = this.LJII;
                                String str6 = strLIZLLL;
                                boolean zLJII = C847400XMc.LJII();
                                Object obj2 = obj;
                                c0xmv.getClass();
                                C0XMZ.LJII(str6, zLJII, arrayList);
                                if (C0XMV.LLJJJJJIL && C847400XMc.LJII()) {
                                    c0xmv.LIZIZ();
                                    C0XNG c0xng = C847400XMc.LJI;
                                    if (c0xng != null) {
                                        C0XO0.LIZLLL(C848000XOk.LIZ()).LJ(true);
                                    }
                                    C0XMV.LJII("sdk_expired_logout", obj2);
                                }
                                enumC846850XJz2 = EnumC846850XJz.LOGOUT;
                            } else if (c847380XMa.LIZ == 400) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("SDK self-check failed:");
                                sbLIZ.append(c847380XMa.LIZJ);
                                sbLIZ.append(";please check network interceptor work fine");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                C0XN7 c0xn7 = C847400XMc.LJFF;
                                if (c0xn7 != null) {
                                    Context contextLIZ = C848000XOk.LIZ();
                                    Intent intent = new Intent(contextLIZ, (Class<?>) ShowDialogActivity.class);
                                    intent.addFlags(268435456);
                                    intent.putExtra("event", "event_dialog");
                                    intent.putExtra("title", "token sdk status error");
                                    intent.putExtra("message", strLIZIZ);
                                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent, "Context_startActivity_1");
                                    C1701330uNH.LIZ(intent, contextLIZ);
                                    C2204961BRm.LJJJJJL(contextLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKVW3C/8nDR0BssbJ4LrLfQl7u", null));
                                }
                            } else {
                                String str7 = c847380XMa.LIZLLL;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                if (this.LJII.LLJJIJI == null) {
                                    this.LJII.LLJJIJI = new JSONObject();
                                    this.LJII.LLJJIJI.put("error_code", c847380XMa.LIZ);
                                    this.LJII.LLJJIJI.put("error_detail_msg", str7);
                                }
                                if ("Not Found".equalsIgnoreCase(str7)) {
                                    this.LJII.LLJJ = false;
                                }
                            }
                            if (this.LJII.LLJILJILJ && c847380XMa.LJ != null) {
                                this.LJII.LLJILJILJ = false;
                                C0WFU c0wfu = this.LJII.LLJJIJIIJIL;
                                if (c0wfu != null) {
                                    C0WFT c0wft = new C0WFT(c0wfu.LIZ);
                                    c0wft.LIZIZ.put("first_beat", Boolean.FALSE);
                                    c0wft.LIZ();
                                }
                            }
                            C0XMV c0xmv2 = this.LJII;
                            C786410Ut5.LJLJJI(LSPassThroughRecordSizeConfig.DEFAULT, c0xmv2.LLILZLL.LJI, c0xmv2.LLIZLLLIL);
                            C0XMV c0xmv3 = this.LJII;
                            String str8 = str;
                            String str9 = str2;
                            String str10 = str3;
                            String str11 = str4;
                            String str12 = str5;
                            c0xmv3.getClass();
                            if (TextUtils.equals(str8, "session_expired")) {
                                C0XMZ.LJIIIIZZ(str9, str10, str11, str12, enumC846850XJz2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0XMZ.LIZJ(e);
                        }
                        C0XMZ.LJI(c847380XMa.LIZ, strLIZLLL, c847380XMa.LIZJ, false);
                    }
                };
                C847400XMc.LJIILJJIL(strLIZLLL, new HashMap(), null, true, this.LLJIJIL);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
