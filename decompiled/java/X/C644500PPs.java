package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.viewmodel.SearchPhotoDynamicViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0PPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.photosearch.viewmodel.SearchPhotoDynamicViewModel$refreshSearchDataList$1$1", f = "SearchPhotoDynamicViewModel.kt", l = {}, m = "invokeSuspend")
public final class C644500PPs extends C09AX implements Function2<C0O7A<C0O93>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchPhotoDynamicViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644500PPs(SearchPhotoDynamicViewModel searchPhotoDynamicViewModel, InterfaceC1364105Vn<? super C644500PPs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchPhotoDynamicViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C644500PPs c644500PPs = new C644500PPs(this.LLILLJJLI, interfaceC1364105Vn);
        c644500PPs.LL = obj;
        return c644500PPs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPhotoDynamicViewModel@8831.refreshSearchDataList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O7A c0o7a = (C0O7A) this.LL;
        if (c0o7a instanceof C0O79) {
            SearchMix searchMix = ((C0O93) ((C0O79) c0o7a).LJ).LIZ;
            if (searchMix != null) {
                this.LLILLJJLI.setState(new AwS589S0100000_10(searchMix, 254));
                LogPbBean logPbBean = searchMix.logPb;
                if (logPbBean != null) {
                    logPbBean.getImprId();
                }
            }
        } else if (c0o7a instanceof C0O78) {
            this.LLILLJJLI.setState(new AwS589S0100000_10(c0o7a, (C0O7A<C0O93>) 255));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoDynamicViewModel@8831.refreshSearchDataList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0O7A<C0O93> c0o7a, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0o7a, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
