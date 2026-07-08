package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel$fetchTopNotice$1$1", f = "SessionListTopNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1309505An extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SessionListTopNoticeViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309505An(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, InterfaceC1364105Vn<? super C1309505An> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sessionListTopNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309505An(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionListTopNoticeViewModel@6f9a.fetchTopNotice$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.AQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionListTopNoticeViewModel@6f9a.fetchTopNotice$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
