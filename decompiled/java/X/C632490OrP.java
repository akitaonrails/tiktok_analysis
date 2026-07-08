package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$pinMusic$1", f = "SearchMusicListViewModel.kt", l = {207, 208}, m = "invokeSuspend")
public final class C632490OrP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchMusicListViewModel LLILLJJLI;
    public final /* synthetic */ C632090Oql LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632490OrP(SearchMusicListViewModel searchMusicListViewModel, C632090Oql c632090Oql, int i, InterfaceC1364105Vn<? super C632490OrP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchMusicListViewModel;
        this.LLILLL = c632090Oql;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632490OrP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMusicListViewModel@4a17.pinMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchMusicListViewModel@4a17.pinMusic$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SearchMusicListViewModel searchMusicListViewModel = this.LLILLJJLI;
            if (!searchMusicListViewModel.LLILZLL && !searchMusicListViewModel.LLIZ) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                c2344009Gk.LJIIIIZZ("button_type", "pin_to_top");
                c2344009Gk.LJIIIIZZ("search_result_id", this.LLILLL.getMusicModel().getMusicId());
                c2344009Gk.LIZJ(this.LLILZ, "rank");
                C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
                SearchMusicListViewModel searchMusicListViewModel2 = this.LLILLJJLI;
                searchMusicListViewModel2.LLIZ = true;
                InterfaceC631590Opx interfaceC631590Opx = (InterfaceC631590Opx) searchMusicListViewModel2.LL.getOperator();
                String strYQ2 = this.LLILLJJLI.yQ2();
                if (strYQ2 == null) {
                    strYQ2 = "";
                }
                String musicId = this.LLILLL.getMusicModel().getMusicId();
                this.LL = 1;
                obj = interfaceC631590Opx.pinMusic(strYQ2, musicId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchMusicListViewModel@4a17.pinMusic$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SearchMusicListViewModel@4a17.pinMusic$1");
                return unit2;
            }
        }
        AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILLJJLI, this.LLILLL, 4);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS200S0200000_9, this) == objLJFF) {
            C1C7U.LIZIZ("SearchMusicListViewModel@4a17.pinMusic$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SearchMusicListViewModel@4a17.pinMusic$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
