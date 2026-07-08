package X;

import Y.ACallableS420S0100000_13;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.IDownloadService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212241BiA {
    public static volatile boolean LIZ = false;
    public static volatile C2212191Bi5 LIZIZ = null;
    public static volatile boolean LIZJ = true;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final Object LJFF = new Object();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0028, B:18:0x0047, B:19:0x0049, B:15:0x0039, B:17:0x0043, B:20:0x004b), top: B:28:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF() {
        /*
            boolean r0 = X.C2212241BiA.LIZLLL
            if (r0 != 0) goto L53
            java.lang.Object r4 = X.C2212241BiA.LJFF
            monitor-enter(r4)
            boolean r0 = X.C2212241BiA.LIZLLL     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L4b
            java.lang.String r0 = "ab_repo_cold_boot"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "splash_ad_enable"
            r3 = 1
            boolean r0 = r1.getBoolean(r0, r3)     // Catch: java.lang.Throwable -> L4d
            X.C2212241BiA.LIZJ = r0     // Catch: java.lang.Throwable -> L4d
            X.01GW r0 = X.C1865910yej.LIZLLL     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L39
            X.15iQ r0 = X.C20595215iQ.LIZ     // Catch: java.lang.Throwable -> L4d
            float r2 = X.C20595215iQ.LIZJ     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L39
            r0 = 1083179008(0x40900000, float:4.5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L47
        L39:
            X.01GW r0 = X.C1057370dcd.LIZ     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L4d
            com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings r0 = (com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L49
            r0.LIZJ()     // Catch: java.lang.Throwable -> L4d
            goto L49
        L47:
            X.C2212241BiA.LIZJ = r1     // Catch: java.lang.Throwable -> L4d
        L49:
            X.C2212241BiA.LIZLLL = r3     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            goto L53
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            throw r0
        L53:
            boolean r0 = X.C2212241BiA.LIZJ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212241BiA.LJFF():boolean");
    }

    public static void LIZIZ(Context context) {
        if (!LIZ && context != null && C786410Ut5.N3(context) != null) {
            synchronized (C2212241BiA.class) {
                try {
                    if (LIZ) {
                        return;
                    }
                    LIZLLL(context);
                    C2212191Bi5 c2212191Bi5 = C1031160cwM.LIZ;
                    C2212281BiE.LIZIZ(context, null);
                    LIZIZ = C1031160cwM.LIZ;
                    LJ(C786410Ut5.N3(context), LIZIZ);
                    C1031060cwC.LIZ.getClass();
                    C2214201BlK.LIZLLL().LJJLL(new C09JN() { // from class: X.1BiC
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            String strLJ;
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorAppBackground$1");
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            if (((Boolean) obj).booleanValue()) {
                                C2212241BiA.LIZIZ(contextLIZ);
                                C2212191Bi5 c2212191Bi52 = C1031160cwM.LIZ;
                                C2212281BiE.LIZIZ(contextLIZ, null);
                                C1031160cwM.LIZIZ.getClass();
                                C2212231Bi9.LJII = System.currentTimeMillis();
                                C2212231Bi9.LJIIIZ = false;
                                ArrayList arrayList = new ArrayList();
                                List<WeakReference<InterfaceC2212831Bj7>> list = C1212240heQ.LIZ;
                                if (list != null) {
                                    arrayList.addAll(list);
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC2212831Bj7 interfaceC2212831Bj7 = (InterfaceC2212831Bj7) ((Reference) it2.next()).get();
                                    if (interfaceC2212831Bj7 != null) {
                                        interfaceC2212831Bj7.onAppBackground();
                                    }
                                }
                                C2211961Bhi.LIZ().LIZLLL(-1);
                                C2212231Bi9.LJIIIZ();
                                C2212231Bi9.LJJIJIIJI = -1;
                                C1031060cwC.LIZ.getClass();
                                C1031060cwC.LIZIZ = true;
                            } else if (C2212241BiA.LJFF()) {
                                if (C2212231Bi9.LIZJ == null) {
                                    C2212241BiA.LIZIZ(contextLIZ);
                                }
                                C2212241BiA.LIZIZ(contextLIZ);
                                C2212191Bi5 c2212191Bi53 = C1031160cwM.LIZ;
                                C2212281BiE.LIZIZ(contextLIZ, null);
                                C1031160cwM.LIZIZ.getClass();
                                C2212231Bi9.LJIIJ = System.currentTimeMillis();
                                C2212231Bi9.LJIIIZ = true;
                                ArrayList arrayList2 = new ArrayList();
                                List<WeakReference<InterfaceC2212831Bj7>> list2 = C1212240heQ.LIZ;
                                if (list2 != null) {
                                    arrayList2.addAll(list2);
                                }
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    InterfaceC2212831Bj7 interfaceC2212831Bj72 = (InterfaceC2212831Bj7) ((Reference) it3.next()).get();
                                    if (interfaceC2212831Bj72 != null) {
                                        interfaceC2212831Bj72.onAppForeground();
                                    }
                                }
                                if (C2212231Bi9.LJIIJJI != null) {
                                    strLJ = C2212231Bi9.LIZIZ().LJ();
                                } else {
                                    strLJ = "";
                                }
                                if (!C2211541Bh2.LIZ(strLJ)) {
                                    C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
                                    c2212141Bi0LJIIIIZZ.LIZJ.LJI("splash_ad_did", strLJ);
                                    c2212141Bi0LJIIIIZZ.LIZJ();
                                }
                            }
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorAppBackground$1");
                        }
                    }, new C09JN() { // from class: X.00NL
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorAppBackground$2");
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorAppBackground$2");
                        }
                    });
                    C2214201BlK.LJ().LJJLL(new C09JN() { // from class: X.0cwL
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorAppQuit$1");
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            C2212241BiA.LIZIZ(contextLIZ);
                            C2212191Bi5 c2212191Bi52 = C1031160cwM.LIZ;
                            C2212281BiE.LIZIZ(contextLIZ, null);
                            C1031160cwM.LIZIZ.getClass();
                            C2212171Bi3.LJ().LIZ = 0L;
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorAppQuit$1");
                        }
                    }, new C09JN() { // from class: X.00NM
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorAppQuit$2");
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorAppQuit$2");
                        }
                    });
                    C2214201BlK.LIZIZ().LJJLL(new C09JN() { // from class: X.0cwP
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            Intent intent;
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorActivityResume$1");
                            boolean zLJI = MethodIDManager.LJI(196675);
                            Activity activity = (Activity) obj;
                            boolean zLJI2 = MethodIDManager.LJI(196675);
                            if (activity == null) {
                                if (zLJI2) {
                                    MethodIDManager.LJ();
                                }
                            } else {
                                SettingsManager.LIZLLL().getClass();
                                if (SettingsManager.LIZ("prevent_push_topview", true) && (intent = activity.getIntent()) != null) {
                                    C1035180d2q.LIZ = intent.getBooleanExtra("from_notification", false);
                                }
                                C1031060cwC.LIZ.LJFF(2, activity);
                                if (zLJI2) {
                                    MethodIDManager.LJ();
                                }
                            }
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorActivityResume$1");
                        }
                    }, new C09JN() { // from class: X.00NK
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("SplashAdShowManager@974f.monitorActivityResume$2");
                            C1C7U.LIZIZ("SplashAdShowManager@974f.monitorActivityResume$2");
                        }
                    });
                    C2214201BlK.LJ().LJJLL(new C09JN() { // from class: X.0WA5
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("TopViewShowManager@32b2.monitorAppQuit$1");
                            C1030680cva.LJIIJ = false;
                            C1018150cbN.LIZJ().getClass();
                            TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
                            if (topViewJsonManager != null) {
                                C15O7.LIZJ(new ACallableS420S0100000_13(topViewJsonManager, 0));
                            }
                            C1C7U.LIZIZ("TopViewShowManager@32b2.monitorAppQuit$1");
                        }
                    }, new C09JN() { // from class: X.00NJ
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("TopViewShowManager@32b2.monitorAppQuit$2");
                            C1C7U.LIZIZ("TopViewShowManager@32b2.monitorAppQuit$2");
                        }
                    });
                    C2214201BlK.LIZLLL().LJJLL(new C09JN() { // from class: X.0WA4
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            SharedPreferences sharedPreferences;
                            C1C7U.LIZ("TopViewShowManager@32b2.monitorAppBackground$1");
                            if (((Boolean) obj).booleanValue()) {
                                C1018150cbN c1018150cbNLIZJ = C1018150cbN.LIZJ();
                                boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "awesome_splash_preload_json_enabled", true, false);
                                c1018150cbNLIZJ.getClass();
                                TopViewJsonManager topViewJsonManager = C1018150cbN.LIZJ;
                                if (topViewJsonManager != null && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
                                    sharedPreferences.edit().putBoolean("awesome_splash_preload_json", zLJIIIZ).apply();
                                }
                                C1030680cva.LJIILL = 0L;
                            } else {
                                C1030680cva.LJIILL = System.currentTimeMillis();
                            }
                            C1C7U.LIZIZ("TopViewShowManager@32b2.monitorAppBackground$1");
                        }
                    }, new C09JN() { // from class: X.00NI
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("TopViewShowManager@32b2.monitorAppBackground$2");
                            C1C7U.LIZIZ("TopViewShowManager@32b2.monitorAppBackground$2");
                        }
                    });
                    LIZ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static String LIZJ(String str) {
        String strLIZIZ;
        C0TT1 c0tt1LJJIZ;
        String curUserId = C1031100cwG.LIZ().getCurUserId();
        if (!TextUtils.isEmpty(curUserId)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("&user_id=");
            sbLIZ.append(curUserId);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("&gaid=");
        sbLIZ2.append(URLEncoder.encode(C1031100cwG.LIZ().LJJIJIIJI()));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        String strLIZ = C1489110oqz.LIZ("other");
        if (!TextUtils.isEmpty(strLIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append("&ad_user_agent=");
            sbLIZ3.append(URLEncoder.encode(strLIZ));
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append("&cmpl_enc=");
        sbLIZ4.append(C1031100cwG.LIZ().LJJIFFI());
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ3);
        sbLIZ5.append("&os_boot_time=");
        sbLIZ5.append(C1031100cwG.LIZ().LJIL());
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ4);
        sbLIZ6.append("&sp=");
        sbLIZ6.append(C1479130oat.LJII());
        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ5);
        sbLIZ7.append("&topview_show_info_list=");
        ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
        if (iSplashAdService != null && (c0tt1LJJIZ = iSplashAdService.LJJIZ()) != null) {
            strLIZIZ = c0tt1LJJIZ.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        sbLIZ7.append(strLIZIZ);
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(strLIZIZ6);
        sbLIZ8.append("&ttplus_ad_mode=");
        sbLIZ8.append(C1031100cwG.LIZ().LIZIZ());
        String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ8);
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(C0D80.LIZ);
        sbLIZ9.append(strLIZIZ7);
        return C2188811AlT.LIZIZ(sbLIZ9);
    }

    public static void LIZLLL(Context context) {
        Context contextN3;
        Object c098200Yq;
        boolean zLJFF = LJFF();
        JSONObject jSONObject = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        C1030730cvf c1030730cvf = new C1030730cvf(contextN3);
        C2212411BiR c2212411BiR = new C2212411BiR();
        c2212411BiR.LJII = new C2212791Bj3((TelephonyManager) C786410Ut5.H2(context, "phone"));
        c2212411BiR.LJ = null;
        c2212411BiR.LJFF = c1030730cvf;
        c2212411BiR.LJI = zLJFF;
        if (((Boolean) C1791706zz.LIZ.getValue()).booleanValue()) {
            c2212411BiR.LIZ = C823050WQl.LIZLLL();
            c2212411BiR.LIZIZ = C823050WQl.LJFF();
            c2212411BiR.LIZJ = C823050WQl.LJFF();
            c2212411BiR.LIZLLL = C823050WQl.LJ();
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            c098200Yq = C2212781Bj2.LIZ;
            n nVar = (n) settingsManagerLIZLLL.LJIIIIZZ("splash_setting_json", n.class, c098200Yq);
            if (nVar != null) {
                c098200Yq = nVar;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        k kVar = (k) c098200Yq;
        if (kVar == null) {
            kVar = C2212781Bj2.LIZ;
        }
        String string = kVar.toString();
        if (!C1293990jmH.LIZ(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (!(jSONObject instanceof JSONObject)) {
            jSONObject = new JSONObject();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_splash_show_count_for_empty", true)) {
                jSONObject.put("enable_add_show_count_for_empty_array", 1);
            }
            jSONObject.put("enable_cold_launch_interval", 1);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        c2212411BiR.LJIIIIZZ = jSONObject;
        C2212361BiM c2212361BiM = new C2212361BiM(c2212411BiR);
        C2212191Bi5 c2212191Bi5 = C1031160cwM.LIZ;
        C2212281BiE.LIZIZ(context, c2212361BiM);
    }

    public static boolean LIZ(String str, String str2) {
        IDownloadService iDownloadService;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        int iLastIndexOf = str2.lastIndexOf("/") + 1;
        String strSubstring = str2.substring(iLastIndexOf);
        String strSubstring2 = str2.substring(0, iLastIndexOf);
        Object objLIZ = C04TD.LIZ(IDownloadService.class, false);
        if (objLIZ != null) {
            iDownloadService = (IDownloadService) objLIZ;
        } else {
            if (C04TD.LLIIII == null) {
                synchronized (IDownloadService.class) {
                    if (C04TD.LLIIII == null) {
                        C04TD.LLIIII = new DownloadService();
                    }
                }
            }
            iDownloadService = C04TD.LLIIII;
        }
        C844470XAv.LIZ.getClass();
        return iDownloadService.LIZ(C844470XAv.LIZ(), str, strSubstring2, strSubstring);
    }

    public static void LJ(Context context, C0VRQ c0vrq) {
        long jLJFF;
        Object c098200Yq;
        Collection collectionAsList;
        final int i;
        C844470XAv.LIZ.getClass();
        boolean z = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "file_splash_ad_preload").getBoolean("key_splash_ad_preload_delay", true);
        final int i2 = C844470XAv.LJIIJ;
        AbstractC2212871BjB abstractC2212871BjB = new AbstractC2212871BjB() { // from class: X.1Bin
        };
        if (!((Boolean) C2238381CjE.LIZLLL.getValue()).booleanValue()) {
            C1056800dbi.LIZ.getValue();
            C1056800dbi.LIZIZ.getValue();
        }
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("splash_support_timeout", false);
        c0vrq.getClass();
        C2212231Bi9.LIZLLL = new InterfaceC2213241Bjm() { // from class: X.1Bix
        };
        C2212231Bi9.LIZJ = new C2212331BiJ();
        C2212231Bi9.LJIIIIZZ = C0C64.LJIILLIIL().LJIIIZ(31744, "aweme_splash_first_launch_enabled", true, false);
        long millis = TimeUnit.DAYS.toMillis(10L);
        if (millis <= 86400000) {
            millis = 86400000;
        }
        C2212231Bi9.LJJIII = millis;
        C2212231Bi9.LJJIJL = 2000L;
        C2212231Bi9.LJJIJ = true;
        C2212231Bi9.LIZIZ = new C20685515wz();
        if (z) {
            jLJFF = 15000;
        } else {
            SettingsManager.LIZLLL().getClass();
            jLJFF = SettingsManager.LJFF("splash_preload_delay", 0L);
        }
        C2212231Bi9.LJJIJIL = jLJFF;
        C2212231Bi9.LJIILIIL = abstractC2212871BjB;
        SettingsManager.LIZLLL().getClass();
        C2212231Bi9.LJJJJ = SettingsManager.LIZ("enable_splash_valid_time_check", true);
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        C2212231Bi9.LJJJJJ = false;
        SettingsManager.LIZLLL().getClass();
        C2212231Bi9.LJJJJI = SettingsManager.LJ("splash_valid_time_check_setting", 11);
        C2212231Bi9.LJJJJIZL = C0C64.LJIILLIIL().LJIJ(31744, 0, "commerce_request_api_update", true);
        SettingsManager.LIZLLL().getClass();
        C2212231Bi9.LJJJJZI = SettingsManager.LIZ("enable_splash_new_first_view_logic", true);
        try {
            c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("splash_switch_server_list", String[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Object[] objArr = (Object[]) c098200Yq;
        if (objArr == null || (collectionAsList = Arrays.asList(objArr)) == null) {
            collectionAsList = C13BV.INSTANCE;
        }
        JSONArray jSONArray = new JSONArray(collectionAsList);
        String str = C2212231Bi9.LIZ;
        if (!TextUtils.isEmpty("")) {
            try {
                i = CastIntegerProtector.parseInt("");
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                i = 0;
            }
        } else {
            i = 0;
        }
        if (jSONArray.length() > 0) {
            C2211961Bhi.LIZ().LIZLLL = jSONArray.length();
            C2211961Bhi.LIZ().LIZLLL(-1);
            C2211961Bhi.LIZ().LIZIZ(-1L);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    final String string = JSONArrayProtectorUtils.getString(jSONArray, i3);
                    C0WP3.LIZLLL(new PthreadAsyncTask<Void, Void, Void>(string, i2, i) { // from class: X.1Bhh
                        public final String LIZ;
                        public final boolean LIZIZ;
                        public long LIZJ;
                        public MessageDigest LIZLLL;
                        public long LJ = -1;
                        public final int LJFF;
                        public final int LJI;
                        public final boolean LJII;

                        public final byte[] LIZ() throws JSONException, IOException {
                            long jNextLong;
                            long j;
                            int i4;
                            int i5;
                            Long lValueOf = Long.valueOf(System.currentTimeMillis());
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                            byteBufferAllocate.putInt(5);
                            byte[] bArrArray = byteBufferAllocate.array();
                            byte[] bArr = new byte[4];
                            new Random().nextBytes(bArr);
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                            byteBufferAllocate2.putInt(this.LJFF);
                            byte[] bArrArray2 = byteBufferAllocate2.array();
                            Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(8);
                            byteBufferAllocate3.putLong(lValueOf2.longValue());
                            byte[] bArrArray3 = byteBufferAllocate3.array();
                            SecureRandom secureRandom = new SecureRandom();
                            do {
                                jNextLong = (secureRandom.nextLong() << 1) >>> 1;
                                j = jNextLong % 8999999999L;
                            } while ((jNextLong - j) + 8999999998L < 0);
                            long j2 = j + 1000000000;
                            if (j2 == -1) {
                                return null;
                            }
                            this.LIZJ = j2;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("random number :");
                            sbLIZ.append(j2);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (new Random().nextInt(2) == 0) {
                                this.LIZLLL = MessageDigest.getInstance("SHA-256");
                                i4 = 2;
                                i5 = 0;
                            } else {
                                this.LIZLLL = MessageDigest.getInstance("SHA-512");
                                i4 = 3;
                                i5 = 1;
                            }
                            int i6 = Build.VERSION.SDK_INT | Integer.MIN_VALUE;
                            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(4);
                            byteBufferAllocate4.putInt(i6);
                            byte[] bArrArray4 = byteBufferAllocate4.array();
                            ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(4);
                            byteBufferAllocate5.putInt(this.LJI);
                            byte[] bArrArray5 = byteBufferAllocate5.array();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArrArray);
                            byteArrayOutputStream.write(0);
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(i4);
                            byteArrayOutputStream.write(bArrArray2);
                            byteArrayOutputStream.write(bArrArray3);
                            byte[] bArr2 = new byte[8];
                            int i7 = 7;
                            do {
                                bArr2[i7] = (byte) (255 & j2);
                                j2 >>= 8;
                                i7--;
                            } while (i7 >= 0);
                            byteArrayOutputStream.write(bArr2);
                            byteArrayOutputStream.write(bArrArray5);
                            byteArrayOutputStream.write(bArrArray4);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("packetToDigest: ");
                            char[] cArr = new char[byteArray.length * 2];
                            for (int i8 = 0; i8 < byteArray.length; i8++) {
                                int i9 = byteArray[i8] & 255;
                                int i10 = i8 * 2;
                                char[] cArr2 = C199635139d.LIZ;
                                cArr[i10] = cArr2[i9 >>> 4];
                                cArr[i10 + 1] = cArr2[i9 & 15];
                            }
                            sbLIZ2.append(new String(cArr));
                            sbLIZ2.append(" length: ");
                            sbLIZ2.append(byteArray.length);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            JSONObject jSONObject = new JSONObject();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            byte[] bArrDigest = this.LIZLLL.digest(byteArray);
                            jSONObject.putOpt("digest_duration", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            byteArrayOutputStream.write(bArrDigest);
                            jSONObject.putOpt("generate_duration", Long.valueOf(System.currentTimeMillis() - lValueOf.longValue()));
                            C2212291BiF.LIZLLL().LJIIIIZZ("service_udp_send_packet_duration", i5, jSONObject, null);
                            return byteArrayOutputStream.toByteArray();
                        }

                        @Override // android.os.AsyncTask
                        public final void onCancelled() {
                            super.onCancelled();
                        }

                        @Override // android.os.AsyncTask
                        public final void onPreExecute() {
                            super.onPreExecute();
                        }

                        public final boolean LIZJ(byte[] bArr) {
                            LIZIZ(0, bArr, 4);
                            LIZIZ(4, bArr, 5);
                            byte[] bArrLIZIZ = LIZIZ(5, bArr, 15);
                            byte[] bArrLIZIZ2 = LIZIZ(15, bArr, 23);
                            byte[] bArrLIZIZ3 = LIZIZ(23, bArr, 31);
                            byte[] bArrLIZIZ4 = LIZIZ(31, bArr, 39);
                            long j = ByteBuffer.wrap(LIZIZ(39, bArr, 47)).getLong();
                            int i4 = (int) (((long) 47) + (j * 8));
                            byte[] bArrLIZIZ5 = LIZIZ(47, bArr, i4);
                            int i5 = i4 + 8;
                            long j2 = ByteBuffer.wrap(LIZIZ(i4, bArr, i5)).getLong();
                            int i6 = (int) (((long) i5) + (8 * j2 * 2));
                            byte[] bArrLIZIZ6 = LIZIZ(i5, bArr, i6);
                            int i7 = i6 + 8;
                            int i8 = (int) (((long) i7) + ByteBuffer.wrap(LIZIZ(i6, bArr, i7)).getLong());
                            byte[] bArrLIZIZ7 = LIZIZ(i7, bArr, i8);
                            byte[] bArrLIZIZ8 = LIZIZ(i8, bArr, bArr.length);
                            byte[] bArrDigest = this.LIZLLL.digest(LIZIZ(0, bArr, i8));
                            if (!Arrays.equals(bArrDigest, Arrays.copyOfRange(bArrLIZIZ8, 0, bArrDigest.length))) {
                                return true;
                            }
                            String strValueOf = String.valueOf(this.LIZJ);
                            int i9 = 0;
                            for (int i10 = 0; i10 < strValueOf.length(); i10++) {
                                int numericValue = Character.getNumericValue(strValueOf.charAt(i10));
                                if (numericValue > bArrLIZIZ.length) {
                                    return true;
                                }
                                i9 += bArrLIZIZ[numericValue] & 255;
                            }
                            if (this.LJII) {
                                C2212181Bi4.LJ().LJIIL.add(new ARunnableS134S0100000_34(bArrLIZIZ2, 86));
                            } else {
                                C2211961Bhi.LIZ().LIZIZ(ByteBuffer.wrap(bArrLIZIZ2).getLong());
                            }
                            if ((ByteBuffer.wrap(bArrLIZIZ3).getLong() & 1) != 0) {
                                final String str2 = new String(bArrLIZIZ7);
                                final long j3 = ByteBuffer.wrap(bArrLIZIZ4).getLong();
                                Runnable runnable = new Runnable() { // from class: X.11yM
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str3 = str2;
                                        long j4 = j3;
                                        C1C7U.LIZ("SplashUDPTask@e812.resolveBuffer$2L");
                                        try {
                                            HashMap<String, Object> map = new HashMap<>(1);
                                            HashMap<String, Object> map2 = new HashMap<>(1);
                                            if (!TextUtils.isEmpty(str3)) {
                                                map.put("log_extra", str3);
                                            }
                                            map2.put("action", Long.valueOf(j4));
                                            C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "udp_stop", map, map2);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                        }
                                        C1C7U.LIZIZ("SplashUDPTask@e812.resolveBuffer$2L");
                                    }
                                };
                                if (this.LJII) {
                                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), runnable);
                                } else {
                                    runnable.run();
                                }
                                long[] jArr = new long[(int) j];
                                long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, (int) j2, 2);
                                int i11 = 8;
                                if ((j3 & 2) != 0 && bArrLIZIZ5 != null && bArrLIZIZ5.length > 0) {
                                    int i12 = 0;
                                    while (i12 < j) {
                                        jArr[i12] = ByteBuffer.wrap(bArrLIZIZ5, i12 * 8, i11).getLong();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("The stop vote cid is:");
                                        sbLIZ.append(jArr[i12]);
                                        C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                                        i12++;
                                        i11 = 8;
                                    }
                                }
                                if ((j3 & 4) != 0 && bArrLIZIZ6 != null && bArrLIZIZ6.length > 0) {
                                    for (int i13 = 0; i13 < j2; i13++) {
                                        jArr2[i13][0] = ByteBuffer.wrap(bArrLIZIZ6, i13 * 8 * 2, 8).getLong() * 1000;
                                        jArr2[i13][1] = ByteBuffer.wrap(bArrLIZIZ6, ((i13 * 2) + 1) * 8, 8).getLong() * 1000;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("The start time of the suspension period is:");
                                        sbLIZ2.append(C2211531Bh1.LIZ(jArr2[i13][0]));
                                        sbLIZ2.append(", the end time period is:");
                                        sbLIZ2.append(C2211531Bh1.LIZ(jArr2[i13][1]));
                                        C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                }
                                C2212181Bi4.LJ().LJIIJJI.add(new ARunnableS103S0200000_34(jArr, jArr2, 52));
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("sum: ");
                            sbLIZ3.append(i9);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            if (i9 % 10 > 4) {
                                return true;
                            }
                            return false;
                        }

                        @Override // android.os.AsyncTask
                        public final Object doInBackground(Object[] objArr2) {
                            DatagramSocket datagramSocket;
                            byte[] bArrLIZ;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            String str2 = this.LIZ;
                            boolean z2 = this.LIZIZ;
                            if (!TextUtils.isEmpty(str2)) {
                                String[] strArrSplit = str2.split(":");
                                int i4 = 2;
                                boolean z3 = true;
                                try {
                                } catch (SocketException e2) {
                                    e = e2;
                                    datagramSocket = null;
                                } catch (UnknownHostException e3) {
                                    e = e3;
                                    datagramSocket = null;
                                } catch (IOException e4) {
                                    e = e4;
                                    datagramSocket = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    datagramSocket = null;
                                }
                                if (strArrSplit.length == 2) {
                                    String str3 = strArrSplit[0];
                                    int i5 = CastIntegerProtector.parseInt(strArrSplit[1]);
                                    jSONObject.putOpt("server_addr", str2);
                                    jSONObject2.putOpt("from_bg", Integer.valueOf(z2 ? 1 : 0));
                                    InetAddress byName = InetAddress.getByName(str3);
                                    datagramSocket = new DatagramSocket();
                                    try {
                                        bArrLIZ = LIZ();
                                    } catch (SocketException e5) {
                                        e = e5;
                                        TryCatchGuardChecker.doCheck(e);
                                    } catch (UnknownHostException e6) {
                                        e = e6;
                                        TryCatchGuardChecker.doCheck(e);
                                    } catch (IOException e7) {
                                        e = e7;
                                        TryCatchGuardChecker.doCheck(e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                    if (bArrLIZ != null) {
                                        DatagramPacket datagramPacket = new DatagramPacket(bArrLIZ, bArrLIZ.length, byName, i5);
                                        datagramSocket.setSoTimeout(LSPassThroughRecordSizeConfig.DEFAULT);
                                        datagramSocket.send(datagramPacket);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Send UDP request:");
                                        sbLIZ.append(str2);
                                        C2212381BiO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                                        if (datagramSocket != null) {
                                            try {
                                                try {
                                                    byte[] bArr = new byte[65536];
                                                    datagramSocket.receive(new DatagramPacket(bArr, 65536));
                                                    boolean zLIZJ = LIZJ(bArr);
                                                    if (!zLIZJ) {
                                                        i4 = 1;
                                                    }
                                                    try {
                                                        this.LJ = System.currentTimeMillis() - jCurrentTimeMillis;
                                                        jSONObject.putOpt("result", Boolean.valueOf(zLIZJ));
                                                        jSONObject2.putOpt("duration", Long.valueOf(this.LJ));
                                                        C2212291BiF.LIZLLL().LJIIIIZZ("service_ad_udp_control", 1, jSONObject2, jSONObject);
                                                        try {
                                                            datagramSocket.disconnect();
                                                            datagramSocket.close();
                                                        } catch (Throwable th4) {
                                                        }
                                                    } catch (IOException e8) {
                                                        e = e8;
                                                        TryCatchGuardChecker.doCheck(e);
                                                        try {
                                                            datagramSocket.disconnect();
                                                            datagramSocket.close();
                                                        } catch (Throwable th5) {
                                                        }
                                                        z3 = false;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        TryCatchGuardChecker.doCheck(th);
                                                        datagramSocket.disconnect();
                                                        datagramSocket.close();
                                                        z3 = false;
                                                    }
                                                } catch (Throwable th7) {
                                                    try {
                                                        datagramSocket.disconnect();
                                                        datagramSocket.close();
                                                        throw th7;
                                                    } finally {
                                                        TryCatchGuardChecker.doCheck(th);
                                                    }
                                                }
                                            } catch (IOException e9) {
                                                e = e9;
                                                i4 = -1;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                i4 = -1;
                                            }
                                        } else {
                                            i4 = -1;
                                            z3 = false;
                                        }
                                        try {
                                            AtomicInteger atomicInteger = C2211961Bhi.LIZ().LIZIZ;
                                            AtomicInteger atomicInteger2 = C2211961Bhi.LIZ().LIZJ;
                                            atomicInteger2.getAndIncrement();
                                            if (z3) {
                                                atomicInteger.getAndIncrement();
                                                HashMap map = new HashMap();
                                                map.put("ip_addr", this.LIZ);
                                                map.put("duration", Long.toString(this.LJ));
                                                map.put("rank", Integer.toString(atomicInteger.get()));
                                                C2211961Bhi.LIZ().LJ.add(map);
                                            } else {
                                                C2212291BiF.LIZLLL().LJIIIIZZ("service_ad_udp_control", 0, jSONObject2, jSONObject);
                                            }
                                            C2211961Bhi.LIZ().LIZJ(atomicInteger2);
                                            if (z3 && C2211961Bhi.LIZ().LIZ == -1) {
                                                C2211961Bhi.LIZ().LIZLLL(i4);
                                                C2211961Bhi c2211961BhiLIZ = C2211961Bhi.LIZ();
                                                Long lValueOf = Long.valueOf(this.LJ);
                                                c2211961BhiLIZ.getClass();
                                                c2211961BhiLIZ.LJFF = lValueOf.longValue();
                                                return null;
                                            }
                                        } catch (Throwable th9) {
                                        }
                                    }
                                }
                            }
                            return null;
                        }

                        @Override // android.os.AsyncTask
                        public final void onProgressUpdate(Object[] objArr2) {
                            super.onProgressUpdate(objArr2);
                        }

                        {
                            if (i2 > 0) {
                                this.LJFF = i2;
                            } else if (C2212231Bi9.LIZIZ() != null) {
                                this.LJFF = CastIntegerProtector.parseInt(C2212231Bi9.LIZIZ().LIZIZ());
                            }
                            this.LIZ = string;
                            this.LIZIZ = false;
                            this.LJII = false;
                            this.LJI = i;
                        }

                        public static byte[] LIZIZ(int i4, byte[] bArr, int i5) {
                            if (i4 >= i5) {
                                return null;
                            }
                            return Arrays.copyOfRange(bArr, i4, i5);
                        }
                    }, C2212231Bi9.LJ, new Void[0]);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        C2212231Bi9.LJIILLIIL = false;
        C2212231Bi9.LJJJLZIJ = C0C64.LJIILLIIL().LJIIIZ(31744, "splash_forbidden_foreground_long", true, true);
        C2212231Bi9.LJJJZ = C288590BSv.LIZ();
        C2212231Bi9.LJJL = new InterfaceC2213231Bjl() { // from class: X.1Bip
        };
        C2212231Bi9.LJJJJL = new AbstractC2212881BjC() { // from class: X.1Bio
        };
        C2212231Bi9.LJJJJLI = new AbstractC2212691Bit() { // from class: X.1Bic
            @Override // X.AbstractC2212691Bit
            public final void LIZ(String str2) {
            }

            @Override // X.AbstractC2212691Bit
            public final void LIZJ(String str2) {
            }

            @Override // X.AbstractC2212691Bit
            public final void LIZLLL(String str2) {
            }

            @Override // X.AbstractC2212691Bit
            public final void LIZIZ(String str2) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("[BDASplash]", str2);
            }
        };
        C2212231Bi9.LJJJJLL = new InterfaceC2213211Bjj() { // from class: X.1Bj5
        };
        C1031100cwG.LIZ().LJIIIZ();
        C2201551BEj c2201551BEj = new C1BF7() { // from class: X.1BEj
            @Override // X.C1BF7
            public final void LIZ(View view, long j, List<String> list, String str2, boolean z2, long j2, JSONObject jSONObject) {
                C2201501BEe.LIZ().LIZJ(new C1BEK(j, list, "play", z2, j2, str2, jSONObject));
            }

            @Override // X.C1BF7
            public final void LIZIZ(View view, long j, List<String> list, String str2, boolean z2, long j2, JSONObject jSONObject) {
                C2201501BEe.LIZ().LIZJ(new C1BEK(j, list, "show", z2, j2, str2, jSONObject));
            }

            @Override // X.C1BF7
            public final void LIZJ(View view, long j, List<String> list, String str2, boolean z2, long j2, JSONObject jSONObject) {
                C2201501BEe.LIZ().LIZJ(new C1BEK(j, list, "click", z2, j2, str2, jSONObject));
            }

            @Override // X.C1BF7
            public final void LIZLLL(View view, long j, List<String> list, String str2, boolean z2, long j2, JSONObject jSONObject) {
                C2201501BEe.LIZ().LIZJ(new C1BEK(j, list, "play_over", z2, j2, str2, jSONObject));
            }
        };
        if (c2201551BEj != C2212231Bi9.LJIIZILJ) {
            C2212231Bi9.LJIIZILJ = c2201551BEj;
        }
        if (z) {
            C1031100cwG.LIZ().LJIJ(new C2211981Bhk(c0vrq));
            C844470XAv.LIZ.getClass();
            C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "file_splash_ad_preload").edit().putBoolean("key_splash_ad_preload_delay", false).apply();
        }
        C2212231Bi9.LJJIJIIJIL = true;
        C2212231Bi9.LJJJJJL = C1031100cwG.LIZ().LJII(context);
        C2212231Bi9.LJJJJZ = new C0VRO(context);
        C2212291BiF c2212291BiFLIZLLL = C2212291BiF.LIZLLL();
        c2212291BiFLIZLLL.LIZ = true;
        c2212291BiFLIZLLL.LJ(null);
        try {
            System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.x2(context).getParent());
            sbLIZ.append("/splashCache/");
            C2212231Bi9.LJJII = C2188811AlT.LIZIZ(sbLIZ);
            if (!((Boolean) C285090BFj.LJJJJLL.getValue()).booleanValue()) {
                C2212231Bi9.LJJIFFI = (String) C1035180d2q.LIZJ.getValue();
                C2212231Bi9.LJJIIJ = true;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
            C2344809Gs.LJI(e2);
        }
        C2212231Bi9.LJIILJJIL = new InterfaceC2213251Bjn() { // from class: X.1Bj6
        };
        AbstractC2212891BjD abstractC2212891BjD = new AbstractC2212891BjD() { // from class: X.1Biq
        };
        C2212191Bi5 c2212191Bi5 = C1031160cwM.LIZ;
        C2212281BiE.LIZIZ(context, null);
        C1031160cwM.LIZJ.getClass();
        C2212231Bi9.LJIJ = abstractC2212891BjD;
        C2212231Bi9.LJIL = R.style.ud;
        C2212231Bi9.LJIJJ = 2131848712;
        C2212231Bi9.LJIJJLI = 2131848711;
        C2212231Bi9.LJJIIJZLJL = 1;
        C2212231Bi9.LJIJI = 0;
    }

    public static void LJI(String str, String str2, long j, long j2, JSONObject jSONObject) {
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, str2, String.valueOf(j), "", String.valueOf(j2));
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c1022820ciuLJ.LIZJ(jSONObject.opt(next), next);
            }
        }
        c1022820ciuLJ.LJIIIIZZ();
        if (C2184171Adz.LIZJ()) {
            C20684815ws.LJIIJ(j2, str, str2, String.valueOf(j), jSONObject);
            return;
        }
        if (!C2184171Adz.LIZIZ()) {
            return;
        }
        try {
            jSONObject.put("_ad_staging_flag", "1");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C20684815ws.LJIIJ(j2, str, str2, String.valueOf(j), jSONObject);
    }
}
