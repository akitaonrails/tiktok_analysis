package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.GeneralQueryResultData;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager$doQuery$2$1$2", f = "QueryStatusManager.kt", l = {}, m = "invokeSuspend")
public final class C1706840uWA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0X52<BaseResponse<GeneralQueryResultData>> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706840uWA(C118300cf c118300cf, int i, C0X52<BaseResponse<GeneralQueryResultData>> c0x52, int i2, int i3, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C1706840uWA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c0x52;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706840uWA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GeneralQueryResultData generalQueryResultData;
        C1C7U.LIZ("QueryStatusManager@726c.doQuery$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = this.LLILLJJLI;
        if (this.LLILLL.LIZJ()) {
            String str = "";
            if (this.LLILLL.LIZIZ.LIZ() && (generalQueryResultData = this.LLILLL.LIZIZ.data) != null && (Intrinsics.LJFF(generalQueryResultData.resultCode, "success") || Intrinsics.LJFF(generalQueryResultData.resultCode, "fail"))) {
                GeneralQueryResultData generalQueryResultData2 = this.LLILLL.LIZIZ.data;
                if (generalQueryResultData2 != null && Intrinsics.LJFF(generalQueryResultData2.resultCode, "success")) {
                    this.LL.element = this.LLILZ;
                } else {
                    this.LL.element = this.LLILZIL;
                    C259800zU<String> c259800zU = this.LLILZLL;
                    GeneralQueryResultData generalQueryResultData3 = this.LLILLL.LIZIZ.data;
                    T t = str;
                    if (generalQueryResultData3 != null) {
                        String str2 = generalQueryResultData3.errorContent;
                        t = str;
                        if (str2 != null) {
                            t = str2;
                        }
                    }
                    c259800zU.element = t;
                }
            } else {
                GeneralQueryResultData generalQueryResultData4 = this.LLILLL.LIZIZ.data;
                if (generalQueryResultData4 != null && (Intrinsics.LJFF(generalQueryResultData4.resultCode, "success") || Intrinsics.LJFF(generalQueryResultData4.resultCode, "fail"))) {
                    this.LL.element = this.LLILZIL;
                    C259800zU<String> c259800zU2 = this.LLILZLL;
                    String str3 = this.LLILLL.LIZIZ.errorContent;
                    T t2 = str;
                    if (str3 != null) {
                        t2 = str3;
                    }
                    c259800zU2.element = t2;
                }
            }
            this.LLIZ.element = this.LLILLL.LIZIZ.pipoErrorAction;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QueryStatusManager@726c.doQuery$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
