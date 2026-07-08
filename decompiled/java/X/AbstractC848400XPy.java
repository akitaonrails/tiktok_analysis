package X;

import Y.ACallableS26S1000000_13;
import Y.ARunnableS0S2110000_13;
import Y.AfS181S0100000_12;
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.IPINSetupService;
import com.ss.android.ugc.aweme.account.experiment.DeprecationEnhancementExperiment;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import com.ss.android.ugc.aweme.user.password.QueryUserPasswordSetStatusResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC848400XPy implements IAccountUserService {
    public volatile boolean LIZ;

    public static final List<String> LJJIIJZLJL() {
        String secUid;
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (C848300XPo c848300XPo : (ArrayList) UserStore.LJ()) {
            User userLIZJ = c848300XPo.LIZIZ().LIZJ();
            if (userLIZJ == null || (secUid = userLIZJ.getSecUid()) == null) {
                UserStore.AccountUser accountUserLIZJ = c848300XPo.LIZ().LIZJ();
                if (accountUserLIZJ != null) {
                    secUid = accountUserLIZJ.secUid;
                } else {
                    SignificantUserInfo significantUserInfoLIZJ = c848300XPo.LIZJ().LIZJ();
                    if (significantUserInfoLIZJ == null || (secUid = significantUserInfoLIZJ.secUid) == null) {
                        secUid = "";
                    }
                }
            }
            if (secUid.length() > 0) {
                arrayList.add(secUid);
            }
        }
        return arrayList;
    }

    public static final String LJJIIZ() {
        C848230XPh c848230XPh = C848230XPh.LL;
        String string = C848230XPh.LLJ;
        if (string == null) {
            c848230XPh.getClass();
            synchronized (UserStore.LIZ) {
                if (UserStore.LJIIIZ.length() > 0) {
                    string = UserStore.LJIIIZ;
                } else {
                    SharedPreferences sharedPreferences = UserStore.LIZLLL;
                    string = sharedPreferences.getString("latest_logged_in_uid_list", "").length() > 0 ? sharedPreferences.getString("latest_logged_in_uid_list", CardStruct.IStatusCode.DEFAULT) : sharedPreferences.getString("last_uid", "");
                }
                UserStore.LJIIIZ = string;
            }
        }
        c848230XPh.getClass();
        C848230XPh.LJIIJ(string);
        return C848230XPh.LLJ;
    }

    public static final String LJJIJ() {
        String str;
        C848230XPh c848230XPh = C848230XPh.LL;
        UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
        return (accountUserLIZ == null || (str = accountUserLIZ.countryCode) == null) ? "" : str;
    }

    public static final boolean LJJIJIIJIL() {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C848230XPh c848230XPh = C848230XPh.LL;
        sbLIZ.append(C848230XPh.LIZLLL());
        sbLIZ.append("_password_set_status");
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static final void LJJIJLIJ() {
        SignificantUserInfo significantUserInfoLJIIJJI;
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        List listLIZIZ = UserStore.LIZIZ();
        if (listLIZIZ.size() < 2) {
            return;
        }
        String strLIZLLL = C848230XPh.LIZLLL();
        int size = listLIZIZ.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            String str = (String) ListProtector.get(listLIZIZ, size);
            if (!TextUtils.equals(str, strLIZLLL)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LoginMethodService loginMethodServiceLJIIL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIL();
                loginMethodServiceLJIIL.updateMethodInfo("update_last_active_time", str, Long.valueOf(jCurrentTimeMillis));
                Object[] objArr = new Object[2];
                objArr[0] = str;
                if (str == null) {
                    significantUserInfoLJIIJJI = null;
                } else {
                    C848230XPh.LL.getClass();
                    significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str);
                }
                objArr[1] = significantUserInfoLJIIJJI;
                loginMethodServiceLJIIL.updateMethodInfo("update_significan_user_info", objArr);
                C848230XPh c848230XPh = C848230XPh.LL;
                C848230XPh.LIZIZ(str);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final boolean LJJJIL() {
        C848230XPh.LL.getClass();
        if (C848230XPh.LLILLJJLI) {
            return C848230XPh.LLILLL >= 0 && System.currentTimeMillis() - C848230XPh.LLILLL >= 180000;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String LJIIZILJ() {
        String str;
        C848230XPh c848230XPh = C848230XPh.LL;
        UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
        return (accountUserLIZ == null || (str = accountUserLIZ.session) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIJ() {
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        synchronized (UserStore.LIZIZ) {
            try {
                for (C848300XPo c848300XPo : (ArrayList) UserStore.LJ()) {
                    c848300XPo.LIZIZ().LIZIZ();
                    c848300XPo.LIZ().LIZIZ();
                    c848300XPo.LIZJ().LIZIZ();
                }
                SharedPreferences.Editor editor = UserStore.LJ;
                UserStore.LIZ.getClass();
                editor.putString("current_foreground_uid", UserStore.LIZLLL()).apply();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Set<Integer> LJIJJLI() {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        if (c0xo3LIZIZ != null && (jSONObject = c0xo3LIZIZ.LJJII) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("user_info_prompt")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        return linkedHashSet;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final List<String> LJJI() {
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        return UserStore.LIZIZ();
    }

    public final void LJJIJIL() {
        if (this.LIZ) {
            return;
        }
        C0XGN c0xgn = new C0XGN();
        C848040XOo.LIZ.getClass();
        C848040XOo.LIZIZ = c0xgn;
        C0XPY.LIZ.getClass();
        InterfaceC427710Gpt interfaceC427710Gpt = C0XPY.LIZLLL;
        if (interfaceC427710Gpt == null) {
            interfaceC427710Gpt = null;
        }
        LJJIFFI(interfaceC427710Gpt);
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getAvatarUrl() {
        String str;
        C848230XPh c848230XPh = C848230XPh.LL;
        SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(C848230XPh.LIZLLL());
        return (significantUserInfoLJIIJJI == null || (str = significantUserInfoLJIIJJI.avatarUrl) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getCurSecUserId() {
        String secUid = C848230XPh.LL.LIZJ().getSecUid();
        if (!TextUtils.isEmpty(secUid)) {
            return secUid;
        }
        UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
        return (accountUserLIZ == null || TextUtils.isEmpty(accountUserLIZ.secUid)) ? "" : accountUserLIZ.secUid;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final User getCurUser() {
        return C848230XPh.LL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getCurUserId() {
        C848230XPh c848230XPh = C848230XPh.LL;
        return C848230XPh.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String getNickName() {
        String str;
        C848230XPh c848230XPh = C848230XPh.LL;
        SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(C848230XPh.LIZLLL());
        return (significantUserInfoLJIIJJI == null || (str = significantUserInfoLJIIJJI.nickname) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isLogin() {
        return C848230XPh.LL.LJI();
    }

    public static List LJJIIZI() {
        String[] strArr;
        List listLJJLL;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return (c0xo3LIZIZ == null || (strArr = c0xo3LIZIZ.LJIL) == null || (listLJJLL = C13LQ.LJJLL(strArr)) == null) ? C13BV.INSTANCE : listLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJFF() {
        return Boolean.valueOf(isCurUserOrgAccount().booleanValue() || isOrgAccConvInterPeriod().booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJI() {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C848230XPh.LJII(false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJIIIIZZ() {
        JSONObject jSONObject;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return Boolean.valueOf((c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null) ? false : jSONObject.optBoolean("show_org_account_conv_profile_bottom_banner"));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String LJIIJJI() {
        JSONObject jSONObject;
        String strOptString;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return (c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null || (strOptString = jSONObject.optString("org_account_biz_line_platform_name")) == null) ? "" : strOptString;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final String LJIIL() {
        JSONObject jSONObject;
        String strOptString;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return (c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null || (strOptString = jSONObject.optString("tt_account_type")) == null) ? "" : strOptString;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJIILIIL() {
        return Boolean.valueOf(LJJIIZI().contains("org_account.account.management"));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJIILJJIL() {
        JSONObject jSONObject;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        boolean zOptBoolean = false;
        if (c0xo3LIZIZ != null && (jSONObject = c0xo3LIZIZ.LJJII) != null) {
            zOptBoolean = jSONObject.optBoolean("has_org_account_pin");
        }
        return Boolean.valueOf(zOptBoolean);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIILL() {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C848230XPh.LJII(true);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJIJI() {
        JSONObject jSONObject;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return Boolean.valueOf((c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null) ? false : jSONObject.optBoolean("email_collected"));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJIJJ() {
        return Boolean.valueOf(LJJIIZI().contains("org_account.pin.management"));
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean LJJIIJ() {
        return Boolean.valueOf(LJJIIZI().contains("role.management"));
    }

    public final void LJJIZ() {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.getClass();
        C848230XPh.LLILLJJLI = true;
        c848230XPh.LIZJ().setCustomVerify("");
        c848230XPh.LIZJ().setEnterpriseVerifyReason("");
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
        C848040XOo c848040XOo = C848040XOo.LIZ;
        User userLIZJ2 = c848230XPh.LIZJ();
        c848040XOo.getClass();
        C848040XOo.LIZIZ(4, null, userLIZJ2);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean isCurUserOrgAccount() {
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return Boolean.valueOf(c0xo3LIZIZ != null ? c0xo3LIZIZ.LJIJI : false);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isNewUser() {
        LJJIJIL();
        C848040XOo.LIZ.getClass();
        return C848040XOo.LIZIZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final Boolean isOrgAccConvInterPeriod() {
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        return Boolean.valueOf(c0xo3LIZIZ != null ? c0xo3LIZIZ.LJIJJLI : false);
    }

    public static final void LJJIJIIJI(C0T3I c0t3i) {
        C11NN<R> c11nnLJ;
        C848040XOo.LIZ.getClass();
        C0XHB c0xhb = C848040XOo.LIZJ;
        if (c0xhb != null && (c11nnLJ = ((NetworkProxyAccount) c0xhb).LIZJ("/passport/password/has_set/", null).LJ(new InterfaceC1487280oo2() { // from class: X.0XHO
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str = (String) obj;
                return new C11LE() { // from class: X.0XHN
                    @Override // X.C11LE
                    public final void subscribe(C11M9<? super QueryUserPasswordSetStatusResponse> c11m9) {
                        Object objFromJson;
                        Gson gsonLJII;
                        C848040XOo.LIZ.getClass();
                        C0XHB c0xhb2 = C848040XOo.LIZJ;
                        if (c0xhb2 != null && (gsonLJII = ((NetworkProxyAccount) c0xhb2).LJII()) != null) {
                            objFromJson = GsonProtectorUtils.fromJson(gsonLJII, str, (Class<Object>) QueryUserPasswordSetStatusResponse.class);
                        } else {
                            objFromJson = null;
                        }
                        c11m9.onNext(objFromJson);
                    }
                };
            }
        })) != 0) {
            c11nnLJ.LJIIZILJ(C11S5.LIZ()).LJIIJ(C1701940uOG.LIZIZ()).LJIILIIL(new AfS181S0100000_12(c0t3i, 238), new AfS181S0100000_12(c0t3i, 239));
        }
    }

    public static final boolean LJJIJL(String str) {
        C848230XPh.LL.getClass();
        UserStore.LIZ.getClass();
        return UserStore.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean LIZJ(String str) {
        C848230XPh c848230XPh = C848230XPh.LL;
        return C2093608Ic.LIZJ(str, C848230XPh.LIZLLL());
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJ(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        C848230XPh.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJII(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setAwemeCount(Math.max(0, c848230XPh.LIZJ().getAwemeCount() + i));
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIIIZ(String str) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZ(null, "language_change", str, 0, 124);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIIJ(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setFavoritingCount(c848230XPh.LIZJ().getFavoritingCount() + i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIILLIIL(InterfaceC427710Gpt interfaceC427710Gpt) {
        C848040XOo.LIZ.getClass();
        synchronized (C848040XOo.class) {
            try {
                ((LinkedList) C848040XOo.LJ).remove(interfaceC427710Gpt);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJIL(User user) {
        LJJIJIL();
        C848230XPh.LL.LJIILIIL(user);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJJ(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setInsId(str);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJJIFFI(InterfaceC427710Gpt interfaceC427710Gpt) {
        C848040XOo.LIZ.getClass();
        C848040XOo.LIZ(interfaceC427710Gpt);
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJJII(WeakHandler weakHandler) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        boolean zLJI = MethodIDManager.LJI(202453);
        C1BVK.LIZIZ().LIZ(weakHandler, new C0XHI(((IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class)).selfUserApi(), false), 112);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJJI(User user) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        synchronized (c848230XPh) {
            if (!TextUtils.isEmpty(user.getUid())) {
                C848230XPh.LLIZ = user;
                C848230XPh.LLILZLL = user.getUid();
                C848230XPh.LLIZLLLIL = null;
                UserStore.LIZ.getClass();
                UserStore.LJII(user);
                C848230XPh.LLILLJJLI = true;
                C848230XPh.LLILLL = -1L;
                C848230XPh.LJIIJ(user.getUid());
                c848230XPh.LJIIIIZZ();
            }
        }
    }

    public final void LJJJJ(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.getClass();
        UserStore.LIZ.getClass();
        User userLJI = UserStore.LJI(str);
        if (userLJI != null && !TextUtils.isEmpty(userLJI.getUid())) {
            User userLIZJ = c848230XPh.LIZJ();
            C848230XPh.LLILLL = -1L;
            String uid = userLJI.getUid();
            if (uid == null) {
                uid = "";
            }
            C848230XPh.LJIIJ(uid);
            C848040XOo.LIZ.getClass();
            C848040XOo.LIZIZ(4, userLIZJ, userLJI);
            C848230XPh.LLIZ = userLJI;
            C848230XPh.LJIIIZ(userLJI.getUid());
            c848230XPh.LJIIIIZZ();
            C848040XOo.LIZIZ(10, null, userLJI);
        }
    }

    public final void LJJJJIZL(boolean z) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setAdAuthorization(z);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJJJ(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setAllowStatus(i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJJL(List<? extends UrlModel> list) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setCoverUrls(list);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJJLI(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setFollowingCount(Math.max(0, c848230XPh.LIZJ().getFollowingCount() + i));
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJJLL(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setFriendCount(c848230XPh.LIZJ().getFriendCount() + i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJJZ(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        if (!TextUtils.equals(c848230XPh.LIZJ().getNickname(), str)) {
            c848230XPh.LIZJ().setNickname(str);
            C848230XPh.LLILLJJLI = true;
            UserStore userStore = UserStore.LIZ;
            User userLIZJ = c848230XPh.LIZJ();
            userStore.getClass();
            UserStore.LJII(userLIZJ);
            C848040XOo c848040XOo = C848040XOo.LIZ;
            User userLIZJ2 = c848230XPh.LIZJ();
            c848040XOo.getClass();
            C848040XOo.LIZIZ(6, null, userLIZJ2);
        }
    }

    public final void LJJJJZI(ProfileBadgeStruct profileBadgeStruct) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setProfileBadgeStruct(profileBadgeStruct);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJLIIL(boolean z) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        if (c848230XPh.LIZJ().isSecret() != z || c848230XPh.LIZJ().isPrivateAccount() != z) {
            c848230XPh.LIZJ().setSecret(z);
            c848230XPh.LIZJ().setPrivateAccount(z);
            C848230XPh.LLILLJJLI = true;
            UserStore userStore = UserStore.LIZ;
            User userLIZJ = c848230XPh.LIZJ();
            userStore.getClass();
            UserStore.LJII(userLIZJ);
        }
    }

    public final void LJJJLL(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().signature = str;
        c848230XPh.LIZJ().setSignatureExtra(null);
        C848230XPh.LLILLJJLI = true;
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJJZ(ProfileNgoStruct profileNgoStruct) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setProfileNgoStruct(profileNgoStruct);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJL(String str) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        if (!TextUtils.equals(c848230XPh.LIZJ().getUniqueId(), str)) {
            c848230XPh.LIZJ().setUniqueId(str);
            C848230XPh.LLILLJJLI = true;
            UserStore userStore = UserStore.LIZ;
            User userLIZJ = c848230XPh.LIZJ();
            userStore.getClass();
            UserStore.LJII(userLIZJ);
        }
    }

    public final void LJJLI(VideoCover videoCover) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setVideoCover(videoCover);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJLIIIJ(long j) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        long j2 = C848230XPh.LLILLL;
        if (j2 != -1) {
            j = j2;
        }
        C848230XPh.LLILLL = j;
    }

    public final void LJJLIIIJL(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setShieldCommentNotice(i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJLIIIJLJLI(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setShieldDiggNotice(i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJLIIIJLLLLLLLZ(int i) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().setShieldFollowNotice(i);
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0XOL] */
    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void LJJIII(Boolean bool, Boolean bool2) {
        final String str;
        boolean z;
        Map mapLJ;
        Map map;
        boolean zLJI = MethodIDManager.LJI(138030);
        boolean zBooleanValue = bool.booleanValue();
        final boolean zBooleanValue2 = bool2.booleanValue();
        boolean zLJI2 = MethodIDManager.LJI(138030);
        if (C848230XPh.LL.LJI()) {
            LJJIJIL();
        }
        if (zBooleanValue2) {
            str = "otl";
        } else if (zBooleanValue) {
            str = "boot";
        } else {
            str = "login";
        }
        if (!zBooleanValue && !zBooleanValue2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0XGC.LIZ.getClass();
            mapLJ = C0XGC.LJ(null);
        } else {
            mapLJ = null;
        }
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        String str2 = "1";
        if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.COLD_LAUNCH_POPUP, null)) {
            if (mapLJ != null) {
                map = new LinkedHashMap(mapLJ);
            } else {
                map = new HashMap();
            }
            DeprecationEnhancementExperiment.LIZ.getClass();
            if (DeprecationEnhancementExperiment.LIZIZ()) {
                IForceBindingAccountService iForceBindingAccountService = (IForceBindingAccountService) PluggableExtentionKt.pluggableSpi$default(IForceBindingAccountService.class, false, false, false, 14, null);
                if (iForceBindingAccountService != null && iForceBindingAccountService.isFBDeprecationTransitionExpired()) {
                    str2 = "2";
                }
                map.put("fb_deprecation_skippable", str2);
            } else {
                map.put("need_1p_guidance", "1");
            }
        } else {
            if (mapLJ != null) {
                map = new LinkedHashMap(mapLJ);
            } else {
                map = new HashMap();
            }
            map.put("need_forward_disclaimer", "1");
        }
        C0XPY.LIZ.getClass();
        C0XO0.LIZLLL(C0XPY.LIZ()).LJIILIIL(str, map, new C0XIE() { // from class: X.0XOL
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                C19EG c19eg;
                C0XZV c0xzv = (C0XZV) c0xga;
                if (c0xzv != null) {
                    try {
                        String str3 = str;
                        boolean z2 = zBooleanValue2;
                        AbstractC848400XPy abstractC848400XPy = this;
                        if (c0xzv.LIZIZ) {
                            C0XO3 c0xo3 = new C0XO3(c0xzv.LJII);
                            c0xo3.LIZ();
                            String str4 = c0xo3.LIZIZ;
                            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                            if (!Intrinsics.LJFF(str4, curUserId)) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("current_uid", curUserId);
                                c2344009Gk.LJIIIIZZ("response_uid", str4);
                                c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str3);
                                C20684815ws.LJIILLIIL("passport_account_info_user_unexpected_changed", c2344009Gk.LIZ);
                            }
                            JSONObject jSONObjectOptJSONObject = c0xo3.LJJII.optJSONObject("push_challenge_info");
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("challenge_ticket");
                                String strOptString2 = jSONObjectOptJSONObject.optString("o_url");
                                C0XQ7.LJ();
                                C0XQ7.LIZ.LJFF().handlePushChallengeInfo(strOptString, strOptString2);
                            }
                            if (((Boolean) C073B.LIZIZ.getValue()).booleanValue()) {
                                C848040XOo.LIZ.getClass();
                                C848040XOo.LIZLLL.execute(new ARunnableS0S2110000_13(c0xo3, z2, 0));
                            } else {
                                C848040XOo.LIZ.getClass();
                                C848040XOo.LIZJ(c0xo3, "refresh passport user info", "account_info", z2);
                            }
                            C1238740iLA.LIZJ("profile").LJI("is_passkey_signup_account", c0xzv.LJIIIZ.LJIILLIIL);
                            abstractC848400XPy.getClass();
                            IPINSetupService iPINSetupService = (IPINSetupService) PluggableExtentionKt.pluggableSpi$default(IPINSetupService.class, false, false, false, 14, null);
                            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                            Activity activityLIZIZ = null;
                            if (abstractC1387200mCcLIZIZ != null) {
                                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                            }
                            if ((activityLIZIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZIZ) != null && iPINSetupService != null) {
                                iPINSetupService.LIZIZ(c19eg, c0xo3);
                            }
                            if (c0xo3.LJJII.has("device_migrate_ticket")) {
                                String strOptString3 = c0xo3.LJJII.optString("device_migrate_ticket");
                                Keva keva = (Keva) C848280XPm.LIZ.getValue();
                                if (keva != null) {
                                    keva.storeString("device_migrate_ticket", strOptString3);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }

            @Override // X.C0XH7
            public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga, int i) {
            }
        });
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final UserPermissionData.UserPermissionInfo LJJIL(String str, String str2) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        String str3 = C0XHH.LIZ;
        C0XI4 c0xi4 = new C0XI4(((IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class)).userPermissionApi());
        c0xi4.LJ("request_types", str2);
        c0xi4.LJ("user_region", str);
        C848040XOo.LIZ.getClass();
        C0XHB c0xhb = C848040XOo.LIZJ;
        String strLJFF = c0xi4.LJFF();
        NetworkProxyAccount networkProxyAccount = (NetworkProxyAccount) c0xhb;
        networkProxyAccount.getClass();
        return (UserPermissionData.UserPermissionInfo) GsonProtectorUtils.fromJson(((NetworkProxyAccount) C848040XOo.LIZJ).LJII(), networkProxyAccount.LIZLLL(strLJFF, new ArrayList()).LIZIZ, UserPermissionData.UserPermissionInfo.class);
    }

    public final void LJJJ(String str, WeakHandler weakHandler) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C1BVK.LIZIZ().LIZ(weakHandler, new ACallableS26S1000000_13(str, 1), 128);
    }

    public final void LJJJLZIJ(String str, List<SignatureExtraInfo> list) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.LIZJ().signature = str;
        c848230XPh.LIZJ().setSignatureExtra(list);
        C848230XPh.LLILLJJLI = true;
        UserStore userStore = UserStore.LIZ;
        User userLIZJ = c848230XPh.LIZJ();
        userStore.getClass();
        UserStore.LJII(userLIZJ);
    }

    public final void LJJLIIIJJI(WeakHandler weakHandler, Long l) {
        long jLongValue = l.longValue();
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZIZ(weakHandler, C2097608Jq.LJI(new Pair("badge_info", "1"), new Pair("profile_badge_id", String.valueOf(jLongValue)), new Pair("page_from", String.valueOf(0))), 13);
    }

    public final void LJJLIIIJJIZ(WeakHandler weakHandler, boolean z) {
        String str;
        LJJIJIL();
        C848230XPh.LL.getClass();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0XHK.LIZ(weakHandler, "badge_info", str, 0, 13);
    }

    public final void LJJLJLI(BPEAHandler bPEAHandler, Map map) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZIZ(bPEAHandler, map, 112);
    }

    public final void LJJJJI(int i, WeakHandler weakHandler, String str) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZ(weakHandler, "avatar_uri", str, i, 4);
    }

    public final void LJJJJJL(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        LJJIJIL();
        C848230XPh c848230XPh = C848230XPh.LL;
        c848230XPh.getClass();
        if (urlModel != null && urlModel2 != null && urlModel3 != null) {
            User userLIZJ = c848230XPh.LIZJ();
            if (userLIZJ.getAvatarThumb() == null || userLIZJ.getAvatarMedium() == null || userLIZJ.getAvatarLarger() == null || (!TextUtils.equals(userLIZJ.getAvatarThumb().getUri(), urlModel.getUri()) && !TextUtils.equals(userLIZJ.getAvatarMedium().getUri(), urlModel2.getUri()) && !TextUtils.equals(userLIZJ.getAvatarLarger().getUri(), urlModel3.getUri()))) {
                userLIZJ.setAvatarThumb(urlModel);
                userLIZJ.setAvatarMedium(urlModel2);
                userLIZJ.setAvatarLarger(urlModel3);
                UserStore.LIZ.getClass();
                UserStore.LJII(userLIZJ);
                C848040XOo.LIZ.getClass();
                C848040XOo.LIZIZ(7, null, userLIZJ);
            }
        }
    }

    public final void LJJLIIIIJ(int i, WeakHandler weakHandler, String str) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZ(weakHandler, "unique_id", str, i, 116);
    }

    public final void LJJLIL(WeakHandler weakHandler, int i, int i2) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZ(weakHandler, "supporting_ngo_id", String.valueOf(i), i2, 12);
    }

    public final void LJJLL(C0XO2 c0xo2, String str, boolean z) {
        LJJIJIL();
        C848040XOo.LIZ.getClass();
        C848040XOo.LIZJ(c0xo2, "service update user info", str, z);
    }

    public final void LJJLIIIJILLIZJL(int i, BPEAHandler bPEAHandler, String str, String str2) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C1BVK.LIZIZ().LIZ(bPEAHandler, new C0XHJ(i, "nickname", str, str2, false), 0);
    }

    public final void LJJLIIJ(WeakHandler weakHandler, String str, List list, int i) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C0XHK.LIZIZ(weakHandler, C2097608Jq.LJI(new Pair("signature", str), new Pair("signature_extra", C08JS.LIZLLL(list)), new Pair("page_from", String.valueOf(i))), 2);
    }

    public final void LJJLJ(int i, WeakHandler weakHandler, String str, String str2) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZIZ(weakHandler, C2097608Jq.LJI(new Pair("organization_id", str), new Pair("organization_type", str2), new Pair("page_from", String.valueOf(i))), 12);
    }

    public final void LJJZZI(WeakHandler weakHandler, String str, String str2, List list) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1311705Bj(str, 8388608, str2, "image_info", list, weakHandler, 111, null), 3);
    }

    public final void LJJZZIII(WeakHandler weakHandler, String str, String str2, List list) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZJ(weakHandler, str, 4194304, str2, list, 129);
    }

    public final void LJJZ(BPEAHandler bPEAHandler, String str, int i, String str2, List list) {
        LJJIJIL();
        C848230XPh.LL.getClass();
        C0XHK.LIZJ(bPEAHandler, str, i, str2, list, 111);
    }
}
