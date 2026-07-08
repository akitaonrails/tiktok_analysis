package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.event.TwosvSetupMethodAddSuccessEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS71S0210000_19;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233610iCt extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233610iCt(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, boolean z, String str, List<String> list, int i) {
        super(1);
        this.LL = twoStepVerificationActivityViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        final TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LL;
        final boolean z = this.LLILLJJLI;
        final String str2 = this.LLILLL;
        final List<String> list = this.LLILZ;
        final int i = this.LLILZIL;
        twoStepVerificationActivityViewModel.LLILZIL = true;
        C1233960iDS.LIZ.getClass();
        final String strLIZIZ = "";
        for (String strLIZIZ2 : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(',');
                sbLIZ2.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TwoStepAuthApi.LIZIZ().addVerificationV2(strLIZIZ, i).LJ(new InterfaceC2385309Wh() { // from class: X.0iDT
            /* JADX WARN: Type inference failed for: r0v14, types: [X.0iDY] */
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<AddVerificationResponse> c15o7) {
                Integer num;
                String str3;
                AddVerificationResponse.Data data;
                String str4;
                String str5;
                C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.addVerification$1");
                if (!C09UZ.LIZLLL(c15o7)) {
                    TwoStepVerificationActivityViewModel.xQ2(twoStepVerificationActivityViewModel, null, null, 7);
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.addVerification$1");
                    return null;
                }
                AddVerificationResponse addVerificationResponseLJIIL = c15o7.LJIIL();
                if (u.LJIJI("success", addVerificationResponseLJIIL.message, true) && (data = addVerificationResponseLJIIL.data) != null) {
                    if (C123100dR.LIZ(data.default_verify_way)) {
                        str4 = "on";
                    } else {
                        str4 = "off";
                    }
                    C1233960iDS c1233960iDS = C1233960iDS.LIZ;
                    String str6 = strLIZIZ;
                    int i2 = i;
                    String enterFrom = twoStepVerificationActivityViewModel.getEnterFrom();
                    String str7 = str2;
                    boolean zGQ2 = twoStepVerificationActivityViewModel.GQ2();
                    c1233960iDS.getClass();
                    boolean zLJJIIZI = a0.LJJIIZI(str6, "mobile_sms_verify", false);
                    boolean zLJJIIZI2 = a0.LJJIIZI(str6, "pwd_verify", false);
                    boolean zLJJIIZI3 = a0.LJJIIZI(str6, "email_verify", false);
                    boolean zLJJIIZI4 = a0.LJJIIZI(str6, "totp_verify", false);
                    TwosvSetupMethodAddSuccessEvent twosvSetupMethodAddSuccessEvent = new TwosvSetupMethodAddSuccessEvent();
                    twosvSetupMethodAddSuccessEvent.LJI(String.valueOf(zLJJIIZI), "is_sms_selected");
                    twosvSetupMethodAddSuccessEvent.LJI(String.valueOf(zLJJIIZI3), "is_email_selected");
                    twosvSetupMethodAddSuccessEvent.LJI(String.valueOf(zLJJIIZI2), "is_pw_selected");
                    twosvSetupMethodAddSuccessEvent.LJI(String.valueOf(zLJJIIZI4), "is_totp_selected");
                    twosvSetupMethodAddSuccessEvent.LJI(str7, "verified_method");
                    twosvSetupMethodAddSuccessEvent.LJI(enterFrom, "enter_from");
                    if (i2 == 1) {
                        str5 = "new";
                    } else {
                        str5 = "backup";
                    }
                    twosvSetupMethodAddSuccessEvent.LJI(str5, "type");
                    twosvSetupMethodAddSuccessEvent.LJI(str4, "page_type");
                    twosvSetupMethodAddSuccessEvent.LJI(String.valueOf(zGQ2), "is_trusted");
                    twosvSetupMethodAddSuccessEvent.LJIIIIZZ();
                    twoStepVerificationActivityViewModel.NQ2(addVerificationResponseLJIIL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.addVerification$1");
                    return unit;
                }
                AddVerificationResponse.Data data2 = addVerificationResponseLJIIL.data;
                if (data2 != null) {
                    num = data2.errorCode;
                    str3 = data2.errorDescription;
                } else {
                    num = null;
                    str3 = null;
                }
                if (num != null && 1015 == num.intValue()) {
                    TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = twoStepVerificationActivityViewModel;
                    boolean z2 = z;
                    List<String> list2 = list;
                    twoStepVerificationActivityViewModel2.getClass();
                    final AwS71S0210000_19 awS71S0210000_19 = new AwS71S0210000_19(twoStepVerificationActivityViewModel2, (TwoStepVerificationActivityViewModel) z2, (boolean) list2, (List<String>) 8);
                    final AwS71S0210000_19 awS71S0210000_192 = new AwS71S0210000_19(twoStepVerificationActivityViewModel2, (TwoStepVerificationActivityViewModel) z2, (boolean) list2, (List<String>) 10);
                    final AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(twoStepVerificationActivityViewModel2, 306);
                    final Context context = twoStepVerificationActivityViewModel2.BQ2().LLILLL;
                    if (context != null) {
                        twoStepVerificationActivityViewModel2.setStateImmediate(AFwS257S0000000_19.get$arr$(788));
                        C846070XGz c846070XGz = new C846070XGz();
                        c846070XGz.LIZ = "/passport/shark/safe_verify/verification_manage/";
                        c846070XGz.LIZJ(Scene.SCENE_SERVICE, "two_step_manage");
                        final C845960XGo c845960XGoLIZIZ = c846070XGz.LIZIZ();
                        final ?? r0 = new AbstractC1234820iEq() { // from class: X.0iDY
                            @Override // X.C0XH7
                            public final void LJI(C0XGA c0xga) {
                                C1234040iDa c1234040iDa = (C1234040iDa) c0xga;
                                if (c1234040iDa.LJIIJ) {
                                    awS71S0210000_19.invoke(c1234040iDa.LJIIIZ);
                                } else {
                                    awS71S0210000_192.invoke(c1234040iDa.LJIIIZ);
                                }
                            }

                            @Override // X.C0XH7
                            public final void LJ(C0XGA c0xga, int i3) {
                                awS633S0100000_19.invoke(c0xga, Integer.valueOf(i3));
                            }
                        };
                        new AbstractC845940XGm<C1234040iDa>(context, c845960XGoLIZIZ, r0) { // from class: X.0iEm
                            public String LJIIIIZZ;
                            public boolean LJIIIZ;
                            public JSONObject LJIIJ;

                            @Override // X.AbstractC845940XGm
                            public final void LJ(C0XGA c0xga) {
                                C0XG9.LIZIZ("passport_shark_safe_verify", null, null, c0xga, null);
                            }

                            @Override // X.AbstractC845940XGm
                            public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                                this.LJIIJ = jSONObject2;
                            }

                            @Override // X.AbstractC845940XGm
                            public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                                this.LJIIJ = jSONObject;
                                this.LJIIIIZZ = jSONObject2.optString("ticket");
                                this.LJIIIZ = jSONObject2.optBoolean("safe");
                            }

                            @Override // X.AbstractC845940XGm
                            public final C0XGA LJIIJ(boolean z3, C845980XGq c845980XGq) {
                                C1234040iDa c1234040iDa = new C1234040iDa(z3);
                                if (z3) {
                                    c1234040iDa.LJIIIZ = this.LJIIIIZZ;
                                    c1234040iDa.LJIIJ = this.LJIIIZ;
                                } else {
                                    c1234040iDa.LIZLLL = c845980XGq.LIZIZ;
                                    c1234040iDa.LJFF = c845980XGq.LIZJ;
                                }
                                c1234040iDa.LJII = this.LJIIJ;
                                return c1234040iDa;
                            }
                        }.LJIIIZ();
                    }
                } else {
                    TwoStepVerificationActivityViewModel.xQ2(twoStepVerificationActivityViewModel, num, str3, 4);
                }
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.addVerification$1");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
        return Unit.LIZ;
    }
}
