package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMChatListAnalytics$trackStrangerEntrance$1", f = "IMChatListAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C884190YmP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ C0Z3S LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884190YmP(InterfaceC1493105sv interfaceC1493105sv, C0Z3S c0z3s, InterfaceC1364105Vn<? super C884190YmP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = c0z3s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884190YmP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("IMChatListAnalytics@cbf8.trackStrangerEntrance$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "notification_page");
        AbstractC884010Ym7 sessionUnreadViewState = this.LLILLJJLI.getSessionUnreadViewState();
        if (!(sessionUnreadViewState instanceof C880340YgC) || sessionUnreadViewState == null || (string = C2286608xc.LJ(sessionUnreadViewState.getNum()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("unread_cnt", string);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        AbstractC884010Ym7 sessionUnreadViewState2 = this.LLILLJJLI.getSessionUnreadViewState();
        c885310YoD.getClass();
        pairArr[2] = new Pair("notice_type", C885310YoD.LJIJJLI(sessionUnreadViewState2));
        interfaceC1493105sv.sendEvent("show_message_request_entrance", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListAnalytics@cbf8.trackStrangerEntrance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
