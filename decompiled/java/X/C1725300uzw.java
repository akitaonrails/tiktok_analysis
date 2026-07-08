package X;

import Y.ACListenerS128S0200000_26;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionPopupConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725300uzw implements InterfaceC2217701Bqy {
    public static final Map<String, C1725410v07> LLJILJIL = new LinkedHashMap();
    public static final Map<String, WeakReference<C1725300uzw>> LLJILJILJ = new LinkedHashMap();
    public WeakReference<SparkActivity> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // X.InterfaceC2217701Bqy
    public final Context LIZJ(Context context) {
        return context;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJIL(Activity activity, Context context) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIJIIJI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJJ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJJJZI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLJLI(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLL(SparkActivity sparkActivity) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC2217701Bqy
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC1163130gND
    public final void release() {
    }

    public final void LIZ() throws JSONException {
        if (this.LLJI) {
            this.LLJI = false;
            try {
                WeakReference<SparkActivity> weakReference = this.LL;
                if (weakReference == null) {
                    weakReference = null;
                }
                SparkActivity sparkActivity = weakReference.get();
                if (sparkActivity != null) {
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContext = new SparkContext();
                    String str = this.LLILLL;
                    if (str == null) {
                        str = "";
                    }
                    sparkContext.LJJLIIJ(str);
                    sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0v08
                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC1542790qFZ
                        public final C1725480v0E LJJJJI() {
                            return new C1725480v0E(0, 0);
                        }

                        @Override // X.InterfaceC1542790qFZ
                        public final C1725480v0E LJJLI() {
                            return new C1725480v0E(0, 0);
                        }
                    });
                    sparkContext.LJJLIIIJILLIZJL(sparkContext.runtimeInfo);
                    c1537900q7g.getClass();
                    new C1541950qED(sparkActivity, sparkContext).LIZIZ();
                }
                JSONObject jSONObject = new JSONObject();
                String str2 = this.LLILLL;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("target_schema", str2);
                jSONObject.put("result", 1);
                C1725360v02 c1725360v02 = C1725360v02.LIZ;
                String str3 = this.LLILZLL;
                if (str3 == null) {
                    str3 = "";
                }
                JSONObject jSONObjectLJI = c1725360v02.LIZ(str3).LJI();
                if (jSONObjectLJI != null) {
                    jSONObject = C1530940pwS.LIZ(jSONObjectLJI, jSONObject);
                }
                C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_universal_container_seamless_insert", jSONObject, null, 12);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                JSONObject jSONObject2 = new JSONObject();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                jSONObject2.put("error", message);
                jSONObject2.put("result", 0);
                String str4 = this.LLILLL;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject2.put("target_schema", str4);
                C1725360v02 c1725360v022 = C1725360v02.LIZ;
                String str5 = this.LLILZLL;
                JSONObject jSONObjectLJI2 = c1725360v022.LIZ(str5 != null ? str5 : "").LJI();
                if (jSONObjectLJI2 != null) {
                    jSONObject2 = C1530940pwS.LIZ(jSONObjectLJI2, jSONObject2);
                }
                C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_universal_container_seamless_insert", jSONObject2, null, 12);
            }
        }
    }

    @Override // X.InterfaceC2217701Bqy
    public final void finish() throws JSONException {
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    @Override // X.InterfaceC2217701Bqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(boolean r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725300uzw.LJIILLIIL(boolean):void");
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJI(SparkActivity sparkActivity) throws JSONException {
        Uri uriLIZLLL;
        if (this.LLJIJIL) {
            SparkContext sparkContext = sparkActivity.LL;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            if (sparkContext != null) {
                try {
                    String strLJIJI = sparkContext.LJIJI();
                    if (strLJIJI != null && (uriLIZLLL = C759510Tqn.LIZLLL(strLJIJI, "shouldClosePrePipoWhenApp")) != null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "close_pre_pipo_when_app");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    return;
                }
            }
            if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("pipo_container_close_prev_when_app", true)) {
                    sparkActivity.finish();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // X.InterfaceC2217701Bqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(com.bytedance.hybrid.spark.page.SparkActivity r6) throws org.json.JSONException {
        /*
            r5 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "pipo_container_show_toast"
            r4 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)
            if (r0 == 0) goto L1d
            X.0mGx r1 = new X.0mGx
            r1.<init>(r6)
            java.lang.String r0 = "PIPO Web Container Deallocated"
            r1.LJIIJ(r0)
            r1.LJIIJJI()
        L1d:
            java.lang.String r0 = r5.LLILZLL
            if (r0 == 0) goto L39
            java.util.Map<java.lang.String, X.0v07> r1 = X.C1725300uzw.LLJILJIL
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L39
            java.lang.String r0 = r5.LLILZLL
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.0v07 r0 = (X.C1725410v07) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L43
        L39:
            java.lang.String r3 = r5.LLIZ
            java.lang.String r2 = r5.LLILZLL
            r1 = 1
            r0 = 16
            X.C1725270uzt.LIZLLL(r3, r2, r4, r1, r0)
        L43:
            com.bytedance.hybrid.spark.SparkContext r0 = r6.LL
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.containerId
            if (r1 == 0) goto L50
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<X.0uzw>> r0 = X.C1725300uzw.LLJILJILJ
            r0.remove(r1)
        L50:
            X.0v0K r0 = new X.0v0K
            r0.<init>()
            X.C1725430v09.LIZ = r4
            r0 = 0
            X.C1725430v09.LIZIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725300uzw.LJJJJLL(com.bytedance.hybrid.spark.page.SparkActivity):void");
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
        String strLJIJI;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        View viewE1;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_container_detect_blank_switch", false)) {
            SparkContext sparkContext = sparkActivity.LL;
            final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            if (sparkContext != null && (strLJIJI = sparkContext.LJIJI()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "url")) != null && (sparkFragment = sparkActivity.LLJILJIL) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null && (viewE1 = kitView.e1()) != null) {
                final Uri uriLIZLLL = C759510Tqn.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "blank_detect");
                if (uriLIZLLL != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL, "pipo_additional_tracking_params");
                }
                InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
                C1521250pgp c1521250pgpBuildConfig = webViewMonitorHelper.buildConfig();
                String str = this.LLJ;
                if (str == null) {
                    str = "";
                }
                c1521250pgpBuildConfig.LJFF = str;
                c1521250pgpBuildConfig.LIZIZ = new String[]{String.valueOf(viewE1.hashCode())};
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0uzv
                    public Long LIZ;

                    @Override // X.InterfaceC1521890phr
                    public final void LIZ(long j) {
                        this.LIZ = Long.valueOf(j);
                    }

                    @Override // X.InterfaceC1521890phr
                    public final void LIZIZ(int i, View view) {
                        String str2;
                        String host;
                        boolean z;
                        long jLongValue;
                        String path;
                        Uri uri = uriLIZLLL;
                        Long l = this.LIZ;
                        C1725300uzw c1725300uzw = this;
                        String str3 = c1725300uzw.LLJ;
                        String str4 = c1725300uzw.LLIZLLLIL;
                        String str5 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                        long jLongValue2 = -1;
                        boolean z2 = false;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            String str6 = "";
                            if (str3 == null) {
                                str2 = "";
                            } else {
                                str2 = str3;
                            }
                            jSONObject.put("biz", str2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            jSONObject.put("bdhm_bid", str4);
                            if (uri == null || (host = uri.getHost()) == null) {
                                host = "";
                            }
                            jSONObject.put("url_host", host);
                            if (uri != null && (path = uri.getPath()) != null) {
                                str6 = path;
                            }
                            jSONObject.put("url_path", str6);
                            if (i == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jSONObject.put("is_blank", z);
                            jSONObject.put("blank_state", String.valueOf(i));
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            jSONObject.put("time_duration", jLongValue);
                            C1725270uzt.LIZ(str3, str5, jSONObject);
                            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C603870NmL(jSONObject, null), 2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1AF0.LJ(th);
                        }
                        if (i == 1) {
                            z2 = true;
                        }
                        C1725240uzq.LIZ.getClass();
                        InterfaceC759720Tr8 interfaceC759720Tr8 = (InterfaceC759720Tr8) ((LinkedHashMap) C1725240uzq.LJFF).get(this.LLILZLL);
                        if (interfaceC759720Tr8 != null) {
                            Long l2 = this.LIZ;
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            }
                            interfaceC759720Tr8.LIZIZ(jLongValue2, z2);
                        }
                    }
                };
                webViewMonitorHelper.addConfig(c1521250pgpBuildConfig);
            } else {
                return;
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_container_show_toast", false)) {
            C1389890mGx c1389890mGx = new C1389890mGx(sparkActivity);
            c1389890mGx.LJIIJ("PIPO Web Container Inited");
            c1389890mGx.LJIIJJI();
        }
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC2217701Bqy
    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPress, back_url_v3: ");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLILZ;
        if (str != null && C1948507kB.LIZ(str)) {
            SmartRouter.buildRoute(sparkActivity, this.LLILZ).open();
            return true;
        }
        String str2 = this.LLILLL;
        if (str2 != null && C1948507kB.LIZ(str2)) {
            if (this.LLILZIL) {
                Map<String, C1725410v07> map = LLJILJIL;
                C1725410v07 c1725410v07 = (C1725410v07) ((LinkedHashMap) map).get(this.LLILZLL);
                if (c1725410v07 != null && !c1725410v07.LIZLLL) {
                    this.LLJI = true;
                    C1725410v07 c1725410v072 = (C1725410v07) ((LinkedHashMap) map).get(this.LLILZLL);
                    if (c1725410v072 != null) {
                        c1725410v072.LIZLLL = true;
                    }
                }
                return false;
            }
            SmartRouter.buildRoute(sparkActivity, this.LLILLL).open();
            return false;
        }
        C1725540v0K c1725540v0K = new C1725540v0K();
        PipoRetentionPopupConfig pipoRetentionPopupConfigLIZJ = c1725540v0K.LIZJ(sparkActivity.LL);
        if (pipoRetentionPopupConfigLIZJ == null || !c1725540v0K.LJ(sparkActivity, pipoRetentionPopupConfigLIZJ, "back_pressed")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2217701Bqy
    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
        SparkContext sparkContext;
        InterfaceC1892990zMP interfaceC1892990zMP;
        SparkContext sparkContext2;
        InterfaceC1892990zMP interfaceC1892990zMP2;
        String str;
        String strLJIJI;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PIPO Web Container Post Created: ");
        sbLIZ.append(Objects.hash(sparkActivity));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL = new WeakReference<>(sparkActivity);
        SparkContext sparkContext3 = sparkActivity.LL;
        if (sparkContext3 != null && (strLJIJI = sparkContext3.LJIJI()) != null) {
            this.LLILLJJLI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "back_open_url");
            this.LLILLL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "pipo_jump_schema_when_close");
            this.LLILZ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "pipo_block_url_when_close");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJIJI), "pipo_jump_schema_when_close_seamless_insert");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.equals("1")) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZIL = z;
        }
        SparkContext sparkContext4 = sparkActivity.LL;
        if (sparkContext4 != null && (str = sparkContext4.containerId) != null) {
            this.LLILZLL = str;
            Map<String, C1725410v07> map = LLJILJIL;
            if (!map.containsKey(str)) {
                map.put(str, new C1725410v07());
            }
            Map<String, WeakReference<C1725300uzw>> map2 = LLJILJILJ;
            if (!map2.containsKey(str)) {
                map2.put(str, new WeakReference<>(this));
            }
        }
        String str2 = this.LLILLL;
        if (str2 != null && C1948507kB.LIZ(str2) && (sparkContext2 = sparkActivity.LL) != null && (interfaceC1892990zMP2 = (InterfaceC1892990zMP) sparkContext2.LJFF(InterfaceC1892990zMP.class)) != null) {
            interfaceC1892990zMP2.setCloseAllClickListener(new ACListenerS128S0200000_26(sparkActivity, this, 32));
        }
        String str3 = this.LLILZ;
        if (str3 != null && C1948507kB.LIZ(str3) && (sparkContext = sparkActivity.LL) != null && (interfaceC1892990zMP = (InterfaceC1892990zMP) sparkContext.LJFF(InterfaceC1892990zMP.class)) != null) {
            interfaceC1892990zMP.setCloseAllClickListener(new ACListenerS128S0200000_26(sparkActivity, this, 33));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:23:0x008a, B:25:0x0092, B:27:0x0096, B:29:0x009a, B:31:0x009e, B:33:0x00a2, B:34:0x00a4, B:36:0x00ac, B:38:0x00b2, B:39:0x00c6, B:41:0x00cc), top: B:48:0x008a }] */
    @Override // X.InterfaceC2217701Bqy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(com.bytedance.hybrid.spark.page.SparkActivity r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725300uzw.LJJLIIIJL(com.bytedance.hybrid.spark.page.SparkActivity, android.os.Bundle):void");
    }
}
