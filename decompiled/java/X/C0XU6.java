package X;

import Y.ARunnableS14S0210000_13;
import Y.ARunnableS18S0100100_13;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.account.experiment.DeprecationEnhancementExperiment;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XU6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XU6 {
    public static volatile C0XU6 LIZLLL;
    public final AccountUserService LIZ = C0XQ5.LIZ();
    public C0XIH LIZIZ;
    public DialogC1240080iNK LIZJ;

    public static C0XU6 LIZ() {
        if (LIZLLL == null) {
            synchronized (C0XU6.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0XU6();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ(final String str, boolean z, boolean z2, Bundle bundle) {
        Object obj;
        Object obj2;
        final String str2;
        Object obj3;
        boolean zLJI = MethodIDManager.LJI(202311);
        ((PnSDigitalWellbeingSDKService) ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class)).LJII(EnumC19283910cP.LOGOUT_ACCOUNT);
        String strLIZLLL = C0XQ5.LIZLLL();
        boolean zLJIIIIZZ = C10EU.LJIIIIZZ();
        Activity activityLJFF = C2214201BlK.LJFF();
        HashMap map = new HashMap();
        String str3 = "1";
        if (C0XQ5.LIZ().isLogin()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("user_was_login", obj);
        boolean z3 = false;
        if (z2 || (bundle != null && bundle.getBoolean("should_force_logout"))) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("force_logout", obj2);
        if (!C0XQ5.LIZ().LIZ()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_kid_user", str3);
        if (bundle != null && !TextUtils.isEmpty(bundle.getString("from_path"))) {
            try {
                obj3 = bundle.get("from_path");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj3 = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj3 = null;
            }
            map.put("from_path", obj3);
        }
        ThirdPartyDeprecationExperiment5.LIZ.getClass();
        if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING, null) || ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
            map.put("block_3p_only_logout", "true");
            DeprecationEnhancementExperiment.LIZ.getClass();
            if (DeprecationEnhancementExperiment.LIZIZ()) {
                map.put("event", "fb_deprecation");
            }
        }
        if (z || (bundle != null && bundle.getBoolean("should_show_loading_dialog", false))) {
            z3 = true;
        }
        if (activityLJFF != null) {
            activityLJFF.runOnUiThread(new ARunnableS14S0210000_13((Object) this, (List<? extends BaseLoginMethod>) z3, (boolean) activityLJFF, (List<? extends BaseLoginMethod>) 3));
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = C0XIH.LIZIZ();
        }
        C0XIH c0xih = this.LIZIZ;
        final C0XVU c0xvu = new C0XVU(this, activityLJFF, zLJIIIIZZ, strLIZLLL, str, bundle);
        final Context context = c0xih.LIZ;
        C846070XGz c846070XGz = new C846070XGz();
        c846070XGz.LIZ = C0XH1.LIZ("/passport/user/logout/");
        c846070XGz.LIZJ("logout_from", str);
        c846070XGz.LIZLLL(map);
        final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
        try {
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (map.containsKey("is_kid_user")) {
            str2 = (String) map.get("is_kid_user");
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        new AbstractC845940XGm<C848150XOz>(context, c845960XGoLJFF, str, str2, c0xvu) { // from class: X.0XU8
            public static final /* synthetic */ int LJIIL = 0;
            public final String LJIIIIZZ;
            public final C0XU9 LJIIIZ = new C0XU9();
            public JSONObject LJIIJ;
            public final String LJIIJJI;

            @Override // X.AbstractC845940XGm
            public final void LJ(C0XGA c0xga) {
                if (c0xga.LIZIZ) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("f_mode", this.LJIIJJI);
                        C0XG9.LJ("log_out", jSONObject);
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
                C0XG9.LIZIZ("passport_logout", null, null, c0xga, null);
            }

            @Override // X.AbstractC845940XGm
            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                C0XV1.LIZ(this.LJIIIZ, jSONObject);
                this.LJIIJ = jSONObject2;
            }

            @Override // X.AbstractC845940XGm
            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                this.LJIIIZ.LIZLLL = jSONObject.optString("session_key");
                this.LJIIJ = jSONObject;
            }

            @Override // X.AbstractC845940XGm
            public final C0XGA LJIIJ(boolean z4, C845980XGq c845980XGq) {
                C848150XOz c848150XOz = new C848150XOz(z4);
                if (!z4) {
                    C0XU9 c0xu9 = this.LJIIIZ;
                    c848150XOz.LIZLLL = c0xu9.LIZ;
                    c848150XOz.LJFF = c0xu9.LIZIZ;
                    c848150XOz.LJIIJ = c0xu9.LJ;
                }
                c848150XOz.LJIIIZ = this.LJIIIIZZ;
                c848150XOz.LJII = this.LJIIJ;
                return c848150XOz;
            }

            {
                this.LJIIIIZZ = str;
                this.LJIIJJI = str2;
            }
        }.LJIIIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZJ(String str, String str2, Bundle bundle, C0XU7 c0xu7) {
        boolean z;
        boolean zEquals = TextUtils.equals("h5_delete_account", str);
        boolean zEquals2 = TextUtils.equals("h5_deactivate_account", str);
        if (!zEquals && !zEquals2) {
            z = false;
        } else {
            z = true;
        }
        if (this.LIZ.isLogin()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            User curUser = this.LIZ.getCurUser();
            C0XUE c0xue = C0XUE.LIZ;
            C854700Xfw c854700Xfw = new C854700Xfw(c0xu7, 4);
            synchronized (c0xue) {
                AbstractC19486711Lt.LJIILIIL(new ARunnableS18S0100100_13(jCurrentTimeMillis, curUser, 8)).LJIJJLI(C11S5.LIZIZ).LJIJI(new C09JN() { // from class: X.00NU
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LoginMethodManager@cc23.updateLoginMethodsOnLogoutAsync$2");
                        C1C7U.LIZIZ("LoginMethodManager@cc23.updateLoginMethodsOnLogoutAsync$2");
                    }
                }, c854700Xfw);
            }
        }
        C0XUU.LJFF = this.LIZ.getCurUserId();
        LIZIZ(str2, false, z, bundle);
        Keva.getRepo("login").storeLong("last_logout_time", System.currentTimeMillis());
    }
}
