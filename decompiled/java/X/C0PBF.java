package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0PBF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel$insertCSCardSafe$1$1", f = "ClickSearchViewModel.kt", l = {151}, m = "invokeSuspend")
public final class C0PBF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ ClickSearchViewModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC594520NTm LLILZIL;
    public final /* synthetic */ Fragment LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PBF(LifecycleOwner lifecycleOwner, ClickSearchViewModel clickSearchViewModel, int i, InterfaceC594520NTm interfaceC594520NTm, Fragment fragment, InterfaceC1364105Vn<? super C0PBF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = clickSearchViewModel;
        this.LLILZ = i;
        this.LLILZIL = interfaceC594520NTm;
        this.LLILZLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PBF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        C1C7U.LIZ("ClickSearchViewModel@2c5d.insertCSCardSafe$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Boolean boolValueOf = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            } else {
                currentState = null;
            }
            if (currentState != Lifecycle.State.DESTROYED) {
                if (this.LLILLL.LLJIJIL) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCardSafe$1$1");
                    return unit;
                }
                long jIntValue = ((Number) C1822707Bx.LIZ.getValue()).intValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                    C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCardSafe$1$1");
                    return objLJFF;
                }
            }
            this.LLILLL.LLILZ = this.LLILZIL;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCardSafe$1$1");
            return unit2;
        }
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZLL, null), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            boolValueOf = Boolean.valueOf(searchServiceCenter$AdapterControlAbility.IU(this.LLILZIL, this.LLILZ, C0PL2.CLICK_SEARCH_CARD, false));
        }
        if (Intrinsics.LJFF(boolValueOf, true)) {
            this.LLILLL.LLJIJIL = true;
        }
        this.LLILLL.LLILZ = this.LLILZIL;
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ClickSearchViewModel@2c5d.insertCSCardSafe$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
