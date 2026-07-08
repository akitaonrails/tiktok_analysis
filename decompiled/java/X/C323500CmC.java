package X;

import Y.AObserverS208S0100000_4;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM$onPrepared$1", f = "RecUserVideoListSharedVM.kt", l = {}, m = "invokeSuspend")
public final class C323500CmC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecUserVideoListSharedVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323500CmC(RecUserVideoListSharedVM recUserVideoListSharedVM, InterfaceC1364105Vn<? super C323500CmC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recUserVideoListSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323500CmC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserVideoListSharedVM@944f.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        RecUserVideoListSharedVM recUserVideoListSharedVM = this.LL;
        relationObservable.observe(recUserVideoListSharedVM, new AObserverS208S0100000_4(recUserVideoListSharedVM, 4));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecUserVideoListSharedVM@944f.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
