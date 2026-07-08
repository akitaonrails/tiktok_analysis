package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.room.component.AiChatRoomLogicComponent$initChatRoom$1$initResult$1", f = "AiChatRoomLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C342430Dbd extends C09AX implements Function2<InterfaceC1157570gEF<? extends C909930Zmp>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C342430Dbd(InterfaceC1364105Vn<? super C342430Dbd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342430Dbd c342430Dbd = new C342430Dbd(interfaceC1364105Vn);
        c342430Dbd.LL = obj;
        return c342430Dbd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AiChatRoomLogicComponent@1dfd.initChatRoom$1$initResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (!(obj2 instanceof C1157450gE3) && !(obj2 instanceof C1155990gBh)) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AiChatRoomLogicComponent@1dfd.initChatRoom$1$initResult$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends C909930Zmp> interfaceC1157570gEF, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
