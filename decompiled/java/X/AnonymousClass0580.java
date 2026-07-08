package X;

import com.ss.android.ugc.aweme.account.interfaces.GetNonceResponse;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0580, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.awemelobby.LobbyNonceGenerator$getNonce$1", f = "LobbyNonceGenerator.kt", l = {27, 38, 44}, m = "invokeSuspend")
public final class AnonymousClass0580 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAccountNonceUtil LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0580(IAccountNonceUtil iAccountNonceUtil, String str, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super AnonymousClass0580> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iAccountNonceUtil;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0580(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("LobbyNonceGenerator@b4ca.getNonce$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LobbyNonceGenerator@b4ca.getNonce$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C20684815ws.onEventV3("nonce_request");
            IAccountNonceUtil iAccountNonceUtil = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            obj = iAccountNonceUtil.LIZ(str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LobbyNonceGenerator@b4ca.getNonce$1");
                return objLJFF;
            }
        }
        GetNonceResponse getNonceResponse = (GetNonceResponse) obj;
        String str3 = getNonceResponse.message;
        GetNonceResponse.Data data = getNonceResponse.data;
        if (u.LJIJI("success", str3, true) && data != null) {
            String str4 = data.nonce;
            C20684815ws.onEventV3("nonce_success");
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C057Z c057z = new C057Z(str4, this.LLILZ, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c057z) == objLJFF) {
                C1C7U.LIZIZ("LobbyNonceGenerator@b4ca.getNonce$1");
                return objLJFF;
            }
        } else {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (data != null && (str = data.description) != null) {
                str3 = str;
            }
            c2344009Gk.LJIIIIZZ("error_message", str3);
            C20684815ws.LJIILLIIL("nonce_fail", c2344009Gk.LIZ);
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C057Y c057y = new C057Y(this.LLILZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c057y) == objLJFF) {
                C1C7U.LIZIZ("LobbyNonceGenerator@b4ca.getNonce$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LobbyNonceGenerator@b4ca.getNonce$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
