package X;

import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchQueryCorrectCell;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS95S1200000_10;

/* JADX INFO: renamed from: X.0Qk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678930Qk7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchQueryCorrectCell LL;
    public final /* synthetic */ QueryDesc LLILLJJLI;
    public final /* synthetic */ List<Position> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ QueryCorrectComponentInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678930Qk7(SearchQueryCorrectCell searchQueryCorrectCell, QueryDesc queryDesc, List<Position> list, String str, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.LL = searchQueryCorrectCell;
        this.LLILLJJLI = queryDesc;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = queryCorrectComponentInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C678990QkD.LIZ(this.LL.I5(), C678990QkD.LIZLLL(this.LL.I5()), this.LLILLJJLI.text, AbstractC19875512pd.copyOf((Collection) this.LLILLL), this.LLILZ, this.LLILLJJLI.clickable, !this.LLILLL.isEmpty(), 43, new AwS95S1200000_10(this.LL, this.LLILZIL, this.LLILZ, 16));
        return Unit.LIZ;
    }
}
