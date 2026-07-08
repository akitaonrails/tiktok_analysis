package X;

import Y.AfS149S0200000_13;
import Y.AfS40S1200000_13;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.PassportTicketLoginQueryObj;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZ3 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("unverified_1p", "verified_1p");

    public static void LIZ(final BaseI18nLoginFragment baseI18nLoginFragment, final BaseI18nLoginFragment baseI18nLoginFragment2, final String str, final String str2, Function1 function1) {
        C0XZ4.LIZ.getClass();
        C1239250iLz.LIZIZ(baseI18nLoginFragment, baseI18nLoginFragment2, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWK
            /* JADX WARN: Type inference failed for: r6v0, types: [X.0XGw, X.0XWM] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                Boolean bool = Boolean.FALSE;
                String str3 = str2;
                BaseAccountFlowFragment mobParams = baseI18nLoginFragment2.getMobParams();
                c852170Xbr.getClass();
                C852170Xbr.LJIIJ(bool, str3, mobParams, false, null);
                final C0XYD c0xyd = baseI18nLoginFragment2;
                ?? r6 = new C0XTB() { // from class: X.0XWM
                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<PassportTicketLoginQueryObj> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<PassportTicketLoginQueryObj> c0xt7, int i) {
                        String str4;
                        C0XWW<C0XT7<PassportTicketLoginQueryObj>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str4 = c0xt7.LJFF;
                        } else {
                            str4 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i, str4, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                baseI18nLoginFragment2.gk(r6);
                Context contextRequireContext = baseI18nLoginFragment.requireContext();
                PassportTicketLoginQueryObj passportTicketLoginQueryObj = new PassportTicketLoginQueryObj(str);
                C846070XGz c846070XGz = new C846070XGz();
                c846070XGz.LIZ = C0XH1.LIZ("/passport/user/login_by_passport_ticket/");
                c846070XGz.LIZLLL(C2097908Jt.LIZJ(new Pair("passport_ticket", passportTicketLoginQueryObj.passportTicket)));
                new AbstractC845940XGm<C0XT7<PassportTicketLoginQueryObj>>(contextRequireContext, c846070XGz.LJFF(), passportTicketLoginQueryObj, r6) { // from class: X.0XT9
                    public static final /* synthetic */ int LJIIIZ = 0;
                    public final PassportTicketLoginQueryObj LJIIIIZZ;

                    @Override // X.AbstractC845940XGm
                    public final void LJ(C0XGA c0xga) {
                        C0XG9.LIZIZ("passport_auth_one_login_by_ticket", "tiktok", null, c0xga, null);
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                        this.LJIIIIZZ.LJ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        C0XO2 c0xo2;
                        PassportTicketLoginQueryObj passportTicketLoginQueryObj2 = this.LJIIIIZZ;
                        try {
                            c0xo2 = C0XZS.LIZJ(jSONObject, jSONObject2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0xo2 = new C0XO2();
                        }
                        passportTicketLoginQueryObj2.LJI = c0xo2;
                        this.LJIIIIZZ.LJ = jSONObject;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                        return new C0XT7(z, 10014, this.LJIIIIZZ);
                    }

                    {
                        this.LJIIIIZZ = passportTicketLoginQueryObj;
                    }
                }.LJIIIZ();
            }
        }).LJIIIIZZ(new AfS40S1200000_13(baseI18nLoginFragment2, baseI18nLoginFragment, str2, 6)).LJII(new AfS40S1200000_13(function1, baseI18nLoginFragment2, str2, 7))).LJIIIIZZ(new AfS149S0200000_13(baseI18nLoginFragment, function1, 25)).LJIILL();
    }

    public static void LIZIZ(String str, Fragment fragment, C0XYD c0xyd, String str2, String str3, EnumC852660Xce enumC852660Xce, String str4, Function0 function0) {
        String str5 = "code";
        if (enumC852660Xce == EnumC852660Xce.VERIFY) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("passport_ticket", str3));
            if (str4 != null) {
                str5 = str4;
            }
            c0xz4.getClass();
            C0XZ4.LJII(str, fragment, c0xyd, "", str2, 23, mapLIZJ, str5, "user_click", null).LJIIIIZZ(new C516201zk(function0, 302)).LJIILL();
            return;
        }
        if (enumC852660Xce != EnumC852660Xce.BIND_EMAIL) {
            return;
        }
        C0XZ4 c0xz42 = C0XZ4.LIZ;
        if (str4 != null) {
            str5 = str4;
        }
        Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("passport_ticket", str3));
        c0xz42.getClass();
        C0XZ4.LIZ(fragment, c0xyd, "", str2, false, str5, "user_click", mapLIZJ2).LJIIIIZZ(new C516201zk(function0, 303)).LJIILL();
    }
}
