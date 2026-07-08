package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchQueryCorrectCell;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS95S1200000_10;

/* JADX INFO: renamed from: X.0Qk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678920Qk6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchQueryCorrectCell LL;
    public final /* synthetic */ QueryDesc LLILLJJLI;
    public final /* synthetic */ List<Position> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ QueryDesc LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ QueryCorrectComponentInfo LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678920Qk6(SearchQueryCorrectCell searchQueryCorrectCell, QueryDesc queryDesc, List list, String str, AwS95S1200000_10 awS95S1200000_10, QueryDesc queryDesc2, String str2, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.LL = searchQueryCorrectCell;
        this.LLILLJJLI = queryDesc;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = awS95S1200000_10;
        this.LLILZLL = queryDesc2;
        this.LLIZ = str2;
        this.LLIZLLLIL = queryCorrectComponentInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean zLIZLLL = C678990QkD.LIZLLL(this.LL.I5());
        C678990QkD.LIZ(this.LL.I5(), zLIZLLL, this.LLILLJJLI.text, AbstractC19875512pd.copyOf((Collection) this.LLILLL), this.LLILZ, this.LLILLJJLI.clickable, !this.LLILLL.isEmpty(), 43, this.LLILZIL);
        QueryDesc queryDesc = this.LLILZLL;
        if (queryDesc != null) {
            SearchQueryCorrectCell searchQueryCorrectCell = this.LL;
            List<Position> list = this.LLILLL;
            String str = this.LLIZ;
            C678990QkD.LIZ((TuxTextView) searchQueryCorrectCell.LLILLJJLI.getValue(), zLIZLLL, queryDesc.text, AbstractC19875512pd.copyOf((Collection) list), str, queryDesc.clickable, false, 0, new AwS95S1200000_10(searchQueryCorrectCell, this.LLIZLLLIL, str, 14));
        }
        return Unit.LIZ;
    }
}
