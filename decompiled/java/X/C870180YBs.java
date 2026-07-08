package X;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.im.core.internal.utils.WeakHandler;
import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0YBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870180YBs implements C0YE4, C0YE8 {
    public static final List<InterfaceC870210YBv> LLILZ = new CopyOnWriteArrayList();
    public final WeakHandler LL = new WeakHandler(Looper.getMainLooper(), this);
    public volatile boolean LLILLJJLI;
    public final C0YEM LLILLL;

    public final void LIZJ() {
        if (this.LLILLJJLI) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LLILLJJLI) {
                    C870860YEi c870860YEiLIZ = LIZLLL().LIZ().LIZ();
                    WeakHandler weakHandler = this.LL;
                    Iterator<InterfaceC864610Xvv> it2 = c870860YEiLIZ.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ().LIZJ(weakHandler);
                    }
                    this.LLILLJJLI = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final InterfaceC864790XwD LIZLLL() {
        return this.LLILLL.LJIIZILJ();
    }

    public final void LJFF() {
        LIZJ();
        for (int i : C870740YDw.LJ(this.LLILLL.LJIIIZ())) {
            new C868990Y7d(this.LLILLL, i).LJIILJJIL(false);
        }
    }

    public C870180YBs(C0YEM c0yem) {
        this.LLILLL = c0yem;
        LIZJ();
    }

    public final void LJ(Runnable runnable) {
        this.LL.post(runnable);
    }

    @Override // X.C0YE8
    public final void LJLL(C0Y3I c0y3i) {
        C0YEM c0yem = this.LLILLL;
        c0yem.LJIIJJI().LIZIZ(new C914040ZtS(new C0YA4(c0yem), c0y3i, 19), null);
    }

    @Override // X.C0YE4
    public final void handleMsg(Message message) {
        C0YIN c0yin;
        AbstractC867440Y1e abstractC867440Y1e;
        int i;
        C871360YGg c871360YGgLJFF;
        if ((HandlerHook.getMessageObj(message.obj) instanceof C0YIN) && (abstractC867440Y1e = (c0yin = (C0YIN) HandlerHook.getMessageObj(message.obj)).LLIZLLLIL) != null) {
            if (!c0yin.LJIIJJI() && (((i = c0yin.LLJ) == C0YIF.LIZJ || i == C0YIF.LIZIZ || i == C0YIF.LIZLLL) && (c871360YGgLJFF = abstractC867440Y1e.LJFF()) != null)) {
                c871360YGgLJFF.LJ(InterfaceC871310YGb.LJ, new C0YLT(c0yin.LJI(), c0yin.LLJ, c0yin.LLJILJILJ));
            }
            abstractC867440Y1e.LJII(c0yin, new C0Y1G(abstractC867440Y1e, c0yin));
        }
    }

    public final void LIZIZ(final String str, final InterfaceC863600XuI<String> interfaceC863600XuI) {
        final C0YEM c0yem = this.LLILLL;
        if (TextUtils.isEmpty(str)) {
            c0yem.LIZLLL().LJI("DeleteConversationHandler delete, cid invalid");
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.status = -1017;
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        c0yem.LJIIJJI().LIZIZ(new InterfaceC872410YKh<Object>() { // from class: X.0Xvx
            public final /* synthetic */ boolean LIZLLL = false;

            @Override // X.InterfaceC872410YKh
            public final Object LIZ() {
                C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
                if (c0y8tLIZ == null) {
                    InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                    if (interfaceC863600XuI2 != null) {
                        C0YMW c0ymw2 = C0YMW.newBuilder().LIZ;
                        c0ymw2.status = -1017;
                        interfaceC863600XuI2.LIZIZ(c0ymw2);
                    }
                    return null;
                }
                C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DeleteConversationHandler delete, getConversation result:");
                sbLIZ.append(c0y8tLIZ.getConversationId());
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0y8tLIZ.isStranger()) {
                    new C0Y2D(c0yem, interfaceC863600XuI).LJIIJJI(str, this.LIZLLL);
                    return null;
                }
                new C865050Xwd(c0yem, new C914150Ztd(interfaceC863600XuI, 16)).LJIIJJI(Boolean.TRUE, Boolean.FALSE, Collections.singletonList(c0y8tLIZ));
                return null;
            }
        }, new C914010ZtP(5));
    }

    @Override // X.C0YE8
    public final void LJIILIIL(Map<Long, String> map, InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI) {
        LIZLLL().LIZLLL().LIZLLL().LJJJJZ(new HashSet(((LinkedHashMap) map).values()), new C914130Ztb(map, interfaceC863600XuI, this, 8));
    }

    @Override // X.C0YE8
    public final void LJJLIIIJJI(long j, C0YEB c0yeb) {
        boolean zLJI = MethodIDManager.LJI(137695);
        C0Y1H c0y1h = new C0Y1H(c0yeb);
        boolean zLJI2 = MethodIDManager.LJI(137695);
        final C0YEM c0yem = this.LLILLL;
        AbstractC867440Y1e abstractC867440Y1e = new AbstractC867440Y1e(c0yem) { // from class: X.0YBu
            @Override // X.AbstractC867440Y1e
            public final boolean LJ() {
                return true;
            }

            {
                int value = C0YMR.UNREAD_COUNT_REPORT.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                UnReadCountReportResponseBody unReadCountReportResponseBody;
                Boolean bool;
                ResponseBody responseBody = c0yin.LLIZ.body;
                if (responseBody == null || (unReadCountReportResponseBody = responseBody.unread_count_report_body) == null || (bool = unReadCountReportResponseBody.set_total_status) == null || !bool.booleanValue()) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                c0y1g.run();
            }
        };
        boolean zLJI3 = MethodIDManager.LJI(137696);
        C0YRS c0yrs = new C0YRS();
        if (j != -1) {
            c0yrs.LIZLLL = Long.valueOf(j);
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJLIIIJJIZ = c0yrs.build();
        abstractC867440Y1e.LJIIIZ(0, c1es0.build(), c0y1h, new Object[0]);
        if (zLJI3) {
            MethodIDManager.LJ();
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0YE8
    public final void LLJJJIL(C0Y3I c0y3i, String str) {
        C0YEM c0yem = this.LLILLL;
        c0yem.LJIIJJI().LIZIZ(new C914060ZtU(new C0YA4(c0yem), str, c0y3i, 9), null);
    }

    public final void LIZ(Map<Long, String> map, final InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI, Map<String, Long> map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            Long l = 0L;
            if (map2 != null && map2.get(entry.getValue()) != null) {
                l = map2.get(entry.getValue());
            }
            C870340YCi c870340YCi = new C870340YCi();
            c870340YCi.LIZLLL = entry.getValue();
            c870340YCi.LJ = l;
            c870340YCi.LJFF = entry.getKey();
            arrayList.add(c870340YCi.build());
        }
        final C0YEM c0yem = this.LLILLL;
        AbstractC867440Y1e<List<? extends C869590Y9l>> abstractC867440Y1e = new AbstractC867440Y1e<List<? extends C869590Y9l>>(c0yem, interfaceC863600XuI) { // from class: X.0Y1w
            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                Response response;
                ResponseBody responseBody;
                if (c0yin == null || !c0yin.LJIIJJI() || (response = c0yin.LLIZ) == null || (responseBody = response.body) == null || responseBody.batch_get_messages_body == null) {
                    return false;
                }
                return true;
            }

            {
                int value = C0YMR.BATCH_GET_MESSAGES.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                ResponseBody responseBody;
                BatchGetMessagesResponseBody batchGetMessagesResponseBody;
                List<MessageBody> list;
                String str;
                if (!LJIIIIZZ(c0yin)) {
                    LIZ(c0yin);
                    return;
                }
                Response response = c0yin.LLIZ;
                if (response != null && (responseBody = response.body) != null && (batchGetMessagesResponseBody = responseBody.batch_get_messages_body) != null && (list = batchGetMessagesResponseBody.messages) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (MessageBody messageBody : list) {
                        Map<String, String> map3 = messageBody.ext;
                        if (map3 == null || (str = map3.get("s:client_message_id")) == null) {
                            str = "";
                        }
                        arrayList2.add(C0Y8V.LIZ(this.LIZJ, str, null, messageBody, 5, 7));
                    }
                    LIZJ(arrayList2);
                    return;
                }
                LIZ(c0yin);
            }
        };
        C0YD5 c0yd5 = new C0YD5();
        C1516540pZE.LIZ(arrayList);
        c0yd5.LIZLLL = arrayList;
        BatchGetMessagesRequestBody batchGetMessagesRequestBodyLIZIZ = c0yd5.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJLJLJ = batchGetMessagesRequestBodyLIZIZ;
        boolean zLJI = MethodIDManager.LJI(137759);
        abstractC867440Y1e.LJIIIZ(0, c1es0.build(), null, new Object[0]);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0YE8
    public final void LLJILJILJ(InterfaceC863600XuI interfaceC863600XuI, String str, List list) {
        LIZLLL().LIZLLL().LIZ().LJJLIL(str, new C914130Ztb(interfaceC863600XuI, list, this, 4));
    }
}
