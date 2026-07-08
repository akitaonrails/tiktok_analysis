package X;

import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.login.model.UnknownMethod;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import defpackage.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUU {
    public static List<String> LIZJ;
    public static final C0XUU LIZ = new C0XUU();
    public static int LIZIZ = -1;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(233));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(232));
    public static String LJFF = "";

    public static void LIZ(Integer num, String str, InterfaceC849490XUd interfaceC849490XUd) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0XTW
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AccountSwitcher@17bf.fail$1");
                try {
                    C0XQ5.LJIIJ(null, false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AccountSwitcher@17bf.fail$1");
            }
        });
        if (interfaceC849490XUd != null) {
            interfaceC849490XUd.LIZ(num, str);
        }
    }

    public static void LIZLLL(C0XO3 c0xo3, Bundle bundle, InterfaceC849490XUd interfaceC849490XUd) {
        String str;
        boolean z;
        String string;
        Long lValueOf;
        C0XQ5.LJIIL(c0xo3, "account_switch");
        C847910XOb c847910XOb = C847910XOb.LIZ;
        if (c0xo3 != null) {
            str = c0xo3.LJFF;
        } else {
            str = null;
        }
        c847910XOb.getClass();
        HashMap map = new HashMap();
        if (str != null) {
            map.put("sec_uid", str);
        }
        Iterator it2 = C847910XOb.LIZJ().iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            } else {
                C847910XOb.LJIIIIZZ(0, (String) it2.next(), map);
            }
        }
        if (c0xo3 != null) {
            string = Long.valueOf(c0xo3.LIZ).toString();
        } else {
            string = null;
        }
        if (string != null && string.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (C849710XUz.class) {
                if (string.length() != 0) {
                    JSONArray jSONArrayLIZ = C849710XUz.LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", string);
                    jSONObject.put("ts", jCurrentTimeMillis);
                    jSONArrayLIZ.put(jSONObject);
                    while (jSONArrayLIZ.length() > 100) {
                        jSONArrayLIZ.remove(0);
                    }
                    ((Keva) C849710XUz.LIZ.getValue()).storeString("entries", jSONArrayLIZ.toString());
                }
            }
            String string2 = bundle.getString("previous_uid");
            if (string2 != null && string2.length() != 0 && !Intrinsics.LJFF(string2, string)) {
                C849710XUz.LIZJ(jCurrentTimeMillis - 1, string2);
            }
        }
        if (interfaceC849490XUd != null) {
            interfaceC849490XUd.onSuccess();
        }
        if (C293980Bfg.LIZ()) {
            C0XVI c0xvi = new C0XVI(bundle, c0xo3, true);
            CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
            C0XV8.LIZIZ();
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ)), null, null, new C0NPJ(c0xvi, null), 3);
        } else if (C294010Bfj.LIZIZ() != 0) {
            C849800XVi c849800XVi = C849800XVi.LIZ;
            if (c0xo3 != null) {
                lValueOf = Long.valueOf(c0xo3.LIZ);
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            c849800XVi.getClass();
            C0XVC.LIZ(null, "AfterSwitchAccountHook", "switch_account");
            AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
            C0XQ5.LIZ().LJJJJ(strValueOf);
            IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
            if (iAccountSwitcherLogger != null) {
                iAccountSwitcherLogger.LJ();
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS82S0200000_13(bundle, accountUserServiceLIZ, 103));
            if (C294010Bfj.LIZIZ() == 1 || C294010Bfj.LIZIZ() == 3 || C294010Bfj.LIZIZ() == 4) {
                z = true;
            }
            C0XVM.LIZIZ(bundle, null, z, true).LJ(new C854740Xg0(bundle, 2), C15O7.LJIIIIZZ, null);
        } else if (bundle == null) {
            C15O7.LJIIIZ(new Exception("Bundle is empty"));
        } else {
            AccountUserService accountUserServiceLIZ2 = C0XQ5.LIZ();
            C0XVC.LIZ(null, "RefreshAwemeUserHook", "switch_account");
            C0X3A.LIZIZ(bundle).LJI(new C854730Xfz(accountUserServiceLIZ2, bundle, 3));
        }
        HashMap map2 = new HashMap();
        map2.put("event", "switch account successfully");
        C836930WsN.LIZ.LIZIZ(map2.toString());
        ComplianceServiceProvider.LJJI().LJIJJ();
    }

    public static void LJI(Bundle bundle, C849480XUc c849480XUc, InterfaceC849490XUd interfaceC849490XUd) {
        BaseLoginMethod unknownMethod;
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.LIZJ();
        }
        LIZLLL(c849480XUc.LJIIIZ, bundle, interfaceC849490XUd);
        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
        C0XO3 c0xo3 = c849480XUc.LJIIIZ;
        if (c0xo3 != null) {
            if (iPrevLoginPlatformService.LIZ(c0xo3.LIZ).length() == 0) {
                iPrevLoginPlatformService.LIZLLL(c849480XUc.LJIIIZ.LIZ, iPrevLoginPlatformService.LJII());
            }
            iPrevLoginPlatformService.LJIIJ(iPrevLoginPlatformService.LIZ(c849480XUc.LJIIIZ.LIZ));
            C0XUE c0xue = C0XUE.LIZ;
            c0xue.getClass();
            if (C0XUK.LIZ()) {
                List<BaseLoginMethod> list = C0XUE.LIZIZ;
                if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(((BaseLoginMethod) it2.next()).getUid(), String.valueOf(c0xo3.LIZ))) {
                            return;
                        }
                    }
                }
                String strLIZLLL = C0XQ5.LIZLLL();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = c0xo3.LJJIFFI;
                String str2 = c0xo3.LJIIIZ;
                if (!C1533950q1J.LJ(str2)) {
                    str2 = null;
                }
                String str3 = c0xo3.LJIIJ;
                if (!C1533950q1J.LJ(str3)) {
                    str3 = null;
                }
                if (c0xo3.LJIJJ) {
                    unknownMethod = new C0XUT(strLIZLLL, null, Long.valueOf(jCurrentTimeMillis), 246);
                } else if (C1533950q1J.LJ(c0xo3.LJIIIZ)) {
                    LoginMethodName loginMethodName = LoginMethodName.PHONE_NUMBER_PASS;
                    PhoneNumberUtil.PhoneNumber phoneNumberCreate = PhoneNumberUtil.PhoneNumber.create(0, c0xo3.LJIIIZ);
                    Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                    CommonUserInfo.Companion.getClass();
                    unknownMethod = new PhoneLoginMethod(strLIZLLL, loginMethodName, phoneNumberCreate, C0XTZ.LIZ(), lValueOf, -1L, false, null, null, null);
                } else if (C1533950q1J.LJ(c0xo3.LJIIJ)) {
                    LoginMethodName loginMethodName2 = LoginMethodName.EMAIL_PASS;
                    String str4 = c0xo3.LJIIJ;
                    Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
                    Boolean bool = Boolean.TRUE;
                    CommonUserInfo.Companion.getClass();
                    unknownMethod = new AccountPassLoginMethod(strLIZLLL, loginMethodName2, str4, C0XTZ.LIZ(), lValueOf2, -1L, null, null, null, bool, null, null, null);
                } else {
                    String str5 = "";
                    if (c0xo3.LJIILIIL) {
                        LoginMethodName loginMethodName3 = LoginMethodName.USER_NAME_PASS;
                        String str6 = c0xo3.LJIIJJI;
                        if (str6 == null) {
                            str6 = "";
                        }
                        Long lValueOf3 = Long.valueOf(jCurrentTimeMillis);
                        CommonUserInfo.Companion.getClass();
                        unknownMethod = new AccountPassLoginMethod(strLIZLLL, loginMethodName3, str6, C0XTZ.LIZ(), lValueOf3, -1L, null, null, null, null, null, null, null);
                    } else {
                        Map<String, C0XO4> map = c0xo3.LIZLLL;
                        if (map != null && !((HashMap) map).isEmpty()) {
                            Map.Entry entry = (Map.Entry) C13LP.LJJJLIIL(((HashMap) c0xo3.LIZLLL).entrySet());
                            if (entry != null) {
                                String str7 = (String) entry.getKey();
                                C0XUS c0xus = TPUserInfo.Companion;
                                User userLIZJ = C0XQ5.LIZJ();
                                c0xus.getClass();
                                TPUserInfo tPUserInfoLIZ = C0XUS.LIZ(userLIZJ);
                                CommonUserInfo.Companion.getClass();
                                unknownMethod = new TPLoginMethod(strLIZLLL, str7, tPUserInfoLIZ, false, C0XTZ.LIZ(), Long.valueOf(jCurrentTimeMillis), -1L, null, null, null);
                            } else {
                                String strValueOf = String.valueOf(c0xo3.LIZ);
                                if (strValueOf != null) {
                                    str5 = strValueOf;
                                }
                                Long lValueOf4 = Long.valueOf(jCurrentTimeMillis);
                                LoginMethodName loginMethodName4 = LoginMethodName.UNKNOWN;
                                CommonUserInfo.Companion.getClass();
                                unknownMethod = new UnknownMethod(str5, loginMethodName4, C0XTZ.LIZ(), lValueOf4, -1L, null);
                            }
                        } else {
                            String strValueOf2 = String.valueOf(c0xo3.LIZ);
                            if (strValueOf2 == null) {
                                strValueOf2 = "";
                            }
                            Long lValueOf5 = Long.valueOf(jCurrentTimeMillis);
                            LoginMethodName loginMethodName5 = LoginMethodName.UNKNOWN;
                            CommonUserInfo.Companion.getClass();
                            unknownMethod = new UnknownMethod(strValueOf2, loginMethodName5, C0XTZ.LIZ(), lValueOf5, -1L, null);
                        }
                    }
                }
                unknownMethod.setSuccessfulLoginToken(str);
                unknownMethod.setMaskedPhone(str2);
                unknownMethod.setMaskedEmail(str3);
                c0xue.LJI(unknownMethod, true);
            }
        }
    }

    public static final void LJ(SignificantUserInfo significantUserInfo, Bundle bundle, boolean z, boolean z2, InterfaceC849490XUd interfaceC849490XUd) {
        Bundle bundle2;
        String curUserId;
        boolean zLJI = MethodIDManager.LJI(196714);
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJII(EnumC19283910cP.SWITCH_ACCOUNT_DEACTIVATE);
        }
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.start();
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        LIZ.getClass();
        C01GW c01gw = LIZLLL;
        if (((IAccountUserService) c01gw.getValue()).isLogin()) {
            curUserId = ((IAccountUserService) c01gw.getValue()).getCurUserId();
        } else {
            curUserId = LJFF;
        }
        C786410Ut5.LJJJI("previous_uid", curUserId, bundle2);
        if (n0.LIZ) {
            String str = C2273401Dyc.LIZLLL;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0XTV(C2273401Dyc.LIZ(C2273401Dyc.LJFF.get(significantUserInfo.uid)), str, significantUserInfo, bundle, z, z2, interfaceC849490XUd, bundle2, null), 3);
        } else {
            LIZJ(significantUserInfo, bundle, z, z2, interfaceC849490XUd, bundle2);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0XUY] */
    public static void LIZIZ(final SignificantUserInfo significantUserInfo, final Bundle bundle, final boolean z, boolean z2, final InterfaceC849490XUd interfaceC849490XUd, final Bundle bundle2) {
        String str;
        C0XGC c0xgc = C0XGC.LIZ;
        String str2 = significantUserInfo.uid;
        c0xgc.getClass();
        Map mapLJ = C0XGC.LJ(str2);
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((InterfaceC849540XUi) LJ.getValue()).LJ(significantUserInfo.uid, C2097608Jq.LJIILIIL(mapLJ, new Pair("force_switch", str)), new AbstractC849460XUa() { // from class: X.0XUY
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                C0XUU c0xuu = C0XUU.LIZ;
                InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                Bundle bundle3 = bundle2;
                c0xuu.getClass();
                C0XUU.LJI(bundle3, (C849480XUc) c0xga, interfaceC849490XUd2);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                C0XUU c0xuu = C0XUU.LIZ;
                SignificantUserInfo significantUserInfo2 = significantUserInfo;
                Bundle bundle3 = bundle;
                boolean z3 = z;
                InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                Bundle bundle4 = bundle2;
                c0xuu.getClass();
                C0XUU.LJFF((C849480XUc) c0xga, i, significantUserInfo2, bundle3, z3, interfaceC849490XUd2, bundle4);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0XUZ] */
    public static void LIZJ(final SignificantUserInfo significantUserInfo, final Bundle bundle, final boolean z, boolean z2, final InterfaceC849490XUd interfaceC849490XUd, final Bundle bundle2) {
        String str;
        boolean z3;
        String str2;
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "switch_account_v2_new", true) != 0) {
            if (C123100dR.LIZ(significantUserInfo.vdc) && C123100dR.LIZ(significantUserInfo.storeCountry) && C123100dR.LIZ(significantUserInfo.sessionId)) {
                C0XGC c0xgc = C0XGC.LIZ;
                String str3 = significantUserInfo.uid;
                c0xgc.getClass();
                Map mapLJ = C0XGC.LJ(str3);
                if (z2) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                Map mapLJIILIIL = C2097608Jq.LJIILIIL(mapLJ, new Pair("force_switch", str));
                InterfaceC849540XUi interfaceC849540XUi = (InterfaceC849540XUi) LJ.getValue();
                String str4 = significantUserInfo.uid;
                String str5 = significantUserInfo.sessionId;
                if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "switch_account_v2_new", true) == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str6 = null;
                if (z3) {
                    str2 = significantUserInfo.vdc;
                } else {
                    str2 = null;
                }
                if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "switch_account_v2_new", true) == 1) {
                    str6 = significantUserInfo.storeCountry;
                }
                interfaceC849540XUi.LJII(str4, str5, str2, str6, mapLJIILIIL, new AbstractC849460XUa() { // from class: X.0XUZ
                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        C0XUU c0xuu = C0XUU.LIZ;
                        InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                        Bundle bundle3 = bundle2;
                        c0xuu.getClass();
                        C0XUU.LJI(bundle3, (C849480XUc) c0xga, interfaceC849490XUd2);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        C0XUU c0xuu = C0XUU.LIZ;
                        SignificantUserInfo significantUserInfo2 = significantUserInfo;
                        Bundle bundle3 = bundle;
                        boolean z4 = z;
                        InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                        Bundle bundle4 = bundle2;
                        c0xuu.getClass();
                        C0XUU.LJFF((C849480XUc) c0xga, i, significantUserInfo2, bundle3, z4, interfaceC849490XUd2, bundle4);
                    }
                });
                return;
            }
            LIZIZ(significantUserInfo, bundle, z, z2, interfaceC849490XUd, bundle2);
            return;
        }
        LIZIZ(significantUserInfo, bundle, z, z2, interfaceC849490XUd, bundle2);
    }

    public static void LJFF(final C849480XUc c849480XUc, final int i, final SignificantUserInfo significantUserInfo, final Bundle bundle, final boolean z, final InterfaceC849490XUd interfaceC849490XUd, final Bundle bundle2) {
        SignificantUserInfo significantUserInfoLJIIJJI;
        String strOptString;
        List<String> list;
        String str;
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.reset();
        }
        if (i == 1 || i == 4) {
            String str2 = significantUserInfo.uid;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0XUE c0xue = C0XUE.LIZ;
            c0xue.LJIIJJI(jCurrentTimeMillis, str2);
            C0XQ5.LIZ().getClass();
            if (str2 == null) {
                significantUserInfoLJIIJJI = null;
            } else {
                C848230XPh.LL.getClass();
                significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str2);
            }
            c0xue.LJIILL(significantUserInfoLJIIJJI);
            ((IAccountUserService) LIZLLL.getValue()).LJ(str2);
        }
        Integer numValueOf = Integer.valueOf(c849480XUc.LIZLLL);
        String str3 = c849480XUc.LJFF;
        HashMap map = new HashMap();
        map.put("event", "switch account failed");
        map.put("errorCode", String.valueOf(numValueOf));
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        map.put("errorMsg", str3);
        C836930WsN.LIZ.LIZIZ(map.toString());
        List<String> list2 = LIZJ;
        if (list2 != null && z) {
            int i2 = LIZIZ - 1;
            LIZIZ = i2;
            if (i2 >= 0 && i2 < list2.size() && (list = LIZJ) != null && (str = (String) ListProtector.get(list, LIZIZ)) != null) {
                C848230XPh.LL.getClass();
                SignificantUserInfo significantUserInfoLJIIJJI2 = C848230XPh.LJIIJJI(str);
                if (significantUserInfoLJIIJJI2 != null) {
                    LJ(significantUserInfoLJIIJJI2, bundle, true, false, interfaceC849490XUd);
                    return;
                }
            }
        }
        if (i != 1349 && i != 1364) {
            if (i == 1450) {
                Activity activityLJFF = C2214201BlK.LJFF();
                JSONObject jSONObject = c849480XUc.LJII;
                C0XQH c0xqh = new C0XQH() { // from class: X.0XUW
                    @Override // X.C0XQH
                    public final void LIZJ() {
                        C0XUU c0xuu = C0XUU.LIZ;
                        Integer numValueOf2 = Integer.valueOf(c849480XUc.LIZLLL);
                        String str5 = c849480XUc.LJFF;
                        InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                        c0xuu.getClass();
                        C0XUU.LIZ(numValueOf2, str5, interfaceC849490XUd2);
                    }

                    @Override // X.C0XQH
                    public final void LIZ(C0XO3 c0xo3) {
                        C0XUU c0xuu = C0XUU.LIZ;
                        Bundle bundle3 = bundle2;
                        InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                        c0xuu.getClass();
                        C0XUU.LIZLLL(c0xo3, bundle3, interfaceC849490XUd2);
                    }
                };
                if (activityLJFF != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("webapp_url", "")) != null) {
                        str4 = strOptString;
                    }
                    if (str4.length() != 0) {
                        C0XQF.LIZLLL = c0xqh;
                        SmartRouter.buildRoute(activityLJFF, str4).open();
                        return;
                    }
                }
            }
            int i3 = c849480XUc.LIZLLL;
            if (i3 == 1466) {
                return;
            }
            LIZ(Integer.valueOf(i3), c849480XUc.LJFF, interfaceC849490XUd);
            return;
        }
        Activity activityLJFF2 = C2214201BlK.LJFF();
        String str5 = c849480XUc.LJFF;
        InterfaceC849390XTt interfaceC849390XTt = new InterfaceC849390XTt() { // from class: X.0XUX
            @Override // X.InterfaceC849390XTt
            public final void LIZ() {
                C0XUU.LJ(significantUserInfo, bundle, z, false, interfaceC849490XUd);
            }

            @Override // X.InterfaceC849390XTt
            public final void LIZIZ() {
                if (i == 1364) {
                    C0XUU.LJ(significantUserInfo, bundle, z, true, interfaceC849490XUd);
                    return;
                }
                C0XUU c0xuu = C0XUU.LIZ;
                Integer numValueOf2 = Integer.valueOf(c849480XUc.LIZLLL);
                String str6 = c849480XUc.LJFF;
                InterfaceC849490XUd interfaceC849490XUd2 = interfaceC849490XUd;
                c0xuu.getClass();
                C0XUU.LIZ(numValueOf2, str6, interfaceC849490XUd2);
            }
        };
        if (activityLJFF2 != null && !TextUtils.isEmpty(str5)) {
            activityLJFF2.runOnUiThread(new C0XPC(activityLJFF2, interfaceC849390XTt, str5, "switch_account_bind"));
        }
    }
}
