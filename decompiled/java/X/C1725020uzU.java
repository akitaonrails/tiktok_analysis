package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0uzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.errorsdk.ErrorCodeHandler$triggerClientErrorMappingFetch$1$2$1", f = "ErrorCodeSdkImpl.kt", l = {}, m = "invokeSuspend")
public final class C1725020uzU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1725120uze LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ C1725060uzY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725020uzU(InterfaceC1725120uze interfaceC1725120uze, Throwable th, C1725060uzY c1725060uzY, InterfaceC1364105Vn<? super C1725020uzU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1725120uze;
        this.LLILLJJLI = th;
        this.LLILLL = c1725060uzY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1725020uzU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ErrorCodeHandler@e4e9.triggerClientErrorMappingFetch$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1725120uze interfaceC1725120uze = this.LL;
        if (interfaceC1725120uze != null) {
            EnumC1725040uzW enumC1725040uzW = EnumC1725040uzW.FETCH_CLIENT_VE_NETWORK_EXCEPTION;
            String strValueOf = String.valueOf(enumC1725040uzW.getErrorCode());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC1725040uzW.getMessage());
            sbLIZ.append(", msg=");
            sbLIZ.append(this.LLILLJJLI.getMessage());
            interfaceC1725120uze.onFail(strValueOf, C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILLL.LJ().LIZIZ("fetch_client_ve", EnumC1725040uzW.FETCH_CLIENT_VE_NETWORK_EXCEPTION, null);
        C1AF0.LJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ErrorCodeHandler@e4e9.triggerClientErrorMappingFetch$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
