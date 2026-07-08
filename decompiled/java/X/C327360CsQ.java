package X;

import androidx.lifecycle.Observer;
import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager$3", f = "QueryExpManager.kt", l = {}, m = "invokeSuspend")
public final class C327360CsQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C327360CsQ(InterfaceC1364105Vn<? super C327360CsQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327360CsQ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EventLiveData<FollowStatus> relationObservable;
        C1C7U.LIZ("QueryExpManager@84cc.<init>$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null && (relationObservable = iMFriendsServiceLIZ.getRelationObservable()) != null) {
            relationObservable.observeForever(new Observer() { // from class: X.0Cug
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    String userId;
                    FollowStatus followStatus = (FollowStatus) obj2;
                    QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
                    if (C328780Cui.LIZ().enabled) {
                        int followStatus2 = followStatus.getFollowStatus();
                        if ((followStatus2 == 2 || followStatus2 == 1) && !QueryExpManager.LIZLLL(followStatus.getUserId()) && (userId = followStatus.getUserId()) != null) {
                            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                            c13dvLIZIZ.add("tt_dm_light_interaction_reversal");
                            c13dvLIZIZ.add("tt_ic_cameo_pair");
                            queryExpManager.LIZIZ(4, C1697820uHc.LIZ(c13dvLIZIZ), Collections.singletonList(userId));
                        }
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QueryExpManager@84cc.<init>$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C327360CsQ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
