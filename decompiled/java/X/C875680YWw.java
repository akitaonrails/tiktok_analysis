package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS143S0400000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponent$onUpdateConversationEvent$1", f = "EventCenterComponent.kt", l = {}, m = "invokeSuspend")
public final class C875680YWw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EventCenterComponent LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875680YWw(EventCenterComponent eventCenterComponent, C0Y8T c0y8t, InterfaceC1364105Vn<? super C875680YWw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eventCenterComponent;
        this.LLILLJJLI = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875680YWw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T extends com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer, com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? LJ;
        String conversationId;
        C1C7U.LIZ("EventCenterComponent@1df4.onUpdateConversationEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0YAE> listLJLJJLL = this.LL.LL.getPigeonIMClient().LIZIZ.LJFF(this.LLILLJJLI.getConversationId()).LJLJJLL();
        List<C870400YCo> listLLL = this.LL.LL.getPigeonIMClient().LIZIZ.LIZIZ().LLL(this.LLILLJJLI.getConversationId());
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
        C0Y8T c0y8t = this.LLILLJJLI;
        AwS143S0400000_14 awS143S0400000_14 = new AwS143S0400000_14(eventCenterComponent, (EventCenterComponent) c0y8t, (C0Y8T) listLJLJJLL, (List<C0YAE>) LJ, (Map<Long, ? extends C870400YCo>) 3);
        String conversationId2 = eventCenterComponent.LLILLJJLI.getConversationId();
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        if (Intrinsics.LJFF(conversationId2, conversationId)) {
            awS143S0400000_14.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventCenterComponent@1df4.onUpdateConversationEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
