package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0PBG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel$insertCSCard$1$1", f = "ClickSearchViewModel.kt", l = {128}, m = "invokeSuspend")
public final class C0PBG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ InterfaceC594520NTm LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ ClickSearchViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PBG(Fragment fragment, InterfaceC594520NTm interfaceC594520NTm, int i, ClickSearchViewModel clickSearchViewModel, InterfaceC1364105Vn<? super C0PBG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = interfaceC594520NTm;
        this.LLILZ = i;
        this.LLILZIL = clickSearchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PBG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ClickSearchViewModel@2c5d.insertCSCard$1$1");
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
            long jIntValue = ((Number) C1822707Bx.LIZ.getValue()).intValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCard$1$1");
                return objLJFF;
            }
        }
        Boolean boolValueOf = null;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILLJJLI, null), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            boolValueOf = Boolean.valueOf(searchServiceCenter$AdapterControlAbility.IU(this.LLILLL, this.LLILZ, C0PL2.CLICK_SEARCH_CARD, false));
        }
        if (Intrinsics.LJFF(boolValueOf, true)) {
            this.LLILZIL.LLJIJIL = true;
        }
        this.LLILZIL.LLILZ = this.LLILLL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCard$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
