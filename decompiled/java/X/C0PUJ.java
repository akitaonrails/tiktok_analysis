package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$getCSInfoAndStartTimer$1", f = "SearchVideoHolder.kt", l = {4353}, m = "invokeSuspend")
public final class C0PUJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ SearchVideoHolder LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PUJ(boolean z, long j, SearchVideoHolder searchVideoHolder, int i, InterfaceC1364105Vn<? super C0PUJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = searchVideoHolder;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PUJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1");
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
            if (this.LLILLJJLI) {
                long j = this.LLILLL;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1");
                    return objLJFF;
                }
            }
        }
        ClickSearchViewModel clickSearchViewModel = this.LLILZ.LLLLLLIL;
        if (clickSearchViewModel != null && clickSearchViewModel.yQ2()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1");
            return unit;
        }
        SearchVideoHolder searchVideoHolder = this.LLILZ;
        C0PUE c0pue = searchVideoHolder.LLLLLL;
        if (c0pue != null) {
            int i2 = this.LLILZIL;
            c0pue.LJIIJ = searchVideoHolder.LLLLLZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0PUI(searchVideoHolder, i2, c0pue, null), 3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.getCSInfoAndStartTimer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
