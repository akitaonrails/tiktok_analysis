package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XYM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XYM extends C0XQW {
    public final int LIZJ;
    public final String LIZLLL;
    public final EnumC852660Xce LJ;
    public final EnumC852910Xd3 LJFF;
    public final JSONObject LJI;

    @Override // X.C0XQW
    public final boolean LIZ() {
        int i = this.LIZJ;
        C20684815ws.LJIILLIIL("account_deletion_login_failed", C2097908Jt.LIZJ(new Pair("reason", i != 1075 ? i != 1430 ? "" : "2" : "1")));
        if (this.LIZIZ.isViewValid()) {
            C0XYD c0xyd = this.LIZIZ;
            int i2 = this.LIZJ;
            c0xyd.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LJ == EnumC852660Xce.RECOVER_ACCOUNT ? this.LIZ.getString(2131845875) : this.LIZLLL));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//account/recover_deleted");
        smartRouteBuildRoute.withParam("reactive_page_revamp", true);
        smartRouteBuildRoute.withParam("error_code", this.LIZJ);
        smartRouteBuildRoute.withParam("handle_login_success", false);
        JSONObject jSONObject = this.LJI;
        smartRouteBuildRoute.withParam("token", jSONObject != null ? jSONObject.optString("token") : null);
        JSONObject jSONObject2 = this.LJI;
        smartRouteBuildRoute.withParam("cancel_type", jSONObject2 != null ? Integer.valueOf(jSONObject2.optInt("cancel_type")) : null);
        JSONObject jSONObject3 = this.LJI;
        smartRouteBuildRoute.withParam("legal_entity_change_info", jSONObject3 != null ? jSONObject3.optString("legal_entity_change_info") : null);
        JSONObject jSONObject4 = this.LJI;
        smartRouteBuildRoute.withParam("mixed_age_consent_action", jSONObject4 != null ? Integer.valueOf(jSONObject4.optInt("mixed_age_consent_action")) : null);
        JSONObject jSONObject5 = this.LJI;
        smartRouteBuildRoute.withParam("verify_ticket", jSONObject5 != null ? jSONObject5.optString("verify_ticket") : null);
        JSONObject jSONObject6 = this.LJI;
        smartRouteBuildRoute.withParam("user_nick_name", jSONObject6 != null ? jSONObject6.optString("nick_name") : null);
        smartRouteBuildRoute.withParam("enter_from", this.LIZIZ.getMobParams().LJJLIIIJJI());
        smartRouteBuildRoute.open(this.LIZJ, new OnActivityResultCallback() { // from class: X.0XQX
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i3, int i4, Intent intent) {
                Object c098200Yq;
                JSONObject jSONObject7;
                String str;
                String stringExtra;
                C0XYM c0xym = this.LL;
                if (i3 == c0xym.LIZJ && i4 == 0 && intent != null) {
                    JSONObject jSONObject8 = null;
                    try {
                        try {
                            stringExtra = intent.getStringExtra("result");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (stringExtra == null) {
                            jSONObject7 = null;
                        } else {
                            jSONObject7 = new JSONObject(stringExtra);
                        }
                        try {
                            String stringExtra2 = intent.getStringExtra("data");
                            if (stringExtra2 != null) {
                                jSONObject8 = new JSONObject(stringExtra2);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        C0XO3 c0xo3LIZJ = C0XZS.LIZJ(jSONObject7, jSONObject8);
                        C0XYO c0xyo = C0XYO.LIZ;
                        Fragment fragment = c0xym.LIZ;
                        C0XYD c0xyd2 = c0xym.LIZIZ;
                        EnumC852660Xce enumC852660Xce = c0xym.LJ;
                        EnumC852910Xd3 enumC852910Xd3 = c0xym.LJFF;
                        c0xyo.getClass();
                        C0XYO.LIZJ(fragment, c0xyd2, enumC852660Xce, enumC852910Xd3, null, c0xo3LIZJ);
                        int i5 = c0xym.LIZJ;
                        if (i5 != 1075) {
                            if (i5 != 1430) {
                                str = "";
                            } else {
                                str = "2";
                            }
                        } else {
                            str = "1";
                        }
                        C20684815ws.LJIILLIIL("reactivate_login_success", C2097908Jt.LIZJ(new Pair("reason", str)));
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
            }
        });
        return true;
    }

    public C0XYM(int i, Fragment fragment, EnumC852660Xce enumC852660Xce, EnumC852910Xd3 enumC852910Xd3, C0XYD c0xyd, String str, JSONObject jSONObject) {
        super(fragment, c0xyd);
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = enumC852660Xce;
        this.LJFF = enumC852910Xd3;
        this.LJI = jSONObject;
    }
}
