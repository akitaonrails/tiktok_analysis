package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QFF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel$startDisplayTimeCalculation$1", f = "SearchBoxFYPViewModel.kt", l = {277}, m = "invokeSuspend")
public final class C0QFF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchBoxFYPViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QFF(SearchBoxFYPViewModel searchBoxFYPViewModel, InterfaceC1364105Vn<? super C0QFF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchBoxFYPViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QFF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchBoxFYPViewModel@d825.startDisplayTimeCalculation$1");
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
            long jFloatValue = (long) (((Number) C0A0A.LIZ.getValue()).floatValue() * LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jFloatValue, this) == objLJFF) {
                C1C7U.LIZIZ("SearchBoxFYPViewModel@d825.startDisplayTimeCalculation$1");
                return objLJFF;
            }
        }
        if (SearchBoxFYPViewModel.LLJILJILJ == EnumC682820QqO.SHOWING) {
            this.LLILLJJLI.JM2(EnumC1594380ram.LAUNCH_30S, null, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchBoxFYPViewModel@d825.startDisplayTimeCalculation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
