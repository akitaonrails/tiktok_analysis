package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.IMUserService$updateIMUserFollowStatus$1", f = "IMUserService.kt", l = {}, m = "invokeSuspend")
public final class C1479405qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMUser LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1479405qi(IMUser iMUser, InterfaceC1364105Vn<? super C1479405qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1479405qi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        C1C7U.LIZ("IMUserService@b0df.updateIMUserFollowStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        IMUser iMUser = this.LL;
        String secUid = null;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        IMUser iMUser2 = this.LL;
        if (iMUser2 != null) {
            secUid = iMUser2.getSecUid();
        }
        IMUser iMUserLJIIL = c1bgsLJ.LJIIL(uid, secUid, "im_local_db");
        if (iMUserLJIIL != null && this.LL != null) {
            if (iMUserLJIIL.isBlock() == this.LL.isBlock() && this.LL.getFollowStatus() == iMUserLJIIL.getFollowStatus()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMUserService@b0df.updateIMUserFollowStatus$1");
                return unit;
            }
            iMUserLJIIL.setFollowStatus(this.LL.getFollowStatus());
            if (iMUserLJIIL.getFollowStatus() == 0 || !this.LL.isBlock()) {
                iMUserLJIIL.setBlock(this.LL.isBlock());
            }
        } else {
            iMUserLJIIL = this.LL;
        }
        IMUser iMUser3 = this.LL;
        if (iMUser3 != null && iMUser3.getFollowStatus() == 0) {
            if (iMUserLJIIL != null) {
                iMUserLJIIL.setFollowTime(0L);
            }
        } else if (iMUserLJIIL != null) {
            iMUserLJIIL.setFollowTime(System.currentTimeMillis() / 1000);
        }
        C1479505qj.LIZ.LJIILIIL(iMUserLJIIL);
        C069P.LIZ().LIZ().LJIJI(iMUserLJIIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMUserService@b0df.updateIMUserFollowStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
