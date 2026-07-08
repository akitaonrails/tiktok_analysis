package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$clearCurShopTabUI$1", f = "CustomDotVMV2.kt", l = {}, m = "invokeSuspend")
public final class C1768670w7t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CustomDotVMV2 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768670w7t(CustomDotVMV2 customDotVMV2, String str, InterfaceC1364105Vn<? super C1768670w7t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = customDotVMV2;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768670w7t(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.clearCurShopTabUI$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CustomDotVMV2 customDotVMV2 = this.LL;
        String str = this.LLILLJJLI;
        if (C7879035x.LIZLLL()) {
            customDotVMV2.AQ2(new CustomDotResponseV2(null, null, C2286608xc.LJ(EnumC1768910w8H.HIDE.getValue()), null, 0L, 0L), new Pair<>(true, str));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                customDotVMV2.AQ2(new CustomDotResponseV2(null, null, C2286608xc.LJ(EnumC1768910w8H.HIDE.getValue()), null, 0L, 0L), new Pair<>(true, str));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.clearCurShopTabUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
