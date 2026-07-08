package X;

import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06PU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel$removeInlineMsg$1", f = "ChatRoomStreakViewModel.kt", l = {}, m = "invokeSuspend")
public final class C06PU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatRoomStreakViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06PU(ChatRoomStreakViewModel chatRoomStreakViewModel, InterfaceC1364105Vn<? super C06PU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatRoomStreakViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06PU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomStreakViewModel@6295.removeInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.yQ2().b0(this.LL.xQ2());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.removeInlineMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
