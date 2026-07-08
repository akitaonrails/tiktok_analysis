package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1200000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.model.Block3pLogoutDetailDTO;
import com.ss.android.ugc.aweme.account.pii.PIIBindPromptFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XVU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVU extends AbstractC846040XGw<C848150XOz> {
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ Bundle LJI;
    public final /* synthetic */ C0XU6 LJII;

    @Override // X.AbstractC846040XGw
    public final void LIZ(C0XGA c0xga) {
        AbstractC854370XfP c853910Xef;
        List list;
        IForceBindingAccountService.BindPromptConfig bindPromptConfig;
        Activity activity;
        final C848150XOz c848150XOz = (C848150XOz) c0xga;
        if (this.LJII.LIZJ != null && (activity = this.LIZJ) != null) {
            activity.runOnUiThread(new ARunnableS113S0100000_13(this, 206));
        }
        String str = "";
        if (c848150XOz.LIZIZ) {
            if (this.LIZLLL && this.LJII.LIZ.LJJI().size() > 1) {
                C0XQ7.LJFF();
                AbstractC848400XPy.LJJIJLIJ();
            }
            String str2 = C0XUU.LJFF;
            SharedPreferences sharedPreferencesLIZ = C0XQZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ftc_age_gate_response_mode");
            sbLIZ.append(str2);
            if (sharedPreferencesLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), -1) != -1) {
                String str3 = C0XUU.LJFF;
                SharedPreferences.Editor editorEdit = C0XQZ.LIZ().edit();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ftc_age_gate_response_mode");
                sbLIZ2.append(str3);
                editorEdit.remove(C2188811AlT.LIZIZ(sbLIZ2)).apply();
            }
            if (C1862707Rh.LIZ(C0XUU.LJFF) != -1) {
                C1862707Rh.LIZ.remove(C0XUU.LJFF);
            }
            AppLog.setUserId(0L);
            AppLog.setSessionKey(this.LJII.LIZ.LJIIZILJ());
            C0XPA c0xpa = C0XPA.LIZLLL;
            List<InterfaceC586170Myt> list2 = C0XQ5.LIZ;
            Application application = C0XPY.LIZIZ;
            for (C0XPB c0xpb : c0xpa.LIZIZ) {
                c0xpb.LIZJ = false;
            }
            c0xpa.LIZJ(application);
            if (this.LIZJ != null) {
                LocalBroadcastManager.LIZ(C0XPY.LIZIZ).LIZJ(new Intent(this.LIZJ, (Class<?>) C846810XJv.class));
            }
            this.LJII.LIZ.LJJIJIL();
            Keva.getRepo("password_status").clear();
            C848230XPh.LL.getClass();
            C848230XPh.LLILLJJLI = false;
            UserStore.LIZ.getClass();
            C848230XPh.LIZIZ(UserStore.LIZLLL());
            C848230XPh.LLILLL = -1L;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
            c0xgr.LIZLLL("params_for_special", "uc_login");
            c0xgr.LIZLLL("fail_info", "");
            c0xgr.LIZ(0, "error_code");
            c0xgr.LIZLLL("uid", this.LJ);
            c0xgr.LIZLLL("logout_from", this.LJFF);
            C20684815ws.LJIILLIIL("uc_user_logout_result", c0xgr.LIZ);
            if (this.LJII.LIZ.LJJI().size() > 0 && C0XQ5.LJ().isEnableMultiAccountLogin()) {
                C0XUU.LIZ.getClass();
                C01GW c01gw = C0XUU.LIZLLL;
                List<String> listLJJI = ((IAccountUserService) c01gw.getValue()).LJJI();
                C0XUU.LIZJ = listLJJI;
                if (listLJJI != null) {
                    C0XUU.LIZIZ = listLJJI.size() - 1;
                    String str4 = (String) C13LP.LJJLIIIJJI(listLJJI);
                    String curUserId = ((IAccountUserService) c01gw.getValue()).getCurUserId();
                    String strValueOf = String.valueOf(C0XUU.LIZJ);
                    HashMap map = new HashMap();
                    map.put("event", "start switch account");
                    map.put("from", "after logout");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("from ");
                    sbLIZ3.append(curUserId);
                    sbLIZ3.append(" to ");
                    sbLIZ3.append(str4);
                    sbLIZ3.append(" with ");
                    sbLIZ3.append(strValueOf);
                    map.put("extra", C2188811AlT.LIZIZ(sbLIZ3));
                    C836930WsN.LIZ.LIZIZ(map.toString());
                    if (C0XUU.LIZIZ >= 0) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_method", "logout");
                        C20684815ws.LJIILLIIL("switch_account_submit", c2344009Gk.LIZ);
                        SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str4);
                        if (significantUserInfoLJIIJJI != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("need_restart", true);
                            C0XUU.LJ(significantUserInfoLJIIJJI, bundle, true, false, new InterfaceC849490XUd() { // from class: X.0XVN
                                @Override // X.InterfaceC849490XUd
                                public final void onSuccess() {
                                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                                    c2344009Gk2.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c2344009Gk2.LJIIIIZZ("enter_method", "logout");
                                    C20684815ws.LJIILLIIL("switch_account_result", c2344009Gk2.LIZ);
                                    C0XUU.LIZ.getClass();
                                    C0XUU.LIZJ = null;
                                    C0XUU.LIZIZ = -1;
                                    C0XUU.LJFF = "";
                                }

                                @Override // X.InterfaceC849490XUd
                                public final void LIZ(Integer num, String str5) {
                                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                                    c2344009Gk2.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c2344009Gk2.LJ(num, "fail_info");
                                    c2344009Gk2.LJIIIIZZ("enter_method", "logout");
                                    C20684815ws.LJIILLIIL("switch_account_result", c2344009Gk2.LIZ);
                                    C0XUU.LIZ.getClass();
                                    C0XUU.LIZJ = null;
                                    C0XUU.LIZIZ = -1;
                                    C0XUU.LJFF = "";
                                    if (C293980Bfg.LIZ()) {
                                        C0XVR c0xvr = new C0XVR(new Bundle(), false);
                                        C0XQ5.LJI();
                                        C849800XVi.LIZJ(c0xvr);
                                    } else {
                                        C0XVP c0xvp = new C0XVP(false);
                                        Bundle bundle2 = new Bundle();
                                        C0XQ5.LJI();
                                        C0XVM.LIZIZ(bundle2, c0xvp, false, false);
                                    }
                                }
                            });
                        }
                    }
                }
                ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJI(CastLongProtector.parseLong(this.LJ));
            } else {
                ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJIIJ(new PrevLoginPlatformService().LIZ(CastLongProtector.parseLong(this.LJ)));
                ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJI(CastLongProtector.parseLong(this.LJ));
                C0XQ5.LJI();
                Iterator it2 = ((CopyOnWriteArrayList) C0XQ5.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC586170Myt) it2.next()).onAccountResult(3, true, 0, null);
                }
                if (this.LIZLLL) {
                    ComplianceServiceProvider.LJII().LJI(false);
                    if (C293980Bfg.LIZ()) {
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("previous_uid", C0XUU.LJFF, bundle2);
                        C849800XVi.LIZJ(new C0XVR(bundle2, true));
                    } else {
                        C627150Oin c627150Oin = new C627150Oin();
                        C786410Ut5.LJJJI("previous_uid", C0XUU.LJFF, c627150Oin.LIZ);
                        C0XVM.LIZIZ(c627150Oin.LIZ, new C0XVP(true), false, false);
                    }
                } else if (C293980Bfg.LIZ()) {
                    Bundle bundle3 = new Bundle();
                    C786410Ut5.LJJJI("previous_uid", C0XUU.LJFF, bundle3);
                    C849800XVi.LIZJ(new C0XVR(bundle3, false));
                } else {
                    C627150Oin c627150Oin2 = new C627150Oin();
                    C786410Ut5.LJJJI("previous_uid", C0XUU.LJFF, c627150Oin2.LIZ);
                    C0XVM.LIZIZ(c627150Oin2.LIZ, new C0XVP(false), false, false);
                }
                C0XUU.LJFF = "";
                Keva.getRepo("google_onetap").storeBoolean("logged_out", true);
                Keva.getRepo("aweme_account_keva").storeLong("last_logout_time", System.currentTimeMillis());
            }
            try {
                if (!TextUtils.isEmpty(this.LJFF)) {
                    Keva repo = Keva.getRepo("user_logout_log");
                    if (System.currentTimeMillis() - repo.getLong("last_time", 0L) > 172800000) {
                        repo.clear();
                    }
                    repo.storeInt(this.LJFF, repo.getInt(this.LJFF, 0) + 1);
                    repo.storeLong("last_time", System.currentTimeMillis());
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "fail");
        if (!TextUtils.isEmpty(c848150XOz.LJFF)) {
            str = c848150XOz.LJFF;
        }
        c0xgr2.LIZLLL("fail_info", str);
        c0xgr2.LIZ(c848150XOz.LIZLLL, "error_code");
        c0xgr2.LIZLLL("params_for_special", "uc_login");
        c0xgr2.LIZLLL("uid", this.LJ);
        c0xgr2.LIZLLL("logout_from", this.LJFF);
        C20684815ws.LJIILLIIL("uc_user_logout_result", c0xgr2.LIZ);
        TextUtils.isEmpty(c848150XOz.LJFF);
        TextUtils.isEmpty(c848150XOz.LJI);
        Iterator it3 = ((CopyOnWriteArrayList) C0XQ5.LIZ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC586170Myt) it3.next()).onAccountResult(3, false, 0, null);
        }
        int i = c848150XOz.LIZLLL;
        if (i == 2001) {
            C849720XVa c849720XVa = C849720XVa.LIZ;
            Activity activity2 = this.LIZJ;
            String str5 = c848150XOz.LJIIJ;
            C854760Xg2 c854760Xg2 = new C854760Xg2(this, 0);
            c849720XVa.getClass();
            try {
                list = (List) C7740030o.LIZ().getGson().LJIIIIZZ(str5, new TypeToken<List<? extends IForceBindingAccountService.BindPromptConfig>>() { // from class: X.0XVW
                }.getType());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                list = null;
            }
            if (activity2 != null && list != null && !list.isEmpty()) {
                IForceBindingAccountService.BindPromptConfig bindPromptConfig2 = (IForceBindingAccountService.BindPromptConfig) ListProtector.get(list, 0);
                C0XVZ c0xvz = C0XVZ.FORCE_BIND;
                if (bindPromptConfig2.isSkippable && list.size() > 1) {
                    c0xvz = C0XVZ.SKIPPABLE_BIND_PROMPT;
                    bindPromptConfig = (IForceBindingAccountService.BindPromptConfig) ListProtector.get(list, 1);
                } else {
                    bindPromptConfig = null;
                }
                C849720XVa.LIZ(activity2, bindPromptConfig2, bindPromptConfig, "settings_page", "3p_bind_logout", c0xvz, c854760Xg2);
                return;
            }
            return;
        }
        if (i == 1363) {
            ThirdPartyDeprecationExperiment5.LIZ.getClass();
            if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING, null) || ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
                EnumC852660Xce enumC852660Xce = EnumC852660Xce.BIND_PHONE;
                Bundle bundle4 = new Bundle();
                try {
                    JSONObject jSONObjectOptJSONObject = c848150XOz.LJII.optJSONObject("data").optJSONObject("data").optJSONObject("details");
                    if (jSONObjectOptJSONObject != null) {
                        C0XUD.LIZ.getClass();
                        C0XUD.LJIIJJI = false;
                        Block3pLogoutDetailDTO block3pLogoutDetailDTO = (Block3pLogoutDetailDTO) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), C786410Ut5.J3(jSONObjectOptJSONObject), Block3pLogoutDetailDTO.class);
                        C786410Ut5.LJJJI("passport_ticket", block3pLogoutDetailDTO.passportTicket, bundle4);
                        C786410Ut5.LJJJI("source", block3pLogoutDetailDTO.source, bundle4);
                        C786410Ut5.LJJIZ(bundle4, "pii_type", block3pLogoutDetailDTO.piiType);
                        C786410Ut5.LJJIZ(bundle4, "popup_config", block3pLogoutDetailDTO.popupConfig);
                        Block3pLogoutDetailDTO.PiiType piiType = block3pLogoutDetailDTO.piiType;
                        if (piiType == Block3pLogoutDetailDTO.PiiType.EMAIL) {
                            enumC852660Xce = EnumC852660Xce.BIND_EMAIL;
                            C786410Ut5.LJJJI("pii_value", block3pLogoutDetailDTO.piiValue, bundle4);
                            bundle4.putBoolean("pii_clickable", true);
                            C786410Ut5.LJJJI("origin_enter_flow", "verify_1p_email", bundle4);
                            C786410Ut5.LJJJI("enter_flow", "verify_1p_email", bundle4);
                            ThirdPartyDeprecationExperiment5.LIZ.getClass();
                            if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_OPTIONAL.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_OPTIONAL.getValue());
                                c853910Xef = new C853860Xea(block3pLogoutDetailDTO.source);
                            } else {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_FORCE.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_FORCE.getValue());
                                c853910Xef = new C853870Xeb(block3pLogoutDetailDTO.source);
                            }
                        } else if (piiType == Block3pLogoutDetailDTO.PiiType.MOBILE) {
                            C786410Ut5.LJJJI("pii_value", block3pLogoutDetailDTO.piiValue, bundle4);
                            bundle4.putBoolean("pii_clickable", true);
                            C786410Ut5.LJJJI("origin_enter_flow", "verify_1p_phone", bundle4);
                            C786410Ut5.LJJJI("enter_flow", "verify_1p_phone", bundle4);
                            ThirdPartyDeprecationExperiment5.LIZ.getClass();
                            if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_OPTIONAL.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_OPTIONAL.getValue());
                                c853910Xef = new AbstractC854370XfP() { // from class: X.0Xed
                                    public static final int $stable = 0;
                                    public final String LL = "skippable_pii_bind_phone";

                                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                                        return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(PIIBindPromptFragment.PIIBindPromptActions.PrimaryButtonClickAction.class.getSimpleName(), "pii_verify_phone_for_bind"), new Pair(PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction.class.getSimpleName(), ""), new Pair(PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction.class.getSimpleName(), "enter_phone_for_bind"))), new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_phone_for_change"))), new Pair("pii_input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "pii_verify_email_code_for_bind"))), new Pair("pii_verify_phone_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))), new Pair("pii_verify_phone_for_change", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))), new Pair("pii_verify_email_code_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))));
                                    }

                                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                    public String getFirstStepId() {
                                        return this.LL;
                                    }
                                };
                            } else {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_FORCE.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_FORCE.getValue());
                                c853910Xef = new C853880Xec();
                            }
                        } else {
                            C786410Ut5.LJJJI("origin_enter_flow", "add_phone", bundle4);
                            C786410Ut5.LJJJI("enter_flow", "add_phone", bundle4);
                            ThirdPartyDeprecationExperiment5.LIZ.getClass();
                            if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.LOGOUT_PII_BINDING_SKIPPABLE, null)) {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_OPTIONAL.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_OPTIONAL.getValue());
                                c853910Xef = new AbstractC854370XfP() { // from class: X.0Xee
                                    public static final int $stable = 0;
                                    public final String LL = "skippable_pii_input_phone";

                                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                                        return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(PIIBindPromptFragment.PIIBindPromptActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"), new Pair(PIIBindPromptFragment.PIIBindPromptActions.SecondaryButtonClickAction.class.getSimpleName(), ""), new Pair(PIIBindPromptFragment.PIIBindPromptActions.ChangeButtonClickAction.class.getSimpleName(), "input_email_for_bind"))), new Pair("input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_bind"))), new Pair("verify_phone_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))), new Pair("verify_email_code_for_bind", C2097608Jq.LJI(new Pair(BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction.class.getSimpleName(), "create_password"))));
                                    }

                                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                    public String getFirstStepId() {
                                        return this.LL;
                                    }
                                };
                            } else {
                                bundle4.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_FORCE.getValue());
                                bundle4.putInt("phone_number_source", EnumC1237820iJg.GENERAL_POPUP_FORCE.getValue());
                                c853910Xef = new C853910Xef();
                            }
                        }
                        C786410Ut5.LJJJI("page", "failed_3p_login", bundle4);
                        C786410Ut5.LJJJI("enter_method", "logout_page", bundle4);
                        C786410Ut5.LJJJI("enter_from", "settings_page", bundle4);
                        bundle4.putBoolean("from_logout", true);
                        Activity activity3 = this.LIZJ;
                        if (activity3 != null) {
                            String str6 = CommonFlowActivity._pnsPageId;
                            C851380Xaa.LIZIZ(activity3, c853910Xef, enumC852660Xce, bundle4, new C854720Xfy(bundle4, 7));
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return;
                }
            }
        }
        int i2 = c848150XOz.LIZLLL;
        if (i2 != 1346 && i2 != 1363) {
            if (i2 == 1350) {
                C0XVX c0xvx = C0XVX.LIZ;
                Activity activity4 = this.LIZJ;
                String str7 = c848150XOz.LJFF;
                C854760Xg2 c854760Xg22 = new C854760Xg2(this, 1);
                c0xvx.getClass();
                if (activity4 != null && !activity4.isFinishing()) {
                    activity4.runOnUiThread(new ARunnableS18S1200000_13(activity4, c854760Xg22, str7, 6));
                    return;
                } else {
                    c854760Xg22.LIZ();
                    return;
                }
            }
            if (i2 != 1466) {
                C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
                c1233040iBy.LIZJ(C849760XVe.LIZ(c848150XOz));
                c1233040iBy.LIZLLL();
                return;
            }
            return;
        }
        Activity activity5 = this.LIZJ;
        String str8 = c848150XOz.LJFF;
        InterfaceC849390XTt interfaceC849390XTt = new InterfaceC849390XTt() { // from class: X.0XVV
            @Override // X.InterfaceC849390XTt
            public final void LIZ() {
                C0XVU c0xvu = this.LIZIZ;
                c0xvu.LJII.LIZIZ(c0xvu.LJFF, true, false, c0xvu.LJI);
            }

            @Override // X.InterfaceC849390XTt
            public final void LIZIZ() {
                if (c848150XOz.LIZLLL == 1363) {
                    C0XVU c0xvu = this.LIZIZ;
                    c0xvu.LJII.LIZIZ(c0xvu.LJFF, true, true, c0xvu.LJI);
                }
            }
        };
        if (activity5 != null && !TextUtils.isEmpty(str8)) {
            activity5.runOnUiThread(new C0XPC(activity5, interfaceC849390XTt, str8, "log_out_bind"));
        }
    }

    public C0XVU(C0XU6 c0xu6, Activity activity, boolean z, String str, String str2, Bundle bundle) {
        this.LJII = c0xu6;
        this.LIZJ = activity;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = bundle;
    }
}
