package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.tts.sku.us.ISkuBottomCommon$selectVMSubscribe$2$1", f = "ISkuBottomCommon.kt", l = {74}, m = "invokeSuspend")
public final class C993403uW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC954103oB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C993403uW(InterfaceC954103oB interfaceC954103oB, InterfaceC1364105Vn<? super C993403uW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC954103oB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C993403uW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0434 anonymousClass0434;
        C1C7U.LIZ("ISkuBottomCommon@2a5f.selectVMSubscribe$2$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("ISkuBottomCommon@2a5f.selectVMSubscribe$2$1");
                return objLJFF;
            }
        }
        AnonymousClass0434 anonymousClass04342 = ((SkuBottomAssem) this.LLILLJJLI).LLJJIJIIJIL;
        if ((anonymousClass04342 != null && anonymousClass04342.getVisibility() != 0) || ((anonymousClass0434 = ((SkuBottomAssem) this.LLILLJJLI).LLJJIJIIJIL) != null && anonymousClass0434.getChildCount() == 0)) {
            C10296040w.LIZ.getClass();
            C10296040w.LJFF("sku_bottom_button_visibility_error", "bottom_area is null after data is ready");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ISkuBottomCommon@2a5f.selectVMSubscribe$2$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ISkuBottomCommon@2a5f.selectVMSubscribe$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
