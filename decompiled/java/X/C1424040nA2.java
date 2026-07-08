package X;

import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCondition;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424040nA2<T> implements InterfaceC300801Eo {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1424090nA7 LLILLJJLI;

    public C1424040nA2(C1424090nA7 c1424090nA7, String str) {
        this.LL = str;
        this.LLILLJJLI = c1424090nA7;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<PhotoTemplateAsset> interfaceC2329309At) {
        String str;
        Long lLJIILIIL = null;
        if (C296620Bjw.LIZ()) {
            str = null;
        } else {
            str = this.LL;
        }
        if (C296620Bjw.LIZ()) {
            lLJIILIIL = C2095008Iq.LJIILIIL(this.LL);
        }
        List listSingletonList = Collections.singletonList(new AssetCondition(str, lLJIILIIL, "photomode_template", Integer.valueOf(AssetType.PHOTO_EFFECT.getValue()), null, null));
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo = new MixedItemAssetsRequestBodyInfo(listSingletonList, null, C1697810uHb.LJIIJJI(0, 1), null, null, "", null, null, null, "", null);
        InterfaceC1635410sex interfaceC1635410sex = this.LLILLJJLI.LIZIZ;
        C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
        TemplateScene templateScene = TemplateScene.PHOTO_TEMPLATE;
        c1429050nI7.getClass();
        Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        interfaceC1635410sex.LJJIL(new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", null, "photomode_template", null, false, null, null, false), mixedItemAssetsRequestBodyInfo, new IFetchAssetItemInfo() { // from class: X.0nA1
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
            public final void onFailed(ExceptionResult exceptionResult) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("downloadPhotoEffectAssetById onFail ");
                sbLIZ.append(exceptionResult);
                C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
                if (exceptionResult != null) {
                    c11kt.onError(exceptionResult.getException());
                } else {
                    c11kt.onError(new RuntimeException("downloadPhotoEffectAssetById onFail"));
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(AssetItemResponse assetItemResponse) {
                AssetItemModel data;
                List<Asset> list;
                Asset asset;
                AssetItemResponse assetItemResponse2 = assetItemResponse;
                if (assetItemResponse2 != null && (data = assetItemResponse2.getData()) != null && (list = data.asset_list) != null && (asset = (Asset) C13LP.LJJJLL(list)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadPhotoEffectAssetById ");
                    sbLIZ.append(asset);
                    C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
                    c11kt.onSuccess(C1413020msG.LIZLLL(asset));
                    return;
                }
                c11kt.onError(new RuntimeException("downloadPhotoEffectAssetById null asset"));
            }
        });
    }
}
