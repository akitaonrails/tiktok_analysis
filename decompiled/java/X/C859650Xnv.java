package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$unbindTwitter$2", f = "TwitterPresenter.kt", l = {129, 140}, m = "invokeSuspend")
public final class C859650Xnv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0YZL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859650Xnv(C0YZL c0yzl, InterfaceC1364105Vn<? super C859650Xnv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yzl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859650Xnv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TwitterPresenter@7a3a.unbindTwitter$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0YZL c0yzl = this.LLILLJJLI;
            C859610Xnr c859610Xnr = new C859610Xnr(null);
            C859580Xno c859580Xno = new C859580Xno(this.LLILLJJLI, null);
            this.LL = 1;
            obj = c0yzl.LIZ(c859610Xnr, c859580Xno, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2");
            return unit2;
        }
        if (baseResponse.status_code == 0) {
            C1440005kM.LIZ(new C1436405jm(false));
            this.LLILLJJLI.LLILLJJLI.Kv0(null, null);
            this.LLILLJJLI.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("platform", "twitter");
            C20684815ws.LJIILLIIL("social_account_unbind_success", c2344009Gk.LIZ);
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            C1232050iAN c1232050iAN = new C1232050iAN("click_save", EnumC1216940hm0.SOCIAL_ACCOUNT_UNBIND);
            c1232050iAN.LJIIIIZZ = EnumC1216840hlq.TWITTER;
            C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
            c1232140iAW.getClass();
            C1232140iAW.LJ(c1232060iAO);
        } else {
            C0YZL c0yzl2 = this.LLILLJJLI;
            this.LL = 2;
            c0yzl2.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C859560Xnm(c0yzl2, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
