package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y87, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y87 extends AbstractC867440Y1e<C869590Y9l> {
    public static boolean LJFF;
    public final LruCache<Long, C869590Y9l> LJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        Response response;
        ResponseBody responseBody;
        GetMessageByIdResponseBody getMessageByIdResponseBody;
        MessageInfo messageInfo;
        if (c0yin != null && (response = c0yin.LLIZ) != null && (responseBody = response.body) != null && (getMessageByIdResponseBody = responseBody.get_message_by_id_body) != null && (messageInfo = getMessageByIdResponseBody.msg_info) != null && messageInfo.body != null) {
            return true;
        }
        return false;
    }

    public C0Y87(C0YEM c0yem, C864660Xw0 c864660Xw0) {
        super(c0yem, C0YMR.GET_MESSAGE_INFO_BY_SERVER_ID.getValue(), c864660Xw0);
        this.LJ = new LruCache<>(c0yem.LJIIIZ().LJJIJ);
        LJFF = true;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        String str;
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final GetMessageByIdResponseBody getMessageByIdResponseBody = c0yin.LLIZ.body.get_message_by_id_body;
            Map<String, String> map = getMessageByIdResponseBody.msg_info.body.ext;
            final String str2 = "";
            if (map == null || !map.containsKey("s:client_message_id") || TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = "";
            } else {
                str = map.get("s:client_message_id");
            }
            C869590Y9l c869590Y9lLIZ = C0Y8V.LIZ(this.LIZJ, str, null, getMessageByIdResponseBody.msg_info.body, 5, -1);
            c869590Y9lLIZ.updateMentionLocalExt(this.LIZJ.getUid());
            c869590Y9lLIZ.setMessageStatus(getMessageByIdResponseBody.msg_info.status);
            this.LJ.put(Long.valueOf(c869590Y9lLIZ.getMsgId()), c869590Y9lLIZ);
            String str3 = c0yin.LLIZ.region;
            if (str3 != null) {
                str2 = str3;
            }
            if (LJFF) {
                this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y7T>() { // from class: X.0Y86
                    @Override // X.InterfaceC872410YKh
                    public final C0Y7T LIZ() {
                        HashMap map2 = new HashMap();
                        map2.put("s:get_msg_log_id", c0yin.LJIIIZ());
                        return this.LIZLLL.LIZJ.LJIIZILJ().getDomain().LIZLLL().LIZIZ().LIZJ(getMessageByIdResponseBody.msg_info.body, str2, -1, map2, 5);
                    }
                }, new C914030ZtR(this, 11), false, this.LIZJ.LJIIL().LIZJ());
                return;
            } else {
                LIZJ(c869590Y9lLIZ);
                return;
            }
        }
        LIZ(c0yin);
    }

    public final void LJIIJJI(long j, C0Y8T c0y8t) {
        if (c0y8t == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            LIZIZ(c0ymw);
            return;
        }
        String conversationId = c0y8t.getConversationId();
        Long lValueOf = Long.valueOf(c0y8t.getConversationShortId());
        Integer numValueOf = Integer.valueOf(c0y8t.getConversationType());
        Integer numValueOf2 = Integer.valueOf(c0y8t.getInboxType());
        C0Y88 c0y88 = new C0Y88();
        c0y88.LIZLLL = conversationId;
        c0y88.LJFF = lValueOf;
        c0y88.LJ = numValueOf;
        c0y88.LJI = Long.valueOf(j);
        GetMessageByIdRequestBody getMessageByIdRequestBodyBuild = c0y88.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIIJ = getMessageByIdRequestBodyBuild;
        LJIIIZ(numValueOf2.intValue(), c1es0.build(), null, new Object[0]);
    }

    public C0Y87(C0YEM c0yem, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        super(c0yem, C0YMR.GET_MESSAGE_INFO_BY_SERVER_ID.getValue(), interfaceC863600XuI);
        this.LJ = new LruCache<>(c0yem.LJIIIZ().LJJIJ);
    }
}
