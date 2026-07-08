package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel$retry$2", f = "BulletinPollVoteDetailListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1593206Lq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinPollVoteDetailListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593206Lq(BulletinPollVoteDetailListViewModel bulletinPollVoteDetailListViewModel, InterfaceC1364105Vn<? super C1593206Lq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinPollVoteDetailListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1593206Lq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPollVoteDetailListViewModel@cfdd.retry$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPollVoteDetailListViewModel@cfdd.retry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
