package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ihe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.user.repository.UserViewModel$follow$1$1", f = "UserViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1252680ihe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1252750ihl<FollowStatus> LL;
    public final /* synthetic */ C1252380ihA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252680ihe(AbstractC1252750ihl<FollowStatus> abstractC1252750ihl, C1252380ihA c1252380ihA, InterfaceC1364105Vn<? super C1252680ihe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1252750ihl;
        this.LLILLJJLI = c1252380ihA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1252680ihe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserViewModel@a01f.follow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FollowStatus followStatus = (FollowStatus) ((C1252540ihQ) this.LL).LIZ;
        FollowStatus followStatusCopy = followStatus.copy(followStatus.watchStatus, followStatus.followStatus, followStatus.contactName, followStatus.isEnterprise, followStatus.userId, followStatus.secUserId, followStatus.isFollowSuccess, followStatus.isFollowChange, followStatus.followerStatus, followStatus.followFrom, followStatus.user, followStatus.logPb, followStatus.preStatus, followStatus.isFromSharerCard);
        if (followStatusCopy.getUserId() == null) {
            followStatusCopy.setUserId(this.LLILLJJLI.LIZ);
        }
        if (followStatusCopy.getSecUserId() == null) {
            followStatusCopy.setSecUserId(this.LLILLJJLI.LIZIZ);
        }
        C1076010e6h.LIZJ.LIZIZ().LJFF().postValue(followStatusCopy);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserViewModel@a01f.follow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
