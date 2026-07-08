package X;

import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;

/* JADX INFO: renamed from: X.0OBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel", f = "FeatureVideoViewModel.kt", l = {70}, m = "fetchFeatureVideoAwemeList")
public final class C615350OBp extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FeatureVideoViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615350OBp(FeatureVideoViewModel featureVideoViewModel, InterfaceC1364105Vn<? super C615350OBp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = featureVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeatureVideoViewModel@8372.fetchFeatureVideoAwemeList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("FeatureVideoViewModel@8372.fetchFeatureVideoAwemeList$1");
        return objVQ2;
    }
}
