package X;

import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PHA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM$setup$1", f = "SearchCardProtocolManager.kt", l = {}, m = "invokeSuspend")
public final class C0PHA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ SearchCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PHA(InterfaceC665370Q7z interfaceC665370Q7z, SearchCardContainerSharedVM searchCardContainerSharedVM, InterfaceC1364105Vn<? super C0PHA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = searchCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PHA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCardContainerSharedVM@3632.setup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, ISearchCardProtocol.class, false);
        if (listLIZIZ != null) {
            SearchCardContainerSharedVM searchCardContainerSharedVM = this.LLILLJJLI;
            searchCardContainerSharedVM.LL.clear();
            Boolean.valueOf(searchCardContainerSharedVM.LL.addAll(listLIZIZ));
        }
        C0QG3.LIZ.getClass();
        this.LLILLJJLI.LL.addAll(C0QG3.LIZIZ.LIZ());
        this.LLILLJJLI.LLILLJJLI.clear();
        C0PH9 c0ph9 = this.LLILLJJLI.LLILZIL;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        c0ph9.LIZ.clear();
        List listLIZIZ2 = C1554610qYd.LIZIZ(interfaceC665370Q7z, SearchTransitionalCardProtocol.class, false);
        if (listLIZIZ2 != null) {
            c0ph9.LIZ.addAll(listLIZIZ2);
        }
        c0ph9.LIZIZ.clear();
        this.LLILLJJLI.LLILZ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCardContainerSharedVM@3632.setup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
