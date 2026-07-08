package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.List;

/* JADX INFO: renamed from: X.0QbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673420QbE {
    public final long LIZ;
    public final List<SearchHistory> LIZIZ;
    public final boolean LIZJ;
    public final SuggestWordResponse LIZLLL;
    public final TemplateData LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C673420QbE(long j, List<? extends SearchHistory> list, boolean z, SuggestWordResponse suggestWordResponse, TemplateData templateData) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = suggestWordResponse;
        this.LJ = templateData;
    }
}
