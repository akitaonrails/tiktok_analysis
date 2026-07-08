package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OrQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel$unPinMusic$1", f = "SearchMusicListViewModel.kt", l = {256, 257}, m = "invokeSuspend")
public final class C632500OrQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchMusicListViewModel LLILLJJLI;
    public final /* synthetic */ C632090Oql LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632500OrQ(SearchMusicListViewModel searchMusicListViewModel, C632090Oql c632090Oql, InterfaceC1364105Vn<? super C632500OrQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchMusicListViewModel;
        this.LLILLL = c632090Oql;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632500OrQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MusicGroup> musicGroups;
        MusicGroup musicGroupLIZIZ;
        String sourceMusicId;
        C1C7U.LIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SearchMusicListViewModel searchMusicListViewModel = this.LLILLJJLI;
            if (!searchMusicListViewModel.LLILZLL && !searchMusicListViewModel.LLIZ) {
                searchMusicListViewModel.LLIZ = true;
                Music musicWQ2 = searchMusicListViewModel.wQ2(this.LLILLL.getMusicModel());
                SearchPinnedMusicList searchPinnedMusicListXQ2 = this.LLILLJJLI.xQ2();
                if (searchPinnedMusicListXQ2 != null && (musicGroups = searchPinnedMusicListXQ2.getMusicGroups()) != null && (musicGroupLIZIZ = C632050Oqh.LIZIZ(musicWQ2.getIdStr(), musicGroups)) != null && (sourceMusicId = musicGroupLIZIZ.getSourceMusicId()) != null) {
                    InterfaceC631590Opx interfaceC631590Opx = (InterfaceC631590Opx) this.LLILLJJLI.LL.getOperator();
                    String strYQ2 = this.LLILLJJLI.yQ2();
                    if (strYQ2 == null) {
                        strYQ2 = "";
                    }
                    this.LL = 1;
                    obj = interfaceC631590Opx.LLFZ(strYQ2, sourceMusicId, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
                    return unit2;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
                return unit3;
            }
        }
        AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILLJJLI, this.LLILLL, 5);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS200S0200000_9, this) == objLJFF) {
            C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SearchMusicListViewModel@4a17.unPinMusic$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
