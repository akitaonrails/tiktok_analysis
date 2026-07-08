package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AutofillWindowModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068020dto {
    public static WeakReference<WebView> LJFF;
    public static JSONObject LJII;
    public static boolean LJIIIIZZ;
    public static C1068650dup LJIIJJI;
    public static final C1068020dto LIZ = new C1068020dto();
    public static final HashMap<String, Boolean> LIZIZ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZJ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZLLL = new HashMap<>();
    public static List<String> LJ = new ArrayList();
    public static String LJI = "";
    public static final HashMap<String, String> LJIIIZ = new HashMap<>();
    public static long LJIIJ = System.currentTimeMillis();

    static {
        System.currentTimeMillis();
    }

    public static String LJIIJJI() {
        String strLJIIIIZZ;
        List<String> list = LJ;
        if ((list == null || list.isEmpty()) || (strLJIIIIZZ = LJIIIIZZ()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(strLJIIIIZZ);
        JSONObject jSONObject2 = new JSONObject();
        List<String> list2 = LJ;
        if (list2 != null) {
            synchronized (list2) {
                try {
                    for (String str : list2) {
                        jSONObject2.put(str, jSONObject.optString(str));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C786410Ut5.J3(jSONObject2);
    }

    public static boolean LJII() {
        List<String> list = AdAutofillConfigSettings.LIZ().channelList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        while (true) {
            boolean zLIZIZ = false;
            for (String str : list) {
                if (a0.LJJIIZI(AdAutofillConfigSettings.LIZ().autofillPopupSchema, str, false)) {
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZIZ() != null) {
                        zLIZIZ = C1552050qUV.LIZIZ(((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("global"), str);
                    }
                }
            }
            return zLIZIZ;
        }
    }

    public static final String LJIIIIZZ() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() || uid == null || uid.length() == 0) {
            return null;
        }
        HashMap<String, String> map = LJIIIZ;
        String str = map.get(uid);
        if (str != null && str.length() != 0) {
            return map.get(uid);
        }
        byte[] bytes = Keva.getRepo("autofill_info").getBytes(uid, null);
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        LIZ.getClass();
        byte[] bArrLJFF = LJFF(bytes);
        if (bArrLJFF == null) {
            return null;
        }
        map.put(uid, new String(bArrLJFF, Charsets.UTF_8));
        return map.get(uid);
    }

    public static final JSONArray LJIIJ() {
        JSONObject jSONObject;
        JSONArray jSONArrayNames;
        String strLJIIIIZZ = LJIIIIZZ();
        if ((strLJIIIIZZ == null || strLJIIIIZZ.length() == 0) || (jSONArrayNames = (jSONObject = new JSONObject(strLJIIIIZZ)).names()) == null || jSONArrayNames.length() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONObject.optString(jSONArrayNames.optString(i));
            if (strOptString != null && strOptString.length() != 0) {
                jSONArray.put(jSONArrayNames.optString(i));
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public static JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray jSONArrayNames;
        String strLJIIIIZZ = LJIIIIZZ();
        if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
            String strLJIIIIZZ2 = LJIIIIZZ();
            if (strLJIIIIZZ2 == null) {
                strLJIIIIZZ2 = "";
            }
            jSONObject2 = new JSONObject(strLJIIIIZZ2);
        } else {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null || (jSONArrayNames = jSONObject.names()) == null || jSONArrayNames.length() == 0) {
            return jSONObject2;
        }
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            if (!TextUtils.equals(jSONObject2.optString(jSONArrayNames.optString(i)), jSONObject.optString(jSONArrayNames.optString(i)))) {
                jSONObject2.put(jSONArrayNames.optString(i), jSONObject.optString(jSONArrayNames.optString(i)));
            }
        }
        if (jSONObject2.length() == 0) {
            return null;
        }
        return jSONObject2;
    }

    public static final void LIZIZ(boolean z) {
        WebView webView;
        String strOptString;
        String strOptString2;
        WeakReference<WebView> weakReference = LJFF;
        if (weakReference != null && (webView = weakReference.get()) != null) {
            if (z) {
                JSONObject jSONObject = LJII;
                String str = "";
                if (jSONObject == null || (strOptString = jSONObject.optString("cid")) == null) {
                    strOptString = "";
                }
                JSONObject jSONObject2 = LJII;
                if (jSONObject2 != null && (strOptString2 = jSONObject2.optString("log_extra")) != null) {
                    str = strOptString2;
                }
                String string = null;
                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "autofill_agree", strOptString, str, null);
                c1022820ciuLJ.LIZJ("autofill", "refer");
                c1022820ciuLJ.LIZIZ(LJI, "url");
                List<String> list = LJ;
                if (list != null) {
                    string = list.toString();
                }
                c1022820ciuLJ.LIZIZ(string, "autofill_fields");
                c1022820ciuLJ.LJII();
                LIZ.getClass();
                if (!C1035800d3q.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("window.__autoFillCallback__(");
                    sbLIZ.append(LJIIJJI());
                    sbLIZ.append(",true)");
                    webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0duI
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                        }
                    });
                } else {
                    C1544770qIl.LIZ(webView, new AbstractC1043220dFo() { // from class: X.0dGV
                        @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                        public final String LJFF(Uri uri, WebView webView2) {
                            C1068020dto.LIZ.getClass();
                            return C1068020dto.LJIIJJI();
                        }
                    });
                }
            }
            LIZ.getClass();
            if (!C1035800d3q.LIZ()) {
                webView.evaluateJavascript("window.__AutoFillPopupClose__()", new ValueCallback() { // from class: X.0duJ
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                    }
                });
            } else {
                C1544770qIl.LIZ(webView, new AbstractC1068480duY() { // from class: X.0duZ
                });
            }
        }
    }

    public static boolean LIZJ(boolean z) {
        if (LIZLLL(z) == -1) {
            return true;
        }
        return false;
    }

    public static int LIZLLL(boolean z) {
        User currentUser;
        if (!C305320Bxy.LIZ() || C305310Bxx.LIZ()) {
            return 0;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && currentUser.getUid() != null) {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
                return 2;
            }
            if (!z) {
                return 3;
            }
            return -1;
        }
        return 1;
    }

    public static JSONObject LJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String strLJIIIIZZ = LJIIIIZZ();
        if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
            String strLJIIIIZZ2 = LJIIIIZZ();
            if (strLJIIIIZZ2 == null) {
                strLJIIIIZZ2 = "";
            }
            jSONObject2 = new JSONObject(strLJIIIIZZ2);
        } else {
            jSONObject2 = new JSONObject();
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            if (!TextUtils.equals(jSONObject2.optString(jSONArrayNames.optString(i)), jSONObject.optString(jSONArrayNames.optString(i)))) {
                jSONObject3.put(jSONArrayNames.optString(i), jSONObject.optString(jSONArrayNames.optString(i)));
            }
        }
        if (jSONObject3.length() == 0) {
            return null;
        }
        return jSONObject3;
    }

    public static byte[] LJFF(byte[] bArr) {
        boolean z;
        try {
            KeyGenerator.getInstance("AES").init(256);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            String str = AdAutofillConfigSettings.LIZ().autofillKey;
            boolean z2 = false;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            Charset charset = Charsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(charset), "AES");
            String str2 = AdAutofillConfigSettings.LIZ().autofillIv;
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes(charset)));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static byte[] LJI(String str) {
        boolean z;
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            String str2 = AdAutofillConfigSettings.LIZ().autofillKey;
            boolean z2 = false;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            Charset charset = Charsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "AES");
            String str3 = AdAutofillConfigSettings.LIZ().autofillIv;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            }
            if (z2) {
                return null;
            }
            cipher.init(1, secretKeySpec, new IvParameterSpec(str3.getBytes(charset)));
            return cipher.doFinal(str.getBytes(charset));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LJIIIZ(boolean z) {
        IUserService iUserService;
        User currentUser;
        final String uid;
        LIZ.getClass();
        if (!LIZJ(z) || (iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || Intrinsics.LJFF(LIZIZ.get(uid), Boolean.TRUE)) {
            return;
        }
        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/identity/get_fields/", C2097908Jt.LIZJ(new Pair("fields", "[3]")), new AbstractC846040XGw<C846060XGy>() { // from class: X.0duB
            @Override // X.AbstractC846040XGw
            public final void LIZ(C0XGA c0xga) {
                boolean z2;
                String string;
                boolean z3;
                String str;
                JSONObject jSONObject;
                JSONObject jSONObjectOptJSONObject;
                JSONArray jSONArrayNames;
                String strJ3;
                C846060XGy c846060XGy = (C846060XGy) c0xga;
                if (c846060XGy != null && c846060XGy.LIZIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C1068020dto.LIZ.getClass();
                    C1068020dto.LIZIZ.put(uid, Boolean.TRUE);
                    JSONObject jSONObject2 = c846060XGy.LJIILJJIL;
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("3");
                        if (jSONObjectOptJSONObject2 != null) {
                            strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject2);
                        } else {
                            strJ3 = null;
                        }
                        C1068020dto.LJIILL(strJ3);
                        C786410Ut5.J3(jSONObject2);
                    }
                }
                HashMap map = new HashMap();
                String str2 = "";
                if (c846060XGy == null || (jSONObject = c846060XGy.LJIILJJIL) == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("3")) == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null || (string = jSONArrayNames.toString()) == null) {
                    string = "";
                }
                map.put("autofill_fields", string);
                if (c846060XGy != null && c846060XGy.LIZIZ) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_success", str);
                map.put("scenario", "1");
                if (c846060XGy != null) {
                    if (c846060XGy.LIZIZ) {
                        str2 = "-1";
                    } else {
                        String string2 = Integer.valueOf(c846060XGy.LIZLLL).toString();
                        if (string2 != null) {
                            str2 = string2;
                        }
                    }
                }
                map.put("error_code", str2);
                C20684815ws.LJIILLIIL("autofill_info_acquire", map);
            }
        });
    }

    public static final void LJIILL(String str) {
        String uid;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && uid != null && uid.length() != 0) {
            LJIIIZ.put(uid, str);
            if (str == null) {
                return;
            }
            LIZ.getClass();
            Keva.getRepo("autofill_info").storeBytes(uid, LJI(str));
        }
    }

    public static final void LJIILJJIL(Integer num, String str) {
        if (str != null && str.length() != 0 && num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    LIZLLL.put(str, Boolean.TRUE);
                    return;
                }
                return;
            }
            LIZJ.put(str, Boolean.TRUE);
        }
    }

    public static final void LJIIL(int i, int i2, int i3, JSONObject jSONObject) {
        String strOptString;
        JSONArray jSONArrayNames;
        String strOptString2;
        JSONObject jSONObject2 = LJII;
        String str = "";
        if (jSONObject2 == null || (strOptString = jSONObject2.optString("cid")) == null) {
            strOptString = "";
        }
        JSONObject jSONObject3 = LJII;
        if (jSONObject3 != null && (strOptString2 = jSONObject3.optString("log_extra")) != null) {
            str = strOptString2;
        }
        String string = null;
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "popup_show", strOptString, str, null);
        c1022820ciuLJ.LIZJ("autofill_popup_window", "refer");
        c1022820ciuLJ.LIZIZ(LJI, "url");
        c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "popup_type");
        if (i == 0) {
            string = String.valueOf(LJ);
        } else if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null) {
            string = jSONArrayNames.toString();
        }
        c1022820ciuLJ.LIZIZ(string, "autofill_fields");
        c1022820ciuLJ.LIZIZ(Integer.valueOf(i2), "is_success");
        if (i2 == 1) {
            i3 = -1;
        }
        c1022820ciuLJ.LIZIZ(Integer.valueOf(i3), "fail_reason");
        c1022820ciuLJ.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(final android.view.View r9, final org.json.JSONObject r10, final boolean r11, final boolean r12, final boolean r13, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r14) throws org.json.JSONException {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "3"
            r8 = r10
            org.json.JSONObject r0 = r1.put(r0, r8)
            java.lang.String r1 = "fields"
            java.lang.String r0 = X.C786410Ut5.J3(r0)
            r2.put(r1, r0)
            if (r8 == 0) goto L2e
            org.json.JSONArray r0 = r8.names()
            if (r0 == 0) goto L2e
            org.json.JSONArray r0 = r8.names()
            if (r0 == 0) goto L46
            int r0 = r0.length()
            if (r0 != 0) goto L46
        L2e:
            java.lang.String r7 = "[]"
        L30:
            X.0XWU r1 = X.C0XH0.LIZLLL()
            X.0du9 r3 = new X.0du9
            r10 = r14
            r6 = r13
            r5 = r12
            r4 = r11
            r9 = r9
            r3.<init>()
            java.lang.String r0 = "/passport/identity/set_fields/"
            X.0XH0 r1 = (X.C0XH0) r1
            r1.LIZIZ(r0, r2, r3)
            return
        L46:
            X.0dto r0 = X.C1068020dto.LIZ
            r0.getClass()
            org.json.JSONObject r0 = LJ(r8)
            if (r0 == 0) goto L2e
            org.json.JSONArray r0 = r0.names()
            if (r0 == 0) goto L2e
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L30
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1068020dto.LJIILLIIL(android.view.View, org.json.JSONObject, boolean, boolean, boolean, kotlin.jvm.functions.Function1):void");
    }

    public static final void LJIILIIL(Context context, boolean z, Integer num, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, AutofillModel autofillModel, String str3) throws JSONException {
        String str4;
        C19EG c19egLIZIZ;
        boolean z2;
        AutofillWindowModel updateWindow;
        String title;
        AutofillWindowModel saveWindow;
        AutofillWindowModel autofillWindow;
        JSONObject jSONObject3;
        String str5;
        if (context == null) {
            return;
        }
        if (z) {
            HashMap map = new HashMap();
            map.put("enter_from", str3);
            LIZ.getClass();
            if (LJII()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("lynx_gecko_ready_status", str5);
            C20684815ws.LJIILLIIL("enter_contact_info_edit_page", map);
            str4 = AdAutofillConfigSettings.LIZ().settingLynxSchema;
        } else if (num != null) {
            if (num.intValue() == 0) {
                str4 = AdAutofillConfigSettings.LIZ().autofillPopupSchema;
            } else if (num.intValue() == 1) {
                str4 = AdAutofillConfigSettings.LIZ().savePopupSchema;
            } else {
                return;
            }
        } else {
            return;
        }
        if (str4 != null) {
            JSONObject jSONObject4 = new JSONObject();
            if (!z) {
                jSONObject4.put("url", LJI);
                jSONObject4.put("adInfo", jSONObject);
                jSONObject4.put("requestId", str);
            }
            String str6 = "";
            if ((num != null && num.intValue() == 0) || z) {
                if (LJIIIIZZ() == null) {
                    jSONObject3 = new JSONObject();
                } else {
                    String strLJIIIIZZ = LJIIIIZZ();
                    if (strLJIIIIZZ == null) {
                        strLJIIIIZZ = "";
                    }
                    jSONObject3 = new JSONObject(strLJIIIIZZ);
                }
                jSONObject4.put("autofillInfo", jSONObject3);
            }
            if (num != null && num.intValue() == 1) {
                LIZ.getClass();
                jSONObject4.put("autofillInfo", LIZ(jSONObject2));
                if (C703302op.LIZ(str2)) {
                    jSONObject4.put("extraInfo", str2);
                }
            }
            if (!z) {
                jSONObject4.put("learnMoreLink", AdAutofillConfigSettings.LIZ().learnMoreLink);
            }
            Uri uri = UriProtector.parse(str4);
            if (!z) {
                if (C07J1.LIZ()) {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null) {
                        if (num != null && num.intValue() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1068650dup c1068650dup = new C1068650dup(c19egLIZIZ, z2, jSONObject4, autofillModel);
                        LJIIJJI = c1068650dup;
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        if (!z2 ? !(LJIIJ() != null ? autofillModel == null || (updateWindow = autofillModel.getUpdateWindow()) == null || (title = updateWindow.getTitle()) == null : autofillModel == null || (saveWindow = autofillModel.getSaveWindow()) == null || (title = saveWindow.getTitle()) == null) : !(autofillModel == null || (autofillWindow = autofillModel.getAutofillWindow()) == null || (title = autofillWindow.getTitle()) == null)) {
                            str6 = title;
                        }
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        C0OM1 c0om1 = new C0OM1();
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LJ = c419910GdJ;
                        c0om1.LJ(c1251150ifB);
                        C1251150ifB c1251150ifB2 = new C1251150ifB();
                        c1251150ifB2.LIZLLL();
                        c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                        c1251150ifB2.LIZJ(new AwS560S0100000_16(c1068650dup, 657));
                        c0om1.LIZIZ(c1251150ifB2);
                        C1250250idj c1250250idj = new C1250250idj();
                        c1250250idj.LIZJ = str6;
                        c0om1.LIZJ = c1250250idj;
                        c0om1.LIZLLL = true;
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJJIJIL = c0om1;
                        tuxSheet.LLJJJ = null;
                        tuxSheet.LLJJIII = c1068650dup.LIZLLL;
                        c1390920mIc.LJIIIIZZ(0);
                        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                        tuxSheet2.LLJLILLLLZIIL = false;
                        tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1077320e8o(c1068650dup, 1);
                        tuxSheet2.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
                        return;
                    }
                    return;
                }
                LJIIJ = System.currentTimeMillis();
                if (a0.LJJIIZI(str4, "lynxview_popup", false) && !C0BXA.LIZ()) {
                    IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
                    if (iAdSparkUtilsLJFF == null) {
                        return;
                    }
                    iAdSparkUtilsLJFF.LIZ(context, uri.buildUpon().appendQueryParameter("initialData", C786410Ut5.J3(jSONObject4)).appendQueryParameter("target_handler", "ad_autofill").build().toString(), null, ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("global"), C1000150c8L.LIZIZ(), true, null, null, null);
                    return;
                }
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                C1068120dty c1068120dty = new C1068120dty();
                c1537900q7g.getClass();
                C1537900q7g.LJIIIIZZ(c1068120dty);
                SmartRouter.buildRoute(context, uri.buildUpon().appendQueryParameter("initialData", C786410Ut5.J3(jSONObject4)).appendQueryParameter("target_handler", "ad_autofill").build().toString()).open();
                return;
            }
            SmartRouter.buildRoute(context, uri.buildUpon().appendQueryParameter("initialData", C786410Ut5.J3(jSONObject4)).build().toString()).open();
        }
    }
}
