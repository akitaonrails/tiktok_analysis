package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ozh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel$recordSearchMusicHistory$1", f = "MusicDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C637630Ozh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicDetailViewModel LL;
    public final /* synthetic */ Music LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ UrlModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637630Ozh(MusicDetailViewModel musicDetailViewModel, Music music, String str, boolean z, UrlModel urlModel, InterfaceC1364105Vn<? super C637630Ozh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicDetailViewModel;
        this.LLILLJJLI = music;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637630Ozh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<String> urlList;
        C1C7U.LIZ("MusicDetailViewModel@92b7.recordSearchMusicHistory$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJIJIL = this.LLILLJJLI.getIdStr();
        String str = this.LLILLL;
        Music music = this.LLILLJJLI;
        boolean z2 = this.LLILZ;
        UrlModel urlModel = this.LLILZIL;
        boolean z3 = true;
        try {
            String str2 = null;
            C0QF6 c0qf6C = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).C(null);
            SearchHistory searchHistory = new SearchHistory();
            searchHistory.keyword = str;
            searchHistory.type = 0;
            searchHistory.musicId = music.getIdStr();
            if (z2) {
                z = true;
            } else {
                z = false;
            }
            searchHistory.isOriginalMusic = C637620Ozg.LIZ(music, z);
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLL(urlList);
            }
            searchHistory.coverImageUrl = String.valueOf(str2);
            searchHistory.isValidMusic = false;
            c0qf6C.LIZ(searchHistory, "music_detail");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Music music2 = this.LLILLJJLI;
        boolean z4 = this.LLILZ;
        MusicDetailViewModel musicDetailViewModel = this.LL;
        try {
            ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
            String idStr = music2.getIdStr();
            if (!z4) {
                z3 = false;
            }
            iSearchService.n0(idStr, String.valueOf(musicDetailViewModel.hashCode()), C637620Ozg.LIZ(music2, z3));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailViewModel@92b7.recordSearchMusicHistory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
