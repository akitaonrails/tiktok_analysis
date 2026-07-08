package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountApi;
import com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850590XYj implements InterfaceC1850100yFE {
    public final ReactiveAccountActivity LIZ;
    public final Bundle LIZIZ;
    public final C01GW LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<PolicyBodyLinkList> LJI;
    public final Integer LJII;

    @Override // X.InterfaceC1850100yFE
    public final boolean LJII() {
        Bundle bundle = this.LIZIZ;
        boolean z = false;
        if (bundle != null && bundle.getInt("mixed_age_consent_action") == 0) {
            z = true;
        }
        return !z;
    }

    public final void LJIIJ() {
        String string;
        Integer num = this.LJII;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        C20684815ws.LJIILLIIL("reactivate_success", C2097908Jt.LIZJ(new Pair("reason", string)));
    }

    @Override // X.InterfaceC1850100yFE
    public final Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1850100yFE
    public final List<PolicyBodyLinkList> LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1850100yFE
    public final String LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1850100yFE
    public final String LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1850100yFE
    public final Integer LJI() {
        return this.LJII;
    }

    public C850590XYj(ReactiveAccountActivity reactiveAccountActivity) {
        Bundle extras;
        Integer numValueOf;
        Integer numValueOf2;
        List<PolicyBodyLinkList> list;
        String str;
        String str2;
        this.LIZ = reactiveAccountActivity;
        Integer num = null;
        try {
            extras = reactiveAccountActivity.getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        this.LIZIZ = extras;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 84));
        this.LIZJ = c01gwLIZIZ;
        if (extras != null) {
            numValueOf = Integer.valueOf(extras.getInt("cancel_type", 0));
        } else {
            numValueOf = null;
        }
        this.LIZLLL = numValueOf;
        LegalEntityChangeInfo legalEntityChangeInfo = (LegalEntityChangeInfo) c01gwLIZIZ.getValue();
        String str3 = "";
        this.LJ = (legalEntityChangeInfo == null || (str2 = legalEntityChangeInfo.title) == null) ? "" : str2;
        LegalEntityChangeInfo legalEntityChangeInfo2 = (LegalEntityChangeInfo) c01gwLIZIZ.getValue();
        if (legalEntityChangeInfo2 != null && (str = legalEntityChangeInfo2.body) != null) {
            str3 = str;
        }
        this.LJFF = str3;
        LegalEntityChangeInfo legalEntityChangeInfo3 = (LegalEntityChangeInfo) c01gwLIZIZ.getValue();
        this.LJI = (legalEntityChangeInfo3 == null || (list = legalEntityChangeInfo3.bodyLinkList) == null) ? C13BV.INSTANCE : list;
        if (extras != null && (numValueOf2 = Integer.valueOf(extras.getInt("error_code"))) != null) {
            if (numValueOf2.intValue() == 1430) {
                num = 2;
            } else if (numValueOf2.intValue() == 1075) {
                num = 1;
            }
        }
        this.LJII = num;
    }

    @Override // X.InterfaceC1850100yFE
    public final void LIZJ(ARunnableS113S0100000_13 aRunnableS113S0100000_13) throws Throwable {
        Activity activity = this.LIZ;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEF/tzqRFj1KYptZolAq69i9NzlYskyBJ37/ai+8mbae6FgHEP4qCb", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 1;
        Object[] objArr = {1};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", null, objArr, activity, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    iIntValue = ((Integer) obj2).intValue();
                }
            }
            activity.setResult(iIntValue);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        aRunnableS113S0100000_13.run();
        this.LIZ.finish();
    }

    @Override // X.InterfaceC1850100yFE
    public final void LJFF(final ARunnableS113S0100000_13 aRunnableS113S0100000_13) {
        Integer numValueOf;
        Bundle bundle = this.LIZIZ;
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("error_code"));
        } else {
            numValueOf = null;
        }
        String str = "";
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1430) {
                C0XYH c0xyh = ReactiveAccountApi.LIZ;
                final ReactiveAccountActivity reactiveAccountActivity = this.LIZ;
                String string = this.LIZIZ.getString("token");
                if (string != null) {
                    str = string;
                }
                final C0XH7<C850680XYs> c0xh7 = new C0XH7<C850680XYs>() { // from class: X.0XYk
                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        this.LIZJ.LJIIJ();
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C850610XYl((C850680XYs) c0xga, this.LIZJ, aRunnableS113S0100000_13, null), 3);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        this.LIZJ.LJIIIZ(i);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C850630XYn((C850680XYs) c0xga, this.LIZJ, aRunnableS113S0100000_13, null), 3);
                    }
                };
                c0xyh.getClass();
                C846070XGz c846070XGz = new C846070XGz();
                c846070XGz.LIZ = C0XH1.LIZ("/passport/deactivation/login/");
                c846070XGz.LIZJ("token", str);
                final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
                new AbstractC845940XGm<C850680XYs>(reactiveAccountActivity, c845960XGoLJFF, c0xh7) { // from class: X.0XYq
                    public JSONObject LJIIIIZZ;
                    public JSONObject LJIIIZ;

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ = jSONObject;
                        this.LJIIIZ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                        String strJ3;
                        C850680XYs c850680XYs = new C850680XYs(z);
                        Bundle bundle2 = c850680XYs.LJIIIZ;
                        JSONObject jSONObject = this.LJIIIIZZ;
                        String strJ32 = null;
                        if (jSONObject != null) {
                            strJ3 = C786410Ut5.J3(jSONObject);
                        } else {
                            strJ3 = null;
                        }
                        C786410Ut5.LJJJI("result", strJ3, bundle2);
                        Bundle bundle3 = c850680XYs.LJIIIZ;
                        JSONObject jSONObject2 = this.LJIIIZ;
                        if (jSONObject2 != null) {
                            strJ32 = C786410Ut5.J3(jSONObject2);
                        }
                        C786410Ut5.LJJJI("data", strJ32, bundle3);
                        if (c845980XGq != null) {
                            c850680XYs.LIZLLL = c845980XGq.LIZIZ;
                            String str2 = c845980XGq.LIZJ;
                            if (str2 != null) {
                                c850680XYs.LJFF = str2;
                            }
                        }
                        return c850680XYs;
                    }
                }.LJIIIZ();
                return;
            }
            if (numValueOf.intValue() == 1075) {
                C0XYH c0xyh2 = ReactiveAccountApi.LIZ;
                final ReactiveAccountActivity reactiveAccountActivity2 = this.LIZ;
                String string2 = this.LIZIZ.getString("token");
                if (string2 != null) {
                    str = string2;
                }
                final C0XH7<C850680XYs> c0xh72 = new C0XH7<C850680XYs>() { // from class: X.0XYp
                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        this.LIZJ.LJIIJ();
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C850620XYm((C850680XYs) c0xga, this.LIZJ, aRunnableS113S0100000_13, null), 3);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        this.LIZJ.LJIIIZ(i);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C850640XYo((C850680XYs) c0xga, this.LIZJ, aRunnableS113S0100000_13, null), 3);
                    }
                };
                c0xyh2.getClass();
                C846070XGz c846070XGz2 = new C846070XGz();
                c846070XGz2.LIZ = C0XH1.LIZ("/passport/cancel/login/");
                c846070XGz2.LIZJ("token", str);
                final C845960XGo c845960XGoLJFF2 = c846070XGz2.LJFF();
                new AbstractC845940XGm<C850680XYs>(reactiveAccountActivity2, c845960XGoLJFF2, c0xh72) { // from class: X.0XYq
                    public JSONObject LJIIIIZZ;
                    public JSONObject LJIIIZ;

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ = jSONObject;
                        this.LJIIIZ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                        String strJ3;
                        C850680XYs c850680XYs = new C850680XYs(z);
                        Bundle bundle2 = c850680XYs.LJIIIZ;
                        JSONObject jSONObject = this.LJIIIIZZ;
                        String strJ32 = null;
                        if (jSONObject != null) {
                            strJ3 = C786410Ut5.J3(jSONObject);
                        } else {
                            strJ3 = null;
                        }
                        C786410Ut5.LJJJI("result", strJ3, bundle2);
                        Bundle bundle3 = c850680XYs.LJIIIZ;
                        JSONObject jSONObject2 = this.LJIIIZ;
                        if (jSONObject2 != null) {
                            strJ32 = C786410Ut5.J3(jSONObject2);
                        }
                        C786410Ut5.LJJJI("data", strJ32, bundle3);
                        if (c845980XGq != null) {
                            c850680XYs.LIZLLL = c845980XGq.LIZIZ;
                            String str2 = c845980XGq.LIZJ;
                            if (str2 != null) {
                                c850680XYs.LJFF = str2;
                            }
                        }
                        return c850680XYs;
                    }
                }.LJIIIZ();
                return;
            }
        }
        aRunnableS113S0100000_13.run();
        this.LIZ.finish();
    }

    @Override // X.InterfaceC1850100yFE
    public final void LJIIIIZZ(View view) {
        Object c098200Yq;
        String string;
        String str = new C850670XYr().getConfig().get("dyd_main");
        if (str != null) {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
                Uri.Builder builderBuildUpon = UriProtector.parse(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "UTF-8")).buildUpon();
                builderBuildUpon.appendQueryParameter("url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                builderBuildUpon.appendQueryParameter("enter_from", "reactive_account");
                Bundle bundle = this.LIZIZ;
                String string2 = null;
                if (bundle == null) {
                    string = null;
                } else {
                    string = bundle.getString("verify_ticket", "");
                }
                builderBuildUpon.appendQueryParameter("verify_ticket", string);
                Bundle bundle2 = this.LIZIZ;
                if (bundle2 != null) {
                    string2 = bundle2.getString("user_nick_name", "");
                }
                builderBuildUpon.appendQueryParameter("user_nick_name", string2);
                builderBuildUpon.appendQueryParameter("app_id", String.valueOf(1233));
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//webview");
                smartRouteBuildRoute.withParam(builderBuildUpon.build());
                smartRouteBuildRoute.open();
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

    public final void LJIIIZ(int i) {
        String string;
        String string2;
        Pair[] pairArr = new Pair[2];
        Integer num = this.LJII;
        String str = "";
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("reason", string);
        pairArr[1] = new Pair("error_code", String.valueOf(i));
        C20684815ws.LJIILLIIL("reactivate_fail", C2097608Jq.LJIIIIZZ(pairArr));
        try {
            JSONObject jSONObject = new JSONObject();
            Pair[] pairArr2 = new Pair[2];
            Integer num2 = this.LJII;
            if (num2 != null && (string2 = num2.toString()) != null) {
                str = string2;
            }
            pairArr2[0] = new Pair("reason", str);
            pairArr2[1] = new Pair("error_code", String.valueOf(i));
            C793770VBv.LJII("reactivate_fail", jSONObject, new JSONObject(C2097608Jq.LJIIIIZZ(pairArr2)), null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIIJJI(C850680XYs c850680XYs) throws Throwable {
        boolean z;
        Object c098200Yq;
        JSONObject jSONObject;
        String string;
        String stringExtra;
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131836791);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        Intent intent = new Intent();
        intent.putExtras(c850680XYs.LJIIIZ);
        Bundle bundle = this.LIZIZ;
        int iIntValue = 0;
        if (bundle != null && bundle.getBoolean("handle_login_success", false)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject2 = null;
        if (z) {
            try {
                try {
                    stringExtra = intent.getStringExtra("result");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(stringExtra);
                }
                try {
                    String stringExtra2 = intent.getStringExtra("data");
                    if (stringExtra2 != null) {
                        jSONObject2 = new JSONObject(stringExtra2);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C0XYO.LIZLLL(C0XYO.LIZ, this.LIZ, null, C0XZS.LIZJ(jSONObject, jSONObject2), false, null, false, 112);
                Integer num = this.LJII;
                if (num == null || (string = num.toString()) == null) {
                    string = "";
                }
                C20684815ws.LJIILLIIL("reactivate_login_success", C2097908Jt.LIZJ(new Pair("reason", string)));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        Activity activity = this.LIZ;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEF/tzqRFj1KYptZolAq69i9NzlYskyBJ37/ai+8mbae6FgHEP4qCb", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {0, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                iIntValue = ((Integer) obj2).intValue();
            }
            Object obj3 = c0wsuLIZIZ.LIZJ[2];
            if (obj3 != null) {
                intent = (Intent) obj3;
            }
        }
        activity.setResult(iIntValue, intent);
        c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity", "setResult", null, objArr, activity, c0wzw, true);
    }

    public final void LJIIL(C850680XYs c850680XYs) {
        String strLIZ = C849760XVe.LIZ(c850680XYs);
        if (!TextUtils.isEmpty(strLIZ) && strLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LJIIJJI();
        }
    }
}
