package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.tts.sku.us.ISkuBottomCommon$updateButtonUI$1", f = "ISkuBottomCommon.kt", l = {}, m = "invokeSuspend")
public final class C993303uV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC954103oB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C993303uV(InterfaceC954103oB interfaceC954103oB, InterfaceC1364105Vn<? super C993303uV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC954103oB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C993303uV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIIIZZ;
        C1C7U.LIZ("ISkuBottomCommon@2a5f.updateButtonUI$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseAssem) this.LL).getViewModel().LLJI;
            if (skuEnterParams == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(skuEnterParams)) == null) {
                strLJIIIIZZ = "enter_param is null";
            }
            C10296040w.LIZ.getClass();
            C10296040w.LJFF("sku_bottom_button_empty_error", strLJIIIIZZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ISkuBottomCommon@2a5f.updateButtonUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
