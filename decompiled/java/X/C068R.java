package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$removeNoticeFromQueue$1", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseSingleChatNoticeViewModel LL;
    public final /* synthetic */ EnumC1596306Mv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068R(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, EnumC1596306Mv enumC1596306Mv, InterfaceC1364105Vn<? super C068R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseSingleChatNoticeViewModel;
        this.LLILLJJLI = enumC1596306Mv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068R(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.removeNoticeFromQueue$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.LJIIL(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.removeNoticeFromQueue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
