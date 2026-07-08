package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YXM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent$sendMemberChangeEvent$1", f = "EventCenterComponent.kt", l = {}, m = "invokeSuspend")
public final class C0YXM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EventCenterComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YXM(EventCenterComponent eventCenterComponent, InterfaceC1364105Vn<? super C0YXM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eventCenterComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YXM(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T extends com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer, com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T extends com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer, com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T extends com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer, com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? LJ;
        String string;
        C1C7U.LIZ("EventCenterComponent@1df4.sendMemberChangeEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0YAE> listLJLJJLL = this.LL.LL.getPigeonIMClient().LIZIZ.LJFF(this.LL.LLILLJJLI.getConversationId()).LJLJJLL();
        List<C870400YCo> listLLL = this.LL.LL.getPigeonIMClient().LIZIZ.LIZIZ().LLL(this.LL.LLILLJJLI.getConversationId());
        if (listLLL != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLLL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (C870400YCo c870400YCo : listLLL) {
                LJ.put(C2286608xc.LJFF(c870400YCo.LLILLJJLI), c870400YCo);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        EventCenterComponent eventCenterComponent = this.LL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C1061730djf();
        String conversationId = this.LL.LLILLJJLI.getConversationId();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLJJLL, 10));
        for (C0YAE c0yae : listLJLJJLL) {
            Pair[] pairArr = new Pair[5];
            C870400YCo c870400YCo2 = (C870400YCo) LJ.get(C2286608xc.LJFF(c0yae.getUid()));
            if (c870400YCo2 != null) {
                string = C2286608xc.LJFF(c870400YCo2.LLILZ).toString();
            } else {
                string = null;
            }
            pairArr[0] = new Pair("pigeonReadIndex", string);
            pairArr[1] = new Pair("bizRole", c0yae.getAlias());
            pairArr[2] = new Pair("userId", String.valueOf(c0yae.getUid()));
            pairArr[3] = new Pair("sortOrder", C2286608xc.LJFF(c0yae.getSortOrder()));
            pairArr[4] = new Pair("secUserId", c0yae.getSecUid());
            arrayList.add(C2097608Jq.LJIIIIZZ(pairArr));
        }
        eventCenterComponent.LJJLIIIJJIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(C2097908Jt.LIZJ(new Pair(conversationId, arrayList))), "ecim.participantsChange"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventCenterComponent@1df4.sendMemberChangeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
