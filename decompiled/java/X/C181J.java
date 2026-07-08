package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.181J, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C181J implements InterfaceC969820bLQ {
    public static final C01GW<C181J> LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS223S0000000_32.get$arr$(246));

    @Override // X.InterfaceC969820bLQ
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    public static Map LIZLLL(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("schema is empty");
            return null;
        }
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return null;
        }
        int i2 = !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "suggest_pin_id")) ? 1 : 0;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "moderate_author_id");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "remind_type");
        String str2 = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
        }
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            i = 1;
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            i = 0;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        HashMap map = new HashMap();
        map.put("author_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("room_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        map.put("pin_product", String.valueOf(i2));
        map.put("remind_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
        map.put("is_moderate", String.valueOf(i));
        if (i == 1) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId != null) {
                str2 = curUserId;
            }
            map.put("moderate_id", str2);
        }
        return map;
    }

    @Override // X.InterfaceC969820bLQ
    public final void LIZ(String str) {
        if (str == null) {
            str = "";
        }
        Map mapLIZLLL = LIZLLL(str);
        if (mapLIZLLL == null) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("onFirstBind but eventParams error");
        } else {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("livesdk_tiktokec_pin_reminder_show", mapLIZLLL);
        }
    }

    @Override // X.InterfaceC969820bLQ
    public final void LIZJ(String str) {
        if (str == null) {
            str = "";
        }
        Map mapLIZLLL = LIZLLL(str);
        if (mapLIZLLL == null) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("handleClick but eventParams error");
        } else {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("livesdk_tiktokec_pin_reminder_click", mapLIZLLL);
        }
    }
}
