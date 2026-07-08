package X;

import Y.AObserverS224S0100000_21;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.LiveShareLinkManager$1", f = "LiveShareLinkManager.kt", l = {}, m = "invokeSuspend")
public final class C1378300lyG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1378280lyE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378300lyG(C1378280lyE c1378280lyE, InterfaceC1364105Vn<? super C1378300lyG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1378280lyE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1378300lyG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        C1C7U.LIZ("LiveShareLinkManager@7817.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1378310lyH.LIZ.getClass();
        IFriendsService iFriendsService = C1378310lyH.LIZIZ;
        if (iFriendsService != null && (relationServiceLIZIZ = iFriendsService.LIZIZ()) != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
            relationObservable.observeForever(new AObserverS224S0100000_21(this.LL, 39));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveShareLinkManager@7817.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
