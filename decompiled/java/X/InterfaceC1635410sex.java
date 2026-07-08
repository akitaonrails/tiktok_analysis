package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
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
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1635410sex extends InterfaceC1635390sev {
    void Ag(String str, String str2, ICheckChannelListener iCheckChannelListener);

    void Bg(String str, C2225608nm c2225608nm);

    void Cg(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void Dg(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    Map<String, String> Eg();

    @Override // X.InterfaceC1635390sev
    void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    @Override // X.InterfaceC1635390sev
    void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    @Override // X.InterfaceC1635390sev
    void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener);

    @Override // X.InterfaceC1635390sev
    void LIZLLL(String str);

    @Override // X.InterfaceC1635390sev
    void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    @Override // X.InterfaceC1635390sev
    void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener);

    @Override // X.InterfaceC1635390sev
    void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    @Override // X.InterfaceC1635390sev
    boolean LJIIIIZZ(Effect effect);

    @Override // X.InterfaceC1635390sev
    void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2);

    @Override // X.InterfaceC1635390sev
    void LJIIJ(List list, Map map, C396901gV c396901gV);

    @Override // X.InterfaceC1635390sev
    void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    @Override // X.InterfaceC1635390sev
    EffectManager LLJILJILJ();

    @Override // X.InterfaceC1635390sev
    void destroy();

    void kg(LifecycleOwner lifecycleOwner);

    @Override // X.InterfaceC1635390sev
    void lg(String str, String str2, IUpdateTagListener iUpdateTagListener);

    @Override // X.InterfaceC1635390sev
    void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    @Override // X.InterfaceC1635390sev
    void ng();

    @Override // X.InterfaceC1635390sev
    void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener);

    @Override // X.InterfaceC1635390sev
    void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect);

    @Override // X.InterfaceC1635390sev
    void qg(IModFavoriteList iModFavoriteList, String str, List list, boolean z);

    void rg(C194380113a c194380113a);

    void sg(String str, String str2, int i, int i2, int i3, Map map, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    void tg(int i, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, boolean z);

    void ug(Map<String, Object> map);

    void vg(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    void wg(String str, String str2, int i, IFetchPanelInfoListener iFetchPanelInfoListener);

    void xg(String str, C1638600sk6 c1638600sk6);

    void yg(Map<String, String> map);

    boolean zg(String str, String str2);
}
