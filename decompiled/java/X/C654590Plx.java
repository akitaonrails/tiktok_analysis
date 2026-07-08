package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0Plx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654590Plx {
    public final SearchCardInfo LIZ;
    public final C653660PkS LIZIZ;
    public List<? extends Aweme> LIZJ;
    public long LIZLLL;
    public final String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C654590Plx() {
        this((SearchCardInfo) null, (C653660PkS) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 0L, 31);
    }

    public /* synthetic */ C654590Plx(SearchCardInfo searchCardInfo, C653660PkS c653660PkS, List list, long j, int i) {
        this((i & 1) != 0 ? null : searchCardInfo, (i & 2) != 0 ? null : c653660PkS, (List<? extends Aweme>) ((i & 4) != 0 ? null : list), (i & 8) != 0 ? 0L : j, (String) null);
    }

    public C654590Plx(SearchCardInfo searchCardInfo, C653660PkS c653660PkS, List<? extends Aweme> list, long j, String str) {
        this.LIZ = searchCardInfo;
        this.LIZIZ = c653660PkS;
        this.LIZJ = list;
        this.LIZLLL = j;
        this.LJ = str;
    }
}
