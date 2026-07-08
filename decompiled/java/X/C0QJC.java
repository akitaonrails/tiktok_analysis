package X;

import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QJC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QJC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LL;
    public final /* synthetic */ SearchSugEntity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QJC(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, SearchSugEntity searchSugEntity, String str, int i, String str2) {
        super(0);
        this.LL = abstractSearchIntermediateFragmentNew;
        this.LLILLJJLI = searchSugEntity;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.oS(this.LLILZ, this.LLILLJJLI, this.LLILLL, this.LLILZIL);
        return Unit.LIZ;
    }
}
