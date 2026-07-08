package X;

import Y.AfS0S2201000_13;
import Y.AfS0S2301000_13;
import Y.AfS0S3200000_13;
import Y.AfS0S4300000_13;
import Y.AfS0S5110000_13;
import Y.AfS108S0300000_13;
import Y.AfS12S1201000_13;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import Y.AfS36S1300000_13;
import Y.AfS40S1200000_13;
import Y.AfS46S1100000_13;
import Y.AfS65S0201000_13;
import Y.AfS81S0101000_13;
import Y.AfS9S2200000_13;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.SendEmailCodeEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJAgeRangeService;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZ4 {
    public static final C0XZ4 LIZ = new C0XZ4();

    public static Map LJIIL() {
        IPNSAgeFromStoreService iPNSAgeFromStoreServiceLJIJJ;
        C19258510Vz c19258510VzLJFF;
        IAgeGateService iAgeGateService;
        IPNSAgeFromStoreService iPNSAgeFromStoreServiceLJIJJ2;
        C19258510Vz c19258510VzLJFF2;
        C0XGR c0xgr = new C0XGR();
        String strLIZIZ = ComplianceServiceProvider.LIZLLL().LIZIZ();
        c0xgr.LIZ(((strLIZIZ == null || strLIZIZ.length() == 0) ? 1 : 0) ^ 1, "if_exist");
        String strLIZJ = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LIZJ();
        c0xgr.LIZ(((strLIZJ == null || strLIZJ.length() == 0) ? 1 : 0) ^ 1, "if_exist_for_guest");
        C20684815ws.LJIILLIIL("birthday_get", c0xgr.LIZ);
        String strLIZIZ2 = ComplianceServiceProvider.LIZLLL().LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LIZJ();
        }
        HashMap map = new HashMap();
        String strLIZIZ3 = ComplianceServiceProvider.LIZLLL().LIZIZ();
        if (C123100dR.LIZ(strLIZIZ3)) {
            map.put("birthday", strLIZIZ3);
        } else {
            IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
            String strLIZJ2 = iGuestModeService != null ? iGuestModeService.LIZJ() : null;
            INUJAgeRangeService iNUJAgeRangeService = (INUJAgeRangeService) PluggableExtentionKt.pluggableSpi$default(INUJAgeRangeService.class, false, false, false, 14, null);
            C0XZ9 c0xz9LIZ = iNUJAgeRangeService != null ? iNUJAgeRangeService.LIZ() : null;
            if (C123100dR.LIZ(strLIZJ2)) {
                map.put("birthday", strLIZJ2);
            } else if (c0xz9LIZ != null && c0xz9LIZ.LIZ) {
                Integer num = c0xz9LIZ.LIZLLL;
                if (num != null) {
                    map.put("lower_bound", String.valueOf(num.intValue()));
                }
                Integer num2 = c0xz9LIZ.LJ;
                if (num2 != null) {
                    map.put("upper_bound", String.valueOf(num2.intValue()));
                }
            } else if (C19254610Um.LIZIZ.LJIIJJI().LIZJ().LIZIZ()) {
                String strLIZLLL = C10RP.LIZLLL();
                if (C123100dR.LIZ(strLIZLLL)) {
                    map.put("birthday", strLIZLLL);
                }
            }
        }
        if (C294540Bga.LIZ()) {
            if (!C294530BgZ.LIZ()) {
                IAgeGateService iAgeGateService2 = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null);
                if (iAgeGateService2 != null && (iPNSAgeFromStoreServiceLJIJJ = iAgeGateService2.LJIJJ()) != null && (c19258510VzLJFF = iPNSAgeFromStoreServiceLJIJJ.LJFF()) != null) {
                    Integer num3 = c19258510VzLJFF.LIZ;
                    if (num3 != null) {
                        map.put("lower_bound", String.valueOf(num3.intValue()));
                    }
                    Integer num4 = c19258510VzLJFF.LIZIZ;
                    if (num4 != null) {
                        map.put("upper_bound", String.valueOf(num4.intValue()));
                        return map;
                    }
                }
            } else if ((strLIZIZ2 == null || a0.LJJJIL(strLIZIZ2)) && (iAgeGateService = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null)) != null && (iPNSAgeFromStoreServiceLJIJJ2 = iAgeGateService.LJIJJ()) != null && (c19258510VzLJFF2 = iPNSAgeFromStoreServiceLJIJJ2.LJFF()) != null) {
                Integer num5 = c19258510VzLJFF2.LIZ;
                if (num5 != null) {
                    map.put("lower_bound", String.valueOf(num5.intValue()));
                }
                Integer num6 = c19258510VzLJFF2.LIZIZ;
                if (num6 != null) {
                    map.put("upper_bound", String.valueOf(num6.intValue()));
                }
            }
        }
        return map;
    }

    public static JSONObject LJIIJJI(C0XT7 c0xt7) {
        JSONObject jSONObject;
        if (c0xt7 != null) {
            try {
                T t = c0xt7.LJIIIZ;
                if (t != 0 && (jSONObject = t.LJ) != null) {
                    return JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                }
                return null;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static int LJIILJJIL(EnumC852660Xce enumC852660Xce) {
        switch (C852930Xd5.LIZIZ[enumC852660Xce.ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 1;
            default:
                return -1;
        }
    }

    public static int LJJI(int i) {
        if (i != 1 && i != 3) {
            if (i != 4 && i != 6) {
                if (i == 7) {
                    return C0XZ7.ACTIVATION_LOGIN_ONLY.getScene();
                }
                if (i != 10 && i != 8) {
                    if (i != 13 && i != 15) {
                        if (i == 19) {
                            return C0XZ7.ACTIVATION_LOGIN_PASSWORD_NOTIFY.getScene();
                        }
                        if (i == 20) {
                            return C0XZ7.ACTIVATION_CHANGE_MOBILE.getScene();
                        }
                        if (i == 22) {
                            return C0XZ7.ACTIVATION_IDENTIFY_VERIFICATION.getScene();
                        }
                        if (i == 24) {
                            return C0XZ7.ACTIVATION_QUICK_LOGIN.getScene();
                        }
                        if (i != 26 && i != 27) {
                            if (i == 28) {
                                return C0XZ7.ACTIVATION_CHANGE_MOBILE_VERIFY.getScene();
                            }
                            if (i == 29) {
                                return C0XZ7.ACTIVATION_SAFE_LOCK.getScene();
                            }
                            if (i == 30) {
                                return C0XZ7.ACTIVATION_SAFE_UNLOCK.getScene();
                            }
                            if (i == 31) {
                                return C0XZ7.ACTIVATION_GET_OR_REGISTER.getScene();
                            }
                            if (i == 33) {
                                return C0XZ7.ACTIVATION_CHANGE_MOBILE.getScene();
                            }
                            if (i == 32) {
                                return C0XZ7.ACTIVATION_BIND_WAP.getScene();
                            }
                            if (i == 42) {
                                return C0XZ7.ACTIVATION_BIND_V2.getScene();
                            }
                            return -1;
                        }
                        return C0XZ7.ACTIVATION_AUTHORIZE.getScene();
                    }
                    return C0XZ7.ACTIVATION_MODIFY.getScene();
                }
                return C0XZ7.ACTIVATION_BIND_V2.getScene();
            }
            return C0XZ7.ACTIVATION_FORGET.getScene();
        }
        return C0XZ7.ACTIVATION_NEW_REGISTER.getScene();
    }

    public static int LJJII(EnumC852910Xd3 enumC852910Xd3) {
        return LJJI(LJJIFFI(enumC852910Xd3, false));
    }

    public static int LJJIFFI(EnumC852910Xd3 enumC852910Xd3, boolean z) {
        switch (C852930Xd5.LIZ[enumC852910Xd3.ordinal()]) {
            case 4:
            case 5:
                return 4;
            case 6:
            case 7:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
                return 8;
            case 8:
                return 33;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 20;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 13;
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 22;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
                return 42;
            case 22:
                if (z) {
                    return 20;
                }
                return 8;
            default:
                return 24;
        }
    }

    public static void LJJIJLIJ(String str, Map map) {
        if (str != null && str.length() != 0) {
            map.put("rule_strategies", str);
        } else {
            map.put("rules_version", "v2");
        }
    }

    public static C11JS LJJIZ(final BaseAccountFlowFragment baseAccountFlowFragment, final BaseAccountFlowFragment baseAccountFlowFragment2, final String str, final Map map) {
        return C1239250iLz.LIZIZ(baseAccountFlowFragment, baseAccountFlowFragment2, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XZM
            /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XZN] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd = baseAccountFlowFragment2;
                final ?? r4 = new C0XZQ() { // from class: X.0XZN
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C0XZP> c0xt7) {
                        C0XZP c0xzp = (C0XZP) c0xt7.LJIIIZ;
                        if (c0xzp != null && c0xzp.LJI != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                            return;
                        }
                        C0XWW<C0XT7<C0XZP>> c0xww = c11ky;
                        C0XYG c0xyg = C0XZJ.Companion;
                        EnumC852660Xce enumC852660XceScene = c0xyd.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                        c0xyg.getClass();
                        ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C0XZP> c0xt7, int i) {
                        String str2;
                        C0XWW<C0XT7<C0XZP>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str2 = c0xt7.LJFF;
                        } else {
                            str2 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i, str2, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                baseAccountFlowFragment2.gk(r4);
                final Context contextRequireContext = baseAccountFlowFragment.requireContext();
                String str2 = str;
                Map<String, String> map2 = map;
                final C0XZP c0xzp = new C0XZP(str2);
                C846070XGz c846070XGz = new C846070XGz();
                c846070XGz.LIZ = C0XH1.LIZ("/passport/account/verify/");
                HashMap map3 = new HashMap();
                if (!TextUtils.isEmpty(c0xzp.LJII)) {
                    map3.put("captcha", c0xzp.LJII);
                }
                map3.put("password", C2093608Ic.LIZIZ(c0xzp.LJI));
                map3.put("mix_mode", "1");
                if (map2 != null) {
                    map3.putAll(map2);
                }
                c846070XGz.LIZLLL(map3);
                final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
                new AbstractC845940XGm<C0XT7<C0XZP>>(contextRequireContext, c845960XGoLJFF, c0xzp, r4) { // from class: X.0XZO
                    public static final /* synthetic */ int LJIIIZ = 0;
                    public final C0XZP LJIIIIZZ;

                    @Override // X.AbstractC845940XGm
                    public final void LJ(C0XGA c0xga) {
                        C0XG9.LIZIZ("passport_account_verify", "mobile", null, c0xga, null);
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                        this.LJIIIIZZ.LJ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        C0XZP c0xzp2 = this.LJIIIIZZ;
                        c0xzp2.LJ = jSONObject;
                        c0xzp2.LJIIIIZZ = jSONObject2.optString("ticket");
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                        return new C0XT7(z, 10031, this.LJIIIIZZ);
                    }

                    {
                        this.LJIIIIZZ = c0xzp;
                    }
                }.LJIIIZ();
            }
        }).LJIIIIZZ(new AfS182S0100000_13(baseAccountFlowFragment2, 27)).LJII(new AfS182S0100000_13(baseAccountFlowFragment2, 28)));
    }

    public static C11JS LJJIJIL(BaseI18nLoginFragment baseI18nLoginFragment, final BaseI18nLoginFragment baseI18nLoginFragment2, final String str, final String str2, final String str3) {
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(baseI18nLoginFragment);
        return C1239250iLz.LIZIZ(baseI18nLoginFragment, baseI18nLoginFragment2, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXx
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd = baseI18nLoginFragment2;
                AbstractC850450XXv abstractC850450XXv = new AbstractC850450XXv() { // from class: X.0XXw
                    @Override // X.AbstractC846040XGw
                    public final void LIZ(C0XGA c0xga) {
                        if (c0xga == null) {
                            ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", EnumC852660Xce.SIGN_UP, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        } else if (c0xga.LIZLLL != 0) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.SIGN_UP, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        } else {
                            C848060XOq.LIZ(true);
                            ((C11KY) c11ky).onSuccess(c0xga);
                        }
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                String str4 = str2;
                c0xz4.getClass();
                C0XZ4.LJJIJLIJ(str4, linkedHashMap);
                String str5 = str3;
                if (str5 != null) {
                    linkedHashMap.put("passport_ticket", str5);
                }
                baseI18nLoginFragment2.gk(abstractC850450XXv);
                baseI18nLoginFragment2.m8().LJIIIZ(str, linkedHashMap, abstractC850450XXv);
            }
        }).LJIIIIZZ(new AfS40S1200000_13(baseI18nLoginFragment2, setPasswordMobHelper, str, 2)).LJII(new AfS40S1200000_13(baseI18nLoginFragment2, setPasswordMobHelper, str, 3)));
    }

    public static C11JS LJJIL(BaseAccountFlowFragment baseAccountFlowFragment, final C0XYD c0xyd, final String str, final int i, final Map map) {
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(LJJI(i));
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        return C1239250iLz.LIZIZ(baseAccountFlowFragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYA
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd2 = c0xyd;
                C0XY8 c0xy8 = new C0XY8() { // from class: X.0XY9
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        ((C11KY) c11ky).onSuccess(c0xga);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i2) {
                        String str2;
                        C0XWW<C850410XXr> c0xww = c11ky;
                        if (c0xga != null) {
                            str2 = c0xga.LJFF;
                        } else {
                            str2 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str2, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map2 = map;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                c0xyd.gk(c0xy8);
                c0xyd.m8().LJI(str, i, 0, null, linkedHashMap, c0xy8);
            }
        }).LJIIIIZZ(new AfS81S0101000_13(i, c0xyd, 1)).LJII(new AfS81S0101000_13(i, c0xyd, 2)));
    }

    public static AbstractC19483511Kn LJIIJ(final BaseAccountFlowFragment baseAccountFlowFragment, final BaseAccountFlowFragment baseAccountFlowFragment2, final String str, final String str2, boolean z, final String str3) {
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(baseAccountFlowFragment);
        if (z) {
            final String str4 = null;
            return C1239250iLz.LIZIZ(baseAccountFlowFragment, baseAccountFlowFragment2, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XX1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.0XGw, X.0XWz] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    Boolean bool = Boolean.TRUE;
                    BaseAccountFlowFragment mobParams = baseAccountFlowFragment2.getMobParams();
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIJ(bool, "email", mobParams, false, null);
                    final C0XYD c0xyd = baseAccountFlowFragment2;
                    final Fragment fragment = baseAccountFlowFragment;
                    final String str5 = str2;
                    final String str6 = str;
                    ?? r6 = new C0XX0() { // from class: X.0XWz
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.SIGN_UP, c0xyd.LLJJLIIIJLLLLLLLZ(), null, c0xga.LJFF));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C849560XUk> c0xt7) {
                            T t = c0xt7.LJIIIZ;
                            if (t != 0 && ((C849560XUk) t).LJIIJ != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", EnumC852660Xce.SIGN_UP, EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL, null, ""));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C849560XUk> c0xt7, int i) throws JSONException {
                            String string;
                            int i2;
                            String str7;
                            String str8 = null;
                            if (c0xt7 == null || (string = c0xt7.LJFF) == null || string.length() == 0) {
                                string = fragment.getString(2131834217);
                            }
                            C0XWW<C0XT7<C849560XUk>> c0xww = c11ky;
                            if (c0xt7 != null) {
                                i2 = c0xt7.LIZLLL;
                            } else {
                                i2 = -10000;
                            }
                            if (string == null) {
                                string = "";
                            }
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            C0XZ4.LIZ.getClass();
                            JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                            if (jSONObjectLJIIJJI == null) {
                                jSONObjectLJIIJJI = new JSONObject();
                            }
                            JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("password", str5).put("email", str6);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            if (c0xt7 != null) {
                                str7 = c0xt7.LJFF;
                            } else {
                                str7 = null;
                            }
                            sbLIZ.append(str7);
                            sbLIZ.append('|');
                            if (c0xt7 != null) {
                                str8 = c0xt7.LJI;
                            }
                            sbLIZ.append(str8);
                            ((C11KY) c0xww).onError(new C0XZJ(i2, string, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObjectPut, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    };
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    String str7 = str4;
                    c0xz4.getClass();
                    C0XZ4.LJJIJLIJ(str7, linkedHashMap);
                    linkedHashMap.putAll(C0XZ4.LJIIL());
                    if (C0XX7.LIZ()) {
                        Pair[] pairArr = new Pair[1];
                        String strLIZIZ = C0XX7.LIZ;
                        if (strLIZIZ == null) {
                            strLIZIZ = C2222691Bz1.LIZIZ();
                        }
                        pairArr[0] = new Pair("carrier_region", strLIZIZ);
                        linkedHashMap.putAll(C2097608Jq.LJI(pairArr));
                    }
                    baseAccountFlowFragment2.gk(r6);
                    baseAccountFlowFragment2.Fb().LIZJ(str, str2, linkedHashMap, r6);
                }
            }).LJIIIIZZ(new AfS36S1300000_13(baseAccountFlowFragment, setPasswordMobHelper, baseAccountFlowFragment2, str2, 1)).LJII(new AfS40S1200000_13(baseAccountFlowFragment2, setPasswordMobHelper, str2, 1)));
        }
        if (!z) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XX1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.0XGw, X.0XWz] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    Boolean bool = Boolean.TRUE;
                    BaseAccountFlowFragment mobParams = baseAccountFlowFragment2.getMobParams();
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIJ(bool, "email", mobParams, false, null);
                    final C0XYD c0xyd = baseAccountFlowFragment2;
                    final Fragment fragment = baseAccountFlowFragment;
                    final String str5 = str2;
                    final String str6 = str;
                    ?? r6 = new C0XX0() { // from class: X.0XWz
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.SIGN_UP, c0xyd.LLJJLIIIJLLLLLLLZ(), null, c0xga.LJFF));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C849560XUk> c0xt7) {
                            T t = c0xt7.LJIIIZ;
                            if (t != 0 && ((C849560XUk) t).LJIIJ != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", EnumC852660Xce.SIGN_UP, EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL, null, ""));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C849560XUk> c0xt7, int i) throws JSONException {
                            String string;
                            int i2;
                            String str7;
                            String str8 = null;
                            if (c0xt7 == null || (string = c0xt7.LJFF) == null || string.length() == 0) {
                                string = fragment.getString(2131834217);
                            }
                            C0XWW<C0XT7<C849560XUk>> c0xww = c11ky;
                            if (c0xt7 != null) {
                                i2 = c0xt7.LIZLLL;
                            } else {
                                i2 = -10000;
                            }
                            if (string == null) {
                                string = "";
                            }
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            C0XZ4.LIZ.getClass();
                            JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                            if (jSONObjectLJIIJJI == null) {
                                jSONObjectLJIIJJI = new JSONObject();
                            }
                            JSONObject jSONObjectPut = jSONObjectLJIIJJI.put("password", str5).put("email", str6);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            if (c0xt7 != null) {
                                str7 = c0xt7.LJFF;
                            } else {
                                str7 = null;
                            }
                            sbLIZ.append(str7);
                            sbLIZ.append('|');
                            if (c0xt7 != null) {
                                str8 = c0xt7.LJI;
                            }
                            sbLIZ.append(str8);
                            ((C11KY) c0xww).onError(new C0XZJ(i2, string, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObjectPut, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    };
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    String str7 = str3;
                    c0xz4.getClass();
                    C0XZ4.LJJIJLIJ(str7, linkedHashMap);
                    linkedHashMap.putAll(C0XZ4.LJIIL());
                    if (C0XX7.LIZ()) {
                        Pair[] pairArr = new Pair[1];
                        String strLIZIZ = C0XX7.LIZ;
                        if (strLIZIZ == null) {
                            strLIZIZ = C2222691Bz1.LIZIZ();
                        }
                        pairArr[0] = new Pair("carrier_region", strLIZIZ);
                        linkedHashMap.putAll(C2097608Jq.LJI(pairArr));
                    }
                    baseAccountFlowFragment2.gk(r6);
                    baseAccountFlowFragment2.Fb().LIZJ(str, str2, linkedHashMap, r6);
                }
            });
        }
        throw new C1954807lC();
    }

    public static AbstractC19483511Kn LJIJI(final Fragment fragment, final C0XYD c0xyd, final String str, final String str2, final EnumC852910Xd3 enumC852910Xd3, boolean z) {
        String str3;
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.getBoolean("is_gsma")) {
            str3 = "gsma";
        } else {
            str3 = "sms_verification";
        }
        if (z) {
            return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXb
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XXa] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                    final Fragment fragment2 = fragment;
                    ?? r4 = new AbstractC850380XXo() { // from class: X.0XXa
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            int i = c0xga.LIZLLL;
                            String str4 = c0xga.LJFF;
                            ((C11KY) c0xww).onError(new C0XZJ(i, str4, EnumC852660Xce.SIGN_UP, enumC852910Xd32, null, str4));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C850350XXl> c0xt7) {
                            T t = c0xt7.LJIIIZ;
                            if (t != 0 && ((C850350XXl) t).LJIIIIZZ != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            C0XYG c0xyg = C0XZJ.Companion;
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                            c0xyg.getClass();
                            ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660Xce, enumC852910Xd33));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C850350XXl> c0xt7, int i) {
                            String string;
                            String str4;
                            String str5 = null;
                            if (c0xt7 == null || (string = c0xt7.LJFF) == null || string.length() == 0) {
                                string = fragment2.getString(2131834217);
                            }
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                            C0XZ4.LIZ.getClass();
                            JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            if (c0xt7 != null) {
                                str4 = c0xt7.LJFF;
                            } else {
                                str4 = null;
                            }
                            sbLIZ.append(str4);
                            sbLIZ.append('|');
                            if (c0xt7 != null) {
                                str5 = c0xt7.LJI;
                            }
                            sbLIZ.append(str5);
                            ((C11KY) c0xww).onError(new C0XZJ(i, string, enumC852660Xce, enumC852910Xd33, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    };
                    c0xyd.gk(r4);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0XZ4.LIZ.getClass();
                    linkedHashMap.putAll(C0XZ4.LJIIL());
                    if (C0XX7.LIZ()) {
                        Pair[] pairArr = new Pair[1];
                        String strLIZIZ = C0XX7.LIZ;
                        if (strLIZIZ == null) {
                            strLIZIZ = C2222691Bz1.LIZIZ();
                        }
                        pairArr[0] = new Pair("carrier_region", strLIZIZ);
                        linkedHashMap.putAll(C2097608Jq.LJI(pairArr));
                    }
                    c0xyd.m8().LIZLLL(str, str2, linkedHashMap, r4);
                }
            }).LJII(new AfS46S1100000_13(c0xyd, str3, 1)).LJIIIIZZ(new AfS40S1200000_13(fragment, c0xyd, str3, 0)));
        }
        if (!z) {
            return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXb
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XXa] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                    final Fragment fragment2 = fragment;
                    ?? r4 = new AbstractC850380XXo() { // from class: X.0XXa
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            int i = c0xga.LIZLLL;
                            String str4 = c0xga.LJFF;
                            ((C11KY) c0xww).onError(new C0XZJ(i, str4, EnumC852660Xce.SIGN_UP, enumC852910Xd32, null, str4));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C850350XXl> c0xt7) {
                            T t = c0xt7.LJIIIZ;
                            if (t != 0 && ((C850350XXl) t).LJIIIIZZ != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            C0XYG c0xyg = C0XZJ.Companion;
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                            c0xyg.getClass();
                            ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660Xce, enumC852910Xd33));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C850350XXl> c0xt7, int i) {
                            String string;
                            String str4;
                            String str5 = null;
                            if (c0xt7 == null || (string = c0xt7.LJFF) == null || string.length() == 0) {
                                string = fragment2.getString(2131834217);
                            }
                            C0XWW<C0XT7<C850350XXl>> c0xww = c11ky;
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                            EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                            C0XZ4.LIZ.getClass();
                            JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            if (c0xt7 != null) {
                                str4 = c0xt7.LJFF;
                            } else {
                                str4 = null;
                            }
                            sbLIZ.append(str4);
                            sbLIZ.append('|');
                            if (c0xt7 != null) {
                                str5 = c0xt7.LJI;
                            }
                            sbLIZ.append(str5);
                            ((C11KY) c0xww).onError(new C0XZJ(i, string, enumC852660Xce, enumC852910Xd33, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    };
                    c0xyd.gk(r4);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0XZ4.LIZ.getClass();
                    linkedHashMap.putAll(C0XZ4.LJIIL());
                    if (C0XX7.LIZ()) {
                        Pair[] pairArr = new Pair[1];
                        String strLIZIZ = C0XX7.LIZ;
                        if (strLIZIZ == null) {
                            strLIZIZ = C2222691Bz1.LIZIZ();
                        }
                        pairArr[0] = new Pair("carrier_region", strLIZIZ);
                        linkedHashMap.putAll(C2097608Jq.LJI(pairArr));
                    }
                    c0xyd.m8().LIZLLL(str, str2, linkedHashMap, r4);
                }
            });
        }
        throw new C1954807lC();
    }

    public static C11JS LJIL(Fragment fragment, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final C0XYD c0xyd, final String str, final Map map) {
        final int iLJJIFFI = LJJIFFI(enumC852910Xd3, false);
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(LJJII(enumC852910Xd3));
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYB
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                C0XY8 c0xy8 = new C0XY8() { // from class: X.0XYC
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        ((C11KY) c11ky).onSuccess(c0xga);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }
                };
                c0xyd.gk(c0xy8);
                c0xyd.m8().LJI(str, iLJJIFFI, 1, "", map, c0xy8);
            }
        }).LJIIIIZZ(new AfS108S0300000_13(enumC852910Xd3, fragment, c0xyd, 1)).LJII(new AfS149S0200000_13(enumC852910Xd3, c0xyd, 5)));
    }

    public static C11JS LJI(Fragment fragment, final C0XYD c0xyd, final String str, final String str2, final int i, final Map map, Function1 function1) {
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(LJJI(i));
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.0XGw, X.0XWQ] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd2 = c0xyd;
                ?? r5 = new AbstractC849640XUs() { // from class: X.0XWQ
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        ((C11KY) c11ky).onSuccess(c0xga);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i2) {
                        String str3;
                        C0XWW<C849600XUo> c0xww = c11ky;
                        if (c0xga != null) {
                            str3 = c0xga.LJFF;
                        } else {
                            str3 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str3, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                c0xyd.gk(r5);
                c0xyd.m8().LJIIIIZZ(str, str2, i, map, r5);
            }
        }).LJIIIIZZ(new AfS81S0101000_13(i, c0xyd, 4)).LJII(new AfS65S0201000_13(function1, c0xyd, i, 0)));
    }

    public static C11JS LJIIIZ(final Fragment fragment, final C0XYD c0xyd, final String str, final String str2, String str3, String str4, final Map map) {
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWb
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                Boolean bool = Boolean.FALSE;
                BaseAccountFlowFragment mobParams = c0xyd.getMobParams();
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("send_type", "code_and_link"));
                c852170Xbr.getClass();
                C852170Xbr.LJIIJ(bool, "email", mobParams, false, mapLIZJ);
                final C0XYD c0xyd2 = c0xyd;
                AbstractC849290XTj abstractC849290XTj = new AbstractC849290XTj() { // from class: X.0XWa
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        C0XT7 c0xt7 = (C0XT7) c0xga;
                        C0XWW<C0XT7<C849260XTg>> c0xww = c11ky;
                        int i = c0xt7.LIZLLL;
                        String str5 = c0xt7.LJFF;
                        EnumC852660Xce enumC852660XceScene = c0xyd2.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd2.LLJJLIIIJLLLLLLLZ();
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c0xww).onError(new C0XZJ(i, str5, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, C0XZ4.LJIIJJI(c0xt7), ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C849260XTg> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C849260XTg> c0xt7, int i) {
                        String str5;
                        C0XWW<C0XT7<C849260XTg>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str5 = c0xt7.LJFF;
                        } else {
                            str5 = null;
                        }
                        EnumC852660Xce enumC852660XceScene = c0xyd2.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd2.LLJJLIIIJLLLLLLLZ();
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c0xww).onError(new C0XZJ(i, str5, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, C0XZ4.LJIIJJI(c0xt7), ""));
                    }
                };
                c0xyd.gk(abstractC849290XTj);
                C849270XTh.LIZ(fragment.requireContext(), str, str2, map, abstractC849290XTj).LJIIIZ();
            }
        }).LJIIIIZZ(new AfS9S2200000_13(fragment, c0xyd, str4, str3, 2)).LJII(new AfS9S2200000_13(fragment, c0xyd, str4, str3, 3)));
    }

    public static C11JS LJJIIJ(Fragment fragment, final C0XYD c0xyd, final String str, final EnumC852910Xd3 enumC852910Xd3, String str2, final Map map, final Function1 function1) {
        final int iLJJIFFI = LJJIFFI(enumC852910Xd3, false);
        try {
            C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(str, null);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz(String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()), String.valueOf(c2218561BsMLJIIZILJ.getCountryCode()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz("", "");
        }
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXE
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XWi] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                final Function1<C0XZJ, Unit> function12 = function1;
                ?? r4 = new C0XXH() { // from class: X.0XWi
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.LOGIN, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850300XXg> c0xt7) {
                        HashMap map2 = new HashMap();
                        map2.put("event", "on send code success");
                        C836920WsM.LIZ.LIZIZ(map2.toString());
                        if (c0xt7 != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJ(X.C0XT7<X.C850300XXg> r12, int r13) {
                        /*
                            r11 = this;
                            r6 = 0
                            if (r12 == 0) goto L6d
                            int r0 = r12.LIZLLL
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        L9:
                            java.lang.String r5 = ""
                            if (r0 != 0) goto L64
                            r4 = r5
                            if (r12 != 0) goto L6a
                            r3 = r6
                        L11:
                            java.util.HashMap r2 = new java.util.HashMap
                            r2.<init>()
                            java.lang.String r1 = "event"
                            java.lang.String r0 = "on send code error"
                            r2.put(r1, r0)
                            if (r4 != 0) goto L20
                            r4 = r5
                        L20:
                            java.lang.String r0 = "errorCode"
                            r2.put(r0, r4)
                            if (r3 == 0) goto L28
                            r5 = r3
                        L28:
                            java.lang.String r0 = "errorMsg"
                            r2.put(r0, r5)
                            X.0WsM r1 = X.C836920WsM.LIZ
                            java.lang.String r0 = r2.toString()
                            r1.LIZIZ(r0)
                            X.0XZJ r4 = new X.0XZJ
                            if (r12 == 0) goto L61
                            int r5 = r12.LIZLLL
                        L3c:
                            if (r12 == 0) goto L40
                            java.lang.String r6 = r12.LJFF
                        L40:
                            X.0Xce r7 = X.EnumC852660Xce.LOGIN
                            X.0Xd3 r8 = r1
                            X.0XZ4 r0 = X.C0XZ4.LIZ
                            r0.getClass()
                            org.json.JSONObject r9 = X.C0XZ4.LJIIJJI(r12)
                            java.lang.String r10 = ""
                            r4.<init>(r5, r6, r7, r8, r9, r10)
                            X.0XWW<X.0XT7<X.0XXg>> r0 = r2
                            X.11KY r0 = (X.C11KY) r0
                            r0.onError(r4)
                            kotlin.jvm.functions.Function1<X.0XZJ, kotlin.Unit> r0 = r3
                            if (r0 == 0) goto L60
                            r0.invoke(r4)
                        L60:
                            return
                        L61:
                            r5 = -10000(0xffffffffffffd8f0, float:NaN)
                            goto L3c
                        L64:
                            int r0 = r12.LIZLLL
                            java.lang.String r4 = java.lang.String.valueOf(r0)
                        L6a:
                            java.lang.String r3 = r12.LJFF
                            goto L11
                        L6d:
                            r0 = r6
                            goto L9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C850060XWi.LJ(X.0XT7, int):void");
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is6Digits", "1");
                Map<String, String> map2 = map;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                c0xyd.gk(r4);
                c0xyd.m8().LIZIZ(str, iLJJIFFI, linkedHashMap, r4);
            }
        }).LJIIIIZZ(new AfS0S2201000_13(c0xyd, enumC852910Xd3, str2, iLJJIFFI, str, 0)).LJII(new AfS0S2201000_13(c0xyd, enumC852910Xd3, str2, iLJJIFFI, str, 1)));
    }

    public static C11JS LJJIJ(C0XZ4 c0xz4, final Fragment fragment, final C0XYD c0xyd, final String str, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, String str2) {
        final String str3 = "";
        c0xz4.getClass();
        ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz("", "");
        final int iLJIILJJIL = LJIILJJIL(enumC852660Xce);
        final int iLJJIFFI = LJJIFFI(enumC852910Xd3, false);
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXW
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0XWl] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                int i;
                List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                if (C0WWA.LIZ(C0XPY.LIZIZ) == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                ?? r3 = new C0XXH() { // from class: X.0XWl
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850300XXg> c0xt7) {
                        if (c0xt7 != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850300XXg> c0xt7, int i2) throws JSONException {
                        String str4;
                        String str5;
                        T t;
                        JSONObject jSONObject;
                        JSONObject jSONObjectOptJSONObject;
                        C850300XXg c850300XXg;
                        JSONObject jSONObject2 = new JSONObject();
                        if (c0xt7 == null || (c850300XXg = (C850300XXg) c0xt7.LJIIIZ) == null || (str4 = c850300XXg.LJIIIIZZ) == null) {
                            str4 = "";
                        }
                        jSONObject2.put("next_url", str4);
                        if (i2 == 2030) {
                            if (c0xt7 != null && (t = c0xt7.LJIIIZ) != 0 && (jSONObject = t.LJ) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                                jSONObject2.put("data", jSONObjectOptJSONObject);
                            }
                            jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                        } else if (i2 == 1206) {
                            List<InterfaceC586170Myt> list2 = C0XQ5.LIZ;
                            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
                            c1233040iBy.LIZIZ(2131829362);
                            c1233040iBy.LIZLLL();
                        }
                        C0XWW<C0XT7<C850300XXg>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str5 = c0xt7.LJFF;
                        } else {
                            str5 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str5, enumC852660Xce2, enumC852910Xd32, jSONObject2, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is6Digits", "1");
                c0xyd.gk(r3);
                Context context = fragment.getContext();
                if (context != null) {
                    String str4 = str;
                    C850300XXg c850300XXg = new C850300XXg(iLJJIFFI, iLJIILJJIL, i, str3);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(linkedHashMap);
                    Map map = c850300XXg.LJIILL;
                    if ((map instanceof Map) && map != null) {
                        linkedHashMap2.putAll(map);
                    }
                    C846070XGz c846070XGz = new C846070XGz();
                    HashMap map2 = new HashMap();
                    if (!TextUtils.isEmpty(c850300XXg.LJI)) {
                        map2.put("mobile", C2093608Ic.LIZIZ(c850300XXg.LJI));
                    }
                    if (!TextUtils.isEmpty(c850300XXg.LJIIJ)) {
                        map2.put("old_mobile", C2093608Ic.LIZIZ(c850300XXg.LJIIJ));
                    }
                    if (!TextUtils.isEmpty(c850300XXg.LJII)) {
                        map2.put("captcha", c850300XXg.LJII);
                    }
                    map2.put("type", C2093608Ic.LIZIZ(String.valueOf(c850300XXg.LJIIIZ)));
                    map2.put("unbind_exist", C2093608Ic.LIZIZ(String.valueOf(0)));
                    map2.put("mix_mode", "1");
                    int i2 = c850300XXg.LJIILLIIL;
                    if (i2 == 1) {
                        map2.put("check_register", "1");
                    } else if (i2 == 0) {
                        map2.put("check_register", CardStruct.IStatusCode.DEFAULT);
                    }
                    map2.put("is6Digits", "1");
                    if (!TextUtils.isEmpty(c850300XXg.LJIIJJI)) {
                        map2.put("ticket", c850300XXg.LJIIJJI);
                    }
                    map2.put("auto_read", String.valueOf(c850300XXg.LJIIL));
                    if (!TextUtils.isEmpty(c850300XXg.LJIILIIL)) {
                        map2.put("shark_ticket", c850300XXg.LJIILIIL);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        map2.put("auth_token", null);
                    }
                    if (!TextUtils.isEmpty(c850300XXg.LJIILJJIL)) {
                        map2.put("unusable_mobile_ticket", c850300XXg.LJIILJJIL);
                    }
                    if (str4 != null) {
                        map2.put("not_login_ticket", str4);
                    }
                    c846070XGz.LJ(map2, linkedHashMap2);
                    c846070XGz.LIZ = C0XH1.LIZ("/passport/mobile/send_code/v1/");
                    new AbstractC845940XGm<C0XT7<C850300XXg>>(context, c846070XGz.LJFF(), c850300XXg, r3) { // from class: X.0XXM
                        public static final /* synthetic */ int LJIIIZ = 0;
                        public final C850300XXg LJIIIIZZ;

                        @Override // X.AbstractC845940XGm
                        public final void LJ(C0XGA c0xga) {
                            C0XG9.LIZIZ("passport_mobile_sendcode", "mobile", this.LIZJ.LIZ("type"), c0xga, null);
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                            C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                            C850300XXg c850300XXg2 = this.LJIIIIZZ;
                            if (c850300XXg2 != null) {
                                c850300XXg2.LJ = jSONObject2;
                            }
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                            if (this.LJIIIIZZ != null) {
                                jSONObject2.optInt("retry_time", 30);
                            }
                            C850300XXg c850300XXg2 = this.LJIIIIZZ;
                            if (c850300XXg2 != null) {
                                c850300XXg2.LJ = jSONObject;
                            }
                        }

                        @Override // X.AbstractC845940XGm
                        public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
                            return new C0XT7(z, 1002, this.LJIIIIZZ);
                        }

                        {
                            this.LJIIIIZZ = c850300XXg;
                        }
                    }.LJIIIZ();
                }
            }
        }).LJII(new AfS12S1201000_13(iLJJIFFI, enumC852910Xd3, c0xyd, str2, 0)).LJIIIIZZ(new AfS12S1201000_13(iLJJIFFI, enumC852910Xd3, c0xyd, str2, 1)));
    }

    public final C11JS LJJJ(Fragment fragment, C0XYD c0xyd, String str, int i, Map map, String str2, String str3) {
        String strLJJLIIIJJI = c0xyd.getMobParams().LJJLIIIJJI();
        String strLLIIJI = c0xyd.getMobParams().LLIIJI();
        C852810Xct.LIZ.getClass();
        return C1239250iLz.LIZIZ(fragment, c0xyd, LJIIZILJ(this, strLJJLIIIJJI, strLLIIJI, C852810Xct.LJFF(fragment), c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), str, i, map, str2, str3, fragment, c0xyd, false, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
    }

    public static C11JS LIZ(final Fragment fragment, final C0XYD c0xyd, final String str, final String str2, final boolean z, final String str3, final String str4, final Map map) {
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYa
            /* JADX WARN: Type inference failed for: r9v0, types: [X.0XGw, X.0XYW] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                String str5;
                C851430Xaf.LJFF(c0xyd.getMobParams().LJJLIIIJJI(), "email", null, c0xyd.getMobParams().LLIIJI(), null);
                final C0XYD c0xyd2 = c0xyd;
                final Fragment fragment2 = fragment;
                final String str6 = str4;
                final String str7 = str3;
                ?? r9 = new C0XYX() { // from class: X.0XYW
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850510XYb> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                        C852170Xbr.LJIILL(C852170Xbr.LIZ, fragment2.getArguments(), 0, c0xyd2.getMobParams().LJJLIIIJJI(), c0xyd2.getMobParams().LLIIJI(), str6, c0xyd2.getMobParams().RR(), null, null, str7, false, 704);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850510XYb> c0xt7, int i) {
                        int i2;
                        String str8;
                        int i3;
                        C0XWW<C0XT7<C850510XYb>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            i2 = c0xt7.LIZLLL;
                        } else {
                            i2 = -10000;
                        }
                        if (c0xt7 != null) {
                            str8 = c0xt7.LJFF;
                        } else {
                            str8 = null;
                        }
                        EnumC852660Xce enumC852660XceScene = c0xyd2.scene();
                        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd2.LLJJLIIIJLLLLLLLZ();
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str8, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, C0XZ4.LJIIJJI(c0xt7), ""));
                        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                        Bundle arguments = fragment2.getArguments();
                        if (c0xt7 != null) {
                            i3 = c0xt7.LIZLLL;
                        } else {
                            i3 = 0;
                        }
                        C852170Xbr.LJIILL(c852170Xbr, arguments, i3, c0xyd2.getMobParams().LJJLIIIJJI(), c0xyd2.getMobParams().LLIIJI(), str6, c0xyd2.getMobParams().RR(), null, null, str7, false, 704);
                    }
                };
                c0xyd.gk(r9);
                Context contextRequireContext = fragment.requireContext();
                String str8 = str;
                String str9 = str2;
                boolean z2 = z;
                int iLIZ = C0XZL.LIZ(c0xyd);
                Map<String, String> map2 = map;
                C850510XYb c850510XYb = new C850510XYb(str8, str9);
                C846070XGz c846070XGz = new C846070XGz();
                if (z2) {
                    str5 = "/passport/email/bind_with_change_password/";
                } else {
                    str5 = "/passport/email/bind/";
                }
                c846070XGz.LIZ = str5;
                HashMap map3 = new HashMap();
                String strLIZIZ = C2093608Ic.LIZIZ(c850510XYb.LJI);
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                map3.put("email", strLIZIZ);
                map3.put("code", C2093608Ic.LIZIZ(c850510XYb.LJII));
                map3.put("mix_mode", "1");
                c846070XGz.LIZLLL(map3);
                c846070XGz.LIZJ("email_source", String.valueOf(iLIZ));
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        c846070XGz.LIZJ(entry.getKey(), entry.getValue());
                    }
                }
                new AbstractC845940XGm<C0XT7<C850510XYb>>(contextRequireContext, c846070XGz.LJFF(), c850510XYb, r9) { // from class: X.0XYY
                    public static final /* synthetic */ int LJIIIZ = 0;
                    public final C850510XYb LJIIIIZZ;

                    @Override // X.AbstractC845940XGm
                    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ.LJ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ.LJ = jSONObject;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z3, C845980XGq c845980XGq) {
                        C850510XYb c850510XYb2 = this.LJIIIIZZ;
                        c850510XYb2.LIZ = c845980XGq.LIZIZ;
                        c850510XYb2.LIZJ = c845980XGq.LIZJ;
                        return new C0XT7(z3, 1009, c850510XYb2);
                    }

                    {
                        this.LJIIIIZZ = c850510XYb;
                    }
                }.LJIIIZ();
            }
        }).LJIIIIZZ(new AfS182S0100000_13(c0xyd, 22)).LJII(new AfS182S0100000_13(c0xyd, 24)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11JS LJIJ(X.C0XZ4 r17, final androidx.fragment.app.Fragment r18, final X.C0XYD r19, final java.lang.String r20, final java.lang.String r21, final java.lang.String r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XZ4.LJIJ(X.0XZ4, androidx.fragment.app.Fragment, X.0XYD, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.11JS");
    }

    public static C11JS LJJIIZ(Fragment fragment, final C0XYD c0xyd, final String str, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str2, final String str3, final Map map) {
        final String string;
        final String string2;
        final String strLJJLIIIJJI = c0xyd.getMobParams().LJJLIIIJJI();
        final String strLLIIJI = c0xyd.getMobParams().LLIIJI();
        final String strPR = c0xyd.getMobParams().PR();
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("page");
        } else {
            string = null;
        }
        Bundle arguments2 = fragment.getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("gsma_fail_reason");
        } else {
            string2 = null;
        }
        try {
            try {
                C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(str, null);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz(String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()), String.valueOf(c2218561BsMLJIIZILJ.getCountryCode()));
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz("", "");
            }
        } catch (Exception e2) {
            e = e2;
        }
        final int iLJIILJJIL = LJIILJJIL(enumC852660Xce);
        final int iLJJIFFI = LJJIFFI(enumC852910Xd3, false);
        C11KZ c11kzLJ = AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXG
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                int i;
                List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                if (C0WWA.LIZ(C0XPY.LIZIZ) == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                C0XXH c0xxh = new C0XXH() { // from class: X.0XWk
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850300XXg> c0xt7) {
                        if (c0xt7 != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850300XXg> c0xt7, int i2) throws JSONException {
                        String str4;
                        String str5;
                        C850300XXg c850300XXg;
                        JSONObject jSONObject = new JSONObject();
                        if (c0xt7 == null || (c850300XXg = (C850300XXg) c0xt7.LJIIIZ) == null || (str4 = c850300XXg.LJIIIIZZ) == null) {
                            str4 = "";
                        }
                        jSONObject.put("next_url", str4);
                        if (c0xt7 != null) {
                            str5 = c0xt7.LJFF;
                        } else {
                            str5 = null;
                        }
                        ((C11KY) c11ky).onError(new C0XZJ(i2, str5, enumC852660Xce2, enumC852910Xd32, jSONObject, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is6Digits", "1");
                Map<String, String> map2 = map;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                C0XYD c0xyd2 = c0xyd;
                if (c0xyd2 != null) {
                    c0xyd2.gk(c0xxh);
                }
                ((C0XXU) C0XXU.LJIILL()).LJIILLIIL(str, iLJJIFFI, str2, iLJIILJJIL, i, null, null, linkedHashMap, c0xxh);
            }
        });
        final String str4 = string;
        final String str5 = string2;
        return C1239250iLz.LIZIZ(fragment, c0xyd, c11kzLJ.LJII(new C09JN() { // from class: X.0XaL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NetworkHelper@8b8f.getSendSmsCodeMaybe$2");
                C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
                EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                if (enumC852910Xd32 == EnumC852910Xd3.INPUT_PHONE_SIGN_UP) {
                    C851350XaX.LIZ(Integer.valueOf(c0xzj.getErrorCode()), strLJJLIIIJJI, strLLIIJI, strPR, null, 48);
                } else if (enumC852910Xd32 == EnumC852910Xd3.INPUT_PHONE_LOGIN) {
                    C853660XeG c853660XeG = C853660XeG.LIZ;
                    String str6 = strLLIIJI;
                    int errorCode = c0xzj.getErrorCode();
                    String str7 = strLJJLIIIJJI;
                    c853660XeG.getClass();
                    C853660XeG.LIZLLL(false, str6, "sms_verification", errorCode, str7, null, null, null, null, null);
                }
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                String str8 = strLJJLIIIJJI;
                String str9 = strLLIIJI;
                String str10 = strPR;
                int errorCode2 = c0xzj.getErrorCode();
                String str11 = str3;
                int i = iLJJIFFI;
                String errorMsg = c0xzj.getErrorMsg();
                String str12 = str;
                String str13 = str4;
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd3;
                c0xz4.getClass();
                C852170Xbr.LJIILJJIL(c852170Xbr, str8, str9, str10, errorCode2, str11, i, "text", errorMsg, str12, null, null, null, str13, C0XZ4.LJJII(enumC852910Xd33), null, null, null, str5, null, null, 1814016);
                C1C7U.LIZIZ("NetworkHelper@8b8f.getSendSmsCodeMaybe$2");
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0XZ6
            @Override // X.C09JN
            public final void accept(Object obj) {
                Bundle arguments3;
                BaseAccountFlowFragment mobParams;
                C1C7U.LIZ("NetworkHelper@8b8f.getSendSmsCodeMaybe$3");
                C0XT7 c0xt7 = (C0XT7) obj;
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                T t = c0xt7.LJIIIZ;
                c852170Xbr.getClass();
                Bundle bundleLJ = C852170Xbr.LJ(t);
                C0XYD c0xyd2 = c0xyd;
                if (c0xyd2 != null && (mobParams = c0xyd2.getMobParams()) != null) {
                    arguments3 = mobParams.getArguments();
                } else {
                    arguments3 = null;
                }
                C852170Xbr.LJIIZILJ(arguments3, bundleLJ);
                String str6 = strLJJLIIIJJI;
                String str7 = strLLIIJI;
                String str8 = strPR;
                String str9 = str3;
                int i = iLJJIFFI;
                String str10 = str;
                String str11 = string;
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                c0xz4.getClass();
                C852170Xbr.LJIILJJIL(c852170Xbr, str6, str7, str8, 0, str9, i, "text", null, str10, null, null, "phone", str11, C0XZ4.LJJII(enumC852910Xd32), null, null, c0xt7.LJIIIZ.LJFF, string2, bundleLJ, null, 1156608);
                C1C7U.LIZIZ("NetworkHelper@8b8f.getSendSmsCodeMaybe$3");
            }
        }));
    }

    public static C11JS LJJIJIIJI(Fragment fragment, final C0XYD c0xyd, final String str, final boolean z, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str2, final Map map) {
        final int iLJJIFFI = LJJIFFI(enumC852910Xd3, false);
        try {
            try {
                C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(str, null);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz(String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()), String.valueOf(c2218561BsMLJIIZILJ.getCountryCode()));
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz("", "");
            }
        } catch (Exception e2) {
            e = e2;
        }
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXK
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XXI] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                String str3;
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("send_reason", String.valueOf(iLJJIFFI));
                c0xgr.LIZLLL("send_method", str2);
                C20684815ws.LJIILLIIL("send_voice_verification_code", c0xgr.LIZ);
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                ?? r4 = new C0XXJ() { // from class: X.0XXI
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850300XXg> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850300XXg> c0xt7, int i) throws JSONException {
                        String str4;
                        String str5;
                        C850300XXg c850300XXg;
                        C0XWW<C0XT7<C850300XXg>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str4 = c0xt7.LJFF;
                        } else {
                            str4 = null;
                        }
                        EnumC852660Xce enumC852660Xce3 = enumC852660Xce2;
                        EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                        JSONObject jSONObject = new JSONObject();
                        if (c0xt7 == null || (c850300XXg = (C850300XXg) c0xt7.LJIIIZ) == null || (str5 = c850300XXg.LJIIIIZZ) == null) {
                            str5 = "";
                        }
                        jSONObject.put("next_url", str5);
                        ((C11KY) c0xww).onError(new C0XZJ(i, str4, enumC852660Xce3, enumC852910Xd33, jSONObject, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is6Digits", "1");
                linkedHashMap.putAll(map);
                c0xyd.gk(r4);
                if (z) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                c0xyd.m8().LIZ(str3, iLJJIFFI, linkedHashMap, r4);
            }
        }).LJII(new AfS0S2201000_13(c0xyd, enumC852910Xd3, str2, iLJJIFFI, str, 3)).LJIIIIZZ(new AfS0S2301000_13(c0xyd, enumC852910Xd3, str2, iLJJIFFI, str, fragment, 1)));
    }

    public static C11JS LJFF(BaseAccountFlowFragment baseAccountFlowFragment, final C0XYD c0xyd, final String str, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str2, final String str3, String str4, Map map) {
        final C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("unusable_mobile_ticket", str4);
        c830490Whz.put("phone_number_source", String.valueOf(C0XZL.LIZIZ(c0xyd)));
        c830490Whz.putAll(map);
        int scene = C0XZ7.ACTIVATION_CHANGE_MOBILE.getScene();
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(scene);
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().RR(), "page");
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        return C1239250iLz.LIZIZ(baseAccountFlowFragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.0XGw, X.0XXe] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                ?? r5 = new AbstractC850370XXn() { // from class: X.0XXe
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850330XXj> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850330XXj> c0xt7, int i) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xt7.LIZLLL, c0xt7.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }
                };
                c0xyd.gk(r5);
                c0xyd.m8().LJIILJJIL(str, str2, str3, c830490Whz, r5);
            }
        }).LJIIIIZZ(new AfS65S0201000_13(c0xyd, baseAccountFlowFragment, scene, 2)).LJII(new AfS81S0101000_13(scene, c0xyd, 3)));
    }

    public static C11JS LJIJJ(Fragment fragment, final C0XYD c0xyd, final String str, final String str2, final boolean z, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final Map map, final Function0 function0) {
        String str3;
        final String str4;
        final int scene = C0XZ7.ACTIVATION_QUICK_LOGIN.getScene();
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(scene);
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().RR(), "page");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        clientSubmitSmsCodeEvent.LJI(str3, "is_register");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().PR(), "login_panel_type");
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.getBoolean("is_gsma")) {
            str4 = "gsma";
        } else {
            str4 = "sms_verification";
        }
        final String str5 = str4;
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XY1
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                Boolean boolValueOf = Boolean.valueOf(z);
                String str6 = str4;
                BaseAccountFlowFragment mobParams = c0xyd.getMobParams();
                c852170Xbr.getClass();
                C852170Xbr.LJIIJ(boolValueOf, str6, mobParams, false, null);
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                C0XY3 c0xy3 = new C0XY3() { // from class: X.0XY0
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        C0XWW<C850340XXk> c0xww = c11ky;
                        int i = c0xga.LIZLLL;
                        String str7 = c0xga.LJFF;
                        ((C11KY) c0xww).onError(new C0XZJ(i, str7, enumC852660Xce2, enumC852910Xd32, null, str7));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850340XXk> c0xt7) {
                        T t = c0xt7.LJIIIZ;
                        if (t != 0 && ((C850340XXk) t).LJIIIZ != null) {
                            ((C11KY) c11ky).onSuccess(t);
                            return;
                        }
                        ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", enumC852660Xce2, enumC852910Xd32, null, "no data"));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850340XXk> c0xt7, int i) {
                        String str7;
                        String str8;
                        C0XWW<C850340XXk> c0xww = c11ky;
                        String str9 = null;
                        if (c0xt7 != null) {
                            str7 = c0xt7.LJFF;
                        } else {
                            str7 = null;
                        }
                        EnumC852660Xce enumC852660Xce3 = enumC852660Xce2;
                        EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                        C0XZ4.LIZ.getClass();
                        JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        if (c0xt7 != null) {
                            str8 = c0xt7.LJFF;
                        } else {
                            str8 = null;
                        }
                        sbLIZ.append(str8);
                        sbLIZ.append('|');
                        if (c0xt7 != null) {
                            str9 = c0xt7.LJI;
                        }
                        sbLIZ.append(str9);
                        ((C11KY) c0xww).onError(new C0XZJ(i, str7, enumC852660Xce3, enumC852910Xd33, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                    }
                };
                c0xyd.gk(c0xy3);
                HashMap map2 = new HashMap();
                Map<String, String> map3 = map;
                if (map3 != null) {
                    map2.putAll(map3);
                }
                if (z) {
                    map2.put("verify_reused_mobile", "true");
                }
                c0xyd.m8().LJII(str, str2, map2, c0xy3);
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0Xac
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str6;
                C1C7U.LIZ("NetworkHelper@8b8f.quickLoginOnly$2");
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                boolean z2 = z;
                String str7 = str4;
                BaseAccountFlowFragment mobParams = c0xyd.getMobParams();
                C0XO3 c0xo3 = ((C850340XXk) obj).LJIIIZ;
                c852170Xbr.getClass();
                C852170Xbr.LJIIL(z2, str7, mobParams, c0xo3, null);
                ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
                clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
                clientSmsVerificationResultEvent.LJIIL(scene);
                clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                if (z) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                clientSmsVerificationResultEvent.LJI(str6, "is_register");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().PR(), "login_panel_type");
                clientSmsVerificationResultEvent.LJI(CardStruct.IStatusCode.DEFAULT, "error_code");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().RR(), "page");
                clientSmsVerificationResultEvent.LJIIIIZZ();
                C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginOnly$2");
            }
        }).LJII(new C09JN() { // from class: X.0Xab
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str6;
                C1C7U.LIZ("NetworkHelper@8b8f.quickLoginOnly$3");
                C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
                clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
                clientSmsVerificationResultEvent.LJIIL(scene);
                clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                if (z) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                clientSmsVerificationResultEvent.LJI(str6, "is_register");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().PR(), "login_panel_type");
                clientSmsVerificationResultEvent.LJI(String.valueOf(c0xzj.getErrorCode()), "error_code");
                clientSmsVerificationResultEvent.LJI(c0xyd.getMobParams().RR(), "page");
                clientSmsVerificationResultEvent.LJIIIIZZ();
                if ((!z || c0xzj.getErrorCode() != 1011) && c0xzj.getErrorCode() != 8038) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    boolean z2 = z;
                    int errorCode = c0xzj.getErrorCode();
                    String str7 = str5;
                    BaseAccountFlowFragment mobParams = c0xyd.getMobParams();
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIIIZZ(z2, errorCode, str7, mobParams, null);
                }
                C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginOnly$3");
            }
        }));
    }

    public final C11JS LJ(Fragment fragment, C0XYD c0xyd, String str, String str2, String str3, boolean z, Map map, String str4, String str5) {
        Context contextRequireContext = fragment.requireContext();
        String strLJJLIIIJJI = c0xyd.getMobParams().LJJLIIIJJI();
        String strLLIIJI = c0xyd.getMobParams().LLIIJI();
        C852810Xct.LIZ.getClass();
        return C1239250iLz.LIZIZ(fragment, c0xyd, LJIILIIL(this, contextRequireContext, str, str2, str3, strLJJLIIIJJI, strLLIIJI, C852810Xct.LJFF(fragment), c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), z, C0XZL.LIZ(c0xyd), map, str4, str5, fragment, c0xyd, false, 65536));
    }

    public static C11JS LIZJ(final Fragment fragment, final C0XYD c0xyd, final String str, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str2, final boolean z, final String str3, String str4, final Map map) {
        String string;
        Bundle arguments = c0xyd.getMobParams().getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_position");
        } else {
            string = null;
        }
        ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LJJLIIIJJI(), "enter_from");
        clientSubmitSmsCodeEvent.LJI(c0xyd.getMobParams().LLIIJI(), "enter_method");
        clientSubmitSmsCodeEvent.LJIIJJI(LJJII(enumC852910Xd3));
        C852810Xct.LIZ.getClass();
        clientSubmitSmsCodeEvent.LJI(C852810Xct.LIZ(fragment), "3p_platform");
        clientSubmitSmsCodeEvent.LJI(C852810Xct.LIZJ(fragment), "config_key");
        clientSubmitSmsCodeEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSubmitSmsCodeEvent.LJI(str4, "page");
        clientSubmitSmsCodeEvent.LJI(string, "enter_position");
        clientSubmitSmsCodeEvent.LJIIIIZZ();
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XZC
            /* JADX WARN: Type inference failed for: r7v0, types: [X.0XGw, X.0XZF] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                C851430Xaf.LJFF(c0xyd.getMobParams().LJJLIIIJJI(), "mobile", c0xyd.Qm(), c0xyd.getMobParams().LLIIJI(), str3);
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                final ?? r7 = new C0XZH() { // from class: X.0XZF
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C0XZG> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C0XZG> c0xt7, int i) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xt7.LIZLLL, c0xt7.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }
                };
                c0xyd.gk(r7);
                if (z) {
                    final Context contextRequireContext = fragment.requireContext();
                    String str5 = str;
                    String str6 = str2;
                    int iLIZIZ = C0XZL.LIZIZ(c0xyd);
                    final C0XZG c0xzg = new C0XZG(str5, str6, "", "");
                    C846070XGz c846070XGz = new C846070XGz();
                    c846070XGz.LIZ = "/passport/mobile/bind_with_change_password/";
                    HashMap map2 = new HashMap();
                    if (!TextUtils.isEmpty(c0xzg.LJIIIIZZ)) {
                        map2.put("captcha", c0xzg.LJIIIIZZ);
                    }
                    map2.put("code", C2093608Ic.LIZIZ(c0xzg.LJII));
                    map2.put("mobile", C2093608Ic.LIZIZ(c0xzg.LJI));
                    if (!TextUtils.isEmpty(c0xzg.LJIIIZ)) {
                        map2.put("password", C2093608Ic.LIZIZ(c0xzg.LJIIIZ));
                    }
                    map2.put("unbind_exist", C2093608Ic.LIZIZ(String.valueOf(0)));
                    map2.put("mix_mode", "1");
                    c846070XGz.LIZLLL(map2);
                    c846070XGz.LIZJ("phone_number_source", String.valueOf(iLIZIZ));
                    final C845960XGo c845960XGoLJFF = c846070XGz.LJFF();
                    new AbstractC845940XGm<C0XT7<C0XZG>>(contextRequireContext, c845960XGoLJFF, c0xzg, r7) { // from class: X.0XZE
                        public static final /* synthetic */ int LJIIIZ = 0;
                        public final C0XZG LJIIIIZZ;

                        @Override // X.AbstractC845940XGm
                        public final void LJ(C0XGA c0xga) {
                            C0XG9.LIZIZ("passport_mobile_bind", "mobile", null, c0xga, null);
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                            C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                            this.LJIIIIZZ.LJ = jSONObject2;
                        }

                        @Override // X.AbstractC845940XGm
                        public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                            this.LJIIIIZZ.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
                            this.LJIIIIZZ.LJ = jSONObject;
                        }

                        @Override // X.AbstractC845940XGm
                        public final C0XGA LJIIJ(boolean z2, C845980XGq c845980XGq) {
                            return new C0XT7(z2, 1012, this.LJIIIIZZ);
                        }

                        {
                            this.LJIIIIZZ = c0xzg;
                        }
                    }.LJIIIZ();
                    return;
                }
                C846070XGz c846070XGz2 = new C846070XGz();
                c846070XGz2.LIZ = C0XH1.LIZ("/passport/mobile/bind/v1/");
                c846070XGz2.LIZJ("mobile", C2093608Ic.LIZIZ(str));
                c846070XGz2.LIZJ("code", C2093608Ic.LIZIZ(str2));
                c846070XGz2.LIZJ("unbind_exist", C2093608Ic.LIZIZ(CardStruct.IStatusCode.DEFAULT));
                c846070XGz2.LIZJ("phone_number_source", String.valueOf(C0XZL.LIZIZ(c0xyd)));
                c846070XGz2.LIZJ("mix_mode", "1");
                Map<String, String> map3 = map;
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        c846070XGz2.LIZJ(entry.getKey(), entry.getValue());
                    }
                }
                final C845960XGo c845960XGoLJFF2 = c846070XGz2.LJFF();
                final Context contextRequireContext2 = fragment.requireContext();
                final C0XZG c0xzg2 = new C0XZG(str, str2, null, null);
                new AbstractC845940XGm<C0XT7<C0XZG>>(contextRequireContext2, c845960XGoLJFF2, c0xzg2, r7) { // from class: X.0XZD
                    public final C0XZG LJIIIIZZ;

                    @Override // X.AbstractC845940XGm
                    public final void LJ(C0XGA c0xga) {
                        C0XG9.LIZIZ("passport_mobile_bind", "mobile", null, c0xga, null);
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                        C0XV1.LIZJ(this.LJIIIIZZ, jSONObject);
                        this.LJIIIIZZ.LJ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
                        this.LJIIIIZZ.LJ = jSONObject;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z2, C845980XGq c845980XGq) {
                        return new C0XT7(z2, 1012, this.LJIIIIZZ);
                    }

                    {
                        this.LJIIIIZZ = c0xzg2;
                    }
                }.LJIIIZ();
            }
        }).LJIIIIZZ(new AfS0S4300000_13(fragment, enumC852910Xd3, c0xyd, str, str3, string, str4, 0)).LJII(new AfS0S4300000_13(fragment, enumC852910Xd3, c0xyd, str4, string, str, str3, 1)));
    }

    public static C11JS LJII(final String str, final Fragment fragment, final C0XYD c0xyd, final String str2, final String str3, final int i, final Map map, final String str4, final String str5, final Function1 function1) {
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWO
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.0XGw, X.0XWN] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd2 = c0xyd;
                ?? r5 = new AbstractC849640XUs() { // from class: X.0XWN
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }

                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        ((C11KY) c11ky).onSuccess(c0xga);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i2) {
                        String str6;
                        C0XWW<C849600XUo> c0xww = c11ky;
                        if (c0xga != null) {
                            str6 = c0xga.LJFF;
                        } else {
                            str6 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str6, c0xyd2.scene(), c0xyd2.LLJJLIIIJLLLLLLLZ(), null, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> map2 = map;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                linkedHashMap.put("rules_version", "v2");
                c0xyd.gk(r5);
                c0xyd.Fb().LJFF(str2, str3, i, linkedHashMap, r5);
            }
        }).LJIIIIZZ(new AfS0S3200000_13(fragment, c0xyd, str, str5, str4, 0)).LJII(new C09JN() { // from class: X.0XYU
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NetworkHelper@8b8f.emailCheckCode$3");
                C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
                C852170Xbr.LJIILL(C852170Xbr.LIZ, fragment.getArguments(), c0xzj.getErrorCode(), str, c0xyd.getMobParams().LLIIJI(), str5, c0xyd.getMobParams().RR(), null, null, str4, false, 704);
                Function1<C0XZJ, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(c0xzj);
                }
                C1C7U.LIZIZ("NetworkHelper@8b8f.emailCheckCode$3");
            }
        }));
    }

    public static C11JS LJJJIL(Fragment fragment, final C0XYD c0xyd, final String str, final String str2, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, String str3, String str4, final int i, Function1 function1) {
        return C1239250iLz.LIZIZ(fragment, c0xyd, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [X.0XGw, X.0XWc] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                Boolean bool = Boolean.TRUE;
                BaseAccountFlowFragment mobParams = c0xyd.getMobParams();
                c852170Xbr.getClass();
                C852170Xbr.LJIIJ(bool, "email", mobParams, false, null);
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                ?? r10 = new AbstractC850010XWd() { // from class: X.0XWc
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C849550XUj> c0xt7) {
                        ((C11KY) c11ky).onSuccess(c0xt7.LJIIIZ);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C849550XUj> c0xt7, int i2) {
                        String str5;
                        C0XWW<C849550XUj> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str5 = c0xt7.LJFF;
                        } else {
                            str5 = null;
                        }
                        EnumC852660Xce enumC852660Xce3 = enumC852660Xce2;
                        EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c0xww).onError(new C0XZJ(i2, str5, enumC852660Xce3, enumC852910Xd33, C0XZ4.LJIIJJI(c0xt7), ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0XZ4.LIZ.getClass();
                linkedHashMap.putAll(C0XZ4.LJIIL());
                ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
                if (iCoinEmailAccountService != null) {
                    iCoinEmailAccountService.LIZLLL();
                }
                c0xyd.gk(r10);
                c0xyd.Fb().LJIIIIZZ(str, str2, i, linkedHashMap, r10);
            }
        }).LJIIIIZZ(new AfS0S2201000_13(fragment, c0xyd, str4, i, str3, 2)).LJII(new AfS0S2301000_13(fragment, c0xyd, str4, i, str3, function1, 0)));
    }

    public static C11JS LJJIII(C0XZ4 c0xz4, Fragment fragment, C0XYD c0xyd, String str, int i, String str2, Map map, String str3, Integer num, EnumC850750XYz enumC850750XYz, AwS592S0100000_13 awS592S0100000_13, int i2) {
        EnumC850750XYz enumC850750XYz2 = enumC850750XYz;
        Integer num2 = num;
        String str4 = str3;
        Map map2 = map;
        AwS592S0100000_13 awS592S0100000_132 = null;
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 256) != 0) {
            enumC850750XYz2 = null;
        }
        if ((i2 & 512) == 0) {
            awS592S0100000_132 = awS592S0100000_13;
        }
        c0xz4.getClass();
        String strLJJLIIIJJI = c0xyd.getMobParams().LJJLIIIJJI();
        String strLLIIJI = c0xyd.getMobParams().LLIIJI();
        String strRR = c0xyd.getMobParams().RR();
        String strPR = c0xyd.getMobParams().PR();
        C852810Xct.LIZ.getClass();
        return C1239250iLz.LIZIZ(fragment, c0xyd, LJIILL(i, fragment, enumC850750XYz2, c0xyd, num2, str, str2, strLJJLIIIJJI, strLLIIJI, strRR, strPR, str4, C852810Xct.LIZ(fragment), C852810Xct.LIZJ(fragment), map2, awS592S0100000_132));
    }

    public static C11JS LJJ(C0XZ4 c0xz4, Fragment fragment, C0XYD c0xyd, String str, EnumC852660Xce enumC852660Xce, EnumC852910Xd3 enumC852910Xd3, String str2, String str3, String str4, String str5, String str6, Integer num, Map map, int i) {
        Map map2 = map;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        Integer num2 = num;
        String str10 = str2;
        String string = null;
        if ((i & 32) != 0) {
            str10 = null;
        }
        if ((i & 64) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map2 = null;
        }
        c0xz4.getClass();
        String strLJJLIIIJJI = c0xyd.getMobParams().LJJLIIIJJI();
        String strLLIIJI = c0xyd.getMobParams().LLIIJI();
        String strPR = c0xyd.getMobParams().PR();
        String strQm = c0xyd.Qm();
        C852810Xct.LIZ.getClass();
        String strLIZ = C852810Xct.LIZ(fragment);
        String strLIZJ = C852810Xct.LIZJ(fragment);
        Bundle arguments = c0xyd.getMobParams().getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_position");
        }
        return C1239250iLz.LIZIZ(fragment, c0xyd, LJIILLIIL(c0xz4, strLJJLIIIJJI, strLLIIJI, str, enumC852660Xce, enumC852910Xd3, str4, strPR, str10, str9, c0xyd, null, str8, str7, strQm, strLIZ, strLIZJ, num2, null, string, map2, 131072));
    }

    public static C11JS LJIIZILJ(C0XZ4 c0xz4, String str, String str2, String str3, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str4, final int i, Map map, String str5, String str6, Fragment fragment, C0XYD c0xyd, boolean z, int i2) {
        Fragment fragment2 = fragment;
        String str7 = str5;
        boolean z2 = z;
        final Map map2 = map;
        final C0XYD c0xyd2 = null;
        if ((i2 & 128) != 0) {
            map2 = null;
        }
        if ((i2 & 256) != 0) {
            str7 = null;
        }
        if ((i2 & 1024) != 0) {
            fragment2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            c0xyd2 = c0xyd;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = false;
        }
        c0xz4.getClass();
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWL
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.0XGw, X.0XWR] */
            @Override // X.InterfaceC1254030ijp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(final X.C11KY r6) {
                /*
                    r5 = this;
                    X.0XWR r4 = new X.0XWR
                    X.0Xce r1 = r2
                    X.0Xd3 r0 = r3
                    r4.<init>()
                    java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                    r3.<init>()
                    java.util.Map<java.lang.String, java.lang.String> r0 = r6
                    if (r0 == 0) goto L15
                    r3.putAll(r0)
                L15:
                    X.0XYD r0 = r4
                    if (r0 == 0) goto L1c
                    r0.gk(r4)
                L1c:
                    X.0XYD r0 = r4
                    if (r0 == 0) goto L26
                    X.0XUi r2 = r0.Fb()
                    if (r2 != 0) goto L2a
                L26:
                    X.0XUi r2 = X.C849510XUf.LJIIL()
                L2a:
                    int r1 = r1
                    java.lang.String r0 = r5
                    r2.LJI(r1, r0, r3, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XWL.LIZ(X.11KY):void");
            }
        }).LJIIIIZZ(new AfS0S5110000_13(fragment2, str, str2, str6, str3, str7, z2, 0)).LJII(new AfS0S5110000_13(fragment2, str, str2, str6, str3, str7, z2, 1));
    }

    public static C11KZ LJIILL(final int i, final Fragment fragment, final EnumC850750XYz enumC850750XYz, final C0XYD c0xyd, final Integer num, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final Map map, final Function1 function1) {
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0XZ0] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final String themeName;
                EnumC850750XYz enumC850750XYz2 = enumC850750XYz;
                if (enumC850750XYz2 == null || (themeName = enumC850750XYz2.getThemeName()) == null) {
                    themeName = "code_and_link";
                }
                final String str10 = str3;
                final String str11 = str4;
                final String str12 = str2;
                final int i2 = i;
                final String str13 = str5;
                final String str14 = str6;
                final String str15 = str8;
                final String str16 = str9;
                final Function1<C0XZJ, Unit> function12 = function1;
                final String str17 = str;
                final Fragment fragment2 = fragment;
                ?? r3 = new C0XZ1() { // from class: X.0XZ0
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.LOGIN, EnumC852910Xd3.INPUT_EMAIL_FIND_PASSWORD, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C849450XTz> c0xt7) {
                        String str18;
                        String str19;
                        Bundle arguments;
                        C0XZ2.LIZJ(str17, (C849450XTz) c0xt7.LJIIIZ);
                        if (C0XZ2.LIZIZ(str17)) {
                            str18 = "link";
                        } else {
                            str18 = themeName;
                        }
                        Fragment fragment3 = fragment2;
                        if (fragment3 != null && (arguments = fragment3.getArguments()) != null) {
                            C786410Ut5.LJJJI("send_type", str18, arguments);
                        }
                        SendEmailCodeEvent sendEmailCodeEvent = new SendEmailCodeEvent();
                        sendEmailCodeEvent.LJI(str10, "enter_from");
                        sendEmailCodeEvent.LJI(str11, "enter_method");
                        sendEmailCodeEvent.LJI(str12, "send_method");
                        sendEmailCodeEvent.LJI("success", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        sendEmailCodeEvent.LJI(String.valueOf(i2), "send_reason");
                        sendEmailCodeEvent.LJI(str13, "page");
                        sendEmailCodeEvent.LJI(str14, "login_panel_type");
                        sendEmailCodeEvent.LJI(String.valueOf(c0xt7.LJ), "error_code");
                        sendEmailCodeEvent.LJI(str18, "send_type");
                        int i3 = i2;
                        if (i3 != 13) {
                            if (i3 == 27) {
                                str19 = "1";
                            }
                            sendEmailCodeEvent.LJI(str15, "3p_platform");
                            sendEmailCodeEvent.LJI(str16, "config_key");
                            sendEmailCodeEvent.LJIIIIZZ();
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                        str19 = CardStruct.IStatusCode.DEFAULT;
                        sendEmailCodeEvent.LJI(str19, "is_register");
                        sendEmailCodeEvent.LJI(str15, "3p_platform");
                        sendEmailCodeEvent.LJI(str16, "config_key");
                        sendEmailCodeEvent.LJIIIIZZ();
                        ((C11KY) c11ky).onSuccess(c0xt7);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
                    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJ(X.C0XT7<X.C849450XTz> r9, int r10) {
                        /*
                            r8 = this;
                            com.ss.android.ugc.aweme.account.eventtracking.bindings.SendEmailCodeEvent r2 = new com.ss.android.ugc.aweme.account.eventtracking.bindings.SendEmailCodeEvent
                            r2.<init>()
                            java.lang.String r1 = r1
                            java.lang.String r0 = "enter_from"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r2
                            java.lang.String r0 = "enter_method"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r3
                            java.lang.String r0 = "send_method"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = "status"
                            java.lang.String r0 = "fail"
                            r2.LJI(r0, r1)
                            int r0 = r4
                            java.lang.String r1 = java.lang.String.valueOf(r0)
                            java.lang.String r0 = "send_reason"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r5
                            java.lang.String r0 = "page"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r6
                            java.lang.String r0 = "login_panel_type"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = java.lang.String.valueOf(r10)
                            java.lang.String r0 = "error_code"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r7
                            java.lang.String r0 = "send_type"
                            r2.LJI(r1, r0)
                            java.lang.String r1 = r8
                            java.lang.String r0 = "3p_platform"
                            r2.LJI(r1, r0)
                            int r1 = r4
                            r0 = 13
                            r3 = 0
                            if (r1 == r0) goto L9c
                            r0 = 27
                            if (r1 != r0) goto L64
                            java.lang.String r1 = "1"
                        L5f:
                            java.lang.String r0 = "is_register"
                            r2.LJI(r1, r0)
                        L64:
                            java.lang.String r1 = r9
                            java.lang.String r0 = "config_key"
                            r2.LJI(r1, r0)
                            r2.LJIIIIZZ()
                            X.0XZJ r1 = new X.0XZJ
                            if (r9 == 0) goto L99
                            int r2 = r9.LIZLLL
                        L74:
                            if (r9 == 0) goto L78
                            java.lang.String r3 = r9.LJFF
                        L78:
                            X.0Xce r4 = X.EnumC852660Xce.LOGIN
                            X.0Xd3 r5 = X.EnumC852910Xd3.INPUT_EMAIL_FIND_PASSWORD
                            X.0XZ4 r0 = X.C0XZ4.LIZ
                            r0.getClass()
                            org.json.JSONObject r6 = X.C0XZ4.LJIIJJI(r9)
                            java.lang.String r7 = ""
                            r1.<init>(r2, r3, r4, r5, r6, r7)
                            X.0XWW<X.0XT7<X.0XTz>> r0 = r10
                            X.11KY r0 = (X.C11KY) r0
                            r0.onError(r1)
                            kotlin.jvm.functions.Function1<X.0XZJ, kotlin.Unit> r0 = r11
                            if (r0 == 0) goto L98
                            r0.invoke(r1)
                        L98:
                            return
                        L99:
                            r2 = -10000(0xffffffffffffd8f0, float:NaN)
                            goto L74
                        L9c:
                            java.lang.String r1 = "0"
                            goto L5f
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C0XZ0.LJ(X.0XT7, int):void");
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EnumC850750XYz enumC850750XYz3 = enumC850750XYz;
                if (enumC850750XYz3 != null) {
                    linkedHashMap.put("email_theme", String.valueOf(enumC850750XYz3.getValue()));
                } else {
                    linkedHashMap.put("email_theme", "2");
                }
                EnumC851500Xam.Companion.getClass();
                String value = EnumC851500Xam.ruleStrategies$delegate.getValue();
                C0XZ4.LIZ.getClass();
                C0XZ4.LJJIJLIJ(value, linkedHashMap);
                Map<String, String> map2 = map;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                C0XYD c0xyd2 = c0xyd;
                if (c0xyd2 != null) {
                    c0xyd2.gk(r3);
                }
                if (num == null) {
                    ((C849510XUf) C849510XUf.LJIIL()).LJIIJJI(str, str7, i, linkedHashMap, r3);
                } else {
                    ((C849510XUf) C849510XUf.LJIIL()).LJIIJ(str, str7, i, num.intValue(), linkedHashMap, r3);
                }
            }
        });
    }

    public static C11JS LJIILIIL(C0XZ4 c0xz4, final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, boolean z, final int i, Map map, String str7, final String str8, Fragment fragment, C0XYD c0xyd, boolean z2, int i2) {
        final boolean z3 = z2;
        final String str9 = str7;
        final Map map2 = map;
        final Fragment fragment2 = fragment;
        final boolean z4 = z;
        if ((i2 & 512) != 0) {
            z4 = false;
        }
        final C0XYD c0xyd2 = null;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = null;
        }
        if ((i2 & 16384) != 0) {
            fragment2 = null;
        }
        if ((32768 & i2) == 0) {
            c0xyd2 = c0xyd;
        }
        if ((i2 & 65536) != 0) {
            z3 = false;
        }
        c0xz4.getClass();
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XYe
            /* JADX WARN: Type inference failed for: r9v0, types: [X.0XGw, X.0XYd] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                String str10;
                String str11;
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                final Fragment fragment3 = fragment2;
                final String str12 = str4;
                final String str13 = str5;
                final String str14 = str8;
                final String str15 = str6;
                final String str16 = str9;
                final boolean z5 = z3;
                ?? r9 = new AbstractC850560XYg() { // from class: X.0XYd
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850550XYf> c0xt7) {
                        Bundle arguments;
                        ((C11KY) c11ky).onSuccess(c0xt7);
                        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                        Fragment fragment4 = fragment3;
                        if (fragment4 != null) {
                            arguments = fragment4.getArguments();
                        } else {
                            arguments = null;
                        }
                        C852170Xbr.LJIILL(c852170Xbr, arguments, 0, str12, str13, str14, str15, null, null, str16, z5, 192);
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850550XYf> c0xt7, int i3) {
                        int i4;
                        String str17;
                        C0XWW<C0XT7<C850550XYf>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            i4 = c0xt7.LIZLLL;
                        } else {
                            i4 = -10000;
                        }
                        Bundle arguments = null;
                        if (c0xt7 != null) {
                            str17 = c0xt7.LJFF;
                        } else {
                            str17 = null;
                        }
                        EnumC852660Xce enumC852660Xce3 = enumC852660Xce2;
                        EnumC852910Xd3 enumC852910Xd33 = enumC852910Xd32;
                        C0XZ4.LIZ.getClass();
                        ((C11KY) c0xww).onError(new C0XZJ(i4, str17, enumC852660Xce3, enumC852910Xd33, C0XZ4.LJIIJJI(c0xt7), ""));
                        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                        Fragment fragment4 = fragment3;
                        if (fragment4 != null) {
                            arguments = fragment4.getArguments();
                        }
                        C852170Xbr.LJIILL(c852170Xbr, arguments, i3, str12, str13, str14, str15, null, null, str16, z5, 192);
                    }
                };
                C0XYD c0xyd3 = c0xyd2;
                if (c0xyd3 != null) {
                    c0xyd3.gk(r9);
                }
                Context context2 = context;
                String str17 = str2;
                String str18 = str;
                String str19 = str3;
                boolean z6 = z4;
                int i3 = i;
                Map<String, String> map3 = map2;
                C850550XYf c850550XYf = new C850550XYf(str17, str18, str19);
                C846070XGz c846070XGz = new C846070XGz();
                if (z6) {
                    str10 = "/passport/email/change_with_update_password/";
                } else {
                    str10 = "/passport/email/change/";
                }
                c846070XGz.LIZ = str10;
                HashMap map4 = new HashMap();
                if (!TextUtils.isEmpty(c850550XYf.LJIIIIZZ)) {
                    map4.put("ticket", c850550XYf.LJIIIIZZ);
                }
                String strLIZIZ = C2093608Ic.LIZIZ(c850550XYf.LJI);
                String str20 = "";
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                map4.put("code", strLIZIZ);
                map4.put("mix_mode", "1");
                String strLIZIZ2 = C2093608Ic.LIZIZ(c850550XYf.LJII);
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "";
                }
                map4.put("email", strLIZIZ2);
                if (map3 == null || (str11 = map3.get("type")) == null) {
                    str11 = "6";
                }
                String strLIZIZ3 = C2093608Ic.LIZIZ(str11);
                if (strLIZIZ3 != null) {
                    str20 = strLIZIZ3;
                }
                map4.put("type", str20);
                if (map3 != null) {
                    map4.putAll(map3);
                }
                c846070XGz.LIZLLL(map4);
                c846070XGz.LIZJ("email_source", String.valueOf(i3));
                new AbstractC845940XGm<C0XT7<C850550XYf>>(context2, c846070XGz.LJFF(), c850550XYf, r9) { // from class: X.0XYc
                    public static final /* synthetic */ int LJIIIZ = 0;
                    public final C850550XYf LJIIIIZZ;

                    @Override // X.AbstractC845940XGm
                    public final /* bridge */ /* synthetic */ void LJ(C0XGA c0xga) {
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ.LJ = jSONObject2;
                    }

                    @Override // X.AbstractC845940XGm
                    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
                        this.LJIIIIZZ.LJ = jSONObject;
                    }

                    @Override // X.AbstractC845940XGm
                    public final C0XGA LJIIJ(boolean z7, C845980XGq c845980XGq) {
                        C850550XYf c850550XYf2 = this.LJIIIIZZ;
                        c850550XYf2.LIZ = c845980XGq.LIZIZ;
                        c850550XYf2.LIZJ = c845980XGq.LIZJ;
                        return new C0XT7(z7, 1009, c850550XYf2);
                    }

                    {
                        this.LJIIIIZZ = c850550XYf;
                    }
                }.LJIIIZ();
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0XUR
            @Override // X.C09JN
            public final void accept(Object obj) {
                JSONObject jSONObject;
                C1C7U.LIZ("NetworkHelper@8b8f.getChangeEmailMaybe$2");
                C0XT7 c0xt7 = (C0XT7) obj;
                if (C293990Bfh.LIZ() && c0xt7 != null) {
                    try {
                        C850550XYf c850550XYf = (C850550XYf) c0xt7.LJIIIZ;
                        if (c850550XYf != null && (jSONObject = c850550XYf.LJ) != null) {
                            C0XO2 c0xo2 = new C0XO2(jSONObject);
                            c0xo2.LIZ();
                            String uid = C0XQ5.LIZJ().getUid();
                            if (uid == null) {
                                uid = "";
                            }
                            C0XUE c0xue = C0XUE.LIZ;
                            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(c0xue.LJ(uid));
                            if (baseLoginMethod != null && baseLoginMethod.getLoginMethodName() == LoginMethodName.EMAIL_PASS) {
                                baseLoginMethod.setMaskedEmail(c0xo2.LJIIJ);
                                c0xue.LJI(baseLoginMethod, true);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1C7U.LIZIZ("NetworkHelper@8b8f.getChangeEmailMaybe$2");
            }
        });
    }

    public static C11JS LJIILLIIL(C0XZ4 c0xz4, final String str, final String str2, final String str3, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final String str4, String str5, String str6, String str7, C0XYD c0xyd, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, Map map, int i) {
        boolean zContainsKey;
        final int iLJJIFFI;
        Map map2 = map;
        final String str16 = str15;
        final String str17 = str13;
        final String str18 = str12;
        final String str19 = str11;
        final String str20 = str10;
        final String str21 = str9;
        final String str22 = str8;
        final C0XYD c0xyd2 = c0xyd;
        final String str23 = str7;
        final String str24 = str6;
        final String str25 = str14;
        final String str26 = str5;
        if ((i & 64) != 0) {
            str26 = null;
        }
        if ((i & 128) != 0) {
            str24 = null;
        }
        if ((i & 256) != 0) {
            str23 = null;
        }
        if ((i & 512) != 0) {
            c0xyd2 = null;
        }
        if ((i & 1024) != 0) {
            str22 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str21 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str20 = null;
        }
        if ((i & 8192) != 0) {
            str19 = null;
        }
        if ((i & 16384) != 0) {
            str18 = null;
        }
        if ((32768 & i) != 0) {
            str17 = null;
        }
        if ((65536 & i) != 0) {
            num = null;
        }
        if ((131072 & i) != 0) {
            str25 = null;
        }
        if ((262144 & i) != 0) {
            str16 = null;
        }
        if ((i & 524288) != 0) {
            map2 = null;
        }
        c0xz4.getClass();
        try {
            try {
                C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(str3, null);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz(String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()), String.valueOf(c2218561BsMLJIIZILJ.getCountryCode()));
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                ClientSubmitSmsCodeEvent.LJIIIIZZ = new C1195304lz("", "");
            }
        } catch (Exception e2) {
            e = e2;
        }
        final int iLJIILJJIL = LJIILJJIL(enumC852660Xce);
        if (num != null) {
            iLJJIFFI = num.intValue();
        } else {
            if (map2 != null) {
                zContainsKey = map2.containsKey("passport_ticket");
            } else {
                zContainsKey = false;
            }
            iLJJIFFI = LJJIFFI(enumC852910Xd3, zContainsKey);
        }
        final Map map3 = map2;
        final C0XYD c0xyd3 = c0xyd2;
        final int i2 = iLJJIFFI;
        C11JS c11jsLJIIIIZZ = AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXF
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                int i3;
                List<InterfaceC586170Myt> list = C0XQ5.LIZ;
                if (C0WWA.LIZ(C0XPY.LIZIZ) == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                final EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                C0XXH c0xxh = new C0XXH() { // from class: X.0XWj
                    @Override // X.C0XH7
                    public final void LJFF(C0XGA c0xga) {
                        ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd32, null, ""));
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                    public final void LJI(C0XT7<C850300XXg> c0xt7) {
                        if (c0xt7 != null) {
                            ((C11KY) c11ky).onSuccess(c0xt7);
                        }
                    }

                    @Override // X.C0XH7
                    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJ(C0XT7<C850300XXg> c0xt7, int i4) throws JSONException {
                        String str27;
                        String str28;
                        T t;
                        JSONObject jSONObject;
                        JSONObject jSONObjectOptJSONObject;
                        C850300XXg c850300XXg;
                        JSONObject jSONObject2 = new JSONObject();
                        if (c0xt7 == null || (c850300XXg = (C850300XXg) c0xt7.LJIIIZ) == null || (str27 = c850300XXg.LJIIIIZZ) == null) {
                            str27 = "";
                        }
                        jSONObject2.put("next_url", str27);
                        if (i4 == 2030) {
                            if (c0xt7 != null && (t = c0xt7.LJIIIZ) != 0 && (jSONObject = t.LJ) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                                jSONObject2.put("data", jSONObjectOptJSONObject);
                            }
                            jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                        }
                        C0XWW<C0XT7<C850300XXg>> c0xww = c11ky;
                        if (c0xt7 != null) {
                            str28 = c0xt7.LJFF;
                        } else {
                            str28 = null;
                        }
                        ((C11KY) c0xww).onError(new C0XZJ(i4, str28, enumC852660Xce2, enumC852910Xd32, jSONObject2, ""));
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("is6Digits", "1");
                Map<String, String> map4 = map3;
                if (map4 != null) {
                    linkedHashMap.putAll(map4);
                }
                C0XYD c0xyd4 = c0xyd3;
                if (c0xyd4 != null) {
                    c0xyd4.gk(c0xxh);
                }
                ((C0XXU) C0XXU.LJIILL()).LJIILLIIL(str3, i2, str24, iLJIILJJIL, i3, "", str23, linkedHashMap, c0xxh);
            }
        }).LJIIIIZZ(new C09JN() { // from class: X.0XZ5
            @Override // X.C09JN
            public final void accept(Object obj) {
                Bundle arguments;
                BaseAccountFlowFragment mobParams;
                C1C7U.LIZ("NetworkHelper@8b8f.getSendPhoneCodeMaybe$2");
                C0XT7 c0xt7 = (C0XT7) obj;
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                T t = c0xt7.LJIIIZ;
                c852170Xbr.getClass();
                Bundle bundleLJ = C852170Xbr.LJ(t);
                C0XYD c0xyd4 = c0xyd2;
                String strQm = null;
                if (c0xyd4 != null && (mobParams = c0xyd4.getMobParams()) != null) {
                    arguments = mobParams.getArguments();
                } else {
                    arguments = null;
                }
                C852170Xbr.LJIIZILJ(arguments, bundleLJ);
                String str27 = str;
                String str28 = str2;
                String str29 = str26;
                String str30 = str4;
                int i3 = iLJJIFFI;
                String str31 = str3;
                C0XYD c0xyd5 = c0xyd2;
                if (c0xyd5 != null) {
                    strQm = c0xyd5.Qm();
                }
                String str32 = str22;
                String str33 = str21;
                String str34 = str20;
                C0XZ4 c0xz42 = C0XZ4.LIZ;
                EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                c0xz42.getClass();
                C852170Xbr.LJIILJJIL(c852170Xbr, str27, str28, str29, 0, str30, i3, "text", null, str31, strQm, str32, str33, str34, C0XZ4.LJJII(enumC852910Xd32), str18, str17, c0xt7.LJIIIZ.LJFF, str25, bundleLJ, str16, 8192);
                C1C7U.LIZIZ("NetworkHelper@8b8f.getSendPhoneCodeMaybe$2");
            }
        });
        final String str27 = str26;
        final int i3 = iLJJIFFI;
        final String str28 = str22;
        final String str29 = str21;
        final String str30 = str20;
        final String str31 = str18;
        final String str32 = str17;
        final String str33 = str25;
        final String str34 = str16;
        return c11jsLJIIIIZZ.LJII(new C09JN() { // from class: X.0XZ8
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NetworkHelper@8b8f.getSendPhoneCodeMaybe$3");
                C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                String str35 = str;
                String str36 = str2;
                String str37 = str27;
                int errorCode = c0xzj.getErrorCode();
                String str38 = str4;
                int i4 = i3;
                String errorMsg = c0xzj.getErrorMsg();
                String str39 = str3;
                String str40 = str19;
                String str41 = str28;
                String str42 = str29;
                String str43 = str30;
                C0XZ4 c0xz42 = C0XZ4.LIZ;
                EnumC852910Xd3 enumC852910Xd32 = enumC852910Xd3;
                c0xz42.getClass();
                C852170Xbr.LJIILJJIL(c852170Xbr, str35, str36, str37, errorCode, str38, i4, "text", errorMsg, str39, str40, str41, str42, str43, C0XZ4.LJJII(enumC852910Xd32), str31, str32, null, str33, null, str34, 663552);
                C1C7U.LIZIZ("NetworkHelper@8b8f.getSendPhoneCodeMaybe$3");
            }
        });
    }
}
