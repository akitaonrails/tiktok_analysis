package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$queryDiscoverAwemeList$1", f = "SearchStickerViewModel.kt", l = {246}, m = "invokeSuspend")
public final class C090D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SearchStickerViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090D(int i, SearchStickerViewModel searchStickerViewModel, InterfaceC1364105Vn<? super C090D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = searchStickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> listLL;
        C1C7U.LIZ("SearchStickerViewModel@2710.queryDiscoverAwemeList$1");
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
            IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
            int i2 = this.LLILLJJLI;
            this.LL = 1;
            obj = iPropReuseService.LJIIL(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchStickerViewModel@2710.queryDiscoverAwemeList$1");
                return objLJFF;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            listLL = C13LP.LL(iterable, 10);
        } else {
            listLL = null;
        }
        this.LLILLL.LLJJLIIIJLLLLLLLZ.postValue(listLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStickerViewModel@2710.queryDiscoverAwemeList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
