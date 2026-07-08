package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PBH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel$insertClickRecommendProductsCard$1$1", f = "ClickSearchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0PBH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ ClickSearchViewModel LLILLJJLI;
    public final /* synthetic */ SearchMixFeed LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PBH(LifecycleOwner lifecycleOwner, ClickSearchViewModel clickSearchViewModel, SearchMixFeed searchMixFeed, int i, Fragment fragment, String str, InterfaceC1364105Vn<? super C0PBH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = clickSearchViewModel;
        this.LLILLL = searchMixFeed;
        this.LLILZ = i;
        this.LLILZIL = fragment;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PBH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PBH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
