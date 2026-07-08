package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS385S0200000_19;
import njp.a;

/* JADX INFO: renamed from: X.0OBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel$updateDataWithDB$1", f = "FollowingListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OBQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowingListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OBQ(FollowingListViewModel followingListViewModel, InterfaceC1364105Vn<? super C0OBQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followingListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OBQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> listLIZLLL;
        C1C7U.LIZ("FollowingListViewModel@13fb.updateDataWithDB$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService == null || (listLIZLLL = iFollowReadService.LIZLLL()) == null) {
            listLIZLLL = C13BV.INSTANCE;
        }
        FollowingListViewModel followingListViewModel = this.LL;
        followingListViewModel.withState(new AwS385S0200000_19(followingListViewModel, (FollowingListViewModel) listLIZLLL, (List<String>) 89));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingListViewModel@13fb.updateDataWithDB$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
