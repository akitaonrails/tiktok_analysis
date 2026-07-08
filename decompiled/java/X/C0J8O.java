package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0J8O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomLogicComponent$initWsService$1", f = "AiChatRoomLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C0J8O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0J8O(InterfaceC1364105Vn<? super C0J8O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J8O(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.initWsService$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
            c2203431BLp.LJ("dm_chat_room");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.initWsService$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0J8O(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
