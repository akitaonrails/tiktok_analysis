package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.token.TTTokenUtils;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ChangeRemoveBindingResultEvent;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.UnbindResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.ss.android.ugc.aweme.user.UserStore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C854460XfY {
    public static final C854460XfY LIZ = new C854460XfY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(428));

    public static HashMap LJI() {
        return (HashMap) LIZIZ.getValue();
    }

    public static List LJII() {
        JSONObject jSONObject;
        C0XO3 c0xo3LIZIZ = C0XGI.LIZIZ();
        JSONArray jSONArrayOptJSONArray = (c0xo3LIZIZ == null || (jSONObject = c0xo3LIZIZ.LJJII) == null) ? null : jSONObject.optJSONArray("connects");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i), "platform");
                    if (string.length() > 0) {
                        linkedHashSet.add(string);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static List LIZLLL(Bundle bundle) {
        ArrayList arrayList;
        Serializable serializable = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("eligible_verification_methods");
        }
        if ((serializable instanceof ArrayList) && (arrayList = (ArrayList) serializable) != null) {
            return arrayList;
        }
        return new ArrayList();
    }

    public static ArrayList LJ(boolean z) {
        UserStore.LIZ.getClass();
        User userLIZJ = UserStore.LIZJ(false);
        ArrayList arrayList = new ArrayList();
        if (userLIZJ.isHasEmail() && z) {
            arrayList.add("email");
        }
        if (userLIZJ.isPhoneBinded() && !z) {
            arrayList.add("mobile");
        }
        arrayList.addAll(LJII());
        return arrayList;
    }

    public static Map LJIIIIZZ(Bundle bundle) {
        Integer numValueOf;
        Map mapLIZJ;
        int i = bundle.getInt("non1p_binding_type");
        if (i == 0 || (numValueOf = Integer.valueOf(i)) == null || (mapLIZJ = C2097908Jt.LIZJ(new Pair("non1p_binding_type", String.valueOf(numValueOf.intValue())))) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    public static Map LJIIIZ(BaseAccountFlowFragment baseAccountFlowFragment) {
        Integer numValueOf;
        Map mapLIZJ;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null || (numValueOf = Integer.valueOf(arguments.getInt("non1p_binding_type"))) == null || numValueOf.intValue() == 0 || numValueOf == null || (mapLIZJ = C2097908Jt.LIZJ(new Pair("non1p_binding_type", String.valueOf(numValueOf.intValue())))) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    public static String LJIIJ(BaseAccountFlowFragment baseAccountFlowFragment) {
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("passport_ticket");
        }
        return null;
    }

    public static Map LJIIJJI(BaseAccountFlowFragment baseAccountFlowFragment) {
        Map mapLIZJ;
        String strLJIIJ = LJIIJ(baseAccountFlowFragment);
        if (strLJIIJ == null || (mapLIZJ = C2097908Jt.LIZJ(new Pair("passport_ticket", strLJIIJ))) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    public static boolean LJIIZILJ(boolean z) {
        int i;
        UserStore.LIZ.getClass();
        User userLIZJ = UserStore.LIZJ(false);
        if (userLIZJ.isHasEmail() && z) {
            i = 1;
        } else {
            i = 0;
        }
        if (userLIZJ.isPhoneBinded() && !z) {
            i++;
        }
        if (!LJII().isEmpty()) {
            i++;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(BaseAccountFlowFragment baseAccountFlowFragment, Function1 function1) {
        C0CQ3 c0cq3 = InterfaceC1234150iDl.LIZ;
        String strLJIIJ = LJIIJ(baseAccountFlowFragment);
        if (strLJIIJ == null) {
            strLJIIJ = "";
        }
        c0cq3.getClass();
        InterfaceC1234150iDl interfaceC1234150iDl = C0CQ3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/passport/email/unbind/");
        interfaceC1234150iDl.LIZ(strLJIIJ, TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ))).LJ(new C854730Xfz(baseAccountFlowFragment, function1, 1), C15O7.LJIIIIZZ, null);
    }

    public static void LIZJ(BaseAccountFlowFragment baseAccountFlowFragment, Function1 function1) {
        C0CQ3 c0cq3 = InterfaceC1234150iDl.LIZ;
        String strLJIIJ = LJIIJ(baseAccountFlowFragment);
        if (strLJIIJ == null) {
            strLJIIJ = "";
        }
        c0cq3.getClass();
        InterfaceC1234150iDl interfaceC1234150iDl = C0CQ3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/passport/mobile/unbind/");
        interfaceC1234150iDl.LIZIZ(strLJIIJ, TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ))).LJ(new C854730Xfz(baseAccountFlowFragment, function1, 2), C15O7.LJIIIIZZ, null);
    }

    public static List LJFF(BaseAccountFlowFragment baseAccountFlowFragment, VerificationMethodType verificationMethodType) {
        ArrayList arrayList = new ArrayList(C13LP.LJLLJ(LIZLLL(baseAccountFlowFragment.getArguments())));
        if (LJIILL(baseAccountFlowFragment, verificationMethodType)) {
            arrayList.remove(VerificationMethodType.MOBILE);
        } else {
            if (LJIILJJIL(baseAccountFlowFragment, verificationMethodType)) {
                arrayList.remove(VerificationMethodType.EMAIL);
                return arrayList;
            }
            if (baseAccountFlowFragment.VR() == EnumC852910Xd3.VERIFY_PASSWORD || baseAccountFlowFragment.VR() == EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_PASSWORD || baseAccountFlowFragment.VR() == EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PASSWORD || verificationMethodType == VerificationMethodType.PASSWORD) {
                arrayList.remove(VerificationMethodType.PASSWORD);
                return arrayList;
            }
        }
        return arrayList;
    }

    public static boolean LJIILIIL(String str, String str2) {
        if ((str != null && u.LJJIIJZLJL(str, "3p_bind", false)) || Intrinsics.LJFF(str2, "popup_add_phone_1p_email") || Intrinsics.LJFF(str2, "popup_verify_1p_email") || Intrinsics.LJFF(str2, "popup_change_1p_email") || Intrinsics.LJFF(str2, "popup_binding_verification") || Intrinsics.LJFF(str2, "failed_3p_login")) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(BaseAccountFlowFragment baseAccountFlowFragment, VerificationMethodType verificationMethodType) {
        if (!C1697810uHb.LJIIJJI(EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_EMAIL, EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE, EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_EMAIL, EnumC852910Xd3.EMAIL_SMS_VERIFY, EnumC852910Xd3.EMAIL_SMS_CHANGE, EnumC852910Xd3.EMAIL_SMS_BIND).contains(baseAccountFlowFragment.VR()) && verificationMethodType != VerificationMethodType.EMAIL) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL(BaseAccountFlowFragment baseAccountFlowFragment, VerificationMethodType verificationMethodType) {
        if (!C1697810uHb.LJIIJJI(EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PHONE, EnumC852910Xd3.UNBIND_PHONE_VERIFY, EnumC852910Xd3.PHONE_SMS_VERIFY, EnumC852910Xd3.PHONE_SMS_BIND, EnumC852910Xd3.PHONE_SMS_MODIFY).contains(baseAccountFlowFragment.VR()) && verificationMethodType != VerificationMethodType.MOBILE) {
            return false;
        }
        return true;
    }

    public static CharSequence LIZ(BaseActivity baseActivity, String str, boolean z, View.OnClickListener onClickListener) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            i = 7;
        } else {
            i = 8;
        }
        spannableStringBuilder.append((CharSequence) C19293810e0.LJII(baseActivity, Integer.valueOf(i), onClickListener));
        return spannableStringBuilder;
    }

    public static void LJIIL(BaseAccountFlowFragment baseAccountFlowFragment, C15O7 c15o7, boolean z, Function1 function1) {
        boolean z2;
        if (C09UZ.LIZLLL(c15o7) && ((UnbindResponse) c15o7.LJIIL()).data != null) {
            UnbindResponse.Data data = ((UnbindResponse) c15o7.LJIIL()).data;
            if (data != null && data.errorCode == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Integer numValueOf = null;
            if (z2) {
                User userLIZJ = C0XQ5.LIZJ();
                C853770XeR.LIZ.getClass();
                if (C853770XeR.LIZ(baseAccountFlowFragment)) {
                    userLIZJ.setPhoneBinded(false);
                    userLIZJ.setBindPhone("");
                    String uid = userLIZJ.getUid();
                    if (uid != null) {
                        C0XUE c0xue = C0XUE.LIZ;
                        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(c0xue.LJ(uid));
                        if (baseLoginMethod instanceof PhoneLoginMethod) {
                            c0xue.LIZ(baseLoginMethod, userLIZJ);
                        }
                        GSMAService gSMAService = GSMAService.INSTANCE;
                        if (Intrinsics.LJFF(gSMAService.getGSMALocalCache(null, null).uid, uid)) {
                            gSMAService.removeGSMALocalCache();
                        }
                    }
                } else {
                    userLIZJ.setHasEmail(false);
                    userLIZJ.setEmail("");
                    userLIZJ.setEmailVerified(false);
                    String uid2 = userLIZJ.getUid();
                    if (uid2 != null) {
                        C0XUE c0xue2 = C0XUE.LIZ;
                        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) C13LP.LJJJLL(c0xue2.LJ(uid2));
                        if (baseLoginMethod2 instanceof AccountPassLoginMethod) {
                            c0xue2.LIZ(baseLoginMethod2, userLIZJ);
                        }
                    }
                }
                C1440005kM.LIZ(new C854270XfF());
                C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                c1076010e6h.LJJI().LIZIZ();
                c1076010e6h.LJJI().LIZ(System.currentTimeMillis());
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("unbind_success", true);
                bundle.putInt("unbind_type", baseAccountFlowFragment.SR().getValue());
                baseAccountFlowFragment.WR(bundle);
                LJIILLIIL(baseAccountFlowFragment, z, baseAccountFlowFragment.getEnterFrom(), baseAccountFlowFragment.getEnterMethod(), String.valueOf(data.errorCode), 1, true, baseAccountFlowFragment.RR());
                return;
            }
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("unbind_success", false);
            bundle2.putInt("unbind_type", baseAccountFlowFragment.SR().getValue());
            baseAccountFlowFragment.WR(bundle2);
            String enterFrom = baseAccountFlowFragment.getEnterFrom();
            String enterMethod = baseAccountFlowFragment.getEnterMethod();
            if (data != null) {
                numValueOf = Integer.valueOf(data.errorCode);
            }
            LJIILLIIL(baseAccountFlowFragment, z, enterFrom, enterMethod, String.valueOf(numValueOf), 0, true, baseAccountFlowFragment.RR());
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(baseAccountFlowFragment);
        c1389890mGx.LJIIIZ(2131835079);
        c1389890mGx.LJIIJJI();
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public static void LJIILLIIL(BaseAccountFlowFragment baseAccountFlowFragment, boolean z, String str, String str2, String str3, int i, boolean z2, String str4) {
        EnumC854530Xff enumC854530Xff;
        EnumC854510Xfd enumC854510Xfd;
        EnumC854520Xfe enumC854520Xfe;
        EnumC854490Xfb enumC854490Xfb;
        ChangeRemoveBindingResultEvent changeRemoveBindingResultEvent = new ChangeRemoveBindingResultEvent();
        changeRemoveBindingResultEvent.LJI(str3, "error_code");
        changeRemoveBindingResultEvent.LJI(str, "enter_from");
        changeRemoveBindingResultEvent.LJI(str2, "enter_method");
        if (z2) {
            enumC854530Xff = EnumC854530Xff.UNLINK;
        } else {
            enumC854530Xff = EnumC854530Xff.CHANGE;
        }
        changeRemoveBindingResultEvent.LJI(enumC854530Xff.getValue(), "action_type");
        if (z) {
            enumC854510Xfd = EnumC854510Xfd.PHONE;
        } else {
            enumC854510Xfd = EnumC854510Xfd.EMAIL;
        }
        changeRemoveBindingResultEvent.LJI(enumC854510Xfd.getValue(), "unlink_type");
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments != null && arguments.getBoolean("is_safe_env")) {
            enumC854520Xfe = EnumC854520Xfe.DIGITAL_1;
        } else {
            enumC854520Xfe = EnumC854520Xfe.DIGITAL_0;
        }
        changeRemoveBindingResultEvent.LJI(Integer.valueOf(enumC854520Xfe.getValue()), "is_safe_env");
        if (z) {
            enumC854490Xfb = EnumC854490Xfb.NULL;
        } else if (C0XQ5.LIZJ().isEmailVerified()) {
            enumC854490Xfb = EnumC854490Xfb.DIGITAL_1;
        } else {
            enumC854490Xfb = EnumC854490Xfb.DIGITAL_0;
        }
        changeRemoveBindingResultEvent.LJI(enumC854490Xfb.getValue(), "is_email_verified");
        changeRemoveBindingResultEvent.LJI(String.valueOf(i), "is_success");
        changeRemoveBindingResultEvent.LJI(str4, "page");
        changeRemoveBindingResultEvent.LJIIIIZZ();
    }
}
