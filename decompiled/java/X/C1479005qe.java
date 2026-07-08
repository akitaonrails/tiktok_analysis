package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.IMUserService$updateShareStatus$1", f = "IMUserService.kt", l = {233, 244}, m = "invokeSuspend")
public final class C1479005qe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public User LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ User LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1479005qe(User user, boolean z, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1479005qe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = user;
        this.LLILZIL = z;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1479005qe(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        User user;
        int iIntValue;
        C1C7U.LIZ("IMUserService@b0df.updateShareStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    iIntValue = this.LLILLJJLI;
                    user = this.LL;
                    C155000ia.LIZIZ(obj);
                    C1479505qj.LIZ.getClass();
                    ((IShareStatusKeva) C1479505qj.LIZJ.getValue()).LIZ(C2286608xc.LJ(iIntValue), user.getUid());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMUserService@b0df.updateShareStatus$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String uid = this.LLILZ.getUid();
            boolean z = this.LLILZIL;
            this.LLILLL = 1;
            obj = c1bgsLJ.LJIIJ(uid, "im_share", z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMUserService@b0df.updateShareStatus$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null) {
            if (!this.LLILZIL || iMUser.getFollowStatus() != 0 || iMUser.isMAF()) {
                C1479505qj.LIZ.LJIILIIL(iMUser);
            }
            numLJ = C2286608xc.LJ(iMUser.getShareStatus());
        } else {
            numLJ = null;
        }
        if (numLJ != null) {
            user = this.LLILZ;
            Function1<Boolean, Unit> function1 = this.LLILZLL;
            iIntValue = numLJ.intValue();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C411301ip c411301ip = new C411301ip(iIntValue, null, function1);
            this.LL = user;
            this.LLILLJJLI = iIntValue;
            this.LLILLL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c411301ip) == objLJFF) {
                C1C7U.LIZIZ("IMUserService@b0df.updateShareStatus$1");
                return objLJFF;
            }
            C1479505qj.LIZ.getClass();
            ((IShareStatusKeva) C1479505qj.LIZJ.getValue()).LIZ(C2286608xc.LJ(iIntValue), user.getUid());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMUserService@b0df.updateShareStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
