package Y;

import X.AbstractC2197911B0j;
import X.C09JN;
import X.C0IJT;
import X.C0KPG;
import X.C0KPH;
import X.C0XIR;
import X.C1909107dp;
import X.C1954807lC;
import X.C1B0X;
import X.C1C7U;
import X.C2188811AlT;
import X.C2197481AzS;
import X.C2197921B0k;
import X.C2197931B0l;
import X.C2197941B0m;
import X.C2197961B0o;
import X.C2197971B0p;
import X.C2197981B0q;
import X.C2197991B0r;
import X.C2198001B0s;
import X.C2198011B0t;
import X.C2198021B0u;
import X.C259800zU;
import X.C474500IjA;
import X.C766270U4b;
import X.EnumC035500An;
import X.EnumC20513215Oo;
import X.InterfaceC2195551AwL;
import X.InterfaceC2195571AwN;
import X.InterfaceC2195601AwQ;
import X.InterfaceC2197871B0f;
import X.InterfaceC500940Jki;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaMerchantIdSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetBeanBalanceResponse;

/* JADX INFO: loaded from: classes35.dex */
public class AfS120S0300000_34 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS120S0300000_34 afS120S0300000_34, Object obj) {
        AbstractC2197911B0j c2197941B0m;
        long currentUserId;
        long currentUserId2;
        long currentUserId3;
        C1C7U.LIZ("EnigmaPurchaseService@d2d.startPurchase$2");
        Throwable th = (Throwable) obj;
        EnigmaPurchaseService enigmaPurchaseService = (EnigmaPurchaseService) afS120S0300000_34.l0;
        C1B0X c1b0x = (C1B0X) afS120S0300000_34.l1;
        InterfaceC2197871B0f interfaceC2197871B0f = (InterfaceC2197871B0f) afS120S0300000_34.l2;
        enigmaPurchaseService.getClass();
        if (th instanceof AbstractC2197911B0j) {
            c2197941B0m = (AbstractC2197911B0j) th;
        } else {
            c2197941B0m = new C2197941B0m(th);
        }
        String str = "";
        if (c2197941B0m instanceof C2197971B0p) {
            C2197971B0p c2197971B0p = (C2197971B0p) c2197941B0m;
            int i = c2197971B0p.LLILZIL;
            String str2 = c2197971B0p.LLILZLL;
            String str3 = c1b0x.LJI;
            String str4 = c1b0x.LJII;
            EnumC20513215Oo enumC20513215Oo = c1b0x.LJIIIIZZ;
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId3 = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId3 = -1;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_iap_precheck_fail");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
            if (str2 == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "message");
            c474500IjALIZ.LJJII(str3, "merchant_id");
            if (str4 != null) {
                str = str4;
            }
            c474500IjALIZ.LJJII(str, "store_country");
            c474500IjALIZ.LJJII(Long.valueOf(currentUserId3), "user_id");
            c474500IjALIZ.LJJII(Integer.valueOf(enumC20513215Oo.getValue()), "flow_type");
            c474500IjALIZ.LIZ();
            C766270U4b.LIZLLL(2131852178);
        } else if (c2197941B0m instanceof C2197931B0l) {
            C2197931B0l c2197931B0l = (C2197931B0l) c2197941B0m;
            int value = c2197931B0l.LLIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2197931B0l.LLILZLL);
            sbLIZ.append(' ');
            sbLIZ.append(c2197931B0l.LLIZ.name());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str5 = c1b0x.LJI;
            String str6 = c1b0x.LJII;
            EnumC20513215Oo enumC20513215Oo2 = c1b0x.LJIIIIZZ;
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            if (interfaceC500940JkiUser2 != null) {
                currentUserId2 = interfaceC500940JkiUser2.getCurrentUserId();
            } else {
                currentUserId2 = -1;
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_enigma_iap_pre_entitlement_fail");
            c474500IjALIZ2.LJJII(Integer.valueOf(value), "code");
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            c474500IjALIZ2.LJJII(strLIZIZ, "message");
            c474500IjALIZ2.LJJII(str5, "merchant_id");
            if (str6 == null) {
                str6 = "";
            }
            c474500IjALIZ2.LJJII(str6, "store_country");
            c474500IjALIZ2.LJJII(Long.valueOf(currentUserId2), "user_id");
            c474500IjALIZ2.LJJII(Integer.valueOf(enumC20513215Oo2.getValue()), "flow_type");
            c474500IjALIZ2.LIZ();
            int i2 = C0KPH.LIZIZ[c2197931B0l.LLIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                C766270U4b.LIZLLL(2131852185);
                            }
                        } else {
                            C766270U4b.LIZLLL(2131852182);
                        }
                    } else {
                        C766270U4b.LIZLLL(2131852180);
                    }
                } else {
                    C766270U4b.LIZLLL(2131852179);
                }
            } else {
                C766270U4b.LIZLLL(2131852184);
            }
        } else if ((c2197941B0m instanceof C2197981B0q) || (c2197941B0m instanceof C2197991B0r)) {
            C766270U4b.LIZLLL(2131852185);
        } else if (c2197941B0m instanceof C2197961B0o) {
            String str7 = c1b0x.LIZLLL;
            int iLIZ = c2197941B0m.LIZ();
            String str8 = ((C2197961B0o) c2197941B0m).LLILZIL;
            EnumC20513215Oo enumC20513215Oo3 = c1b0x.LJIIIIZZ;
            InterfaceC500940Jki interfaceC500940JkiUser3 = UserService.getInstance().user();
            if (interfaceC500940JkiUser3 != null) {
                currentUserId = interfaceC500940JkiUser3.getCurrentUserId();
            } else {
                currentUserId = -1;
            }
            String value2 = LiveEnigmaMerchantIdSetting.INSTANCE.getValue();
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_enigma_iap_create_order");
            c474500IjALIZ3.LJJII(str7, "contract_id");
            c474500IjALIZ3.LJJII(0, "success");
            c474500IjALIZ3.LJJII(Integer.valueOf(iLIZ), "code");
            if (str8 == null) {
                str8 = "";
            }
            c474500IjALIZ3.LJJII(str8, "message");
            c474500IjALIZ3.LJJII(value2, "merchant_id");
            c474500IjALIZ3.LJJII(Long.valueOf(currentUserId), "user_id");
            c474500IjALIZ3.LJJII(Integer.valueOf(enumC20513215Oo3.getValue()), "flow_type");
            c474500IjALIZ3.LIZ();
            C766270U4b.LIZLLL(2131852185);
        } else {
            if (c2197941B0m instanceof C2198001B0s) {
                C0KPG c0kpgLIZIZ = c2197941B0m.LIZIZ();
                if (c0kpgLIZIZ != null) {
                    enigmaPurchaseService.LIZIZ().LJFF(c1b0x.LIZ, c0kpgLIZIZ, c1b0x.LJI, null);
                }
            } else if (c2197941B0m instanceof C2198011B0t) {
                C0KPG c0kpgLIZIZ2 = c2197941B0m.LIZIZ();
                if (c0kpgLIZIZ2 != null) {
                    enigmaPurchaseService.LIZIZ().LJFF(c1b0x.LIZ, c0kpgLIZIZ2, c1b0x.LJI, null);
                }
            } else if (c2197941B0m instanceof C2197921B0k) {
                C0KPG c0kpg = ((C2197921B0k) c2197941B0m).LLILZIL;
                if (c0kpg != null) {
                    enigmaPurchaseService.LIZIZ().LJFF(c1b0x.LIZ, c0kpg, c1b0x.LJI, null);
                }
            } else if (c2197941B0m instanceof C2198021B0u) {
                C766270U4b.LIZLLL(2131852183);
            } else if (c2197941B0m instanceof C2197941B0m) {
                C766270U4b.LIZLLL(2131852185);
            } else {
                throw new C1954807lC();
            }
            interfaceC2197871B0f.LLIIJLIL(c2197941B0m.LL.getValue());
            C1C7U.LIZIZ("EnigmaPurchaseService@d2d.startPurchase$2");
        }
        c2197941B0m.LL.getValue();
        interfaceC2197871B0f.LLIIJI();
        C1C7U.LIZIZ("EnigmaPurchaseService@d2d.startPurchase$2");
    }

    public static final void accept$1(AfS120S0300000_34 afS120S0300000_34, Object obj) {
        boolean z;
        C1C7U.LIZ("MinisCheckBalanceMethodIDL@ff92.handle$task$1");
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2195551AwL.class, null);
        C2197481AzS c2197481AzS = (C2197481AzS) afS120S0300000_34.l1;
        InterfaceC2195601AwQ interfaceC2195601AwQ = (InterfaceC2195601AwQ) afS120S0300000_34.l2;
        InterfaceC2195551AwL interfaceC2195551AwL = (InterfaceC2195551AwL) xBaseModelLIZJ;
        interfaceC2195551AwL.setSuccess(Boolean.TRUE);
        InterfaceC2195571AwN interfaceC2195571AwN = (InterfaceC2195571AwN) C1909107dp.LIZJ(InterfaceC2195571AwN.class, null);
        if (((MinisGetBeanBalanceResponse) obj).balance >= interfaceC2195601AwQ.getAmount().longValue()) {
            z = true;
        } else {
            z = false;
        }
        interfaceC2195571AwN.setSufficient(Boolean.valueOf(z));
        interfaceC2195551AwL.setData(interfaceC2195571AwN);
        C2197481AzS.LIZJ(c2197481AzS, "check_balance_success", 0, null, c2197481AzS.LIZ("check_balance_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
        C2197481AzS.LIZJ(c2197481AzS, "minis_checkbalance_jsb_result_success", 0, null, c2197481AzS.LIZ("minis_checkbalance_jsb_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
        ((CompletionBlock) afS120S0300000_34.l0).onSuccess(interfaceC2195551AwL, "");
        C1C7U.LIZIZ("MinisCheckBalanceMethodIDL@ff92.handle$task$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS120S0300000_34 afS120S0300000_34, Object obj) {
        C1C7U.LIZ("MinisCheckBalanceMethodIDL@ff92.handle$task$2");
        Throwable th = (Throwable) obj;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2195551AwL.class, null);
        C2197481AzS c2197481AzS = (C2197481AzS) afS120S0300000_34.l1;
        C259800zU c259800zU = (C259800zU) afS120S0300000_34.l2;
        InterfaceC2195551AwL interfaceC2195551AwL = (InterfaceC2195551AwL) xBaseModelLIZJ;
        Boolean bool = Boolean.FALSE;
        interfaceC2195551AwL.setSuccess(bool);
        InterfaceC2195571AwN interfaceC2195571AwN = (InterfaceC2195571AwN) C1909107dp.LIZJ(InterfaceC2195571AwN.class, null);
        interfaceC2195571AwN.setSufficient(bool);
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            interfaceC2195551AwL.setErrorCode(Integer.valueOf(c0xir.getErrorCode()));
            interfaceC2195551AwL.setErrorMsg(c0xir.getErrorMsg());
            C2197481AzS.LIZJ(c2197481AzS, "check_balance_fail", c0xir.getErrorCode(), null, c2197481AzS.LIZ("check_balance_start"), 0, 0L, 0L, null, null, 0, "server", null, false, null, null, null, 64500);
            C2197481AzS.LIZJ(c2197481AzS, "minis_checkbalance_jsb_result_fail", c0xir.getErrorCode(), null, c2197481AzS.LIZ("minis_checkbalance_jsb_start"), 0, 0L, 0L, null, null, 0, "server", null, false, null, null, null, 64500);
        } else {
            EnumC035500An enumC035500An = EnumC035500An.ERROR_COMMON_NETWORK_ERROR;
            interfaceC2195551AwL.setErrorCode(Integer.valueOf(enumC035500An.getErrorCode()));
            interfaceC2195551AwL.setErrorMsg((String) c259800zU.element);
            C2197481AzS.LIZJ(c2197481AzS, "check_balance_fail", enumC035500An.getErrorCode(), null, c2197481AzS.LIZ("check_balance_start"), 0, 0L, 0L, null, null, 0, "server", null, false, null, null, null, 64500);
            C2197481AzS.LIZJ(c2197481AzS, "minis_checkbalance_jsb_result_fail", enumC035500An.getErrorCode(), null, c2197481AzS.LIZ("minis_checkbalance_jsb_start"), 0, 0L, 0L, null, c2197481AzS.LIZIZ, 0, "server", null, false, null, null, null, 64244);
        }
        interfaceC2195551AwL.setData(interfaceC2195571AwN);
        ((CompletionBlock) afS120S0300000_34.l0).onSuccess(interfaceC2195551AwL, "");
        C1C7U.LIZIZ("MinisCheckBalanceMethodIDL@ff92.handle$task$2");
    }

    public AfS120S0300000_34(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
