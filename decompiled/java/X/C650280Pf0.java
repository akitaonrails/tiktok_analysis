package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Pf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.utils.SearchSafeEventBusWrapper$1", f = "SearchSafeEventBusWrapper.kt", l = {}, m = "invokeSuspend")
public final class C650280Pf0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C650280Pf0(InterfaceC1364105Vn<? super C650280Pf0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C650280Pf0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        C1C7U.LIZ("SearchSafeEventBusWrapper@368f.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        if (iFriendsService != null && (relationServiceLIZIZ = iFriendsService.LIZIZ()) != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
            relationObservable.observeForever(new Observer() { // from class: X.0Pf1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    C650300Pf2.LIZLLL.LIZIZ(obj2);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchSafeEventBusWrapper@368f.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C650280Pf0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
