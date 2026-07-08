package X;

import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;

/* JADX INFO: renamed from: X.0OBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel", f = "FeatureVideoViewModel.kt", l = {81}, m = "getVideoUploadStatus")
public final class C615340OBo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FeatureVideoViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615340OBo(FeatureVideoViewModel featureVideoViewModel, InterfaceC1364105Vn<? super C615340OBo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = featureVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeatureVideoViewModel@8372.getVideoUploadStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, this);
        C1C7U.LIZIZ("FeatureVideoViewModel@8372.getVideoUploadStatus$1");
        return objWQ2;
    }
}
