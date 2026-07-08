package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01LT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowMobHelper$mobClickBatchUnfollowBtn$1", f = "ManageFollowMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01LT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01LT(InterfaceC1364105Vn<? super C01LT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01LT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageFollowMobHelper@f73d.mobClickBatchUnfollowBtn$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "manage_following_page");
        C20684815ws.LJIILLIIL("click_batch_unfollow_btn", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageFollowMobHelper@f73d.mobClickBatchUnfollowBtn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01LT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
