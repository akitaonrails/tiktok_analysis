package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.profile.business.ur.alias.AliasServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasServiceImpl$subscribeToRelationStatusChange$1", f = "AliasServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1653806dk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AliasServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653806dk(AliasServiceImpl aliasServiceImpl, InterfaceC1364105Vn<? super C1653806dk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aliasServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1653806dk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AliasServiceImpl@2268.subscribeToRelationStatusChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        final AliasServiceImpl aliasServiceImpl = this.LL;
        relationObservable.observeForever(new Observer() { // from class: X.06dl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                String userId;
                FollowStatus followStatus = (FollowStatus) obj2;
                if (followStatus.getFollowStatus() == C0SY7.UNFOLLOW.getValue() && (userId = followStatus.getUserId()) != null) {
                    aliasServiceImpl.LJIIIZ(userId);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliasServiceImpl@2268.subscribeToRelationStatusChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
