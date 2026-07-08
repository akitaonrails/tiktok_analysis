package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM$commonAfterRequest$3", f = "PhotoSearchBaseVM.kt", l = {}, m = "invokeSuspend")
public final class C676010QfP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LastSearch LL;
    public final /* synthetic */ PhotoSearchBaseVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C676010QfP(LastSearch lastSearch, PhotoSearchBaseVM photoSearchBaseVM, InterfaceC1364105Vn<? super C676010QfP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lastSearch;
        this.LLILLJJLI = photoSearchBaseVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C676010QfP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC675990QfN enumC675990QfN;
        InterfaceC676470Qg9 interfaceC676470Qg9Y0;
        C1C7U.LIZ("PhotoSearchBaseVM@68d3.commonAfterRequest$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null && (interfaceC676470Qg9Y0 = iSearchService.y0()) != null) {
            interfaceC676470Qg9Y0.LJIJJLI(this.LL);
        }
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLJJLI;
        PhotoSearchResponse photoSearchResponse = photoSearchBaseVM.LLIZ;
        if (photoSearchResponse != null && photoSearchResponse.LJFF) {
            enumC675990QfN = EnumC675990QfN.SUCCESS;
        } else {
            enumC675990QfN = EnumC675990QfN.FAILED;
        }
        photoSearchBaseVM.LL.setValue(new C676090QfX<>(photoSearchResponse, enumC675990QfN));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchBaseVM@68d3.commonAfterRequest$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
