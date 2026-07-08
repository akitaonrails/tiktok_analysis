package X;

import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel$checkInlineMsg$1", f = "ChatRoomStreakViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1602106Pb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatRoomStreakViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602106Pb(ChatRoomStreakViewModel chatRoomStreakViewModel, InterfaceC1364105Vn<? super C1602106Pb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatRoomStreakViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1602106Pb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatRoomStreakViewModel@6295.checkInlineMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS581S0100000_2((Map) this.LL.yQ2().I(this.LL.xQ2()), (Map<String, String>) 707));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRoomStreakViewModel@6295.checkInlineMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
