package X;

import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0g4H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.RechargeUtilKt$queryProductDetail$2", f = "RechargeUtil.kt", l = {102}, m = "invokeSuspend")
public final class C1151390g4H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Diamond>, Object> {
    public int LL;
    public final /* synthetic */ C1151400g4I LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151390g4H(int i, C1151400g4I c1151400g4I, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1151400g4I;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1151390g4H(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RechargeUtilKt@d250.queryProductDetail$2");
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
            C099F c099fLIZIZ = C090F.LIZIZ();
            C1148670fzt.LIZ().getPayManagerV2().LJ(this.LLILLL, C1134860fdc.LIZ.LIZ(), false, Collections.singletonList(this.LLILLJJLI.LL)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS153S0200000_17(this.LLILLJJLI, c099fLIZIZ, 28), new AfS186S0100000_17(c099fLIZIZ, 161));
            this.LL = 1;
            obj = c099fLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RechargeUtilKt@d250.queryProductDetail$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RechargeUtilKt@d250.queryProductDetail$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Diamond> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
