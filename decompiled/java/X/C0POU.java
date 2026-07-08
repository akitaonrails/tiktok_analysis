package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdHybridModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0POU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POU {
    public static final Map<C0PK8, C0POT> LIZ = C2097608Jq.LJIIJ(new Pair(C0PK8.SINGLE_AD, new C0POT(new InterfaceC686700Qwe() { // from class: X.0Po9
        @Override // X.InterfaceC686700Qwe
        public final n LIZ(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
            return null;
        }

        @Override // X.InterfaceC686700Qwe
        public final InterfaceC686720Qwg LJI() {
            return null;
        }

        @Override // X.InterfaceC686700Qwe
        public final void LJIIJJI(Aweme aweme) {
        }

        @Override // X.InterfaceC686700Qwe
        public final Integer LIZJ(AbstractC655400PnG abstractC655400PnG) {
            C655410PnH c655410PnH;
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            AwemeSearchAdModel searchAdInfo;
            SearchAdHybridModel searchAdHybridModel;
            if (!(abstractC655400PnG instanceof C655410PnH) || abstractC655400PnG == null || (c655410PnH = (C655410PnH) abstractC655400PnG) == null || (aweme = c655410PnH.LIZ) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (searchAdHybridModel = searchAdInfo.hybridModel) == null) {
                return null;
            }
            return Integer.valueOf(searchAdHybridModel.getHeight());
        }

        @Override // X.InterfaceC686700Qwe
        public final Aweme LIZLLL(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
            Aweme aweme2;
            AwemeSearchAdModel searchAdInfo;
            if (!(abstractC655400PnG instanceof C655410PnH) || abstractC655400PnG == null || (aweme2 = ((C655410PnH) abstractC655400PnG).LIZ) == null) {
                return null;
            }
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                searchAdInfo.setFeedType(115);
            }
            return aweme2;
        }

        @Override // X.InterfaceC686700Qwe
        public final void LJIIIIZZ(AbstractC655400PnG abstractC655400PnG, final Aweme aweme) {
            Object c098200Yq;
            AwemeRawAd awemeRawAd;
            AnoleModel anoleModel;
            Map<String, AnoleComponentModel> map;
            LinkedHashMap linkedHashMap;
            String str;
            Map<String, String> searchAdExtraParams;
            if ((abstractC655400PnG instanceof C655410PnH) && abstractC655400PnG != null) {
                if (C256530A3n.LIZIZ) {
                    c098200Yq = null;
                } else {
                    try {
                        C1227904rF.LIZ.getClass();
                        c098200Yq = C1227904rF.LJI(aweme);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                }
                C1010620cPE c1010620cPE = new C1010620cPE(new InterfaceC1010250cOd() { // from class: X.0PoB
                    @Override // X.InterfaceC1010250cOd
                    public final Context getContext() {
                        return null;
                    }

                    @Override // X.InterfaceC1010250cOd
                    public final Aweme getAweme() {
                        return aweme;
                    }
                });
                InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                if (interfaceC657510PqfLIZLLL != null) {
                    interfaceC657510PqfLIZLLL.LJIJJ(c1010620cPE);
                }
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null) {
                    Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        AnoleComponentModel value = it2.next().getValue();
                        Map<String, ? extends Object> map2 = value.data;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap(map2);
                        } else {
                            linkedHashMap = null;
                        }
                        if (C256530A3n.LIZIZ) {
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null && (searchAdExtraParams = awemeRawAd2.getSearchAdExtraParams()) != null) {
                                str = searchAdExtraParams.get("search_item_id");
                            } else {
                                str = null;
                            }
                            if (linkedHashMap != null) {
                                linkedHashMap.put("search_ad_item_key_list", Collections.singletonList(str));
                            }
                        } else if (c098200Yq != null && linkedHashMap != null) {
                            linkedHashMap.put("aweme_list", Collections.singletonList(c098200Yq));
                        }
                        value.setData(linkedHashMap);
                    }
                }
            }
        }
    })), new Pair(C0PK8.MULTI_AD, new C0POT(new InterfaceC686700Qwe() { // from class: X.0Po8
        @Override // X.InterfaceC686700Qwe
        public final n LIZ(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
            return null;
        }

        @Override // X.InterfaceC686700Qwe
        public final InterfaceC686720Qwg LJI() {
            return null;
        }

        @Override // X.InterfaceC686700Qwe
        public final void LJIIJJI(Aweme aweme) {
        }

        @Override // X.InterfaceC686700Qwe
        public final Integer LIZJ(AbstractC655400PnG abstractC655400PnG) {
            C655430PnJ c655430PnJ;
            SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct;
            if (!(abstractC655400PnG instanceof C655430PnJ) || abstractC655400PnG == null || (c655430PnJ = (C655430PnJ) abstractC655400PnG) == null || (searchInflowMultiAdCardStruct = c655430PnJ.LIZ) == null) {
                return null;
            }
            return searchInflowMultiAdCardStruct.height;
        }

        @Override // X.InterfaceC686700Qwe
        public final Aweme LIZLLL(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
            String aid;
            Object c098200Yq;
            List<? extends Aweme> list;
            String str;
            String requestId;
            String aid2;
            List<? extends Aweme> list2 = null;
            String requestId2 = null;
            if (!(abstractC655400PnG instanceof C655430PnJ) || abstractC655400PnG == null) {
                return null;
            }
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C655430PnJ c655430PnJ = (C655430PnJ) abstractC655400PnG;
            if (Intrinsics.LJFF(aid, c655430PnJ.LIZIZ)) {
                if (aweme != null) {
                    requestId = aweme.getRequestId();
                } else {
                    requestId = null;
                }
                if (Intrinsics.LJFF(requestId, c655430PnJ.LIZJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[parseData], same data, don't repeat build , currentAweme, aid = ");
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    sbLIZ.append(aid2);
                    sbLIZ.append(", reqId = ");
                    if (aweme != null) {
                        requestId2 = aweme.getRequestId();
                    }
                    sbLIZ.append(requestId2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return aweme;
                }
            }
            try {
                SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = ((C655430PnJ) abstractC655400PnG).LIZ;
                if (searchInflowMultiAdCardStruct != null && (str = searchInflowMultiAdCardStruct.awemeRawAd) != null) {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = (AwemeRawAd) C1227904rF.LIZIZ(str, AwemeRawAd.class);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            AwemeRawAd awemeRawAd = (AwemeRawAd) c098200Yq;
            if (awemeRawAd == null) {
                return null;
            }
            SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct2 = c655430PnJ.LIZ;
            if (searchInflowMultiAdCardStruct2 != null) {
                list2 = searchInflowMultiAdCardStruct2.awemeList;
            }
            if (list2 == null || list2.isEmpty()) {
                SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct3 = c655430PnJ.LIZ;
                if (searchInflowMultiAdCardStruct3 != null) {
                    searchInflowMultiAdCardStruct3.setAwemeList(C0R12.LIZIZ.LJJIFFI(searchInflowMultiAdCardStruct3.awemeListRaw));
                }
                SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct4 = c655430PnJ.LIZ;
                if (searchInflowMultiAdCardStruct4 != null && (list = searchInflowMultiAdCardStruct4.awemeList) != null) {
                    for (final Aweme aweme2 : list) {
                        C1010620cPE c1010620cPE = new C1010620cPE(new InterfaceC1010250cOd() { // from class: X.0PoA
                            @Override // X.InterfaceC1010250cOd
                            public final Context getContext() {
                                return null;
                            }

                            @Override // X.InterfaceC1010250cOd
                            public final Aweme getAweme() {
                                return aweme2;
                            }
                        });
                        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                        if (interfaceC657510PqfLIZLLL != null) {
                            interfaceC657510PqfLIZLLL.LJIJJ(c1010620cPE);
                        }
                    }
                }
            }
            Aweme aweme3 = new Aweme();
            aweme3.setAid(c655430PnJ.LIZIZ);
            aweme3.setAd(true);
            aweme3.setAwemeType(0);
            aweme3.setAwemeRawAd(awemeRawAd);
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null) {
                searchAdInfo.setFeedType(searchAdInfo.feedType);
            }
            aweme3.setRequestId(c655430PnJ.LIZJ);
            return aweme3;
        }

        @Override // X.InterfaceC686700Qwe
        public final void LJIIIIZZ(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
            AwemeRawAd awemeRawAd;
            AnoleModel anoleModel;
            Map<String, AnoleComponentModel> map;
            LinkedHashMap linkedHashMap;
            List<? extends Map<?, ?>> list;
            Object c098200Yq;
            ArrayList arrayList;
            List<? extends Aweme> list2;
            String str;
            AwemeRawAd awemeRawAd2;
            Map<String, String> searchAdExtraParams;
            if ((abstractC655400PnG instanceof C655430PnJ) && abstractC655400PnG != null && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null) {
                Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    AnoleComponentModel value = it2.next().getValue();
                    Map<String, ? extends Object> map2 = value.data;
                    if (map2 != null) {
                        linkedHashMap = new LinkedHashMap(map2);
                    } else {
                        linkedHashMap = null;
                    }
                    SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = ((C655430PnJ) abstractC655400PnG).LIZ;
                    if (searchInflowMultiAdCardStruct != null && (list = searchInflowMultiAdCardStruct.awemeListRaw) != null) {
                        if (linkedHashMap != null) {
                            linkedHashMap.put("aweme_list", list);
                        }
                        try {
                            SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct2 = ((C655430PnJ) abstractC655400PnG).LIZ;
                            if (searchInflowMultiAdCardStruct2 != null && (list2 = searchInflowMultiAdCardStruct2.awemeList) != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                for (Aweme aweme2 : list2) {
                                    if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (searchAdExtraParams = awemeRawAd2.getSearchAdExtraParams()) == null || (str = searchAdExtraParams.get("search_item_id")) == null) {
                                        str = "";
                                    }
                                    arrayList.add(str);
                                }
                                if (linkedHashMap != null) {
                                    linkedHashMap.put("search_ad_item_key_list", arrayList);
                                }
                            } else {
                                arrayList = null;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[injectParamToFe], awemeCacheKeyList = ");
                            sbLIZ.append(arrayList);
                            c098200Yq = Integer.valueOf(Log.d("SearchAdHybridModule", C2188811AlT.LIZIZ(sbLIZ)));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                    value.setData(linkedHashMap);
                }
            }
        }
    })), new Pair(C0PK8.BRAND_HYBRID_AD, new C0POT(new C686680Qwc())));
}
