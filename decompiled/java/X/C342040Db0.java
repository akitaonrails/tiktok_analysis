package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchMarkdownNimblePreloadPlugin;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS72S0500000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Db0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM$preload$lastJob$1", f = "SearchMarkdownContentCacheVM.kt", l = {}, m = "invokeSuspend")
public final class C342040Db0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ List<SearchMixFeed> LLILLL;
    public final /* synthetic */ SearchMarkdownContentCacheVM LLILZ;
    public final /* synthetic */ ISearchMarkdownNimblePreloadPlugin LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C342040Db0(Fragment fragment, List<? extends SearchMixFeed> list, SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, ISearchMarkdownNimblePreloadPlugin iSearchMarkdownNimblePreloadPlugin, InterfaceC1364105Vn<? super C342040Db0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = list;
        this.LLILZ = searchMarkdownContentCacheVM;
        this.LLILZIL = iSearchMarkdownNimblePreloadPlugin;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342040Db0 c342040Db0 = new C342040Db0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c342040Db0.LL = obj;
        return c342040Db0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMarkdownContentCacheVM@d5b0.preload$lastJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C08MJ.LIZ(new AwS72S0500000_10(interfaceC497601wk, (InterfaceC497601wk) this.LLILLJJLI, (Fragment) this.LLILLL, (List<? extends SearchMixFeed>) this.LLILZ, (SearchMarkdownContentCacheVM) this.LLILZIL, (ISearchMarkdownNimblePreloadPlugin) 2), ((Boolean) C0BD7.LIZ.getValue()).booleanValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMarkdownContentCacheVM@d5b0.preload$lastJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
