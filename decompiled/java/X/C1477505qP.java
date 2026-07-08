package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.user.UserBindInfoRepository$getInfo$1$observerRelationChange$1$observer$1$1", f = "ShareUserViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1477505qP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FollowStatus LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1477505qP(FollowStatus followStatus, InterfaceC1364105Vn<? super C1477505qP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = followStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1477505qP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserBindInfoRepository@38de.getInfo$1$observerRelationChange$1$observer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(this.LL.getUserId(), null);
        if (iMUserLJ != null) {
            FollowStatus followStatus = this.LL;
            int followStatus2 = iMUserLJ.getFollowStatus();
            Integer followerStatus = followStatus.getFollowerStatus();
            if (followerStatus == null || followStatus2 != followerStatus.intValue()) {
                InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
                iMUserLJ.setFollowStatus(followStatus.getFollowStatus());
                imUserService.LJIILIIL(iMUserLJ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserBindInfoRepository@38de.getInfo$1$observerRelationChange$1$observer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
