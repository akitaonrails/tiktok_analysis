package X;

import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM", f = "PoiAiSummaryListSharedVM.kt", l = {196}, m = "fetchVideoList")
public final class C325830Cpx extends AbstractC23140094w {
    public Function1 LL;
    public Function0 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiAiSummaryListSharedVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325830Cpx(PoiAiSummaryListSharedVM poiAiSummaryListSharedVM, InterfaceC1364105Vn<? super C325830Cpx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiAiSummaryListSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAiSummaryListSharedVM@694f.fetchVideoList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILZ.BQ2(null, null, null, this);
        C1C7U.LIZIZ("PoiAiSummaryListSharedVM@694f.fetchVideoList$1");
        return objBQ2;
    }
}
