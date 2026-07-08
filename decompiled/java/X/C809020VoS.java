package X;

import Y.ARunnableS82S0200000_13;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.PushManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809020VoS {
    public C809220Vom LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final void LIZ(final C809220Vom c809220Vom) {
        int i;
        if (this.LIZIZ.getAndSet(true)) {
            return;
        }
        this.LIZ = c809220Vom;
        if (c809220Vom.LJFF) {
            i = 3;
        } else {
            i = 4;
        }
        C809190Voj.LIZ = i;
        TextUtils.isEmpty(c809220Vom.LJIILIIL);
        C809360Vp0.LIZ(this.LIZ.LIZ);
        C809220Vom c809220Vom2 = this.LIZ;
        final C809230Von c809230Von = new C809230Von(c809220Vom2);
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZIZ = c809220Vom;
        c809030VoT.LIZJ = c809230Von;
        final C809130Vod c809130Vod = new C809130Vod(c809220Vom2);
        C808470VnZ.LIZIZ(InterfaceC808490Vnb.class, new InterfaceC808490Vnb() { // from class: X.0VoX
            @Override // X.InterfaceC808490Vnb
            public final void tryInit() {
                C809360Vp0.LIZ(c809220Vom.LIZ);
            }
        });
        C808470VnZ.LIZIZ(InterfaceC808610Vnn.class, new InterfaceC808610Vnn() { // from class: X.0Vol
            @Override // X.InterfaceC808610Vnn
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC808610Vnn
            public final void LJLIIL() {
            }

            @Override // X.InterfaceC808610Vnn
            public final boolean LJFF() {
                Application application = c809220Vom.LIZ;
                if (C0V4R.LJII(application)) {
                    if (((PushOnlineSettings) C0WFE.LIZ(c809220Vom.LIZ, PushOnlineSettings.class)).LJIILIIL()) {
                        return true;
                    }
                    return ((PushOnlineSettings) C0WFE.LIZ(c809220Vom.LIZ, PushOnlineSettings.class)).LJFF() && C2162408da.LIZJ();
                }
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(application, 0, "push_multi_process_config");
                if (sharedPreferencesLIZJ.getBoolean("remove_auto_boot_v2", false)) {
                    return true;
                }
                return sharedPreferencesLIZJ.getBoolean("need_control_miui_flares_v2", true) && C2162408da.LIZJ();
            }

            @Override // X.InterfaceC808610Vnn
            public final Map<String, String> LJJJLL() {
                return c809230Von.LIZ();
            }

            @Override // X.InterfaceC808610Vnn
            public final boolean LJJLIIIJLJLI() {
                InterfaceC808670Vnt interfaceC808670VntLIZIZ = C808660Vns.LIZJ(c809220Vom.LIZ).LIZIZ();
                if (interfaceC808670VntLIZIZ != null) {
                    return interfaceC808670VntLIZIZ.LIZLLL();
                }
                return true;
            }

            @Override // X.InterfaceC808610Vnn
            public final String LJJLIIIIJ() {
                return C786410Ut5.u2();
            }

            @Override // X.InterfaceC808610Vnn
            public final InterfaceC808500Vnc LJIJ() {
                return c809130Vod;
            }

            @Override // X.InterfaceC808610Vnn
            public final void LJJJJL(Bundle bundle) {
                Object obj;
                if (TextUtils.isEmpty("red_badge_show")) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    for (String str : bundle.keySet()) {
                        try {
                            obj = bundle.get(str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            obj = null;
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        }
                        jSONObject.put(str, obj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                InterfaceC808700Vnw interfaceC808700Vnw = c809220Vom.LJIIJJI;
                if (interfaceC808700Vnw != null) {
                    ((C808750Vo1) interfaceC808700Vnw).LIZ("red_badge_show", jSONObject);
                }
            }

            @Override // X.InterfaceC808610Vnn
            public final void LJIJJ(Context context, String str, long j, JSONObject jSONObject) {
                JSONObject jSONObject2;
                if (c809220Vom.LJIIJJI != null) {
                    if (C809190Voj.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onEvent: ");
                        sbLIZ.append("event_v1");
                        sbLIZ.append(", tag: ");
                        sbLIZ.append("red_badge");
                        sbLIZ.append(", label: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", params: ");
                        sbLIZ.append(jSONObject);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C810650Vr5.LIZIZ(context, "event_v1", "red_badge", str, j, 0L, jSONObject);
                    C051X c051x = new C051X();
                    c051x.LIZ.put("count", String.valueOf(j));
                    synchronized (c051x) {
                        try {
                            jSONObject2 = new JSONObject(c051x.LIZ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            jSONObject2 = new JSONObject();
                        }
                    }
                    try {
                        if (!TextUtils.isEmpty("show")) {
                            try {
                                jSONObject2.put("service", "show");
                            } catch (JSONException e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                    C793770VBv.LJ("log_red_badge", jSONObject2);
                    if (TextUtils.equals("red_badge", "red_badge") && j > 0) {
                        MobClick mobClickObtain = MobClick.obtain();
                        mobClickObtain.setEventName("red_badge");
                        mobClickObtain.setLabelName("show");
                        mobClickObtain.setValue(String.valueOf(j));
                        C20684815ws.onEvent(mobClickObtain);
                        C813020Vuu.LJIIL().LJIIIZ(context, "red_point_count", j);
                    }
                    try {
                        if (TextUtils.equals("red_badge", "red_badge")) {
                            C051X c051x2 = new C051X();
                            c051x2.LIZ.put("label", str);
                            c051x2.LIZ.put("category", "event_v1");
                            c051x2.LIZ.put("value", Long.valueOf(j));
                            c051x2.LIZ.put("ext_value", 0L);
                            c051x2.LIZ.put("ext_json", C786410Ut5.J3(jSONObject));
                            C794240VDq.LIZJ("red_badge", c051x2.LIZ());
                        }
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            }
        });
        C808620Vno.LJI().LIZ = c809220Vom.LJIIJ;
        C808620Vno.LJI().LIZJ(this.LIZ.LIZ, c809130Vod);
        if (TextUtils.equals(c809220Vom.LJII, this.LIZ.LIZ.getPackageName())) {
            if (c809220Vom.LJIJI) {
                AliveOnlineSettings aliveOnlineSettings = (AliveOnlineSettings) C0WFE.LIZ(c809220Vom.LIZ, AliveOnlineSettings.class);
                aliveOnlineSettings.LJJIFFI();
                aliveOnlineSettings.LJIJI();
                aliveOnlineSettings.LJJI();
                aliveOnlineSettings.LJ();
            }
        } else if (c809220Vom.LJII.endsWith(":pushservice")) {
            c809030VoT.LJIIJ().getClass();
            C808660Vns.LIZJ(this.LIZ.LIZ).LIZ();
        } else if (c809220Vom.LJII.endsWith(":push")) {
            C808660Vns.LIZJ(this.LIZ.LIZ).LIZ();
        }
        C809030VoT.LJIIJJI().init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0Voa] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0Vob] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0VoZ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ(Map map) {
        boolean zLJI = MethodIDManager.LJI(196640);
        final Application application = this.LIZ.LIZ;
        if (!C0V4R.LJII(application)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ssidsMap = [");
        sbLIZ.append(map);
        sbLIZ.append("] forceUpdate = ");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
        if (map != null && !map.isEmpty()) {
            String str = (String) map.get("clientudid");
            String str2 = (String) map.get("device_id");
            String str3 = (String) map.get("install_id");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("clientId: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", deviceId: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", installId: ");
            sbLIZ2.append(str3);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2) && !C2093608Ic.LJ(str3)) {
                C808950VoL.LIZIZ().getClass();
                C809040VoU c809040VoULIZ = C809040VoU.LIZ();
                c809040VoULIZ.getClass();
                Logger.debug();
                try {
                    String strLJFF = C2093608Ic.LJFF(map);
                    C809340Voy c809340VoyLIZ = c809040VoULIZ.LIZ.LIZ();
                    c809340VoyLIZ.LIZIZ.put("ssids", strLJFF);
                    c809340VoyLIZ.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                if (this.LIZJ.compareAndSet(false, true)) {
                    InterfaceC808670Vnt interfaceC808670VntLIZIZ = C808660Vns.LIZJ(this.LIZ.LIZ).LIZIZ();
                    if (interfaceC808670VntLIZIZ != null) {
                        interfaceC808670VntLIZIZ.LIZIZ();
                    }
                    c809030VoT.LIZJ("startOnce_in_start");
                    c809030VoT.LIZ("startOnce_in_start");
                    if (C809190Voj.LIZ()) {
                        PushManager.inst().checkThirdPushConfig("BDPush", this.LIZ.LIZ);
                    }
                    c809030VoT.LIZJ("startOnce_postRunnable");
                    c809030VoT.LIZ("startOnce_postRunnable");
                    C808510Vnd c808510VndLIZ = C808510Vnd.LIZ();
                    ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(this, application, 72);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c808510VndLIZ.LIZIZ(timeUnit.toMillis(15L), aRunnableS82S0200000_13);
                    c809030VoT.LJ("startOnce_in_start");
                    c809030VoT.LIZLLL("startOnce_in_start");
                    c809030VoT.LIZJ("syncNoticeState_in_start");
                    c809030VoT.LIZ("syncNoticeState_in_start");
                    InterfaceC809010VoR interfaceC809010VoRLJIIIIZZ = c809030VoT.LJIIIIZZ();
                    final C810460Vqm c810460Vqm = this.LIZ.LJIIIZ;
                    interfaceC809010VoRLJIIIIZZ.getClass();
                    if (application != null && Build.VERSION.SDK_INT >= 26) {
                        RunnableC823120WQs.LIZIZ(new Runnable() { // from class: X.0Vqs
                            public final void LIZ() {
                                C810460Vqm c810460Vqm2 = c810460Vqm;
                                String string = application.getString(2131845702);
                                if (c810460Vqm2 == null) {
                                    c810460Vqm2 = new C810460Vqm(string);
                                } else if (TextUtils.isEmpty(c810460Vqm2.LIZIZ) || TextUtils.isEmpty(c810460Vqm2.LIZ)) {
                                    if (TextUtils.isEmpty(c810460Vqm2.LIZIZ)) {
                                        c810460Vqm2.LIZIZ = "push";
                                    }
                                    if (TextUtils.isEmpty(c810460Vqm2.LIZ)) {
                                        c810460Vqm2.LIZ = string;
                                    }
                                }
                                String str4 = c810460Vqm2.LIZIZ;
                                String str5 = c810460Vqm2.LIZ;
                                NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(application, "notification");
                                if (notificationManager != null && notificationManager.getNotificationChannel(str4) == null) {
                                    NotificationChannel notificationChannel = new NotificationChannel(str4, str5, 4);
                                    notificationChannel.setShowBadge(true);
                                    notificationChannel.enableVibration(true);
                                    notificationChannel.enableLights(true);
                                    notificationManager.createNotificationChannel(notificationChannel);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("NotificationServiceImpl@b420.createDefaultChannel$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("NotificationServiceImpl@b420.createDefaultChannel$1");
                            }
                        });
                    }
                    c809030VoT.LIZJ("syncNoticeState_postRunnable");
                    c809030VoT.LIZ("syncNoticeState_postRunnable");
                    C808510Vnd.LIZ().LIZIZ(timeUnit.toMillis(15L), new ARunnableS82S0200000_13(application, c809030VoT, 71));
                    c809030VoT.LJ("syncNoticeState_in_start");
                    c809030VoT.LIZLLL("syncNoticeState_in_start");
                    InterfaceC809060VoW interfaceC809060VoW = this.LIZ.LJIJJ;
                    final C809080VoY c809080VoY = new C809080VoY(c809030VoT, interfaceC809060VoW);
                    interfaceC809060VoW.LIZ(new InterfaceC815710VzF<C809170Voh>() { // from class: X.0Voa
                        @Override // X.InterfaceC815710VzF
                        public final void LIZ(C809170Voh c809170Voh) {
                            C809080VoY c809080VoY2 = c809080VoY;
                            String str4 = c809170Voh.LIZ;
                            C809150Vof c809150Vof = ((C809030VoT) c809080VoY2.LIZ).LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onAccountSwitch  ");
                            sbLIZ3.append(str4);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c809150Vof.getClass();
                            RunnableC823120WQs.LIZIZ(new RunnableC808810Vo7(c809080VoY2.LIZ, "passport_switch"));
                        }
                    });
                    interfaceC809060VoW.LIZIZ(new InterfaceC815710VzF<C809160Vog>() { // from class: X.0Vob
                        @Override // X.InterfaceC815710VzF
                        public final void LIZ(C809160Vog c809160Vog) {
                            C809080VoY c809080VoY2 = c809080VoY;
                            String str4 = c809160Vog.LIZ;
                            C809150Vof c809150Vof = ((C809030VoT) c809080VoY2.LIZ).LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onLogin ");
                            sbLIZ3.append(str4);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c809150Vof.getClass();
                            RunnableC823120WQs.LIZIZ(new RunnableC808810Vo7(c809080VoY2.LIZ, "passport_login"));
                        }
                    });
                    interfaceC809060VoW.LIZLLL(new InterfaceC815710VzF<C845440XEo>() { // from class: X.0VoZ
                        @Override // X.InterfaceC815710VzF
                        public final void LIZ(C845440XEo c845440XEo) {
                            C809080VoY c809080VoY2 = c809080VoY;
                            ((C809030VoT) c809080VoY2.LIZ).LIZ.getClass();
                            RunnableC823120WQs.LIZIZ(new RunnableC808810Vo7(c809080VoY2.LIZ, "passport_logout"));
                        }
                    });
                }
                c809030VoT.LJII().LIZLLL();
                c809030VoT.LIZJ("tryUpdateSender_in_start");
                c809030VoT.LIZ("tryUpdateSender_in_start");
                c809030VoT.LJIIJ().LIZIZ(false);
                c809030VoT.LJ("tryUpdateSender_in_start");
                c809030VoT.LIZLLL("tryUpdateSender_in_start");
                C808620Vno.LJI().LIZ(application, map);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZIZ(C10DC c10dc, String str) {
        C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).getClass();
        Application application = C809360Vp0.LIZ;
        InterfaceC808910VoH interfaceC808910VoHLJII = C809470VpB.LJIIIIZZ(application).LJII(10);
        if (interfaceC808910VoHLJII == null) {
            try {
                c10dc.LIZJ("OpPushAdapter is null", false);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (!interfaceC808910VoHLJII.isPushAvailable(application, 10)) {
            try {
                c10dc.LIZJ("OPPO push is not available", false);
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
        try {
            interfaceC808910VoHLJII.requestSystemNotificationPermission(str, 10, c10dc);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestNotificationPermissionBySysAlertForOp error");
            sbLIZ.append(Log.getStackTraceString(th3));
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("exception: ");
            sbLIZ2.append(th3.getMessage());
            try {
                c10dc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), false);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
    }
}
