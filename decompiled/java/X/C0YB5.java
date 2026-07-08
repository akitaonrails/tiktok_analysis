package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YB5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YB5 extends AbstractC867440Y1e<List<C869590Y9l>> {
    public final C0Y8T LJ;
    public final int LJFF;
    public final String LJI;

    @Override // X.AbstractC867440Y1e
    public final void LIZ(C0YIN c0yin) {
        throw null;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && responseBody.get_messages_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI(List<C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            arrayList.add(new MessageIDIndexEntry(Long.valueOf(c869590Y9l.getMsgId()), Long.valueOf(c869590Y9l.getIndex())));
        }
        C870320YCg c870320YCg = new C870320YCg();
        c870320YCg.LIZLLL = this.LJ.getConversationId();
        c870320YCg.LJ = Integer.valueOf(this.LJ.getConversationType());
        c870320YCg.LJFF = Long.valueOf(this.LJ.getConversationShortId());
        C1516540pZE.LIZ(arrayList);
        c870320YCg.LJI = arrayList;
        GetMessagesRequestBody getMessagesRequestBodyBuild = c870320YCg.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJLJL = getMessagesRequestBodyBuild;
        LJIIIZ(this.LJ.getInboxType(), c1es0.build(), null, new Object[0]);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        List<GetMessageError> list;
        Integer numValueOf;
        SystemClock.uptimeMillis();
        c0yin.LJIIIZ();
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            GetMessagesResponseBody getMessagesResponseBody = c0yin.LLIZ.body.get_messages_body;
            List<MessageBody> list2 = getMessagesResponseBody.messages;
            if ((list2 != null && list2.size() > 0) || ((list = getMessagesResponseBody.errors) != null && list.size() > 0)) {
                final List<MessageBody> list3 = getMessagesResponseBody.messages;
                final List<GetMessageError> list4 = getMessagesResponseBody.errors;
                final long j = c0yin.LL;
                C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GetMessagesByMsgIDsHandler update msg, messages:");
                if (list3 == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(list3.size());
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" conversation id: ");
                sbLIZ.append(this.LJ.getConversationId());
                sbLIZ.append(" inbox type: ");
                sbLIZ.append(this.LJ.getInboxType());
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<C869590Y9l>>() { // from class: X.0YB4
                    @Override // X.InterfaceC872410YKh
                    public final List<C869590Y9l> LIZ() throws Throwable {
                        C869590Y9l c869590Y9l;
                        C868780Y6i c868780Y6iLIZLLL2 = this.LIZLLL.LIZJ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("GetMessagesByMsgIDsHandler update msg, Task onRun, seqId:");
                        sbLIZ2.append(j);
                        c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                        ArrayList arrayList = new ArrayList();
                        for (GetMessageError getMessageError : list4) {
                            try {
                                C869590Y9l c869590Y9lLJJJ = this.LIZLLL.LIZLLL.LJI().LJJJ(getMessageError.entry.server_message_id.longValue());
                                if (c869590Y9lLJJJ != null) {
                                    c869590Y9lLJJJ.getLocalExt().put("s:msg_error_code", getMessageError.status_code.toString());
                                    this.LIZLLL.LIZLLL.LJI().LIZ(c869590Y9lLJJJ, Collections.singletonMap("s:msg_error_code", getMessageError.status_code.toString()), null, true, true);
                                    arrayList.add(c869590Y9lLJJJ);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZLLL.LIZJ.LIZLLL().LJIIIZ("GetMessagesByMsgIDsHandler update msg error(handle error msg)", e);
                            }
                        }
                        List list5 = list3;
                        if (list5 != null && !list5.isEmpty()) {
                            try {
                                for (MessageBody messageBody : list3) {
                                    ByteString byteString = messageBody.content_pb;
                                    if (byteString == null || byteString.size() <= 0) {
                                        C0YEM c0yem = this.LIZLLL.LIZJ;
                                        C869590Y9l c869590Y9lLIZ = C869880YAo.LIZ(c0yem, messageBody);
                                        C0YB3 c0yb3 = c869590Y9lLIZ == null ? new C0YB3(null) : C869880YAo.LIZLLL(c0yem, c869590Y9lLIZ, messageBody);
                                        if (c0yb3.LIZ && (c869590Y9l = c0yb3.LIZIZ) != null) {
                                            arrayList.add(c869590Y9l);
                                        }
                                    } else {
                                        C0YB3 c0yb3LIZJ = C869880YAo.LIZJ(this.LIZLLL.LIZJ, messageBody);
                                        C869590Y9l c869590Y9l2 = c0yb3LIZJ.LIZIZ;
                                        if (c0yb3LIZJ.LIZ && c869590Y9l2 != null) {
                                            arrayList.add(c869590Y9l2);
                                            LIZIZ(c0yb3LIZJ, c869590Y9l2);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                this.LIZLLL.LIZJ.LIZLLL().LJIIIZ("GetMessagesByMsgIDsHandler update msg error", e2);
                            }
                        }
                        return arrayList;
                    }

                    public final void LIZIZ(C0YB3 c0yb3, C869590Y9l c869590Y9l) {
                        List<String> list5 = c0yb3.LIZJ;
                        if (list5 != null) {
                            for (String str : list5) {
                                int msgType = c869590Y9l.getMsgType();
                                long msgId = c869590Y9l.getMsgId();
                                String str2 = this.LIZLLL.LJI;
                                long jCurrentTimeMillis = System.currentTimeMillis() - c869590Y9l.getLocalCreatedAt();
                                C870370YCl c870370YCl = new C870370YCl(msgId, msgType, str2, this.LIZLLL.LJFF, str, "refresh", jCurrentTimeMillis, c869590Y9l.getSourceVregion(), System.currentTimeMillis());
                                Iterator it2 = ((CopyOnWriteArraySet) this.LIZLLL.LIZJ.LJIIZILJ().getDomain().LIZ.LJIILIIL).iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC870020YBc) it2.next()).LIZ(c870370YCl);
                                }
                                C870360YCk.LJFF(this.LIZLLL.LIZJ, c870370YCl, c869590Y9l.getSender(), C870360YCk.LJ(c869590Y9l, str));
                            }
                        }
                    }
                }, new C914030ZtR(this, SystemClock.uptimeMillis(), 12), false, this.LIZJ.LJIIL().LIZJ());
                return;
            }
            LIZJ(new ArrayList());
            return;
        }
        super.LIZ(c0yin);
    }

    public C0YB5(C0YEM c0yem, C0Y8T c0y8t, InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI) {
        super(c0yem, C0YMR.GET_MESSAGES.getValue(), interfaceC863600XuI);
        this.LJ = c0y8t;
        SystemClock.uptimeMillis();
        this.LJI = "";
        this.LJFF = -1;
    }

    public C0YB5(C0YEM c0yem, C0Y8T c0y8t, String str, int i, C868640Y5u c868640Y5u) {
        super(c0yem, C0YMR.GET_MESSAGES.getValue(), c868640Y5u);
        this.LJ = c0y8t;
        SystemClock.uptimeMillis();
        this.LJI = str;
        this.LJFF = i;
    }
}
