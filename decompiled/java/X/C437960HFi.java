package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.service.EcomSearchServiceImpl$deleteContentCard$1", f = "EcomSearchServiceImpl.kt", l = {1133}, m = "invokeSuspend")
public final class C437960HFi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437960HFi(View view, String str, Integer num, InterfaceC1364105Vn<? super C437960HFi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437960HFi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("EcomSearchServiceImpl@2921.deleteContentCard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            View view = this.LLILLJJLI;
            String str = this.LLILLL;
            Integer num = this.LLILZ;
            unit = null;
            IMixVSearchAbility iMixVSearchAbility = (IMixVSearchAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMixVSearchAbility.class, null);
            if (iMixVSearchAbility != null) {
                this.LL = 1;
                if (iMixVSearchAbility.XW(view, "ListCard", str, num, this) == objLJFF) {
                    C1C7U.LIZIZ("EcomSearchServiceImpl@2921.deleteContentCard$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(unit);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcomSearchServiceImpl@2921.deleteContentCard$1");
            return unit2;
        }
        unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EcomSearchServiceImpl@2921.deleteContentCard$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
