package X;

import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158790gGD extends C09AY implements Function1<C1158800gGE, C1158800gGE> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158790gGD(long j, boolean z) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1158800gGE invoke(C1158800gGE c1158800gGE) {
        C291001Au<PaidSeriesLiveListResponse> c291001Au;
        C1158800gGE c1158800gGE2 = c1158800gGE;
        C1623606Xi c1623606Xi = new C1623606Xi(Long.valueOf(this.LL));
        if (this.LLILLJJLI) {
            c291001Au = new C291001Au<>(new PaidSeriesLiveListResponse(null, null, null, 7, null));
        } else {
            c291001Au = c1158800gGE2.LLILLJJLI;
        }
        return C1158800gGE.LIZ(c1158800gGE2, null, c291001Au, null, c1623606Xi, null, null, null, 117);
    }
}
