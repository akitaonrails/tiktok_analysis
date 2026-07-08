package Y;

import X.C0CHQ;
import X.C11ON;
import X.C1404610meh;
import X.C1404650mel;
import X.C1404800mf0;
import X.C1434960nRe;
import X.C1435920nTC;
import X.C15438062q;
import X.C1622840sKg;
import X.C1629340sVA;
import X.C1632600saQ;
import X.C1632840sao;
import X.C1632880sas;
import X.C1632890sat;
import X.C1632940say;
import X.C1632970sb1;
import X.C1634100scq;
import X.C1638440sjq;
import X.C1638720skI;
import X.C1639330slH;
import X.C1639400slO;
import X.C1639620slk;
import X.C1639630sll;
import X.C1639640slm;
import X.C1639650sln;
import X.C1639660slo;
import X.C1639670slp;
import X.C1C7U;
import X.C2427009fA;
import X.C259800zU;
import X.EnumC1335420kr6;
import X.EnumC1641340soW;
import X.EnumC1641420soe;
import X.EnumC1641430sof;
import X.EnumC1641490sol;
import X.InterfaceC1622450sK3;
import X.InterfaceC1628910sUT;
import X.InterfaceC1638030sjB;
import X.InterfaceC345370DgN;
import X.ViewOnClickListenerC1638020sjA;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.storage.EffectStorageCleanServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.storage.impl.AVCreativeDraftStorage;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.tts.oecverify.BdTuring;
import dtj.h6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class ACallableS253S0200000_25 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("DefaultInfoStickerSearchStateFetcher@a84d.requestActual$1");
        List<InfoStickerEffect> list = (List) aCallableS253S0200000_25.l0;
        C1632940say c1632940say = (C1632940say) aCallableS253S0200000_25.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InfoStickerEffect infoStickerEffect : list) {
            c1632940say.LIZ.LIZ(infoStickerEffect);
            if (!C1632600saQ.LIZ(c1632940say.LIZIZ, infoStickerEffect)) {
                c1632940say.LIZ.LIZIZ(infoStickerEffect);
            }
            arrayList.add(new Object() { // from class: X.0saz
            });
        }
        C1C7U.LIZIZ("DefaultInfoStickerSearchStateFetcher@a84d.requestActual$1");
        return arrayList;
    }

    public static final Object call$1(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("StickerCoreLogicComponent@3a44.fetchCategoryEffects$1$onChanged$1$1$1");
        List<Effect> effects = ((CategoryEffectModel) aCallableS253S0200000_25.l0).getEffects();
        InterfaceC1628910sUT interfaceC1628910sUT = (InterfaceC1628910sUT) aCallableS253S0200000_25.l1;
        Iterator<Effect> it2 = effects.iterator();
        while (it2.hasNext()) {
            interfaceC1628910sUT.LIZIZ(it2.next(), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerCoreLogicComponent@3a44.fetchCategoryEffects$1$onChanged$1$1$1");
        return unit;
    }

    public static final Object call$10(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("DefaultInfoStickerProviderRepository@ebfa.downloadProviderSticker$2");
        C11ON c11onLJJJJZI = ((C1632890sat) aCallableS253S0200000_25.l0).LIZIZ.LIZIZ((ProviderEffect) aCallableS253S0200000_25.l1, true).LJJJJZI(new AkS486S0100000_25((C1632890sat) aCallableS253S0200000_25.l0, 37));
        C1C7U.LIZIZ("DefaultInfoStickerProviderRepository@ebfa.downloadProviderSticker$2");
        return c11onLJJJJZI;
    }

    public static final Object call$11(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        EnumC1641490sol enumC1641490sol;
        C1C7U.LIZ("DefaultInfoStickerProviderStateFetcher@55d4.requestActual$1");
        List<ProviderEffect> list = (List) aCallableS253S0200000_25.l0;
        C1632840sao c1632840sao = (C1632840sao) aCallableS253S0200000_25.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ProviderEffect providerEffect : list) {
            c1632840sao.LIZIZ.LIZIZ(providerEffect);
            if (C1632600saQ.LIZ(c1632840sao.LIZ, providerEffect)) {
                enumC1641490sol = EnumC1641490sol.PROVIDER_STICKER_STATE_DOWNLOADING;
            } else if (c1632840sao.LIZIZ.LIZ(providerEffect)) {
                enumC1641490sol = EnumC1641490sol.PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
            } else {
                enumC1641490sol = EnumC1641490sol.PROVIDER_STICKER_STATE_NOT_DOWNLOAD;
            }
            arrayList.add(new C1632880sas(enumC1641490sol));
        }
        C1C7U.LIZIZ("DefaultInfoStickerProviderStateFetcher@55d4.requestActual$1");
        return arrayList;
    }

    public static final Object call$12(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("DesignerInfoHandler@c189.updateUser$1");
        InterfaceC1638030sjB interfaceC1638030sjBInvoke = ((ViewOnClickListenerC1638020sjA) aCallableS253S0200000_25.l1).LLILLL.invoke(((Effect) aCallableS253S0200000_25.l0).getDesignerId(), ((Effect) aCallableS253S0200000_25.l0).getDesignerEncryptedId());
        C1C7U.LIZIZ("DesignerInfoHandler@c189.updateUser$1");
        return interfaceC1638030sjBInvoke;
    }

    public static final Object call$2(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("TikTokRecordStickerPanelUiComponent@6ee6.preloadFirstCollectEffect$1$onChanged$1$2$1");
        List<Effect> effects = ((CategoryEffectModel) aCallableS253S0200000_25.l0).getEffects();
        InterfaceC1628910sUT interfaceC1628910sUT = (InterfaceC1628910sUT) aCallableS253S0200000_25.l1;
        Iterator<Effect> it2 = effects.iterator();
        while (it2.hasNext()) {
            interfaceC1628910sUT.LIZIZ(it2.next(), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TikTokRecordStickerPanelUiComponent@6ee6.preloadFirstCollectEffect$1$onChanged$1$2$1");
        return unit;
    }

    public static final Object call$3(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("DefaultStickerDataManager@c35d.download$1");
        Boolean boolValueOf = Boolean.valueOf(((DefaultStickerDataManager) aCallableS253S0200000_25.l0).LLJJI.LJI().LIZ(((C1629340sVA) aCallableS253S0200000_25.l1).LIZ));
        C1C7U.LIZIZ("DefaultStickerDataManager@c35d.download$1");
        return boolValueOf;
    }

    public static final Object call$4(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        C1C7U.LIZ("EffectConfigPresenter@ba9f.initObservable$3$1");
        ((C1622840sKg) aCallableS253S0200000_25.l0).LIZ((InterfaceC1622450sK3) aCallableS253S0200000_25.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectConfigPresenter@ba9f.initObservable$3$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$5(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        boolean z;
        Object next;
        FilterBean filterBean;
        C1C7U.LIZ("DefaultFilterSource@9a4.handleFilterDataUpdate$1");
        ArrayList arrayList = new ArrayList();
        C1639620slk c1639620slk = (C1639620slk) aCallableS253S0200000_25.l0;
        C1638440sjq c1638440sjq = (C1638440sjq) aCallableS253S0200000_25.l1;
        synchronized (c1639620slk) {
            try {
                if (c1638440sjq == C1638720skI.LIZ) {
                    z = true;
                } else {
                    z = false;
                }
                c1639620slk.LIZIZ = z;
                List<C1634100scq<C1639670slp, C1639650sln, FilterBean>> list = c1639620slk.LJIIIIZZ;
                for (Pair<EffectCategoryResponse, List<C1639670slp>> pair : c1638440sjq.LIZIZ) {
                    for (C1639670slp c1639670slp : pair.getSecond()) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(c1639670slp, ((C1634100scq) next).LIZ)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C1634100scq c1634100scq = (C1634100scq) next;
                        C1639650sln c1639650sln = (C1639650sln) ((LinkedHashMap) c1639620slk.LJII).get(c1639670slp.LIZ);
                        if (c1639650sln == null) {
                            c1639650sln = new C1639650sln(c1639670slp.LIZ, EnumC1641340soW.FILTER_STATE_UNKNOWN, "", "");
                        }
                        if (c1634100scq == null || (filterBean = (FilterBean) c1634100scq.LIZJ) == null) {
                            filterBean = new FilterBean();
                        }
                        C1639660slo.LJ(filterBean, c1639670slp);
                        filterBean.setFilterFilePath(c1639650sln.LIZJ);
                        filterBean.setFilterFolder(c1639650sln.LIZLLL);
                        C1639660slo.LIZLLL(pair.getFirst(), filterBean);
                        arrayList.add(new C1634100scq(c1639670slp, c1639650sln, filterBean));
                    }
                }
                ((ArrayList) c1639620slk.LJIIIIZZ).clear();
                ((ArrayList) c1639620slk.LJIIIIZZ).addAll(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1634100scq) it3.next()).LIZJ);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C1639650sln) ((C1634100scq) obj).LIZIZ).LIZIZ == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C1634100scq) it4.next()).LIZJ);
        }
        C1639620slk c1639620slk2 = (C1639620slk) aCallableS253S0200000_25.l0;
        List<Pair<EffectCategoryResponse, List<C1639670slp>>> list2 = ((C1638440sjq) aCallableS253S0200000_25.l1).LIZIZ;
        c1639620slk2.getClass();
        ArrayList arrayList5 = new ArrayList();
        if (!list2.isEmpty()) {
            for (Pair<EffectCategoryResponse, List<C1639670slp>> pair2 : list2) {
                ArrayList arrayList6 = new ArrayList();
                for (C1639670slp c1639670slp2 : pair2.getSecond()) {
                    Iterator it5 = arrayList2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Object next2 = it5.next();
                            if (C1639640slm.LIZ((FilterBean) next2, c1639670slp2)) {
                                if (next2 != null) {
                                    arrayList6.add(next2);
                                }
                            }
                        }
                    }
                }
                if (!arrayList6.isEmpty()) {
                    arrayList5.add(new Pair(pair2.getFirst(), arrayList6));
                }
            }
        } else {
            arrayList5.add(new Pair(C1638720skI.LIZJ, arrayList2));
        }
        List<Pair<EffectCategoryResponse, List<C1639670slp>>> list3 = ((C1638440sjq) aCallableS253S0200000_25.l1).LIZIZ;
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<Pair<EffectCategoryResponse, List<C1639670slp>>> it6 = list3.iterator();
        while (it6.hasNext()) {
            arrayList7.add(it6.next().getFirst());
        }
        ((C1639620slk) aCallableS253S0200000_25.l0).getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            List<Effect> totalEffects = ((EffectCategoryResponse) it7.next()).getTotalEffects();
            if (totalEffects != null) {
                for (Effect effect : totalEffects) {
                    if (effect != null && effect.getName() != null) {
                        linkedHashMap.put(effect.getName(), effect);
                    }
                }
            }
        }
        C1639630sll c1639630sll = new C1639630sll(arrayList2, arrayList7, arrayList5, linkedHashMap, arrayList4);
        C1C7U.LIZIZ("DefaultFilterSource@9a4.handleFilterDataUpdate$1");
        return c1639630sll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.util.ArrayList] */
    public static final Object call$6(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        boolean z;
        C1C7U.LIZ("DefaultFilterSource@9a4.handleFilterInfoUpdate$1");
        C259800zU c259800zU = new C259800zU();
        C1639620slk c1639620slk = (C1639620slk) aCallableS253S0200000_25.l0;
        Map<? extends String, ? extends C1639650sln> map = (Map) aCallableS253S0200000_25.l1;
        synchronized (c1639620slk) {
            try {
                List<C1634100scq<C1639670slp, C1639650sln, FilterBean>> list = c1639620slk.LJIIIIZZ;
                ?? arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C1634100scq c1634100scq : (ArrayList) list) {
                    C1639650sln c1639650sln = map.get(((C1639670slp) c1634100scq.LIZ).LIZ);
                    if (c1639650sln == null) {
                        c1639650sln = new C1639650sln(((C1639670slp) c1634100scq.LIZ).LIZ, EnumC1641340soW.FILTER_STATE_UNKNOWN, "", "");
                    }
                    A a = c1634100scq.LIZ;
                    C c = c1634100scq.LIZJ;
                    FilterBean filterBean = (FilterBean) c;
                    filterBean.setFilterFilePath(c1639650sln.LIZJ);
                    filterBean.setFilterFolder(c1639650sln.LIZLLL);
                    arrayList.add(new C1634100scq(a, c1639650sln, c));
                }
                c259800zU.element = arrayList;
                ((ArrayList) c1639620slk.LJIIIIZZ).clear();
                ((ArrayList) c1639620slk.LJIIIIZZ).addAll((Collection) c259800zU.element);
                ((LinkedHashMap) c1639620slk.LJII).clear();
                c1639620slk.LJII.putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterable iterable = (Iterable) c259800zU.element;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : iterable) {
            if (((C1639650sln) ((C1634100scq) obj).LIZIZ).LIZIZ == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C1634100scq) it2.next()).LIZJ);
        }
        arrayList2.addAll(arrayList4);
        C1C7U.LIZIZ("DefaultFilterSource@9a4.handleFilterInfoUpdate$1");
        return arrayList2;
    }

    public static final Object call$7(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        EnumC1641340soW enumC1641340soW;
        C1639400slO c1639400slOLJII;
        C1C7U.LIZ("DefaultFilterInfoFetcher@4129.requestActual$1");
        List<C1639670slp> list = (List) aCallableS253S0200000_25.l0;
        C1639330slH c1639330slH = (C1639330slH) aCallableS253S0200000_25.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1639670slp c1639670slp : list) {
            if (c1639330slH.LIZ.LIZ(c1639670slp)) {
                enumC1641340soW = EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS;
            } else {
                EnumC1641430sof enumC1641430sofLIZJ = c1639330slH.LIZIZ.LIZJ(c1639670slp);
                if (enumC1641430sofLIZJ != null && (enumC1641430sofLIZJ == EnumC1641430sof.PENDING || enumC1641430sofLIZJ == EnumC1641430sof.START)) {
                    enumC1641340soW = EnumC1641340soW.FILTER_STATE_DOWNLOADING;
                } else if (c1639330slH.LIZJ.LJ(c1639670slp)) {
                    enumC1641340soW = EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    enumC1641340soW = EnumC1641340soW.FILTER_STATE_NOT_DOWNLOAD;
                }
            }
            if (c1639330slH.LIZ.LIZ(c1639670slp)) {
                c1639400slOLJII = c1639330slH.LIZ.LIZIZ(c1639670slp.LIZ);
            } else if (enumC1641340soW == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                c1639400slOLJII = c1639330slH.LIZJ.LJII(c1639670slp.LIZ);
            } else {
                c1639400slOLJII = C1639660slo.LIZ;
            }
            arrayList.add(new C1639650sln(c1639670slp.LIZ, enumC1641340soW, c1639400slOLJII.LIZ, c1639400slOLJII.LIZIZ));
        }
        C1C7U.LIZIZ("DefaultFilterInfoFetcher@4129.requestActual$1");
        return arrayList;
    }

    public static final Object call$8(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        String strLIZ;
        EnumC1335420kr6 enumC1335420kr6LIZLLL;
        String strLIZ2;
        EnumC1335420kr6 enumC1335420kr6LIZLLL2;
        C1C7U.LIZ("CacheCleanTask@fc36.execute$1");
        C1404650mel c1404650mel = C1404800mf0.LIZ;
        if (c1404650mel != null) {
            c1404650mel.LJIIIIZZ = C1404800mf0.LIZ();
        }
        ((C1435920nTC) aCallableS253S0200000_25.l0).getClass();
        h6.LIZ.getClass();
        if ((h6.LIZ() == 2 || h6.LIZ() == 3) && ((ArrayList) C2427009fA.LJIIJJI()).isEmpty()) {
            EffectStorageCleanServiceImpl.LIZ().runStorageTask();
        }
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        if (listLJIIJJI != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIIJJI) {
                InterfaceC345370DgN interfaceC345370DgN = (InterfaceC345370DgN) obj;
                if (interfaceC345370DgN != null) {
                    enumC1335420kr6LIZLLL2 = interfaceC345370DgN.LIZLLL();
                } else {
                    enumC1335420kr6LIZLLL2 = null;
                }
                if (enumC1335420kr6LIZLLL2 == EnumC1335420kr6.CACHE) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                InterfaceC345370DgN interfaceC345370DgN2 = (InterfaceC345370DgN) obj2;
                if (interfaceC345370DgN2 != null) {
                    strLIZ2 = interfaceC345370DgN2.LIZ();
                } else {
                    strLIZ2 = null;
                }
                if (!Intrinsics.LJFF(strLIZ2, "AV_STORAGE_CLEANER_CACHE")) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC345370DgN) it2.next()).LJII(true);
            }
        }
        List<InterfaceC345370DgN> listLJIIJJI2 = C2427009fA.LJIIJJI();
        if (listLJIIJJI2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJIIJJI2) {
                InterfaceC345370DgN interfaceC345370DgN3 = (InterfaceC345370DgN) obj3;
                if (interfaceC345370DgN3 != null) {
                    enumC1335420kr6LIZLLL = interfaceC345370DgN3.LIZLLL();
                } else {
                    enumC1335420kr6LIZLLL = null;
                }
                if (enumC1335420kr6LIZLLL == EnumC1335420kr6.RESOURCE) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                InterfaceC345370DgN interfaceC345370DgN4 = (InterfaceC345370DgN) obj4;
                if (interfaceC345370DgN4 != null) {
                    strLIZ = interfaceC345370DgN4.LIZ();
                } else {
                    strLIZ = null;
                }
                if (!Intrinsics.LJFF(strLIZ, "AV_STORAGE_CLEANER_CACHE")) {
                    arrayList4.add(obj4);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                ((InterfaceC345370DgN) it3.next()).LJII(true);
            }
        }
        h6.LIZ.getClass();
        if (h6.LIZ() == 2 || h6.LIZ() == 3) {
            Iterator<Object> it4 = ((C1404610meh) aCallableS253S0200000_25.l1).LIZ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (next instanceof C1434960nRe) {
                    if (next != null) {
                        VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                        C1435920nTC c1435920nTC = (C1435920nTC) aCallableS253S0200000_25.l0;
                        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
                        c1435920nTC.getClass();
                        C0CHQ.LIZ().LJJIIJZLJL().getAllowListService().LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIZILJ(creativeInfo));
                        new AVCreativeDraftStorage().LJII(true);
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
        }
        C1404650mel c1404650mel2 = C1404800mf0.LIZ;
        if (c1404650mel2 != null) {
            c1404650mel2.LJIIIZ = C1404800mf0.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CacheCleanTask@fc36.execute$1");
        return unit;
    }

    public static final Object call$9(ACallableS253S0200000_25 aCallableS253S0200000_25) {
        EnumC1641420soe enumC1641420soe;
        C1C7U.LIZ("DefaultInfoStickerStateFetcher@8c00.requestActual$1");
        List<Effect> list = (List) aCallableS253S0200000_25.l0;
        C1632970sb1 c1632970sb1 = (C1632970sb1) aCallableS253S0200000_25.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Effect effect : list) {
            if (C1632600saQ.LIZ(c1632970sb1.LIZIZ, effect)) {
                enumC1641420soe = EnumC1641420soe.DOWNLOADING;
            } else if (c1632970sb1.LIZ.LIZ(effect)) {
                enumC1641420soe = EnumC1641420soe.DOWNLOAD_SUCCESS;
            } else {
                enumC1641420soe = EnumC1641420soe.NOT_DOWNLOAD;
            }
            arrayList.add(enumC1641420soe);
        }
        C1C7U.LIZIZ("DefaultInfoStickerStateFetcher@8c00.requestActual$1");
        return arrayList;
    }

    public ACallableS253S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
