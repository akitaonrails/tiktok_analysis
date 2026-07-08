package X;

import Y.AObserverS215S0100000_11;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RT1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew$onCreate$1", f = "UpvoteListViewModelNew.kt", l = {}, m = "invokeSuspend")
public final class C0RT1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UpvoteListViewModelNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RT1(UpvoteListViewModelNew upvoteListViewModelNew, InterfaceC1364105Vn<? super C0RT1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = upvoteListViewModelNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0RT1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpvoteListViewModelNew@fde7.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        UpvoteListViewModelNew upvoteListViewModelNew = this.LL;
        relationObservable.observe(upvoteListViewModelNew.LL, new AObserverS215S0100000_11(upvoteListViewModelNew, 9));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpvoteListViewModelNew@fde7.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
