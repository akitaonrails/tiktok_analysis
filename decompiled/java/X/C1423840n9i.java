package X;

import com.ss.android.ugc.effectmanager.effect.model.FetchTemplateFavoriteListResponse;

/* JADX INFO: renamed from: X.0n9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423840n9i implements C13MA<FetchTemplateFavoriteListResponse.ResponseData> {
    public final /* synthetic */ InterfaceC20236714Gf<FetchTemplateFavoriteListResponse.ResponseData> LIZ;

    public C1423840n9i(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    @Override // X.C13MA
    public final void onSuccess(FetchTemplateFavoriteListResponse.ResponseData responseData) {
        InterfaceC20236714Gf<FetchTemplateFavoriteListResponse.ResponseData> interfaceC20236714Gf = this.LIZ;
        C189200o6.m2constructorimpl(responseData);
        interfaceC20236714Gf.resumeWith(responseData);
    }

    @Override // X.C13MA
    public final /* bridge */ /* synthetic */ void preProcess(FetchTemplateFavoriteListResponse.ResponseData responseData) {
    }

    @Override // X.C13MA
    public final void onFail(FetchTemplateFavoriteListResponse.ResponseData responseData, C1662010tLr c1662010tLr) {
        InterfaceC20236714Gf<FetchTemplateFavoriteListResponse.ResponseData> interfaceC20236714Gf = this.LIZ;
        C189200o6.m2constructorimpl(responseData);
        interfaceC20236714Gf.resumeWith(responseData);
    }
}
