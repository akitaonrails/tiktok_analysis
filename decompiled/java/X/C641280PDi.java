package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rerank.config.SearchInflowReRankConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C641280PDi {
    public final C0PI7 LIZ;
    public final int LIZIZ;
    public String LIZJ = "";
    public final ArrayList<Aweme> LIZLLL = new ArrayList<>();
    public final boolean LJ;
    public final C01GW LJFF;

    public C641280PDi(C0PI7 c0pi7, int i) {
        this.LIZ = c0pi7;
        this.LIZIZ = i;
        this.LJ = ((SearchInflowReRankConfig) C0PJR.LIZIZ.getValue()).enableInflowReRank == 1;
        this.LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(316));
    }
}
