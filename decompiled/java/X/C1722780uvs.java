package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.home.repo.network.WalletHomeApi;
import com.ss.android.ugc.aweme.home.repo.network.data.BizContentRequest;
import com.ss.android.ugc.aweme.home.repo.network.data.Configuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPiListUseCase$internalInvoke$2", f = "GetPiListUseCase.kt", l = {85, 97}, m = "invokeSuspend")
public final class C1722780uvs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1623806Xk<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C1722900uw4 LLILLJJLI;
    public final /* synthetic */ C1722790uvt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722780uvs(C1722900uw4 c1722900uw4, C1722790uvt c1722790uvt, InterfaceC1364105Vn<? super C1722780uvs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1722900uw4;
        this.LLILLL = c1722790uvt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722780uvs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object basicInfo = obj;
        C1C7U.LIZ("GetPiListUseCase@6b87.internalInvoke$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(basicInfo);
                    C1623606Xi c1623606Xi = new C1623606Xi(((C0X52) basicInfo).LIZIZ);
                    C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
                    return c1623606Xi;
                }
                C155000ia.LIZIZ(basicInfo);
            } else {
                C155000ia.LIZIZ(basicInfo);
                InterfaceC1722860uw0 interfaceC1722860uw0 = this.LLILLJJLI.LIZ;
                C491101vh c491101vh = C491101vh.LIZ;
                this.LL = 1;
                if (interfaceC1722860uw0.LLIIIZ(c491101vh, this) == objLJFF) {
                    C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
                    return objLJFF;
                }
            }
            C1722790uvt c1722790uvt = this.LLILLL;
            if (c1722790uvt != null && c1722790uvt.LIZ()) {
                C1722790uvt c1722790uvt2 = this.LLILLL;
                String str = c1722790uvt2.LLJ;
                if (str == null) {
                    str = "";
                }
                String str2 = c1722790uvt2.LLIZ;
                if (str2 == null) {
                    str2 = "";
                }
                BizContentRequest bizContentRequest = new BizContentRequest(str, str2, C2222691Bz1.LIZ(), "PAYIN_PAYOUT", C1708890uZT.LIZ, null, null, null, null, new Configuration(null, null, null, null, null, null, null, 127, null));
                WalletHomeApi walletHomeApiLIZ = WalletHomeApi.LIZ.LIZ(this.LLILLL.LLILZ);
                C1722790uvt c1722790uvt3 = this.LLILLL;
                String str3 = c1722790uvt3.LLILLJJLI;
                String str4 = c1722790uvt3.LLILZLL;
                if (str4 == null) {
                    str4 = "";
                }
                String strLIZLLL = C08JS.LIZLLL(bizContentRequest);
                this.LL = 2;
                basicInfo = walletHomeApiLIZ.getBasicInfo(str3, str4, strLIZLLL, this);
                if (basicInfo == objLJFF) {
                    C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
                    return objLJFF;
                }
                C1623606Xi c1623606Xi2 = new C1623606Xi(((C0X52) basicInfo).LIZIZ);
                C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
                return c1623606Xi2;
            }
            C491001vg c491001vg = new C491001vg(new C1035210d2t());
            C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
            return c491001vg;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C491001vg c491001vg2 = new C491001vg(th);
            C1C7U.LIZIZ("GetPiListUseCase@6b87.internalInvoke$2");
            return c491001vg2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1623806Xk<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
