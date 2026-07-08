package X;

import Y.AfS10S2200000_16;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ad.experiment.AdAutofillJsConfigExp;
import com.ss.android.ugc.aweme.autofill.AdPaymentList;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillApi;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillGetResponse;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoFillInfo;
import com.ss.android.ugc.aweme.autofill.api.MaskInstrumentInfo;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.LoginModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentNodeStatusModel;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.web.experiment.AutofillPrefillConfigExp;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS16S2000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067990dtl {
    public static boolean LIZIZ;
    public static JSONObject LJ;
    public static Boolean LJIIIIZZ;
    public static Boolean LJIIIZ;
    public static WeakReference<WebView> LJIILL;
    public static SparkContext LJIILLIIL;
    public static SparkContext LJIJ;
    public static final C1067990dtl LIZ = new C1067990dtl();
    public static boolean LIZJ = true;
    public static String LIZLLL = "";
    public static final HashMap<String, String> LJFF = new HashMap<>();
    public static final HashMap<String, AdPaymentList> LJI = new HashMap<>();
    public static final HashMap<String, Boolean> LJII = new HashMap<>();
    public static List<String> LJIIJ = new ArrayList();
    public static final HashMap<String, Boolean> LJIIJJI = new HashMap<>();
    public static final HashMap<String, Boolean> LJIIL = new HashMap<>();
    public static final HashMap<String, Boolean> LJIILIIL = new HashMap<>();
    public static final HashMap<String, Boolean> LJIILJJIL = new HashMap<>();
    public static final C1068090dtv LJIIZILJ = new C1068090dtv();

    public static JSONObject LJIJJ() throws JSONException {
        String strLJIILL;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        List<String> list = LJIIJ;
        boolean z = false;
        if ((list == null || list.isEmpty()) || (strLJIILL = LJIILL()) == null) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(strLJIILL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        List<String> list2 = LJIIJ;
        if (list2 != null && list2.contains("mobile")) {
            z = true;
        }
        if (z) {
            jSONObject2.put("formatted_mobile", jSONObject.optString("formatted_mobile"));
            jSONObject2.put("format_method", jSONObject.optInt("format_method"));
            jSONObject2.put("mobile_for_lead", jSONObject.optString("mobile_for_lead"));
        }
        return jSONObject2;
    }

    public static JSONObject LJIJJLI() {
        String strLJIILL;
        JSONObject jSONObject;
        List<String> list = LJIIJ;
        if ((list == null || list.isEmpty()) || (strLJIILL = LJIILL()) == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(strLJIILL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        List<String> list2 = LJIIJ;
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
        return jSONObject2;
    }

    public static final AdAutofillModel LJIIL() {
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            return new AdAutofillModel();
        }
        try {
            AdAutofillModel adAutofillModel = (AdAutofillModel) C08JS.LIZ(strLJIILL, AdAutofillModel.class);
            return adAutofillModel == null ? new AdAutofillModel() : adAutofillModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new AdAutofillModel();
        }
    }

    public static final JSONArray LJIILJJIL() {
        JSONObject jSONObject;
        JSONArray jSONArrayNames;
        String strOptString;
        String strLJIILL = LJIILL();
        if ((strLJIILL == null || strLJIILL.length() == 0) || (jSONArrayNames = (jSONObject = new JSONObject(strLJIILL)).names()) == null || jSONArrayNames.length() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            if (!jSONArrayNames.optString(i).equals("is_default") && (strOptString = jSONObject.optString(jSONArrayNames.optString(i))) != null && strOptString.length() != 0) {
                jSONArray.put(jSONArrayNames.optString(i));
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public static final String LJIILL() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() || uid == null || uid.length() == 0) {
            return null;
        }
        HashMap<String, String> map = LJFF;
        String str = map.get(uid);
        if (str != null && str.length() != 0) {
            return map.get(uid);
        }
        byte[] bytes = KevaImpl.getRepo("autofill_info", 1).getBytes(uid, null);
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        C1068020dto.LIZ.getClass();
        byte[] bArrLJFF = C1068020dto.LJFF(bytes);
        if (bArrLJFF == null) {
            return null;
        }
        map.put(uid, new String(bArrLJFF, Charsets.UTF_8));
        return map.get(uid);
    }

    public static final boolean LJIIZILJ() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() || uid == null || uid.length() == 0) {
            return false;
        }
        Boolean bool = LJIIIIZZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        Keva repo = KevaImpl.getRepo("autofill_info", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("contactSwitch");
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static String LJIJ() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return null;
        }
        return uid;
    }

    public static final AdPaymentList LJIL() {
        AdPaymentList adPaymentList;
        List<AdPaymentModel> list;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() || uid == null || uid.length() == 0) {
            return null;
        }
        HashMap<String, AdPaymentList> map = LJI;
        AdPaymentList adPaymentList2 = map.get(uid);
        if (adPaymentList2 != null && (list = adPaymentList2.getList()) != null && !list.isEmpty()) {
            return map.get(uid);
        }
        Keva repo = KevaImpl.getRepo("autofill_info", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("payment");
        String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), null);
        if (string == null || string.length() == 0) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C1068410duR c1068410duR = C1068410duR.LIZ;
        if (C1068410duR.LIZIZ == null) {
            synchronized (c1068410duR) {
                try {
                    if (C1068410duR.LIZIZ == null) {
                        C1068410duR.LIZIZ = new C14BR();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        String strLIZ = C14BR.LIZ(string);
        if (strLIZ == null) {
            return null;
        }
        try {
            adPaymentList = (AdPaymentList) C08JS.LIZ(strLIZ, AdPaymentList.class);
            if (adPaymentList == null) {
                adPaymentList = new AdPaymentList();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            adPaymentList = new AdPaymentList();
        }
        map.put(uid, adPaymentList);
        return LJI.get(uid);
    }

    public static final int LJJ() {
        List<AdPaymentModel> list;
        if (!LJJI()) {
            return 1;
        }
        AdPaymentList adPaymentListLJIL = LJIL();
        return (adPaymentListLJIL == null || (list = adPaymentListLJIL.getList()) == null || list.isEmpty()) ? 2 : 0;
    }

    public static final boolean LJJI() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() || uid == null || uid.length() == 0) {
            return false;
        }
        Boolean bool = LJIIIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        Keva repo = KevaImpl.getRepo("autofill_info", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("paymentSwitch");
        Boolean boolValueOf = Boolean.valueOf(repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true));
        LJIIIZ = boolValueOf;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public static JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONArray jSONArrayNames;
        String strLJIILL = LJIILL();
        if (strLJIILL != null && strLJIILL.length() != 0) {
            String strLJIILL2 = LJIILL();
            if (strLJIILL2 == null) {
                strLJIILL2 = "";
            }
            jSONObject2 = new JSONObject(strLJIILL2);
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

    public static void LJ(String str) throws JSONException {
        WebView webView;
        if (!C291640Bbu.LIZ()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LIZIZ(0, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("autoFillInfo", C786410Ut5.J3(jSONObject));
        if (C123100dR.LIZ(str)) {
            jSONObject2.put("changeFrom", str);
        }
        final String strJ3 = C786410Ut5.J3(jSONObject2);
        WeakReference<WebView> weakReference = LJIILL;
        if (weakReference != null && (webView = weakReference.get()) != null) {
            C1544770qIl.LIZ(webView, new C0X7U() { // from class: X.0duM
                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView2) {
                    return strJ3;
                }
            });
        }
    }

    public static final void LJFF(String str) {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            C1067990dtl c1067990dtl = LIZ;
            EnumC1059300dfk enumC1059300dfk = EnumC1059300dfk.AD;
            c1067990dtl.getClass();
            LJIILIIL(null, str, enumC1059300dfk, uid, null);
        }
    }

    public static final boolean LJIIIIZZ(String str) {
        if (str == null) {
            return false;
        }
        C1067990dtl c1067990dtl = LIZ;
        JSONObject jSONObject = new JSONObject(str);
        c1067990dtl.getClass();
        if (LJIIJ(jSONObject) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(String str) {
        AdPaymentModel adPaymentModel;
        List<AdPaymentModel> list;
        if (str == null) {
            return false;
        }
        try {
            adPaymentModel = (AdPaymentModel) C08JS.LIZ(str, AdPaymentModel.class);
            if (adPaymentModel == null) {
                adPaymentModel = new AdPaymentModel();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            adPaymentModel = new AdPaymentModel();
        }
        LIZ.getClass();
        AdPaymentList adPaymentListLJIL = LJIL();
        if (adPaymentListLJIL != null && (list = adPaymentListLJIL.getList()) != null) {
            for (AdPaymentModel adPaymentModel2 : list) {
                if (Intrinsics.LJFF(adPaymentModel2.getCardNumber(), adPaymentModel.getCardNumber()) && Intrinsics.LJFF(adPaymentModel2.getExpiryTime(), adPaymentModel.getExpiryTime())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static JSONObject LJIIJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        String strLJIILL = LJIILL();
        if (strLJIILL != null && strLJIILL.length() != 0) {
            String strLJIILL2 = LJIILL();
            if (strLJIILL2 == null) {
                strLJIILL2 = "";
            }
            jSONObject2 = new JSONObject(strLJIILL2);
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

    public static final void LJIILLIIL(AdAutofillPipoFillInfo adAutofillPipoFillInfo) {
        boolean z;
        String strLJIILL = LJIILL();
        if (strLJIILL != null && strLJIILL.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            adAutofillPipoFillInfo.setFirstName("");
            adAutofillPipoFillInfo.setLastName("");
            return;
        }
        String strLJIILL2 = LJIILL();
        if (strLJIILL2 == null) {
            strLJIILL2 = "";
        }
        JSONObject jSONObject = new JSONObject(strLJIILL2);
        if (jSONObject.names() == null) {
            adAutofillPipoFillInfo.setFirstName("");
            adAutofillPipoFillInfo.setLastName("");
            return;
        }
        String strOptString = jSONObject.optString("first_name");
        String strOptString2 = jSONObject.optString("last_name");
        if ((strOptString == null || strOptString.length() == 0) && (strOptString2 == null || strOptString2.length() == 0)) {
            adAutofillPipoFillInfo.setFirstName("");
            adAutofillPipoFillInfo.setLastName("");
            return;
        }
        if (C123100dR.LIZ(strOptString)) {
            adAutofillPipoFillInfo.setFirstName(strOptString);
        }
        if (C123100dR.LIZ(strOptString2)) {
            adAutofillPipoFillInfo.setLastName(strOptString2);
        }
    }

    public static final boolean LJJII(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return false;
        }
        String strLJIILL = LJIILL();
        if (strLJIILL != null && strLJIILL.length() != 0) {
            String strLJIILL2 = LJIILL();
            if (strLJIILL2 == null) {
                strLJIILL2 = "";
            }
            jSONObject2 = new JSONObject(strLJIILL2);
        } else {
            jSONObject2 = new JSONObject();
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return false;
        }
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            if (!TextUtils.isEmpty(jSONObject2.optString(jSONArrayNames.optString(i))) && !TextUtils.equals(jSONObject2.optString(jSONArrayNames.optString(i)), jSONObject.optString(jSONArrayNames.optString(i)))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIII(String str) {
        AdPaymentModel adPaymentModel;
        List<AdPaymentModel> list;
        try {
            adPaymentModel = (AdPaymentModel) C08JS.LIZ(str, AdPaymentModel.class);
            if (adPaymentModel == null) {
                adPaymentModel = new AdPaymentModel();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            adPaymentModel = new AdPaymentModel();
        }
        AdPaymentList adPaymentListLJIL = LJIL();
        if (adPaymentListLJIL != null && (list = adPaymentListLJIL.getList()) != null) {
            for (AdPaymentModel adPaymentModel2 : list) {
                if (Intrinsics.LJFF(adPaymentModel2.getCardNumber(), adPaymentModel.getCardNumber()) && !Intrinsics.LJFF(adPaymentModel2.getExpiryTime(), adPaymentModel.getExpiryTime())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void LJJIJL(AdPaymentList adPaymentList) throws JSONException {
        String uid;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && uid != null && uid.length() != 0) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            C1068410duR c1068410duR = C1068410duR.LIZ;
            if (C1068410duR.LIZIZ == null) {
                synchronized (c1068410duR) {
                    try {
                        if (C1068410duR.LIZIZ == null) {
                            C1068410duR.LIZIZ = new C14BR();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            String strLIZJ = C14BR.LIZJ(C08JS.LIZLLL(adPaymentList));
            if (strLIZJ != null) {
                Keva repo = KevaImpl.getRepo("autofill_info", 1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uid);
                sbLIZ.append("payment");
                repo.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZJ);
                LJI.put(uid, adPaymentList);
            }
            LIZ.getClass();
            LJ("other");
        }
    }

    public static int LJI(int i, boolean z) {
        User currentUser;
        if (!C305310Bxx.LIZ()) {
            return 0;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "autofill_noneffective_android", true, false) && i == 1) {
            return 8;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getUid() == null) {
            return 1;
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return 2;
        }
        if (!z) {
            return 3;
        }
        if (!LJJI() && !LJIIZILJ()) {
            return 4;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIJ(InterfaceC1541990qEH interfaceC1541990qEH, C1035880d3y c1035880d3y) {
        if (!(interfaceC1541990qEH instanceof WebView)) {
            return;
        }
        LJJIFFI((WebView) interfaceC1541990qEH, c1035880d3y.getAdInfoMethodObj(), c1035880d3y.getUrl(), c1035880d3y, Boolean.TRUE, null, null, 96);
    }

    public static void LJJIJIIJI(String str, StringBuilder sb) {
        if (C123100dR.LIZ(str)) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067990dtl.LIZIZ(int, org.json.JSONObject, boolean):void");
    }

    public static boolean LJII(int i, String str, boolean z) {
        if (LJI(i, z) == -1) {
            return true;
        }
        if (C123100dR.LIZ(str)) {
            boolean zLJJIIZI = a0.LJJIIZI(str, "\"/** allScenariosCanUse **/\"", false);
            boolean zLIZ = C255710A0j.LIZ();
            if (zLJJIIZI && zLIZ) {
                return true;
            }
            return false;
        }
        if (C255710A0j.LIZ()) {
            return true;
        }
        return false;
    }

    public static final void LJJIJIIJIL(String str, String str2, boolean z) throws JSONException {
        String uid;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && uid != null && uid.length() != 0) {
            LJFF.put(uid, str);
            C1068020dto.LIZ.getClass();
            C1068020dto.LJIIIZ.put(uid, str);
            if (str == null) {
                return;
            }
            KevaImpl.getRepo("autofill_info", 1).storeBytes(uid, C1068020dto.LJI(str));
            if (z) {
                LIZ.getClass();
                LJ(str2);
            }
        }
    }

    public static final void LJJIJIL(String str, boolean z, boolean z2) throws JSONException {
        C1067990dtl c1067990dtl = LIZ;
        c1067990dtl.getClass();
        String strLJIJ = LJIJ();
        if (strLJIJ == null) {
            return;
        }
        LJIIIIZZ = Boolean.valueOf(z);
        Keva repo = KevaImpl.getRepo("autofill_info", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJ);
        sbLIZ.append("contactSwitch");
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
        if (z2) {
            c1067990dtl.getClass();
            LJ(str);
        }
    }

    public static final void LJJIJLIJ(C1035880d3y c1035880d3y, String str, boolean z) throws JSONException {
        WebView webView;
        C1067990dtl c1067990dtl = LIZ;
        c1067990dtl.getClass();
        String strLJIJ = LJIJ();
        if (strLJIJ == null) {
            return;
        }
        LJIIIZ = Boolean.valueOf(z);
        Keva repo = KevaImpl.getRepo("autofill_info", 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJ);
        sbLIZ.append("paymentSwitch");
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
        c1067990dtl.getClass();
        LJ(str);
        if (z && C291640Bbu.LIZ()) {
            WeakReference<WebView> weakReference = LJIILL;
            if (weakReference != null) {
                webView = weakReference.get();
            } else {
                webView = null;
            }
            C1068720duw.LIZIZ(true, webView, 6, c1035880d3y);
        }
    }

    public static final void LJJIIZ(Context context, String str, String str2, Boolean bool) throws JSONException {
        JSONArray jSONArray;
        String uid;
        JSONArray jSONArray2;
        User currentUser;
        List<AdPaymentModel> list;
        JSONObject jSONObject;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
            C1068210du7.LIZ.getClass();
            c1068190du5.log(C1068210du7.LIZLLL, new AwS16S2000000_16(str, str2, 13));
        }
        String str3 = AdAutofillConfigSettings.LIZ().settingLynxSchema;
        JSONObject jSONObject2 = new JSONObject();
        if (Intrinsics.LJFF(str2, "contact_info")) {
            if (LJIILL() == null) {
                jSONObject = new JSONObject();
            } else {
                String strLJIILL = LJIILL();
                if (strLJIILL == null) {
                    strLJIILL = "";
                }
                jSONObject = new JSONObject(strLJIILL);
            }
            jSONObject2.put("contactInfo", jSONObject);
            str3 = AdAutofillConfigSettings.LIZ().settingLynxSchema;
        } else if (Intrinsics.LJFF(str2, "payment_info")) {
            AdPaymentList adPaymentListLJIL = LJIL();
            List<AdPaymentModel> list2 = null;
            if (adPaymentListLJIL != null && (list = adPaymentListLJIL.getList()) != null && !list.isEmpty()) {
                AdPaymentList adPaymentListLJIL2 = LJIL();
                if (adPaymentListLJIL2 != null) {
                    list2 = adPaymentListLJIL2.getList();
                }
                jSONArray = new JSONArray(C08JS.LIZLLL(list2));
            } else {
                jSONArray = new JSONArray();
            }
            jSONObject2.put("paymentInfo", jSONArray);
            C1068720duw c1068720duw = C1068720duw.LIZ;
            if (C1068370duN.LIZ()) {
                jSONObject2.put("enablePaymentInfoSupplement", C1068370duN.LIZ());
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                    uid = "default";
                }
                if (C1068720duw.LJFF && C1068720duw.LJII && C1068720duw.LJI) {
                    HashMap<String, List<MaskInstrumentInfo>> map = C1068720duw.LIZJ;
                    List<MaskInstrumentInfo> list3 = map.get(uid);
                    if (list3 != null && !list3.isEmpty()) {
                        jSONArray2 = new JSONArray(C08JS.LIZLLL(map.get(uid)));
                    } else {
                        jSONArray2 = new JSONArray();
                    }
                    jSONObject2.put("PIPOPaymentInfo", jSONArray2);
                }
            }
            if (Intrinsics.LJFF(bool, bool2)) {
                str3 = AdAutofillConfigSettings.LIZ().settingAddNewCardLynxSchema;
            } else {
                str3 = AdAutofillConfigSettings.LIZ().settingPaymentLynxSchema;
            }
        }
        String string = UriProtector.parse(str3).buildUpon().appendQueryParameter("enter_from", str).appendQueryParameter("initialData", C786410Ut5.J3(jSONObject2)).build().toString();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(string);
        LJIJ = sparkContext;
        if (context != null) {
            C1541950qED.LIZJ.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public static void LJIILIIL(String str, String str2, EnumC1059300dfk enumC1059300dfk, String str3, C1035880d3y c1035880d3y) {
        C11NZ<AdAutofillGetResponse> v2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "should_autofill_data_api_update_android", true, false)) {
            AdAutofillApi.LIZ.getClass();
            v2 = C1068770dv1.LIZ().getV2("3", str, Integer.valueOf(C1068380duO.LIZ ? 1 : 0), Integer.valueOf(CastIntegerProtector.parseInt(str2)));
        } else {
            AdAutofillApi.LIZ.getClass();
            v2 = C1068770dv1.LIZ().get("3", str, Integer.valueOf(C1068380duO.LIZ ? 1 : 0), Integer.valueOf(CastIntegerProtector.parseInt(str2)));
        }
        v2.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS10S2200000_16(c1035880d3y, enumC1059300dfk, str3, str2, 1), new C09JN() { // from class: X.0de6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AdAutofillManagerV2@4585.getAutofill$fetchService$2");
                ((Throwable) obj).getMessage();
                C1C7U.LIZIZ("AdAutofillManagerV2@4585.getAutofill$fetchService$2");
            }
        });
    }

    public static final void LJIIJJI(boolean z, String str, boolean z2, EnumC1059300dfk enumC1059300dfk, WebView webView, C1035880d3y c1035880d3y) {
        int iIntValue;
        User currentUser;
        String uid;
        String str2;
        Integer numIsAutofillNoneffective;
        Integer numIsAutofillNoneffective2;
        C1067990dtl c1067990dtl = LIZ;
        int iIntValue2 = 0;
        if (c1035880d3y != null && (numIsAutofillNoneffective2 = c1035880d3y.isAutofillNoneffective()) != null) {
            iIntValue = numIsAutofillNoneffective2.intValue();
        } else {
            iIntValue = 0;
        }
        c1067990dtl.getClass();
        if (!LJII(iIntValue, null, z) && enumC1059300dfk == EnumC1059300dfk.AD) {
            return;
        }
        if (c1035880d3y != null && (numIsAutofillNoneffective = c1035880d3y.isAutofillNoneffective()) != null) {
            iIntValue2 = numIsAutofillNoneffective.intValue();
        }
        if (LJI(iIntValue2, z) != -1) {
            return;
        }
        if (enumC1059300dfk == EnumC1059300dfk.AD) {
            C1068720duw.LIZIZ(z, webView, z2 ? 1 : 0, c1035880d3y);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || Intrinsics.LJFF(LJII.get(uid), Boolean.TRUE)) {
            return;
        }
        if (z2) {
            str2 = "2";
        } else {
            str2 = "1";
        }
        LJIILIIL(str, str2, enumC1059300dfk, uid, c1035880d3y);
    }

    public static String LJIJI(Integer num, JSONObject jSONObject, int i, int i2, String str, List list, String str2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (num != null && num.intValue() == 0) {
            jSONObject2.put("contactInfo", LJIJJLI());
            jSONObject2.put("contactInfoExtraData", LJIJJ());
        } else if (num != null) {
            if (num.intValue() == 1) {
                jSONObject2.put("paymentInfo", jSONObject);
            } else if (num.intValue() == 2) {
                jSONObject2.put("contactInfo", LJIJJLI());
                jSONObject2.put("contactInfoExtraData", LJIJJ());
                jSONObject2.put("paymentInfo", jSONObject);
            }
        }
        jSONObject2.put("isAutofillAll", i);
        jSONObject2.put(Scene.SCENE_SERVICE, i2);
        if (C123100dR.LIZ(str)) {
            jSONObject2.put("currentKey", str);
        }
        if (list != null) {
            jSONObject2.put("autofill_fields", list);
        }
        jSONObject2.put("infoType", num);
        jSONObject2.put("autofillSessionId", str2);
        return C786410Ut5.J3(jSONObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(boolean r21, java.lang.Integer r22, org.json.JSONObject r23, boolean r24, int r25, java.lang.String r26, java.util.List<java.lang.String> r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067990dtl.LIZJ(boolean, java.lang.Integer, org.json.JSONObject, boolean, int, java.lang.String, java.util.List, java.lang.String):void");
    }

    public static void LJJIFFI(WebView webView, JSONObject jSONObject, String str, InterfaceC1041500dD2 interfaceC1041500dD2, Boolean bool, SparkContext sparkContext, String str2, int i) {
        boolean z;
        int iIntValue;
        int i2;
        int length;
        int iIntValue2;
        int size;
        AbstractC1544900qIy abstractC1544900qIy;
        List<AdPaymentModel> list;
        String str3;
        String str4;
        String str5;
        String str6;
        PaymentNodeStatusModel paymentNodeStatusModel;
        String str7;
        String str8;
        String str9;
        String promoCodeInfo;
        Integer numIsAutofillNoneffective;
        String str10 = str2;
        Boolean bool2 = bool;
        String str11 = str;
        Object obj = "";
        if ((i & 4) != 0) {
            str11 = "";
        }
        if ((i & 16) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 32) != 0) {
            sparkContext = null;
        }
        if ((i & 64) != 0) {
            str10 = null;
        }
        if (jSONObject != null && interfaceC1041500dD2 != null && !interfaceC1041500dD2.isPreviewMode()) {
            if (str11 != null && u.LJJIIJZLJL(str11, "about:blank", false)) {
                return;
            }
            LJIILLIIL = sparkContext;
            if (!LJJI() && !LJIIZILJ()) {
                z = false;
            } else {
                z = true;
            }
            LIZJ = z;
            LIZLLL = str11;
            LJ = jSONObject;
            String string = KevaImpl.getRepo("autofill_info", 1).getString("autofill_v2_js", "");
            Object objLJIILJJIL = LJIILJJIL();
            if (objLJIILJJIL == null) {
                objLJIILJJIL = "[]";
            }
            Integer numIsAutofillNoneffective2 = interfaceC1041500dD2.isAutofillNoneffective();
            if (numIsAutofillNoneffective2 != null) {
                iIntValue = numIsAutofillNoneffective2.intValue();
            } else {
                iIntValue = 0;
            }
            C1067990dtl c1067990dtl = LIZ;
            boolean zAutofillEnable = interfaceC1041500dD2.autofillEnable();
            c1067990dtl.getClass();
            int iLJI = LJI(iIntValue, zAutofillEnable);
            boolean zLJII = LJII(iIntValue, string, interfaceC1041500dD2.autofillEnable());
            if (LJI(iIntValue, interfaceC1041500dD2.autofillEnable()) == -1) {
                iLJI = -1;
            } else if (string.length() == 0 && !C0C64.LJIILLIIL().LJIIIZ(31744, "opt_autofill_js_inject", true, false)) {
                iLJI = 6;
            }
            C1068090dtv c1068090dtv = LJIIZILJ;
            c1068090dtv.LIZ = str11;
            if (zLJII) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c1068090dtv.LIZIZ = i2;
            c1068090dtv.LIZJ = objLJIILJJIL.toString();
            c1068090dtv.LJFF = String.valueOf(iLJI);
            if (zLJII) {
                c1068090dtv.LIZLLL = String.valueOf(!LJIIZILJ() ? 1 : 0);
                c1068090dtv.LJ = String.valueOf(LJJ());
            } else {
                c1068090dtv.LIZLLL = null;
                c1068090dtv.LJ = null;
            }
            c1068090dtv.LJIILL = interfaceC1041500dD2.getIsFirstPage();
            if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
                C1068590duj c1068590duj = new C1068590duj(c1068090dtv);
                C1023960ckk c1023960ckk = C1069560dwI.LIZ;
                String strOptString = jSONObject.optString("cid");
                if (strOptString == null) {
                    strOptString = "";
                }
                String strOptString2 = jSONObject.optString("log_extra");
                if (strOptString2 == null) {
                    strOptString2 = "";
                }
                c1068590duj.logAd(c1023960ckk, strOptString, strOptString2, null, new AwS130S1100000_16(interfaceC1041500dD2, str10, 31));
            }
            if (!zLJII) {
                return;
            }
            jSONObject.put("url", str11);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleAutofillJS enter: url=");
            sbLIZ.append(str11);
            sbLIZ.append(" isForIframe=");
            sbLIZ.append(bool2);
            sbLIZ.append(" jsLength=");
            if (string != null) {
                length = string.length();
            } else {
                length = 0;
            }
            sbLIZ.append(length);
            sbLIZ.append(" sessionId=");
            sbLIZ.append(interfaceC1041500dD2.getIABMessageSessionId());
            sbLIZ.append(" firstPage=");
            sbLIZ.append(interfaceC1041500dD2.getIsFirstPage());
            C2188811AlT.LIZIZ(sbLIZ);
            JSONObject jSONObject2 = new JSONObject();
            boolean zAutofillEnable2 = interfaceC1041500dD2.autofillEnable();
            Integer numIsAutofillNoneffective3 = interfaceC1041500dD2.isAutofillNoneffective();
            if (numIsAutofillNoneffective3 != null) {
                iIntValue2 = numIsAutofillNoneffective3.intValue();
            } else {
                iIntValue2 = 0;
            }
            LIZIZ(iIntValue2, jSONObject2, zAutofillEnable2);
            if (((Number) C275540Ar2.LIZ.getValue()).intValue() == 2 && (numIsAutofillNoneffective = interfaceC1041500dD2.isAutofillNoneffective()) != null) {
                jSONObject2.put("isAutofillNoneffective", numIsAutofillNoneffective.intValue());
            }
            AutofillModel autofillModel = interfaceC1041500dD2.autofillModel();
            if (autofillModel != null && (promoCodeInfo = autofillModel.getPromoCodeInfo()) != null) {
                try {
                    jSONObject2.put("promoCodeInfo", new JSONObject(promoCodeInfo));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject2.put("promoCodeInfo", new JSONObject());
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("first_page", interfaceC1041500dD2.getIsFirstPage());
            jSONObject3.put("iabContainerId", interfaceC1041500dD2.getIABMessageSessionId());
            LoginModel iABLoginModel = interfaceC1041500dD2.getIABLoginModel();
            if (iABLoginModel != null && iABLoginModel.loginId != null) {
                LoginModel iABLoginModel2 = interfaceC1041500dD2.getIABLoginModel();
                if (iABLoginModel2 == null || (str7 = iABLoginModel2.loginId) == null) {
                    str7 = "";
                }
                jSONObject3.put("login_id", str7);
                LoginModel iABLoginModel3 = interfaceC1041500dD2.getIABLoginModel();
                if (iABLoginModel3 == null || (str8 = iABLoginModel3.loginType) == null) {
                    str8 = "";
                }
                jSONObject3.put("login_type", str8);
                LoginModel iABLoginModel4 = interfaceC1041500dD2.getIABLoginModel();
                if (iABLoginModel4 == null || (str9 = iABLoginModel4.loginMethod) == null) {
                    str9 = "";
                }
                jSONObject3.put("login_method", str9);
            }
            PaymentModel iABPaymentModel = interfaceC1041500dD2.getIABPaymentModel();
            if (iABPaymentModel != null && iABPaymentModel.nodeStatus != null) {
                PaymentModel iABPaymentModel2 = interfaceC1041500dD2.getIABPaymentModel();
                if (iABPaymentModel2 == null || (str3 = iABPaymentModel2.paymentId) == null) {
                    str3 = "";
                }
                jSONObject3.put("payment_id", str3);
                PaymentModel iABPaymentModel3 = interfaceC1041500dD2.getIABPaymentModel();
                if (iABPaymentModel3 == null || (str4 = iABPaymentModel3.paymentType) == null) {
                    str4 = "";
                }
                jSONObject3.put("payment_type", str4);
                PaymentModel iABPaymentModel4 = interfaceC1041500dD2.getIABPaymentModel();
                if (iABPaymentModel4 == null || (str5 = iABPaymentModel4.paymentMethod) == null) {
                    str5 = "";
                }
                jSONObject3.put("payment_method", str5);
                PaymentModel iABPaymentModel5 = interfaceC1041500dD2.getIABPaymentModel();
                if (iABPaymentModel5 == null || (str6 = iABPaymentModel5.triggerSource) == null) {
                    str6 = "";
                }
                jSONObject3.put("trigger_source", str6);
                PaymentModel iABPaymentModel6 = interfaceC1041500dD2.getIABPaymentModel();
                if (iABPaymentModel6 != null && (paymentNodeStatusModel = iABPaymentModel6.nodeStatus) != null) {
                    obj = paymentNodeStatusModel;
                }
                jSONObject3.put("node_status", obj);
            }
            LJIILL = new WeakReference<>(webView);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adInfo", String.valueOf(jSONObject));
            jSONObject4.put("autoFillInfo", C786410Ut5.J3(jSONObject2));
            jSONObject4.put("extraData", C786410Ut5.J3(jSONObject3));
            final String strJ3 = C786410Ut5.J3(jSONObject4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleAutofillJS paramsReady: url=");
            sbLIZ2.append(str11);
            sbLIZ2.append(" isForIframe=");
            sbLIZ2.append(bool2);
            sbLIZ2.append(" paramsLength=");
            sbLIZ2.append(strJ3.length());
            sbLIZ2.append(" contactInfoStatus=");
            sbLIZ2.append(!LJIIZILJ() ? 1 : 0);
            sbLIZ2.append(" paymentInfoStatus=");
            sbLIZ2.append(LJJ());
            sbLIZ2.append(" paymentCount=");
            AdPaymentList adPaymentListLJIL = LJIL();
            if (adPaymentListLJIL != null && (list = adPaymentListLJIL.getList()) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            sbLIZ2.append(size);
            C2188811AlT.LIZIZ(sbLIZ2);
            C01GW c01gw = AdAutofillJsConfigExp.LIZIZ;
            if (((AdAutofillJsConfigExp.AdAutofillJsConfig) c01gw.getValue()).useJsPlatform) {
                abstractC1544900qIy = new AbstractC1047780dNA() { // from class: X.0dND
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        return strJ3;
                    }
                };
            } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_promo_code_android", true, false)) {
                abstractC1544900qIy = new AbstractC1047880dNK() { // from class: X.0dNE
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        return strJ3;
                    }
                };
            } else if (C255710A0j.LIZ()) {
                abstractC1544900qIy = new AbstractC1047870dNJ() { // from class: X.0dNF
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        return strJ3;
                    }
                };
            } else if (AutofillPrefillConfigExp.LIZ()) {
                abstractC1544900qIy = new AbstractC1047890dNL() { // from class: X.0dNG
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        return strJ3;
                    }
                };
            } else {
                abstractC1544900qIy = new AbstractC1047900dNM() { // from class: X.0dNH
                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) {
                        return strJ3;
                    }
                };
            }
            C1047720dN4 c1047720dN4 = C1047720dN4.LIZ;
            AbstractC1544900qIy abstractC1544900qIyLIZIZ = C1047720dN4.LIZIZ(interfaceC1041500dD2, strJ3);
            if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                C1544770qIl.LIZJ(abstractC1544900qIyLIZIZ);
            } else if (!((AdAutofillJsConfigExp.AdAutofillJsConfig) c01gw.getValue()).useJsPlatform && C123100dR.LIZ(string)) {
                webView.evaluateJavascript(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(string, "\"/** adInfo **/\"", String.valueOf(jSONObject), true), "\"/** autoFillInfo **/\"", C786410Ut5.J3(jSONObject2), true), "\"/** extraData **/\"", C786410Ut5.J3(jSONObject3), true), new ValueCallback() { // from class: X.0duL
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj2) {
                    }
                });
            } else {
                C1544770qIl.LIZ(webView, abstractC1544900qIy);
            }
        }
    }

    public static void LJJIIZI(WebView webView, final Integer num, final JSONObject jSONObject, final int i, final int i2, final String str, final List list, final String str2) {
        if (!C1035800d3q.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("window.__autoFillCallback__(");
            sbLIZ.append(LJIJI(num, jSONObject, i, i2, str, list, str2));
            sbLIZ.append(",true)");
            webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0dGX
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                }
            });
            return;
        }
        C1544770qIl.LIZ(webView, new AbstractC1043220dFo() { // from class: X.0dGW
            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView2) {
                C1067990dtl c1067990dtl = C1067990dtl.LIZ;
                Integer num2 = num;
                JSONObject jSONObject2 = jSONObject;
                int i3 = i;
                int i4 = i2;
                String str3 = str;
                List<String> list2 = list;
                String str4 = str2;
                c1067990dtl.getClass();
                return C1067990dtl.LJIJI(num2, jSONObject2, i3, i4, str3, list2, str4);
            }
        });
    }

    public static final void LJJIIJ(int i, JSONObject jSONObject, int i2, int i3, Integer num, Integer num2, String str, int i4, Integer num3) {
        Integer numValueOf;
        String string;
        JSONArray jSONArrayNames;
        int iIntValue;
        String strOptString;
        String strOptString2;
        C1068090dtv c1068090dtv = LJIIZILJ;
        if (i == 1) {
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = Integer.valueOf(i);
        }
        c1068090dtv.LJIIIZ = numValueOf;
        c1068090dtv.LJI = num;
        if (i == 0) {
            string = String.valueOf(LJIIJ);
        } else if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null) {
            string = jSONArrayNames.toString();
        } else {
            string = null;
        }
        c1068090dtv.LIZJ = string;
        c1068090dtv.LJIIJ = Integer.valueOf(i2);
        c1068090dtv.LJFF = String.valueOf(i3);
        c1068090dtv.LJII = String.valueOf(num2);
        c1068090dtv.LJIILJJIL = str;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = -1;
        }
        c1068090dtv.LJIILL = iIntValue;
        C1068590duj c1068590duj = new C1068590duj(c1068090dtv);
        C1023960ckk c1023960ckk = C1068600duk.LIZJ;
        JSONObject jSONObject2 = LJ;
        String str2 = "";
        if (jSONObject2 == null || (strOptString = jSONObject2.optString("cid")) == null) {
            strOptString = "";
        }
        JSONObject jSONObject3 = LJ;
        if (jSONObject3 != null && (strOptString2 = jSONObject3.optString("log_extra")) != null) {
            str2 = strOptString2;
        }
        c1068590duj.logAd(c1023960ckk, strOptString, str2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIZ(android.view.View r15, org.json.JSONObject r16, boolean r17, boolean r18, boolean r19, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r20, boolean r21, java.lang.Integer r22, X.EnumC1059300dfk r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067990dtl.LJJIZ(android.view.View, org.json.JSONObject, boolean, boolean, boolean, kotlin.jvm.functions.Function1, boolean, java.lang.Integer, X.0dfk):void");
    }

    public static final void LJJJ(View view, AdPaymentModel adPaymentModel, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super Integer, Unit> function1, boolean z5, Integer num, EnumC1059300dfk enumC1059300dfk) throws JSONException {
        if (adPaymentModel == null) {
            return;
        }
        AdPaymentList adPaymentListLJIL = LJIL();
        if (adPaymentListLJIL == null) {
            adPaymentListLJIL = new AdPaymentList();
        }
        int i = 1;
        boolean z6 = z5;
        if (!z4) {
            if (adPaymentListLJIL.getList() != null && !adPaymentListLJIL.getList().isEmpty()) {
                ArrayList<AdPaymentModel> arrayList = new ArrayList();
                Iterator<AdPaymentModel> it2 = adPaymentListLJIL.getList().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                for (AdPaymentModel adPaymentModel2 : arrayList) {
                    if (Intrinsics.LJFF(adPaymentModel2.getCardNumber(), adPaymentModel.getCardNumber())) {
                        adPaymentListLJIL.getList().remove(adPaymentModel2);
                        if (!z3) {
                            C1067990dtl c1067990dtl = LIZ;
                            Integer numValueOf = Integer.valueOf(z ? 1 : 0);
                            Integer numValueOf2 = Integer.valueOf(adPaymentListLJIL.getList().size());
                            String cardType = adPaymentModel.getCardType();
                            c1067990dtl.getClass();
                            LJJIIJZLJL(view, true, null, 1, false, z2, numValueOf, numValueOf2, cardType, z6, num, enumC1059300dfk);
                        }
                        if (!z6) {
                            function1.invoke(1);
                        }
                        LJJIJL(adPaymentListLJIL);
                        return;
                    }
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<AdPaymentModel> it3 = adPaymentListLJIL.getList().iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next());
        }
        Iterator it4 = arrayList2.iterator();
        int i2 = -1;
        loop3: while (true) {
            int i3 = i2;
            while (it4.hasNext()) {
                i3++;
                if (Intrinsics.LJFF(((AdPaymentModel) it4.next()).getCardNumber(), adPaymentModel.getCardNumber())) {
                    break;
                }
            }
            i2 = i3;
        }
        int i4 = 0;
        if (z) {
            ListProtector.add(adPaymentListLJIL.getList(), 0, adPaymentModel);
        } else if (i2 > -1) {
            ListProtector.set(adPaymentListLJIL.getList(), i2, adPaymentModel);
        } else {
            List<AdPaymentModel> list = adPaymentListLJIL.getList();
            if (adPaymentListLJIL.getList().size() >= 1) {
                i4 = 1;
            }
            ListProtector.add(list, i4, adPaymentModel);
        }
        if (!z3) {
            C1067990dtl c1067990dtl2 = LIZ;
            Integer numValueOf3 = Integer.valueOf(z ? 1 : 0);
            Integer numValueOf4 = Integer.valueOf(adPaymentListLJIL.getList().size());
            String cardType2 = adPaymentModel.getCardType();
            c1067990dtl2.getClass();
            i = 1;
            z6 = z6;
            LJJIIJZLJL(view, true, null, 1, true, z2, numValueOf3, numValueOf4, cardType2, z6, num, enumC1059300dfk);
        }
        if (!z6) {
            function1.invoke(Integer.valueOf(i));
        }
        LJJIJL(adPaymentListLJIL);
    }

    public static final void LJJIL(View view, EnumC1059300dfk enumC1059300dfk, Integer num, Integer num2, JSONObject jSONObject, AdPaymentModel adPaymentModel, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super Integer, Unit> function1) throws JSONException {
        if (num != null) {
            if (num.intValue() == 0) {
                LJJIZ(view, jSONObject, z2, z3, z4, function1, false, num2, enumC1059300dfk);
                return;
            }
            if (num.intValue() == 1) {
                LJJJ(view, adPaymentModel, z, z2, z3, z4, function1, false, num2, enumC1059300dfk);
            } else {
                if (num.intValue() != 2) {
                    return;
                }
                LJJJ(view, adPaymentModel, z, z2, z3, z4, function1, true, num2, enumC1059300dfk);
                LJJIZ(view, jSONObject, z2, z3, z4, function1, true, num2, enumC1059300dfk);
            }
        }
    }

    public static void LJJIIJZLJL(View view, boolean z, String str, Integer num, boolean z2, boolean z3, Integer num2, Integer num3, String str2, boolean z4, Integer num4, EnumC1059300dfk enumC1059300dfk) {
        int i;
        int i2;
        String string;
        String strOptString;
        String strOptString2;
        WeakReference<WebView> weakReference;
        WebView webView;
        View rootView;
        int i3;
        WebView webView2;
        View rootView2;
        WebView webView3;
        View rootView3;
        if (z3) {
            int i4 = 2131826944;
            if (num != null) {
                if (num.intValue() == 0) {
                    if (z) {
                        if (num4 == null || num4.intValue() != 2) {
                            i4 = 2131826943;
                        }
                        if (enumC1059300dfk == EnumC1059300dfk.AD) {
                            WeakReference<WebView> weakReference2 = LJIILL;
                            if (weakReference2 != null && (webView3 = weakReference2.get()) != null && (rootView3 = webView3.getRootView()) != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(rootView3);
                                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                                c1389890mGx.LJII(R.attr.ee);
                                c1389890mGx.LJIIIZ(i4);
                                c1389890mGx.LJIIJJI();
                            }
                        } else {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                            c1389890mGx2.LJFF(R.raw.icon_tick_circle_fill);
                            c1389890mGx2.LJII(R.attr.ee);
                            c1389890mGx2.LJIIIZ(i4);
                            c1389890mGx2.LIZ(true);
                            c1389890mGx2.LJIIJJI();
                        }
                    } else {
                        if (num4 != null && num4.intValue() == 2) {
                            i3 = 2131826949;
                        } else {
                            i3 = 2131826948;
                        }
                        if (enumC1059300dfk == EnumC1059300dfk.AD) {
                            WeakReference<WebView> weakReference3 = LJIILL;
                            if (weakReference3 != null && (webView2 = weakReference3.get()) != null && (rootView2 = webView2.getRootView()) != null) {
                                C1389890mGx c1389890mGx3 = new C1389890mGx(rootView2);
                                c1389890mGx3.LJIIIZ(i3);
                                c1389890mGx3.LJIIJJI();
                            }
                        } else {
                            C1389890mGx c1389890mGx4 = new C1389890mGx(view);
                            c1389890mGx4.LJIIIZ(i3);
                            c1389890mGx4.LIZ(true);
                            c1389890mGx4.LJIIJJI();
                        }
                    }
                } else if (num.intValue() == 1 && !z4 && (weakReference = LJIILL) != null && (webView = weakReference.get()) != null && (rootView = webView.getRootView()) != null) {
                    C1389890mGx c1389890mGx5 = new C1389890mGx(rootView);
                    c1389890mGx5.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx5.LJII(R.attr.ee);
                    if (num4 == null || num4.intValue() != 2) {
                        i4 = 2131826943;
                    }
                    c1389890mGx5.LJIIIZ(i4);
                    c1389890mGx5.LJIIJJI();
                }
            }
            if (enumC1059300dfk == EnumC1059300dfk.AD) {
                C1068090dtv c1068090dtv = LJIIZILJ;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c1068090dtv.LJIIIIZZ = i2;
                c1068090dtv.LIZJ = str;
                c1068090dtv.LJI = num;
                if (num2 != null) {
                    string = num2.toString();
                } else {
                    string = null;
                }
                c1068090dtv.LJIIJJI = string;
                c1068090dtv.LJIIL = num3;
                c1068090dtv.LJIILIIL = str2;
                C1068590duj c1068590duj = new C1068590duj(c1068090dtv);
                C1023960ckk c1023960ckk = C1068600duk.LIZIZ;
                JSONObject jSONObject = LJ;
                String str3 = "";
                if (jSONObject == null || (strOptString = jSONObject.optString("cid")) == null) {
                    strOptString = "";
                }
                JSONObject jSONObject2 = LJ;
                if (jSONObject2 != null && (strOptString2 = jSONObject2.optString("log_extra")) != null) {
                    str3 = strOptString2;
                }
                c1068590duj.logAd(c1023960ckk, strOptString, str3, null);
                return;
            }
            return;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                if (z) {
                    C1389890mGx c1389890mGx6 = new C1389890mGx(view);
                    c1389890mGx6.LJFF(R.raw.icon_tick_circle_fill);
                    c1389890mGx6.LJII(R.attr.ee);
                    if (z2) {
                        i = 2131846776;
                    } else {
                        i = 2131830534;
                    }
                    c1389890mGx6.LJIIIZ(i);
                    c1389890mGx6.LIZ(true);
                    c1389890mGx6.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx7 = new C1389890mGx(view);
                    c1389890mGx7.LJIIIZ(2131846825);
                    c1389890mGx7.LIZ(true);
                    c1389890mGx7.LJIIJJI();
                }
            } else if (num.intValue() == 1) {
                C1389890mGx c1389890mGx8 = new C1389890mGx(view);
                c1389890mGx8.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx8.LJII(R.attr.ee);
                c1389890mGx8.LJIIIZ(2131826941);
                c1389890mGx8.LIZ(true);
                c1389890mGx8.LJIIJJI();
            }
        }
        if (enumC1059300dfk == EnumC1059300dfk.AD) {
            C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
            C1068210du7.LIZ.getClass();
            c1068190du5.log(C1068210du7.LJ, new C1068200du6(num, num2, num3, str, str2, z2, z));
        }
    }
}
