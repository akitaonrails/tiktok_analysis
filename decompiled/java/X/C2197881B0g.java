package X;

import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaMerchantIdSetting;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.1B0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197881B0g {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, String str, String str2) {
        long currentUserId;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = -1;
        }
        String value = LiveEnigmaMerchantIdSetting.INSTANCE.getValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_iap_product_details");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "message");
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "store_country");
        c474500IjALIZ.LJJII("gp", "channel");
        c474500IjALIZ.LJJII(value, "merchant_id");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(C518150KTt c518150KTt, String str, String str2, EnumC20513215Oo enumC20513215Oo) {
        long currentUserId;
        int value;
        String str3;
        EnumC1792020wjY enumC1792020wjY;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = -1;
        }
        C0KQW c0kqw = c518150KTt.LIZJ;
        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
            value = enumC1792020wjY.getValue();
        } else {
            value = -1;
        }
        C0KQW c0kqw2 = c518150KTt.LIZJ;
        if (c0kqw2 == null || (str3 = c0kqw2.LIZIZ) == null) {
            str3 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_iap_clientpayload");
        c474500IjALIZ.LJJII(Integer.valueOf(value), "code");
        c474500IjALIZ.LJJII(str3, "message");
        c474500IjALIZ.LJJII(str, "merchant_id");
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "store_country");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(enumC20513215Oo.getValue()), "flow_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, int i, EnumC20513215Oo enumC20513215Oo) {
        long currentUserId;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = -1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_iap_polling_result");
        c474500IjALIZ.LJJII(str, "contract_id");
        c474500IjALIZ.LJJII(str2, "final_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "attempts");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(enumC20513215Oo.getValue()), "flow_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(C0KPG c0kpg, String str, String str2, String str3, String str4, EnumC20513215Oo enumC20513215Oo) {
        long currentUserId;
        int value;
        String str5;
        EnumC1792020wjY enumC1792020wjY;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = -1;
        }
        C0KQW c0kqw = c0kpg.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_iap_purchase_api_result");
        c474500IjALIZ.LJJII(Integer.valueOf(c0kpg.LIZ.getValue()), "payment_state");
        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
            value = enumC1792020wjY.getValue();
        } else {
            value = -1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(value), "code");
        if (c0kqw == null || (str5 = c0kqw.LIZIZ) == null) {
            str5 = "";
        }
        c474500IjALIZ.LJJII(str5, "message");
        if (str == null && (str = c0kpg.LIZIZ) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "product_id");
        if (str2 == null && (str2 = c0kpg.LIZJ) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "order_id");
        c474500IjALIZ.LJJII(str3, "merchant_id");
        if (str4 == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJII(str4, "store_country");
        c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(enumC20513215Oo.getValue()), "flow_type");
        c474500IjALIZ.LIZ();
    }
}
