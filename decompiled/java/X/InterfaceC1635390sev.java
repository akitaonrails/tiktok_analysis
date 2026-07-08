package X;

import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1635390sev {
    public static final C1634940seC LJJLIIIIJ = C1634940seC.LIZ;

    void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener);

    void LIZLLL(String str);

    void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener);

    void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJII(Effect effect);

    boolean LJIIIIZZ(Effect effect);

    void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2);

    void LJIIJ(List list, Map map, C396901gV c396901gV);

    void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener);

    void LJIILIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, boolean z, IFetchAssetPanelInfo iFetchAssetPanelInfo);

    void LJIILJJIL(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633120sbG c1633120sbG);

    void LJIILL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetCategoryInfo iFetchAssetCategoryInfo);

    void LJIILLIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, C1635500sf6 c1635500sf6);

    void LJIIZILJ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    void LJIJ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, int i2, C1423840n9i c1423840n9i);

    void LJIJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    AssetPanelResponse LJIJJ(String str, String str2, int i);

    boolean LJIJJLI(Effect effect);

    void LJIL(C1634110scr c1634110scr, InfoStickerEffect infoStickerEffect);

    void LJJ(Effect effect);

    void LJJI(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetPanelInfo iFetchAssetPanelInfo);

    void LJJIFFI(String str, int i, int i2, int i3, String str2, Map map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z);

    void LJJII(String str, EnumC1285060jXs enumC1285060jXs, boolean z, int i, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJJIII(String str, C1638390sjl c1638390sjl);

    AssetCategoryResponse LJJIIJ(String str, String str2, int i, int i2);

    void LJJIIJZLJL(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, boolean z, String str, int i);

    EffectConfiguration LJJIIZ();

    void LJJIIZI(String str, String str2, int i, int i2, int i3, String str3, C1631900sZI c1631900sZI);

    void LJJIJ(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633130sbH c1633130sbH);

    void LJJIJIIJI(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener);

    void LJJIJIIJIL(String str, String str2, int i, int i2, boolean z, String str3, String str4, IFetchProviderEffect iFetchProviderEffect);

    void LJJIJIL(String str, Map map, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJJIJL(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener);

    void LJJIJLIJ(String str);

    void LJJIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo, IFetchAssetItemInfo iFetchAssetItemInfo);

    void LJJIZ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, int i3, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map);

    void LJJJ(int i, int i2, int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, Map map, boolean z);

    void LJJJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    void LJJJIL(long j, C13MA<GetCustomizedEffectIDData> c13ma);

    void LJJJJ(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, boolean z);

    void LJJJJI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener);

    EffectManager LLJILJILJ();

    void destroy();

    void lg(String str, String str2, IUpdateTagListener iUpdateTagListener);

    void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    void ng();

    void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener);

    void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect);

    void qg(IModFavoriteList iModFavoriteList, String str, List list, boolean z);
}
