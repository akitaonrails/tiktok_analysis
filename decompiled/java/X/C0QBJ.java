package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS241S0000000_10;
import njp.a;

/* JADX INFO: renamed from: X.0QBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem$setListData$1$2", f = "SearchNimbleDocListAssem.kt", l = {}, m = "invokeSuspend")
public final class C0QBJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchNimbleDocListAssem LL;
    public final /* synthetic */ InterfaceC685060Qu0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QBJ(SearchNimbleDocListAssem searchNimbleDocListAssem, InterfaceC685060Qu0 interfaceC685060Qu0, InterfaceC1364105Vn<? super C0QBJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchNimbleDocListAssem;
        this.LLILLJJLI = interfaceC685060Qu0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QBJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNimbleDocListAssem@d326.setListData$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> listEG2 = null;
        ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ(this.LL.LLIIJLIL(), ISearchPovCardAbility.class, null);
        if (iSearchPovCardAbility != null) {
            listEG2 = iSearchPovCardAbility.EG2();
        }
        C653450Pk7<Aweme> c653450Pk7 = this.LL.LLL;
        if (c653450Pk7 != null) {
            c653450Pk7.LIZLLL(this.LLILLJJLI.getVideoList(), listEG2, AFwS241S0000000_10.get$arr$(271));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNimbleDocListAssem@d326.setListData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
