package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
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
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.13P5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13P5 implements InterfaceC1635390sev {
    public static final ExceptionResult LLILLL;
    public boolean LL;
    public EffectManager LLILLJJLI;

    @Override // X.InterfaceC1635390sev
    public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJII(Effect effect) {
    }

    @Override // X.InterfaceC1635390sev
    public final boolean LJIIIIZZ(Effect effect) {
        return false;
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJ(Effect effect) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIFFI(String str, int i, int i2, int i3, String str2, Map map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z) {
    }

    @Override // X.InterfaceC1635390sev
    public final EffectConfiguration LJJIIZ() {
        return null;
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJ(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633130sbH c1633130sbH) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIL(String str, Map map, IFetchEffectChannelListener iFetchEffectChannelListener) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJLIJ(String str) {
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJIL(long j, C13MA<GetCustomizedEffectIDData> c13ma) {
    }

    @Override // X.InterfaceC1635390sev
    public final void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
    }

    static {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        LLILLL = exceptionResult;
        new C1662010tLr(new RuntimeException());
    }

    public final EffectManager LJJJJIZL() {
        EffectManager effectManager = this.LLILLJJLI;
        if (effectManager != null) {
            return effectManager;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1635390sev
    public final void destroy() {
        EffectManager effectManager = this.LLILLJJLI;
        if (effectManager != null) {
            effectManager.destroy();
        }
        this.LLILLJJLI = null;
        this.LL = false;
    }

    @Override // X.InterfaceC1635390sev
    public final void ng() {
        if (this.LL) {
            LJJJJIZL().removeListener();
        }
    }

    @Override // X.InterfaceC1635390sev
    public final EffectManager LLJILJILJ() {
        return this.LLILLJJLI;
    }

    public C13P5(EffectManager effectManager) {
        boolean z;
        if (effectManager != null) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
        this.LLILLJJLI = effectManager;
    }

    @Override // X.InterfaceC1635390sev
    public final void LIZLLL(String str) {
        if (!this.LL) {
            return;
        }
        LJJJJIZL().clearCache(str);
    }

    @Override // X.InterfaceC1635390sev
    public final boolean LJIJJLI(Effect effect) {
        boolean zIsEffectDownloaded;
        if (this.LL) {
            if (DownloadableModelSupport.isInitialized()) {
                zIsEffectDownloaded = DownloadableModelSupport.getInstance().isEffectReady(LJJJJIZL(), effect);
            } else {
                zIsEffectDownloaded = LJJJJIZL().isEffectDownloaded(effect);
            }
            if (zIsEffectDownloaded) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (!this.LL) {
            ((C1634160scw) iDownloadProviderEffectListener).onFail(providerEffect, LLILLL);
        } else {
            LJJJJIZL().downloadProviderEffect(providerEffect, iDownloadProviderEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener) {
        if (!this.LL) {
            iFetchEffectListener.onFail(effect, LLILLL);
        } else {
            LJJJJIZL().fetchEffect(effect, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIL(final C1634110scr c1634110scr, final InfoStickerEffect infoStickerEffect) {
        if (!this.LL) {
            c1634110scr.onFail(infoStickerEffect, new C1662010tLr(-1));
            return;
        }
        C20000613Nk c20000613NkLJIILLIIL = LJJJJIZL().getEffectPlatform().LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        Integer source = infoStickerEffect.getSource();
        if (source != null) {
            if (source.intValue() == 1) {
                c20000613NkLJIILLIIL.LIZLLL(infoStickerEffect.getLoki_effect(), false, false, false, false, new C13NY() { // from class: X.13P8
                    @Override // X.C13NY
                    public final void onStart(Effect effect) {
                    }

                    @Override // X.C13MA
                    public final void onSuccess(Effect effect) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onSuccess(infoStickerEffect);
                        }
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
                    }

                    @Override // X.C13MA
                    public final void onFail(Effect effect, C1662010tLr c1662010tLr) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onFail(infoStickerEffect, c1662010tLr);
                        }
                    }

                    @Override // X.C13NY
                    public final void onProgress(Effect effect, int i, long j) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onProgress(i);
                        }
                    }
                }, false);
                return;
            }
            if (source.intValue() == 2) {
                ProviderEffect sticker = infoStickerEffect.getSticker();
                InterfaceC1634240sd4 interfaceC1634240sd4 = new InterfaceC1634240sd4() { // from class: X.13P9
                    @Override // X.C13MA
                    public final void onSuccess(ProviderEffect providerEffect) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onSuccess(infoStickerEffect);
                        }
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void preProcess(ProviderEffect providerEffect) {
                    }

                    @Override // X.C13MA
                    public final void onFail(ProviderEffect providerEffect, C1662010tLr c1662010tLr) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onFail(infoStickerEffect, c1662010tLr);
                        }
                    }

                    @Override // X.InterfaceC1634240sd4
                    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
                        InterfaceC1634140scu interfaceC1634140scu = c1634110scr;
                        if (interfaceC1634140scu != null) {
                            interfaceC1634140scu.onProgress(i);
                        }
                    }
                };
                String strLIZ = C1528550psb.LIZ();
                c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZIZ(strLIZ, interfaceC1634240sd4);
                C13PN c13pn = new C13PN(c20000613NkLJIILLIIL.LIZ, sticker, strLIZ);
                C20001113Np c20001113Np = c20000613NkLJIILLIIL.LIZ.LJJIIJ;
                if (c20001113Np == null) {
                    return;
                }
                c20001113Np.LIZIZ(c13pn);
                return;
            }
        }
        c1634110scr.onFail(infoStickerEffect, new C1662010tLr(new IllegalArgumentException("sticker source illegal")));
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIII(String str, C1638390sjl c1638390sjl) {
        if (!this.LL) {
            c1638390sjl.onFail(LLILLL);
        } else {
            LJJJJIZL().fetchEffectList(str, false, (IFetchEffectChannelListener) c1638390sjl);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        LJI(str, false, iFetchEffectChannelListener);
    }

    @Override // X.InterfaceC1635390sev
    public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (!this.LL) {
            iFetchEffectListByIdsListener.onFail(LLILLL);
        } else {
            LJJJJIZL().fetchEffectList2(list, map, iFetchEffectListByIdsListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJI(final String str, final boolean z, final IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!this.LL) {
            iFetchEffectChannelListener.onFail(LLILLL);
        } else {
            LJJIJL(str, null, 0, null, new ICheckChannelListener() { // from class: X.13PB
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    final C13P5 c13p5 = this.LIZ;
                    final String str2 = str;
                    final boolean z2 = z;
                    final IFetchEffectChannelListener iFetchEffectChannelListener2 = iFetchEffectChannelListener;
                    c13p5.LJJJJI(str2, true, z2, new IFetchEffectChannelListener() { // from class: X.13PC
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult2) {
                            c13p5.LJJJJI(str2, false, z2, iFetchEffectChannelListener2);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            List<Effect> allCategoryEffects;
                            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                            if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null && allCategoryEffects.isEmpty()) {
                                c13p5.LJJJJI(str2, false, z2, iFetchEffectChannelListener2);
                            } else {
                                iFetchEffectChannelListener2.onSuccess(effectChannelResponse2);
                            }
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z2) {
                    if (z2) {
                        this.LIZ.LJJJJI(str, false, z, iFetchEffectChannelListener);
                        return;
                    }
                    final C13P5 c13p5 = this.LIZ;
                    final String str2 = str;
                    final boolean z3 = z;
                    final IFetchEffectChannelListener iFetchEffectChannelListener2 = iFetchEffectChannelListener;
                    c13p5.LJJJJI(str2, true, z3, new IFetchEffectChannelListener() { // from class: X.13PD
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            c13p5.LJJJJI(str2, false, z3, iFetchEffectChannelListener2);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            List<Effect> allCategoryEffects;
                            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                            if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null && allCategoryEffects.isEmpty()) {
                                c13p5.LJJJJI(str2, false, z3, iFetchEffectChannelListener2);
                            } else {
                                iFetchEffectChannelListener2.onSuccess(effectChannelResponse2);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIJ(List list, Map map, C396901gV c396901gV) {
        LJJIJIIJI(list, true, map, c396901gV);
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIIZILJ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        if (!this.LL) {
            iFetchEffectListener.onFail(null, LLILLL);
        } else {
            LJJJJIZL().fetchEffectWithDownload(str, map, iFetchEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void lg(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        if (str != null && str2 != null) {
            if (!this.LL) {
                iUpdateTagListener.onFinally();
            } else {
                LJJJJIZL().updateTag(str, str2, iUpdateTagListener);
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
        if (!this.LL) {
            iFetchEffectListListener.onFail(LLILLL);
        } else {
            LJJJJIZL().fetchEffectList((List<String>) list, z, (Map<String, String>) map, iFetchEffectListListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIIJI(List list, final boolean z, Map map, final IFetchEffectListListener iFetchEffectListListener) {
        if (!this.LL) {
            iFetchEffectListListener.onFail(LLILLL);
        } else {
            LJJJJIZL().fetchEffectList((List<String>) list, (Map<String, String>) map, new IFetchEffectListByIdsListener() { // from class: X.13P6
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                    if (iFetchEffectListListener2 != null) {
                        iFetchEffectListListener2.onFail(exceptionResult);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    EffectListResponse effectListResponse2 = effectListResponse;
                    List<Effect> data = null;
                    if (z) {
                        EffectManager effectManagerLJJJJIZL = this.LJJJJIZL();
                        if (effectListResponse2 != null) {
                            data = effectListResponse2.getData();
                        }
                        effectManagerLJJJJIZL.downloadEffectList(data, iFetchEffectListListener);
                        return;
                    }
                    IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                    if (iFetchEffectListListener2 == null) {
                        return;
                    }
                    if (effectListResponse2 != null) {
                        data = effectListResponse2.getData();
                    }
                    iFetchEffectListListener2.onSuccess(data);
                }
            });
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJJI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!this.LL) {
            iFetchEffectChannelListener.onFail(LLILLL);
        } else if (z) {
            LJJJJIZL().fetchEffectListFromCache(str, iFetchEffectChannelListener);
        } else {
            LJJJJIZL().fetchEffectList(str, z2, iFetchEffectChannelListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (str != null && !C580130Mp9.LIZ(list)) {
            if (!this.LL) {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            } else {
                LJJJJIZL().isTagUpdated(str, str2, iIsTagNeedUpdatedListener);
            }
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void qg(IModFavoriteList iModFavoriteList, String str, List list, boolean z) {
        if (!this.LL) {
            ((C1631880sZG) iModFavoriteList).onFail(LLILLL);
        } else {
            LJJJJIZL().modifyFavoriteList(str, (List<String>) list, Boolean.valueOf(z), iModFavoriteList);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJII(String str, EnumC1285060jXs enumC1285060jXs, boolean z, int i, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!this.LL) {
            iFetchEffectChannelListener.onFail(LLILLL);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIIJZLJL(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, boolean z, String str, int i) {
        if (!this.LL) {
            C1662010tLr c1662010tLr = new C1662010tLr(-1);
            c1662010tLr.LIZIZ = "effect sdk manager init failed";
            c13ma.onFail(null, c1662010tLr);
        } else if (z) {
            LJJJJIZL().fetchHorizontalEffectsInfoFromCache(map, c13ma, str, i);
        } else {
            LJJJJIZL().fetchHorizontalEffectsInfo(map, c13ma, "default", str, i, null);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJL(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener) {
        if (!this.LL) {
            iCheckChannelListener.checkChannelFailed(LLILLL);
            return;
        }
        InterfaceC1635390sev.LJJLIIIIJ.getClass();
        if (i == 2) {
            LJJJJIZL().checkPanelIsUpdate(str, map, iCheckChannelListener);
        } else if (i == 1) {
            LJJJJIZL().checkCategoryIsUpdate(str, str2, map, iCheckChannelListener);
        } else {
            LJJJJIZL().checkedEffectListUpdate(str, map, iCheckChannelListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIIZI(String str, String str2, int i, int i2, int i3, String str3, C1631900sZI c1631900sZI) {
        if (!this.LL) {
            c1631900sZI.onFail(LLILLL);
        } else {
            LJJJJIZL().fetchCategoryPagingEffect(str, str2, i, i2, i3, str3, null, c1631900sZI);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect) {
        if (!this.LL) {
            ((C1635280sek) iFetchProviderEffect).onFail(LLILLL);
        } else {
            LJJJJIZL().fetchProviderEffect(str, false, i, i2, str2, null, map, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633120sbG c1633120sbG) {
        if (!this.LL) {
            c1633120sbG.onFail(LLILLL);
        } else {
            LJJJJIZL().searchEffects(str2, str3, i, i2, map, i3, c1633120sbG);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIJIIJIL(String str, String str2, int i, int i2, boolean z, String str3, String str4, IFetchProviderEffect iFetchProviderEffect) {
        if (!this.LL) {
            ((C1635290sel) iFetchProviderEffect).onFail(LLILLL);
        } else {
            LJJJJIZL().searchProviderEffect(str, str2, i, i2, z, str3, null, iFetchProviderEffect);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJJ(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, boolean z) {
        if (!this.LL) {
            iFetchCategoryEffectListener.onFail(LLILLL);
        } else if (z) {
            LJJJJIZL().fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, iFetchCategoryEffectListener);
        } else {
            LJJJJIZL().fetchCategoryEffect(str, str2, i, i2, i3, str3, iFetchCategoryEffectListener);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJIZ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, int i3, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map) {
        if (!this.LL) {
            iFetchPanelInfoListener.onFail(LLILLL);
        } else if (z2) {
            LJJJJIZL().fetchPanelInfoFromCache(str, z, str2, i, i2, 0, iFetchPanelInfoListener);
        } else {
            LJJJJIZL().fetchPanelInfo(str, z, str2, i, i2, iFetchPanelInfoListener, map);
        }
    }

    @Override // X.InterfaceC1635390sev
    public final void LJJJ(int i, int i2, int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, Map map, boolean z) {
        if (!this.LL) {
            iFetchCategoryEffectListener.onFail(LLILLL);
        } else if (z) {
            LJJJJIZL().fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, i4, iFetchCategoryEffectListener);
        } else {
            LJJJJIZL().fetchCategoryEffect(str, str2, i, i2, i3, str3, i4, map, iFetchCategoryEffectListener);
        }
    }
}
