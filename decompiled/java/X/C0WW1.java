package X;

import com.ss.android.ugc.aweme.account.otl.WebAuthTokenResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WW1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.WebAuthSyncLoginServer$getAuthToken$1$1", f = "WebAuthSyncLoginServer.kt", l = {165}, m = "invokeSuspend")
public final class C0WW1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WebAuthTokenResponse LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function2<WebAuthTokenResponse, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WW1(WebAuthTokenResponse webAuthTokenResponse, String str, String str2, Function2<? super WebAuthTokenResponse, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C0WW1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = webAuthTokenResponse;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WW1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        String str;
        Integer num;
        C1C7U.LIZ("WebAuthSyncLoginServer@eb94.getAuthToken$1$1");
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
            WebAuthTokenResponse webAuthTokenResponse = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            Function2<WebAuthTokenResponse, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILZIL;
            WebAuthTokenResponse.Data data = webAuthTokenResponse.data;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("start_url", str2);
            c0xgr.LIZLLL("target_url", str3);
            if (data != null && (num = data.errorCode) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c0xgr.LIZ(iIntValue, "error_code");
            if (data == null || (str = data.errorDescription) == null) {
                str = "";
            }
            c0xgr.LIZLLL("error_msg", str);
            C20684815ws.LJIILLIIL("web_otl_token_result", c0xgr.LIZ);
            this.LL = 1;
            if (function2.invoke(webAuthTokenResponse, this) == objLJFF) {
                C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.getAuthToken$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WebAuthSyncLoginServer@eb94.getAuthToken$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
