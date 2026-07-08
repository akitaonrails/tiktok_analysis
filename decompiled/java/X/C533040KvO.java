package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCondition;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.AssetHandler$assetInfoFlow$2", f = "AssetHandler.kt", l = {227}, m = "invokeSuspend")
public final class C533040KvO extends C09AX implements Function2<C094D<? super Asset>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C533030KvN LLILLL;
    public final /* synthetic */ EffectManager LLILZ;
    public final /* synthetic */ C532980KvI LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533040KvO(C533030KvN c533030KvN, EffectManager effectManager, C532980KvI c532980KvI, String str, InterfaceC1364105Vn<? super C533040KvO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c533030KvN;
        this.LLILZ = effectManager;
        this.LLILZIL = c532980KvI;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533040KvO c533040KvO = new C533040KvO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c533040KvO.LLILLJJLI = obj;
        return c533040KvO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AssetHandler@472b.assetInfoFlow$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            String str = this.LLILLL.LIZLLL;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = null;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLL.LIZ);
            String str2 = this.LLILLL.LIZJ;
            if (str2.length() == 0) {
                str2 = null;
            }
            MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo = new MixedItemAssetsRequestBodyInfo(Collections.singletonList(new AssetCondition(str, lLJIILIIL, str2, C2095008Iq.LJIIJJI(this.LLILLL.LIZIZ), null, null)), null, null, null, null, "", null, null, null, "item", "base_resource");
            MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(new Pair("", ""), "", null, null, null, false, null, null, true);
            EffectManager effectManager = this.LLILZ;
            final C532980KvI c532980KvI = this.LLILZIL;
            final String str3 = this.LLILZLL;
            effectManager.fetchAssetItemInf(mixedAssetsQueryAdditionalParameters, "editing", mixedItemAssetsRequestBodyInfo, new IFetchAssetItemInfo() { // from class: X.0KvP
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    String msg;
                    C094D<Asset> c094d2 = c094d;
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "fetchAssetItemInf failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(msg));
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(AssetItemResponse assetItemResponse) {
                    int status_code;
                    AssetItemModel data;
                    List<Asset> list;
                    Object objLJJJLL;
                    String message;
                    AssetItemResponse assetItemResponse2 = assetItemResponse;
                    if (assetItemResponse2 != null) {
                        status_code = assetItemResponse2.getStatus_code();
                    } else {
                        status_code = -1;
                    }
                    String logId = null;
                    if (status_code != 0) {
                        C094D<Asset> c094d2 = c094d;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchAssetItemInf status=");
                        sbLIZ.append(status_code);
                        sbLIZ.append(" msg=");
                        if (assetItemResponse2 != null) {
                            message = assetItemResponse2.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        sbLIZ.append(" logId=");
                        if (assetItemResponse2 != null) {
                            logId = assetItemResponse2.getLogId();
                        }
                        sbLIZ.append(logId);
                        c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                        return;
                    }
                    if (assetItemResponse2 != null && (data = assetItemResponse2.getData()) != null && (list = data.asset_list) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                        c532980KvI.LIZLLL.put(str3, (Asset) objLJJJLL);
                        c094d.LJIIIIZZ((Asset) objLJJJLL);
                        c094d.LJIIJJI(null);
                        return;
                    }
                    C094D<Asset> c094d3 = c094d;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("asset_list empty logId=");
                    if (assetItemResponse2 != null) {
                        logId = assetItemResponse2.getLogId();
                    }
                    sbLIZ2.append(logId);
                    c094d3.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(421);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AssetHandler@472b.assetInfoFlow$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AssetHandler@472b.assetInfoFlow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Asset> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
