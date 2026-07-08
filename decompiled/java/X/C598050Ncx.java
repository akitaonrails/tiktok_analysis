package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ncx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.util.ResponseConvertUtil$convertAndSavePopResponse$1", f = "ResponseConvertUtil.kt", l = {}, m = "invokeSuspend")
public final class C598050Ncx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<BaseResponse<PopProductResp>> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598050Ncx(C0X52<BaseResponse<PopProductResp>> c0x52, String str, boolean z, InterfaceC1364105Vn<? super C598050Ncx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598050Ncx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResponseConvertUtil@1e27.convertAndSavePopResponse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C598040Ncw c598040Ncw = C598040Ncw.LIZ;
        C0X52<BaseResponse<PopProductResp>> c0x52 = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c598040Ncw.getClass();
        try {
            String strLIZIZ = C598040Ncw.LIZIZ(c0x52);
            if (strLIZIZ != null) {
                if (z) {
                    c598040Ncw.getClass();
                    C598040Ncw.LIZJ(strLIZIZ);
                }
                C212391189t.LIZ.getClass();
                C212391189t.LIZIZ("pin_product", str, strLIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResponseConvertUtil@1e27.convertAndSavePopResponse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
