package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;

/* JADX INFO: renamed from: X.0sf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635500sf6 implements IFetchAssetCategoryInfo {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ InterfaceC20236714Gf<AssetCategoryResponse> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo
    public final void onFailed(ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        C1403705eV c1403705eV = C1403705eV.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
            msg = exceptionResult.getMsg();
        } else {
            numValueOf = null;
            msg = null;
        }
        c1403705eV.getClass();
        C1403705eV.LIZ(jCurrentTimeMillis, msg, 1, "carousel", numValueOf);
        C1635490sf5 c1635490sf5 = C1635490sf5.LIZ;
        InterfaceC20236714Gf<AssetCategoryResponse> interfaceC20236714Gf = this.LIZIZ;
        c1635490sf5.getClass();
        C1635490sf5.LIZJ(null, interfaceC20236714Gf);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(AssetCategoryResponse assetCategoryResponse) {
        C1403705eV c1403705eV = C1403705eV.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        c1403705eV.getClass();
        C1403705eV.LIZ(jCurrentTimeMillis, null, 0, "carousel", null);
        C1635490sf5 c1635490sf5 = C1635490sf5.LIZ;
        InterfaceC20236714Gf<AssetCategoryResponse> interfaceC20236714Gf = this.LIZIZ;
        c1635490sf5.getClass();
        C1635490sf5.LIZJ(assetCategoryResponse, interfaceC20236714Gf);
    }

    public C1635500sf6(long j, C2252611DEt c2252611DEt) {
        this.LIZ = j;
        this.LIZIZ = c2252611DEt;
    }
}
