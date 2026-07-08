package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373330lqF extends C09AY implements Function1<C1373350lqH, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373330lqF(boolean z, long j, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1373350lqH c1373350lqH) {
        C1373350lqH c1373350lqH2 = c1373350lqH;
        if (this.LL) {
            List listSingletonList = Collections.singletonList(Long.valueOf(this.LLILLJJLI));
            c1373350lqH2.getClass();
            c1373350lqH2.LIZIZ = new C1373370lqJ("poiBasicOptimization_poiPage_footer_saveCount", listSingletonList);
            c1373350lqH2.LIZJ = new C1373370lqJ(String.valueOf(this.LLILLJJLI), C13BV.INSTANCE);
        } else {
            List listSingletonList2 = Collections.singletonList(Long.valueOf(this.LLILLJJLI));
            c1373350lqH2.getClass();
            c1373350lqH2.LIZIZ = new C1373370lqJ("poiButtonOptimization_poiDetailPage_addFavorite_banner", listSingletonList2);
        }
        c1373350lqH2.LIZJ("poidmcard_you_shared", Collections.singletonList(this.LLILLL));
        c1373350lqH2.LIZIZ("poidmcard_shared_location", Collections.singletonList(this.LLILLL));
        c1373350lqH2.LIZ("poidmcard_location", Collections.singletonList(this.LLILLL));
        return Unit.LIZ;
    }
}
