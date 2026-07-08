package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$bindTwitter$2", f = "TwitterPresenter.kt", l = {104}, m = "invokeSuspend")
public final class C859640Xnu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0YZL LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859640Xnu(C0YZL c0yzl, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C859640Xnu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yzl;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859640Xnu(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.bindTwitter$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0YZL c0yzl = this.LLILLJJLI;
            C859600Xnq c859600Xnq = new C859600Xnq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            C859590Xnp c859590Xnp = new C859590Xnp(this.LLILLJJLI, null);
            this.LL = 1;
            obj = c0yzl.LIZ(c859600Xnq, c859590Xnp, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2");
            return unit;
        }
        if (baseResponse.status_code == 0) {
            C1440005kM.LIZ(new C1436405jm(false));
            C0YZL c0yzl2 = this.LLILLJJLI;
            c0yzl2.LLILLJJLI.Kv0(this.LLILLL, this.LLILZ);
            this.LLILLJJLI.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("platform", "twitter");
            C20684815ws.LJIILLIIL("social_account_bind_success", c2344009Gk.LIZ);
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            C1232050iAN c1232050iAN = new C1232050iAN("click_save", EnumC1216940hm0.SOCIAL_ACCOUNT_BIND);
            c1232050iAN.LJIIIIZZ = EnumC1216840hlq.TWITTER;
            C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
            c1232140iAW.getClass();
            C1232140iAW.LJ(c1232060iAO);
        } else {
            this.LLILLJJLI.LIZIZ("Failed to store data to TikTok server", "send_token_to_sever");
            this.LLILLJJLI.LLILLJJLI.Kv0(null, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
