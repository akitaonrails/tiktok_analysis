package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05A3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler$assembleOnFirstMessageListLayout$2$1", f = "ChatRoomAssembler2.kt", l = {}, m = "invokeSuspend")
public final class C05A3 extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C05A3(InterfaceC1364105Vn<? super C05A3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05A3 c05a3 = new C05A3(interfaceC1364105Vn);
        c05a3.LL = ((Boolean) obj).booleanValue();
        return c05a3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomAssembler@5031.assembleOnFirstMessageListLayout$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL);
        C1C7U.LIZIZ("ChatRoomAssembler@5031.assembleOnFirstMessageListLayout$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
