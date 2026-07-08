package X;

import com.bytedance.im.core.proto.BatchSetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoResponseBody;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS75S0500000_14;

/* JADX INFO: renamed from: X.0Y3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868070Y3p extends AbstractC867440Y1e<List<? extends SetConversationSettingInfoResponseBody>> {
    public volatile boolean LJ;
    public final C054G LJFF;

    public final C0Y1U LJIIJJI() {
        return this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL();
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ResponseBody responseBody;
        BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody;
        List<SetConversationSettingInfoResponseBody> list;
        Response response = c0yin.LLIZ;
        if (response != null && (responseBody = response.body) != null && (batchSetConversationSettingInfoResponseBody = responseBody.batch_set_conversation_setting_info_body) != null && (list = batchSetConversationSettingInfoResponseBody.success_list) != null) {
            return !list.isEmpty();
        }
        return false;
    }

    public C868070Y3p(C0YEM c0yem, InterfaceC863600XuI<List<SetConversationSettingInfoResponseBody>> interfaceC863600XuI) {
        super(c0yem, C0YMR.BATCH_SET_CONVERSATION_SETTING_INFO.getValue(), interfaceC863600XuI);
        this.LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
        List<SetConversationSettingInfoResponseBody> list;
        ResponseBody responseBody;
        ResponseBody responseBody2;
        BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody;
        RequestBody requestBody;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody;
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final C0Y9J c0y9j = this.LIZLLL;
            if (c0y9j == null) {
                this.LIZJ.LIZLLL().LJIIIIZZ("BatchSetConversationSettingHandler", "handleResponse: daoDependencyContainer is null, cannot persist settings", null);
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "DAO unavailable for local persistence";
                LIZIZ(c0ymw);
                c0y1g.run();
                return;
            }
            final boolean z = this.LIZJ.LJIIIZ().LJJLIIIIJ.LJJIL;
            this.LIZJ.LJIIJJI().LIZIZ(new InterfaceC872410YKh() { // from class: X.0Y3t
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 9, insn: 0x0345: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:837), block:B:118:0x0345 */
                /* JADX WARN: Removed duplicated region for block: B:124:0x0357  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
                /* JADX WARN: Type inference failed for: r0v53, types: [X.0Y8e] */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
                /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v5, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.List] */
                /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
                @Override // X.InterfaceC872410YKh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 865
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C868110Y3t.LIZ():java.lang.Object");
                }
            }, new C914020ZtQ(this, c0yin, 12));
            return;
        }
        BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody2 = null;
        list = null;
        list = null;
        List<SetConversationSettingInfoRequestBody> list2 = null;
        batchSetConversationSettingInfoResponseBody2 = null;
        if (!this.LJ && C0Y81.LJ(c0yin.LLIZ, this.LIZJ.LJIIIZ().LJJJJJ)) {
            ArrayList arrayList = new ArrayList();
            Request request = c0yin.LLILZLL;
            if (request != null && (requestBody = request.body) != null && (batchSetConversationSettingInfoRequestBody = requestBody.batch_set_conversation_setting_info_body) != null) {
                list2 = batchSetConversationSettingInfoRequestBody.set_requests;
            }
            AwS75S0500000_14 awS75S0500000_14 = new AwS75S0500000_14(new AtomicInteger(0), (AtomicInteger) list2, (List<SetConversationSettingInfoRequestBody>) arrayList, (List<C0Y8T>) this, (C868070Y3p) c0yin, (C0YIN) 2);
            if (list2 != null) {
                Iterator<SetConversationSettingInfoRequestBody> it2 = list2.iterator();
                while (it2.hasNext()) {
                    LJIIJJI().LJJLIIIJLLLLLLLZ(c0yin.LJI(), new C914130Ztb(this, arrayList, awS75S0500000_14, 7), it2.next().conversation_id);
                }
                return;
            }
            return;
        }
        Response response = c0yin.LLIZ;
        if (response != null && (responseBody2 = response.body) != null && (batchSetConversationSettingInfoResponseBody = responseBody2.batch_set_conversation_setting_info_body) != null) {
            list = batchSetConversationSettingInfoResponseBody.failed_list;
        } else {
            list = null;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleResponse response not success, status_code: ");
        sbLIZ.append(c0yin.LLIZ.status_code);
        sbLIZ.append(", body: ");
        Response response2 = c0yin.LLIZ;
        if (response2 != null && (responseBody = response2.body) != null) {
            batchSetConversationSettingInfoResponseBody2 = responseBody.batch_set_conversation_setting_info_body;
        }
        sbLIZ.append(batchSetConversationSettingInfoResponseBody2);
        sbLIZ.append(", failedList: ");
        sbLIZ.append(list);
        sbLIZ.append(' ');
        c868780Y6iLIZLLL.LJIIIIZZ("BatchSetConversationSettingHandler", C2188811AlT.LIZIZ(sbLIZ), null);
        LIZJ(list);
    }

    public final void LJIIL(List<C0Y8T> list, Function1<? super C867980Y3g, Unit> function1) {
        ArrayList arrayList = new ArrayList();
        for (C0Y8T c0y8t : list) {
            C867980Y3g c867980Y3g = new C867980Y3g();
            c867980Y3g.LIZLLL = c0y8t.getConversationId();
            c867980Y3g.LJ = Long.valueOf(c0y8t.getConversationShortId());
            c867980Y3g.LJFF = Integer.valueOf(c0y8t.getConversationType());
            function1.invoke(c867980Y3g);
            arrayList.add(c867980Y3g.build());
        }
        if (!arrayList.isEmpty()) {
            C868090Y3r c868090Y3r = new C868090Y3r();
            C1516540pZE.LIZ(arrayList);
            c868090Y3r.LIZLLL = arrayList;
            BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBodyBuild = c868090Y3r.build();
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJJJIZL = batchSetConversationSettingInfoRequestBodyBuild;
            LJIIIZ(0, c1es0.build(), null, new Object[0]);
            return;
        }
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.statusMsg = "no valid request body";
        LIZIZ(c0ymw);
    }
}
