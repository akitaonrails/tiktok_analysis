package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResultRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardPCDisplayHelper$reportBillboardResultToServer$1", f = "BillboardPCDisplayHelper.kt", l = {410}, m = "invokeSuspend")
public final class C1728270v4j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728270v4j(String str, List<String> list, int i, boolean z, InterfaceC1364105Vn<? super C1728270v4j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728270v4j(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BillboardPCDisplayHelper@3037.reportBillboardResultToServer$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1728220v4e c1728220v4e = C1729400v6Y.LIZJ.LLILLJJLI;
                String str = this.LLILLJJLI;
                List<String> list = this.LLILLL;
                int i3 = this.LLILZ;
                if (this.LLILZIL) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.LL = 1;
                if (c1728220v4e.LL.LL.reportDisplayResult(new DisplayResultRequestBody(str, list, i3, i), this) == objLJFF) {
                    C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.reportBillboardResultToServer$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.reportBillboardResultToServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
