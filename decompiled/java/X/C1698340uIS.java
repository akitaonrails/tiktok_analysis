package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.HorizontalCarouselCacheEnable;
import com.ss.android.ugc.aweme.sticker.repository.internals.HorizontalEffectsFetcher;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import suk.g;

/* JADX INFO: renamed from: X.0uIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698340uIS implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<EffectListResponse> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
            case 5:
                subscribe$5(this, c09aj);
                break;
            case 6:
                subscribe$6(this, c09aj);
                break;
            case 7:
                subscribe$7(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("RecentlyListFetcher@c956.requestActual$1");
        EffectManager effectManagerLLJILJILJ = ((C1631840sZC) c1698340uIS.l0).LIZIZ.LLJILJILJ();
        if (effectManagerLLJILJILJ != null) {
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            effectManagerLLJILJILJ.fetchRecentUsedEffect(((C1631840sZC) c1698340uIS.l0).LIZ, ((C1628990sUb) c1698340uIS.l1).LIZ, new IFetchFavoriteList() { // from class: X.0sZF
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                public final void onFailed(ExceptionResult exceptionResult) {
                    Exception exception;
                    if (!c19482611Ke.isDisposed() && exceptionResult != null && (exception = exceptionResult.getException()) != null) {
                        c19482611Ke.onError(exception);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                    FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
                    if (!c19482611Ke.isDisposed()) {
                        if (fetchFavoriteListResponse2 != null) {
                            C09AJ<EffectListResponse> c09aj2 = c19482611Ke;
                            c09aj2.onNext(new EffectListResponse(new ArrayList(), new ArrayList(), new ArrayList(), 0, null, fetchFavoriteListResponse2.getEffect_list()));
                            c09aj2.onComplete();
                            return;
                        }
                        c19482611Ke.onError(new IllegalStateException("queryUserSticker failed"));
                    }
                }
            });
        }
        C1C7U.LIZIZ("RecentlyListFetcher@c956.requestActual$1");
    }

    public static final void subscribe$1(C1698340uIS c1698340uIS, C09AJ c09aj) {
        ArrayList arrayList;
        C1C7U.LIZ("HorizontalEffectsFetcher@191b.requestActual$1");
        Pair[] pairArr = new Pair[5];
        List<String> list = ((HorizontalEffectsFetcherRequest) c1698340uIS.l0).insertEffectIds;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('\"');
                sbLIZ.append(str);
                sbLIZ.append('\"');
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            arrayList = null;
        }
        boolean z = false;
        pairArr[0] = new Pair("insert_effect_ids", String.valueOf(arrayList));
        pairArr[1] = new Pair("trending", String.valueOf(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).trending));
        pairArr[2] = new Pair("favorite", String.valueOf(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).favorite));
        pairArr[3] = new Pair("recent", String.valueOf(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).recent));
        pairArr[4] = new Pair("recent_effects_limit", String.valueOf(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).recentEffectsLimit));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> map = ((HorizontalEffectsFetcherRequest) c1698340uIS.l0).params;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        String str2 = ((HorizontalEffectsFetcherRequest) c1698340uIS.l0).favoriteType;
        if (str2 != null) {
            mapLJIIJ.put("favorite_type", str2);
        }
        String str3 = ((HorizontalEffectsFetcherRequest) c1698340uIS.l0).recentType;
        if (str3 != null) {
            mapLJIIJ.put("recent_type", str3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsEnabled = HorizontalCarouselCacheEnable.isEnabled();
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestActual: start scene = ");
        sbLIZ2.append(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).whitelistScene);
        sbLIZ2.append(", cacheEnable = ");
        sbLIZ2.append(zIsEnabled);
        sbLIZ2.append(", fetchMode = ");
        sbLIZ2.append(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).fetchMode);
        sbLIZ2.append(", requestParam = ");
        sbLIZ2.append(mapLJIIJ);
        sbLIZ2.append(", ");
        C201955140j.LJIILL(c1632470saD, "effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ2));
        ArrayList arrayList2 = new ArrayList();
        C13MA<HorizontalEffectsModel> c13maCreateListener$default = HorizontalEffectsFetcher.createListener$default((HorizontalEffectsFetcher) c1698340uIS.l1, c09aj, jCurrentTimeMillis, arrayList2, false, null, 24, null);
        String insertString = ((HorizontalEffectsFetcher) c1698340uIS.l1).getInsertString(((HorizontalEffectsFetcherRequest) c1698340uIS.l0).insertEffectIds);
        int i = C1154230g8r.LIZ[((HorizontalEffectsFetcherRequest) c1698340uIS.l0).fetchMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (zIsEnabled) {
                        int i2 = ((HorizontalEffectsFetcherRequest) c1698340uIS.l0).whitelistScene;
                        if (i2 == 1) {
                            z = true;
                        }
                        HorizontalEffectsFetcher horizontalEffectsFetcher = (HorizontalEffectsFetcher) c1698340uIS.l1;
                        if (horizontalEffectsFetcher.isWithinTTL(horizontalEffectsFetcher.getKey(i2, insertString)) && !z) {
                            ((HorizontalEffectsFetcher) c1698340uIS.l1).useCacheFallbackToNetwork(c09aj, jCurrentTimeMillis, arrayList2, mapLJIIJ, c13maCreateListener$default, insertString, (HorizontalEffectsFetcherRequest) c1698340uIS.l0);
                        } else {
                            ((HorizontalEffectsFetcher) c1698340uIS.l1).useBothCacheAndNetwork(c09aj, jCurrentTimeMillis, arrayList2, mapLJIIJ, insertString, (HorizontalEffectsFetcherRequest) c1698340uIS.l0, c13maCreateListener$default);
                        }
                    } else {
                        ((HorizontalEffectsFetcher) c1698340uIS.l1).useNetworkFallbackToCache(c09aj, jCurrentTimeMillis, arrayList2, mapLJIIJ, c13maCreateListener$default, insertString, (HorizontalEffectsFetcherRequest) c1698340uIS.l0);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((HorizontalEffectsFetcher) c1698340uIS.l1).useNetworkOnly(mapLJIIJ, c13maCreateListener$default, insertString, (HorizontalEffectsFetcherRequest) c1698340uIS.l0);
            }
        } else {
            ((HorizontalEffectsFetcher) c1698340uIS.l1).useCacheOnly(mapLJIIJ, c13maCreateListener$default, insertString, (HorizontalEffectsFetcherRequest) c1698340uIS.l0);
        }
        C1C7U.LIZIZ("HorizontalEffectsFetcher@191b.requestActual$1");
    }

    public static final void subscribe$2(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("DefaultInfoStickerRepository@ba59.download$1");
        if (((C1633870scT) c1698340uIS.l0).LJI.LIZ((Effect) c1698340uIS.l1) || C1635160seY.LIZIZ((Effect) c1698340uIS.l1) || C1462570oAB.LJFF((Effect) c1698340uIS.l1) || C1462570oAB.LJIILL((Effect) c1698340uIS.l1)) {
            c09aj.onNext(new C1633900scW((Effect) c1698340uIS.l1, new C1633050sb9(EnumC1641480sok.INFO_STICKER_STATE_DOWNLOAD_SUCCESS), null, null, 12));
        }
        c09aj.onComplete();
        C1C7U.LIZIZ("DefaultInfoStickerRepository@ba59.download$1");
    }

    public static final void subscribe$3(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("CategoricalStickerFetcher@e7d6.requestActual$2");
        C1628840sUM c1628840sUM = (C1628840sUM) c1698340uIS.l0;
        InterfaceC1635390sev interfaceC1635390sev = c1628840sUM.LIZIZ;
        String str = c1628840sUM.LIZ;
        C1631810sZ9 c1631810sZ9 = (C1631810sZ9) c1698340uIS.l1;
        String str2 = c1631810sZ9.LIZ;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        C1635120seU.LIZLLL(c1631810sZ9.LIZIZ, c1631810sZ9.LIZJ, c1631810sZ9.LIZLLL, c1631810sZ9.LJIIIIZZ, new IFetchCategoryEffectListener() { // from class: X.0sZH
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                if (c19482611Ke.isDisposed()) {
                    return;
                }
                c19482611Ke.onError(exceptionResult.getException());
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (!c19482611Ke.isDisposed() && categoryPageModel2.getCategoryEffects() != null) {
                    C09AJ<CategoryPageModel> c09aj2 = c19482611Ke;
                    c09aj2.onNext(categoryPageModel2);
                    c09aj2.onComplete();
                }
            }
        }, interfaceC1635390sev, str, str2, c1631810sZ9.LJ, c1631810sZ9.LJIIIZ);
        C1C7U.LIZIZ("CategoricalStickerFetcher@e7d6.requestActual$2");
    }

    public static final void subscribe$4(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("DefaultPanelInfoFetcher@cbd7.requestActual$1");
        final g gVar = (g) c1698340uIS.l0;
        InterfaceC1635390sev interfaceC1635390sev = gVar.LIZIZ;
        String str = gVar.LIZ;
        final C1633080sbC c1633080sbC = (C1633080sbC) c1698340uIS.l1;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        C1635120seU.LJFF(interfaceC1635390sev, str, c1633080sbC.LJFF, c1633080sbC.LIZ, c1633080sbC.LIZIZ, c1633080sbC.LIZJ, c1633080sbC.LIZLLL, c1633080sbC.LJ, c1633080sbC.LJI, c1633080sbC.LJII, c1633080sbC.LJIIIZ, new IFetchPanelInfoListener() { // from class: X.0sbD
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sticker panel fetching failed: ");
                sbLIZ.append(exceptionResult.getException());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("DefaultPanelInfoFetcher", strLIZIZ);
                if (c19482611Ke.isDisposed()) {
                    return;
                }
                g gVar2 = gVar;
                if (gVar2.LIZJ) {
                    InterfaceC1635390sev interfaceC1635390sev2 = gVar2.LIZIZ;
                    String str2 = gVar2.LIZ;
                    C1633080sbC c1633080sbC2 = c1633080sbC;
                    boolean z = c1633080sbC2.LJFF;
                    String str3 = c1633080sbC2.LIZ;
                    int i = c1633080sbC2.LIZIZ;
                    int i2 = c1633080sbC2.LIZJ;
                    Map<String, String> map = c1633080sbC2.LJIIIZ;
                    final C09AJ<PanelInfoModel> c09aj2 = c19482611Ke;
                    interfaceC1635390sev2.LJIIIZ(str2, z, str3, i, i2, map, new IFetchPanelInfoListener() { // from class: X.0sbE
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                        public final void onFail(ExceptionResult exceptionResult2) {
                            if (c09aj2.isDisposed()) {
                                return;
                            }
                            c09aj2.onError(exceptionResult2.getException());
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(PanelInfoModel panelInfoModel) {
                            if (!c09aj2.isDisposed()) {
                                if (panelInfoModel != null) {
                                    C09AJ<PanelInfoModel> c09aj3 = c09aj2;
                                    c09aj3.onNext(panelInfoModel);
                                    c09aj3.onComplete();
                                    return;
                                }
                                c09aj2.onError(new IllegalArgumentException("sticker panel fetching failed"));
                            }
                        }
                    }, true);
                }
                c19482611Ke.onError(exceptionResult.getException());
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                C13SS.LIZ.getClass();
                C13SS.LIZ("DefaultPanelInfoFetcher", "sticker panel fetching success");
                if (!c19482611Ke.isDisposed()) {
                    if (panelInfoModel != null) {
                        C09AJ<PanelInfoModel> c09aj2 = c19482611Ke;
                        c09aj2.onNext(panelInfoModel);
                        c09aj2.onComplete();
                        return;
                    }
                    c19482611Ke.onError(new IllegalArgumentException("sticker      panel fetching failed"));
                }
            }
        }, gVar.LIZJ, gVar.LIZLLL, gVar.LJ, c1633080sbC.LJIIJ, c1633080sbC.LJIIIIZZ);
        C1C7U.LIZIZ("DefaultPanelInfoFetcher@cbd7.requestActual$1");
    }

    public static final void subscribe$5(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("CategoricalPagingStickerFetcher@2816.requestActual$2");
        C1631900sZI c1631900sZI = new C1631900sZI((C19482611Ke) c09aj);
        C1628830sUL c1628830sUL = (C1628830sUL) c1698340uIS.l0;
        InterfaceC1635390sev interfaceC1635390sev = c1628830sUL.LIZIZ;
        String str = c1628830sUL.LIZ;
        C1631810sZ9 c1631810sZ9 = (C1631810sZ9) c1698340uIS.l1;
        interfaceC1635390sev.LJJIIZI(str, c1631810sZ9.LIZ, c1631810sZ9.LIZIZ, c1631810sZ9.LIZJ, c1631810sZ9.LIZLLL, c1631810sZ9.LJ, c1631900sZI);
        C1C7U.LIZIZ("CategoricalPagingStickerFetcher@2816.requestActual$2");
    }

    public static final void subscribe$6(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("FavoriteListFetcher@b010.requestActual$1");
        EffectManager effectManagerLLJILJILJ = ((C1631850sZD) c1698340uIS.l0).LIZIZ.LLJILJILJ();
        if (effectManagerLLJILJILJ != null) {
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            effectManagerLLJILJILJ.fetchFavoriteList(((C1631850sZD) c1698340uIS.l0).LIZ, ((C1629090sUl) c1698340uIS.l1).LIZ, new IFetchFavoriteList() { // from class: X.0sZE
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                public final void onFailed(ExceptionResult exceptionResult) {
                    if (c19482611Ke.isDisposed()) {
                        return;
                    }
                    c19482611Ke.onError(exceptionResult.getException());
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                    if (!c19482611Ke.isDisposed()) {
                        if (fetchFavoriteListResponse != null) {
                            C09AJ<FetchFavoriteListResponse> c09aj2 = c19482611Ke;
                            c09aj2.onNext(fetchFavoriteListResponse);
                            c09aj2.onComplete();
                            return;
                        }
                        c19482611Ke.onError(new IllegalArgumentException("favorite list fetching failed"));
                    }
                }
            });
        }
        C1C7U.LIZIZ("FavoriteListFetcher@b010.requestActual$1");
    }

    public static final void subscribe$7(C1698340uIS c1698340uIS, C09AJ c09aj) {
        C1C7U.LIZ("DefaultInfoStickerProviderRepository@ebfa.downloadProviderSticker$1");
        if (((C1632890sat) c1698340uIS.l0).LIZJ.LIZ((ProviderEffect) c1698340uIS.l1)) {
            ProviderEffect providerEffect = (ProviderEffect) c1698340uIS.l1;
            EnumC1641490sol enumC1641490sol = EnumC1641490sol.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
            ((C1632890sat) c1698340uIS.l0).LIZJ.LIZIZ(providerEffect);
            c09aj.onNext(new C1632850sap(providerEffect, new C1632880sas(enumC1641490sol), null));
        }
        c09aj.onComplete();
        C1C7U.LIZIZ("DefaultInfoStickerProviderRepository@ebfa.downloadProviderSticker$1");
    }

    public C1698340uIS(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
