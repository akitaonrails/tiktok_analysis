package X;

import Y.AObserverS220S0100000_16;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$onPrepared$1", f = "FindFriendsPageVM.kt", l = {}, m = "invokeSuspend")
public final class C1002320cBq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FindFriendsPageVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002320cBq(FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1002320cBq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = findFriendsPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002320cBq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        FindFriendsPageVM findFriendsPageVM = this.LL;
        relationObservable.subscribe(findFriendsPageVM, new AObserverS220S0100000_16(findFriendsPageVM, 9));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
