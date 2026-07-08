package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsApi;
import com.ss.android.ugc.aweme.setting.page.security.SecurityAccountRecoveryCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.security.SecurityAccountRecoveryCell$onResume$1", f = "SecurityAccountRecoveryItem.kt", l = {38, 39}, m = "invokeSuspend")
public final class C848700XRc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SecurityAccountRecoveryCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848700XRc(SecurityAccountRecoveryCell securityAccountRecoveryCell, InterfaceC1364105Vn<? super C848700XRc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = securityAccountRecoveryCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C848700XRc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityAccountRecoveryCell@3166.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SecurityAccountRecoveryCell@3166.onResume$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TrustedFriendsApi trustedFriendsApi = TrustedFriendsApi.LIZ;
            this.LL = 1;
            obj = trustedFriendsApi.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SecurityAccountRecoveryCell@3166.onResume$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C848710XRd c848710XRd = new C848710XRd((C0X52) obj, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c848710XRd) == objLJFF) {
            C1C7U.LIZIZ("SecurityAccountRecoveryCell@3166.onResume$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SecurityAccountRecoveryCell@3166.onResume$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
