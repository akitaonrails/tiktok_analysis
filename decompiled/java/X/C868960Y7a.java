package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868960Y7a extends AbstractC867440Y1e {
    public long LJ;
    public long LJFF;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    public C868960Y7a(C0YEM c0yem) {
        super(c0yem, C0YMR.GET_MESSAGES_BY_CONVERSATION.getValue(), null);
        this.LJ = -1L;
        this.LJFF = -1L;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && responseBody.messages_in_conversation_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        final String str = (String) c0yin.LLILZIL[0];
        this.LJFF = System.currentTimeMillis();
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            this.LIZJ.LIZLLL().LJIIJJI("LoadHistoryHandler response received success");
            final MessagesInConversationResponseBody messagesInConversationResponseBody = c0yin.LLIZ.body.messages_in_conversation_body;
            this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<C869590Y9l>>() { // from class: X.0Y7Y
                @Override // X.InterfaceC872410YKh
                public final List<C869590Y9l> LIZ() {
                    Boolean bool;
                    C869590Y9l c869590Y9l;
                    ArrayList arrayList = new ArrayList();
                    Boolean bool2 = messagesInConversationResponseBody.has_more;
                    int i = 1;
                    boolean z = bool2 != null && bool2.booleanValue();
                    MessagesInConversationResponseBody messagesInConversationResponseBody2 = messagesInConversationResponseBody;
                    Long l = messagesInConversationResponseBody2.next_cursor;
                    List<MessageBody> listLIZIZ = C0Y81.LIZIZ(messagesInConversationResponseBody2, this.LIZLLL.LIZJ, 1, c0yin.LJIIIZ(), "LoadHistoryHandler");
                    String str2 = c0yin.LLIZ.region;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C868780Y6i c868780Y6iLIZLLL = this.LIZLLL.LIZJ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LoadHistoryHandler save msg and load more with msg size ");
                    sbLIZ.append(listLIZIZ.size());
                    sbLIZ.append(" and has more field ");
                    sbLIZ.append(z);
                    c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        C0Y8T c0y8tLIZ = this.LIZLLL.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
                        for (MessageBody messageBody : listLIZIZ) {
                            Integer num = messageBody.status;
                            if (num == null || num.intValue() != i) {
                                HashMap map = new HashMap();
                                map.put("s:get_msg_log_id", c0yin.LJIIIZ());
                                C0Y7T c0y7tLIZJ = this.LIZLLL.LIZJ.LJIIZILJ().getDomain().LIZLLL().LIZIZ().LIZJ(messageBody, str2, 1, map, 5);
                                if ((c0y7tLIZJ.LIZ instanceof C0Y76) && (c869590Y9l = c0y7tLIZJ.LIZIZ) != null) {
                                    arrayList.add(c869590Y9l);
                                }
                                Map<String, String> map2 = messageBody.ext;
                                String str3 = (map2 == null || !map2.containsKey("s:client_message_id")) ? "" : messageBody.ext.get("s:client_message_id");
                                C0YC7 c0yc7LIZJ = this.LIZLLL.LIZJ.LJIIZILJ().LIZ().LIZJ();
                                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL.LJFF;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LIZLLL.LJ;
                                Long l2 = messageBody.server_message_id;
                                long jLongValue = l2 != null ? l2.longValue() : -1L;
                                Integer num2 = messageBody.message_type;
                                int iIntValue = num2 != null ? num2.intValue() : -1;
                                String str4 = messageBody.conversation_id;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                c0yc7LIZJ.LIZJ(jCurrentTimeMillis, jCurrentTimeMillis2, str3, jLongValue, iIntValue, str4, c0yin.LJIIIZ() != null ? c0yin.LJIIIZ() : "", "http_load_history", c0y8tLIZ != null ? c0y8tLIZ.getInboxType() : -1, C0Y82.CONVERSATION_CHAIN, c0y7tLIZJ.LIZLLL, C0Y7E.LIZ(c0y7tLIZJ), c0y7tLIZJ.LIZJ);
                                i = 1;
                            }
                        }
                        if ((c0y8tLIZ == null || c0y8tLIZ.hasMore()) && (bool = messagesInConversationResponseBody.has_more) != null && !bool.booleanValue()) {
                            final C0YEM c0yem = this.LIZLLL.LIZJ;
                            final String str5 = str;
                            c0yem.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0Y8T>() { // from class: X.0Y1y
                                @Override // X.InterfaceC872410YKh
                                public final C0Y8T LIZ() {
                                    C0Y8T c0y8tLIZ2;
                                    C0Y9J c0y9jLIZIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
                                    c0y9jLIZIZ.LJIIJJI().LJJJIL(str5);
                                    C0Y8T c0y8tLIZ3 = c0y9jLIZIZ.LJIIJJI().LIZ(str5, true);
                                    if (c0y8tLIZ3 != null && !c0y8tLIZ3.hasMore() && (c0y8tLIZ2 = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str5)) != null) {
                                        c0y8tLIZ2.setHasMore(false);
                                        c0yem.LJIIZILJ().LIZLLL().LIZLLL().LJJL(17, c0y8tLIZ2);
                                    }
                                    return c0y8tLIZ3;
                                }
                            }, new C914010ZtP(0), false, c0yem.LJIIL().LIZJ());
                        }
                        long jLongValue2 = l == null ? 0L : l.longValue();
                        if (jLongValue2 <= 0) {
                            jLongValue2 = C868510Y5h.LIZIZ(arrayList);
                        }
                        if (jLongValue2 > 0) {
                            this.LIZLLL.LJIILIIL(jLongValue2, str);
                        }
                        C0Y8T c0y8tLIZ2 = this.LIZLLL.LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
                        if (listLIZIZ.isEmpty() && z && l != null && c0y8tLIZ2 != null) {
                            this.LIZLLL.LJIIJJI(l.longValue(), c0y8tLIZ2);
                            return arrayList;
                        }
                        Collections.sort(arrayList);
                        this.LIZLLL.LJIIL(str, arrayList, EnumC872590YKz.SUCCESS, 0);
                        return arrayList;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZLLL.LIZJ.LIZLLL().LJIIIZ("LoadHistoryHandler saveMsg", e);
                        this.LIZLLL.LJIIL(str, null, EnumC872590YKz.DB_ERROR, -2);
                        this.LIZLLL.LIZJ.LJIIZILJ().LJFF().LIZ().LJIILIIL(1, e);
                        return arrayList;
                    }
                }
            }, new C914010ZtP(7), false, this.LIZJ.LJIIL().LIZJ());
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadHistoryHandler response received failed ");
        sbLIZ.append(c0yin.LJIIJJI());
        sbLIZ.append(" and ");
        sbLIZ.append(LJIIIIZZ(c0yin));
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        LJIIL(str, null, EnumC872590YKz.NETWORK_ERROR, c0yin.LLJ);
    }

    public final void LJIIJJI(long j, C0Y8T c0y8t) {
        C868980Y7c c868980Y7c = new C868980Y7c();
        c868980Y7c.LIZLLL = c0y8t.getConversationId();
        c868980Y7c.LJFF = Long.valueOf(c0y8t.getConversationShortId());
        c868980Y7c.LJ = Integer.valueOf(c0y8t.getConversationType());
        c868980Y7c.LJI = EnumC873090YMx.OLDER;
        c868980Y7c.LJII = Long.valueOf(j);
        MessagesInConversationRequestBody messagesInConversationRequestBodyBuild = c868980Y7c.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIIJJI = messagesInConversationRequestBodyBuild;
        LJIIIZ(c0y8t.getInboxType(), c1es0.build(), null, c0y8t.getConversationId());
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadHistoryHandler real pull start ");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILIIL(long j, String str) {
        if (this.LIZJ.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
            this.LIZJ.LJIIZILJ().LIZLLL().LJ().LLFZ(str, "conv_history_cursor", String.valueOf(j));
        } else {
            this.LIZLLL.LJIILJJIL().LLFZ(str, "conv_history_cursor", String.valueOf(j));
        }
    }

    public final void LJIIL(final String str, final List<C869590Y9l> list, final EnumC872590YKz enumC872590YKz, int i) {
        long j;
        long j2;
        long j3;
        boolean z;
        int size;
        String str2;
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadHistoryHandler on load history end is success ");
        sbLIZ.append(enumC872590YKz);
        sbLIZ.append(" error code ");
        sbLIZ.append(i);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C868140Y3w c868140Y3w = this.LIZJ.LJIIZILJ().getDomain().LIZIZ;
        c868140Y3w.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((CopyOnWriteArraySet) c868140Y3w.LJIIL).remove(str);
        }
        C787080UuA.LIZIZ(new Runnable() { // from class: X.0Y7Z
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LoadHistoryHandler@e6da.onLoadHistoryEnd$1");
                try {
                    this.LLILZ.LIZJ.LJIIZILJ().getDomain().LIZ.LJJI(str, list, enumC872590YKz);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LoadHistoryHandler@e6da.onLoadHistoryEnd$1");
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = this.LJ;
        if (j4 > 0) {
            j2 = jCurrentTimeMillis - j4;
            j = this.LJFF - j4;
        } else {
            j = -1;
            j2 = -1;
        }
        long j5 = this.LJFF;
        if (j5 > 0) {
            j3 = jCurrentTimeMillis - j5;
        } else {
            j3 = -1;
        }
        if (enumC872590YKz == EnumC872590YKz.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        if (list != null) {
            size = ((ArrayList) list).size();
        } else {
            size = -1;
        }
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_load_history_request");
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        c0yj9.LIZ(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(i), "error_code");
        c0yj9.LIZ(Long.valueOf(j2), "duration");
        c0yj9.LIZ(Long.valueOf(j3), "process_duration");
        c0yj9.LIZ(Long.valueOf(j), "pull_duration");
        c0yj9.LIZ(Integer.valueOf(size), "total_msg_count");
        c0yj9.LIZLLL();
    }
}
