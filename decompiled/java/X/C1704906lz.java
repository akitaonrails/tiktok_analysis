package X;

import com.ss.android.ugc.aweme.im.b2c.event.B2CEventHandleApi;
import com.ss.android.ugc.aweme.im.b2c.event.B2CEventRequestBody;
import com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.event.IMB2CServerEventAnalytics$reportLeaveB2CChatToServer$2", f = "IMB2CServerEventAnalytics.kt", l = {77}, m = "invokeSuspend")
public final class C1704906lz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704906lz(SessionInfo sessionInfo, InterfaceC1364105Vn<? super C1704906lz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704906lz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMB2CServerEventAnalytics@be5a.reportLeaveB2CChatToServer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ConvContext convContext = new ConvContext(this.LLILLJJLI.getConversationId(), this.LLILLJJLI.getEntranceType());
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LLILLJJLI.getConversationId());
            if (c0y8tLJIL == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportLeaveB2CChatToServer$2");
                return unit;
            }
            String strLJ = C051M.LJ(C2097908Jt.LIZJ(new Pair("process_id", this.LLILLJJLI.getUuid())), false);
            B2CEventHandleApi b2CEventHandleApi = B2CEventHandleApi.LIZIZ;
            B2CEventRequestBody b2CEventRequestBody = new B2CEventRequestBody(convContext, 2, strLJ, this.LLILLJJLI.getConversationId(), String.valueOf(c0y8tLJIL.getConversationType()), String.valueOf(c0y8tLJIL.getInboxType()));
            this.LL = 1;
            if (b2CEventHandleApi.reportEvent(b2CEventRequestBody, this) == objLJFF) {
                C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportLeaveB2CChatToServer$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportLeaveB2CChatToServer$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
