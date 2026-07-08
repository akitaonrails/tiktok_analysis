package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.GeneralQueryResultData;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.TradeQueryResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager$doQuery$2$1$1", f = "QueryStatusManager.kt", l = {}, m = "invokeSuspend")
public final class C1707090uWZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0X52<BaseResponse<TradeQueryResponse>> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<GeneralQueryResultData> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ C259800zU<String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707090uWZ(C118300cf c118300cf, int i, C0X52<BaseResponse<TradeQueryResponse>> c0x52, int i2, C259800zU<GeneralQueryResultData> c259800zU, int i3, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C259800zU<String> c259800zU4, InterfaceC1364105Vn<? super C1707090uWZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c0x52;
        this.LLILZ = i2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = i3;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = c259800zU4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707090uWZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf A[PHI: r0
      0x00bf: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v11 java.lang.String) binds: [B:50:0x00b4, B:53:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707090uWZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
