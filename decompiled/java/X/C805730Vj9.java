package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel$tryInsertUnreadEntities$1", f = "FriendsV3FeedListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C805730Vj9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C0VNP> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805730Vj9(List<C0VNP> list, InterfaceC1364105Vn<? super C805730Vj9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805730Vj9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedListViewModel@293.tryInsertUnreadEntities$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C805740VjA.LIZIZ.LIZJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3FeedListViewModel@293.tryInsertUnreadEntities$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
