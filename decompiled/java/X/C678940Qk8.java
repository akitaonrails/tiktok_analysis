package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS95S1200000_10;

/* JADX INFO: renamed from: X.0Qk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678940Qk8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ TuxTextView LL;
    public final /* synthetic */ QueryDesc LLILLJJLI;
    public final /* synthetic */ List<Position> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ QueryDesc LLILZLL;
    public final /* synthetic */ TuxTextView LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C678910Qk5 LLJ;
    public final /* synthetic */ QueryCorrectComponentInfo LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678940Qk8(TuxTextView tuxTextView, QueryDesc queryDesc, List list, String str, AwS95S1200000_10 awS95S1200000_10, QueryDesc queryDesc2, TuxTextView tuxTextView2, String str2, C678910Qk5 c678910Qk5, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.LL = tuxTextView;
        this.LLILLJJLI = queryDesc;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = awS95S1200000_10;
        this.LLILZLL = queryDesc2;
        this.LLIZ = tuxTextView2;
        this.LLIZLLLIL = str2;
        this.LLJ = c678910Qk5;
        this.LLJI = queryCorrectComponentInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean zLIZLLL = C678990QkD.LIZLLL(this.LL);
        C678990QkD.LIZ(this.LL, zLIZLLL, this.LLILLJJLI.text, AbstractC19875512pd.copyOf((Collection) this.LLILLL), this.LLILZ, this.LLILLJJLI.clickable, !this.LLILLL.isEmpty(), 43, this.LLILZIL);
        QueryDesc queryDesc = this.LLILZLL;
        if (queryDesc != null) {
            TuxTextView tuxTextView = this.LLIZ;
            List<Position> list = this.LLILLL;
            String str = this.LLIZLLLIL;
            C678990QkD.LIZ(tuxTextView, zLIZLLL, queryDesc.text, AbstractC19875512pd.copyOf((Collection) list), str, queryDesc.clickable, false, 0, new AwS95S1200000_10(this.LLJ, this.LLJI, str, 3));
        }
        return Unit.LIZ;
    }
}
