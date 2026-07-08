package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19263610Xy extends C10YE {
    @Override // X.C10YE
    public final void LIZJ(C1950707kX c1950707kX) {
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        Uri data;
        C19266010Yw.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "deeplink_slow_code_clean_exp_v2", true);
        Intent intent = c1950707kX.LIZJ;
        String str = "";
        if (C0BK8.LIZ()) {
            Intent intent2 = c1950707kX.LIZJ;
            String string = c1950707kX.LIZIZ.toString();
            if (string == null) {
                string = "";
            }
            String strLJII = LJII(intent2, "ug_applink_long_url");
            if (C123100dR.LIZ(strLJII)) {
                c1950707kX.LJFF.LJIIIZ = strLJII;
            } else if (C123100dR.LIZ(string)) {
                c1950707kX.LJFF.LJIIIZ = string;
            }
        }
        Intent intent3 = c1950707kX.LIZJ;
        Uri uri = c1950707kX.LIZIZ;
        if (!intent3.getBooleanExtra("is_short_link", false) && uri != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(uri.toString()).buildUpon();
            builderBuildUpon.appendQueryParameter("convert_url", ((String[]) a0.LJJLIIIJILLIZJL(uri.toString(), new String[]{"?"}, 0, 6).toArray(new String[0]))[0]);
            Uri uriBuild = builderBuildUpon.build();
            if (uriBuild != null) {
                c1950707kX.LIZIZ = uriBuild;
            }
        }
        ITrafficRecorderService iTrafficRecorderService = (ITrafficRecorderService) PluggableExtentionKt.pluggableSpi$default(ITrafficRecorderService.class, false, false, false, 14, null);
        if (iTrafficRecorderService != null) {
            iTrafficRecorderService.LIZJ(c1950707kX.LIZIZ.toString());
        }
        boolean zEquals = TextUtils.equals(LJII(intent, "dl_from"), "af");
        boolean zLIZ = C08PZ.LIZ(intent, "from_notification");
        c1950707kX.LJ.put("msg_id", Long.valueOf(intent.getLongExtra("msg_id", 0L)));
        c1950707kX.LJ.put("is_from_af", Boolean.valueOf(zEquals));
        c1950707kX.LJ.put("is_from_fb", Boolean.valueOf(TextUtils.equals(LJII(intent, "dl_from"), "facebook")));
        c1950707kX.LJ.put("is_ddl", Boolean.valueOf(intent.getBooleanExtra("is_ddl", false)));
        c1950707kX.LJ.put("is_from_self", Boolean.valueOf(C08PZ.LIZ(intent, "is_from_self")));
        HashMap<String, Object> map = c1950707kX.LJ;
        String strLJII2 = LJII(intent, "in_app_enter_from");
        if (strLJII2 == null) {
            strLJII2 = "";
        }
        map.put("in_app_enter_from", strLJII2);
        c1950707kX.LJ.put("is_from_notification", Boolean.valueOf(zLIZ));
        HashMap<String, Object> map2 = c1950707kX.LJ;
        String strLJII3 = LJII(intent, "from_notification_uuid");
        if (strLJII3 == null) {
            strLJII3 = "";
        }
        map2.put("notification_id", strLJII3);
        HashMap<String, Object> map3 = c1950707kX.LJ;
        Uri data2 = intent.getData();
        if (data2 != null && data2.isHierarchical()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (data = intent.getData()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "gd_label")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        map3.put("gd_label", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        HashMap<String, Object> map4 = c1950707kX.LJ;
        String strLJII4 = LJII(intent, "rule_id");
        if (strLJII4 == null) {
            strLJII4 = "";
        }
        map4.put("rule_id", strLJII4);
        HashMap<String, Object> map5 = c1950707kX.LJ;
        String strLJII5 = LJII(intent, "from_token");
        if (strLJII5 != null) {
            str = strLJII5;
        }
        map5.put("from_token", str);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("pre_o_urls");
        if (stringArrayListExtra != null) {
            c1950707kX.LJ.put("pre_o_urls", stringArrayListExtra);
        }
        C19264010Yc c19264010Yc = C19264010Yc.LIZIZ;
        if (!((Boolean) c1950707kX.LJ.get("is_from_fb")).booleanValue() && !((Boolean) c1950707kX.LJ.get("is_from_af")).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        c19264010Yc.LIZ(z2);
        Object obj = c1950707kX.LJ.get("is_from_notification");
        if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
            C1030680cva.LJIJ = bool2.booleanValue();
        }
        Object obj2 = c1950707kX.LJ.get("is_from_notification");
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            C1035180d2q.LIZ = bool.booleanValue();
        }
        Uri data3 = intent.getData();
        if (data3 != null) {
            try {
                if (data3.isHierarchical() && (Intrinsics.LJFF(data3.getScheme(), "https") || Intrinsics.LJFF(data3.getScheme(), "http") || intent.getBooleanExtra("is_short_link", false))) {
                    c1950707kX.LJ.put("from_ug_applink", Boolean.TRUE);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C10YX.LIZIZ = zEquals;
        C10YX.LIZJ = zLIZ;
    }

    @Override // X.C10YE
    public final Uri LIZLLL(Intent intent) {
        String action = intent.getAction();
        Uri uri = null;
        if (!C2093608Ic.LJ(action)) {
            boolean z = false;
            if (action != null && a0.LJJJ(action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                z = true;
            }
            if (z) {
                String strLJII = LJII(intent, "open_url");
                if (!C2093608Ic.LJ(strLJII)) {
                    try {
                        uri = UriProtector.parse(strLJII);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return uri;
                    }
                }
            }
        }
        if (uri == null) {
            return intent.getData();
        }
        return uri;
    }

    @Override // X.C10YE
    public final void LJ(C1950707kX c1950707kX) {
        C19266210Yy.LIZIZ.LIZIZ();
        C581900Ms0.LJII = true;
        Object referrer = c1950707kX.LIZ.getReferrer();
        if (referrer == null) {
            referrer = "";
        }
        String string = referrer.toString();
        C1953307kx c1953307kx = C1953307kx.LIZ;
        String str = C19263710Xz.LJIILLIIL;
        c1953307kx.getClass();
        if (!C1953307kx.LIZLLL(str)) {
            C19263710Xz.LJIILLIIL = string;
        }
    }

    public static String LJII(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // X.C10YE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1953807l2 LIZIZ(android.net.Uri r7, X.C1950707kX r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L8e
            if (r7 == 0) goto L8e
            X.07l5 r0 = X.C1954107l5.LIZ
            r0.getClass()
            int r1 = X.C19266010Yw.LIZ
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 5
            if (r1 != r0) goto L3c
        L11:
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.ss.android.ugc.aweme.services.IMainService) r0
            if (r0 == 0) goto L3a
            java.util.List r0 = r0.getHighLevelCommands()
        L25:
            boolean r0 = X.C1954107l5.LIZ(r7, r0)
            if (r0 == 0) goto L3c
            X.07pO r1 = X.EnumC1980807pO.TYPE_HIGH_LEVEL
        L2d:
            java.util.HashMap<X.07pO, X.07l2> r0 = X.C1954107l5.LIZIZ
            java.lang.Object r0 = r0.get(r1)
            X.07l2 r0 = (X.AbstractC1953807l2) r0
            if (r0 != 0) goto L39
            X.07l1 r0 = X.C1954107l5.LIZJ
        L39:
            return r0
        L3a:
            r0 = 0
            goto L25
        L3c:
            android.net.Uri r2 = r8.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "//"
            r1.append(r0)
            java.lang.String r0 = r2.getHost()
            r1.append(r0)
            java.lang.String r0 = r2.getPath()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.router.RouteManager r0 = com.bytedance.router.RouteManager.getInstance()
            java.util.Map r0 = r0.getExternalRouteMap()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L72
            X.07pO r1 = X.EnumC1980807pO.TYPE_ACTION
            goto L2d
        L72:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r0 = com.ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.ss.android.ugc.aweme.services.IMainService) r0
            java.util.List r0 = r0.getDeeplinkCommands()
            boolean r0 = X.C1954107l5.LIZ(r7, r0)
            if (r0 == 0) goto L8b
            X.07pO r1 = X.EnumC1980807pO.TYPE_COMMAND
            goto L2d
        L8b:
            X.07pO r1 = X.EnumC1980807pO.TYPE_NONE
            goto L2d
        L8e:
            X.07l5 r0 = X.C1954107l5.LIZ
            r0.getClass()
            X.07l1 r0 = X.C1954107l5.LIZJ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19263610Xy.LIZIZ(android.net.Uri, X.07kX):X.07l2");
    }

    @Override // X.C10YE
    public final void LIZ(C1950707kX c1950707kX, Activity activity, C1962707mT c1962707mT) {
        Intent intent = c1950707kX.LIZJ;
        if (intent.getBooleanExtra("clear_all_notifications", false)) {
            C303010BuF.LIZ().clearAll(activity);
        }
        if (intent.getIntExtra("need_clear_notification_push_id", -1) != -1) {
            C303010BuF.LIZ().clearNotificationId(LJII(intent, "cancel_TAG"), activity, intent.getIntExtra("need_clear_notification_push_id", -1));
        }
        String str = c1962707mT.LIZJ;
        if (str != null) {
            C1867450yhD.LIZ.getClass();
            Map<String, Long> map = C1867450yhD.LIZIZ;
            Long l = (Long) ((LinkedHashMap) map).get(str);
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("type", "deeplink");
                c2344009Gk.LJIIIIZZ("sub_type", str);
                c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
                c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
                C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
                map.remove(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scene:");
                sbLIZ.append(str);
                sbLIZ.append(", duration:");
                sbLIZ.append(jElapsedRealtime);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x026e A[PHI: r10
      0x026e: PHI (r10v28 java.lang.String) = 
      (r10v27 java.lang.String)
      (r10v29 java.lang.String)
      (r10v29 java.lang.String)
      (r10v30 java.lang.String)
      (r10v31 java.lang.String)
      (r10v32 java.lang.String)
     binds: [B:120:0x0209, B:128:0x0228, B:130:0x0230, B:132:0x0238, B:134:0x0240, B:142:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06a7  */
    @Override // X.C10YE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(X.C1950707kX r28, android.app.Activity r29, X.C1962707mT r30) {
        /*
            Method dump skipped, instruction units count: 2067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19263610Xy.LJFF(X.07kX, android.app.Activity, X.07mT):boolean");
    }
}
