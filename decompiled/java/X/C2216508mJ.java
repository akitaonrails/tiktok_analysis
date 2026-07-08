package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.keva.IMChatListKeva$storeShowChatListTimeStamp$1", f = "IMChatListKeva.kt", l = {}, m = "invokeSuspend")
public final class C2216508mJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216508mJ(long j, InterfaceC1364105Vn<? super C2216508mJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216508mJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatListKeva@7e7d.storeShowChatListTimeStamp$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2216408mI.LIZ.LIZ().storeLong("show_chat_list_performance", this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListKeva@7e7d.storeShowChatListTimeStamp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
