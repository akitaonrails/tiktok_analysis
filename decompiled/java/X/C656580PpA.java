package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1LoadMoreStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixCardProfile;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0PpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656580PpA {
    public final SearchMixFeed LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<Aweme> LJ;
    public final List<Aweme> LJFF;
    public final List<ImageData> LJI;
    public final List<InterfaceC682670Qq9> LJII;
    public final String LJIIIIZZ;
    public final List<RefSource> LJIIIZ;
    public final boolean LJIIJ;
    public final SearchMixCardProfile LJIIJJI;
    public final Object LJIIL;
    public final Top1LoadMoreStruct LJIILIIL;
    public final C649520Pdm LJIILJJIL;

    public /* synthetic */ C656580PpA(String str, String str2, List list, List list2, List list3, List list4, int i) {
        this(null, null, (i & 4) != 0 ? null : str, (i & 8) != 0 ? EnumC682590Qq1.MULTI_VIDEO.getValue() : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, null, list3, null, (i & 512) != 0 ? null : list4, false, null, null, null, null);
    }

    public C656580PpA(SearchMixFeed searchMixFeed, String str, String str2, String str3, List list, List list2, List list3, List list4, String str4, List list5, boolean z, SearchMixCardProfile searchMixCardProfile, Object obj, Top1LoadMoreStruct top1LoadMoreStruct, C649520Pdm c649520Pdm) {
        this.LIZ = searchMixFeed;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = list3;
        this.LJII = list4;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = list5;
        this.LJIIJ = z;
        this.LJIIJJI = searchMixCardProfile;
        this.LJIIL = obj;
        this.LJIILIIL = top1LoadMoreStruct;
        this.LJIILJJIL = c649520Pdm;
    }
}
