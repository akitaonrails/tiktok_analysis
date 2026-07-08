package X;

import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704410uSF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PerformanceUserCardViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<C1261860iwS> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704410uSF(PerformanceUserCardViewModel performanceUserCardViewModel, int i, int i2, List<C1261860iwS> list) {
        super(0);
        this.LL = performanceUserCardViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.wQ2(this.LLILLJJLI, this.LLILLL - 1, this.LLILZ);
        return Unit.LIZ;
    }
}
