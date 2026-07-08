package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876170YYt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final String LIZ(String str) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        ?? r3 = 0;
        String str2 = 0;
        if (str != null) {
            try {
                uri = UriProtector.parse(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, r3, r3);
            }
        } else {
            uri = null;
        }
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "init_page_data")) != null) {
            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0YYu
            }.getType();
            C1227904rF.LIZ.getClass();
            Object obj = ((Map) C1227904rF.LIZLLL().LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, type)).get("buyer_id");
            if (obj instanceof String) {
                r3 = (String) obj;
                str2 = r3;
            }
            if (str2 != 0) {
                return str2;
            }
        }
        return "";
    }

    public static final SellerMessage LIZIZ(C869590Y9l c869590Y9l) {
        Long lValueOf = Long.valueOf(c869590Y9l.getConversationType());
        String conversationId = c869590Y9l.getConversationId();
        String strValueOf = String.valueOf(c869590Y9l.getConversationShortId());
        String strLJFF = C876050YYh.LJFF(c869590Y9l.getMsgId());
        Integer numValueOf = Integer.valueOf(c869590Y9l.getMsgType());
        String content = c869590Y9l.getContent();
        Integer numValueOf2 = Integer.valueOf(C876050YYh.LJ(c869590Y9l.getMsgStatus()));
        Long lValueOf2 = Long.valueOf(c869590Y9l.getCreatedAt());
        String strValueOf2 = String.valueOf(c869590Y9l.getSender());
        Long lValueOf3 = Long.valueOf(c869590Y9l.getIndex());
        String strValueOf3 = String.valueOf(c869590Y9l.getOrderIndex());
        String strLJFF2 = C876050YYh.LJFF(c869590Y9l.getMsgId());
        String strValueOf4 = String.valueOf(c869590Y9l.getSender());
        LinkedHashMap linkedHashMap = new LinkedHashMap(c869590Y9l.getExt());
        linkedHashMap.put("s:client_message_id", c869590Y9l.getUuid());
        return new SellerMessage(lValueOf, conversationId, strValueOf, strLJFF, numValueOf, content, null, numValueOf2, lValueOf2, strValueOf2, lValueOf3, strValueOf3, strLJFF2, strValueOf4, null, linkedHashMap);
    }
}
